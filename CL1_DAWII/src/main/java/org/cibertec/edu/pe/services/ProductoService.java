package org.cibertec.edu.pe.services;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.cibertec.edu.pe.modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto data;

	@Override
	public List<Producto> list() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> search(String id) {
		return data.findById(id);
	}

	@Override
	public int Save(Producto p) {
		int hasSaved = 0;
		Producto dbProduct = data.save(p);
		if(!dbProduct.equals(null)) hasSaved = -1;
		return hasSaved;
	}

	@Override
	public void Delete(String id) {
		data.deleteById(id);		
		
	}
	
	

}
