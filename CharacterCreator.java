// Name: Jonathan Bernard Bloch
//Student ID: 260632216

package comp557.a1;

public class CharacterCreator {

	static public String name = "Dave - Jonathan Bernard Bloch - 260632216";
	
	/** 
	 * Creates a character.
	 * @return root DAGNode
	 */
	static public DAGNode create() {
		// TODO: use for testing, and ultimately for creating a character
		// Here we just return null, which will not be very interesting, so write
		// some code to create a character and return the root node.
		FreeJoint root = new FreeJoint("root", false);
		
		// dave is a robot
		Box dave = new Box("Dave");
		root.add(dave);
		
		// left arm
		HingeJoint leftArmTrans = new HingeJoint("LeftArmTrans", 0.5, 0, 0, 30.0);
		dave.add(leftArmTrans);
		Arm leftArm = new Arm("LeftArm");
		leftArmTrans.add(leftArm);
		HingeJoint leftForearmTrans = new HingeJoint("LeftForearmTrans", 0.9, 0, 0, 30.0);
		leftArm.add(leftForearmTrans);
		Arm leftForearm = new Arm("LeftForearm");
		leftForearmTrans.add(leftForearm);

		// mirror for the right
		BallJoint mirror = new BallJoint("Mirror", 0.0, 180.0, 0.0, false);
		dave.add(mirror);
		
		// right arm
		HingeJoint rightArmTrans = new HingeJoint("RightArmTrans", 0.5, 0, 0, 30.0);
		mirror.add(rightArmTrans);
		Arm rightArm = new Arm("RightArm");
		rightArmTrans.add(rightArm);
		HingeJoint rightForearmTrans = new HingeJoint("RightForearmTrans", 0.9, 0, 0, 30.0);
		rightArm.add(rightForearmTrans);
		Arm rightForearm = new Arm("RightForearm");
		rightForearmTrans.add(rightForearm);

		// head
		HingeJoint headTrans = new HingeJoint("HeadTrans", 0, 0.7, 0, 0);
		dave.add(headTrans);
		Sphere head = new Sphere("Head");
		headTrans.add(head);
		
		return root;
	}
}
