package banque;

import entities.Credit;
import entities.Debit;
import entities.Operation;

public class TestOperationExecutable {

	public static void main(String[] args) {
		
		Operation[] operations = new Operation[4];
		int tailleTableau = operations.length;
		
		String dateOpDebit1 = "06/07/23";
		double montantOpDebit1 = 15.2;
		operations[0] = new Debit(dateOpDebit1, montantOpDebit1);
		
		String dateOpCredit1 = "26/04/23";
		double montantOpCredit1 = 30.0;
		operations[1] = new Credit(dateOpCredit1, montantOpCredit1);
		
		String dateOpDebit2 = "01/08/22";
		double montantOpDebit2 = 105.22;
		operations[2] = new Debit(dateOpDebit2, montantOpDebit2);
		
		String dateOpCredit2 = "22/06/23";
		double montantOpCredit2 = 48.03;
		operations[3] = new Credit(dateOpCredit2, montantOpCredit2);

		double montantTotalDesOperations = 0;
		for (Operation operation : operations) {
			montantTotalDesOperations = operation.montantDebitCredit(montantTotalDesOperations);
			System.out.println(operation);
		}
		System.out.println("Le montant total des Operations est de : " + montantTotalDesOperations + "€.");
	}

}
