package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appdatarest.entity.Attachment;
import uz.pdp.appdatarest.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {


}
