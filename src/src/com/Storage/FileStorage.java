import java.io.*;
import java.nio.file.*;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;


public class FileStorage {
    private List<String> list;
    private String path;

    public FileStorage(String path) {
        File dir = openCreateStorage(path);
        this.list = new ArrayList<>(Arrays.asList(dir.list()));
        this.path = dir.getAbsolutePath();
    }

    public void dialog() {
        Scanner scan = new Scanner("ssss"); //to do
    }

    public List<String> getList() {
        return list;
    }

    public File openCreateStorage(String path) {
        File dir = new File(path);
        if (dir.exists()) {
            if (dir.isDirectory()) {
                System.out.println("Storage opened " + path);
            }
        } else {
            dir.mkdirs();
            System.out.println("Path doesn't exist " + path);
            System.out.println("Creating new folder tree " + dir.getAbsolutePath());
        }

        return dir;
    }

    public static String checkKeyLength(String key) {
        if (key.length() > 128) {
            key = key.substring(0, 128);
            System.out.println("Key was truncated to 128");
        }
        return key;
    }

    private boolean keyExists(String key) {
        return list.contains(key);
    }

    public FileStorageElement getFile(String key) {
        key = checkKeyLength(key);
        FileStorageElement element = null;
        if (keyExists(key)) {
            try (FileInputStream fi = new FileInputStream(getFilePath(key));
                 ObjectInputStream oi = new ObjectInputStream(fi);) {

                element = (FileStorageElement) oi.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else System.out.println("Key doesn't exist");
        return element;
    }

    private void updateList(String key, char action) {
        key = checkKeyLength(key);
        switch (action) {
            case 'R':
                list.remove(key);
                break;
            case 'I':
                list.add(key);
                break;
        }
    }

    public void putFile(String key, String value) {
        key = checkKeyLength(key);
        FileStorageElement element = new FileStorageElement(key, value);
        try (FileOutputStream f = new FileOutputStream(getFilePath(key));
             ObjectOutputStream o = new ObjectOutputStream(f);) {
            o.writeObject(element);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!keyExists(key)) {
            updateList(key, 'I');
        }
    }

    public void removeFile(String key) {
        if (keyExists(key)) {
            if (getFilePath(key).delete()) {
                updateList(key, 'R');
                System.out.println("Removed file=> " + key);
            }
        }
    }

    public void showAllFilesKeys() {
        System.out.println("Showing all key = value");
        list.stream().forEach(e -> System.out.println(getFile(e).toString()));
    }

    public void showList() {
        System.out.println("Showing list");
        list.stream().forEach(n -> System.out.println(n));
    }

    private File getFilePath(String key) {
        return new File(this.path + "\\" + key);
    }
    public void refreshList(){
        this.list = new ArrayList<>(Arrays.asList(getFilePath("").list()));
    }
    public long countFiles(){
        return list.stream().count();
    }
}
