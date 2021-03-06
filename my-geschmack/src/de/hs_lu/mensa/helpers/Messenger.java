package de.hs_lu.mensa.helpers;

/**
 * Der Messenger ist die Klasse die den User/den Gast über die Aktionen der Controllers benachrichtigt.
 * Deshalb wird er für den Response Handling eingesetzt und sollte immer in der Session verfügbar sein.
 * @see SessionManager 
 * @author loicy
 *
 */
public class Messenger {
	private String message;
	
	public final static String LOGIN_FAILED = "Die Kombination aus User und Passwort stimmt nicht";
	public final static String LOGOUT_SUCCESS = "Sie wurden erfolgreich abgemeldet";
	public final static String CREATE_USER_OK = "Der User wurde erfolgreich registriert";
	public final static String UPDATE_OK = "Der User wurde erfolgreich geupdatet";
	public final static String UPDATE_FAILED = "Der Update wurde verweigert";
	public final static String CREATE_MEAL_OK = "Die Speise wurde erfolgreich registriert";
	public final static String DELETE_MEAL_OK = "Die Speise wurde erfolgreich gelöscht";
	public final static String THANKS_FOR_EVAL = "Vielen Dank für Ihre Bewertung";
	public final static String ERROR = "Unsere Dienste sind leider zurzeit nicht verfügbar";
	public final static String SAVE_MEALPLAN_OK = "Die Speise wurde erfolgreich an dem Tag gespeichert";
	public final static String SEARCH_FAILED = "Keine Speise entsprach leider ihrer Suche";
	public final static String MONGO_ERROR = "Leider konnten wir die zur Verbindung Datenbank nicht herstellen";
	public final static String EVAL_ERROR = "Keine Speise wurde ausgewählt";
	public final static String DATE_ERROR = "Kein Datum angegeben oder nicht gültig";
	

	public Messenger(){
		super();
	}
	
	public Messenger(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 

}
