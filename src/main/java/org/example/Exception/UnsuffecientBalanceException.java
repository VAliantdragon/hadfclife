package org.example.Exception;

public class UnsuffecientBalanceException extends Exception{

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UnsuffecientBalanceException(){

    }

    public UnsuffecientBalanceException(String msg){
        super(msg);
        this.msg=msg;
    }


}
