package T;

import Utils.HDFSUtils;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 17:47
 */

// 列出HDFS文件
public class ListFiles {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = HDFSUtils.getFileSystem();
        FileStatus[] statuses = fileSystem.listStatus(new Path("/"));
        for (FileStatus fileStatus : statuses) {
            // fileStatus为文件状态存储文件的信息
            System.out.println(fileStatus.getPath());
        }
        HDFSUtils.closeFileSystem(fileSystem);
    }
}
