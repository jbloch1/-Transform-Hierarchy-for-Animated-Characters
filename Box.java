// Name: Jonathan Bernard Bloch
//Student ID: 260632216

package comp557.a1;

import com.jogamp.opengl.GLAutoDrawable;

public class Box extends DAGNode
{
	
	public Box( String name ) {
		super(name);
	}

	@Override
    public void display( GLAutoDrawable drawable ) {
    	glut.glutSolidCube(1.0f);
		super.display(drawable);
    }

}
