package model;

import java.util.Date;

public class Admin {
    private String username;
    private String password;
    private Date createAt;

    public Admin() {
    }

    public Admin(String username, String password, Date createAt) {
        this.username = username;
        this.password = password;
        this.createAt = createAt;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
