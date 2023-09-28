package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProducto extends JpaRepository<Producto, String> {

}
