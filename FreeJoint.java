// Name: Jonathan Bernard Bloch
//Student ID: 260632216

package comp557.a1;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class FreeJoint extends DAGNode {

	DoubleParameter tx;
	DoubleParameter ty;
	DoubleParameter tz;
	DoubleParameter rx;
	DoubleParameter ry;
	DoubleParameter rz;
		
	public FreeJoint( String name , boolean canAnimate) {
		super(name);
		dofs.add( tx = new DoubleParameter( name+" tx", 0, canAnimate ? -2 : 0, canAnimate ? 2 : 0 ) );		
		dofs.add( ty = new DoubleParameter( name+" ty", 0, canAnimate ? -2 : 0, canAnimate ? 2 : 0 ) );
		dofs.add( tz = new DoubleParameter( name+" tz", 0, canAnimate ? -2 : 0, canAnimate ? 2 : 0 ) );
		dofs.add( rx = new DoubleParameter( name+" rx", 0, canAnimate ? -180 : 0, canAnimate ? 180 : 0 ) );		
		dofs.add( ry = new DoubleParameter( name+" ry", 0, canAnimate ? -180 : 0, canAnimate ? 180 : 0 ) );
		dofs.add( rz = new DoubleParameter( name+" rz", 0, canAnimate ? -180 : 0, canAnimate ? 180 : 0 ) );
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
		gl.glRotated( rx.getValue(), 1, 0, 0);
		gl.glRotated( ry.getValue(), 0, 1, 0);
		gl.glRotated( rz.getValue(), 0, 0, 1);
		
		super.display(drawable);
		gl.glPopMatrix();		
	}
}

