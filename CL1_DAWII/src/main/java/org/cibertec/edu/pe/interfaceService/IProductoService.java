package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelos.Producto;

public interface IProductoService {
	
	public List<Producto> list();
	public Optional<Producto> search(String id);
	public int Save(Producto p);
	public void Delete(String id); 

}

