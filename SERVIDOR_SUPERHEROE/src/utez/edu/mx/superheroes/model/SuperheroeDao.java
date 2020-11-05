package utez.edu.mx.superheroes.model;

import utez.edu.mx.superheroes.serviciosgenerales.ConexionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuperheroeDao extends ConexionMySQL {

	private final String SQL_CONSULTA_TODOS = "SELECT nombre, poder, debut FROM superheroes";
	private final String SQL_CONSULTA_UNO = "SELECT id, nombre, poder, debut FROM superheroes WHERE nombre = ?";
	private final String SQL_INSERTAR_UNO = "INSERT INTO superheroes VALUES(null,?,?,?)";
	private final String SQL_ELIMINAR_UNO = "DELETE FROM superheroes WHERE nombre = ?";
	private final String SQL_MODIFICAR_UNO = "UPDATE superheroes SET nombre = ?, poder = ?, debut = ? WHERE id = ?";
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;

	public SuperheroeBean[] consultarTodos() {
		List<SuperheroeBean> superheroeBeanList = new ArrayList<>();
		SuperheroeBean[] superheroeBeans = null;
		try {
			pstm = getConexion().prepareStatement(SQL_CONSULTA_TODOS);
			rs = pstm.executeQuery();
			while (rs.next())
				superheroeBeanList.add(new SuperheroeBean(rs.getString("nombre"), rs.getString("poder"), rs.getString("debut")));
			superheroeBeans = new SuperheroeBean[superheroeBeanList.size()];
			int i = 0;
			for (SuperheroeBean h : superheroeBeanList)
				superheroeBeans[i++] = h;
		} catch (Exception e) {
			System.out.println("HUBO UN ERROR");
		}
		return superheroeBeans;
	}

	public SuperheroeBean consultarUno(String nombre) {
		SuperheroeBean superheroeBean = new SuperheroeBean();
		try {
			pstm = getConexion().prepareStatement(SQL_CONSULTA_UNO);
			pstm.setString(1, nombre);
			rs = pstm.executeQuery();
			if (rs.next()) {
				superheroeBean.setId(rs.getInt("id"));
				superheroeBean.setNombre(rs.getString("nombre"));
				superheroeBean.setPoder(rs.getString("poder"));
				superheroeBean.setDebut(rs.getString("debut"));
			}
		} catch (Exception e) {
			System.out.println("HUBO UN ERROR");
		}
		return superheroeBean;
	}

	public boolean insertar(SuperheroeBean bean)  {
		boolean loHizo = false;
		try{
			pstm = getConexion().prepareStatement(SQL_INSERTAR_UNO);
			pstm.setString(1,bean.getNombre());
			pstm.setString(2,bean.getPoder());
			pstm.setString(3,bean.getDebut());
			if(pstm.executeUpdate()==1)
				loHizo =  true;
		}catch (Exception e){
			System.out.println("HUBO UN ERROR");
		}
		return loHizo;
	}

	public boolean elimiar(String nombre)  {
		boolean loHizo = false;
		try{
			pstm = getConexion().prepareStatement(SQL_ELIMINAR_UNO);
			pstm.setString(1,nombre);
			if(pstm.executeUpdate() == 1)loHizo = true;
		}catch (Exception e){
			System.out.println("HUBO UN ERROR");
		}
		return loHizo;
	}

	public boolean modificar(SuperheroeBean bean)  {
		boolean loHizo = false;
		try{
			pstm = getConexion().prepareStatement(SQL_MODIFICAR_UNO);
			pstm.setString(1,bean.getNombre());
			pstm.setString(2, bean.getPoder());
			pstm.setString(3, bean.getDebut());
			pstm.setInt(4, bean.getId());
			if(pstm.executeUpdate()==1){
				loHizo = true;
			}
		}catch (Exception e){
			System.out.println("HUBO UN ERROR");
		}
		return loHizo;
	}

}
