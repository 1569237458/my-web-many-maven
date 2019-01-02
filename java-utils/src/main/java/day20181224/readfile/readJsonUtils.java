package day20181224.readfile;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @authar nieChenLiang
 * @date 2018-12-26 15:06
 */
public class readJsonUtils {
    public String getAreas() {
        String path = getClass().getClassLoader().getResource("area.json").toString();
        System.out.println(path+"001");
        path = path.replace("\\", "/");
        System.out.println(path+"002");
        if (path.contains(":")) {
            path = path.replace("file:/", "");// 2
            System.out.println(path+"003");
        }
        try {
            String input = FileUtils.readFileToString(new File(path), "UTF-8");
            return  input;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
