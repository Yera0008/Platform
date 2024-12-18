
class Donation {
    private double amount;
    private String date;
    private Donor donor;
    private Charity charity;

    public Donation(double amount, String date, Donor donor, Charity charity) {
        this.amount = amount;
        this.date = date;
        this.donor = donor;
        this.charity = charity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    public void displayDonation() {
        System.out.println("Donation Details:");
        System.out.println("Amount: $" + amount + ", Date: " + date);
        System.out.println("Donor: " + donor.getName());
        System.out.println("Charity: " + charity.getName());
    }
}

class Donor {
    private String name;
    private String email;

    public Donor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayDonor() {
        System.out.println("Donor Name: " + name + ", Email: " + email);
    }
}

class Charity {
    private String name;
    private String purpose;

    public Charity(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void displayCharity() {
        System.out.println("Charity Name: " + name + ", Purpose: " + purpose);
    }
}

public class CharityDonationPlatform {
    public static void main(String[] args) {
        // Create Donors
        Donor donor1 = new Donor("Yerasil Ibrayev", "yeras123@gmail.com");
        Donor donor2 = new Donor("Ayat", "yeahAyat@gmail.com");

        Charity charity1 = new Charity("Cure of the world", "Providing funds to creating a cure");
        Charity charity2 = new Charity("Meals of Mercy", "the account received a cash accrual for charity");

        Donation donation1 = new Donation(175, "2019-11-18", donor1, charity1);
        Donation donation2 = new Donation(160, "2023-05-14", donor2, charity2);

        System.out.println("=== Donor Details ===");
        donor1.displayDonor();
        donor2.displayDonor();

        System.out.println("\n=== Charity Details ===");
        charity1.displayCharity();
        charity2.displayCharity();

        System.out.println("\n=== Donation Details ===");
        donation1.displayDonation();
        donation2.displayDonation();

        System.out.println("\nTotal Donation by " + donor1.getName() + ": $" + donation1.getAmount() );
        System.out.println("\nTotal Donation by " + donor2.getName() + ": $" + donation2.getAmount() );
    }
}
