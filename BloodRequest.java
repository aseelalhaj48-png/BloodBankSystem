

public class BloodRequest {

    private int requestId;
    private Hospital hospital;
    private String bloodType;
    private int quantity;

    public BloodRequest(int requestId,
                        Hospital hospital,
                        String bloodType,
                        int quantity) {

        this.requestId = requestId;
        this.hospital = hospital;
        this.bloodType = bloodType;
        this.quantity = quantity;
    }

    public int getRequestId() {
        return requestId;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayInfo() {

        System.out.println("Request ID: " + requestId);
        System.out.println("Hospital: "
                + hospital.getHospitalName());
        System.out.println("Blood Type: "
                + bloodType);
        System.out.println("Quantity: "
                + quantity + " Unit(s)");
        System.out.println("----------------------");
    }
}