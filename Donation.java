

public class Donation {

    private int donationId;
    private Donor donor;
    private String donationDate;
    private int quantity;

    public Donation(int donationId, Donor donor,
                    String donationDate, int quantity) {

        this.donationId = donationId;
        this.donor = donor;
        this.donationDate = donationDate;
        this.quantity = quantity;
    }

    public int getDonationId() {
        return donationId;
    }

    public Donor getDonor() {
        return donor;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayInfo() {

        System.out.println("Donation ID: " + donationId);
        System.out.println("Donor: " + donor.getName());
        System.out.println("Blood Type: " + donor.getBloodType());
        System.out.println("Date: " + donationDate);
        System.out.println("Quantity: " + quantity + " Unit(s)");
        System.out.println("----------------------");
    }
}
