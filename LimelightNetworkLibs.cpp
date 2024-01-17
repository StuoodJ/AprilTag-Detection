//most of the code is from the documentation except the stuff that wasnt finished
//sorry for turning it back to C++ the docs for java arent clear enough for me to finish it
#include <iostream>
using namespace std;

//limelight lib c++
//all of the includes are flagged because those libraries are most likely supposed to be locally run
//which means it will work dont worry we just need a computer with those libraries
//and im pretty sure whatever computers kedz has for running code has them

#include "LimelightHelpers.h"

double tx = LimelightHelpers::getTX("");
double ty = LimelightHelpers::getTY("");

#include "frc/smartdashboard.Smartdashboard.h"
#include "networktables/NetworkTable.h"
#include "networktables/NetworkTableInstance.h"
#include "networktables/NetworkTableEntry.h"
#include "networktables/NetworkTableValue.h"
#include "wpi/span.h"

int main {
    std::shared_ptr<nt::NetworkTable> table = nt::NetworkTableInstance::GetDefault().GetTable("limelight");
    double targetOffsetAngle_Horizontal = table->GetNumber("tx",0.0);
    double targetOffsetAngle_Vertical = table->GetNumber("ty",0.0);
    double targetArea = table->GetNumber("ta",0.0);
    double targetSkew = table->GetNumber("ts",0.0);

    // the lines below what ive written where i believe it finishes it because the documentation doesnt finish it in every language
    tX = SmartDashboard.putNumber("LimelightX", targetOffsetAngle_Horizontal);
    tY = SmartDashboard.putNumber("LimelightY", targetOffsetAngle_Vertical);
    tA = SmartDashboard.putNumber("LimelightArea", targetArea);
    tS = SmartDashboard.putNumber("LimelightSkew", targetSkew);
}

//port forwarder requires https://docs.wpilib.org/en/latest/docs/networking/networking-utilities/portforwarding.html
//#include <wpi/PortForwarder.h>
//void Robot::RobotInit 
//{
    //for (int port = 5800; port <= 5805; port++)
    //{
        //wpi::PortForwarder::GetInstance().Add(port, "limelight.local", port);
    //}
//}
    
