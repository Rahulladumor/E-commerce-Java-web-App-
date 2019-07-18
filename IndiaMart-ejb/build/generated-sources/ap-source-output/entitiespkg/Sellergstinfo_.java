package entitiespkg;

import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Sellergstinfo.class)
public class Sellergstinfo_ { 

    public static volatile SingularAttribute<Sellergstinfo, Date> updateDate;
    public static volatile SingularAttribute<Sellergstinfo, Integer> sellerGSTId;
    public static volatile SingularAttribute<Sellergstinfo, Boolean> isactive;
    public static volatile SingularAttribute<Sellergstinfo, String> gstin;
    public static volatile SingularAttribute<Sellergstinfo, String> pan;
    public static volatile SingularAttribute<Sellergstinfo, String> gSTDocument;
    public static volatile SingularAttribute<Sellergstinfo, Usertb> userName;
    public static volatile SingularAttribute<Sellergstinfo, Date> createDate;

}