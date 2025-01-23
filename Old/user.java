package Old;

// public class user implements Comparable<user> {
    public class user{
    private int uid;
    private String name;
    private int phone;


    
    public user(int uid, String name, int phone) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    // @Override
    // public int compareTo(user o) {

    //         return this.uid-o.uid;    }

    @Override
    public String toString() {
        return "user [uid=" + uid + ", name=" + name + ", phone=" + phone + "]";
    }


    
    
    
}
