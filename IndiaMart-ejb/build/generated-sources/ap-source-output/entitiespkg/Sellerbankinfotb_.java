package entitiespkg;

import entitiespkg.Citytb;
import entitiespkg.Statetb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Sellerbankinfotb.class)
public class Sellerbankinfotb_ { 

    public static volatile SingularAttribute<Sellerbankinfotb, Date> updateDate;
    public static volatile SingularAttribute<Sellerbankinfotb, String> aCHoldername;
    public static volatile SingularAttribute<Sellerbankinfotb, Boolean> isactive;
    public static volatile SingularAttribute<Sellerbankinfotb, Statetb> stateId;
    public static volatile SingularAttribute<Sellerbankinfotb, String> bankName;
    public static volatile SingularAttribute<Sellerbankinfotb, Citytb> cityId;
    public static volatile SingularAttribute<Sellerbankinfotb, Usertb> userName;
    public static volatile SingularAttribute<Sellerbankinfotb, String> branch;
    public static volatile SingularAttribute<Sellerbankinfotb, String> acNo;
    public static volatile SingularAttribute<Sellerbankinfotb, String> ifsc;
    public static volatile SingularAttribute<Sellerbankinfotb, String> acType;
    public static volatile SingularAttribute<Sellerbankinfotb, Integer> sellerBankId;
    public static volatile SingularAttribute<Sellerbankinfotb, Date> createDate;

}