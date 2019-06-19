package com.htu.model;

import java.math.BigDecimal;
import java.util.Date;

public class ExtractInfo {
    private BigDecimal id;

    private String gjjzh;

    private BigDecimal tqyy;

    private Date tqsj;

    private BigDecimal tqfs;

    private BigDecimal kdtqze;

    private BigDecimal tqje;

    private BigDecimal ljtqje;

    private String gttqrxm;

    private String gttqrsfzh;

    private BigDecimal gttqrsfjlgjj;

    private BigDecimal fid;

    public ExtractInfo(BigDecimal id, String gjjzh, BigDecimal tqyy, Date tqsj, BigDecimal tqfs, BigDecimal kdtqze, BigDecimal tqje, BigDecimal ljtqje, String gttqrxm, String gttqrsfzh, BigDecimal gttqrsfjlgjj, BigDecimal fid) {
        this.id = id;
        this.gjjzh = gjjzh;
        this.tqyy = tqyy;
        this.tqsj = tqsj;
        this.tqfs = tqfs;
        this.kdtqze = kdtqze;
        this.tqje = tqje;
        this.ljtqje = ljtqje;
        this.gttqrxm = gttqrxm;
        this.gttqrsfzh = gttqrsfzh;
        this.gttqrsfjlgjj = gttqrsfjlgjj;
        this.fid = fid;
    }

    public ExtractInfo() {
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

    public BigDecimal getTqyy() {
        return tqyy;
    }

    public void setTqyy(BigDecimal tqyy) {
        this.tqyy = tqyy;
    }

    public Date getTqsj() {
        return tqsj;
    }

    public void setTqsj(Date tqsj) {
        this.tqsj = tqsj;
    }

    public BigDecimal getTqfs() {
        return tqfs;
    }

    public void setTqfs(BigDecimal tqfs) {
        this.tqfs = tqfs;
    }

    public BigDecimal getKdtqze() {
        return kdtqze;
    }

    public void setKdtqze(BigDecimal kdtqze) {
        this.kdtqze = kdtqze;
    }

    public BigDecimal getTqje() {
        return tqje;
    }

    public void setTqje(BigDecimal tqje) {
        this.tqje = tqje;
    }

    public BigDecimal getLjtqje() {
        return ljtqje;
    }

    public void setLjtqje(BigDecimal ljtqje) {
        this.ljtqje = ljtqje;
    }

    public String getGttqrxm() {
        return gttqrxm;
    }

    public void setGttqrxm(String gttqrxm) {
        this.gttqrxm = gttqrxm == null ? null : gttqrxm.trim();
    }

    public String getGttqrsfzh() {
        return gttqrsfzh;
    }

    public void setGttqrsfzh(String gttqrsfzh) {
        this.gttqrsfzh = gttqrsfzh == null ? null : gttqrsfzh.trim();
    }

    public BigDecimal getGttqrsfjlgjj() {
        return gttqrsfjlgjj;
    }

    public void setGttqrsfjlgjj(BigDecimal gttqrsfjlgjj) {
        this.gttqrsfjlgjj = gttqrsfjlgjj;
    }

    public BigDecimal getFid() {
        return fid;
    }

    public void setFid(BigDecimal fid) {
        this.fid = fid;
    }
}