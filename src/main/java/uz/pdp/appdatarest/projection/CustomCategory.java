package uz.pdp.appdatarest.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Category;
import uz.pdp.appdatarest.entity.Client;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    boolean isActive();

    @Value("#{target.parentCategory?.id ?: null}")
    Integer getParentCategoryId();

}
