import java.io.Serializable;
import java.lang.reflect.Member;
import java.util.ArrayList;

public class Squad implements Serializable {
    private String squadName;
    private String homeTown;
    private int formed;
    private String secretBase;
    private Boolean active;
    private ArrayList<Member> members;

    public Squad() {
    }

    public Squad(String squadName, String homeTown, int formed, String secretBase, Boolean active,  ArrayList<Member> members) {
        this.squadName = squadName;
        this.homeTown = homeTown;
        this.formed = formed;
        this.secretBase = secretBase;
        this.active = active;
        this.members = members;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setFormed(int formed) {
        this.formed = formed;
    }

    public void setSecretBase(String secretBase) {
        this.secretBase = secretBase;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public String getSquadName() {
        return squadName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public int getFormed() {
        return formed;
    }

    public String getSecretBase() {
        return secretBase;
    }

    public Boolean getActive() {
        return active;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }
}
