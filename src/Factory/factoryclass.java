package Factory;

import org.testng.annotations.Factory;

public class factoryclass {
	@Factory
	public  Object[] createinstance() {
	/*
		return new Object[] {
			new fclass("user1"),
			new fclass("user2"),
			new fclass("user3"),  */
		Object[] obj = {new fclass("user1"),
				new fclass("user2"),
				new fclass("user3")
				};
		return obj;
	}

}
