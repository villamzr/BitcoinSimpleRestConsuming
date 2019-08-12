package com.bitcoinprice;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Payload {
 
    @JsonProperty("high")
    private double high;
 
    @JsonProperty("last")
    private double last;
 
    @JsonProperty("created_at")
    private String createdAt;
 
    @JsonProperty("book")
    private String book;
 
    @JsonProperty("volume")
    private Double volume;
 
    @JsonProperty("vwap")
    private Double vwap;
 
    @JsonProperty("low")
    private Double low;
 
    @JsonProperty("ask")
    private Double ask;
 
    @JsonProperty("bid")
    private Double bid;
    
    @JsonProperty("change_24")
    private Double change_24;
    
 
    public double getHigh() {
        return high;
    }
 
    public void setHigh(double high) {
        this.high = high;
    }
 
    public double getLast() {
        return last;
    }
 
    public void setLast(double last) {
        this.last = last;
    }
 
    public String getCreatedAt() {
        return createdAt;
    }
 
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
 
    public String getBook() {
        return book;
    }
 
    public void setBook(String book) {
        this.book = book;
    }
    
    public Double getVolume() {
        return volume;
    }   
 
    public void setVolume(Double volume) {
        this.volume = volume;
    }
    
    public Double getChange_24() {
        return change_24;
    }
    
    public void setChange_24(Double change_24) {
        this.change_24 = change_24;
    }
 
    public Double getVwap() {
        return vwap;
    }
 
    public void setVwap(Double vwap) {
        this.vwap = vwap;
    }
 
    public Double getLow() {
        return low;
    }
 
    public void setLow(Double low) {
        this.low = low;
    }
 
    public Double getAsk() {
        return ask;
    }
 
    public void setAsk(Double ask) {
        this.ask = ask;
    }
 
    public Double getBid() {
        return bid;
    }
 
    public void setBid(Double bid) {
        this.bid = bid;
    }
 
    @Override
    public String toString() {
        return "Payload [high=" + high + ", last=" + last + ", createdAt=" + createdAt + ", book=" + book + ", volume="
                + volume + ", vwap=" + vwap + ", low=" + low + ", ask=" + ask + ", bid=" + bid + "]";
    }
 
}