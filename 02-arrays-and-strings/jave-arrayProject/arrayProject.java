class Student {
    int rollNo;
    String name;
    int marks;

}

public class arrayProject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = 90;
        s1.rollNo = 1;
        s1.name = "aryan";

        Student s2 = new Student();
        s2.marks = 60;
        s2.rollNo = 2;
        s2.name = "arman";

        Student s3 = new Student();
        s3.marks = 48;
        s3.rollNo = 3;
        s3.name = "arbaz";

        Student s4 = new Student();
        s4.marks = 50;
        s4.rollNo = 4;
        s4.name = "arham";

        Student student[] = new Student[4];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        student[3] = s4;
        // for (int i = 0; i < student.length; i++) {

        // System.out.println(student[i].name + ":" + student[i].marks);

        // }
        // enhanced for loop

        for (Student studs : student) {
            System.out.println(studs.name + ":" + studs.marks);
        }
    }
}
