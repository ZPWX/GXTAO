IO框架
    ：如何处理数据的输入输出问题
数据交换（文件、网络、数据库）
java.io.File代表磁盘上的文件/目录
文件对象和文件的关系与线程对象和线程的关系相同（从JVM->磁盘）
IO流：用于传输的流对象，用来在JVM和外部交换数据源之间传输数据（例如：管道）
流对象的三中分类
    按数据传输方向：输入流/输出流
    按传输数据单位：字符流和字节流
    按流的功能：节点流和过滤流
        节点流：实际传输数据的流
        过滤流：给节点流增强功能（不具有传输数据的作用，如：电线外层的塑料包皮）
字节中节点流的用法：节点流是基础，用来读写文件的流。
InputStream/OutputStream所有字节流输出/输出流的父类
    子类类名以父类类名作为引用
FileInputStream/FileOutputStream 文件字节输入/输出流
三个写方法：
    write(int a):把字节a写进文件中
    wirte(bye[] bs):把字节数组bs全部写出去
    *write(byte[] bs,int off,int lenght):把字节数组中的一段写进去，具体由后两个参数决定。
三个读方法：
    int read():从文件中度一个字节，返回-1结束
    int read(byte[] bs):从文件中读多个数组，直至读满。返回值为实际读到的字节数，以-1结束
    int read(byte[] bs,int off,int length):从文件中读多个字节，放入数组中，返回值为实际读到字节数，以-1为结束
IO编程的模式：
    1.创建节点流
    2.封装过滤流
    3.读/写数据
    4.关闭流
DataInputStream/DataOutputStream 可以直接读写8种基本类型和字符串  readUTF()/writeUTF()
BufferedInputStream/BufferedOutputStream 作用：缓冲，提高IO的效率
