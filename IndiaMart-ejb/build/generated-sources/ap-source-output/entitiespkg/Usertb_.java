package entitiespkg;

import entitiespkg.Carttb;
import entitiespkg.Citytb;
import entitiespkg.Grouptb;
import entitiespkg.Ordertb;
import entitiespkg.Paymenttb;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Productsellertb;
import entitiespkg.Sellerbankinfotb;
import entitiespkg.Sellergstinfo;
import entitiespkg.Sellerpaymenttb;
import entitiespkg.Sellerpickupaddresstb;
import entitiespkg.Sellerstoreinfotb;
import entitiespkg.Statetb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Usertb.class)
public class Usertb_ { 

    public static volatile SingularAttribute<Usertb, String> lastName;
    public static volatile SingularAttribute<Usertb, Date> updateDate;
    public static volatile SingularAttribute<Usertb, String> gender;
    public static volatile CollectionAttribute<Usertb, Sellerpaymenttb> sellerpaymenttbCollection;
    public static volatile CollectionAttribute<Usertb, Sellergstinfo> sellergstinfoCollection;
    public static volatile CollectionAttribute<Usertb, Ordertb> ordertbCollection;
    public static volatile CollectionAttribute<Usertb, Productbasicinfotb> productbasicinfotbCollection;
    public static volatile SingularAttribute<Usertb, String> emailId;
    public static volatile SingularAttribute<Usertb, Citytb> cityId;
    public static volatile SingularAttribute<Usertb, Boolean> isActive;
    public static volatile CollectionAttribute<Usertb, Productsellertb> productsellertbCollection;
    public static volatile CollectionAttribute<Usertb, Carttb> carttbCollection;
    public static volatile CollectionAttribute<Usertb, Sellerstoreinfotb> sellerstoreinfotbCollection;
    public static volatile SingularAttribute<Usertb, String> password;
    public static volatile CollectionAttribute<Usertb, Grouptb> grouptbCollection;
    public static volatile SingularAttribute<Usertb, Date> createDate;
    public static volatile SingularAttribute<Usertb, Integer> pincode;
    public static volatile SingularAttribute<Usertb, String> address;
    public static volatile SingularAttribute<Usertb, Statetb> stateId;
    public static volatile CollectionAttribute<Usertb, Sellerbankinfotb> sellerbankinfotbCollection;
    public static volatile CollectionAttribute<Usertb, Sellerpickupaddresstb> sellerpickupaddresstbCollection;
    public static volatile SingularAttribute<Usertb, String> userName;
    public static volatile SingularAttribute<Usertb, String> firstName;
    public static volatile CollectionAttribute<Usertb, Paymenttb> paymenttbCollection;
    public static volatile SingularAttribute<Usertb, Date> dob;
    public static volatile SingularAttribute<Usertb, String> contactNo;

}