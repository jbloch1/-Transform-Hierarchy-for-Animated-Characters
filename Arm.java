// Name: Jonathan Bernard Bloch
//Student ID: 260632216

package comp557.a1;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GL2;

public class Arm extends DAGNode
{
	
	public Arm( String name ) {
		super(name);
	}

	@Override
    public void display( GLAutoDrawable drawable ) {
    	GL2 gl = drawable.getGL().getGL2();
		gl.glPushMatrix();
		gl.glRotated( 90, 0, 1, 0);
		glut.glutSolidCylinder(0.2f, 1.0f, 6, 1);
		gl.glPopMatrix();
		super.display(drawable);
    }

}
