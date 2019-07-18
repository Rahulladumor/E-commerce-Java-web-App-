package entitiespkg;

import entitiespkg.Productclothestb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Clothfabrictb.class)
public class Clothfabrictb_ { 

    public static volatile SingularAttribute<Clothfabrictb, Integer> clothFabricId;
    public static volatile SingularAttribute<Clothfabrictb, String> fabric;
    public static volatile CollectionAttribute<Clothfabrictb, Productclothestb> productclothestbCollection;
    public static volatile SingularAttribute<Clothfabrictb, Boolean> isActive;

}