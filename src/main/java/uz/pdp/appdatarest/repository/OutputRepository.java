package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appdatarest.entity.Output;

@Repository
public interface OutputRepository extends JpaRepository<Output, Integer> {

    boolean existsByFactureNumber(String factureNumber);

}
