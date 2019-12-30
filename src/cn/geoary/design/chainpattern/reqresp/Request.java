package cn.geoary.design.chainpattern.reqresp;

public class Request {
    String reqStr;

    public Request(String reqStr) {
        this.reqStr = reqStr;
    }

    public String getReqStr() {
        return reqStr;
    }

    public void setReqStr(String reqStr) {
        this.reqStr = reqStr;
    }

    @Override
    public String toString() {
        return "Request{" +
                "reqStr='" + reqStr + '\'' +
                '}';
    }
}
