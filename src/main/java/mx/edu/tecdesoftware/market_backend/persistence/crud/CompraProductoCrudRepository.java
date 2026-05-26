package mx.edu.tecdesoftware.market_backend.persistence.crud;

import mx.edu.tecdesoftware.market_backend.persistence.entity.CompraProducto;
import mx.edu.tecdesoftware.market_backend.persistence.entity.CompraProductoPK;
import org.springframework.data.repository.CrudRepository;

public interface CompraProductoCrudRepository extends CrudRepository<CompraProducto, CompraProductoPK> {

}