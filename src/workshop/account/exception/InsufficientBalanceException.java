package workshop.account.exception;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException(String errMessage) {
		//받은 에러 메세지를 부모한테 넘겨줌
		super(errMessage);
	}
}
