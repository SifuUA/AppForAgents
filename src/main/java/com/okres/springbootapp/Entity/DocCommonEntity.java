package com.okres.springbootapp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity(name = "doccommon")
public class DocCommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int doctypesid;
    private int isreturn;
    private Date docdate;
    private int storeidsrc;
    private int storeiddst;
    private int clientid;
    private int reserved;
    private double startsumm;
    private double endsumm;
    private double itemsumm;
    private int signed;
    private char usersign;
    private Time timesign;
    private double endsummgoodsbased;
    private double buypricestartsumm;
    private double buypriceendsumm;
    private double buypriceendsummgoodsbased;
    private int cleared;
    private double msu;
    private int paytypeid;
    private double buyrate;
    private double sellrate;
    private double mainsumm;
    private int clientparentid;
    private int agentid;
    private int beepreslinkid;

    public DocCommonEntity() {
    }

    public DocCommonEntity(int doctypesid, int isreturn, Date docdate, int storeidsrc, int storeiddst, int clientid, int reserved, double startsumm, double endsumm, double itemsumm, int signed, char usersign, Time timesign, double endsummgoodsbased, double buypricestartsumm, double buypriceendsumm, double buypriceendsummgoodsbased, int cleared, double msu, int paytypeid, double buyrate, double sellrate, double mainsumm, int clientparentid, int agentid, int beepreslinkid) {
        this.doctypesid = doctypesid;
        this.isreturn = isreturn;
        this.docdate = docdate;
        this.storeidsrc = storeidsrc;
        this.storeiddst = storeiddst;
        this.clientid = clientid;
        this.reserved = reserved;
        this.startsumm = startsumm;
        this.endsumm = endsumm;
        this.itemsumm = itemsumm;
        this.signed = signed;
        this.usersign = usersign;
        this.timesign = timesign;
        this.endsummgoodsbased = endsummgoodsbased;
        this.buypricestartsumm = buypricestartsumm;
        this.buypriceendsumm = buypriceendsumm;
        this.buypriceendsummgoodsbased = buypriceendsummgoodsbased;
        this.cleared = cleared;
        this.msu = msu;
        this.paytypeid = paytypeid;
        this.buyrate = buyrate;
        this.sellrate = sellrate;
        this.mainsumm = mainsumm;
        this.clientparentid = clientparentid;
        this.agentid = agentid;
        this.beepreslinkid = beepreslinkid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDoctypesid() {
        return doctypesid;
    }

    public void setDoctypesid(int doctypesid) {
        this.doctypesid = doctypesid;
    }

    public int getIsreturn() {
        return isreturn;
    }

    public void setIsreturn(int isreturn) {
        this.isreturn = isreturn;
    }

    public Date getDocdate() {
        return docdate;
    }

    public void setDocdate(Date docdate) {
        this.docdate = docdate;
    }

    public int getStoreidsrc() {
        return storeidsrc;
    }

    public void setStoreidsrc(int storeidsrc) {
        this.storeidsrc = storeidsrc;
    }

    public int getStoreiddst() {
        return storeiddst;
    }

    public void setStoreiddst(int storeiddst) {
        this.storeiddst = storeiddst;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public double getStartsumm() {
        return startsumm;
    }

    public void setStartsumm(double startsumm) {
        this.startsumm = startsumm;
    }

    public double getEndsumm() {
        return endsumm;
    }

    public void setEndsumm(double endsumm) {
        this.endsumm = endsumm;
    }

    public double getItemsumm() {
        return itemsumm;
    }

    public void setItemsumm(double itemsumm) {
        this.itemsumm = itemsumm;
    }

    public int getSigned() {
        return signed;
    }

    public void setSigned(int signed) {
        this.signed = signed;
    }

    public char getUsersign() {
        return usersign;
    }

    public void setUsersign(char usersign) {
        this.usersign = usersign;
    }

    public Time getTimesign() {
        return timesign;
    }

    public void setTimesign(Time timesign) {
        this.timesign = timesign;
    }

    public double getEndsummgoodsbased() {
        return endsummgoodsbased;
    }

    public void setEndsummgoodsbased(double endsummgoodsbased) {
        this.endsummgoodsbased = endsummgoodsbased;
    }

    public double getBuypricestartsumm() {
        return buypricestartsumm;
    }

    public void setBuypricestartsumm(double buypricestartsumm) {
        this.buypricestartsumm = buypricestartsumm;
    }

    public double getBuypriceendsumm() {
        return buypriceendsumm;
    }

    public void setBuypriceendsumm(double buypriceendsumm) {
        this.buypriceendsumm = buypriceendsumm;
    }

    public double getBuypriceendsummgoodsbased() {
        return buypriceendsummgoodsbased;
    }

    public void setBuypriceendsummgoodsbased(double buypriceendsummgoodsbased) {
        this.buypriceendsummgoodsbased = buypriceendsummgoodsbased;
    }

    public int getCleared() {
        return cleared;
    }

    public void setCleared(int cleared) {
        this.cleared = cleared;
    }

    public double getMsu() {
        return msu;
    }

    public void setMsu(double msu) {
        this.msu = msu;
    }

    public int getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(int paytypeid) {
        this.paytypeid = paytypeid;
    }

    public double getBuyrate() {
        return buyrate;
    }

    public void setBuyrate(double buyrate) {
        this.buyrate = buyrate;
    }

    public double getSellrate() {
        return sellrate;
    }

    public void setSellrate(double sellrate) {
        this.sellrate = sellrate;
    }

    public double getMainsumm() {
        return mainsumm;
    }

    public void setMainsumm(double mainsumm) {
        this.mainsumm = mainsumm;
    }

    public int getClientparentid() {
        return clientparentid;
    }

    public void setClientparentid(int clientparentid) {
        this.clientparentid = clientparentid;
    }

    public int getAgentid() {
        return agentid;
    }

    public void setAgentid(int agentid) {
        this.agentid = agentid;
    }

    public int getBeepreslinkid() {
        return beepreslinkid;
    }

    public void setBeepreslinkid(int beepreslinkid) {
        this.beepreslinkid = beepreslinkid;
    }

    @Override
    public String toString() {
        return "DocCommonEntity{" +
                "id=" + id +
                ", doctypesid=" + doctypesid +
                ", isreturn=" + isreturn +
                ", docdate=" + docdate +
                ", storeidsrc=" + storeidsrc +
                ", storeiddst=" + storeiddst +
                ", clientid=" + clientid +
                ", reserved=" + reserved +
                ", startsumm=" + startsumm +
                ", endsumm=" + endsumm +
                ", itemsumm=" + itemsumm +
                ", signed=" + signed +
                ", usersign=" + usersign +
                ", timesign=" + timesign +
                ", endsummgoodsbased=" + endsummgoodsbased +
                ", buypricestartsumm=" + buypricestartsumm +
                ", buypriceendsumm=" + buypriceendsumm +
                ", buypriceendsummgoodsbased=" + buypriceendsummgoodsbased +
                ", cleared=" + cleared +
                ", msu=" + msu +
                ", paytypeid=" + paytypeid +
                ", buyrate=" + buyrate +
                ", sellrate=" + sellrate +
                ", mainsumm=" + mainsumm +
                ", clientparentid=" + clientparentid +
                ", agentid=" + agentid +
                ", beepreslinkid=" + beepreslinkid +
                '}';
    }
}
