package com.bitcoinprice;

public class ApplicationEndpoint {
    private static String TICKER = "/ticker";
 
    public static String getCoinPrice(String coin) {
        return TICKER.concat(String.format("?book=%s", coin));
    }
}