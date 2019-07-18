package entitiespkg;

import entitiespkg.Clothfabrictb;
import entitiespkg.Clothsizetb;
import entitiespkg.Clothstitchtypetb;
import entitiespkg.Clothstyletb;
import entitiespkg.Clothworktb;
import entitiespkg.Colortb;
import entitiespkg.Productbasicinfotb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Productclothestb.class)
public class Productclothestb_ { 

    public static volatile SingularAttribute<Productclothestb, Clothsizetb> sizeId;
    public static volatile SingularAttribute<Productclothestb, Date> updateDate;
    public static volatile SingularAttribute<Productclothestb, Productbasicinfotb> productId;
    public static volatile SingularAttribute<Productclothestb, Colortb> colorId;
    public static volatile SingularAttribute<Productclothestb, Clothfabrictb> fabricId;
    public static volatile SingularAttribute<Productclothestb, Clothstyletb> styleId;
    public static volatile SingularAttribute<Productclothestb, Boolean> isactive;
    public static volatile SingularAttribute<Productclothestb, Clothstitchtypetb> stitchTypeId;
    public static volatile SingularAttribute<Productclothestb, Integer> productClothesId;
    public static volatile SingularAttribute<Productclothestb, Clothworktb> workId;
    public static volatile SingularAttribute<Productclothestb, Date> createDate;

}