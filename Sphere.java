// Name: Jonathan Bernard Bloch
//Student ID: 260632216

package comp557.a1;

import com.jogamp.opengl.GLAutoDrawable;

public class Sphere extends DAGNode{
	public Sphere( String name ) {
		super(name);
	}

	@Override
    public void display( GLAutoDrawable drawable ) {
    	glut.glutSolidSphere(0.4f, 8, 5);
		super.display(drawable);
    }

}
