package pkl53.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkl53.model.B1Keterangantempat;
import pkl53.model.B1Tempat;
import pkl53.model.Coba;
import pkl53.model.KetKuesioner;
import pkl53.model.Kortimpencacah;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-07T14:30:01")
@StaticMetamodel(Mahasiswa.class)
public class Mahasiswa_ { 

    public static volatile SingularAttribute<Mahasiswa, Kortimpencacah> kortimpencacah;
    public static volatile ListAttribute<Mahasiswa, Kortimpencacah> kortimpencacahList;
    public static volatile ListAttribute<Mahasiswa, B1Keterangantempat> b1KeterangantempatList;
    public static volatile ListAttribute<Mahasiswa, KetKuesioner> ketKuesionerList;
    public static volatile SingularAttribute<Mahasiswa, Coba> coba;
    public static volatile SingularAttribute<Mahasiswa, String> nama;
    public static volatile ListAttribute<Mahasiswa, Coba> cobaList;
    public static volatile SingularAttribute<Mahasiswa, String> nim;
    public static volatile ListAttribute<Mahasiswa, B1Tempat> b1TempatList;

}