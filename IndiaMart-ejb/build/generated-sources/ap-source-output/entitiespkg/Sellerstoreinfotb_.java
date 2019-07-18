package entitiespkg;

import entitiespkg.Citytb;
import entitiespkg.Statetb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Sellerstoreinfotb.class)
public class Sellerstoreinfotb_ { 

    public static volatile SingularAttribute<Sellerstoreinfotb, Date> updateDate;
    public static volatile SingularAttribute<Sellerstoreinfotb, String> address;
    public static volatile SingularAttribute<Sellerstoreinfotb, Integer> sellerStoreInfoId;
    public static volatile SingularAttribute<Sellerstoreinfotb, Boolean> isactive;
    public static volatile SingularAttribute<Sellerstoreinfotb, Statetb> stateId;
    public static volatile SingularAttribute<Sellerstoreinfotb, String> description;
    public static volatile SingularAttribute<Sellerstoreinfotb, Citytb> cityId;
    public static volatile SingularAttribute<Sellerstoreinfotb, Usertb> userName;
    public static volatile SingularAttribute<Sellerstoreinfotb, Integer> pinCode;
    public static volatile SingularAttribute<Sellerstoreinfotb, String> logo;
    public static volatile SingularAttribute<Sellerstoreinfotb, String> storeName;
    public static volatile SingularAttribute<Sellerstoreinfotb, String> documentPic;
    public static volatile SingularAttribute<Sellerstoreinfotb, Date> createDate;

}