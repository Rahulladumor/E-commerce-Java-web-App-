package entitiespkg;

import entitiespkg.Citytb;
import entitiespkg.Sellerbankinfotb;
import entitiespkg.Sellerpickupaddresstb;
import entitiespkg.Sellerstoreinfotb;
import entitiespkg.Usertb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Statetb.class)
public class Statetb_ { 

    public static volatile CollectionAttribute<Statetb, Usertb> usertbCollection;
    public static volatile CollectionAttribute<Statetb, Citytb> citytbCollection;
    public static volatile SingularAttribute<Statetb, String> stateName;
    public static volatile SingularAttribute<Statetb, Integer> stateId;
    public static volatile CollectionAttribute<Statetb, Sellerbankinfotb> sellerbankinfotbCollection;
    public static volatile CollectionAttribute<Statetb, Sellerpickupaddresstb> sellerpickupaddresstbCollection;
    public static volatile SingularAttribute<Statetb, Boolean> isActive;
    public static volatile CollectionAttribute<Statetb, Sellerstoreinfotb> sellerstoreinfotbCollection;

}