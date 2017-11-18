package user.enums;

public class User {
    private String name;
    private EngagementStatus engagementStatus;
    private Gender gender;
    private WorkingStatus workingStatus;
    private MaritalStatus maritalStatus;

    public User(String name) {
        this.name = name;
        if (new String(TestEnums.vowels).contains("" + name.charAt(name.length()-1))){
         this.gender= Gender.FEMALE;
        }
        else {
            this.gender=Gender.MALE;
        }
        this.engagementStatus=EngagementStatus.NOT_ENGAGED;
        this.workingStatus=WorkingStatus.WORKING;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EngagementStatus getEngagementStatus() {
        return engagementStatus;
    }

    public void setEngagementStatus(EngagementStatus engagementStatus) {
        this.engagementStatus = engagementStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public WorkingStatus getWorkingStatus() {
        return workingStatus;
    }

    public void setWorkingStatus(WorkingStatus workingStatus) {
        this.workingStatus = workingStatus;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", engagementStatus=" + engagementStatus +
                ", gender=" + gender +
                ", workingStatus=" + workingStatus +
                ", maritalStatus=" + maritalStatus +
                '}';
    }
}

enum EngagementStatus {
    ENGAGED,
    NOT_ENGAGED
}
enum Gender {
    MALE,
    FEMALE,
    UNKNOWN
}
enum WorkingStatus {
    WORKING,
    NOT_WORKING,
    HOUSE_KEEPER
}
enum MaritalStatus {
    MARRIED,
    NOT_MARRIED,
    IN_PROGRESS
}
