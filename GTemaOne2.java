package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * GTemaOne.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class GTemaOne2 implements GLEventListener {
    static GL gl;
    static GLU glu;
    static Toolkit miPantalla = Toolkit.getDefaultToolkit();
    static Dimension dimension = miPantalla.getScreenSize();
    static int ancho = 10;
    static int alto = 20;
    
    public static void main(String[] args) {
        Frame frame = new Frame("Líneas secuenciales en pantalla");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new GTemaOne2());
        frame.add(canvas);
        frame.setSize(dimension.width, dimension.height);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) { 
        glu = new GLU();
            gl = drawable.getGL();
            gl.glClearColor(0, 0, 0, 1);
            gl.glMatrixMode(gl.GL_PROJECTION);
            glu.gluOrtho2D(0, dimension.width, 0, dimension.height);
            System.out.println(dimension.width + " + " + dimension.height);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        
    }

    public void display(GLAutoDrawable drawable) {

        gl.glLineWidth(2);
        gl.glColor3f(1, 0, 0);

        for (int i = 0; i < dimension.getHeight(); i = i + 24) {
            int x = 352, y = 350, x1 = (int)dimension.getWidth()-343, y1 = 400;
            gl.glBegin(GL.GL_LINES);

            gl.glVertex2d(x - i, y - i);
            gl.glVertex2d(x1 + i, y - i);

            gl.glVertex2d(x - i, y - i);
            gl.glVertex2d(x - i, y1 + i);

            gl.glVertex2d(x - i, y1 + i);
            gl.glVertex2d(x1 + i, y1 + i);

            gl.glVertex2d(x1 + i, y - i);
            gl.glVertex2d(x1 + i, y1 + i);

            gl.glEnd();

        }
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

