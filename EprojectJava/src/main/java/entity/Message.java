package entity;

import java.time.LocalDate;

public class Message {

	
	private int id_mess;
	private String message;
	private	LocalDate time_send;
	private LocalDate time_read;
	private String acc_receive;
	
	public Message() {}
	
	public Message(int id_mess, String message, LocalDate time_send, LocalDate time_read, String acc_receive) {
	
		this.id_mess = id_mess;
		this.message = message;
		this.time_send = time_send;
		this.time_read = time_read;
		this.acc_receive = acc_receive;
	}

	public int getId_mess() {
		return id_mess;
	}

	public void setId_mess(int id_mess) {
		this.id_mess = id_mess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getTime_send() {
		return time_send;
	}

	public void setTime_send(LocalDate time_send) {
		this.time_send = time_send;
	}

	public LocalDate getTime_read() {
		return time_read;
	}

	public void setTime_read(LocalDate time_read) {
		this.time_read = time_read;
	}

	public String getAcc_receive() {
		return acc_receive;
	}

	public void setAcc_receive(String acc_receive) {
		this.acc_receive = acc_receive;
	}

	@Override
	public String toString() {
		return "Message [id_mess=" + id_mess + ", message=" + message + ", time_send=" + time_send + ", time_read="
				+ time_read + ", acc_receive=" + acc_receive + "]";
	}
	
	
	
}
