package com.bah.devnation.demo;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="caps", schema="public")
public class Caps {

    @Id
    private String no;
    private String player;
    private String flag;
    private String pos;
    private String age;
    private String height;
    private String weight;
    private String sc;
    private String exp;
    private String birthdate;
    private String summary;
    private String salary;
    private String draft;

    public Caps(String no, String player, String flag, String pos, String age, String height, String weight, String sc, String exp, String birthdate, String summary, String salary, String draft) {
        this.no = no;
        this.player = player;
        this.flag = flag;
        this.pos = pos;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sc = sc;
        this.exp = exp;
        this.birthdate = birthdate;
        this.summary = summary;
        this.salary = salary;
        this.draft = draft;
    }

    public Caps() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }
}
