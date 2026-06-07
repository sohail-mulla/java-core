package inheritancepractical;

public class GoogleAuth implements Authentication {

	@Override
	public void login(String userName, String password) {

		if (userName.equals("rahul@gmail.com") && password.equals("Rahul@123")) {

			System.out.println("Google Auth User Login SuccessFully... !");

		} else {
			System.out.println("Invalid Credentials ... !");
		}
	}

	@Override
	public void logout() {

		System.out.println("Google Logout ...!");
	}

}
