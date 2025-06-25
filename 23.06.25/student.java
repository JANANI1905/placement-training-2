class Student {
    int studentId;
    String studentName;
    char grade;

    Student() {
        this(0, "Unknown", 'N');
    }

    Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    void display() {
        System.out.println("ID: " + studentId + ", Name: " + studentName + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Deekshana", 'A');
        s1.display();
        s2.display();
    }
}