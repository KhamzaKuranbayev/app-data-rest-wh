package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Client;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = Client.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
