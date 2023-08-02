package com.project.blog.payloads;

public class JwtAuthResponse {

	private String token;
	private UserDto user;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "JwtAuthResponse [token=" + token + ", user=" + user + "]";
	}

}
