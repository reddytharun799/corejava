package student;

public class StudentInformation {
    public String studentName;
    public String rollNumber;
    public String fatherName;

    public static void main(String[] args) {
        StudentInformation studentInformation = new StudentInformation();
        studentInformation.studentName="arun";
        studentInformation.rollNumber="77";
        studentInformation.fatherName="kiran";
        System.out.println(" student Details  : " + studentInformation.studentName);
        System.out.println(" student Details  : " + studentInformation.rollNumber);
        System.out.println(" student Details  : " + studentInformation.fatherName);
        System.out.println(" student Details  : " + studentInformation.rollNumber);
        System.out.println(" student Details  : " + studentInformation.fatherName);
        System.out.println(" student Details  : " + studentInformation.studentName+"  "+

                studentInformation.rollNumber+"  "+studentInformation.fatherName);
    }
}