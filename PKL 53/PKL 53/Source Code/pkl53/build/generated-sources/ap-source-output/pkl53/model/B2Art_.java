package pkl53.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B1Tempat;
import pkl53.model.B2Umumusaha;
import pkl53.model.B3Rinciusaha;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(B2Art.class)
public class B2Art_ { 

    public static volatile ListAttribute<B2Art, B2Umumusaha> b2UmumusahaList;
    public static volatile SingularAttribute<B2Art, String> b2r2;
    public static volatile SingularAttribute<B2Art, String> b2r3;
    public static volatile SingularAttribute<B2Art, B1Tempat> kks;
    public static volatile SingularAttribute<B2Art, String> kKSArt;
    public static volatile ListAttribute<B2Art, B3Rinciusaha> b3RinciusahaList;
    public static volatile SingularAttribute<B2Art, Integer> b2r1;

}