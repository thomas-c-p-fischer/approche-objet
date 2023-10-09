package entities;

public class Credit extends Operation {

	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}

	@Override
	public String toString() {
		return "Credit [" + super.toString() + "]";
	}
	
	public String getType() {
		String typeOperationCredit = "CREDIT";
		return typeOperationCredit; 
		
	}
	
	public double montantDebit(double montantOperation, String type) {
		if(type == "DEBIT") {
			montantOperation = -Math.abs(montantOperation);
		}
		return montantOperation;
	}
}
