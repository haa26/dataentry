/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "2b3_rinciusaha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B3Rinciusaha.findAll", query = "SELECT b FROM B3Rinciusaha b"),
    @NamedQuery(name = "B3Rinciusaha.findByKKSArtNup", query = "SELECT b FROM B3Rinciusaha b WHERE b.kKSArtNup = :kKSArtNup"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r1a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r1a = :b3r1a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r1b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r1b = :b3r1b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r2", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r2 = :b3r2"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r3", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r3 = :b3r3"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r4a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r4a = :b3r4a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r4b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r4b = :b3r4b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R5lainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R5lainnya = :b3R5lainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r7a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r7a = :b3r7a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r7b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r7b = :b3r7b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r8", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r8 = :b3r8"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r9", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r9 = :b3r9"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R11Elainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R11Elainnya = :b3R11Elainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r12a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r12a = :b3r12a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r12b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r12b = :b3r12b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r12c", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r12c = :b3r12c"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r12d", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r12d = :b3r12d"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R12jumlah", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R12jumlah = :b3R12jumlah"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Aapr13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Aapr13 = :b3R13Aapr13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Amei13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Amei13 = :b3R13Amei13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Ajun13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Ajun13 = :b3R13Ajun13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Ajul13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Ajul13 = :b3R13Ajul13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Aagt13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Aagt13 = :b3R13Aagt13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Asep13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Asep13 = :b3R13Asep13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Aokt13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Aokt13 = :b3R13Aokt13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Anov13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Anov13 = :b3R13Anov13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Ades13", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Ades13 = :b3R13Ades13"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Ajan14", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Ajan14 = :b3R13Ajan14"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Afeb14", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Afeb14 = :b3R13Afeb14"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R13Amar14", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R13Amar14 = :b3R13Amar14"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r14", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r14 = :b3r14"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r16", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r16 = :b3r16"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17a1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17a1 = :b3r17a1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17b1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17b1 = :b3r17b1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17c1a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17c1a = :b3r17c1a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17c1b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17c1b = :b3r17c1b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17c1c", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17c1c = :b3r17c1c"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17d1a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17d1a = :b3r17d1a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17d1b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17d1b = :b3r17d1b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17e1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17e1 = :b3r17e1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17f1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17f1 = :b3r17f1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17g1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17g1 = :b3r17g1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17h1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17h1 = :b3r17h1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17i1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17i1 = :b3r17i1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17j1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17j1 = :b3r17j1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17k1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17k1 = :b3r17k1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r17l1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r17l1 = :b3r17l1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R17totalPengeluaran", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R17totalPengeluaran = :b3R17totalPengeluaran"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R17labarugi", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R17labarugi = :b3R17labarugi"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r18b1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r18b1 = :b3r18b1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r18b2", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r18b2 = :b3r18b2"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r18a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r18a = :b3r18a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R19utama", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R19utama = :b3R19utama"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R19lainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R19lainnya = :b3R19lainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R19lainnyasebutkan", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R19lainnyasebutkan = :b3R19lainnyasebutkan"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r20a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r20a = :b3r20a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r20b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r20b = :b3r20b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R21lainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R21lainnya = :b3R21lainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22a = :b3r22a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R22Blainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R22Blainnya = :b3R22Blainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22c", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22c = :b3r22c"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R22Dlainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R22Dlainnya = :b3R22Dlainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22e", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22e = :b3r22e"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R22Flainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R22Flainnya = :b3R22Flainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g1 = :b3r22g1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g2", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g2 = :b3r22g2"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g3", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g3 = :b3r22g3"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g4", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g4 = :b3r22g4"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g5", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g5 = :b3r22g5"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g6", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g6 = :b3r22g6"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g7", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g7 = :b3r22g7"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r22g8", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r22g8 = :b3r22g8"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R22G9lainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R22G9lainnya = :b3R22G9lainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R23ALainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R23ALainnya = :b3R23ALainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b1", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b1 = :b3r23b1"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b2", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b2 = :b3r23b2"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b3", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b3 = :b3r23b3"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b4", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b4 = :b3r23b4"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b5", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b5 = :b3r23b5"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b6", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b6 = :b3r23b6"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b7", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b7 = :b3r23b7"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b8", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b8 = :b3r23b8"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b9", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b9 = :b3r23b9"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b10", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b10 = :b3r23b10"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r23b11", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r23b11 = :b3r23b11"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R23B12lainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R23B12lainnya = :b3R23B12lainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r24", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r24 = :b3r24"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25a = :b3r25a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25b = :b3r25b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25c", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25c = :b3r25c"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25d", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25d = :b3r25d"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25e", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25e = :b3r25e"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25f", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25f = :b3r25f"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25g", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25g = :b3r25g"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25h", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25h = :b3r25h"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25i", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25i = :b3r25i"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25j", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25j = :b3r25j"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25k", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25k = :b3r25k"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r25l", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r25l = :b3r25l"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R25Mlainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R25Mlainnya = :b3R25Mlainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R26lainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R26lainnya = :b3R26lainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27a = :b3r27a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27b = :b3r27b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27c", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27c = :b3r27c"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27d", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27d = :b3r27d"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27e", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27e = :b3r27e"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27f", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27f = :b3r27f"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27g", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27g = :b3r27g"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27h", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27h = :b3r27h"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r27i", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r27i = :b3r27i"),
    @NamedQuery(name = "B3Rinciusaha.findByB3R27Jlainnya", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3R27Jlainnya = :b3R27Jlainnya"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r28", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r28 = :b3r28"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r29a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r29a = :b3r29a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r29b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r29b = :b3r29b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r29c", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r29c = :b3r29c"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r30a", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r30a = :b3r30a"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r30b", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r30b = :b3r30b"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r30c", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r30c = :b3r30c"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r30d", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r30d = :b3r30d"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r30e", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r30e = :b3r30e"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r30f", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r30f = :b3r30f"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r30g", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r30g = :b3r30g"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r31", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r31 = :b3r31"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r32", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r32 = :b3r32"),
    @NamedQuery(name = "B3Rinciusaha.findByB3r33", query = "SELECT b FROM B3Rinciusaha b WHERE b.b3r33 = :b3r33")})
public class B3Rinciusaha implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArtNup")
    private String kKSArtNup;
    @Basic(optional = false)
    @Column(name = "B3R1A")
    private String b3r1a;
    @Basic(optional = false)
    @Column(name = "B3R1B")
    private int b3r1b;
    @Basic(optional = false)
    @Column(name = "B3R2")
    private int b3r2;
    @Basic(optional = false)
    @Column(name = "B3R3")
    private int b3r3;
    @Basic(optional = false)
    @Column(name = "B3R4A")
    private int b3r4a;
    @Basic(optional = false)
    @Column(name = "B3R4B")
    private int b3r4b;
    @Column(name = "B3R5_lainnya")
    private String b3R5lainnya;
    @Basic(optional = false)
    @Column(name = "B3R7A")
    private int b3r7a;
    @Basic(optional = false)
    @Column(name = "B3R7B")
    private int b3r7b;
    @Basic(optional = false)
    @Column(name = "B3R8")
    private int b3r8;
    @Basic(optional = false)
    @Column(name = "B3R9")
    private int b3r9;
    @Column(name = "B3R11E_lainnya")
    private String b3R11Elainnya;
    @Column(name = "B3R12A")
    private Integer b3r12a;
    @Column(name = "B3R12B")
    private Integer b3r12b;
    @Column(name = "B3R12C")
    private Integer b3r12c;
    @Column(name = "B3R12D")
    private Integer b3r12d;
    @Column(name = "B3R12_jumlah")
    private Integer b3R12jumlah;
    @Basic(optional = false)
    @Column(name = "B3R13A_apr13")
    private int b3R13Aapr13;
    @Basic(optional = false)
    @Column(name = "B3R13A_mei13")
    private int b3R13Amei13;
    @Basic(optional = false)
    @Column(name = "B3R13A_jun13")
    private int b3R13Ajun13;
    @Basic(optional = false)
    @Column(name = "B3R13A_jul13")
    private int b3R13Ajul13;
    @Basic(optional = false)
    @Column(name = "B3R13A_agt13")
    private int b3R13Aagt13;
    @Basic(optional = false)
    @Column(name = "B3R13A_sep13")
    private int b3R13Asep13;
    @Basic(optional = false)
    @Column(name = "B3R13A_okt13")
    private int b3R13Aokt13;
    @Basic(optional = false)
    @Column(name = "B3R13A_nov13")
    private int b3R13Anov13;
    @Basic(optional = false)
    @Column(name = "B3R13A_des13")
    private int b3R13Ades13;
    @Basic(optional = false)
    @Column(name = "B3R13A_jan14")
    private int b3R13Ajan14;
    @Basic(optional = false)
    @Column(name = "B3R13A_feb14")
    private int b3R13Afeb14;
    @Basic(optional = false)
    @Column(name = "B3R13A_mar14")
    private int b3R13Amar14;
    @Basic(optional = false)
    @Column(name = "B3R14")
    private int b3r14;
    @Basic(optional = false)
    @Column(name = "B3R16")
    private int b3r16;
    @Basic(optional = false)
    @Column(name = "B3R17A1")
    private int b3r17a1;
    @Basic(optional = false)
    @Column(name = "B3R17B1")
    private int b3r17b1;
    @Basic(optional = false)
    @Column(name = "B3R17C1A")
    private int b3r17c1a;
    @Basic(optional = false)
    @Column(name = "B3R17C1B")
    private int b3r17c1b;
    @Basic(optional = false)
    @Column(name = "B3R17C1C")
    private int b3r17c1c;
    @Basic(optional = false)
    @Column(name = "B3R17D1A")
    private int b3r17d1a;
    @Basic(optional = false)
    @Column(name = "B3R17D1B")
    private int b3r17d1b;
    @Basic(optional = false)
    @Column(name = "B3R17E1")
    private int b3r17e1;
    @Basic(optional = false)
    @Column(name = "B3R17F1")
    private int b3r17f1;
    @Basic(optional = false)
    @Column(name = "B3R17G1")
    private int b3r17g1;
    @Basic(optional = false)
    @Column(name = "B3R17H1")
    private int b3r17h1;
    @Basic(optional = false)
    @Column(name = "B3R17I1")
    private int b3r17i1;
    @Basic(optional = false)
    @Column(name = "B3R17J1")
    private int b3r17j1;
    @Basic(optional = false)
    @Column(name = "B3R17K1")
    private int b3r17k1;
    @Basic(optional = false)
    @Column(name = "B3R17L1")
    private int b3r17l1;
    @Basic(optional = false)
    @Column(name = "B3R17_totalPengeluaran")
    private int b3R17totalPengeluaran;
    @Basic(optional = false)
    @Column(name = "B3R17_labarugi")
    private int b3R17labarugi;
    @Basic(optional = false)
    @Column(name = "B3R18B1")
    private int b3r18b1;
    @Basic(optional = false)
    @Column(name = "B3R18B2")
    private int b3r18b2;
    @Column(name = "B3R18A")
    private String b3r18a;
    @Column(name = "B3R19_utama")
    private String b3R19utama;
    @Column(name = "B3R19_lainnya")
    private String b3R19lainnya;
    @Column(name = "B3R19_lainnya_sebutkan")
    private String b3R19lainnyasebutkan;
    @Column(name = "B3R20A")
    private String b3r20a;
    @Column(name = "B3R20B")
    private String b3r20b;
    @Column(name = "B3R21_lainnya")
    private String b3R21lainnya;
    @Column(name = "B3R22A")
    private String b3r22a;
    @Column(name = "B3R22B_lainnya")
    private String b3R22Blainnya;
    @Column(name = "B3R22C")
    private String b3r22c;
    @Column(name = "B3R22D_lainnya")
    private String b3R22Dlainnya;
    @Column(name = "B3R22E")
    private String b3r22e;
    @Column(name = "B3R22F_lainnya")
    private String b3R22Flainnya;
    @Column(name = "B3R22G1")
    private String b3r22g1;
    @Column(name = "B3R22G2")
    private String b3r22g2;
    @Column(name = "B3R22G3")
    private String b3r22g3;
    @Column(name = "B3R22G4")
    private String b3r22g4;
    @Column(name = "B3R22G5")
    private String b3r22g5;
    @Column(name = "B3R22G6")
    private String b3r22g6;
    @Column(name = "B3R22G7")
    private String b3r22g7;
    @Column(name = "B3R22G8")
    private String b3r22g8;
    @Column(name = "B3R22G9_lainnya")
    private String b3R22G9lainnya;
    @Column(name = "B3R23A_Lainnya")
    private String b3R23ALainnya;
    @Column(name = "B3R23B1")
    private String b3r23b1;
    @Column(name = "B3R23B2")
    private String b3r23b2;
    @Column(name = "B3R23B3")
    private String b3r23b3;
    @Column(name = "B3R23B4")
    private String b3r23b4;
    @Column(name = "B3R23B5")
    private String b3r23b5;
    @Column(name = "B3R23B6")
    private String b3r23b6;
    @Column(name = "B3R23B7")
    private String b3r23b7;
    @Column(name = "B3R23B8")
    private String b3r23b8;
    @Column(name = "B3R23B9")
    private String b3r23b9;
    @Column(name = "B3R23B10")
    private String b3r23b10;
    @Column(name = "B3R23B11")
    private String b3r23b11;
    @Column(name = "B3R23B12_lainnya")
    private String b3R23B12lainnya;
    @Column(name = "B3R24")
    private String b3r24;
    @Column(name = "B3R25A")
    private String b3r25a;
    @Column(name = "B3R25B")
    private String b3r25b;
    @Column(name = "B3R25C")
    private String b3r25c;
    @Column(name = "B3R25D")
    private String b3r25d;
    @Column(name = "B3R25E")
    private String b3r25e;
    @Column(name = "B3R25F")
    private String b3r25f;
    @Column(name = "B3R25G")
    private String b3r25g;
    @Column(name = "B3R25H")
    private String b3r25h;
    @Column(name = "B3R25I")
    private String b3r25i;
    @Column(name = "B3R25J")
    private String b3r25j;
    @Column(name = "B3R25K")
    private String b3r25k;
    @Column(name = "B3R25L")
    private String b3r25l;
    @Column(name = "B3R25M_lainnya")
    private String b3R25Mlainnya;
    @Column(name = "B3R26_lainnya")
    private String b3R26lainnya;
    @Column(name = "B3R27A")
    private String b3r27a;
    @Column(name = "B3R27B")
    private String b3r27b;
    @Column(name = "B3R27C")
    private String b3r27c;
    @Column(name = "B3R27D")
    private String b3r27d;
    @Column(name = "B3R27E")
    private String b3r27e;
    @Column(name = "B3R27F")
    private String b3r27f;
    @Column(name = "B3R27G")
    private String b3r27g;
    @Column(name = "B3R27H")
    private String b3r27h;
    @Column(name = "B3R27I")
    private String b3r27i;
    @Column(name = "B3R27J_lainnya")
    private String b3R27Jlainnya;
    @Column(name = "B3R28")
    private String b3r28;
    @Column(name = "B3R29A")
    private String b3r29a;
    @Column(name = "B3R29B")
    private String b3r29b;
    @Column(name = "B3R29C")
    private String b3r29c;
    @Column(name = "B3R30A")
    private String b3r30a;
    @Column(name = "B3R30B")
    private String b3r30b;
    @Column(name = "B3R30C")
    private String b3r30c;
    @Column(name = "B3R30D")
    private String b3r30d;
    @Column(name = "B3R30E")
    private String b3r30e;
    @Column(name = "B3R30F")
    private String b3r30f;
    @Column(name = "B3R30G")
    private String b3r30g;
    @Column(name = "B3R31")
    private String b3r31;
    @Column(name = "B3R32")
    private Integer b3r32;
    @Column(name = "B3R33")
    private String b3r33;
    @JoinColumn(name = "B3R36", referencedColumnName = "B3R36")
    @ManyToOne
    private OpsiB3r36 b3r36;
    @JoinColumn(name = "KKSArt", referencedColumnName = "KKSArt")
    @ManyToOne(optional = false)
    private B2Art kKSArt;
    @JoinColumn(name = "B3R34", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiB3R34R35 b3r34;
    @JoinColumn(name = "B3R10", referencedColumnName = "B3R10")
    @ManyToOne
    private OpsiB3r10 b3r10;
    @JoinColumn(name = "B3R22B", referencedColumnName = "B3R22B")
    @ManyToOne
    private OpsiB3r22b b3r22b;
    @JoinColumn(name = "B3R23A", referencedColumnName = "B3R23A")
    @ManyToOne
    private OpsiB3r23a b3r23a;
    @JoinColumn(name = "B3R13B_mei13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bmei13;
    @JoinColumn(name = "B3R6", referencedColumnName = "B3R6")
    @ManyToOne(optional = false)
    private OpsiB3r6 b3r6;
    @JoinColumn(name = "B3R35", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiB3R34R35 b3r35;
    @JoinColumn(name = "B3R13B_jul13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bjul13;
    @JoinColumn(name = "B3R13B_apr13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bapr13;
    @JoinColumn(name = "KKSArtNup", referencedColumnName = "KKSArtNup", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B2Umumusaha b2Umumusaha;
    @JoinColumn(name = "B3R13B_okt13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bokt13;
    @JoinColumn(name = "B3R5", referencedColumnName = "B3R5")
    @ManyToOne(optional = false)
    private OpsiB3r5 b3r5;
    @JoinColumn(name = "B3R11D", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b3r11d;
    @JoinColumn(name = "B3R13B_nov13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bnov13;
    @JoinColumn(name = "B3R22F", referencedColumnName = "B3R22F")
    @ManyToOne
    private OpsiB3r22f b3r22f;
    @JoinColumn(name = "B3R13B_agt13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bagt13;
    @JoinColumn(name = "B3R22D", referencedColumnName = "B3R22D")
    @ManyToOne
    private OpsiB3r22d b3r22d;
    @JoinColumn(name = "B3R11A", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b3r11a;
    @JoinColumn(name = "B3R13B_sep13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bsep13;
    @JoinColumn(name = "B3R26", referencedColumnName = "B3R26")
    @ManyToOne
    private OpsiB3r26 b3r26;
    @JoinColumn(name = "B3R11C", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b3r11c;
    @JoinColumn(name = "B3R13B_des13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bdes13;
    @JoinColumn(name = "B3R13B_jan14", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bjan14;
    @JoinColumn(name = "B3R13B_feb14", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bfeb14;
    @JoinColumn(name = "B3R13B_jun13", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bjun13;
    @JoinColumn(name = "B3R13B_mar14", referencedColumnName = "B3R13B")
    @ManyToOne(optional = false)
    private OpsiB3r13b b3R13Bmar14;
    @JoinColumn(name = "B3R21", referencedColumnName = "B3R21")
    @ManyToOne
    private OpsiB3r21 b3r21;
    @JoinColumn(name = "B3R11B", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b3r11b;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kKSArtNup")
    private List<B3r15Pekerja> b3r15PekerjaList;

    public B3Rinciusaha() {
    }

    public B3Rinciusaha(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public B3Rinciusaha(String kKSArtNup, String b3r1a, int b3r1b, int b3r2, int b3r3, int b3r4a, int b3r4b, int b3r7a, int b3r7b, int b3r8, int b3r9, int b3R13Aapr13, int b3R13Amei13, int b3R13Ajun13, int b3R13Ajul13, int b3R13Aagt13, int b3R13Asep13, int b3R13Aokt13, int b3R13Anov13, int b3R13Ades13, int b3R13Ajan14, int b3R13Afeb14, int b3R13Amar14, int b3r14, int b3r16, int b3r17a1, int b3r17b1, int b3r17c1a, int b3r17c1b, int b3r17c1c, int b3r17d1a, int b3r17d1b, int b3r17e1, int b3r17f1, int b3r17g1, int b3r17h1, int b3r17i1, int b3r17j1, int b3r17k1, int b3r17l1, int b3R17totalPengeluaran, int b3R17labarugi, int b3r18b1, int b3r18b2) {
        this.kKSArtNup = kKSArtNup;
        this.b3r1a = b3r1a;
        this.b3r1b = b3r1b;
        this.b3r2 = b3r2;
        this.b3r3 = b3r3;
        this.b3r4a = b3r4a;
        this.b3r4b = b3r4b;
        this.b3r7a = b3r7a;
        this.b3r7b = b3r7b;
        this.b3r8 = b3r8;
        this.b3r9 = b3r9;
        this.b3R13Aapr13 = b3R13Aapr13;
        this.b3R13Amei13 = b3R13Amei13;
        this.b3R13Ajun13 = b3R13Ajun13;
        this.b3R13Ajul13 = b3R13Ajul13;
        this.b3R13Aagt13 = b3R13Aagt13;
        this.b3R13Asep13 = b3R13Asep13;
        this.b3R13Aokt13 = b3R13Aokt13;
        this.b3R13Anov13 = b3R13Anov13;
        this.b3R13Ades13 = b3R13Ades13;
        this.b3R13Ajan14 = b3R13Ajan14;
        this.b3R13Afeb14 = b3R13Afeb14;
        this.b3R13Amar14 = b3R13Amar14;
        this.b3r14 = b3r14;
        this.b3r16 = b3r16;
        this.b3r17a1 = b3r17a1;
        this.b3r17b1 = b3r17b1;
        this.b3r17c1a = b3r17c1a;
        this.b3r17c1b = b3r17c1b;
        this.b3r17c1c = b3r17c1c;
        this.b3r17d1a = b3r17d1a;
        this.b3r17d1b = b3r17d1b;
        this.b3r17e1 = b3r17e1;
        this.b3r17f1 = b3r17f1;
        this.b3r17g1 = b3r17g1;
        this.b3r17h1 = b3r17h1;
        this.b3r17i1 = b3r17i1;
        this.b3r17j1 = b3r17j1;
        this.b3r17k1 = b3r17k1;
        this.b3r17l1 = b3r17l1;
        this.b3R17totalPengeluaran = b3R17totalPengeluaran;
        this.b3R17labarugi = b3R17labarugi;
        this.b3r18b1 = b3r18b1;
        this.b3r18b2 = b3r18b2;
    }

    public String getKKSArtNup() {
        return kKSArtNup;
    }

    public void setKKSArtNup(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public String getB3r1a() {
        return b3r1a;
    }

    public void setB3r1a(String b3r1a) {
        this.b3r1a = b3r1a;
    }

    public int getB3r1b() {
        return b3r1b;
    }

    public void setB3r1b(int b3r1b) {
        this.b3r1b = b3r1b;
    }

    public int getB3r2() {
        return b3r2;
    }

    public void setB3r2(int b3r2) {
        this.b3r2 = b3r2;
    }

    public int getB3r3() {
        return b3r3;
    }

    public void setB3r3(int b3r3) {
        this.b3r3 = b3r3;
    }

    public int getB3r4a() {
        return b3r4a;
    }

    public void setB3r4a(int b3r4a) {
        this.b3r4a = b3r4a;
    }

    public int getB3r4b() {
        return b3r4b;
    }

    public void setB3r4b(int b3r4b) {
        this.b3r4b = b3r4b;
    }

    public String getB3R5lainnya() {
        return b3R5lainnya;
    }

    public void setB3R5lainnya(String b3R5lainnya) {
        this.b3R5lainnya = b3R5lainnya;
    }

    public int getB3r7a() {
        return b3r7a;
    }

    public void setB3r7a(int b3r7a) {
        this.b3r7a = b3r7a;
    }

    public int getB3r7b() {
        return b3r7b;
    }

    public void setB3r7b(int b3r7b) {
        this.b3r7b = b3r7b;
    }

    public int getB3r8() {
        return b3r8;
    }

    public void setB3r8(int b3r8) {
        this.b3r8 = b3r8;
    }

    public int getB3r9() {
        return b3r9;
    }

    public void setB3r9(int b3r9) {
        this.b3r9 = b3r9;
    }

    public String getB3R11Elainnya() {
        return b3R11Elainnya;
    }

    public void setB3R11Elainnya(String b3R11Elainnya) {
        this.b3R11Elainnya = b3R11Elainnya;
    }

    public Integer getB3r12a() {
        return b3r12a;
    }

    public void setB3r12a(Integer b3r12a) {
        this.b3r12a = b3r12a;
    }

    public Integer getB3r12b() {
        return b3r12b;
    }

    public void setB3r12b(Integer b3r12b) {
        this.b3r12b = b3r12b;
    }

    public Integer getB3r12c() {
        return b3r12c;
    }

    public void setB3r12c(Integer b3r12c) {
        this.b3r12c = b3r12c;
    }

    public Integer getB3r12d() {
        return b3r12d;
    }

    public void setB3r12d(Integer b3r12d) {
        this.b3r12d = b3r12d;
    }

    public Integer getB3R12jumlah() {
        return b3R12jumlah;
    }

    public void setB3R12jumlah(Integer b3R12jumlah) {
        this.b3R12jumlah = b3R12jumlah;
    }

    public int getB3R13Aapr13() {
        return b3R13Aapr13;
    }

    public void setB3R13Aapr13(int b3R13Aapr13) {
        this.b3R13Aapr13 = b3R13Aapr13;
    }

    public int getB3R13Amei13() {
        return b3R13Amei13;
    }

    public void setB3R13Amei13(int b3R13Amei13) {
        this.b3R13Amei13 = b3R13Amei13;
    }

    public int getB3R13Ajun13() {
        return b3R13Ajun13;
    }

    public void setB3R13Ajun13(int b3R13Ajun13) {
        this.b3R13Ajun13 = b3R13Ajun13;
    }

    public int getB3R13Ajul13() {
        return b3R13Ajul13;
    }

    public void setB3R13Ajul13(int b3R13Ajul13) {
        this.b3R13Ajul13 = b3R13Ajul13;
    }

    public int getB3R13Aagt13() {
        return b3R13Aagt13;
    }

    public void setB3R13Aagt13(int b3R13Aagt13) {
        this.b3R13Aagt13 = b3R13Aagt13;
    }

    public int getB3R13Asep13() {
        return b3R13Asep13;
    }

    public void setB3R13Asep13(int b3R13Asep13) {
        this.b3R13Asep13 = b3R13Asep13;
    }

    public int getB3R13Aokt13() {
        return b3R13Aokt13;
    }

    public void setB3R13Aokt13(int b3R13Aokt13) {
        this.b3R13Aokt13 = b3R13Aokt13;
    }

    public int getB3R13Anov13() {
        return b3R13Anov13;
    }

    public void setB3R13Anov13(int b3R13Anov13) {
        this.b3R13Anov13 = b3R13Anov13;
    }

    public int getB3R13Ades13() {
        return b3R13Ades13;
    }

    public void setB3R13Ades13(int b3R13Ades13) {
        this.b3R13Ades13 = b3R13Ades13;
    }

    public int getB3R13Ajan14() {
        return b3R13Ajan14;
    }

    public void setB3R13Ajan14(int b3R13Ajan14) {
        this.b3R13Ajan14 = b3R13Ajan14;
    }

    public int getB3R13Afeb14() {
        return b3R13Afeb14;
    }

    public void setB3R13Afeb14(int b3R13Afeb14) {
        this.b3R13Afeb14 = b3R13Afeb14;
    }

    public int getB3R13Amar14() {
        return b3R13Amar14;
    }

    public void setB3R13Amar14(int b3R13Amar14) {
        this.b3R13Amar14 = b3R13Amar14;
    }

    public int getB3r14() {
        return b3r14;
    }

    public void setB3r14(int b3r14) {
        this.b3r14 = b3r14;
    }

    public int getB3r16() {
        return b3r16;
    }

    public void setB3r16(int b3r16) {
        this.b3r16 = b3r16;
    }

    public int getB3r17a1() {
        return b3r17a1;
    }

    public void setB3r17a1(int b3r17a1) {
        this.b3r17a1 = b3r17a1;
    }

    public int getB3r17b1() {
        return b3r17b1;
    }

    public void setB3r17b1(int b3r17b1) {
        this.b3r17b1 = b3r17b1;
    }

    public int getB3r17c1a() {
        return b3r17c1a;
    }

    public void setB3r17c1a(int b3r17c1a) {
        this.b3r17c1a = b3r17c1a;
    }

    public int getB3r17c1b() {
        return b3r17c1b;
    }

    public void setB3r17c1b(int b3r17c1b) {
        this.b3r17c1b = b3r17c1b;
    }

    public int getB3r17c1c() {
        return b3r17c1c;
    }

    public void setB3r17c1c(int b3r17c1c) {
        this.b3r17c1c = b3r17c1c;
    }

    public int getB3r17d1a() {
        return b3r17d1a;
    }

    public void setB3r17d1a(int b3r17d1a) {
        this.b3r17d1a = b3r17d1a;
    }

    public int getB3r17d1b() {
        return b3r17d1b;
    }

    public void setB3r17d1b(int b3r17d1b) {
        this.b3r17d1b = b3r17d1b;
    }

    public int getB3r17e1() {
        return b3r17e1;
    }

    public void setB3r17e1(int b3r17e1) {
        this.b3r17e1 = b3r17e1;
    }

    public int getB3r17f1() {
        return b3r17f1;
    }

    public void setB3r17f1(int b3r17f1) {
        this.b3r17f1 = b3r17f1;
    }

    public int getB3r17g1() {
        return b3r17g1;
    }

    public void setB3r17g1(int b3r17g1) {
        this.b3r17g1 = b3r17g1;
    }

    public int getB3r17h1() {
        return b3r17h1;
    }

    public void setB3r17h1(int b3r17h1) {
        this.b3r17h1 = b3r17h1;
    }

    public int getB3r17i1() {
        return b3r17i1;
    }

    public void setB3r17i1(int b3r17i1) {
        this.b3r17i1 = b3r17i1;
    }

    public int getB3r17j1() {
        return b3r17j1;
    }

    public void setB3r17j1(int b3r17j1) {
        this.b3r17j1 = b3r17j1;
    }

    public int getB3r17k1() {
        return b3r17k1;
    }

    public void setB3r17k1(int b3r17k1) {
        this.b3r17k1 = b3r17k1;
    }

    public int getB3r17l1() {
        return b3r17l1;
    }

    public void setB3r17l1(int b3r17l1) {
        this.b3r17l1 = b3r17l1;
    }

    public int getB3R17totalPengeluaran() {
        return b3R17totalPengeluaran;
    }

    public void setB3R17totalPengeluaran(int b3R17totalPengeluaran) {
        this.b3R17totalPengeluaran = b3R17totalPengeluaran;
    }

    public int getB3R17labarugi() {
        return b3R17labarugi;
    }

    public void setB3R17labarugi(int b3R17labarugi) {
        this.b3R17labarugi = b3R17labarugi;
    }

    public int getB3r18b1() {
        return b3r18b1;
    }

    public void setB3r18b1(int b3r18b1) {
        this.b3r18b1 = b3r18b1;
    }

    public int getB3r18b2() {
        return b3r18b2;
    }

    public void setB3r18b2(int b3r18b2) {
        this.b3r18b2 = b3r18b2;
    }

    public String getB3r18a() {
        return b3r18a;
    }

    public void setB3r18a(String b3r18a) {
        this.b3r18a = b3r18a;
    }

    public String getB3R19utama() {
        return b3R19utama;
    }

    public void setB3R19utama(String b3R19utama) {
        this.b3R19utama = b3R19utama;
    }

    public String getB3R19lainnya() {
        return b3R19lainnya;
    }

    public void setB3R19lainnya(String b3R19lainnya) {
        this.b3R19lainnya = b3R19lainnya;
    }

    public String getB3R19lainnyasebutkan() {
        return b3R19lainnyasebutkan;
    }

    public void setB3R19lainnyasebutkan(String b3R19lainnyasebutkan) {
        this.b3R19lainnyasebutkan = b3R19lainnyasebutkan;
    }

    public String getB3r20a() {
        return b3r20a;
    }

    public void setB3r20a(String b3r20a) {
        this.b3r20a = b3r20a;
    }

    public String getB3r20b() {
        return b3r20b;
    }

    public void setB3r20b(String b3r20b) {
        this.b3r20b = b3r20b;
    }

    public String getB3R21lainnya() {
        return b3R21lainnya;
    }

    public void setB3R21lainnya(String b3R21lainnya) {
        this.b3R21lainnya = b3R21lainnya;
    }

    public String getB3r22a() {
        return b3r22a;
    }

    public void setB3r22a(String b3r22a) {
        this.b3r22a = b3r22a;
    }

    public String getB3R22Blainnya() {
        return b3R22Blainnya;
    }

    public void setB3R22Blainnya(String b3R22Blainnya) {
        this.b3R22Blainnya = b3R22Blainnya;
    }

    public String getB3r22c() {
        return b3r22c;
    }

    public void setB3r22c(String b3r22c) {
        this.b3r22c = b3r22c;
    }

    public String getB3R22Dlainnya() {
        return b3R22Dlainnya;
    }

    public void setB3R22Dlainnya(String b3R22Dlainnya) {
        this.b3R22Dlainnya = b3R22Dlainnya;
    }

    public String getB3r22e() {
        return b3r22e;
    }

    public void setB3r22e(String b3r22e) {
        this.b3r22e = b3r22e;
    }

    public String getB3R22Flainnya() {
        return b3R22Flainnya;
    }

    public void setB3R22Flainnya(String b3R22Flainnya) {
        this.b3R22Flainnya = b3R22Flainnya;
    }

    public String getB3r22g1() {
        return b3r22g1;
    }

    public void setB3r22g1(String b3r22g1) {
        this.b3r22g1 = b3r22g1;
    }

    public String getB3r22g2() {
        return b3r22g2;
    }

    public void setB3r22g2(String b3r22g2) {
        this.b3r22g2 = b3r22g2;
    }

    public String getB3r22g3() {
        return b3r22g3;
    }

    public void setB3r22g3(String b3r22g3) {
        this.b3r22g3 = b3r22g3;
    }

    public String getB3r22g4() {
        return b3r22g4;
    }

    public void setB3r22g4(String b3r22g4) {
        this.b3r22g4 = b3r22g4;
    }

    public String getB3r22g5() {
        return b3r22g5;
    }

    public void setB3r22g5(String b3r22g5) {
        this.b3r22g5 = b3r22g5;
    }

    public String getB3r22g6() {
        return b3r22g6;
    }

    public void setB3r22g6(String b3r22g6) {
        this.b3r22g6 = b3r22g6;
    }

    public String getB3r22g7() {
        return b3r22g7;
    }

    public void setB3r22g7(String b3r22g7) {
        this.b3r22g7 = b3r22g7;
    }

    public String getB3r22g8() {
        return b3r22g8;
    }

    public void setB3r22g8(String b3r22g8) {
        this.b3r22g8 = b3r22g8;
    }

    public String getB3R22G9lainnya() {
        return b3R22G9lainnya;
    }

    public void setB3R22G9lainnya(String b3R22G9lainnya) {
        this.b3R22G9lainnya = b3R22G9lainnya;
    }

    public String getB3R23ALainnya() {
        return b3R23ALainnya;
    }

    public void setB3R23ALainnya(String b3R23ALainnya) {
        this.b3R23ALainnya = b3R23ALainnya;
    }

    public String getB3r23b1() {
        return b3r23b1;
    }

    public void setB3r23b1(String b3r23b1) {
        this.b3r23b1 = b3r23b1;
    }

    public String getB3r23b2() {
        return b3r23b2;
    }

    public void setB3r23b2(String b3r23b2) {
        this.b3r23b2 = b3r23b2;
    }

    public String getB3r23b3() {
        return b3r23b3;
    }

    public void setB3r23b3(String b3r23b3) {
        this.b3r23b3 = b3r23b3;
    }

    public String getB3r23b4() {
        return b3r23b4;
    }

    public void setB3r23b4(String b3r23b4) {
        this.b3r23b4 = b3r23b4;
    }

    public String getB3r23b5() {
        return b3r23b5;
    }

    public void setB3r23b5(String b3r23b5) {
        this.b3r23b5 = b3r23b5;
    }

    public String getB3r23b6() {
        return b3r23b6;
    }

    public void setB3r23b6(String b3r23b6) {
        this.b3r23b6 = b3r23b6;
    }

    public String getB3r23b7() {
        return b3r23b7;
    }

    public void setB3r23b7(String b3r23b7) {
        this.b3r23b7 = b3r23b7;
    }

    public String getB3r23b8() {
        return b3r23b8;
    }

    public void setB3r23b8(String b3r23b8) {
        this.b3r23b8 = b3r23b8;
    }

    public String getB3r23b9() {
        return b3r23b9;
    }

    public void setB3r23b9(String b3r23b9) {
        this.b3r23b9 = b3r23b9;
    }

    public String getB3r23b10() {
        return b3r23b10;
    }

    public void setB3r23b10(String b3r23b10) {
        this.b3r23b10 = b3r23b10;
    }

    public String getB3r23b11() {
        return b3r23b11;
    }

    public void setB3r23b11(String b3r23b11) {
        this.b3r23b11 = b3r23b11;
    }

    public String getB3R23B12lainnya() {
        return b3R23B12lainnya;
    }

    public void setB3R23B12lainnya(String b3R23B12lainnya) {
        this.b3R23B12lainnya = b3R23B12lainnya;
    }

    public String getB3r24() {
        return b3r24;
    }

    public void setB3r24(String b3r24) {
        this.b3r24 = b3r24;
    }

    public String getB3r25a() {
        return b3r25a;
    }

    public void setB3r25a(String b3r25a) {
        this.b3r25a = b3r25a;
    }

    public String getB3r25b() {
        return b3r25b;
    }

    public void setB3r25b(String b3r25b) {
        this.b3r25b = b3r25b;
    }

    public String getB3r25c() {
        return b3r25c;
    }

    public void setB3r25c(String b3r25c) {
        this.b3r25c = b3r25c;
    }

    public String getB3r25d() {
        return b3r25d;
    }

    public void setB3r25d(String b3r25d) {
        this.b3r25d = b3r25d;
    }

    public String getB3r25e() {
        return b3r25e;
    }

    public void setB3r25e(String b3r25e) {
        this.b3r25e = b3r25e;
    }

    public String getB3r25f() {
        return b3r25f;
    }

    public void setB3r25f(String b3r25f) {
        this.b3r25f = b3r25f;
    }

    public String getB3r25g() {
        return b3r25g;
    }

    public void setB3r25g(String b3r25g) {
        this.b3r25g = b3r25g;
    }

    public String getB3r25h() {
        return b3r25h;
    }

    public void setB3r25h(String b3r25h) {
        this.b3r25h = b3r25h;
    }

    public String getB3r25i() {
        return b3r25i;
    }

    public void setB3r25i(String b3r25i) {
        this.b3r25i = b3r25i;
    }

    public String getB3r25j() {
        return b3r25j;
    }

    public void setB3r25j(String b3r25j) {
        this.b3r25j = b3r25j;
    }

    public String getB3r25k() {
        return b3r25k;
    }

    public void setB3r25k(String b3r25k) {
        this.b3r25k = b3r25k;
    }

    public String getB3r25l() {
        return b3r25l;
    }

    public void setB3r25l(String b3r25l) {
        this.b3r25l = b3r25l;
    }

    public String getB3R25Mlainnya() {
        return b3R25Mlainnya;
    }

    public void setB3R25Mlainnya(String b3R25Mlainnya) {
        this.b3R25Mlainnya = b3R25Mlainnya;
    }

    public String getB3R26lainnya() {
        return b3R26lainnya;
    }

    public void setB3R26lainnya(String b3R26lainnya) {
        this.b3R26lainnya = b3R26lainnya;
    }

    public String getB3r27a() {
        return b3r27a;
    }

    public void setB3r27a(String b3r27a) {
        this.b3r27a = b3r27a;
    }

    public String getB3r27b() {
        return b3r27b;
    }

    public void setB3r27b(String b3r27b) {
        this.b3r27b = b3r27b;
    }

    public String getB3r27c() {
        return b3r27c;
    }

    public void setB3r27c(String b3r27c) {
        this.b3r27c = b3r27c;
    }

    public String getB3r27d() {
        return b3r27d;
    }

    public void setB3r27d(String b3r27d) {
        this.b3r27d = b3r27d;
    }

    public String getB3r27e() {
        return b3r27e;
    }

    public void setB3r27e(String b3r27e) {
        this.b3r27e = b3r27e;
    }

    public String getB3r27f() {
        return b3r27f;
    }

    public void setB3r27f(String b3r27f) {
        this.b3r27f = b3r27f;
    }

    public String getB3r27g() {
        return b3r27g;
    }

    public void setB3r27g(String b3r27g) {
        this.b3r27g = b3r27g;
    }

    public String getB3r27h() {
        return b3r27h;
    }

    public void setB3r27h(String b3r27h) {
        this.b3r27h = b3r27h;
    }

    public String getB3r27i() {
        return b3r27i;
    }

    public void setB3r27i(String b3r27i) {
        this.b3r27i = b3r27i;
    }

    public String getB3R27Jlainnya() {
        return b3R27Jlainnya;
    }

    public void setB3R27Jlainnya(String b3R27Jlainnya) {
        this.b3R27Jlainnya = b3R27Jlainnya;
    }

    public String getB3r28() {
        return b3r28;
    }

    public void setB3r28(String b3r28) {
        this.b3r28 = b3r28;
    }

    public String getB3r29a() {
        return b3r29a;
    }

    public void setB3r29a(String b3r29a) {
        this.b3r29a = b3r29a;
    }

    public String getB3r29b() {
        return b3r29b;
    }

    public void setB3r29b(String b3r29b) {
        this.b3r29b = b3r29b;
    }

    public String getB3r29c() {
        return b3r29c;
    }

    public void setB3r29c(String b3r29c) {
        this.b3r29c = b3r29c;
    }

    public String getB3r30a() {
        return b3r30a;
    }

    public void setB3r30a(String b3r30a) {
        this.b3r30a = b3r30a;
    }

    public String getB3r30b() {
        return b3r30b;
    }

    public void setB3r30b(String b3r30b) {
        this.b3r30b = b3r30b;
    }

    public String getB3r30c() {
        return b3r30c;
    }

    public void setB3r30c(String b3r30c) {
        this.b3r30c = b3r30c;
    }

    public String getB3r30d() {
        return b3r30d;
    }

    public void setB3r30d(String b3r30d) {
        this.b3r30d = b3r30d;
    }

    public String getB3r30e() {
        return b3r30e;
    }

    public void setB3r30e(String b3r30e) {
        this.b3r30e = b3r30e;
    }

    public String getB3r30f() {
        return b3r30f;
    }

    public void setB3r30f(String b3r30f) {
        this.b3r30f = b3r30f;
    }

    public String getB3r30g() {
        return b3r30g;
    }

    public void setB3r30g(String b3r30g) {
        this.b3r30g = b3r30g;
    }

    public String getB3r31() {
        return b3r31;
    }

    public void setB3r31(String b3r31) {
        this.b3r31 = b3r31;
    }

    public Integer getB3r32() {
        return b3r32;
    }

    public void setB3r32(Integer b3r32) {
        this.b3r32 = b3r32;
    }

    public String getB3r33() {
        return b3r33;
    }

    public void setB3r33(String b3r33) {
        this.b3r33 = b3r33;
    }

    public OpsiB3r36 getB3r36() {
        return b3r36;
    }

    public void setB3r36(OpsiB3r36 b3r36) {
        this.b3r36 = b3r36;
    }

    public B2Art getKKSArt() {
        return kKSArt;
    }

    public void setKKSArt(B2Art kKSArt) {
        this.kKSArt = kKSArt;
    }

    public OpsiB3R34R35 getB3r34() {
        return b3r34;
    }

    public void setB3r34(OpsiB3R34R35 b3r34) {
        this.b3r34 = b3r34;
    }

    public OpsiB3r10 getB3r10() {
        return b3r10;
    }

    public void setB3r10(OpsiB3r10 b3r10) {
        this.b3r10 = b3r10;
    }

    public OpsiB3r22b getB3r22b() {
        return b3r22b;
    }

    public void setB3r22b(OpsiB3r22b b3r22b) {
        this.b3r22b = b3r22b;
    }

    public OpsiB3r23a getB3r23a() {
        return b3r23a;
    }

    public void setB3r23a(OpsiB3r23a b3r23a) {
        this.b3r23a = b3r23a;
    }

    public OpsiB3r13b getB3R13Bmei13() {
        return b3R13Bmei13;
    }

    public void setB3R13Bmei13(OpsiB3r13b b3R13Bmei13) {
        this.b3R13Bmei13 = b3R13Bmei13;
    }

    public OpsiB3r6 getB3r6() {
        return b3r6;
    }

    public void setB3r6(OpsiB3r6 b3r6) {
        this.b3r6 = b3r6;
    }

    public OpsiB3R34R35 getB3r35() {
        return b3r35;
    }

    public void setB3r35(OpsiB3R34R35 b3r35) {
        this.b3r35 = b3r35;
    }

    public OpsiB3r13b getB3R13Bjul13() {
        return b3R13Bjul13;
    }

    public void setB3R13Bjul13(OpsiB3r13b b3R13Bjul13) {
        this.b3R13Bjul13 = b3R13Bjul13;
    }

    public OpsiB3r13b getB3R13Bapr13() {
        return b3R13Bapr13;
    }

    public void setB3R13Bapr13(OpsiB3r13b b3R13Bapr13) {
        this.b3R13Bapr13 = b3R13Bapr13;
    }

    public B2Umumusaha getB2Umumusaha() {
        return b2Umumusaha;
    }

    public void setB2Umumusaha(B2Umumusaha b2Umumusaha) {
        this.b2Umumusaha = b2Umumusaha;
    }

    public OpsiB3r13b getB3R13Bokt13() {
        return b3R13Bokt13;
    }

    public void setB3R13Bokt13(OpsiB3r13b b3R13Bokt13) {
        this.b3R13Bokt13 = b3R13Bokt13;
    }

    public OpsiB3r5 getB3r5() {
        return b3r5;
    }

    public void setB3r5(OpsiB3r5 b3r5) {
        this.b3r5 = b3r5;
    }

    public OpsiYaTidakTidaktau getB3r11d() {
        return b3r11d;
    }

    public void setB3r11d(OpsiYaTidakTidaktau b3r11d) {
        this.b3r11d = b3r11d;
    }

    public OpsiB3r13b getB3R13Bnov13() {
        return b3R13Bnov13;
    }

    public void setB3R13Bnov13(OpsiB3r13b b3R13Bnov13) {
        this.b3R13Bnov13 = b3R13Bnov13;
    }

    public OpsiB3r22f getB3r22f() {
        return b3r22f;
    }

    public void setB3r22f(OpsiB3r22f b3r22f) {
        this.b3r22f = b3r22f;
    }

    public OpsiB3r13b getB3R13Bagt13() {
        return b3R13Bagt13;
    }

    public void setB3R13Bagt13(OpsiB3r13b b3R13Bagt13) {
        this.b3R13Bagt13 = b3R13Bagt13;
    }

    public OpsiB3r22d getB3r22d() {
        return b3r22d;
    }

    public void setB3r22d(OpsiB3r22d b3r22d) {
        this.b3r22d = b3r22d;
    }

    public OpsiYaTidakTidaktau getB3r11a() {
        return b3r11a;
    }

    public void setB3r11a(OpsiYaTidakTidaktau b3r11a) {
        this.b3r11a = b3r11a;
    }

    public OpsiB3r13b getB3R13Bsep13() {
        return b3R13Bsep13;
    }

    public void setB3R13Bsep13(OpsiB3r13b b3R13Bsep13) {
        this.b3R13Bsep13 = b3R13Bsep13;
    }

    public OpsiB3r26 getB3r26() {
        return b3r26;
    }

    public void setB3r26(OpsiB3r26 b3r26) {
        this.b3r26 = b3r26;
    }

    public OpsiYaTidakTidaktau getB3r11c() {
        return b3r11c;
    }

    public void setB3r11c(OpsiYaTidakTidaktau b3r11c) {
        this.b3r11c = b3r11c;
    }

    public OpsiB3r13b getB3R13Bdes13() {
        return b3R13Bdes13;
    }

    public void setB3R13Bdes13(OpsiB3r13b b3R13Bdes13) {
        this.b3R13Bdes13 = b3R13Bdes13;
    }

    public OpsiB3r13b getB3R13Bjan14() {
        return b3R13Bjan14;
    }

    public void setB3R13Bjan14(OpsiB3r13b b3R13Bjan14) {
        this.b3R13Bjan14 = b3R13Bjan14;
    }

    public OpsiB3r13b getB3R13Bfeb14() {
        return b3R13Bfeb14;
    }

    public void setB3R13Bfeb14(OpsiB3r13b b3R13Bfeb14) {
        this.b3R13Bfeb14 = b3R13Bfeb14;
    }

    public OpsiB3r13b getB3R13Bjun13() {
        return b3R13Bjun13;
    }

    public void setB3R13Bjun13(OpsiB3r13b b3R13Bjun13) {
        this.b3R13Bjun13 = b3R13Bjun13;
    }

    public OpsiB3r13b getB3R13Bmar14() {
        return b3R13Bmar14;
    }

    public void setB3R13Bmar14(OpsiB3r13b b3R13Bmar14) {
        this.b3R13Bmar14 = b3R13Bmar14;
    }

    public OpsiB3r21 getB3r21() {
        return b3r21;
    }

    public void setB3r21(OpsiB3r21 b3r21) {
        this.b3r21 = b3r21;
    }

    public OpsiYaTidakTidaktau getB3r11b() {
        return b3r11b;
    }

    public void setB3r11b(OpsiYaTidakTidaktau b3r11b) {
        this.b3r11b = b3r11b;
    }

    @XmlTransient
    public List<B3r15Pekerja> getB3r15PekerjaList() {
        return b3r15PekerjaList;
    }

    public void setB3r15PekerjaList(List<B3r15Pekerja> b3r15PekerjaList) {
        this.b3r15PekerjaList = b3r15PekerjaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kKSArtNup != null ? kKSArtNup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B3Rinciusaha)) {
            return false;
        }
        B3Rinciusaha other = (B3Rinciusaha) object;
        if ((this.kKSArtNup == null && other.kKSArtNup != null) || (this.kKSArtNup != null && !this.kKSArtNup.equals(other.kKSArtNup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B3Rinciusaha[ kKSArtNup=" + kKSArtNup + " ]";
    }
    
}
