package com.MueveTic.app.Utils;

public class AuthResponse {
	
	private String token;
	private String role;
	
	public AuthResponse(String token, String role) {
		this.token = token;
		this.role = role;
	}
	
	public AuthResponse() {
		this.token = "";
		this.role = "";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}