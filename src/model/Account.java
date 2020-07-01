package model;

public class Account {
    private String account_name;
    private String password;
    private String username;

    private int phone_number;
    private String email;
    private boolean is_admin;

    public Account() {
    }

    public Account(String account_name, String password, String username, int phone_number, String email) {
        this.account_name = account_name;
        this.password = password;
        this.username = username;
        this.phone_number = phone_number;
        this.email = email;
        this.is_admin =false;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
