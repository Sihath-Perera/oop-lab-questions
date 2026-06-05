package Lab6;

public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    public String getMemberName() { return memberName; }
    public String getMembershipType() { return membershipType; }
    public int getNumberOfMonths() { return numberOfMonths; }

    public double getMonthlyFee() {
        if (membershipType.equals("Premium")) {
            return 2500.0;
        }
        return 1000.0;
    }

    public String getNewsletterText() {
        return newsletterSelected ? "Yes" : "No";
    }

    public double getMembershipFee() {
        // Base fee = monthly rate * number of months
        double totalFee = getMonthlyFee() * numberOfMonths;
        
        // Add a flat 200 charge if the newsletter checkbox was ticked
        if (newsletterSelected) {
            totalFee += 200.0;
        }
        return totalFee;
    }
}