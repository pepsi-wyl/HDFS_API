package T;

import Utils.HDFSUtils;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 20:05
 */

// 查看HDFS中的文件
public class CatFile {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = HDFSUtils.getFileSystem();
        FSDataInputStream in = fileSystem.open(new Path("/HDFSUtils.java"));
        IOUtils.copyBytes(in, System.out, 1024);
        HDFSUtils.closeFileSystem(fileSystem);
    }
}
