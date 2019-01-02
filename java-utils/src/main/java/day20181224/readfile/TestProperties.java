package day20181224.readfile;

import java.io.*;
import java.util.Properties;

/**
 * @authar nieChenLiang
 * @date 2018-12-21 15:07
 * 使用 java.util.properties 读取项目文件和本地文件
 * 读取格式:properties  txt
 */
public class TestProperties {

    public  static  void main(String... args) throws FileNotFoundException {
        Properties properties=new Properties();
        InputStream inputStream= TestProperties.class.getClassLoader().getResourceAsStream("test.properties");
        BufferedInputStream fileInputStream=new BufferedInputStream(new FileInputStream("D:\\Desktop\\todo1.txt"));
        try {
            properties.load(new InputStreamReader(inputStream,"gbk"));
            System.out.println(properties.getProperty("name"));
            properties.load(new InputStreamReader(fileInputStream,"gbk"));
            System.out.println(properties.getProperty("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
