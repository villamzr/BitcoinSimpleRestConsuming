package com.bitcoinprice;

public class CoinPrice {
    private boolean success;
    private Payload payload;
 
    public boolean isSuccess() {
        return success;
    }
 
    public void setSuccess(boolean success) {
        this.success = success;
    }
 
    public Payload getPayload() {
        return payload;
    }
 
    public void setPayload(Payload payload) {
        this.payload = payload;
    }
 
    @Override
    public String toString() {
        return "RipplePrice [success=" + success + ", payload=" + payload + "]";
    }
 
}