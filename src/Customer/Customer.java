package Customer;
import java.util.*;


public class Customer {
	
	private long id;
	private String customerNameString;
	private String password;
	
	
	//Ctr empty
	public Customer() {
	}
	
	//Ctr full
	public Customer(long id, String customerNameString, String password) {
		super();
		this.id = id;
		this.customerNameString = customerNameString;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerNameString() {
		return customerNameString;
	}

	public void setCustomerNameString(String customerNameString) {
		this.customerNameString = customerNameString;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerNameString=" + customerNameString + ", password=" + password + "]";
	}
	
	

}
