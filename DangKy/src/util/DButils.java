package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Account;


public class DButils {
	public static void updateAccount(Connection conn, Account account) throws SQLException {
		String sql = "Update Account set first_name=?, last_name=?, pass=? where email=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		pstm.setString(1, account.getFirstName());
		pstm.setString(2, account.getLastName());
		pstm.setString(3, account.getPass());
		pstm.setString(4, account.getEmail());
		
		pstm.executeUpdate();
	}
	public static Account insertAccount(Connection conn, Account account) throws SQLException {
		String sql = "Insert into Account(first_name, last_name, email, pass) values(?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		pstm.setString(1, account.getFirstName());
		pstm.setString(2, account.getLastName());
		pstm.setString(3, account.getEmail());
		pstm.setString(4, account.getPass());
		
		pstm.executeUpdate();
		return account;
	}
	 public static void deleteAccount(Connection conn, String email) throws SQLException {
	        String sql = "Delete From Account where email= ?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, email);
	 
	        pstm.executeUpdate();
	    }
	 public static ArrayList<Account> getAllAcc(Connection conn){
			String sql = "select * from Account";
			ArrayList<Account> ds = new ArrayList<>();
			try {
				Statement st = conn.createStatement(); 
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					String firstName = rs.getString(1);
					String lastName = rs.getString(2); 
					String email = rs.getString(3);  
					String password = rs.getString(4);
					ds.add(new Account(firstName, lastName, email, password));
				}   
			} catch (Exception e) {
				// TODO: handle exception    
				e.printStackTrace();   
			}
			return ds;
		}
	
}
