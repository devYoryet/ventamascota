package com.ventas.ventas.repositories;
import com.ventas.ventas.Models.Producto;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductoRepository extends JpaRepository<Producto, Long> {
  
}
