package sbiicm.com.bankcaller.model;

/**
 * Created by praneeth on 1/10/2018.
 */

public class Contacts {

    private int pfId;
    private  int Id;
    private  String name;
    private  int phone1;
    private int phone2;
    private String email;
    private String dept;
    private  String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }




    public Contacts(int pfId, int id, String name, int phone1, int phone2, String email, String dept,String pwd) {
        this.pfId = pfId;
        Id = id;
        this.name = name;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.dept = dept;
        this.pwd = pwd;
    }


    public int getPfId() {
        return pfId;
    }

    public void setPfId(int pfId) {
        this.pfId = pfId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone1() {
        return phone1;
    }

    public void setPhone1(int phone1) {
        this.phone1 = phone1;
    }

    public int getPhone2() {
        return phone2;
    }

    public void setPhone2(int phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
