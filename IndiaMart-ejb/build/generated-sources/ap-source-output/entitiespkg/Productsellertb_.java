package entitiespkg;

import entitiespkg.Productbasicinfotb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Productsellertb.class)
public class Productsellertb_ { 

    public static volatile SingularAttribute<Productsellertb, Date> updateDate;
    public static volatile SingularAttribute<Productsellertb, Productbasicinfotb> productId;
    public static volatile SingularAttribute<Productsellertb, Boolean> isactive;
    public static volatile SingularAttribute<Productsellertb, Integer> productISellerId;
    public static volatile SingularAttribute<Productsellertb, Usertb> userName;
    public static volatile SingularAttribute<Productsellertb, Date> createDate;

}