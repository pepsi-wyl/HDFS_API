package T;

import Utils.HDFSUtils;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 17:56
 */

// 下载文件
public class Download {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = HDFSUtils.getFileSystem();
        Path remoteFile = new Path("/HDFSUtils.java");
        Path localFile = new Path("G:\\Coding\\java\\HDFS_API\\src");
        fileSystem.copyToLocalFile(remoteFile, localFile);
        System.out.println("下载文件成功");
    }
}
