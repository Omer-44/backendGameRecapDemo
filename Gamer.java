package demo;

public class Gamer {
private String username;
private int budget;
private String password;
public Gamer(String username, int budget, String password) {
	this.username = username;
	this.budget = budget;
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getBudget() {
	return budget;
}
public void setBudget(int budget) {
	this.budget = budget;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
