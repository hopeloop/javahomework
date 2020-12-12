import java.util.ArrayList;

//在内存中创建字节数组缓存区，将输入流读取的数据保存在缓存区中
import java.io.ByteArrayInputStream;
import java.io.File;//文件对象
import java.io.FileInputStream;//从文件中读取数据，new创建
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;

public class hash {
    // 使用SHA1哈希/摘要算法    take arbitrary-sized data and output a fixed-length hash value.
    //path:文件夹绝对地址 complete：已产生的hash值 使用递归算法进行深度遍历
    public static byte[] SHA1Checksum(String path, MessageDigest complete) throws Exception {
        // 用于计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];

        File dir = new File(path);
        //形成文件夹中文件的数组
        File[] fs = dir.listFiles();
        //将形成的数组按固定顺序排序
        Arrays.sort(fs);

        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                SHA1Checksum(path + File.separator + fs[i].getName(),complete);
                continue;
            }

            if(fs[i].isFile()) {
                System.out.println("file " + fs[i].getName());
                //创建输入流对象读取文件
                FileInputStream is = new FileInputStream(fs[i]);
                int numRead = 0;
                do {
                    // 读出numRead字节到buffer中
                    numRead = is.read(buffer);//is.read从InputStream中读取一些字节，并存入到bufferArrary中，返回实际读取的字节数
                    if (numRead > 0) {
                        // 根据buffer[0:numRead]的内容更新hash值
                        complete.update(buffer, 0, numRead);//参数：input,offset,length
                    }
                    // 文件已读完，退出循环
                } while (numRead != -1);//is.read返回-1：没有可读取的字节，已读到end
                // 关闭输入流
                is.close();
            }
        }
        // 返回SHA1哈希值 digest() computes the hash function on the current object and
        // returns the message digest in the form of byte array.
        return complete.digest();
    }
    public static void main(String[] args){
        try {
            String path = "C:\\Users\\cherr\\IdeaProjects\\recipes";
            MessageDigest complete = MessageDigest.getInstance("SHA-1");
            byte[] sha1 = SHA1Checksum(path,complete);//获得文件的hash值

            String result = "";
            for (int i = 0; i < sha1.length; i++) {
                result += Integer.toString(sha1[i], 16);
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}