import java.io.Serializable;
import java.util.ArrayList;

public class Member implements Serializable {
    private String name;
    private int age;
    private String SecretIdentity;
    private ArrayList<String> powers;

    public Member() {
    }

    public Member(String name, int age, String secretIdentity, ArrayList<String> powers) {
        this.name = name;
        this.age = age;
        SecretIdentity = secretIdentity;
        this.powers = powers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSecretIdentity(String secretIdentity) {
        SecretIdentity = secretIdentity;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSecretIdentity() {
        return SecretIdentity;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }
}
