package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Warehouse;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = Warehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

}
