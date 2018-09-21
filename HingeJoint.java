// Name: Jonathan Bernard Bloch
//Student ID: 260632216

package comp557.a1;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class HingeJoint extends DAGNode {
	
	DoubleParameter tx;
	DoubleParameter ty;
	DoubleParameter tz;
	DoubleParameter rz;
		
	public HingeJoint(String name, double x, double y, double z, double theta)
	{
		super(name);
		// these should not move, only the angle will change, hinge like
		dofs.add( tx = new DoubleParameter( name+" tx", x, x, x /*-2, 2*/ ) );
		dofs.add( ty = new DoubleParameter( name+" ty", y, y, y /*-2, 2*/ ) );
		dofs.add( tz = new DoubleParameter( name+" tz", z, z, z /*-2, 2*/ ) );
		dofs.add( rz = new DoubleParameter( name+" rz", theta, -180, 180 ) );
	}
	
	@Override
	public void display(GLAutoDrawable drawable) 
	{
		GL2 gl = drawable.getGL().getGL2();

		// TODO: implement the rest of this method
		gl.glPushMatrix();
		gl.glTranslated(tx.getValue(), 0, 0);
		gl.glTranslated(0, ty.getValue(), 0);
		gl.glTranslated(0, 0, tz.getValue());
		gl.glRotated( rz.getValue(), 0, 0, 1);
		
		super.display(drawable);
		gl.glPopMatrix();		

	}

}
