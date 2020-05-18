package webservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import exceptions.ErrorException;
import pojo.Accessibilitat;
import pojo.Caracteristica;
import pojo.CaracteristicaTipoLocal;
import pojo.Local;
import pojo.TipoLocal;

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
                    local.setCodiLocal(codiLocalLliure());
					String query = "insert into eAccessible.local (codilocal, coditipolocal, codicarrer, nomcarrer, nomvia, numero, nomlocal, observacions, verificat) values('"+local.getCodiLocal() +"','"+local.getCodiTipoLocal()+"','"+local.getCodiCarrer()+"','"+local.getNomCarrer()+"','"+local.getNomVia()+"','"+local.getNumero()+"','"+local.getNomLocal()+"','"+local.getObservacions()+"','"+local.getVerificat()+"');";
					Statement stm = connection.createStatement();
					stm.executeUpdate(query);

					for(int i=0; i<accessibilitat.size(); i=i+1) {
						stm.executeUpdate("insert into eAccessible.accessibilitat (codiaccessibilitat,codilocal,codicaracteristica,valor,verificat) values('"+accessibilitat.get(i).getCodiAccessibilitat()+"','"+accessibilitat.get(i).getCodiLocal()+"','"+accessibilitat.get(i).getCodiCaracteristica()+"','"+accessibilitat.get(i).getValor()+"','"+accessibilitat.get(i).getVerificat()+"');");
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
                    connection =  ds.getConnection();
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

    @WebMethod

    public void validaLocal(int codiLocal) throws ErrorException {

        String strEstat = new String();
        Connection connection = null;

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error amb el Datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "update eAccessible.local set verificat='S' where codilocal=" + codiLocal;
                    Statement stm = connection.createStatement();
                    stm.executeUpdate(query);

                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

    @WebMethod
    public List<Local> infoLocalPerNomLocalICodiTipoLocal(String nomLocal, int codiTipoLocal) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        List<Local> localList = new ArrayList<Local>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select coditipolocal,codicarrer,nomcarrer,nomvia,codilocal,nomlocal,numero,observacions,verificat from eAccessible.local where nomlocal LIKE UPPER('%"
                            + nomLocal + "%') AND coditipolocal=" + codiTipoLocal;
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        Local local = new Local();
                        local.setCodiTipoLocal(rs.getInt("coditipolocal"));
                        local.setCodiCarrer(rs.getInt("codicarrer"));
                        local.setNomCarrer(rs.getString("nomcarrer"));
                        local.setNomVia(rs.getString("nomvia"));
                        local.setCodiLocal(rs.getInt("codilocal"));
                        local.setNomLocal(rs.getString("nomlocal"));
                        local.setNumero(rs.getInt("numero"));
                        local.setObservacions(rs.getString("observacions"));
                        local.setVerificat(rs.getString("verificat"));
                        localList.add(local);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return localList;
    }

    @WebMethod
    public Local infoLocalPerCodiLocal(int codiLocal) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        Local local = new Local();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select coditipolocal,codicarrer,nomcarrer,nomvia,codilocal,nomlocal,numero,observacions,verificat from eAccessible.local where codilocal="
                            + codiLocal;
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    rs.next();
                    local.setCodiTipoLocal(rs.getInt("coditipolocal"));
                    local.setCodiCarrer(rs.getInt("codicarrer"));
                    local.setNomCarrer(rs.getString("nomcarrer"));
                    local.setNomVia(rs.getString("nomvia"));
                    local.setCodiLocal(rs.getInt("codilocal"));
                    local.setNomLocal(rs.getString("nomlocal"));
                    local.setNumero(rs.getInt("numero"));
                    local.setObservacions(rs.getString("observacions"));
                    local.setVerificat(rs.getString("verificat"));

                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return local;
    }

    @WebMethod
    public List<Local> infoLocalPerNomLocal(String nomLocal) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        List<Local> localList = new ArrayList<Local>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select coditipolocal,codicarrer,nomcarrer,nomvia,codilocal,nomlocal,numero,observacions,verificat from eAccessible.local where nomlocal LIKE UPPER('%"
                            + nomLocal + "%')";
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        Local local = new Local();
                        local.setCodiTipoLocal(rs.getInt("coditipolocal"));
                        local.setCodiCarrer(rs.getInt("codicarrer"));
                        local.setNomCarrer(rs.getString("nomcarrer"));
                        local.setNomVia(rs.getString("nomvia"));
                        local.setCodiLocal(rs.getInt("codilocal"));
                        local.setNomLocal(rs.getString("nomlocal"));
                        local.setNumero(rs.getInt("numero"));
                        local.setObservacions(rs.getString("observacions"));
                        local.setVerificat(rs.getString("verificat"));
                        localList.add(local);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return localList;
    }

    @WebMethod
    public List<Local> infoLocalPerTipoLocal(int codiTipoLocal) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        List<Local> localList = new ArrayList<Local>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select coditipolocal,codicarrer,nomcarrer,nomvia,codilocal,nomlocal,numero,observacions,verificat from eAccessible.local where coditipolocal="
                            + codiTipoLocal;
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        Local local = new Local();
                        local.setCodiTipoLocal(rs.getInt("coditipolocal"));
                        local.setCodiCarrer(rs.getInt("codicarrer"));
                        local.setNomCarrer(rs.getString("nomcarrer"));
                        local.setNomVia(rs.getString("nomvia"));
                        local.setCodiLocal(rs.getInt("codilocal"));
                        local.setNomLocal(rs.getString("nomlocal"));
                        local.setNumero(rs.getInt("numero"));
                        local.setObservacions(rs.getString("observacions"));
                        local.setVerificat(rs.getString("verificat"));
                        localList.add(local);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return localList;
    }

    @WebMethod
    public List<TipoLocal> cercaTipoLocal() throws ErrorException {

        String strEstat = new String();
        Connection connection = null;

        List<TipoLocal> tipoLocalList = new ArrayList<TipoLocal>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select coditipolocal, nomtipolocalca, nomtipolocales, nomtipolocalen from eAccessible.tipolocal";
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        TipoLocal tipoLocal = new TipoLocal();
                        tipoLocal.setCodiTipoLocal(rs.getInt("coditipolocal"));
                        tipoLocal.setNomTipoLocalCA(rs.getString("nomtipolocalca"));
                        tipoLocal.setNomTipoLocalES(rs.getString("nomtipolocales"));
                        tipoLocal.setNomTipoLocalEN(rs.getString("nomtipolocalen"));

                        tipoLocalList.add(tipoLocal);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return tipoLocalList;
    }

    @WebMethod
    public List<Local> localnoVerificat() throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        List<Local> localList = new ArrayList<Local>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();
                    // IS NULL --> 'N'
                    String query = "select coditipolocal,codicarrer,nomcarrer,nomvia,codilocal,nomlocal,numero,observacions,verificat from eAccessible.local where verificat='N'";
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        Local local = new Local();
                        local.setCodiTipoLocal(rs.getInt("coditipolocal"));
                        local.setCodiCarrer(rs.getInt("codicarrer"));
                        local.setNomCarrer(rs.getString("nomcarrer"));
                        local.setNomVia(rs.getString("nomvia"));
                        local.setCodiLocal(rs.getInt("codilocal"));
                        local.setNomLocal(rs.getString("nomlocal"));
                        local.setNumero(rs.getInt("numero"));
                        local.setObservacions(rs.getString("observacions"));
                        local.setVerificat(rs.getString("verificat"));
                        localList.add(local);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return localList;
    }

    @WebMethod
    public List<Local> localsAccessibles(int codiCaracteristica) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        List<Local> localList = new ArrayList<Local>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select local.* from eAccessible.local, eAccessible.accessibilitat where accessibilitat.codicaracteristica="
                            + codiCaracteristica + " and accessibilitat.codilocal = local.codilocal";
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        Local local = new Local();
                        local.setCodiLocal(rs.getInt("coditipolocal"));
                        local.setCodiCarrer(rs.getInt("codicarrer"));
                        local.setNomCarrer(rs.getString("nomcarrer"));
                        local.setNomVia(rs.getString("nomvia"));
                        local.setCodiLocal(rs.getInt("codilocal"));
                        local.setNomLocal(rs.getString("nomlocal"));
                        local.setNumero(rs.getInt("numero"));
                        local.setObservacions(rs.getString("observacions"));
                        local.setVerificat(rs.getString("verificat"));
                        localList.add(local);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return localList;
    }

    @WebMethod
    public List<CaracteristicaTipoLocal> infoCaracteristicaTipoLocal(int codiTipoLocal) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        List<CaracteristicaTipoLocal> caracteristicaTipoLocalList = new ArrayList<CaracteristicaTipoLocal>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select codicaracteristicatipolocal, codicaracteristica, coditipolocal from eAccessible.caracteristicatipolocal where caracteristicatipolocal.coditipolocal="
                            + codiTipoLocal;
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        CaracteristicaTipoLocal caracteristicaTipoLocal = new CaracteristicaTipoLocal();
                        caracteristicaTipoLocal
                                .setCodicaracteristicatipolocal(rs.getInt("codicaracteristicatipolocal"));
                        caracteristicaTipoLocal.setCodicaracteristica(rs.getInt("codicaracteristica"));
                        caracteristicaTipoLocal.setCoditipolocal(rs.getInt("coditipolocal"));
                        caracteristicaTipoLocalList.add(caracteristicaTipoLocal);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return caracteristicaTipoLocalList;
    }

    @WebMethod
    public Caracteristica infoCaracteristica(int codiCaracteristica) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        Caracteristica caracteristica = new Caracteristica();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select codicaracteristica, nomcaracteristicaca, nomcaracteristicaes, nomcaracteristicaen, tipo, codinivell  from eAccessible.caracteristica where caracteristica.codicaracteristica="
                            + codiCaracteristica;
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    rs.next();

                    caracteristica.setCodiCaracteristica(rs.getInt("codicaracteristica"));
                    caracteristica.setNomCaracteristicaCA(rs.getString("nomcaracteristicaca"));
                    caracteristica.setNomCaracteristicaES(rs.getString("nomcaracteristicaes"));
                    caracteristica.setNomCaracteristicaEN(rs.getString("nomcaracteristicaen"));
                    caracteristica.setTipo(rs.getInt("tipo"));
                    caracteristica.setCodiNivell(rs.getInt("codinivell"));

                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return caracteristica;
    }

    @WebMethod
    public int codiLocalLliure() throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        int lastCodiLocal = 0;

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select MAX(codilocal) codilocal  from eAccessible.local";
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    rs.next();
                    lastCodiLocal = rs.getInt("codilocal");

                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return lastCodiLocal + 1;

    }

    @WebMethod
    public List<Caracteristica> infoCaracteristicaLocal(int codiLocal) throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        List<Caracteristica> caracteristicaValorLlista = new ArrayList<Caracteristica>();

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select accessibilitat.valor valor, caracteristica.nomcaracteristicaca nomcaracteristicaca, accessibilitat.codilocal, accessibilitat.codicaracteristica codicaracteristica from eAccessible.local INNER JOIN eAccessible.accessibilitat ON local.codilocal = accessibilitat.codilocal INNER JOIN eAccessible.caracteristica ON accessibilitat.codicaracteristica = caracteristica.codicaracteristica AND local.codilocal="
                            + codiLocal;
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        Caracteristica caracteristicaValor = new Caracteristica();
                        caracteristicaValor.setNomCaracteristicaCA(rs.getString("nomcaracteristicaca"));
                        caracteristicaValor.setTipo(rs.getInt("valor"));
                        caracteristicaValorLlista.add(caracteristicaValor);
                    }
                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return caracteristicaValorLlista;
    }

    public int codiAccessibilitatLliure() throws ErrorException {
        String strEstat = new String();
        Connection connection = null;

        int lastCodiAccessibilitat = 0;

        try {
            InitialContext cxt = new InitialContext();
            if (cxt != null) {
                DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
                if (ds == null) {
                    strEstat = "Error al crear el datasource";
                    throw new ErrorException(strEstat);
                } else {
                    connection = ds.getConnection();

                    String query = "select MAX(codiAccessibilitat) codiAccessibilitat  from eAccessible.accessibilitat";
                    Statement stm = connection.createStatement();
                    ResultSet rs = stm.executeQuery(query);
                    rs.next();
                    lastCodiAccessibilitat = rs.getInt("codiAccessibilitat");

                    connection.close();
                    stm.close();
                }
            }
        } catch (Exception e) {
            strEstat = "Error amb la base de dades";
            throw new ErrorException(strEstat);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return lastCodiAccessibilitat + 1;
    }

}