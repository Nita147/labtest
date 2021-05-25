import java.util.*;
class student {
private int id;
private String name;
int div;
Scanner sc=new Scanner(System.in);
Student  [] arr= new student[5];
 
 void setdata()
 {
 System.out.println("Enter the no. of student entered");
 int a=sn.nextInt();
 for(int i=0;i<a; i++)
 {
 System.out.println("enter student id,name,div");
 arr[i]=new  student();
 arr[i].set1(sc.nextInt(),sc.nextLine(),sc.nextInt());
 }
 }
 student set1(int id,String name, int div)
 {
 this.id=id;
 this.name=name;
 this.div=div;
 return this;
 }
 void display()
 {
 System.out.println("student id ="+id+"student name="+name+"student division="+div);
 }
 void getstudentdetails(int id)
 {
 for (int i =0; i<arr.length; i++)
 {
 if(arr[i].id == id)
 {
 System.out.println("student name"+arr[i].name+"student div "+a[i].div);
 }
 }
 }
 void getstudentdetails(String name)
 {
  for (int i =0; i<arr.length; i++)
 {
 if(arr[i].name .equals(name))
 {
 System.out.println("student id"+arr[i].id+"student div "+a[i].div);
 }
 }
 }
 public class studentdemo{
 public static void main(String args[])
 {
 student s1=new student();
 Scanner scr=new  Scanner(System.in);
 s1.setdata();
 System.out.println("Enter the id should be searched");
 int p=src.nextInt();
 s1.getstudentdetails(p);
 System.out.println("Enter the name  should be searched");
 int k=src.next();
 s1.getstudentdetails(k);
 }
 }
}