package zendesk.logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
class StringUtils {
    static final String EMPTY_STRING = "";
    static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static boolean hasLength(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static boolean isEmpty(String str) {
        return !hasLength(str);
    }
}
