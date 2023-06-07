//package Charpter3;
//
//import java.time.LocalDate;
//
//public class HeartRate {
//    public static void main(String[] args) {
//
//    }
//    private String firstName;
//    private String lastName;
//    private int birthYear;
//    private int birthMonth;
//    private int birthDay;
//    public HeartRate String () {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.birthYear = birthYear;
//        this.birthMonth = birthMonth;
//        this.birthDay = birthDay;
//        return null;null
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getBirthYear() {
//        return birthYear;
//    }
//
//    public void setBirthYear(int birthYear) {
//        this.birthYear = birthYear;
//    }
//
//    public int getBirthMonth() {
//        return birthMonth;
//    }
//
//    public void setBirthMonth(int birthMonth) {
//        this.birthMonth = birthMonth;
//    }
//
//    public int getBirthDay() {
//        return birthDay;
//    }
//
//    public void setBirthDay(int birthDay) {
//        this.birthDay = birthDay;
//    }
//
//    // Calculate and return age in years
//    public int calculateAge() {
//        int currentYear = LocalDate.now().getYear();
//        return currentYear - birthYear;
//    }
//
//    // Calculate and return maximum heart rate
//    public int calculateMaxHeartRate() {
//        return 220 - calculateAge();
//    }
//
//    // Calculate and return target heart rate range
//    public String calculateTargetHeartRateRange() {
//        int maxHeartRate = calculateMaxHeartRate();
//        int lowerRange = (int) (maxHeartRate * 0.5);
//        int upperRange = (int) (maxHeartRate * 0.85);
//        return lowerRange + " - " + upperRange;
//    }
//
//
//    public void printInfo() {
//        System.out.println("Name: " + firstName + " " + lastName);
//        System.out.println("Date of Birth: " + birthMonth + "/" + birthDay + "/" + birthYear);
//        System.out.println("Age: " + calculateAge() + " years");
//        System.out.println("Maximum Heart Rate: " + calculateMaxHeartRate() + " bpm");
//        System.out.println("Target Heart Rate Range: " + calculateTargetHeartRateRange() + " bpm");
//    }
//
//
//}
//
