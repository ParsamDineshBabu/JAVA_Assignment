package dinesh;
import java.util.Comparator;
import java.util.TreeSet;
public class Account {

		int ID;
		int Balance;
		String Name;
		String Salary;

		Account(int iD, int balance, String name, String salary) {
			super();
			ID = iD;
			Balance = balance;
			Name = name;
			Salary = salary;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public int getBalance() {
			return Balance;
		}

		public void setBalance(int balance) {
			Balance = balance;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getSalary() {
			return Salary;
		}

		public void setSalary(String salary) {
			Salary = salary;
		}

		@Override
		public String toString() {
			return "Account [ID=" + ID + ", Balance=" + Balance + ", Name=" + Name + ", Salary=" + Salary + "]";
		}

		void WithDraw() {
		}
     void Deposit() {

		}

	}

	class Bankacc {

		public static void main(String[] args) {

			Account a1 = new Account(2122, 10000, "Dinesh", "Salray");

			Account a2 = new Account(2123, 5000, "Babu", "Salray");

			Account a3 = new Account(2124, 20000, "Chinna", "Salray");

			Account a4 = new Account(2125, 50, "Sai", "Salray");

			TreeSet<Account> n= new TreeSet<Account>(new MyComparator());

			n.add(a1);
			n.add(a2);
			n.add(a3);
			n.add(a4);

			System.out.println(n);

		}

	}

	class MyComparator implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2) {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;

			if (i1 > i2) {

				return -1;
			} 
			else if (i1 < i2) {
				return 1;

			} else if (i1 == i2) {

			}
			return i1;
		}
	}
	

