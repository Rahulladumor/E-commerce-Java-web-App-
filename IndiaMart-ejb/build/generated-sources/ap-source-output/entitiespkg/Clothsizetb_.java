package entitiespkg;

import entitiespkg.Productclothestb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Clothsizetb.class)
public class Clothsizetb_ { 

    public static volatile SingularAttribute<Clothsizetb, String> size;
    public static volatile SingularAttribute<Clothsizetb, Integer> clothSizeId;
    public static volatile CollectionAttribute<Clothsizetb, Productclothestb> productclothestbCollection;
    public static volatile SingularAttribute<Clothsizetb, Boolean> isActive;

}