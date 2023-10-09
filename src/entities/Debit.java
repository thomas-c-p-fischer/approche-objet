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

	@Override
	public String toString() {
		return "Debit [" + super.toString() + "]";
	}
	
	public String getType() {
		String typeOperationDebit = "DEBIT";
		return typeOperationDebit;	
	}
	
	public double montantDebit(double montantOperation, String type) {
		if(type == "DEBIT") {
			montantOperation = -Math.abs(montantOperation);
		}
		return montantOperation;
	}
}
