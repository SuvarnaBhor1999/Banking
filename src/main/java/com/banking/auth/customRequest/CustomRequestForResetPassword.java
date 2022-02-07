package com.banking.auth.customRequest;

public class CustomRequestForResetPassword {
	
	public String emailId;
	public String newPassword;
	public String oldPassword;
	public CustomRequestForResetPassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomRequestForResetPassword(String emailId, String newPassword, String oldPassword) {
		super();
		this.emailId = emailId;
		this.newPassword = newPassword;
		this.oldPassword = oldPassword;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	@Override
	public String toString() {
		return "CustomRequestForResetPassword [emailId=" + emailId + ", newPassword=" + newPassword + ", oldPassword="
				+ oldPassword + "]";
	}
	
	
	
		
		
	}
		
	
		