package zendesk.logger;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
class LoggerHelper {
    private static final String DEFAULT_LOG_TAG = "Zendesk";
    private static final int MAXIMUM_ANDROID_LOG_TAG_LENGTH = 23;

    private LoggerHelper() {
    }

    public static String getAndroidTag(String str) {
        return StringUtils.isEmpty(str) ? "Zendesk" : str.length() > 23 ? str.substring(0, 23) : str;
    }

    public static char getLevelFromPriority(int i11) {
        if (i11 == 2) {
            return 'V';
        }
        if (i11 == 3) {
            return 'D';
        }
        if (i11 == 5) {
            return 'W';
        }
        if (i11 != 6) {
            return i11 != 7 ? 'I' : 'A';
        }
        return 'E';
    }

    public static List<String> splitLogMessage(String str, int i11) {
        int iMin;
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isEmpty(str)) {
            arrayList.add("");
            return arrayList;
        }
        if (i11 < 1) {
            arrayList.add(str);
            return arrayList;
        }
        if (str.length() <= i11) {
            arrayList.add(str);
            return arrayList;
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int iIndexOf = str.indexOf(StringUtils.LINE_SEPARATOR, i12);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i12 + i11);
                arrayList.add(str.substring(i12, iMin));
                if (iMin >= iIndexOf) {
                    break;
                }
                i12 = iMin;
            }
            i12 = iMin + 1;
        }
        return arrayList;
    }
}
