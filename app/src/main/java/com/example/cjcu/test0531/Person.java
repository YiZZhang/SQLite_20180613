package com.example.cjcu.test0531;

public class Person {
    private String cdate;
    private String info;
    private int amount;

    public Person(String cdate,String info,int amount){
        this.cdate=cdate;
        this.info=info;
        this.amount=amount;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
