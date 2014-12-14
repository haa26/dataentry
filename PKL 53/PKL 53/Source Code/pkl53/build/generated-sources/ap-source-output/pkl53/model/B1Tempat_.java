package pkl53.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B2Art;
import pkl53.model.Kabupatenkota;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(B1Tempat.class)
public class B1Tempat_ { 

    public static volatile SingularAttribute<B1Tempat, Mahasiswa> nimPencacah;
    public static volatile SingularAttribute<B1Tempat, String> kks;
    public static volatile SingularAttribute<B1Tempat, String> b1r7;
    public static volatile SingularAttribute<B1Tempat, String> b1r5b;
    public static volatile SingularAttribute<B1Tempat, String> b1r8;
    public static volatile SingularAttribute<B1Tempat, String> b1r6;
    public static volatile SingularAttribute<B1Tempat, Kelurahan> b1r3;
    public static volatile SingularAttribute<B1Tempat, String> b1r4;
    public static volatile SingularAttribute<B1Tempat, Kecamatan> b1r2;
    public static volatile SingularAttribute<B1Tempat, Kabupatenkota> b1r1;
    public static volatile SingularAttribute<B1Tempat, NoBs> b1r5a;
    public static volatile ListAttribute<B1Tempat, B2Art> b2ArtList;
    public static volatile SingularAttribute<B1Tempat, Date> tanggalPencacahan;
    public static volatile SingularAttribute<B1Tempat, Date> tanggalPemeriksaanKU;

}