package model.exceptions;

public class DomainException extends Exception {
	/*pode ser extens�o da classe Exception ou RuntimeException a diferen�a �:
	 * -RuntimeException o compilador n�o obriga a tratar
	 * -Exception o compilador obriga a tratar*/
	
	private static final long serialVersionUID = 1L;//numero de id para trafegar em rede
	
	public DomainException(String msg) {
		super(msg);
	}

	
	
	
	
	

}
