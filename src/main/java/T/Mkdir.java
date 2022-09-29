package T;

import Utils.HDFSUtils;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 17:30
 */

// 创建文件夹
public class Mkdir {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = HDFSUtils.getFileSystem();
        boolean isOK = fileSystem.mkdirs(new Path("/javaAPI/"));
        if (isOK)
            System.out.printf("创建文件夹成功");
        else
            System.out.printf("创建文件夹失败");
        HDFSUtils.closeFileSystem(fileSystem);
    }
}
