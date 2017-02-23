package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by cicada02 on 2/22/17.
 */
@Autonomous (name = "WhatInCarnation", group = "Countries")
public class WhatInCarnation extends LinearOpMode {

    DcMotor frontRight;
    DcMotor frontLeft;
    DcMotor backRight;
    DcMotor backLeft;
    double motorOff;

    Servo beaconRight;
    Servo beaconLeft;

    OpticalDistanceSensor odsSensor;

    double odsDistance;

    int value;

    public void roboInit(){

        motorOff = 0.0;

        odsSensor = hardwareMap.opticalDistanceSensor.get("sensor_ods");

        odsDistance = 0.05;

        value = 1;

    }

    public void runOpMode(){

        roboInit();

        becaonSwitchCase();
        distanceSensor();

    }

    public void becaonSwitchCase(){

        switch(value){



        }

    }

    public void distanceSensor(){

        if (odsSensor.getRawLightDetected() > odsDistance && opModeIsActive()){

            frontRight.setPower(motorOff);
            frontLeft.setPower(motorOff);
            backRight.setPower(motorOff);
            backLeft.setPower(motorOff);

        }
        value++;

    }

}
