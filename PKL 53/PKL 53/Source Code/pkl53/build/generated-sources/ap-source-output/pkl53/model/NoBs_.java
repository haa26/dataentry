package pkl53.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B1Keterangantempat;
import pkl53.model.B1Tempat;
import pkl53.model.KetKuesioner;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(NoBs.class)
public class NoBs_ { 

    public static volatile SingularAttribute<NoBs, String> b1r2;
    public static volatile SingularAttribute<NoBs, String> b1r1;
    public static volatile SingularAttribute<NoBs, String> b1r5a;
    public static volatile ListAttribute<NoBs, B1Keterangantempat> b1KeterangantempatList;
    public static volatile ListAttribute<NoBs, KetKuesioner> ketKuesionerList;
    public static volatile SingularAttribute<NoBs, String> nobsId;
    public static volatile SingularAttribute<NoBs, String> b1r3;
    public static volatile ListAttribute<NoBs, B1Tempat> b1TempatList;

}