package Utils;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 17:11
 */

public class HDFSUtils {

    /**
     * 获取Configuration
     */
    private static Configuration getConfiguration() {
        Configuration configuration = new Configuration();
        // 这里指定使用的是HDFS文件系统
        configuration.set("fs.defaultFS", "hdfs://192.168.131.144:9000");
        configuration.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");
        return configuration;
    }

    /**
     * 获取FileSystem
     */
    public static FileSystem getFileSystem() throws IOException {
        // 通过如下的方式进行客户端身份的设置
        System.setProperty("HADOOP_USER_NAME", "root");
        // 通过FileSystem的静态方法获取文件系统客户端对象
        FileSystem fileSystem = null;
        return FileSystem.get(getConfiguration());
    }

    /**
     * 关闭FileSystem
     */
    public static void closeFileSystem(FileSystem fileSystem) throws IOException {
        fileSystem.close();
    }

}
