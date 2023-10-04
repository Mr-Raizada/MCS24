interface Calculate {
	double calculateInterest();
}

class SavingAccount implements Calculate {
	int Ac_no;
	int Amount;
	double Rate_of_Int;
	int time;

	SavingAccount(int a, double b, int c, int d) {
		Ac_no = a;
		Rate_of_Int = b;
		time = c;
		Amount = d;
	}

	void DisplayInt() {
		System.out.print("Interest for Account No " + Ac_no + " is Rs " + calculateInterest());
	}

	public double calculateInterest() {
		return (Amount * Rate_of_Int * time / 100);

		// As long as the calculateInterest() method is defined in the class (as it is),
		// it can be called from other methods within the same class, regardless of the
		// order of declaration.
	}
}

public class TestIterface {
	public static void main(String args[]) {
		SavingAccount S = new SavingAccount(1010, 4.5, 5, 5000);
		S.DisplayInt();
	}
}
