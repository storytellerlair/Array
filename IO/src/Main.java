import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("F://day__22_NewIO//");
        getJavaFile(file);
    }
    private static void getJavaFile(File file) {
        //获取该路径下的所有的文件
        File[] fileArray = file.listFiles();
        //循环遍历
        for (File onefile:fileArray) {
            //判断是不是文件
            if (onefile.isDirectory()){
                getJavaFile(onefile);
            }else {
                //判断是否是.java结尾的文件
                if (onefile.getName().endsWith(".java")){
                    System.out.println("文件的绝对路径是" + onefile.getAbsolutePath());
                }
            }
        }
    }
}
