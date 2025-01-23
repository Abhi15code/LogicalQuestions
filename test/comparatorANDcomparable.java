package test;

import Old.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparatorANDcomparable {
    public static void main(String[] args) {
        ArrayList<user> users = new ArrayList<>();
        users.add(new user(101, "abhishek", 732));
        users.add(new user(202, "aanand", 32));
        users.add(new user(99, "Durges", 3232));

        // using Comparable
        // Collections.sort(users);

        // Using Comparator
        // Collections.sort(users, new idComparator());
        // System.out.println(users);

        // Collections.sort(users, new nameComra());
        // Collections.sort(users , new phcom());

        Comparator<user> com = new Comparator<user>() {
            public int compare(user u1, user u2) {
                // if(u1.getUid()>u2.getUid())
                if (u1.getName().equals(u2.getName()))
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<user> comid = new Comparator<user>() {
            public int compare(user u1, user u2) {
                if (u1.getUid() > u2.getUid()) {
                    return 1;

                } else {
                    return -1;
                }
            }
        };

        Collections.sort(users, comid);
        // for(Object oo : users){
        // System.out.println(oo);
        // }
        System.out.println(users);
        // Collections.sort(users , com);
        // for(Object o: users){
        // System.out.println(o);
        // }
    }

}
