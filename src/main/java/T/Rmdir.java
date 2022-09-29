package T;

import Utils.HDFSUtils;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 17:35
 */

// 删除文件夹
public class Rmdir {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = HDFSUtils.getFileSystem();
        // true为递归删除 false单级目录删除
        boolean isOK = fileSystem.delete(new Path("/javaAPI/"), false);
        if (isOK)
            System.out.printf("删除文件夹成功");
        else
            System.out.printf("删除文件夹失败");
        HDFSUtils.closeFileSystem(fileSystem);
    }
}
