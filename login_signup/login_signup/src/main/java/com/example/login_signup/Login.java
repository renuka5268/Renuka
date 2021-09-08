package com.example.login_signup;

public class Login {
    public static String name;
    public  static String phoneno;
    public static String emailid;
    public static String password;
    public static String repassword;


    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static String  getPhoneno() {return phoneno;}
    public void setPhoneno(String phoneno) {
        this.name = phoneno;
    }
    public static String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public static String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static String getRepassword() {
        return repassword;
    }
    public void setRepassword(String password) {
        this.repassword = repassword;
    }
    public Login() {
        super();
        this.name = name;
        this.phoneno = phoneno;
        this.emailid = emailid;
        this.password = password;
        this.repassword = repassword;
    }
    @Override
    public String toString() {
        return "Contact [ name=" + name + ", phone=" + phoneno + ", email=" + emailid + ",password=" + password + " ,repassword=" + repassword +"]";
    }

}
