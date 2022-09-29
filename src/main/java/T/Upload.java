package T;

import Utils.HDFSUtils;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 17:51
 */

// 上传文件
public class Upload {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = HDFSUtils.getFileSystem();
        Path localFile = new Path("G:\\Coding\\java\\HDFS_API\\src\\main\\java\\Utils\\HDFSUtils.java");
        Path remoteFile = new Path("/");
        fileSystem.copyFromLocalFile(localFile, remoteFile);
        System.out.println("上传文件成功");
        HDFSUtils.closeFileSystem(fileSystem);
    }
}
