package org.bankmanager.server;

import com.ontimize.gui.ServerLauncher;

public class ProjectServerLauncher {
    public static void main( String[] args ){
        try {
            ServerLauncher.main( args );
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }
}
