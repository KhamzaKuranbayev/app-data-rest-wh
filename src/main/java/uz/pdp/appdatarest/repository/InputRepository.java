package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appdatarest.entity.Input;

@Repository
public interface InputRepository extends JpaRepository<Input, Integer> {

    boolean existsByFactureNumber(String factureNumber);

}
