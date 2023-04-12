libraries{}

'inputs'{
    doubleinputs {
        hi put doubleinputs inputs in me
        }
    timerinputs {
        put timer inputs here
        }
}

define area{
    define solinoid area{
 boolean autoBalanceMode;
 double kP = 0.06;
 double driveKP = 0.05;
 double lastError = 0;
 double kD = 0.00005;
 double driveKD = 0.002
double x1 = -8;
 double x2 = -2;
 double x3 = -2;
 double liftPos0 = 0;
 double extendoPos0 = 0;
double liftPos1 = -30;
double extendoPos1 = 1;
 double heading1 = 0;
 double heading2 = 0.25;
 double heading3 = 1;
 double heading4 = 0.5;
 double driveWheelCircumfrence = 18.85;
 double driveGearBoxRatio = 8.45;
    }
}