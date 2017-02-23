package org.firstinspires.ftc.teamcode;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.util.Range;

@Autonomous(name = "Zimbabwe", group = "AUTO")
public class Zimbabwe extends LinearOpMode {
    DcMotor frontRight;
    DcMotor frontLeft;
    DcMotor backRight;
    DcMotor backLeft;
    double expoCurve;
    double driveX;
    double driveY;
    double driveRotate;
    int var = 0;
    DistanceSensor dSensor;
    double cValue;
    public void runOpMode () {

        roboInit();
    }
    public void roboInit() {

    }

    public void dirve() {
        driveRotate = gamepad1.right_stick_x;
        driveY      = gamepad1.left_stick_y;
        driveX      = gamepad1.left_stick_x;

        frontRight.setPower(expo(constrain(driveRotate + driveY + driveX),expoCurve));
        frontLeft.setPower(expo(constrain(driveRotate - driveY + driveX),expoCurve));
        backRight.setPower(expo(constrain(driveRotate + driveY - driveX),expoCurve));
        backLeft.setPower(expo(constrain(driveRotate - driveY  - driveX),expoCurve));
    }

    double constrain(double x){

        double speed;
        speed = x;

        speed = Range.clip(speed, -1, 1);

        return speed;

    }

    double expo(double x, double a){

        double y = x;
        y = a * Math.pow(y, 3) + (1-a)*y;
        return y;

    }
    public void switchStatemnt () {
        switch(var){
            case 1:

            case 2:
        }
    }
    public void debug () {
        telemetry.addData( "DISTANCE_SENSOR_NORMAL", dSensor);

    }
}