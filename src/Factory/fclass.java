package Factory;

import org.testng.annotations.Test;

public class fclass {
	private String username;
	public fclass(String username) {
		this.username =username;
	}
	
	@Test
	public void testLogin() {
		System.out.println("Username is " +username);
	}

}
