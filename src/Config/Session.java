
package Config;

public class Session {
    
    private static Session instance;
    private String uid;
    private String fname;
    private String lname;
    private String address;
    private String acount_type;
    private String email;
    private String contact;
    private String uname;
    private String status;
    
    private Session(){
    
    
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public static synchronized Session getInstance() {
        if (instance == null){
            instance = new Session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty(){
       return instance == null;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAcount_type() {
        return acount_type;
    }

    public void setAcount_type(String acount_type) {
        this.acount_type = acount_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAccountType(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
