package pkl53.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B3r15Pekerja;
import pkl53.model.KetRtanggota;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(OpsiJeniskelamin.class)
public class OpsiJeniskelamin_ { 

    public static volatile ListAttribute<OpsiJeniskelamin, KetRtanggota> ketRtanggotaList;
    public static volatile SingularAttribute<OpsiJeniskelamin, String> jenisKelamin;
    public static volatile SingularAttribute<OpsiJeniskelamin, String> kodeJenisKelamin;
    public static volatile ListAttribute<OpsiJeniskelamin, B3r15Pekerja> b3r15PekerjaList;

}