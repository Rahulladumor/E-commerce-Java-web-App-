package entitiespkg;

import entitiespkg.Categorytb;
import entitiespkg.Productbasicinfotb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Subcategorytb.class)
public class Subcategorytb_ { 

    public static volatile SingularAttribute<Subcategorytb, Date> updateDate;
    public static volatile SingularAttribute<Subcategorytb, Boolean> isactive;
    public static volatile CollectionAttribute<Subcategorytb, Productbasicinfotb> productbasicinfotbCollection;
    public static volatile SingularAttribute<Subcategorytb, Integer> subCategoryId;
    public static volatile SingularAttribute<Subcategorytb, Categorytb> categoryId;
    public static volatile SingularAttribute<Subcategorytb, String> subCategoryName;
    public static volatile SingularAttribute<Subcategorytb, Date> createDate;

}