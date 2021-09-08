package com.example.login_signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

public class LoginController {
    @RestController
    public class ContactlistController {
        @Autowired
        LoginModel LoginModelObj;
        @Autowired
        LoginRepository LoginRepository;
        List<String> list = new ArrayList<>();
        @PostMapping(path = "/signup")

        public String signup(WebRequest WebRequest){

            String name = WebRequest.getParameter("name");
            String password = WebRequest.getParameter("password");
            String repassword = WebRequest.getParameter("repassword");
                if(password==repassword){
                  return ("successfully signed up");
                }else{
                    return("The password not match and try again");
                }

        }
        @PostMapping(path="/login")
         public String login(WebRequest WebRequest){
            String name = WebRequest.getParameter("name");
            String password = WebRequest.getParameter("password");
            for (int user in list){
                if(user['name']==name)
                {
                    if(user['password']==password) {
                        return ("successfully logged in");

                    }else{
                        return ("The username and password does not match");

                    }
                }
            }
           return ("The username does not exist ! please enter correct usn and pwd")
        }


    }
}
