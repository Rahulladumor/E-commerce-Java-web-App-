package entitiespkg;

import entitiespkg.Sellerbankinfotb;
import entitiespkg.Sellerpickupaddresstb;
import entitiespkg.Sellerstoreinfotb;
import entitiespkg.Statetb;
import entitiespkg.Usertb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Citytb.class)
public class Citytb_ { 

    public static volatile CollectionAttribute<Citytb, Usertb> usertbCollection;
    public static volatile SingularAttribute<Citytb, String> cityName;
    public static volatile CollectionAttribute<Citytb, Sellerbankinfotb> sellerbankinfotbCollection;
    public static volatile CollectionAttribute<Citytb, Sellerpickupaddresstb> sellerpickupaddresstbCollection;
    public static volatile SingularAttribute<Citytb, Statetb> stateId;
    public static volatile SingularAttribute<Citytb, Integer> cityId;
    public static volatile SingularAttribute<Citytb, Boolean> isActive;
    public static volatile CollectionAttribute<Citytb, Sellerstoreinfotb> sellerstoreinfotbCollection;

}