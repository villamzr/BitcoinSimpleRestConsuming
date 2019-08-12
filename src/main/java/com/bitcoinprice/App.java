package com.bitcoinprice;

public class App {
    public static void main(String[] args) throws ServiceException {
        BitsoClient client = new BitsoClient("https://api.bitso.com/", "v3");
        CoinPrice ripplePrice = client.getRipplePrice();
        CoinPrice bitcoin = client.getBitcoinPrice();
        System.out.println(String.format("Ripple price %s",ripplePrice.toString()));
        System.out.println(String.format("Bitcoin price %s",bitcoin.toString()));
    }
}