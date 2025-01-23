package test;

import Old.user;

import java.util.Comparator;

public class nameComra  implements Comparator<user>{

    @Override
    public int compare(user o1, user o2) {
       
        return o1.getName().compareTo(o2.getName());
      //  return o1.getName().equals(o2.getName()); can not convert boolean to int
    }
    
}
