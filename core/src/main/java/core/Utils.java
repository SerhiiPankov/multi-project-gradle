package core;

import utils.StringUtils;
import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return !Arrays.stream(str).map(StringUtils::isPositiveNumber)
                .toList().contains(false);
    }
}
