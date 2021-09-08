package com.example.login_signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
@Repository
public class LoginRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping
    public void insertLoginDetailsToDatabase(String name, String phoneno, String emailid,String password,String repassword) {
        String sql = "INSERT INTO login(name,phoneno,emailid,password,repassword) VALUES(?,?,?,?,?)";
        Object params[] = new Object[] {name,phoneno,emailid,password,repassword };
        jdbcTemplate.update(sql,params);

    }
}
