package hi;

public class UnderAgeException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4554479932935169519L;

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too Young");
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
	}

	
	
}
