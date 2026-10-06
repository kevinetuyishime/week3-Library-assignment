public class LibrarianMember extends Member {

    private String department;

    // Constructor
    public LibrarianMember(String id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    // Calculate fee
    @Override
    public double calculateFees() {
        return 0;
    }

    // toString
    @Override
    public String toString() {
        return "LibrarianMember{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}