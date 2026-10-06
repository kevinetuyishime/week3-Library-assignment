public class PublisherMember extends Member {

    private String companyName;

    // Constructor
    public PublisherMember(String id, String name, String companyName) {
        super(id, name);
        this.companyName = companyName;
    }

    // Getter
    public String getCompanyName() {
        return companyName;
    }

    // Setter
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Calculate fee
    @Override
    public double calculateFees() {

        double flatFee = 5000;

        return flatFee + (0.05 * flatFee) + 20000;
    }

    // toString
    @Override
    public String toString() {
        return "PublisherMember{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}