public class MailItem
{
	//La direccion del remitente
	private String from;
	//La dirección del receptor
	private String to;
	//El cuerpo del mensaje de email
	private String message;


	/**
	 * Crea un objeto MailItem inicializando sus atributos
	 * a los valores dados como parametros
	 */
	public MailItem(String de, String para, String mensaje)
	{
		from = de;
		to = para;
		message = mensaje;
	}
	
	/**
	 * Devuelve la direccion el remitente
	 */
	public String getFrom(){
		return from;

	}
	
	/**
	 * Devuelve la dirección del receptor
	 */
	public String getTo(){
		return to;
	}
	
	/**
	 * Devuelve el cuerpo del mensaje
	 */
	public String getMessage() {	

		return message;
	}

	/**
	 * Imprime por pantalla el remitente, el receptor y el
	 * cuerpo del email
	 */
	public void print()
	{
		System.out.println ("De: " + from);
		System.out.println ("Para: " + to);
		System.out.println ("Mensaje: " + message);
	}

	
}








