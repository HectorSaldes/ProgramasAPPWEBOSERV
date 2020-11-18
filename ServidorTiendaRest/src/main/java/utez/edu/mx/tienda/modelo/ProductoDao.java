package utez.edu.mx.tienda.modelo;

import utez.edu.mx.tienda.servicios.generales.ConexionMySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao extends ConexionMySQL {

	private PreparedStatement pstm;
	private ResultSet rs;
	private final String SQL_INSERTAR_PRODUCTO = "INSERT INTO producto VALUES(null,?,?,?,?)";
	private final String SQL_MODIFICAR_PRODUCTO = "UPDATE producto SET nombre = ?, descripcion = ?, precio = ?, existencia = ? WHERE idproducto = ?";
	private final String SQL_ELIMINAR_PRODUCTO = "DELETE FROM producto WHERE idproducto = ?";
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
		}finally {
			try {
				rs.close();
				pstm.close();
				crearConexion().close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
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
		}finally {
			try {
				rs.close();
				pstm.close();
				crearConexion().close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
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
		}finally {
			try {
				rs.close();
				pstm.close();
				crearConexion().close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
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
		}finally {
			try {
				rs.close();
				pstm.close();
				crearConexion().close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
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
		}finally {
			try {
				rs.close();
				pstm.close();
				crearConexion().close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
		return resultado;
	}

	public List<ProductoBean> consultarProductoCoincidencia(String coincidencia) {
		List<ProductoBean> productos = new ArrayList<>();
		try  {
			pstm = crearConexion().prepareStatement("SELECT * FROM producto where nombre like '%"+coincidencia+"%' or descripcion like '%"+coincidencia+"%';");
			rs = pstm.executeQuery();
			while (rs.next()) {
				productos.add(new ProductoBean(rs.getInt("idProducto"),
						rs.getString("nombre"),
						rs.getString("descripcion"),
						rs.getDouble("precio"),
						rs.getInt("existencia")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstm.close();
				crearConexion().close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
		return productos;
	}

	public String consultarCompra(String nombre, int cantidad) {
		String resultado = "No se cuenta con el stock suficicnete, ";
		try  {
			pstm = crearConexion().prepareStatement(SQL_CONSULTAR_PRODUCTO_POR_NOMBRE);
			pstm.setString(1, nombre);
			rs = pstm.executeQuery();
			if (rs.next()) {
				int stockProdcuto = rs.getInt("existencia");
				double precioProducto = rs.getDouble("precio");
				if(cantidad<=stockProdcuto){
					resultado = "Total a pagar: $"+ (cantidad*precioProducto);
				}else{
					resultado +="Stock: "+stockProdcuto;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstm.close();
				crearConexion().close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
		return resultado;
	}


	// PROBANDO LOS METODOS, SI JALA :D
	public static void main(String[] args) {
		ProductoDao hola = new ProductoDao();
		List<ProductoBean> lista = hola.consultarProductoCoincidencia("al");
		for (ProductoBean d: lista)
			System.out.println(d);

		String r = hola.consultarCompra("Cereal",50);
		System.out.println(r);

	}


}
