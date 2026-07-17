
public class Donor extends Person {

    private String bloodType;
    private int age;

    public Donor(int id, String name, String phone,
                 String bloodType, int age) {

        super(id, name, phone);

        this.bloodType = bloodType;
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void displayInfo() {

        System.out.println("Donor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }
}