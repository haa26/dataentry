package pkl53.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B4Art;
import pkl53.model.B8Keteranganperumahandanaset;
import pkl53.model.Kabupatenkota;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.KetRt;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(B1Keterangantempat.class)
public class B1Keterangantempat_ { 

    public static volatile SingularAttribute<B1Keterangantempat, Mahasiswa> nimPencacah;
    public static volatile SingularAttribute<B1Keterangantempat, String> kks;
    public static volatile SingularAttribute<B1Keterangantempat, Date> tanggalPemeriksaanKP;
    public static volatile SingularAttribute<B1Keterangantempat, String> b1r7;
    public static volatile ListAttribute<B1Keterangantempat, B4Art> b4ArtList;
    public static volatile SingularAttribute<B1Keterangantempat, String> b1r5b;
    public static volatile SingularAttribute<B1Keterangantempat, String> b1r8;
    public static volatile SingularAttribute<B1Keterangantempat, KetRt> b1r6;
    public static volatile SingularAttribute<B1Keterangantempat, Kelurahan> b1r3;
    public static volatile SingularAttribute<B1Keterangantempat, String> b1r4;
    public static volatile SingularAttribute<B1Keterangantempat, Kecamatan> b1r2;
    public static volatile SingularAttribute<B1Keterangantempat, Kabupatenkota> b1r1;
    public static volatile SingularAttribute<B1Keterangantempat, NoBs> b1r5a;
    public static volatile SingularAttribute<B1Keterangantempat, Date> tanggalPencacahan;
    public static volatile SingularAttribute<B1Keterangantempat, B8Keteranganperumahandanaset> b8Keteranganperumahandanaset;

}