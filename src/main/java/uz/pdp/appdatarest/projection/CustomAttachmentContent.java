package uz.pdp.appdatarest.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {

    Integer getId();

    byte[] getBytes();

    @Value("#{target.attachment.id}")
    Integer getAttachmentId();

}
