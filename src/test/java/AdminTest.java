import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.codewithpavi.gocheetacabservicesystem.model.Customer;
import com.codewithpavi.gocheetacabservicesystem.service.CustomerService;

class AdminTest {

	@Test
	void testGetCustomer() throws ClassNotFoundException, SQLException {
		
		CustomerService as = new CustomerService();
		
		Assertions.assertNotNull(as.getCustomerByID(1));
	}
	
	@Test
	void testAddCustomer() throws ClassNotFoundException, SQLException {
		CustomerService as = new CustomerService();
        Customer customer = new Customer();
        
        customer.setfName("testName");
        customer.setlName("testName");
        customer.setContact("827123");
        customer.setPassword("testpassword");
        customer.setEmail("testemail");
        
        boolean expected = true;
        boolean actual =  as.addCustomer(customer);

        assertEquals(expected, actual ,"Customer added");

	}
	
	@Test
	void testDeleteCustomer() throws ClassNotFoundException, SQLException {
		
		CustomerService as = new CustomerService();
		
		Assertions.assertNotNull(as.deleteCustomer(3));
	}
	
	

}
