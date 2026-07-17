
public class Hospital {

    private int hospitalId;
    private String hospitalName;

    public Hospital(int hospitalId, String hospitalName) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void displayInfo() {
        System.out.println("Hospital ID: " + hospitalId);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("----------------------");
    }
}