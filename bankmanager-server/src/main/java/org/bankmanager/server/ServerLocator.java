package org.bankmanager.server;

import com.ontimize.locator.SecureReferenceLocator;

import java.util.Hashtable;

public class ServerLocator extends SecureReferenceLocator {

    public ServerLocator(int port, Hashtable parameters) throws Exception {
        super(port, parameters);
    }
}