import java.io.*;

public class Titkosit {
    public static void main(String[] args){
        try {
            InputStream in = new FileInputStream("adat.dat");
            OutputStream out = new FileOutputStream("masolat.dat");
            int b;
            while ((b = in.read()) != -1) {
                out.write(b + 1);
            }



            out.flush();
            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
