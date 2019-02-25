public class Inherit
{
	public static void main(String args[])
	{
	   Student tom = new Student(11, 16);
      tom.showData();
	}
}

class Person
{
   protected int age;
   
   public Person(int a)
   {
      System.out.println("Person Constructor");
      age = a;
   }
}

class Student extends Person
{
   private int grade;
   
   public Student(int g, int a)
   {
      super(a);
      System.out.println("Student Constructor");
      grade = g;
   }
   
   public void showData()
   {
      System.out.println("Student's grade is " + grade);
      System.out.println("Student's age is " + age);
   }
}