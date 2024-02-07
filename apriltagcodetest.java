//might work
import LimelightHelpers;
double tx = LimelightHelpers.getTX("");
double ty = LimelightHelpers.getTY("");
double ta = LimelightHelpers.getTA("");
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

main{
  public void{strings[] args) {
    double botpose = LimelightHelpers.getBotpose("")
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry botpose = table.getEntry("t6r_fs");
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
}
