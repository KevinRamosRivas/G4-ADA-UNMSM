package AlgoritmosGeometricas.caminosimple;

import java.awt.Graphics;
import java.util.LinkedList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa extends JComponent{
     private final LinkedList<Linea> lineas = new LinkedList<>();
   
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Linea linea : lineas) {
            g.setColor(linea.color);
            g.drawLine(linea.x1, linea.y1, linea.x2, linea.y2);
        }
    } 
    public void addLine(Punto p1, Punto p2, Color color) {
        lineas.add(new Linea(p1,p2, color));
        repaint();
    }    
    public void clearLines() {
        lineas.clear();
        repaint();
    }    
    public static void main(String[] args) {

        Punto p[] = new Punto[10];    
        Punto pivote = new Punto(160,100); 
        ArrayList<Double> al = new ArrayList<>();
        Ordenar a[];
        a = new Ordenar[6];
        Linea m = new Linea();
        
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        final Programa comp = new Programa();
        comp.setPreferredSize(new Dimension(320, 200));
        testFrame.getContentPane().add(comp, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();
        JButton newLineButton = new JButton("Iniciar");
        JButton clearButton = new JButton("Borrar");
        buttonsPanel.add(newLineButton);
        buttonsPanel.add(clearButton);
        testFrame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
        
        for(int l=0;l<6;l++){
            p[l]= new Punto((int)(Math.random()*100),(int)(Math.random()*100));
            System.out.println(p[l].getX()+"\t"+p[l].getY());
        }
        for (int n = 0; n < 6; n++) {
            al.add(m.Theta(pivote, p[n]));
        }        
        for (int k = 0; k < 6; k++) {
            a[k] = new Ordenar(al.get(k), p[k].getX(), p[k].getY());
        }        
        Ordenar temp = new Ordenar(0,0,0);
        for (int i = 1; i < 6; i++) {
            for (int j = 6 - 1; j >= i; j--) {
                
                if (a[j - 1].getN() > a[j].getN()) {
                    temp.setN(a[j - 1].getN());
                    a[j - 1].setN(a[j].getN());
                    a[j].setN(temp.getN());
                    temp.setX(a[j - 1].getX());
                    a[j - 1].setX(a[j].getX());
                    a[j].setX(temp.getX());
                    temp.setY(a[j - 1].getY());
                    a[j - 1].setY(a[j].getY());
                    a[j].setY(temp.getY());
                }
            }
        }   
        
        newLineButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Color randomColor = new Color(0,0,0); 
                comp.addLine(pivote,a[0],randomColor);
                for(int t=0;t<5;t++){               
                    comp.addLine(a[t], a[t+1], randomColor);
                }
                comp.addLine(a[5],pivote,randomColor);                
            }
        });
    clearButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            comp.clearLines();
        }
    });
        
    testFrame.pack();
    testFrame.setVisible(true);        
    }
}