package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	private IProductoService servicio;
	
	
	// Método para Listar
		@GetMapping("/Ver")	// http://localhost:8080/comprar
		public String Listado(Model m) {
			List<Producto> lista = servicio.list();
			m.addAttribute("producto", lista);
			
			return "Productos";	// compras.html
		}
		
		@GetMapping("/Buscar/{id}")
		public String search(@PathVariable String id, Model m) {
			Optional<Producto> p = servicio.search(id);
			m.addAttribute("producto", p);
			return "searchProductById";
		}
		
		@GetMapping("/Crear")
		public String create(Model m) {
			m.addAttribute("productos", new Producto());
			return "Crear";
		}
		
		@PostMapping("/Guardar")
		public String save(@Validated Producto p, Model m) {
			servicio.Save(p);
			return "redirect:/Ver";
		}
		
		@GetMapping("/Actualizar/{id}")
		public String update(@PathVariable String id, Model m) {
			Optional<Producto> p = servicio.search(id);
			m.addAttribute("producto", p);
			return "actualizarProducto";
		}
		
		@GetMapping("/Eliminar")
		public String delete(@PathVariable String id, Model m) {
			servicio.Delete(id);
			return "redirect:/Ver";
		}
		
		@GetMapping("/Comprar")	// http://localhost:8080/comprar
		public String Lista(Model m) {
			List<Producto> lista = servicio.list();
			m.addAttribute("producto", lista);
			
			return "Carrito";	// carrito.html
		}

}