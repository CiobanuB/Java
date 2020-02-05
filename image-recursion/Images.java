package file;

import java.io.File;

public class Images {
    public static void main(String[] args) {
        File theFile = new File("C:\\Users\\Ciobanu\\Desktop\\Homework");
        displayFiles(theFile);
    }
    public static String returnExtension(String file) {
        String extension = file.substring(file.length() - 4);
        return extension;
    }
    public static void displayFiles(File theFile) {
        File[] fileListing = theFile.listFiles();
        for (File file : fileListing) {
            String lastChars = returnExtension(file.getPath());
            if (lastChars.equals(".jpg")){
                System.out.println(file);
            } else {
                String nextPath = file.getPath() + "\\";
                File nextFile = new File(nextPath);
                displayFiles(nextFile);
            }
        }
    }
}
