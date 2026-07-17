
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BloodBank1 bloodBank = new BloodBank1();

        int choice;

        do {

            System.out.println("\n===== Blood Donation Management System =====");

            System.out.println("1. Register Donor");
            System.out.println("2. View Donors");
            System.out.println("3. Register Patient");
            System.out.println("4. View Patients");
            System.out.println("5. Record Donation");
            System.out.println("6. View Donations");
            System.out.println("7. Add Blood Request");
            System.out.println("8. View Requests");
            System.out.println("9. Save Donors");
            System.out.println("10. Search Donor By Blood Type");
            System.out.println("11. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = input.nextLine();

                    System.out.print("Enter Blood Type: ");
                    String bloodType = input.nextLine();

                    System.out.print("Enter Age: ");
                    int age = input.nextInt();

                    Donor donor = new Donor(
                            id,
                            name,
                            phone,
                            bloodType,
                            age);

                    bloodBank.addDonor(donor);

                    System.out.println("Donor added successfully.");
                    break;

                case 2:

                    bloodBank.displayDonors();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int patientId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String patientName = input.nextLine();

                    System.out.print("Enter Phone: ");
                    String patientPhone = input.nextLine();

                    System.out.print("Enter Needed Blood Type: ");
                    String neededBloodType = input.nextLine();

                    Patient patient = new Patient(
                            patientId,
                            patientName,
                            patientPhone,
                            neededBloodType);

                    bloodBank.addPatient(patient);

                    System.out.println("Patient added successfully.");
                    break;

                case 4:

                    bloodBank.displayPatients();
                    break;

                case 5:

                    if (bloodBank.getDonors().isEmpty()) {
                        System.out.println("No donors available.");
                        break;
                    }

                    System.out.print("Enter Donation ID: ");
                    int donationId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Donor ID: ");
                    int donorId = input.nextInt();
                    input.nextLine();

                    Donor selectedDonor = null;

                    for (Donor d : bloodBank.getDonors()) {
                        if (d.getId() == donorId) {
                            selectedDonor = d;
                            break;
                        }
                    }

                    if (selectedDonor == null) {
                        System.out.println("Donor not found.");
                        break;
                    }

                    System.out.print("Enter Donation Date: ");
                    String donationDate = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = input.nextInt();

                    Donation donation = new Donation(
                            donationId,
                            selectedDonor,
                            donationDate,
                            quantity);

                    bloodBank.addDonation(donation);

                    System.out.println("Donation recorded successfully.");
                    break;

                case 6:

                    bloodBank.displayDonations();
                    break;

                case 7:

                    System.out.print("Enter Request ID: ");
                    int requestId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Hospital ID: ");
                    int hospitalId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Hospital Name: ");
                    String hospitalName = input.nextLine();

                    Hospital hospital = new Hospital(
                            hospitalId,
                            hospitalName);

                    System.out.print("Enter Blood Type: ");
                    String requestBloodType = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int requestQuantity = input.nextInt();

                    BloodRequest request = new BloodRequest(
                            requestId,
                            hospital,
                            requestBloodType,
                            requestQuantity);

                    bloodBank.addRequest(request);

                    System.out.println("Request added successfully.");
                    break;

                case 8:

                    bloodBank.displayRequests();
                    break;

                case 9:

                    FileManager.saveDonors(
                            bloodBank.getDonors());

                    break;

                case 10:

                    input.nextLine();

                    System.out.print("Enter Blood Type: ");
                    String searchBloodType = input.nextLine();

                    bloodBank.searchDonorByBloodType(searchBloodType);

                    break;

                case 11:

                    System.out.println("Thank you.");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 11);

        input.close();
    }
}
