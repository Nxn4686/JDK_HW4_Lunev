package JDK_HW_4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String phoneNumber;
    private int experience;

    public Employee(int id, String name, String phoneNumber, int experience) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber + ", Experience: " + experience + " years";
    }

}
