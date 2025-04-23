package lab.student.exception;

public class InsufficientGradeException extends Exception {
	
	public InsufficientGradeException(String errMessage) {
		//받은 에러 메세지를 부모한테 넘겨줌
		super(errMessage);
	}
	

}
