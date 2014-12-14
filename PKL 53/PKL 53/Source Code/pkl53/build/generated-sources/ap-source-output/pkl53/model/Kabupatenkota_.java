package pkl53.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B1Keterangantempat;
import pkl53.model.B1Tempat;
import pkl53.model.KetKuesioner;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(Kabupatenkota.class)
public class Kabupatenkota_ { 

    public static volatile ListAttribute<Kabupatenkota, KetKuesioner> ketKuesionerList;
    public static volatile SingularAttribute<Kabupatenkota, String> namaKabupaten;
    public static volatile ListAttribute<Kabupatenkota, B1Tempat> b1TempatList;
    public static volatile SingularAttribute<Kabupatenkota, B1Keterangantempat> b1Keterangantempat;
    public static volatile SingularAttribute<Kabupatenkota, String> kodeKabupaten;

}