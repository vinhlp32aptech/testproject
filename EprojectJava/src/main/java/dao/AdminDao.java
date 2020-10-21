package dao;

import java.sql.Date;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.mindrot.jbcrypt.BCrypt;

import common.ConnectDB;
import entity.Account;

import view.Admin;


public class AdminDao {
		public List<Account> getListAppChat() {
			var list = new ArrayList<Account>();

			try (var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
					var cs = connect.prepareCall("{call Selinfo}");
					var rs = cs.executeQuery();
				) {
				while (rs.next()) {
					var acc = new Account();
					acc.setId_acc(rs.getInt("id_acc"));
					acc.setFullname(rs.getString("fullname"));
					acc.setGender(rs.getString("gender"));
					acc.setAddr( rs.getString("addr"));
					acc.setDob( rs.getDate("dob").toLocalDate());
					acc.setPhone(rs.getInt("phonenumber"));
					acc.setEmail(rs.getString("email"));
					acc.setAccount(rs.getString("account"));
					

				list.add(acc);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			return list;
		}

		
		

		public void DelAcc(int id) {
			try (var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
					var cs = connect.prepareCall("{call DelAcc(?)}");
			) {
				cs.setInt(1, id);
				cs.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		public void AddAccount(Account acc) {
			try (
					var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
					var cs = connect.prepareCall("{call AddAcc(?,?,?,?,?,?,?)}");
					
				)
			{
				cs.setString(1, acc.getFullname());
				
				cs.setString(2, acc.getGender());
				cs.setString(3, acc.getAddr());
				cs.setDate(4, Date.valueOf( acc.getDob()));
				cs.setInt(5, acc.getPhone());
				cs.setString(6, acc.getEmail());
				cs.setString(7, acc.getAccount());
				
				
				cs.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public Integer selectAccount(Account acc, String username, String pass) {
			
			Integer getid = null;
			
			try (
					var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
					var cs = connect.prepareCall("{call selAcc(?)}")
				) 
			{
				cs.setString(1, username);
				var rs = cs.executeQuery();
				
				if(rs.next()) {
					String account = rs.getString("account");		
					boolean valuate = BCrypt.checkpw(pass,rs.getString("pass"));	
					getid = rs.getInt("id_acc");	
					if(username.equals(account) && valuate == true) {
						JOptionPane.showMessageDialog(null, "Logged in successfully");
						
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Wrong Password or UserName");
					}					
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return getid;
		}
		
		public void UpdateAccount(Account acc, int id) {
			try (
					var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
					var cs = connect.prepareCall("{call UpdateAcc(?,?,?,?,?,?,?)}")
				)
			{
				
				cs.setString(1, acc.getFullname());
				cs.setString(2, acc.getGender());
				cs.setString(3, acc.getAddr());
				cs.setDate(4,Date.valueOf( acc.getDob()));
				
				cs.setInt(5, acc.getPhone());
				cs.setString(6,acc.getEmail());
				
				cs.setInt(7, id);
				cs.executeUpdate();
				JOptionPane.showMessageDialog(null, "Update Success");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

