// Name: Jonathan Bernard Bloch
//Student ID: 260632216

package comp557.a1;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class BallJoint extends DAGNode {
	DoubleParameter rx;
	DoubleParameter ry;
	DoubleParameter rz;
		
	public BallJoint(String name, double x, double y, double z, boolean canChange)
	{
		super(name);
		dofs.add( rx = new DoubleParameter( name+" rx", x, canChange ? -180 : x, canChange ? 180 : x ) );
		dofs.add( ry = new DoubleParameter( name+" ry", y, canChange ? -180 : y, canChange ? 180 : y ) );
		dofs.add( rz = new DoubleParameter( name+" rz", z, canChange ? -180 : z, canChange ? 180 : z ) );
	}
	
	@Override
	public void display(GLAutoDrawable drawable) 
	{
		GL2 gl = drawable.getGL().getGL2();

		// TODO: implement the rest of this method
		gl.glPushMatrix();
		gl.glRotated( rx.getValue(), 1, 0, 0);
		gl.glRotated( ry.getValue(), 0, 1, 0);
		gl.glRotated( rz.getValue(), 0, 0, 1);
		
		super.display(drawable);
		gl.glPopMatrix();		

	}
}
