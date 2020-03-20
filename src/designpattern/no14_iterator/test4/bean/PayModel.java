package designpattern.no14_iterator.test4.bean;

public class PayModel {

    private String userName;

    private double pay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public PayModel() {
        //
    }

    public PayModel(String userName, double pay) {
        this.userName = userName;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "userName='" + userName + '\'' +
                ", pay=" + pay +
                '}';
    }
}
