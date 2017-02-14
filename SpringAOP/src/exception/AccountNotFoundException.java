package exception;

public class AccountNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ACCOUNT DIDN'T MATCH";
	}
}
