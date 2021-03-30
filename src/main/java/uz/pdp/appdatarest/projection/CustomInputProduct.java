package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.constants.ExpireStatus;
import uz.pdp.appdatarest.entity.*;
import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();
    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();

    ExpireStatus getExpireStatus();

}
