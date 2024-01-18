import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
NetworkTableEntry tx = table.getEntry("tx");
NetworkTableEntry ty = table.getEntry("ty");
NetworkTableEntry ta = table.getEntry("ta");

public class Test {

	public static void main(String[] args){

		System.out.println("Hello, World!");

        //read values periodically
        double x = tx.getDouble(0.0);
        double y = ty.getDouble(0.0);
        double area = ta.getDouble(0.0);

        //post to smart dashboard periodically
        SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("LimelightY", y);
        SmartDashboard.putNumber("LimelightArea", area);

        // I added this based a little bit off some documentation but also just what I think should work
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("botpose"); /*Translation (X,Y,Z) Rotation(Roll,Pitch,Yaw), total latency
        (cl+tl)*/

        //Camera - April tag coordinates
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("camerapose_targetspace");
        getDoubleArray(new double[6]);

        //April tag ID
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("tid");
	
	}
}

