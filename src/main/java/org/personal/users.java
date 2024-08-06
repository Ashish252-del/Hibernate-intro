package org.personal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Note --> in case your table name is not same as class name then we need to tell explicitly tablename
@Entity // using this annotation we are setting this class as a table of database
//@Table( name = "users") like this but in our case table name is same as class name
public class users {
    @Id // here we sare saying that it is our primary key
    private int id;
    @Column(name = "firstname") // here we are setting that this field is same as firstname column
    private  String firstname;
    @Column(name = "lastname") // in case you field name is same as table field then no need to mention explicitly
    private  String lastname;
    @Column(name = "mobile")
    private  String mobile;
    @Column(name = "email")
    private  String email;
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
   public  String toString () {
        return "users [id = "+this.id +" firstname = "+this.firstname +" lastname = "+this.lastname +" mobile = "+this.mobile+
                " email = "+this.email+"]";
   }

}
