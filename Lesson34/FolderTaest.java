package Lesson34;

import java.io.File;
import java.io.IOException;

public class FolderTaest {
    public static void main(String[] args) {
        File folder = new File("D://111//222");
        /*boolean created = folder.mkdir(); //создали каталог(папку)
        if (created) {
            System.out.println("Папка создна, путь " + folder.getAbsolutePath());
        } else {
            System.out.println("Папка не создна");
        }
        */
        File newFolder = new File("D://111/new222");
        /*boolean renamed = folder.renameTo(newFolder);
        if(renamed){
            System.out.println("Папка создна, путь " + folder.getAbsolutePath() + " переименована в " +
                    newFolder.getAbsolutePath());
        }else{
            System.out.println("Папка " + folder.getAbsolutePath() + " не переименована в " +
                    newFolder.getAbsolutePath());
        }*/

        boolean delete = newFolder.delete();
        if(delete) {
            System.out.println("Папка " + folder.getAbsolutePath() + "удалена");
        }
        else{
            System.out.println("Папка " + folder.getAbsolutePath() + "не удалена");
        }
    }
}
