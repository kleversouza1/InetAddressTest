package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "google.com";
            InetAddress address = InetAddress.getByName(name); //verto de endreços para pegar ips
            System.out.println( "Name:      "+ name);
            
            System.out.println( "Address:   "+ address.getHostAddress()); // exibe os ips gethostadds 
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
