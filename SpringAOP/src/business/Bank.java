package business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import exception.AccountNotFoundException;

public class Bank {

	private int amount = 5000;
	private String account="sbi123";
	Log l = LogFactory.getLog(Bank.class);
	
	public int deposite(int amount,String account){
		l.info("executing the Business Code : deposite method");
		if(this.account.equals(account)){
			this.amount+=amount;
			return this.amount;
		}else{
			throw new AccountNotFoundException();
		}
	}
	
	public int findBalance(int amount,String account){
		l.info("executing the Business Code : findBalance method");
		if(this.account.equals(account)){
			this.amount+=amount;
			return this.amount;
		}else{
			throw new AccountNotFoundException();
		}
	}
	
}
