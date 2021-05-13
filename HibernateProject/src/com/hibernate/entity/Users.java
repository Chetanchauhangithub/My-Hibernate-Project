package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

		

		

		@Id
		@Column(name="user_id")
		int userId;
		
		@Column(name="username")
		String username;
		
		@Column(name="password")
		String password;
		
		@Column(name="firstname")
		String firstName;
		
		@Column(name="lastname")
		String lastName;
	

		
		public Users() {
			
		}
		
		public Users(String username, String password, String firstName, String lastName) {
			// TODO Auto-generated constructor stub
			
			this.username = username;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
					+ firstName + ", lastName=" + lastName + "]";
		}
		
}
