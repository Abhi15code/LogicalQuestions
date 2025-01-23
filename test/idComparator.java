package test;

import Old.user;

import java.util.Comparator;

public class idComparator implements Comparator<user>{

    @Override
    public int compare(user o1, user o2) {
      return o1.getUid()-o2.getUid();
    }

    
}
