package com.htu.model;

import java.math.BigDecimal;

public class HouseInfo {
    private BigDecimal id;

    private String gfdz;

    private String zfdz;

    private BigDecimal fwgmjsjg;

    private BigDecimal fwzj;

    private BigDecimal fid;

    public HouseInfo(BigDecimal id, String gfdz, String zfdz, BigDecimal fwgmjsjg, BigDecimal fwzj, BigDecimal fid) {
        this.id = id;
        this.gfdz = gfdz;
        this.zfdz = zfdz;
        this.fwgmjsjg = fwgmjsjg;
        this.fwzj = fwzj;
        this.fid = fid;
    }

    public HouseInfo() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getGfdz() {
        return gfdz;
    }

    public void setGfdz(String gfdz) {
        this.gfdz = gfdz == null ? null : gfdz.trim();
    }

    public String getZfdz() {
        return zfdz;
    }

    public void setZfdz(String zfdz) {
        this.zfdz = zfdz == null ? null : zfdz.trim();
    }

    public BigDecimal getFwgmjsjg() {
        return fwgmjsjg;
    }

    public void setFwgmjsjg(BigDecimal fwgmjsjg) {
        this.fwgmjsjg = fwgmjsjg;
    }

    public BigDecimal getFwzj() {
        return fwzj;
    }

    public void setFwzj(BigDecimal fwzj) {
        this.fwzj = fwzj;
    }

    public BigDecimal getFid() {
        return fid;
    }

    public void setFid(BigDecimal fid) {
        this.fid = fid;
    }
}