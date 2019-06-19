package com.htu.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Usergjj {
    private BigDecimal id;

    private BigDecimal xijyjg;

    private BigDecimal jcfsdd;

    private String sjfsjgdm;

    private String xm;

    private String xmjp;

    private String xb;

    private String grdjh;

    private String grbh;

    private Date csny;

    private Date gzsj;

    private BigDecimal sqgzze;

    private BigDecimal zzdh;

    private BigDecimal sjh;

    private String lxdz;

    private String dwmc;

    private String dwdjh;

    private String khglbbh;

    private Date ccdjsj;

    private String zzjgdm;

    private String yyzzhm;

    private BigDecimal xzdm;

    private BigDecimal zjlx;

    private String zjhm;

    private String hzpt;

    private String khsfzhm;

    private String kexm;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date cxsj;

    private List<AccountInfo> account;

    private List<ExtractInfo> extract;

    private List<LoanInfo> loan;

    private List<HouseInfo> house;



    public Usergjj(BigDecimal id, BigDecimal xijyjg, BigDecimal jcfsdd, String sjfsjgdm, String xm, String xmjp, String xb, String grdjh, String grbh, Date csny, Date gzsj, BigDecimal sqgzze, BigDecimal zzdh, BigDecimal sjh, String lxdz, String dwmc, String dwdjh, String khglbbh, Date ccdjsj, String zzjgdm, String yyzzhm, BigDecimal xzdm, BigDecimal zjlx, String zjhm, String hzpt, String khsfzhm, String kexm, Date cxsj) {
        this.id = id;
        this.xijyjg = xijyjg;
        this.jcfsdd = jcfsdd;
        this.sjfsjgdm = sjfsjgdm;
        this.xm = xm;
        this.xmjp = xmjp;
        this.xb = xb;
        this.grdjh = grdjh;
        this.grbh = grbh;
        this.csny = csny;
        this.gzsj = gzsj;
        this.sqgzze = sqgzze;
        this.zzdh = zzdh;
        this.sjh = sjh;
        this.lxdz = lxdz;
        this.dwmc = dwmc;
        this.dwdjh = dwdjh;
        this.khglbbh = khglbbh;
        this.ccdjsj = ccdjsj;
        this.zzjgdm = zzjgdm;
        this.yyzzhm = yyzzhm;
        this.xzdm = xzdm;
        this.zjlx = zjlx;
        this.zjhm = zjhm;
        this.hzpt = hzpt;
        this.khsfzhm = khsfzhm;
        this.kexm = kexm;
        this.cxsj = cxsj;
    }

    public Usergjj() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getXijyjg() {
        return xijyjg;
    }

    public void setXijyjg(BigDecimal xijyjg) {
        this.xijyjg = xijyjg;
    }

    public BigDecimal getJcfsdd() {
        return jcfsdd;
    }

    public void setJcfsdd(BigDecimal jcfsdd) {
        this.jcfsdd = jcfsdd;
    }

    public String getSjfsjgdm() {
        return sjfsjgdm;
    }

    public void setSjfsjgdm(String sjfsjgdm) {
        this.sjfsjgdm = sjfsjgdm == null ? null : sjfsjgdm.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getXmjp() {
        return xmjp;
    }

    public void setXmjp(String xmjp) {
        this.xmjp = xmjp == null ? null : xmjp.trim();
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    public String getGrdjh() {
        return grdjh;
    }

    public void setGrdjh(String grdjh) {
        this.grdjh = grdjh == null ? null : grdjh.trim();
    }

    public String getGrbh() {
        return grbh;
    }

    public void setGrbh(String grbh) {
        this.grbh = grbh == null ? null : grbh.trim();
    }

    public Date getCsny() {
        return csny;
    }

    public void setCsny(Date csny) {
        this.csny = csny;
    }

    public Date getGzsj() {
        return gzsj;
    }

    public void setGzsj(Date gzsj) {
        this.gzsj = gzsj;
    }

    public BigDecimal getSqgzze() {
        return sqgzze;
    }

    public void setSqgzze(BigDecimal sqgzze) {
        this.sqgzze = sqgzze;
    }

    public BigDecimal getZzdh() {
        return zzdh;
    }

    public void setZzdh(BigDecimal zzdh) {
        this.zzdh = zzdh;
    }

    public BigDecimal getSjh() {
        return sjh;
    }

    public void setSjh(BigDecimal sjh) {
        this.sjh = sjh;
    }

    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz == null ? null : lxdz.trim();
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc == null ? null : dwmc.trim();
    }

    public String getDwdjh() {
        return dwdjh;
    }

    public void setDwdjh(String dwdjh) {
        this.dwdjh = dwdjh == null ? null : dwdjh.trim();
    }

    public String getKhglbbh() {
        return khglbbh;
    }

    public void setKhglbbh(String khglbbh) {
        this.khglbbh = khglbbh == null ? null : khglbbh.trim();
    }

    public Date getCcdjsj() {
        return ccdjsj;
    }

    public void setCcdjsj(Date ccdjsj) {
        this.ccdjsj = ccdjsj;
    }

    public String getZzjgdm() {
        return zzjgdm;
    }

    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm == null ? null : zzjgdm.trim();
    }

    public String getYyzzhm() {
        return yyzzhm;
    }

    public void setYyzzhm(String yyzzhm) {
        this.yyzzhm = yyzzhm == null ? null : yyzzhm.trim();
    }

    public BigDecimal getXzdm() {
        return xzdm;
    }

    public void setXzdm(BigDecimal xzdm) {
        this.xzdm = xzdm;
    }

    public BigDecimal getZjlx() {
        return zjlx;
    }

    public void setZjlx(BigDecimal zjlx) {
        this.zjlx = zjlx;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm == null ? null : zjhm.trim();
    }

    public String getHzpt() {
        return hzpt;
    }

    public void setHzpt(String hzpt) {
        this.hzpt = hzpt == null ? null : hzpt.trim();
    }

    public String getKhsfzhm() {
        return khsfzhm;
    }

    public void setKhsfzhm(String khsfzhm) {
        this.khsfzhm = khsfzhm == null ? null : khsfzhm.trim();
    }

    public String getKexm() {
        return kexm;
    }

    public void setKexm(String kexm) {
        this.kexm = kexm == null ? null : kexm.trim();
    }

    public Date getCxsj() {
        return cxsj;
    }

    public void setCxsj(Date cxsj) {
        this.cxsj = cxsj;
    }

    public List<AccountInfo> getAccount() {
        return account;
    }

    public void setAccount(List<AccountInfo> account) {
        this.account = account;
    }

    public List<ExtractInfo> getExtract() {
        return extract;
    }

    public void setExtract(List<ExtractInfo> extract) {
        this.extract = extract;
    }

    public List<LoanInfo> getLoan() {
        return loan;
    }

    public void setLoan(List<LoanInfo> loan) {
        this.loan = loan;
    }

    public List<HouseInfo> getHouse() {
        return house;
    }

    public void setHouse(List<HouseInfo> house) {
        this.house = house;
    }


}