public class Student {
    //Data Members
    private String name;
    private String email;

    //Constructor
    public Student() {
        name = "Unassigned";
        email = "Unassigned";
    }
    public String getEmail() {
        return email;
  }
    public String getName() {
        return name;
   }
		
    //Assigns the email of this student
    public void setEmail(String address) {
        email = address;
    }

    //Assigns the name of this student
    public void setName(String studentName) {
        name = studentName;
    }
	
}

