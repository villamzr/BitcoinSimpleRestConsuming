package com.bitcoinprice;

import java.util.logging.Logger;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
 
public class BitsoClient extends AbstractClient {
    private static final Logger log = Logger.getLogger(BitsoClient.class.getName());
 
    public BitsoClient(String url, String contextPath) {
        super(url, contextPath);
    }
 
    public CoinPrice getRipplePrice() throws ServiceException {
        log.info("Getting ripple price");
        WebTarget client = createClient(ApplicationEndpoint.getCoinPrice("xrp_mxn"));
        Response response = client.request(MediaType.APPLICATION_JSON).get();
        log.info("Status " + response.getStatus());
        CoinPrice result = null;
        Integer status = response.getStatus();
        if (Status.OK.getStatusCode() == status) {
            result = response.readEntity(CoinPrice.class);
        } else {
            throw new ServiceException(response.readEntity(String.class), status);
        }
        return result;
    }
 
    public CoinPrice getBitcoinPrice() throws ServiceException {
        log.info("Getting ripple price");
        WebTarget client = createClient(ApplicationEndpoint.getCoinPrice("btc_mxn"));
        Response response = client.request(MediaType.APPLICATION_JSON).get();
        log.info("Status " + response.getStatus());
        CoinPrice result = null;
        Integer status = response.getStatus();
        if (Status.OK.getStatusCode() == status) {
            result = response.readEntity(CoinPrice.class);
        } else {
            throw new ServiceException(response.readEntity(String.class), status);
        }
        return result;
    }
 
}