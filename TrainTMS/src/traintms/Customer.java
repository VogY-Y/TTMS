
package traintms;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String ccinfo;
    private String phnno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCcinfo() {
        return ccinfo;
    }

    public void setCcinfo(String ccinfo) {
        this.ccinfo = ccinfo;
    }

    public String getPhnno() {
        return phnno;
    }

    public void setPhnno(String phnno) {
        this.phnno = phnno;
    }
    
     
            
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.id="123";
        c1.name="shanto";
        c1.email="shanto@gmail.com";
        c1.ccinfo="*****";
        c1.phnno="016***";
        
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.email);
        System.out.println(c1.ccinfo);
        System.out.println(c1.phnno);
        
        
    }
}
    

