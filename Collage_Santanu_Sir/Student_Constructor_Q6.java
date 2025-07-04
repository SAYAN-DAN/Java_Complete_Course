class Student_Constructor_Q6{
String name1;
int age1;
Student_Constructor_Q6(String name , int age){
    this.name1=name;
    this.age1=age;
}
void display(){
    System.out.println("My name is: "+ name1+ " and age is: "+ age1);
}
    public static void main(String[] args) {
        Student_Constructor_Q6 student = new Student_Constructor_Q6("Sayan" , 20);
        student.display();
    }
}