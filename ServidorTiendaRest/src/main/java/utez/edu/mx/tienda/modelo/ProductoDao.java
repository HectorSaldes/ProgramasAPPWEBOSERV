package utez.edu.mx.tienda.modelo;

import utez.edu.mx.tienda.servicios.generales.ConexionMySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao extends ConexionMySQL {

	private PreparedStatement pstm;
	private ResultSet rs;

	private final String SQL_INSERTAR_PRODUCTO = "INSERT INTO producto VALUES(null,?,?,?,?)";
	private final String SQL_MODIFICAR_PRODUCTO = "UPDATE producto SET nombre = ?, descripcion = ?, precio = ?, existencia = ? WHERE idProducto = ?";
	private final String SQL_ELIMINAR_PRODUCTO = "DELETE FROM producto WHERE id = ?";
	private final String SQL_CONSULTAR_PRODUCTO_POR_NOMBRE = "SELECT * FROM producto WHERE nombre = ?";
	private final String SQL_CONSULTAR_PRODUCTOS = "SELECT * FROM producto";

	public boolean eliminarProducto(int idProducto) {
		boolean resultado = false;
		try {
			pstm = crearConexion().prepareStatement(SQL_ELIMINAR_PRODUCTO);
			pstm.setInt(1, idProducto);
			resultado = pstm.executeUpdate() == 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public List<ProductoBean> consultarProductos() {
		List<ProductoBean> lista = new ArrayList<>();
		try {
			pstm = crearConexion().prepareStatement(SQL_CONSULTAR_PRODUCTOS);
			rs = pstm.executeQuery();
			while (rs.next()) {
				lista.add(new ProductoBean(rs.getInt("idProducto"),
						rs.getString("nombre"),
						rs.getString("descripcion"),
						rs.getDouble("precio"),
						rs.getInt("existencia")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public ProductoBean consultarProductoNombre(String nombre) {
		ProductoBean productoBean = null;
		try  {
			pstm = crearConexion().prepareStatement(SQL_CONSULTAR_PRODUCTO_POR_NOMBRE);
			pstm.setString(1, nombre);
			rs = pstm.executeQuery();
			if (rs.next()) {
				productoBean = new ProductoBean(rs.getInt("idProducto"),
						rs.getString("nombre"),
						rs.getString("descripcion"),
						rs.getDouble("precio"),
						rs.getInt("existencia"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productoBean;
	}

	public boolean insertarProducto(ProductoBean productoBean) {
		boolean resultado = false;
		try  {
			pstm = crearConexion().prepareStatement(SQL_INSERTAR_PRODUCTO);
			pstm.setString(1, productoBean.getNombre());
			pstm.setString(2, productoBean.getDescripcion());
			pstm.setDouble(3, productoBean.getPrecio());
			pstm.setInt(4, productoBean.getExistencia());
			resultado = pstm.executeUpdate() == 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public boolean modificarProducto(ProductoBean productoBean) {
		boolean resultado = false;
		try  {
			pstm = crearConexion().prepareStatement(SQL_MODIFICAR_PRODUCTO);
			pstm.setString(1, productoBean.getNombre());
			pstm.setString(2, productoBean.getDescripcion());
			pstm.setDouble(3, productoBean.getPrecio());
			pstm.setInt(4, productoBean.getExistencia());
			pstm.setInt(5, productoBean.getIdP());
			resultado = pstm.executeUpdate() == 1 ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
