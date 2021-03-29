package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Currency;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list", excerptProjection = Currency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

}
