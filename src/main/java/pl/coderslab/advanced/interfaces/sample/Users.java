package pl.coderslab.advanced.interfaces.sample;

public class Users {
	public static void main(String[] args) {
		CodersLabUser codersLabUser = new CodersLabUser();
		LibraryUser libraryUser = new LibraryUser();

		System.out.println("Id: " + codersLabUser.getId());
		System.out.println("AdminId: " + codersLabUser.getAdminId());

		System.out.println("Id: " + libraryUser.getId());
		System.out.println("AdminId: " + libraryUser.getAdminId());
	}
}