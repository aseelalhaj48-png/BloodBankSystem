
import java.util.ArrayList;

public class BloodBank1 {

    private ArrayList<Donor> donors;
    private ArrayList<Donation> donations;
    private ArrayList<BloodRequest> requests;
    private ArrayList<Patient> patients;

    public BloodBank1() {

        donors = new ArrayList<>();
        donations = new ArrayList<>();
        requests = new ArrayList<>();
        patients = new ArrayList<>();
    }

    // Add Donor
    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    // Add Patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Add Donation
    public void addDonation(Donation donation) {
        donations.add(donation);
    }

    // Add Request
    public void addRequest(BloodRequest request) {
        requests.add(request);
    }

    // Display Donors
    public void displayDonors() {

        if (donors.isEmpty()) {
            System.out.println("No donors found.");
            return;
        }

        for (Donor donor : donors) {
            donor.displayInfo();
        }
    }

    // Display Patients
    public void displayPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient patient : patients) {
            patient.displayInfo();
        }
    }

    // Display Donations
    public void displayDonations() {

        if (donations.isEmpty()) {
            System.out.println("No donations found.");
            return;
        }

        for (Donation donation : donations) {
            donation.displayInfo();
        }
    }

    // Display Requests
    public void displayRequests() {

        if (requests.isEmpty()) {
            System.out.println("No requests found.");
            return;
        }

        for (BloodRequest request : requests) {
            request.displayInfo();
        }
    }

    // Search Donor By Blood Type
    public void searchDonorByBloodType(String bloodType) {

        boolean found = false;

        for (Donor donor : donors) {

            if (donor.getBloodType().equalsIgnoreCase(bloodType)) {

                donor.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No donors found with blood type " + bloodType);
        }
    }

    public ArrayList<Donor> getDonors() {
        return donors;
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }

    public ArrayList<BloodRequest> getRequests() {
        return requests;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}
