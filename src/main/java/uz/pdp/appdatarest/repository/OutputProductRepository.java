package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appdatarest.entity.OutputProduct;

@Repository
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {



}
