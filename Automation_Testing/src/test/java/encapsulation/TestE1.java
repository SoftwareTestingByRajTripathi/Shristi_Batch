package encapsulation;

public class TestE1 {
	public static void main(String[] args) {
		Account A1 = new Account();
		A1.setAcc_no(11233546);
		A1.setName("Raju");
		A1.setEmail("triapathi123@gmail.com");
		A1.setAmount(500000);
		System.out.println(A1.getAcc_no()+""+A1.getName()+""+A1.getEmail()+" "+A1.getAmount());
	}

}
