package dto;

public class CreateUserInputDto {

    private String firstName;
    private String lastName;


    public CreateUserInputDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CreateUserInputDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "CreateUserInputDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
