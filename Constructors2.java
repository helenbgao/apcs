
public class Constructors2
{
  
	public static void main(String args[])
	{
      Student student1 = new Student("Student1", 123456, 9, 1.0);
      System.out.println(student1.getName()); 
      System.out.println(student1.getID());
      System.out.println(student1.getGrade());
      System.out.println(student1.getGPA());
      Student student2 = new Student("Student2", 234567, 10, 2.0);
      System.out.println(student2.getName()); 
      System.out.println(student2.getID());
      System.out.println(student2.getGrade());
      System.out.println(student2.getGPA());
      Student student3 = new Student("Student3", 345678, 11, 3.0);
      System.out.println(student3.getName()); 
      System.out.println(student3.getID());
      System.out.println(student3.getGrade());
      System.out.println(student3.getGPA());
      Student student4 = new Student("Student4", 456789, 12, 4.0);
      System.out.println(student4.getName()); 
      System.out.println(student4.getID());
      System.out.println(student4.getGrade());
      System.out.println(student4.getGPA());
   }
}

class Student
{
   private String name;
   private int id;
   private int grade;
   private double gpa;
   
   public Student (String name, int id, int grade, double gpa)
   {
      this.name = name;
      this.id = id;
      this.grade = grade;
      this.gpa = gpa;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getID()
   {
      return id;
   }
   
   public int getGrade()
   {  
      return grade;
   }
   
   public double getGPA()
   {
      return gpa;
   }
}