package fcu.iecs.oop.password;

public class PasswordEncorder {
	public String encode(String password) {
		password=password.replaceAll("(?i)a","4");
		password=password.replaceAll("(?i)e","3");
		password=password.replaceAll("(?i)i","1");
		password=password.replaceAll("(?i)o","0");
		password=password.replaceAll("(?i)t","7");
		return password;
	}
}
