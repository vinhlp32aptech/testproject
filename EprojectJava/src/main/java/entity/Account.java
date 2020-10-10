package entity;

import java.time.LocalDate;

public class Account {
	
	private int id_acc;
	private String account;
	private String fullname;
	private LocalDate dob;
	private String gender;
	private int phone;
	private String email;
	private String addr;
	
	public Account() {}
	
	public Account(int id_acc, String account, String fullname, LocalDate dob, String gender, int phone, String email,
			String addr) {
		
		this.id_acc = id_acc;
		this.account = account;
		this.fullname = fullname;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
	}

	public int getId_acc() {
		return id_acc;
	}

	public void setId_acc(int id_acc) {
		this.id_acc = id_acc;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Account [id_acc=" + id_acc + ", account=" + account + ", fullname=" + fullname + ", dob=" + dob
				+ ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", addr=" + addr + "]";
	}
	
	
	
}
