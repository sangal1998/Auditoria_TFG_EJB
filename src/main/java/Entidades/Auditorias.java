/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jmcastellano
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditorias.findAll", query = "SELECT a FROM Auditorias a")
    , @NamedQuery(name = "Auditorias.findByIdFichero", query = "SELECT a FROM Auditorias a WHERE a.auditoriasPK.idFichero = :idFichero")
    , @NamedQuery(name = "Auditorias.findByFecha", query = "SELECT a FROM Auditorias a WHERE a.auditoriasPK.fecha = :fecha")
    , @NamedQuery(name = "Auditorias.findByFicheroFecha", query = "SELECT a FROM Auditorias a WHERE a.auditoriasPK.fecha = :fecha and a.auditoriasPK.idFichero = :idFichero")
    , @NamedQuery(name = "Auditorias.findByP1", query = "SELECT a FROM Auditorias a WHERE a.p1 = :p1")
    , @NamedQuery(name = "Auditorias.findByP2", query = "SELECT a FROM Auditorias a WHERE a.p2 = :p2")
    , @NamedQuery(name = "Auditorias.findByP3", query = "SELECT a FROM Auditorias a WHERE a.p3 = :p3")
    , @NamedQuery(name = "Auditorias.findByP4", query = "SELECT a FROM Auditorias a WHERE a.p4 = :p4")
    , @NamedQuery(name = "Auditorias.findByP5", query = "SELECT a FROM Auditorias a WHERE a.p5 = :p5")
    , @NamedQuery(name = "Auditorias.findByP6", query = "SELECT a FROM Auditorias a WHERE a.p6 = :p6")
    , @NamedQuery(name = "Auditorias.findByP7", query = "SELECT a FROM Auditorias a WHERE a.p7 = :p7")
    , @NamedQuery(name = "Auditorias.findByP8", query = "SELECT a FROM Auditorias a WHERE a.p8 = :p8")
    , @NamedQuery(name = "Auditorias.findByP9", query = "SELECT a FROM Auditorias a WHERE a.p9 = :p9")
    , @NamedQuery(name = "Auditorias.findByP10", query = "SELECT a FROM Auditorias a WHERE a.p10 = :p10")
    , @NamedQuery(name = "Auditorias.findByP11", query = "SELECT a FROM Auditorias a WHERE a.p11 = :p11")
    , @NamedQuery(name = "Auditorias.findByP12", query = "SELECT a FROM Auditorias a WHERE a.p12 = :p12")
    , @NamedQuery(name = "Auditorias.findByP13", query = "SELECT a FROM Auditorias a WHERE a.p13 = :p13")
    , @NamedQuery(name = "Auditorias.findByP14", query = "SELECT a FROM Auditorias a WHERE a.p14 = :p14")
    , @NamedQuery(name = "Auditorias.findByP15", query = "SELECT a FROM Auditorias a WHERE a.p15 = :p15")
    , @NamedQuery(name = "Auditorias.findByP16", query = "SELECT a FROM Auditorias a WHERE a.p16 = :p16")
    , @NamedQuery(name = "Auditorias.findByP17", query = "SELECT a FROM Auditorias a WHERE a.p17 = :p17")
    , @NamedQuery(name = "Auditorias.findByP18", query = "SELECT a FROM Auditorias a WHERE a.p18 = :p18")
    , @NamedQuery(name = "Auditorias.findByP19", query = "SELECT a FROM Auditorias a WHERE a.p19 = :p19")
    , @NamedQuery(name = "Auditorias.findByP20", query = "SELECT a FROM Auditorias a WHERE a.p20 = :p20")
    , @NamedQuery(name = "Auditorias.findByP21", query = "SELECT a FROM Auditorias a WHERE a.p21 = :p21")
    , @NamedQuery(name = "Auditorias.findByP22", query = "SELECT a FROM Auditorias a WHERE a.p22 = :p22")
    , @NamedQuery(name = "Auditorias.findByP23", query = "SELECT a FROM Auditorias a WHERE a.p23 = :p23")
    , @NamedQuery(name = "Auditorias.findByP24", query = "SELECT a FROM Auditorias a WHERE a.p24 = :p24")
    , @NamedQuery(name = "Auditorias.findByP25", query = "SELECT a FROM Auditorias a WHERE a.p25 = :p25")
    , @NamedQuery(name = "Auditorias.findByP26", query = "SELECT a FROM Auditorias a WHERE a.p26 = :p26")
    , @NamedQuery(name = "Auditorias.findByP27", query = "SELECT a FROM Auditorias a WHERE a.p27 = :p27")
    , @NamedQuery(name = "Auditorias.findByP28", query = "SELECT a FROM Auditorias a WHERE a.p28 = :p28")
    , @NamedQuery(name = "Auditorias.findByP29", query = "SELECT a FROM Auditorias a WHERE a.p29 = :p29")
    , @NamedQuery(name = "Auditorias.findByP30", query = "SELECT a FROM Auditorias a WHERE a.p30 = :p30")
    , @NamedQuery(name = "Auditorias.findByP31", query = "SELECT a FROM Auditorias a WHERE a.p31 = :p31")
    , @NamedQuery(name = "Auditorias.findByP32", query = "SELECT a FROM Auditorias a WHERE a.p32 = :p32")
    , @NamedQuery(name = "Auditorias.findByP33", query = "SELECT a FROM Auditorias a WHERE a.p33 = :p33")
    , @NamedQuery(name = "Auditorias.findByP34", query = "SELECT a FROM Auditorias a WHERE a.p34 = :p34")
    , @NamedQuery(name = "Auditorias.findByP35", query = "SELECT a FROM Auditorias a WHERE a.p35 = :p35")
    , @NamedQuery(name = "Auditorias.findByP36", query = "SELECT a FROM Auditorias a WHERE a.p36 = :p36")
    , @NamedQuery(name = "Auditorias.findByP37", query = "SELECT a FROM Auditorias a WHERE a.p37 = :p37")
    , @NamedQuery(name = "Auditorias.findByP38", query = "SELECT a FROM Auditorias a WHERE a.p38 = :p38")
    , @NamedQuery(name = "Auditorias.findByP39", query = "SELECT a FROM Auditorias a WHERE a.p39 = :p39")
    , @NamedQuery(name = "Auditorias.findByP40", query = "SELECT a FROM Auditorias a WHERE a.p40 = :p40")
    , @NamedQuery(name = "Auditorias.findByP41", query = "SELECT a FROM Auditorias a WHERE a.p41 = :p41")
    , @NamedQuery(name = "Auditorias.findByP42", query = "SELECT a FROM Auditorias a WHERE a.p42 = :p42")
    , @NamedQuery(name = "Auditorias.findByP43", query = "SELECT a FROM Auditorias a WHERE a.p43 = :p43")
    , @NamedQuery(name = "Auditorias.findByP44", query = "SELECT a FROM Auditorias a WHERE a.p44 = :p44")
    , @NamedQuery(name = "Auditorias.findByP45", query = "SELECT a FROM Auditorias a WHERE a.p45 = :p45")
    , @NamedQuery(name = "Auditorias.findByP46", query = "SELECT a FROM Auditorias a WHERE a.p46 = :p46")
    , @NamedQuery(name = "Auditorias.findByP47", query = "SELECT a FROM Auditorias a WHERE a.p47 = :p47")
    , @NamedQuery(name = "Auditorias.findByP48", query = "SELECT a FROM Auditorias a WHERE a.p48 = :p48")
    , @NamedQuery(name = "Auditorias.findByP49", query = "SELECT a FROM Auditorias a WHERE a.p49 = :p49")
    , @NamedQuery(name = "Auditorias.findByP50", query = "SELECT a FROM Auditorias a WHERE a.p50 = :p50")
    , @NamedQuery(name = "Auditorias.findByP51", query = "SELECT a FROM Auditorias a WHERE a.p51 = :p51")
    , @NamedQuery(name = "Auditorias.findByP52", query = "SELECT a FROM Auditorias a WHERE a.p52 = :p52")
    , @NamedQuery(name = "Auditorias.findByP53", query = "SELECT a FROM Auditorias a WHERE a.p53 = :p53")
    , @NamedQuery(name = "Auditorias.findByP54", query = "SELECT a FROM Auditorias a WHERE a.p54 = :p54")
    , @NamedQuery(name = "Auditorias.findByP55", query = "SELECT a FROM Auditorias a WHERE a.p55 = :p55")
    , @NamedQuery(name = "Auditorias.findByP56", query = "SELECT a FROM Auditorias a WHERE a.p56 = :p56")
    , @NamedQuery(name = "Auditorias.findByP57", query = "SELECT a FROM Auditorias a WHERE a.p57 = :p57")
    , @NamedQuery(name = "Auditorias.findByP58", query = "SELECT a FROM Auditorias a WHERE a.p58 = :p58")
    , @NamedQuery(name = "Auditorias.findByP59", query = "SELECT a FROM Auditorias a WHERE a.p59 = :p59")
    , @NamedQuery(name = "Auditorias.findByP60", query = "SELECT a FROM Auditorias a WHERE a.p60 = :p60")
    , @NamedQuery(name = "Auditorias.findByP61", query = "SELECT a FROM Auditorias a WHERE a.p61 = :p61")
    , @NamedQuery(name = "Auditorias.findByP62", query = "SELECT a FROM Auditorias a WHERE a.p62 = :p62")
    , @NamedQuery(name = "Auditorias.findByP63", query = "SELECT a FROM Auditorias a WHERE a.p63 = :p63")
    , @NamedQuery(name = "Auditorias.findByP64", query = "SELECT a FROM Auditorias a WHERE a.p64 = :p64")
    , @NamedQuery(name = "Auditorias.findByP65", query = "SELECT a FROM Auditorias a WHERE a.p65 = :p65")
    , @NamedQuery(name = "Auditorias.findByP66", query = "SELECT a FROM Auditorias a WHERE a.p66 = :p66")
    , @NamedQuery(name = "Auditorias.findByP67", query = "SELECT a FROM Auditorias a WHERE a.p67 = :p67")
    , @NamedQuery(name = "Auditorias.findByP68", query = "SELECT a FROM Auditorias a WHERE a.p68 = :p68")
    , @NamedQuery(name = "Auditorias.findByP69", query = "SELECT a FROM Auditorias a WHERE a.p69 = :p69")
    , @NamedQuery(name = "Auditorias.findByP70", query = "SELECT a FROM Auditorias a WHERE a.p70 = :p70")
    , @NamedQuery(name = "Auditorias.findByP71", query = "SELECT a FROM Auditorias a WHERE a.p71 = :p71")
    , @NamedQuery(name = "Auditorias.findByP72", query = "SELECT a FROM Auditorias a WHERE a.p72 = :p72")
    , @NamedQuery(name = "Auditorias.findByP73", query = "SELECT a FROM Auditorias a WHERE a.p73 = :p73")
    , @NamedQuery(name = "Auditorias.findByP74", query = "SELECT a FROM Auditorias a WHERE a.p74 = :p74")
    , @NamedQuery(name = "Auditorias.findByP75", query = "SELECT a FROM Auditorias a WHERE a.p75 = :p75")
    , @NamedQuery(name = "Auditorias.findByP76", query = "SELECT a FROM Auditorias a WHERE a.p76 = :p76")
    , @NamedQuery(name = "Auditorias.findByP77", query = "SELECT a FROM Auditorias a WHERE a.p77 = :p77")
    , @NamedQuery(name = "Auditorias.findByP78", query = "SELECT a FROM Auditorias a WHERE a.p78 = :p78")
    , @NamedQuery(name = "Auditorias.findByP79", query = "SELECT a FROM Auditorias a WHERE a.p79 = :p79")
    , @NamedQuery(name = "Auditorias.findByP80", query = "SELECT a FROM Auditorias a WHERE a.p80 = :p80")
    , @NamedQuery(name = "Auditorias.findByP81", query = "SELECT a FROM Auditorias a WHERE a.p81 = :p81")
    , @NamedQuery(name = "Auditorias.findByP82", query = "SELECT a FROM Auditorias a WHERE a.p82 = :p82")
    , @NamedQuery(name = "Auditorias.findByP83", query = "SELECT a FROM Auditorias a WHERE a.p83 = :p83")
    , @NamedQuery(name = "Auditorias.findByP84", query = "SELECT a FROM Auditorias a WHERE a.p84 = :p84")
    , @NamedQuery(name = "Auditorias.findByP85", query = "SELECT a FROM Auditorias a WHERE a.p85 = :p85")
    , @NamedQuery(name = "Auditorias.findByP86", query = "SELECT a FROM Auditorias a WHERE a.p86 = :p86")
    , @NamedQuery(name = "Auditorias.findByP87", query = "SELECT a FROM Auditorias a WHERE a.p87 = :p87")
    , @NamedQuery(name = "Auditorias.findByP88", query = "SELECT a FROM Auditorias a WHERE a.p88 = :p88")
    , @NamedQuery(name = "Auditorias.findByP89", query = "SELECT a FROM Auditorias a WHERE a.p89 = :p89")
    , @NamedQuery(name = "Auditorias.findByP90", query = "SELECT a FROM Auditorias a WHERE a.p90 = :p90")
    , @NamedQuery(name = "Auditorias.findByP91", query = "SELECT a FROM Auditorias a WHERE a.p91 = :p91")
    , @NamedQuery(name = "Auditorias.findByP92", query = "SELECT a FROM Auditorias a WHERE a.p92 = :p92")
    , @NamedQuery(name = "Auditorias.findByP93", query = "SELECT a FROM Auditorias a WHERE a.p93 = :p93")
    , @NamedQuery(name = "Auditorias.findByP94", query = "SELECT a FROM Auditorias a WHERE a.p94 = :p94")
    , @NamedQuery(name = "Auditorias.findByP95", query = "SELECT a FROM Auditorias a WHERE a.p95 = :p95")
    , @NamedQuery(name = "Auditorias.findByP96", query = "SELECT a FROM Auditorias a WHERE a.p96 = :p96")
    , @NamedQuery(name = "Auditorias.findByP97", query = "SELECT a FROM Auditorias a WHERE a.p97 = :p97")
    , @NamedQuery(name = "Auditorias.findByP98", query = "SELECT a FROM Auditorias a WHERE a.p98 = :p98")
    , @NamedQuery(name = "Auditorias.findByP99", query = "SELECT a FROM Auditorias a WHERE a.p99 = :p99")
    , @NamedQuery(name = "Auditorias.findByP100", query = "SELECT a FROM Auditorias a WHERE a.p100 = :p100")
    , @NamedQuery(name = "Auditorias.findByP101", query = "SELECT a FROM Auditorias a WHERE a.p101 = :p101")
    , @NamedQuery(name = "Auditorias.findByP102", query = "SELECT a FROM Auditorias a WHERE a.p102 = :p102")
    , @NamedQuery(name = "Auditorias.findByP103", query = "SELECT a FROM Auditorias a WHERE a.p103 = :p103")
    , @NamedQuery(name = "Auditorias.findByP104", query = "SELECT a FROM Auditorias a WHERE a.p104 = :p104")
    , @NamedQuery(name = "Auditorias.findByP105", query = "SELECT a FROM Auditorias a WHERE a.p105 = :p105")
    , @NamedQuery(name = "Auditorias.findByP106", query = "SELECT a FROM Auditorias a WHERE a.p106 = :p106")
    , @NamedQuery(name = "Auditorias.findByP107", query = "SELECT a FROM Auditorias a WHERE a.p107 = :p107")
    , @NamedQuery(name = "Auditorias.findByP108", query = "SELECT a FROM Auditorias a WHERE a.p108 = :p108")
    , @NamedQuery(name = "Auditorias.findByP109", query = "SELECT a FROM Auditorias a WHERE a.p109 = :p109")
    , @NamedQuery(name = "Auditorias.findByP110", query = "SELECT a FROM Auditorias a WHERE a.p110 = :p110")
    , @NamedQuery(name = "Auditorias.findByP111", query = "SELECT a FROM Auditorias a WHERE a.p111 = :p111")
    , @NamedQuery(name = "Auditorias.findByP112", query = "SELECT a FROM Auditorias a WHERE a.p112 = :p112")
    , @NamedQuery(name = "Auditorias.findByP113", query = "SELECT a FROM Auditorias a WHERE a.p113 = :p113")
    , @NamedQuery(name = "Auditorias.findByP114", query = "SELECT a FROM Auditorias a WHERE a.p114 = :p114")
    , @NamedQuery(name = "Auditorias.findByP115", query = "SELECT a FROM Auditorias a WHERE a.p115 = :p115")
    , @NamedQuery(name = "Auditorias.findByP116", query = "SELECT a FROM Auditorias a WHERE a.p116 = :p116")
    , @NamedQuery(name = "Auditorias.findByP117", query = "SELECT a FROM Auditorias a WHERE a.p117 = :p117")
    , @NamedQuery(name = "Auditorias.findByP118", query = "SELECT a FROM Auditorias a WHERE a.p118 = :p118")
    , @NamedQuery(name = "Auditorias.findByP119", query = "SELECT a FROM Auditorias a WHERE a.p119 = :p119")
    , @NamedQuery(name = "Auditorias.findByP120", query = "SELECT a FROM Auditorias a WHERE a.p120 = :p120")
    , @NamedQuery(name = "Auditorias.findByP121", query = "SELECT a FROM Auditorias a WHERE a.p121 = :p121")
    , @NamedQuery(name = "Auditorias.findByP122", query = "SELECT a FROM Auditorias a WHERE a.p122 = :p122")
    , @NamedQuery(name = "Auditorias.findByP123", query = "SELECT a FROM Auditorias a WHERE a.p123 = :p123")
    , @NamedQuery(name = "Auditorias.findByP124", query = "SELECT a FROM Auditorias a WHERE a.p124 = :p124")
    , @NamedQuery(name = "Auditorias.findByP125", query = "SELECT a FROM Auditorias a WHERE a.p125 = :p125")
    , @NamedQuery(name = "Auditorias.findByP126", query = "SELECT a FROM Auditorias a WHERE a.p126 = :p126")})
public class Auditorias implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AuditoriasPK auditoriasPK;
    private Integer p1;
    private Integer p2;
    private Integer p3;
    private Integer p4;
    private Integer p5;
    private Integer p6;
    private Integer p7;
    private Integer p8;
    private Integer p9;
    private Integer p10;
    private Integer p11;
    private Integer p12;
    private Integer p13;
    private Integer p14;
    private Integer p15;
    private Integer p16;
    private Integer p17;
    private Integer p18;
    private Integer p19;
    private Integer p20;
    private Integer p21;
    private Integer p22;
    private Integer p23;
    private Integer p24;
    private Integer p25;
    private Integer p26;
    private Integer p27;
    private Integer p28;
    private Integer p29;
    private Integer p30;
    private Integer p31;
    private Integer p32;
    private Integer p33;
    private Integer p34;
    private Integer p35;
    private Integer p36;
    private Integer p37;
    private Integer p38;
    private Integer p39;
    private Integer p40;
    private Integer p41;
    private Integer p42;
    private Integer p43;
    private Integer p44;
    private Integer p45;
    private Integer p46;
    private Integer p47;
    private Integer p48;
    private Integer p49;
    private Integer p50;
    private Integer p51;
    private Integer p52;
    private Integer p53;
    private Integer p54;
    private Integer p55;
    private Integer p56;
    private Integer p57;
    private Integer p58;
    private Integer p59;
    private Integer p60;
    private Integer p61;
    private Integer p62;
    private Integer p63;
    private Integer p64;
    private Integer p65;
    private Integer p66;
    private Integer p67;
    private Integer p68;
    private Integer p69;
    private Integer p70;
    private Integer p71;
    private Integer p72;
    private Integer p73;
    private Integer p74;
    private Integer p75;
    private Integer p76;
    private Integer p77;
    private Integer p78;
    private Integer p79;
    private Integer p80;
    private Integer p81;
    private Integer p82;
    private Integer p83;
    private Integer p84;
    private Integer p85;
    private Integer p86;
    private Integer p87;
    private Integer p88;
    private Integer p89;
    private Integer p90;
    private Integer p91;
    private Integer p92;
    private Integer p93;
    private Integer p94;
    private Integer p95;
    private Integer p96;
    private Integer p97;
    private Integer p98;
    private Integer p99;
    private Integer p100;
    private Integer p101;
    private Integer p102;
    private Integer p103;
    private Integer p104;
    private Integer p105;
    private Integer p106;
    private Integer p107;
    private Integer p108;
    private Integer p109;
    private Integer p110;
    private Integer p111;
    private Integer p112;
    private Integer p113;
    private Integer p114;
    private Integer p115;
    private Integer p116;
    private Integer p117;
    private Integer p118;
    private Integer p119;
    private Integer p120;
    private Integer p121;
    private Integer p122;
    private Integer p123;
    private Integer p124;
    private Integer p125;
    private Integer p126;

    public Auditorias() {
    }

    public Auditorias(AuditoriasPK auditoriasPK) {
        this.auditoriasPK = auditoriasPK;
    }

    public Auditorias(int idFichero, Date fecha) {
        this.auditoriasPK = new AuditoriasPK(idFichero, fecha);
    }

    public AuditoriasPK getAuditoriasPK() {
        return auditoriasPK;
    }

    public void setAuditoriasPK(AuditoriasPK auditoriasPK) {
        this.auditoriasPK = auditoriasPK;
    }

    public Integer getP1() {
        return p1;
    }

    public void setP1(Integer p1) {
        this.p1 = p1;
    }

    public Integer getP2() {
        return p2;
    }

    public void setP2(Integer p2) {
        this.p2 = p2;
    }

    public Integer getP3() {
        return p3;
    }

    public void setP3(Integer p3) {
        this.p3 = p3;
    }

    public Integer getP4() {
        return p4;
    }

    public void setP4(Integer p4) {
        this.p4 = p4;
    }

    public Integer getP5() {
        return p5;
    }

    public void setP5(Integer p5) {
        this.p5 = p5;
    }

    public Integer getP6() {
        return p6;
    }

    public void setP6(Integer p6) {
        this.p6 = p6;
    }

    public Integer getP7() {
        return p7;
    }

    public void setP7(Integer p7) {
        this.p7 = p7;
    }

    public Integer getP8() {
        return p8;
    }

    public void setP8(Integer p8) {
        this.p8 = p8;
    }

    public Integer getP9() {
        return p9;
    }

    public void setP9(Integer p9) {
        this.p9 = p9;
    }

    public Integer getP10() {
        return p10;
    }

    public void setP10(Integer p10) {
        this.p10 = p10;
    }

    public Integer getP11() {
        return p11;
    }

    public void setP11(Integer p11) {
        this.p11 = p11;
    }

    public Integer getP12() {
        return p12;
    }

    public void setP12(Integer p12) {
        this.p12 = p12;
    }

    public Integer getP13() {
        return p13;
    }

    public void setP13(Integer p13) {
        this.p13 = p13;
    }

    public Integer getP14() {
        return p14;
    }

    public void setP14(Integer p14) {
        this.p14 = p14;
    }

    public Integer getP15() {
        return p15;
    }

    public void setP15(Integer p15) {
        this.p15 = p15;
    }

    public Integer getP16() {
        return p16;
    }

    public void setP16(Integer p16) {
        this.p16 = p16;
    }

    public Integer getP17() {
        return p17;
    }

    public void setP17(Integer p17) {
        this.p17 = p17;
    }

    public Integer getP18() {
        return p18;
    }

    public void setP18(Integer p18) {
        this.p18 = p18;
    }

    public Integer getP19() {
        return p19;
    }

    public void setP19(Integer p19) {
        this.p19 = p19;
    }

    public Integer getP20() {
        return p20;
    }

    public void setP20(Integer p20) {
        this.p20 = p20;
    }

    public Integer getP21() {
        return p21;
    }

    public void setP21(Integer p21) {
        this.p21 = p21;
    }

    public Integer getP22() {
        return p22;
    }

    public void setP22(Integer p22) {
        this.p22 = p22;
    }

    public Integer getP23() {
        return p23;
    }

    public void setP23(Integer p23) {
        this.p23 = p23;
    }

    public Integer getP24() {
        return p24;
    }

    public void setP24(Integer p24) {
        this.p24 = p24;
    }

    public Integer getP25() {
        return p25;
    }

    public void setP25(Integer p25) {
        this.p25 = p25;
    }

    public Integer getP26() {
        return p26;
    }

    public void setP26(Integer p26) {
        this.p26 = p26;
    }

    public Integer getP27() {
        return p27;
    }

    public void setP27(Integer p27) {
        this.p27 = p27;
    }

    public Integer getP28() {
        return p28;
    }

    public void setP28(Integer p28) {
        this.p28 = p28;
    }

    public Integer getP29() {
        return p29;
    }

    public void setP29(Integer p29) {
        this.p29 = p29;
    }

    public Integer getP30() {
        return p30;
    }

    public void setP30(Integer p30) {
        this.p30 = p30;
    }

    public Integer getP31() {
        return p31;
    }

    public void setP31(Integer p31) {
        this.p31 = p31;
    }

    public Integer getP32() {
        return p32;
    }

    public void setP32(Integer p32) {
        this.p32 = p32;
    }

    public Integer getP33() {
        return p33;
    }

    public void setP33(Integer p33) {
        this.p33 = p33;
    }

    public Integer getP34() {
        return p34;
    }

    public void setP34(Integer p34) {
        this.p34 = p34;
    }

    public Integer getP35() {
        return p35;
    }

    public void setP35(Integer p35) {
        this.p35 = p35;
    }

    public Integer getP36() {
        return p36;
    }

    public void setP36(Integer p36) {
        this.p36 = p36;
    }

    public Integer getP37() {
        return p37;
    }

    public void setP37(Integer p37) {
        this.p37 = p37;
    }

    public Integer getP38() {
        return p38;
    }

    public void setP38(Integer p38) {
        this.p38 = p38;
    }

    public Integer getP39() {
        return p39;
    }

    public void setP39(Integer p39) {
        this.p39 = p39;
    }

    public Integer getP40() {
        return p40;
    }

    public void setP40(Integer p40) {
        this.p40 = p40;
    }

    public Integer getP41() {
        return p41;
    }

    public void setP41(Integer p41) {
        this.p41 = p41;
    }

    public Integer getP42() {
        return p42;
    }

    public void setP42(Integer p42) {
        this.p42 = p42;
    }

    public Integer getP43() {
        return p43;
    }

    public void setP43(Integer p43) {
        this.p43 = p43;
    }

    public Integer getP44() {
        return p44;
    }

    public void setP44(Integer p44) {
        this.p44 = p44;
    }

    public Integer getP45() {
        return p45;
    }

    public void setP45(Integer p45) {
        this.p45 = p45;
    }

    public Integer getP46() {
        return p46;
    }

    public void setP46(Integer p46) {
        this.p46 = p46;
    }

    public Integer getP47() {
        return p47;
    }

    public void setP47(Integer p47) {
        this.p47 = p47;
    }

    public Integer getP48() {
        return p48;
    }

    public void setP48(Integer p48) {
        this.p48 = p48;
    }

    public Integer getP49() {
        return p49;
    }

    public void setP49(Integer p49) {
        this.p49 = p49;
    }

    public Integer getP50() {
        return p50;
    }

    public void setP50(Integer p50) {
        this.p50 = p50;
    }

    public Integer getP51() {
        return p51;
    }

    public void setP51(Integer p51) {
        this.p51 = p51;
    }

    public Integer getP52() {
        return p52;
    }

    public void setP52(Integer p52) {
        this.p52 = p52;
    }

    public Integer getP53() {
        return p53;
    }

    public void setP53(Integer p53) {
        this.p53 = p53;
    }

    public Integer getP54() {
        return p54;
    }

    public void setP54(Integer p54) {
        this.p54 = p54;
    }

    public Integer getP55() {
        return p55;
    }

    public void setP55(Integer p55) {
        this.p55 = p55;
    }

    public Integer getP56() {
        return p56;
    }

    public void setP56(Integer p56) {
        this.p56 = p56;
    }

    public Integer getP57() {
        return p57;
    }

    public void setP57(Integer p57) {
        this.p57 = p57;
    }

    public Integer getP58() {
        return p58;
    }

    public void setP58(Integer p58) {
        this.p58 = p58;
    }

    public Integer getP59() {
        return p59;
    }

    public void setP59(Integer p59) {
        this.p59 = p59;
    }

    public Integer getP60() {
        return p60;
    }

    public void setP60(Integer p60) {
        this.p60 = p60;
    }

    public Integer getP61() {
        return p61;
    }

    public void setP61(Integer p61) {
        this.p61 = p61;
    }

    public Integer getP62() {
        return p62;
    }

    public void setP62(Integer p62) {
        this.p62 = p62;
    }

    public Integer getP63() {
        return p63;
    }

    public void setP63(Integer p63) {
        this.p63 = p63;
    }

    public Integer getP64() {
        return p64;
    }

    public void setP64(Integer p64) {
        this.p64 = p64;
    }

    public Integer getP65() {
        return p65;
    }

    public void setP65(Integer p65) {
        this.p65 = p65;
    }

    public Integer getP66() {
        return p66;
    }

    public void setP66(Integer p66) {
        this.p66 = p66;
    }

    public Integer getP67() {
        return p67;
    }

    public void setP67(Integer p67) {
        this.p67 = p67;
    }

    public Integer getP68() {
        return p68;
    }

    public void setP68(Integer p68) {
        this.p68 = p68;
    }

    public Integer getP69() {
        return p69;
    }

    public void setP69(Integer p69) {
        this.p69 = p69;
    }

    public Integer getP70() {
        return p70;
    }

    public void setP70(Integer p70) {
        this.p70 = p70;
    }

    public Integer getP71() {
        return p71;
    }

    public void setP71(Integer p71) {
        this.p71 = p71;
    }

    public Integer getP72() {
        return p72;
    }

    public void setP72(Integer p72) {
        this.p72 = p72;
    }

    public Integer getP73() {
        return p73;
    }

    public void setP73(Integer p73) {
        this.p73 = p73;
    }

    public Integer getP74() {
        return p74;
    }

    public void setP74(Integer p74) {
        this.p74 = p74;
    }

    public Integer getP75() {
        return p75;
    }

    public void setP75(Integer p75) {
        this.p75 = p75;
    }

    public Integer getP76() {
        return p76;
    }

    public void setP76(Integer p76) {
        this.p76 = p76;
    }

    public Integer getP77() {
        return p77;
    }

    public void setP77(Integer p77) {
        this.p77 = p77;
    }

    public Integer getP78() {
        return p78;
    }

    public void setP78(Integer p78) {
        this.p78 = p78;
    }

    public Integer getP79() {
        return p79;
    }

    public void setP79(Integer p79) {
        this.p79 = p79;
    }

    public Integer getP80() {
        return p80;
    }

    public void setP80(Integer p80) {
        this.p80 = p80;
    }

    public Integer getP81() {
        return p81;
    }

    public void setP81(Integer p81) {
        this.p81 = p81;
    }

    public Integer getP82() {
        return p82;
    }

    public void setP82(Integer p82) {
        this.p82 = p82;
    }

    public Integer getP83() {
        return p83;
    }

    public void setP83(Integer p83) {
        this.p83 = p83;
    }

    public Integer getP84() {
        return p84;
    }

    public void setP84(Integer p84) {
        this.p84 = p84;
    }

    public Integer getP85() {
        return p85;
    }

    public void setP85(Integer p85) {
        this.p85 = p85;
    }

    public Integer getP86() {
        return p86;
    }

    public void setP86(Integer p86) {
        this.p86 = p86;
    }

    public Integer getP87() {
        return p87;
    }

    public void setP87(Integer p87) {
        this.p87 = p87;
    }

    public Integer getP88() {
        return p88;
    }

    public void setP88(Integer p88) {
        this.p88 = p88;
    }

    public Integer getP89() {
        return p89;
    }

    public void setP89(Integer p89) {
        this.p89 = p89;
    }

    public Integer getP90() {
        return p90;
    }

    public void setP90(Integer p90) {
        this.p90 = p90;
    }

    public Integer getP91() {
        return p91;
    }

    public void setP91(Integer p91) {
        this.p91 = p91;
    }

    public Integer getP92() {
        return p92;
    }

    public void setP92(Integer p92) {
        this.p92 = p92;
    }

    public Integer getP93() {
        return p93;
    }

    public void setP93(Integer p93) {
        this.p93 = p93;
    }

    public Integer getP94() {
        return p94;
    }

    public void setP94(Integer p94) {
        this.p94 = p94;
    }

    public Integer getP95() {
        return p95;
    }

    public void setP95(Integer p95) {
        this.p95 = p95;
    }

    public Integer getP96() {
        return p96;
    }

    public void setP96(Integer p96) {
        this.p96 = p96;
    }

    public Integer getP97() {
        return p97;
    }

    public void setP97(Integer p97) {
        this.p97 = p97;
    }

    public Integer getP98() {
        return p98;
    }

    public void setP98(Integer p98) {
        this.p98 = p98;
    }

    public Integer getP99() {
        return p99;
    }

    public void setP99(Integer p99) {
        this.p99 = p99;
    }

    public Integer getP100() {
        return p100;
    }

    public void setP100(Integer p100) {
        this.p100 = p100;
    }

    public Integer getP101() {
        return p101;
    }

    public void setP101(Integer p101) {
        this.p101 = p101;
    }

    public Integer getP102() {
        return p102;
    }

    public void setP102(Integer p102) {
        this.p102 = p102;
    }

    public Integer getP103() {
        return p103;
    }

    public void setP103(Integer p103) {
        this.p103 = p103;
    }

    public Integer getP104() {
        return p104;
    }

    public void setP104(Integer p104) {
        this.p104 = p104;
    }

    public Integer getP105() {
        return p105;
    }

    public void setP105(Integer p105) {
        this.p105 = p105;
    }

    public Integer getP106() {
        return p106;
    }

    public void setP106(Integer p106) {
        this.p106 = p106;
    }

    public Integer getP107() {
        return p107;
    }

    public void setP107(Integer p107) {
        this.p107 = p107;
    }

    public Integer getP108() {
        return p108;
    }

    public void setP108(Integer p108) {
        this.p108 = p108;
    }

    public Integer getP109() {
        return p109;
    }

    public void setP109(Integer p109) {
        this.p109 = p109;
    }

    public Integer getP110() {
        return p110;
    }

    public void setP110(Integer p110) {
        this.p110 = p110;
    }

    public Integer getP111() {
        return p111;
    }

    public void setP111(Integer p111) {
        this.p111 = p111;
    }

    public Integer getP112() {
        return p112;
    }

    public void setP112(Integer p112) {
        this.p112 = p112;
    }

    public Integer getP113() {
        return p113;
    }

    public void setP113(Integer p113) {
        this.p113 = p113;
    }

    public Integer getP114() {
        return p114;
    }

    public void setP114(Integer p114) {
        this.p114 = p114;
    }

    public Integer getP115() {
        return p115;
    }

    public void setP115(Integer p115) {
        this.p115 = p115;
    }

    public Integer getP116() {
        return p116;
    }

    public void setP116(Integer p116) {
        this.p116 = p116;
    }

    public Integer getP117() {
        return p117;
    }

    public void setP117(Integer p117) {
        this.p117 = p117;
    }

    public Integer getP118() {
        return p118;
    }

    public void setP118(Integer p118) {
        this.p118 = p118;
    }

    public Integer getP119() {
        return p119;
    }

    public void setP119(Integer p119) {
        this.p119 = p119;
    }

    public Integer getP120() {
        return p120;
    }

    public void setP120(Integer p120) {
        this.p120 = p120;
    }

    public Integer getP121() {
        return p121;
    }

    public void setP121(Integer p121) {
        this.p121 = p121;
    }

    public Integer getP122() {
        return p122;
    }

    public void setP122(Integer p122) {
        this.p122 = p122;
    }

    public Integer getP123() {
        return p123;
    }

    public void setP123(Integer p123) {
        this.p123 = p123;
    }

    public Integer getP124() {
        return p124;
    }

    public void setP124(Integer p124) {
        this.p124 = p124;
    }

    public Integer getP125() {
        return p125;
    }

    public void setP125(Integer p125) {
        this.p125 = p125;
    }

    public Integer getP126() {
        return p126;
    }

    public void setP126(Integer p126) {
        this.p126 = p126;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auditoriasPK != null ? auditoriasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditorias)) {
            return false;
        }
        Auditorias other = (Auditorias) object;
        if ((this.auditoriasPK == null && other.auditoriasPK != null) || (this.auditoriasPK != null && !this.auditoriasPK.equals(other.auditoriasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Auditorias[ auditoriasPK=" + auditoriasPK + " ]";
    }
    
}
