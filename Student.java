package learnjava;
// create a Student class
public class Student {
   // Declaring attributes
   String name;
   int rollNo;
   String section; 

   // initialize attributes
   Student(String name, int rollNo, String section){
      this.name = name;
      this.rollNo = rollNo;
      this.section = section;
   }

   // print details	  
   public void printDetails() {
      System.out.println("Student Details:");
      System.out.println(this.name + ", " + this.rollNo + ", " + this.section);
   }

   // main method to test
   public static void main(String[] args) {
      Student s1 = new Student("tamizh", 101, "A");
      s1.printDetails();
   }
}

