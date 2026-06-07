package inheritancepractical;

public class MainAuth { // very important practical concept of data abstraction here 

	public static void main(String[] args) {
		System.out.println("Application is started... !");

		GoogleAuth ga = new GoogleAuth();
		ga.login("rahul@gmail.com", "Rahul@123"); // <-----click on the login method and see where it lands you. To the
													// actual code.
		ga.logout();

		InstagramAuth a = new InstagramAuth();
		a.login("om@gmail.com", "om@123");
		a.logout();

		Authentication auth; // this part here is same as Authentication auth = new GoogleAuth();

		auth = new GoogleAuth();
		auth.login("rahul@gmail.com", "Rahul@123"); // <-----click on the login method and see where it lands you now.
		auth.logout();

		System.out.println("-----------------------");

		auth = new InstagramAuth();
		auth.login("om@gmail.com", "om@123");
		auth.logout();

	}

}
