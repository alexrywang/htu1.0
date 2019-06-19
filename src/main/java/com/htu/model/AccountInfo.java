package com.htu.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountInfo {
    private BigDecimal id;

    private String gjjzh;

    private Date khrq;

    private Date cjnyr;

    private Date jznyr;

    private String dyjcdwmc;

    private BigDecimal dydwjce;

    private String dydwjcbl;

    private BigDecimal dyjczt;

    private Date zjycjnrq;

    private BigDecimal dqgjjnd;

    private BigDecimal ljjncs;

    private BigDecimal dqye;

    private BigDecimal grjce12;

    private String grjcbl12;

    private String dwjcbl12;

    private BigDecimal fid;

    public AccountInfo(BigDecimal id, String gjjzh, Date khrq, Date cjnyr, Date jznyr, String dyjcdwmc, BigDecimal dydwjce, String dydwjcbl, BigDecimal dyjczt, Date zjycjnrq, BigDecimal dqgjjnd, BigDecimal ljjncs, BigDecimal dqye, BigDecimal grjce12, String grjcbl12, String dwjcbl12, BigDecimal fid) {
        this.id = id;
        this.gjjzh = gjjzh;
        this.khrq = khrq;
        this.cjnyr = cjnyr;
        this.jznyr = jznyr;
        this.dyjcdwmc = dyjcdwmc;
        this.dydwjce = dydwjce;
        this.dydwjcbl = dydwjcbl;
        this.dyjczt = dyjczt;
        this.zjycjnrq = zjycjnrq;
        this.dqgjjnd = dqgjjnd;
        this.ljjncs = ljjncs;
        this.dqye = dqye;
        this.grjce12 = grjce12;
        this.grjcbl12 = grjcbl12;
        this.dwjcbl12 = dwjcbl12;
        this.fid = fid;
    }

    public AccountInfo() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getGjjzh() {
        return gjjzh;
    }

    public void setGjjzh(String gjjzh) {
        this.gjjzh = gjjzh == null ? null : gjjzh.trim();
    }

    public Date getKhrq() {
        return khrq;
    }

    public void setKhrq(Date khrq) {
        this.khrq = khrq;
    }

    public Date getCjnyr() {
        return cjnyr;
    }

    public void setCjnyr(Date cjnyr) {
        this.cjnyr = cjnyr;
    }

    public Date getJznyr() {
        return jznyr;
    }

    public void setJznyr(Date jznyr) {
        this.jznyr = jznyr;
    }

    public String getDyjcdwmc() {
        return dyjcdwmc;
    }

    public void setDyjcdwmc(String dyjcdwmc) {
        this.dyjcdwmc = dyjcdwmc == null ? null : dyjcdwmc.trim();
    }

    public BigDecimal getDydwjce() {
        return dydwjce;
    }

    public void setDydwjce(BigDecimal dydwjce) {
        this.dydwjce = dydwjce;
    }

    public String getDydwjcbl() {
        return dydwjcbl;
    }

    public void setDydwjcbl(String dydwjcbl) {
        this.dydwjcbl = dydwjcbl == null ? null : dydwjcbl.trim();
    }

    public BigDecimal getDyjczt() {
        return dyjczt;
    }

    public void setDyjczt(BigDecimal dyjczt) {
        this.dyjczt = dyjczt;
    }

    public Date getZjycjnrq() {
        return zjycjnrq;
    }

    public void setZjycjnrq(Date zjycjnrq) {
        this.zjycjnrq = zjycjnrq;
    }

    public BigDecimal getDqgjjnd() {
        return dqgjjnd;
    }

    public void setDqgjjnd(BigDecimal dqgjjnd) {
        this.dqgjjnd = dqgjjnd;
    }

    public BigDecimal getLjjncs() {
        return ljjncs;
    }

    public void setLjjncs(BigDecimal ljjncs) {
        this.ljjncs = ljjncs;
    }

    public BigDecimal getDqye() {
        return dqye;
    }

    public void setDqye(BigDecimal dqye) {
        this.dqye = dqye;
    }

    public BigDecimal getGrjce12() {
        return grjce12;
    }

    public void setGrjce12(BigDecimal grjce12) {
        this.grjce12 = grjce12;
    }

    public String getGrjcbl12() {
        return grjcbl12;
    }

    public void setGrjcbl12(String grjcbl12) {
        this.grjcbl12 = grjcbl12 == null ? null : grjcbl12.trim();
    }

    public String getDwjcbl12() {
        return dwjcbl12;
    }

    public void setDwjcbl12(String dwjcbl12) {
        this.dwjcbl12 = dwjcbl12 == null ? null : dwjcbl12.trim();
    }

    public BigDecimal getFid() {
        return fid;
    }

    public void setFid(BigDecimal fid) {
        this.fid = fid;
    }
}