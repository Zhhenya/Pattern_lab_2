package MagicAtributes;

import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.KillProperties.TryKillPlayer;

import java.util.HashMap;
import java.util.Map;

public class BallPropertiesFactory {
    static Map<Integer, BallProperties> ballPropertiesMap = new HashMap<>();

    public static BallProperties getBallProperties(Fly fly, BreakDown breakDown, TryKillPlayer tryKillPlayer, int ballSize, int points){
        BallProperties result = ballPropertiesMap.get(ballSize);
        if(result == null){
            result = new BallProperties(fly, breakDown, tryKillPlayer, ballSize, points);
            ballPropertiesMap.put(ballSize, result);
        }
        return result;
    }
}