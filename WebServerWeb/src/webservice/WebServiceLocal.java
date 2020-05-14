package webservice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import pojo.Accessibilitat;
import pojo.Local;
import Exceptions.ErrorException;


@WebService
public class WebServiceLocal {
    
	@WebMethod
	public void altaLocal(Local local, List<Accessibilitat> accessibilitat) throws ErrorException {
		String strEstat = new String();
		Connection connection = null;

		try{
			InitialContext cxt = new InitialContext();
			if ( cxt != null ){
				DataSource ds = (DataSource) cxt.lookup( "java:jboss/PostgreSQL/eAccessible");
				if ( ds == null ) {
					strEstat = "Error al crear el datasource";
					throw new ErrorException(strEstat);
				}
				else{
					connection = ds.getConnection();

					String query = "insert into eAccessible.Local (codiTipoLocal, codiCarrer, nomCarrer, nomVia, numero, nomLocal, observacions, verificat) values('"+local.getCodiTipoLocal()+"','"+local.getCodiCarrer()+"','"+local.getNomCarrer()+"','"+local.getNomVia()+"','"+local.getNumero()+"','"+local.getNomLocal()+"','"+local.getObservacions()+"','"+local.getVerificat()+"')";
					Statement stm = connection.createStatement();
					stm.executeUpdate(query);

					for(int i=0; i<accessibilitat.size(); i=i+1) {
						stm.executeUpdate("insert into eAccessible.accessibilitat (codiaccessibilitat,codilocal,codicaracteristica,valor,verificat) values('"+accessibilitat.get(i).getCodiAccessibilitat()+"','"+accessibilitat.get(i).getCodiLocal()+"','"+accessibilitat.get(i).getCodiCaracteristica()+"','"+accessibilitat.get(i).getValor()+"','"+accessibilitat.get(i).getVerificat()+"')");
					}

					connection.close();
					stm.close();
				}
			}
		}
		catch(Exception e) {
			strEstat = "Error amb la bdd";
			throw new ErrorException(strEstat);

		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@WebMethod
	public void baixaLocal(int codiLocal) throws ErrorException {
		String strEstat = new String();
		Connection connection = null;

		try {
			InitialContext cxt = new InitialContext();
			if (cxt != null) {
				DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
				if (ds == null) {
					strEstat = "Error al crear el datasource";
					throw new ErrorException(strEstat);

				} else {
					connection = ds.getConnection();
					String query = "delete from eAccessible.accessibilitat where codilocal=" + codiLocal;
					Statement stm = connection.createStatement();
					stm.executeUpdate(query);

					query = "delete from eAccessible.local where codilocal=" + codiLocal;
					stm.executeUpdate(query);

					connection.close();
					stm.close();
				}
			}
		} catch (Exception e) {
			strEstat = "Error amb la bdd";
			throw new ErrorException(strEstat);

		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}