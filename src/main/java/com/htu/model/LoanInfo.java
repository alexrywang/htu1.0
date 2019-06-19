package com.htu.model;

import java.math.BigDecimal;
import java.util.Date;

public class LoanInfo {
    private BigDecimal id;

    private String gjjbh;

    private String gjjdkbh;

    private BigDecimal gjjdkje;

    private BigDecimal gjjdknx;

    private String hkfs;

    private BigDecimal yhke;

    private Date qsrq;

    private Date dqrq;

    private Date jqrq;

    private BigDecimal dkye;

    private String gtxm;

    private String gtsfz;

    private String gtsfjlgjj;

    private String lxdz;

    private BigDecimal fid;

    public LoanInfo(BigDecimal id, String gjjbh, String gjjdkbh, BigDecimal gjjdkje, BigDecimal gjjdknx, String hkfs, BigDecimal yhke, Date qsrq, Date dqrq, Date jqrq, BigDecimal dkye, String gtxm, String gtsfz, String gtsfjlgjj, String lxdz, BigDecimal fid) {
        this.id = id;
        this.gjjbh = gjjbh;
        this.gjjdkbh = gjjdkbh;
        this.gjjdkje = gjjdkje;
        this.gjjdknx = gjjdknx;
        this.hkfs = hkfs;
        this.yhke = yhke;
        this.qsrq = qsrq;
        this.dqrq = dqrq;
        this.jqrq = jqrq;
        this.dkye = dkye;
        this.gtxm = gtxm;
        this.gtsfz = gtsfz;
        this.gtsfjlgjj = gtsfjlgjj;
        this.lxdz = lxdz;
        this.fid = fid;
    }

    public LoanInfo() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getGjjbh() {
        return gjjbh;
    }

    public void setGjjbh(String gjjbh) {
        this.gjjbh = gjjbh == null ? null : gjjbh.trim();
    }

    public String getGjjdkbh() {
        return gjjdkbh;
    }

    public void setGjjdkbh(String gjjdkbh) {
        this.gjjdkbh = gjjdkbh == null ? null : gjjdkbh.trim();
    }

    public BigDecimal getGjjdkje() {
        return gjjdkje;
    }

    public void setGjjdkje(BigDecimal gjjdkje) {
        this.gjjdkje = gjjdkje;
    }

    public BigDecimal getGjjdknx() {
        return gjjdknx;
    }

    public void setGjjdknx(BigDecimal gjjdknx) {
        this.gjjdknx = gjjdknx;
    }

    public String getHkfs() {
        return hkfs;
    }

    public void setHkfs(String hkfs) {
        this.hkfs = hkfs == null ? null : hkfs.trim();
    }

    public BigDecimal getYhke() {
        return yhke;
    }

    public void setYhke(BigDecimal yhke) {
        this.yhke = yhke;
    }

    public Date getQsrq() {
        return qsrq;
    }

    public void setQsrq(Date qsrq) {
        this.qsrq = qsrq;
    }

    public Date getDqrq() {
        return dqrq;
    }

    public void setDqrq(Date dqrq) {
        this.dqrq = dqrq;
    }

    public Date getJqrq() {
        return jqrq;
    }

    public void setJqrq(Date jqrq) {
        this.jqrq = jqrq;
    }

    public BigDecimal getDkye() {
        return dkye;
    }

    public void setDkye(BigDecimal dkye) {
        this.dkye = dkye;
    }

    public String getGtxm() {
        return gtxm;
    }

    public void setGtxm(String gtxm) {
        this.gtxm = gtxm == null ? null : gtxm.trim();
    }

    public String getGtsfz() {
        return gtsfz;
    }

    public void setGtsfz(String gtsfz) {
        this.gtsfz = gtsfz == null ? null : gtsfz.trim();
    }

    public String getGtsfjlgjj() {
        return gtsfjlgjj;
    }

    public void setGtsfjlgjj(String gtsfjlgjj) {
        this.gtsfjlgjj = gtsfjlgjj == null ? null : gtsfjlgjj.trim();
    }

    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz == null ? null : lxdz.trim();
    }

    public BigDecimal getFid() {
        return fid;
    }

    public void setFid(BigDecimal fid) {
        this.fid = fid;
    }
}