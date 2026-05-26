package mx.edu.tecdesoftware.market_backend.domain.repository;

import mx.edu.tecdesoftware.market_backend.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {

    List<Producto> getAll();

    Optional<Producto> getProducto(int idProducto);

    Producto save(Producto producto);

    void delete(int idProducto);
}