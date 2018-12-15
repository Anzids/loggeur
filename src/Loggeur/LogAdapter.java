package Loggeur;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;

 
public class LogAdapter implements Log {

	public LogAdapter(String chaine) {

	}

	private LogeurFactory LogFactoryy = null;

	@Override
	public void debug(Object message) {
		// TODO Auto-generated method stub
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Debug");
		try {
			dg1.afficherError(message, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void debug(Object message, Throwable t) {
		// TODO Auto-generated method stub
		Object messageFinal = "Message: " + message + "Throwable: " + t.getMessage();
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Debug");
		try {
			dg1.afficherError(messageFinal, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void error(Object message) {
		// TODO Auto-generated method stub
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Error");
		try {
			dg1.afficherError(message, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void error(Object message, Throwable t) {
		// TODO Auto-generated method stub
		Object messageFinal = "Message: " + message + "Throwable: " + t.getMessage();
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Error");
		try {
			dg1.afficherError(messageFinal, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fatal(Object message) {
		// TODO Auto-generated method stub
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Fatal");
		try {
			dg1.afficherError(message, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fatal(Object message, Throwable t) {
		// TODO Auto-generated method stub
		Object messageFinal = "Message: " + message + "Throwable: " + t.getMessage();
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Fatal");
		try {
			dg1.afficherError(messageFinal, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void info(Object message) {
		// TODO Auto-generated method stub
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Info");
		try {
			dg1.afficherError(message, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void info(Object message, Throwable t) {
		// TODO Auto-generated method stub
		Object messageFinal = "Message: " + message + "Throwable: " + t.getMessage();
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Info");
		try {
			dg1.afficherError(messageFinal, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return this.LogFactoryy.getniveau() <= 2;
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return this.LogFactoryy.getniveau() <= 5;
	}

	@Override
	public boolean isFatalEnabled() {
		// TODO Auto-generated method stub
		return this.LogFactoryy.getniveau() <= 6;
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return this.LogFactoryy.getniveau() <= 3;
	}

	@Override
	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return this.LogFactoryy.getniveau() <= 1;
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return this.LogFactoryy.getniveau() <= 4;
	}

	@Override
	public void trace(Object message) {
		// TODO Auto-generated method stub
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Trace");
		try {
			dg1.afficherError(message, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void trace(Object message, Throwable t) {
		// TODO Auto-generated method stub
		Object messageFinal = "Message: " + message + "Throwable: " + t.getMessage();
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Trace");
		try {
			dg1.afficherError(messageFinal, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void warn(Object message) {
		// TODO Auto-generated method stub
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Warn");
		try {
			dg1.afficherError(message, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void warn(Object message, Throwable t) {
		// TODO Auto-generated method stub
		Object messageFinal = "Message: " + message + "Throwable: " + t.getMessage();
		try {
			this.LogFactoryy = LogeurFactory.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Logg dg1 = this.LogFactoryy.getErreur("Warn");
		try {
			dg1.afficherError(message, this.LogFactoryy.getniveau(), this.LogFactoryy.getChemin(),
					this.LogFactoryy.getConsol(), this.LogFactoryy.getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
