package com.mycompany.myapp.bean;

public class Platform {
	private String vin;
	private String ip;
	private Integer port;
	private String user;
	private String password;

	public Platform() {
	}

	public Platform(String vin, String ip, int port, String user, String password) {
		this.vin = vin;
		this.ip = ip;
		this.port = port;
		this.user = user;
		this.password = password;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Platform{" +
				"vin='" + vin + '\'' +
				", ip='" + ip + '\'' +
				", port=" + port +
				", user='" + user + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
