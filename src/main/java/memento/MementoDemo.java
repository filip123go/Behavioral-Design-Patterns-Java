package memento;

public class MementoDemo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();

		Employee emp = new Employee();

		emp.setName("John Wick");
		emp.setAddress("111 Main Street");
		emp.setPhone("210721010");

		System.out.println("Employee before save                    ----------" +emp);

		caretaker.save(emp);

		emp.setPhone("444555666");

		caretaker.save(emp);
		System.out.println("Employee after change phone number save ----------" +emp);

		emp.setPhone("111111111"); // no save!
		caretaker.revert(emp);

		System.out.println("Reverts to last save point               ---------"+emp);
		caretaker.revert(emp);

		System.out.println("Reverts to original                      ---------"+emp);
	}
}
