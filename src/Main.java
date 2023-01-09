public class Main{
	
    public static void main(String[] args) {
        Student student; 
        student = new Student();
        student.setName("Anthony Salloman");
        student.setEmail("toni.salloman02@gmail.com");   
		
		Quiz details = new Quiz(2112123, student,75, 100);
		details.setId(21108008);
		details.setTotalScore(100 / 100);


        System.out.println("Student Score: ");
		System.out.println ("Student Name: " + student.getName() + "\n"
			+ "Email: " + student.getEmail() + "\n"
			+ "Id: " + details.getId() + "\n"
			+ "Final Score: " + details.getTotalScore());
        System.out.println();
    
    }
}
