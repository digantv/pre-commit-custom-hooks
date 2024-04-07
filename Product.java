public class Product {
  String firstname;
  String lastname;
  String gender;
  int age;
  String email;
  String password;

  public void printUser() {
    System.out.println("First Name : " + firstname);
    System.out.println("Last Name : " + lastname);
    System.out.println("Gender : " + gender);
    System.out.println("Age : " + age);
    System.out.println("Email : " + email);
  }
}
