package edu.curso.java.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.curso.java.spring.bo.Producto;
import edu.curso.java.spring.dao.ProductoDAO;

@Service
@Transactional
public class ProductoServiceImp implements ProductoService {

	private static Log log = LogFactory.getLog(ProductoService.class); 
	
	@Autowired
	private ProductoDAO productoDAO;
		
	/* (non-Javadoc)
	 * @see edu.curso.java.spring.service.ProductoServiceIm#guardarProducto(edu.curso.java.spring.bo.Producto)
	 */
	@Override
	public Long guardarProducto(Producto producto) {
		return productoDAO.guardarProducto(producto);
	}

	/* (non-Javadoc)
	 * @see edu.curso.java.spring.service.ProductoServiceIm#buscarProducto(java.lang.Long)
	 */
	@Override
	public Producto buscarProducto(Long id) {
		return productoDAO.buscarProductoPorId(id);
	}

	/* (non-Javadoc)
	 * @see edu.curso.java.spring.service.ProductoServiceIm#buscarProductos()
	 */
	@Override
	public List<Producto> buscarProductos() {
		return productoDAO.recuperarProductos();
	}

	/* (non-Javadoc)
	 * @see edu.curso.java.spring.service.ProductoServiceIm#borrarProducto(long)
	 */
	@Override
	public void borrarProducto(long id) {
		productoDAO.borrarProducto(id);
	}

	/* (non-Javadoc)
	 * @see edu.curso.java.spring.service.ProductoServiceIm#actualizarProducto(edu.curso.java.spring.bo.Producto)
	 */
	@Override
	public void actualizarProducto(Producto producto) {
		productoDAO.actualizarProducto(producto);
	}
	
	
}
