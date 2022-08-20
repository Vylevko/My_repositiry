import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class StorageTest {
    public static void main(String[] args) throws IOException {

        //Storage storage = new Storage();
        //storage.showStorageKeys();
        //storage.setStorageKey("One","adyn".getBytes(StandardCharsets.UTF_8));
        //storage.setStorageKey("two","dwa".getBytes(StandardCharsets.UTF_8));
        //storage.showStorageKeys();
        //String path = "C:\\Users\\Yuriy Vylevko\\Music\\Projects\\Promsvyaz\\EC_payments\\TESTS\\results\\MIRAcqECPurchaseTest\\current\\[MIR EC] DEVH2H. 1.1. [Verif] (0) OK, [Auth] OK\\0_OnlineLauncher\\export_tables\\orig";
        //File dir = new File(path);

        //Arrays.stream(dir.listFiles()).sequential().filter(File::isFile).forEach(e->System.out.println(e.getName()));

        String path = "C:\\Users\\Yuriy Vylevko\\Documents\\MyJava\\TestRep\\Storagexx";
        String path2 = "AAASddsadsad";
        FileStorage str = new FileStorage(path);


        str.showList();


        str.refreshList();
        str.showAllFilesKeys();



       // System.out.println("through object");
        //str.showList();
       // System.out.println(FileStorage.checkKeyLength("AAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
    private static generateFiles(int cnt,FileStorage stor){
        for (int i = 0; i < cnt; i++){
            stor.putFile(Long.toHexString(Double.doubleToLongBits(Math.random())),Long.toHexString(Double.doubleToLongBits(Math.random())));
        }
    }


}
