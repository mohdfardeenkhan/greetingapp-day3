package com.bridgelabz.greetingapp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String firstname;
    private String lastname;

    @Override
    public String toString(){
        String str = (firstname!=null)? firstname+" ":"";
        str += (lastname!= null) ? lastname: "";
        return str.trim();
    }


}
