package entities;

public class Debit extends Operation {

	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		String typeOperationDebit = "DEBIT";
		return typeOperationDebit;	
	}
	
	public double montantDebitCredit(double montantOperation) {
		return montantOperation - getMontantOperation();
	}
}
