import javax.swing.*;

public class 您的公共类名称(必须和文件名一样) {
    public static void main(String[] args) {
        // 创建窗口实例
        JFrame frame = new JFrame("黄文定的窗口");

        // 设置窗口关闭时的操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口的大小
        frame.setSize(400, 300);

        // 创建标签
        JLabel label = new JLabel("Hello, HuangWending!");

        // 将标签添加到窗口中心
        frame.getContentPane().add(label);

        // 显示窗口
        frame.setVisible(true);
    }
}
