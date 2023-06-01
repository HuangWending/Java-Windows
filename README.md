# Java-Windows
Java窗口Hello,HuangWending程序
import javax.swing.*：导入javax.swing包，其中包含了用于创建图形用户界面（GUI）的类和接口。
public class HuangWendingWindow：定义一个名为HuangWendingWindow的公共类。
public static void main(String[] args)：定义了程序的入口点，从这里开始执行程序。
JFrame frame = new JFrame("黄文定的窗口")：创建一个JFrame对象，表示窗口实例，并设置窗口的标题为"黄文定的窗口"。
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)：设置窗口关闭时的操作为退出程序。
frame.setSize(400, 300)：设置窗口的大小为宽度400像素，高度300像素。
JLabel label = new JLabel("Hello, HuangWending!")：创建一个JLabel对象，用于显示文本"Hello, HuangWending!"。
frame.getContentPane().add(label)：将标签添加到窗口的内容面板中心。
frame.setVisible(true)：显示窗口，使其可见。
通过运行这段代码，你将创建一个标题为"My Window"、大小为400x300像素的窗口，并在窗口中心显示文本"Hello,HuangWending!"。当你关闭窗口时，程序将退出。
