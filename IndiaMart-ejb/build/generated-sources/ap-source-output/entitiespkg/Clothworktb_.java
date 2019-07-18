package entitiespkg;

import entitiespkg.Productclothestb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Clothworktb.class)
public class Clothworktb_ { 

    public static volatile SingularAttribute<Clothworktb, Integer> clothWorkId;
    public static volatile SingularAttribute<Clothworktb, String> work;
    public static volatile CollectionAttribute<Clothworktb, Productclothestb> productclothestbCollection;
    public static volatile SingularAttribute<Clothworktb, Boolean> isActive;

}