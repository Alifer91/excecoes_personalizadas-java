package model.exceptions;

public class DomainException extends Exception {
	/*pode ser extensão da classe Exception ou RuntimeException a diferença é:
	 * -RuntimeException o compilador não obriga a tratar
	 * -Exception o compilador obriga a tratar*/
	
	private static final long serialVersionUID = 1L;//numero de id para trafegar em rede
	
	public DomainException(String msg) {
		super(msg);
	}

	
	
	
	
	

}
