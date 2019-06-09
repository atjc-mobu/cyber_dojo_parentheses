package cyber_dojo_parentheses;

import java.util.regex.Pattern;

public class Main {

    private static final Pattern PAIR_KAKKO_PATTERN = Pattern.compile("\\(\\)|\\[\\]|\\{\\}");
    
    public static boolean judgePair(String string) {
        if(isLengthZero(string)) return true;
        if(false == existsKakkoPair(string)) return false;
        String replacedString = replacePairKakkoToEmpty(string);
        return judgePair(replacedString);
    }

    public static boolean isLengthZero(String string) {
        return string.length() == 0;
    }

    public static String replacePairKakkoToEmpty(String string) {
        return PAIR_KAKKO_PATTERN.matcher(string).replaceAll("");
    }

    public static boolean existsKakkoPair(String string) {
        return PAIR_KAKKO_PATTERN.matcher(string).find();
    }

}
