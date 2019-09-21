package com.example.student.bai4;

public class Profile {
    private String hoTen;
    private String cmnd;
    private String bangCap;
    private String soThich;
    private String note;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Profile(String hoTen, String cmnd, String bangCap, String soThich, String note) {
        this.hoTen = hoTen;
        this.cmnd = cmnd;
        this.bangCap = bangCap;
        this.soThich = soThich;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "hoTen='" + hoTen + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", bangCap='" + bangCap + '\'' +
                ", soThich='" + soThich + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
