package inheritancepractical;

public class InstagramAuth implements Authentication {

	@Override
	public void login(String userName, String password) {
		if (userName.equals("om@gmail.com") && password.equals("om@123")) {
			System.out.println("Instagram User Login Success... !");
		} else {
			System.out.println("Invalid Credentials ... !");
		}
	}

	@Override
	public void logout() {
		System.out.println("Logout Instagram ... Acc   ! ");

	}

}