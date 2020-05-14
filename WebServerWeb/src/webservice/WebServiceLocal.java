package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.Local;


@WebService
public class WebServiceLocal {
    
	@WebMethod
	public void altaLocal(Local local, List<Accessibilitat> accessibilitat) throws ExceptionController {
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

					String query = "insert into eAccessible.Local (codiTipoLocal, codiCarrer, nomCarrer, nomVia, numero, nomLocal, observacions, verificat) values('"+codiTipoLocal+"','"+codiCarrer+"','"+nomCarrer+"','"+nomVia+"','"+numero+"','"+nomLocal+"','"+observacions+"','"+verificat+"')");
					Statement stm = connection.createStatement();
					stm.executeUpdate(query);

					for(int i=0; i<accessibilitat.size(); i=i+1) {
						stm.executeUpdate("insert into eAccessible.accessibilitat (codiaccessibilitat,codilocal,codicaracteristica,valor,verificat) values('"+accessibilitat.get(i).getCodiaccessibilitat()+"','"+accessibilitat.get(i).getCodilocal()+"','"+accessibilitat.get(i).getCodicaracteristica()+"','"+accessibilitat.get(i).getValor()+"','"+accessibilitat.get(i).getVerificat()+"')");
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
	public void baixaLocal(int codiLocal) throws ExceptionController {
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