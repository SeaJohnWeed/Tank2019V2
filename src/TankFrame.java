import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankFrame extends Frame {
    private Tank myTank;
    private Tank enemy;

    public TankFrame () {
        this.setTitle("tank war");
        this.setLocation(400,100);
        this.setSize(800, 600);
        this.addKeyListener(new TankKeyListener()); //响应键盘事件 Observer

        myTank = new Tank(100, 100, Dir.STOP);
        enemy = new Tank(200, 200, Dir.R);

    }

    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
        enemy.paint(g);
    }

    private class TankKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            myTank.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {
            myTank.keyReleased(e);
        }
    }
}
