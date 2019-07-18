package entitiespkg;

import entitiespkg.Carttb;
import entitiespkg.Categorytb;
import entitiespkg.Ordertb;
import entitiespkg.Productclothestb;
import entitiespkg.Productelectronicstb;
import entitiespkg.Productsellertb;
import entitiespkg.Productwatchestb;
import entitiespkg.Subcategorytb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Productbasicinfotb.class)
public class Productbasicinfotb_ { 

    public static volatile SingularAttribute<Productbasicinfotb, Date> updateDate;
    public static volatile SingularAttribute<Productbasicinfotb, Boolean> isactive;
    public static volatile CollectionAttribute<Productbasicinfotb, Ordertb> ordertbCollection;
    public static volatile SingularAttribute<Productbasicinfotb, String> description;
    public static volatile SingularAttribute<Productbasicinfotb, Integer> productStatus;
    public static volatile SingularAttribute<Productbasicinfotb, Double> mrp;
    public static volatile CollectionAttribute<Productbasicinfotb, Productelectronicstb> productelectronicstbCollection;
    public static volatile SingularAttribute<Productbasicinfotb, Subcategorytb> subCategoryId;
    public static volatile CollectionAttribute<Productbasicinfotb, Productsellertb> productsellertbCollection;
    public static volatile CollectionAttribute<Productbasicinfotb, Carttb> carttbCollection;
    public static volatile SingularAttribute<Productbasicinfotb, String> productName;
    public static volatile CollectionAttribute<Productbasicinfotb, Productwatchestb> productwatchestbCollection;
    public static volatile SingularAttribute<Productbasicinfotb, Double> sellingPrice;
    public static volatile SingularAttribute<Productbasicinfotb, String> productImage;
    public static volatile SingularAttribute<Productbasicinfotb, Integer> productBasicInfoId;
    public static volatile SingularAttribute<Productbasicinfotb, String> productMainImage;
    public static volatile CollectionAttribute<Productbasicinfotb, Productclothestb> productclothestbCollection;
    public static volatile SingularAttribute<Productbasicinfotb, Integer> stock;
    public static volatile SingularAttribute<Productbasicinfotb, String> warrenty;
    public static volatile SingularAttribute<Productbasicinfotb, Categorytb> categoryId;
    public static volatile SingularAttribute<Productbasicinfotb, Date> createDate;
    public static volatile SingularAttribute<Productbasicinfotb, Usertb> username;

}