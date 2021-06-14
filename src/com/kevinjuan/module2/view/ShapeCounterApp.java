/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module2.view;

import com.kevinjuan.module2.entity.Ball;
import com.kevinjuan.module2.entity.Square;
import com.kevinjuan.module2.entity.Tube;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeCounterApp {
    private JButton ballButton;
    private JButton tubeButton;
    private JButton squareButton;
    private JButton countButton1;
    private JTextField radiusTube;
    private JButton countButton;
    private JTextField heightTube;
    private JTextField heightSquare;
    private JButton countButton2;
    private JPanel ShapeCounterApp;
    private JPanel SquarePanel;
    private JPanel TubePanel;
    private JPanel JPanel;
    private JPanel BallPanel;
    private JPanel jPanelA;
    private JTextField radiusBall;
    private JTextField widthSquare;
    private Ball ball;
    private Tube tube;
    private Square square;

    public ShapeCounterApp() {


        ballButton.addActionListener(e -> {
            jPanelA.removeAll();
            jPanelA.repaint();
            jPanelA.revalidate();

            jPanelA.add(BallPanel);
            jPanelA.repaint();
            jPanelA.revalidate();
        });
        tubeButton.addActionListener(e -> {
            jPanelA.removeAll();
            jPanelA.repaint();
            jPanelA.revalidate();

            jPanelA.add(TubePanel);
            jPanelA.repaint();
            jPanelA.revalidate();
        });
        squareButton.addActionListener(e -> {
            jPanelA.removeAll();
            jPanelA.repaint();
            jPanelA.revalidate();

            jPanelA.add(SquarePanel);
            jPanelA.repaint();
            jPanelA.revalidate();
        });
        countButton1.addActionListener(e -> {
            if (radiusBall.getText().isEmpty()){
                JOptionPane.showMessageDialog(ShapeCounterApp,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String text = radiusBall.getText();
                text = text.replaceAll(",", ".");
                double doubleRadius = Double.parseDouble(text);
                ball = new Ball(doubleRadius);
                JOptionPane.showMessageDialog(ShapeCounterApp,ball.getDescription(),"Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        countButton.addActionListener(e -> {
            if (radiusTube.getText().isEmpty() || heightTube.getText().isEmpty()){
                JOptionPane.showMessageDialog(ShapeCounterApp,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String text = radiusTube.getText();
                text = text.replaceAll(",", ".");
                String text2 = heightTube.getText();
                text2 = text2.replaceAll(",", ".");
                double doubleRadius = Double.parseDouble(text);
                double doubleHeigth = Double.parseDouble(text2);
                tube = new Tube(doubleRadius,doubleHeigth);
                JOptionPane.showMessageDialog(ShapeCounterApp,tube.getDescription(),"Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        countButton2.addActionListener(e -> {
            if (widthSquare.getText().isEmpty()){
                JOptionPane.showMessageDialog(ShapeCounterApp,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String text = widthSquare.getText();
                text = text.replaceAll(",", ".");
                String text2 = heightSquare.getText();
                text2 = text2.replaceAll(",", ".");
                double doubleWidth = Double.parseDouble(text);
                double doubleHeigth = Double.parseDouble(text2);
                square = new Square(doubleWidth,doubleHeigth);
                JOptionPane.showMessageDialog(ShapeCounterApp,square.getDescription(),"Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ShapeCounterApp");
        frame.setContentPane(new ShapeCounterApp().ShapeCounterApp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
