package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.pdp.appdatarest.entity.InputProduct;

import java.util.Date;
import java.util.List;


@Repository
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {




}
