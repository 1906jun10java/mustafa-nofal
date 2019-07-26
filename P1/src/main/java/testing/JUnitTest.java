package testing;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.revature.beans.Users;
import com.revature.daoimpl.UsersDAOImpl;



public class JUnitTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	UsersDAOImpl udi = new UsersDAOImpl();
	
	@Test
	public void nonNumberReturnsFalse() {
		assertTrue(UsersDAOImpl.getUser(null, null));
	}

	private void assertTrue(Users user) {
		// TODO Auto-generated method stub
		
	}

}
