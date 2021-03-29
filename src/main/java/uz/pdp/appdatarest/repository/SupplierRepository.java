package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Supplier;

@RepositoryRestResource(path = "supplier",  collectionResourceRel = "list", excerptProjection = Supplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
