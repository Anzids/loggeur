package Loggeur;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trace implements Logg {

	private Date date;
	private DateFormat dateFormat;
	private static Trace instance = null;
	private File logFile;

	/**
	 * Initialisation des dates de Trace
	 */
	private Trace() {
		this.date = new Date();
		this.dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	}

	/**
	 * @return instance de Trace
	 */
	public static Trace getInstance() {
		if (instance == null) {
			instance = new Trace();
		}
		return instance;
	}

	/**
	 * On a l'affichage dans la console, ou dans le fichier selon l'erreur
	 */

	public String afficherError(Object message, int niveau, String chemin, String Consl, String File)
			throws IOException {
		// TODO Auto-generated method stub
		String messageFinal = "";
		if (niveau <= 6) {
			messageFinal = "[" + this.dateFormat.format(this.date) + "]" + " (class Trace) : <" + message + ">\n";

			// System.out.println(messageFinal);

			File dir = new File("Fichiers-Loggeur");
			if (!dir.exists()) {
				dir.mkdir();
			}
			if (File.equals("TRUE")) {
				logFile = new File("./Fichiers-Loggeur/" + chemin);
			}

			try {
				if (File.equals("TRUE")) {
					ecrireMessage(messageFinal);
				}
			} catch (java.lang.Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Consl.equals("TRUE")) {

				System.out.println(messageFinal);
			}

		}
		return messageFinal;
	}

	@Override
	/**
	 * On a l'affichage dans la console, ou dans le fichier selon l'erreur
	 */
	public void afficherError(String message, int niveau, String[] Data) throws IOException {
		// TODO Auto-generated method stub
		if (niveau <= 6) {
			String messageFinal = "[" + this.dateFormat.format(this.date) + "]" + " (class Trace) : <" + message
					+ ">\n";

			// System.out.println(messageFinal);

			File dir = new File("Fichiers-Loggeur");
			if (!dir.exists()) {
				dir.mkdir();
			}
			if (Data[2].equals("TRUE")) {
				logFile = new File("./Fichiers-Loggeur/" + Data[0]);
			}

			try {
				if (Data[2].equals("TRUE")) {
					ecrireMessage(messageFinal);
				}
			} catch (java.lang.Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Data[1].equals("TRUE")) {

				System.out.println(messageFinal);
			}

		}
	}

	/**
	 * On va écrire le message dans le fichier
	 * 
	 * @param message
	 * @throws IOException
	 */
	public void ecrireMessage(String message) throws IOException {
		BufferedWriter writer = null;

		try {

			writer = new BufferedWriter(new FileWriter(logFile, true));
			writer.write(message + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
			}
		}

	}

}
