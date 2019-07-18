package entitiespkg;

import entitiespkg.Productbasicinfotb;
import entitiespkg.Subcategorytb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Categorytb.class)
public class Categorytb_ { 

    public static volatile SingularAttribute<Categorytb, Date> updateDate;
    public static volatile SingularAttribute<Categorytb, Boolean> isactive;
    public static volatile CollectionAttribute<Categorytb, Productbasicinfotb> productbasicinfotbCollection;
    public static volatile CollectionAttribute<Categorytb, Subcategorytb> subcategorytbCollection;
    public static volatile SingularAttribute<Categorytb, String> categoryName;
    public static volatile SingularAttribute<Categorytb, Integer> categoryId;
    public static volatile SingularAttribute<Categorytb, Date> createDate;

}