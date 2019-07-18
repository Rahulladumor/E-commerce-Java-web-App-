package entitiespkg;

import entitiespkg.Citytb;
import entitiespkg.Statetb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Sellerpickupaddresstb.class)
public class Sellerpickupaddresstb_ { 

    public static volatile SingularAttribute<Sellerpickupaddresstb, Integer> pincode;
    public static volatile SingularAttribute<Sellerpickupaddresstb, Date> updateDate;
    public static volatile SingularAttribute<Sellerpickupaddresstb, String> address;
    public static volatile SingularAttribute<Sellerpickupaddresstb, Boolean> isactive;
    public static volatile SingularAttribute<Sellerpickupaddresstb, Statetb> stateId;
    public static volatile SingularAttribute<Sellerpickupaddresstb, Citytb> cityId;
    public static volatile SingularAttribute<Sellerpickupaddresstb, String> addressProof;
    public static volatile SingularAttribute<Sellerpickupaddresstb, Usertb> userName;
    public static volatile SingularAttribute<Sellerpickupaddresstb, Integer> sellerPickUpId;
    public static volatile SingularAttribute<Sellerpickupaddresstb, Date> createDate;

}