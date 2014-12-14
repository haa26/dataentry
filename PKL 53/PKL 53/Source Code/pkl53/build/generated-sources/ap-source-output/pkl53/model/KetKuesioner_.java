package pkl53.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.Kabupatenkota;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.KetRt;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(KetKuesioner.class)
public class KetKuesioner_ { 

    public static volatile SingularAttribute<KetKuesioner, Mahasiswa> nimPencacah;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r4;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r5;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r2;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r3;
    public static volatile SingularAttribute<KetKuesioner, String> kks;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r8;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r6;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r7;
    public static volatile ListAttribute<KetKuesioner, KetRt> ketRtList;
    public static volatile SingularAttribute<KetKuesioner, Date> tanggalPemeriksaan;
    public static volatile SingularAttribute<KetKuesioner, NoBs> b1r5;
    public static volatile SingularAttribute<KetKuesioner, String> b1r6;
    public static volatile SingularAttribute<KetKuesioner, Kelurahan> b1r3;
    public static volatile SingularAttribute<KetKuesioner, String> b1r4;
    public static volatile SingularAttribute<KetKuesioner, Kecamatan> b1r2;
    public static volatile SingularAttribute<KetKuesioner, Kabupatenkota> b1r1;
    public static volatile SingularAttribute<KetKuesioner, String> catatan;
    public static volatile SingularAttribute<KetKuesioner, Date> tanggalPencacahan;
    public static volatile SingularAttribute<KetKuesioner, Integer> b2r1;

}