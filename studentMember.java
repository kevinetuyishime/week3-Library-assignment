public class StudentMember extends Member {

    private String school;

    // Constructor
    public StudentMember(String id, String name, String school) {
        super(id, name);
        this.school = school;
    }

    // Getter
    public String getSchool() {
        return school;
    }

    // Setter
    public void setSchool(String school) {
        this.school = school;
    }

    // Calculate fee
    @Override
    public double calculateFees() {

        if (getId() != null && !getId().isEmpty()) {
            return 0;
        } else {
            return 5000;
        }
    }

    // toString
    @Override
    public String toString() {
        return "StudentMember{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}