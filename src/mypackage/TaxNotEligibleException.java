package mypackage;

public class TaxNotEligibleException extends Exception{
	private static final long serialVersionUID = 1L;

	public TaxNotEligibleException(String s) {
		super(s);
	}

}
