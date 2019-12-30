package cn.geoary.design.chainpattern.reqresp;

public class Response {
    String respStr;

    public Response(String respStr) {
        this.respStr = respStr;
    }

    public String getRespStr() {
        return respStr;
    }

    public void setRespStr(String respStr) {
        this.respStr = respStr;
    }

    @Override
    public String toString() {
        return "Response{" +
                "respStr='" + respStr + '\'' +
                '}';
    }
}
