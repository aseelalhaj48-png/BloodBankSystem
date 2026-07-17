
public class Patient extends Person {

    private String neededBloodType;

    public Patient(int id, String name, String phone,
                   String neededBloodType) {

        super(id, name, phone);
        this.neededBloodType = neededBloodType;
    }

    public String getNeededBloodType() {
        return neededBloodType;
    }

    @Override
    public void displayInfo() {

        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Needed Blood Type: " + neededBloodType);
        System.out.println("----------------------");
    }
}