package org.example;

import javax.swing.*;

/**
 * Maze
 *
 * @author PlutoCtx 15905898514@163.com
 * @version 2024/1/3 15:33
 * @since JDK17
 */

public class GameFrame extends JFrame {
    //构造方法
    public GameFrame(){
        setTitle("迷宫");//设置标题
        setSize(420, 480);//设置窗体大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭后进程退出
        setLocationRelativeTo(null);//居中
        setResizable(false);//不允许变大
    }
}
