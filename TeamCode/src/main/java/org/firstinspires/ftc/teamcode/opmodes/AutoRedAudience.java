package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.util.BusyWaitHandler;
import org.firstinspires.ftc.teamcode.autonomous.AutonomousDelegator;
import org.firstinspires.ftc.teamcode.autonomous.TeamPosition;
import org.firstinspires.ftc.teamcode.twigger.Twigger;

/**
 * Autonomous op-mode for Red alliance, side near audience
 */
@Autonomous(name="Auto Red Audience", group="Competition")
public class AutoRedAudience extends LinearOpMode implements BusyWaitHandler {
    @Override
    public void runOpMode() throws InterruptedException {
        AutonomousDelegator strategy = new AutonomousDelegator(TeamPosition.RED_A, this,
                this);

        waitForStart();

        strategy.start();
    }

    @Override
    public boolean isActive() {
        Twigger.getInstance().update();
        return opModeIsActive();
    }
}
