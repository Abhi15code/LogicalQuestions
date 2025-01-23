package test;

import Old.user;

import java.util.Comparator;

public class phcom implements Comparator<user> {
public int compare(user u1 , user u2){
    return u1.getPhone() - u2.getPhone();
}
}
