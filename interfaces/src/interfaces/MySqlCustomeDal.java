package interfaces;

public class MySqlCustomeDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("MySql ile eklendi");
		
	}

}
