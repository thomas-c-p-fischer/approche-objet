package entities;

public abstract class Operation {
	protected String dateOperation;
	protected double montantOperation;
	
	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Operation(String dateOperation, double montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	@Override
	public String toString() {
		return "Operation [type= " + getType() + ", dateOperation= " + dateOperation + ", montantOperation= " + montantOperation + "]";
	}
	
	public abstract String getType();
	
	public abstract double montantDebitCredit(double montantOperation);
	
	/**
	 * @return the dateOperation
	 */
	public String getDateOperation() {
		return dateOperation;
	}
	
	/**
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	
	/**
	 * @return the montantOperation
	 */
	public double getMontantOperation() {
		return montantOperation;
	}
	/**
	 * @param montantOperation the montantOperation to set
	 */
	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
}
