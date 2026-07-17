
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager {

    public static void saveDonors(ArrayList<Donor> donors) {

        try {

            PrintWriter writer =
                    new PrintWriter(
                            new FileWriter("donors.txt"));

            for (Donor donor : donors) {

                writer.println(
                        donor.getId() + "," +
                        donor.getName() + "," +
                        donor.getPhone() + "," +
                        donor.getBloodType() + "," +
                        donor.getAge()
                );
            }

            writer.close();

            System.out.println("Donors saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving donors.");
        }
    }
}