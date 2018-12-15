package Loggeur;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class LogeurFactory {

	private File logFile;
	private InputStream inputStream;
	private String result = "";
	private String fich;
	private String cons;
	private int niveau;
	private String chemin;
	private static LogeurFactory instance = null;

	/**
	 * On initialise tout les donnÃ©es possible a l'aide de fichier Conf.properties
	 * On rÃ©cupÃ¨re le chemin, si on doit Ã©crire dans la console, Ã©crire dans un
	 * fichier et le niveau
	 * 
	 * @throws IOException
	 */
	private LogeurFactory() throws IOException {
		String file = "TRUE";
		String console = "TRUE";
		this.chemin = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		this.chemin = "Log-" + this.chemin;
		String nivel = "DEBUG";

		try {
			Properties prop = new Properties();
			String propFileName = "conf.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			// get the property value and print it out
			this.chemin = prop.getProperty("FILE.PATH");
			console = prop.getProperty("CONSOLE.ACTIVE");
			file = prop.getProperty("FILE.ACTIVE");
			nivel = prop.getProperty("MIN_LVL");

			this.fich = file;
			System.out.println(file);
			this.cons = console;
			System.out.println(this.cons);

			this.result = "On a l'écriture en fichier: " + file + " en console: " + console;
			System.out.println(this.result);
		} catch (IOException e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		if (file.equals("TRUE")) {
			if (file.equals("FALSE")) {
				System.out.println(
						"Vous avez mal orthographiée FALSE ou TRUE, on a donc initialisée en TRUE " + this.fich);
				this.fich = "TRUE";
			}
		}

		if (console.equals("TRUE")) {
			if (console.equals("FALSE")) {
				System.out
						.println("Vous avez mal orthographiée FALSE ou TRUE en console, on a donc initialisée en TRUE "
								+ this.cons);
				this.cons = "TRUE";
			}
		}

		if (nivel.equals("DEBUG")) {
			this.niveau = 2;
		} else {
			if (nivel.equals("INFO")) {
				this.niveau = 3;
			} else {
				if (nivel.equals("ERROR")) {
					this.niveau = 5;
				} else {
					if (nivel.equals("WARN")) {
						this.niveau = 4;
					} else {
						if (nivel.equals("FATAL")) {
							this.niveau = 6;
						} else {
							if (nivel.equals("TRACE")) {
								this.niveau = 1;
							} else {
								System.out.println("Error dans la syntaxe, par conséquent  on a initialisée en debug");
								this.niveau = 1;
							}
						}
					}

				}

			}
		}

	}

	public static LogeurFactory getInstance() throws IOException {
		if (instance == null) {
			instance = new LogeurFactory();
		}
		return instance;
	}

	/**
	 * @return le nom du fichier
	 */
	public String getChemin() {
		return this.chemin;
	}

	/**
	 * @return si on veux ou on Ã©crire dans la console
	 */
	public String getConsol() {
		return this.cons;
	}

	/**
	 * @return si on veux ou on Ã©crire dans le fichier
	 */
	public String getFile() {
		return this.fich;
	}

	/**
	 * On crÃ©e un tableau contenant les 3 information du fichier conf.properties:
	 * chemin, Ã©crire dans le fichier, Ã©crire dans la console
	 * 
	 * @return le tableau
	 */
	public String[] getData() {
		String[] array = new String[] { this.chemin, this.cons, this.fich };
		return array;
	}

	/*
	 * public void setniveau(int i){ this.niveau=i; }
	 */

	/**
	 * @return le niveau
	 */
	public int getniveau() {
		return this.niveau;
	}

	/**
	 * On regarde si notre valeur correspond a un niveau existant
	 * 
	 * @param message
	 * @return Niveau
	 */
	public Logg getErreur(Object message) {
		if (message == null) {
			return null;
		}
		if (((String) message).equalsIgnoreCase("Debug")) {
			Debug deg = Debug.getInstance();
			return deg;

		} else if (((String) message).equalsIgnoreCase("Info")) {
			Info inf = Info.getInstance();
			return inf;

		} else if (((String) message).equalsIgnoreCase("Error")) {
			Error erreur = Error.getInstance();
			return erreur;
		} else if (((String) message).equalsIgnoreCase("Warn")) {
			Warn warng = Warn.getInstance();
			return warng;
		} else if (((String) message).equalsIgnoreCase("Fatal")) {
			Fatal fatal = Fatal.getInstance();
			return fatal;
		} else if (((String) message).equalsIgnoreCase("Trace")) {
			Trace trace = Trace.getInstance();
			return trace;
		} else if (((String) message).equalsIgnoreCase("Exception")) {
			Exception exp = Exception.getInstance();
			return exp;
		}

		return null;
	}

	public String getNameFile() {
		String name = "./Fichiers-Loggeur/" + this.chemin;
		return name;
	}

}
