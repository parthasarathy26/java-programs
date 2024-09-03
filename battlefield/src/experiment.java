import java.io.IOException;
import java.io.File;

class experiment{
    public static void main(String[] args) throws IOException {
        File f=new File("sarathy.txt");
        System.out.println(f.exists());
        File f2=new File("battlefield");
        f2.mkdir();
        f2.exists();
        System.out.println(f2.exists());
        


    }
}