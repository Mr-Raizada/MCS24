class Student {
  String name;
  String course;
  int roll_no;
  int age;

  void display_info() { //Funtion for Displaying the information
    System.out.println("Student Information");
    System.out.println("Name" + name);
    System.out.println("Course" + course);
    System.out.println("Roll No : " + roll_no);
    System.out.println("Age : " + age);
  }
}

//End of the Student class

class Display_test {

  public static void main(String para[]) {
    Student student1;
    student1 = new Student();
    student1.name = "Mr.Ravi"; //Assising the value to name variable of student1 object
    student1.course = "MCA"; //Assising the value to the course varibale of Student1 object
    student1.roll_no = 5685; //Assising the value to the roll_no variable of student object
    student1.age = 25; //Asssining the value to the age variable of the student object
    student1.display_info(); //invoking the display_info() method on student1 object
  }
}
