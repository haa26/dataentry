package pkl53.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B1Keterangantempat;
import pkl53.model.B1Tempat;
import pkl53.model.KetKuesioner;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(Kecamatan.class)
public class Kecamatan_ { 

    public static volatile SingularAttribute<Kecamatan, String> b1r2;
    public static volatile SingularAttribute<Kecamatan, String> namaKecamatan;
    public static volatile SingularAttribute<Kecamatan, String> b1r1;
    public static volatile ListAttribute<Kecamatan, B1Keterangantempat> b1KeterangantempatList;
    public static volatile SingularAttribute<Kecamatan, String> kecamatanId;
    public static volatile ListAttribute<Kecamatan, KetKuesioner> ketKuesionerList;
    public static volatile ListAttribute<Kecamatan, B1Tempat> b1TempatList;

}