package com.htu.model;

import java.math.BigDecimal;

public class User {
     private Integer id;
     private String username;
     private String password;
     private Integer state;
     private BigDecimal loanlimit;
     private String payprovince;
     private String gssj;
     private String addrss;
     private String truename;
     private String paycardnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) { this.id = id; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public Integer getState() { return state; }

    public void setState(Integer state) { this.state = state; }

    public BigDecimal getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(BigDecimal loanlimit) {
        this.loanlimit = loanlimit;
    }

    public String getPayprovince() {
        return payprovince;
    }

    public void setPayprovince(String payprovince) {
        this.payprovince = payprovince;
    }

    public String getGssj() {
        return gssj;
    }

    public void setGssj(String gssj) {
        this.gssj = gssj;
    }

    public String getAddrss() {
        return addrss;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getPaycardnumber() {
        return paycardnumber;
    }

    public void setPaycardnumber(String paycardnumber) {
        this.paycardnumber = paycardnumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                ", loanlimit=" + loanlimit +
                ", payprovince='" + payprovince + '\'' +
                ", gssj='" + gssj + '\'' +
                ", addrss='" + addrss + '\'' +
                ", name='" + truename + '\'' +
                ", paycardnumber='" + paycardnumber + '\'' +
                '}';
    }
}
