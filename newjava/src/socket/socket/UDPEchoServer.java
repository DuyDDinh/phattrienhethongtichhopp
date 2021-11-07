package socket ;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.DatagramSocketImpl;

public class UDPEchoServer {
    public final static int serverPort = 7 ;
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(serverPort);
            System.out.println("Server Created... ");
            byte[] buffer = new byte[6000];
            while (true) {
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                ds.receive(incoming);
                string theString = new String(incoming.getData(),0,incoming.getLength());
                DatagramPacket outsending = new DatagramPacket(buffer, buffer.length);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
