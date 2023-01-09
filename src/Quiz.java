public class Quiz extends Student
 {
	
    private int id;
	private Student student;
	private int totalScore;
	private int maxScore;
	
    public Quiz(int id, Student student, int totalScore, int maxScore){
		
	    this.id = id;
        this.student = null;
        this.totalScore = 80;
		this.maxScore = 100;
    }
	public double grade(){
		totalScore = totalScore / maxScore;	
		return totalScore;
	}
	public int getTotalScore(){
		return totalScore;
	}
	
	public int getId() {
        return id;
	}
	
    public String getOwnerName() {
        return student.getName();
    }

    public void setOwner(Student Owner) {
       student  = Owner;
    }
	
	public void setId(int code) {
        id = code;
	}
	public void setTotalScore(int score){
		totalScore = score;
	}
}
  
    
