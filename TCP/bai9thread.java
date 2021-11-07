

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class bai9thread extends Thread {
    Socket soc;
    public bai9thread (Socket s){
        soc=s;
    }
    public void run(){
        try {
            //nhan ten file
            InputStream is=soc.getInputStream();
            byte[] inputbyte=new byte[60000];
            int length=is.read(inputbyte);
            String str=new String(inputbyte, 0, length);

            while (true) {
                OutputStream os=soc.getOutputStream();
            
                File files=new File(str);
                FileReader fr=new FileReader(files);
                
                //doc du lieu va gui noi dung
                BufferedReader br=new BufferedReader(fr);
                String line="";
                
                while (line!=null) {
                    line=br.readLine();
                    System.out.println(line+"\n");
                    os.write(line.getBytes());
                }
                // int i;
                // i=br.read();
                // while (i!=-1) {
                //     System.out.println((char) i);
                
                // }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("loi doc file: "+e);
        }
    }
    
}
