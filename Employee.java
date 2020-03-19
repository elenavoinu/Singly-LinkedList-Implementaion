import java.util.Objects;

public class Employee {
    private String firstName;
    private String secondName;
    private int id;

    @Override
    public String toString() {
        return "" +
                  firstName + ' ' +
                secondName + ' ' +
                id ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getSecondName(), employee.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName(), getId());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String firstName, String secondName, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
    }
}