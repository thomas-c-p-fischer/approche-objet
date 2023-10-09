package entities;

public class Credit extends Operation {

	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}

	public String getType() {
		String typeOperationCredit = "CREDIT";
		return typeOperationCredit; 
		
	}
	
	public double montantDebitCredit(double montantOperation) {
		
		return montantOperation + getMontantOperation();
	}
}
