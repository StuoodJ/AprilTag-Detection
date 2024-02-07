//might work
import LimelightHelpers;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Networktablelimelight{
  double tx = LimelightHelpers.getTX("");
  double ty = LimelightHelpers.getTY("");
  double ta = LimelightHelpers.getTA("");
  public void limelightvalues() {
    double botpose = LimelightHelpers.getBotpose("")
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    // NetworkTableEntry botpose = table.getEntry("t6r_fs");
    NetworkTableEntry botpose = table.getEntry("botpose");
    NetworkTableEntry tx = table.getEntry("tx");
    NetworkTableEntry ty = table.getEntry("ty");
    NetworkTableEntry ta = table.getEntry("ta");

    //read values periodically
    double pose = botpose.getDouble(0.0);
    double x = tx.getDouble(0.0);
    double y = ty.getDouble(0.0);
    double area = ta.getDouble(0.0);

    //post to smart dashboard periodically
    SmartDashboard.putNumber("LimelightBotPose", pose);
    SmartDashboard.putNumber("LimelightX", x);
    SmartDashboard.putNumber("LimelightY", y);
    SmartDashboard.putNumber("LimelightArea", area);
    }
    import edu.wpi.first.wpiutil.net.PortForwarder;
    @Override
  public void robotInit() {
        // Make sure you only configure port forwarding once in your robot code.
        // Do not place these function calls in any periodic functions
        for (int port = 5800; port <= 5807; port++) {
            PortForwarder.add(port, "limelight.local", port);
        }
    }
}
