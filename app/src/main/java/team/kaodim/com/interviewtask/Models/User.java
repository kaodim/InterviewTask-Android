package team.kaodim.com.interviewtask.Models;

/**
 * Created by dinuka on 22/05/2017.
 */

public class User {

    private String Id = "";
    private String Name = "";
    private String Nic = "";
    private String Nationality = "";
    private String Mobile = "";

    public User(){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
