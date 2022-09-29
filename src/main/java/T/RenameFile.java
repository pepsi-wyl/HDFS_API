package T;

import Utils.HDFSUtils;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 18:08
 */

// 修改HDFS中的文件和文件夹的名称
public class RenameFile {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = HDFSUtils.getFileSystem();
        Path oldPath = new Path("/HDFSUtils.java");
        Path newPath = new Path("/HDFSUtils_rename.java");
        boolean rename = fileSystem.rename(oldPath, newPath);
        if (rename)
            System.out.println("重命名成功");
        else
            System.out.println("重命名失败");
        HDFSUtils.closeFileSystem(fileSystem);
    }
}
