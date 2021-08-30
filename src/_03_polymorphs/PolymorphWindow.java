package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
   ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>(5);
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 
   	 polymorphs.add(new BluePolymorph(50, 50, 50, 50));
   	 polymorphs.add(new RedMorph(200, 50, 50, 50));
   	 polymorphs.add(new MovingMorph(50, 150, 50, 50));
   	 polymorphs.add(new CircularMorph(150, 250, 60, 60));
   	 polymorphs.add(new MouseMorph(150, 250, 20, 40));
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(int i = 0; i < polymorphs.size(); i++) {

   	   	 polymorphs.get(i).draw(g);
   		 
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	repaint();
   	 	for(int i = 0; i < polymorphs.size(); i++) {

   	 		polymorphs.get(i).update();
   		 
   	 	}
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		polymorphs.get(4).x=e.getX()-10;
		polymorphs.get(4).y=e.getY()-20;
	}
}
