package m00;

import com.braze.Constants;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f28683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StringBuilder f28684b;

    static {
        Locale locale = Locale.ROOT;
        f28683a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f28684b = new StringBuilder(33);
    }

    public static void a(long j9, StringBuilder sb2) {
        if (j9 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z11 = false;
        if (j9 < 0) {
            sb2.append("-");
            if (j9 != Long.MIN_VALUE) {
                j9 = -j9;
            } else {
                j9 = LongCompanionObject.MAX_VALUE;
                z11 = true;
            }
        }
        if (j9 >= 86400000) {
            sb2.append(j9 / 86400000);
            sb2.append(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
            j9 %= 86400000;
        }
        if (true == z11) {
            j9 = 25975808;
        }
        if (j9 >= 3600000) {
            sb2.append(j9 / 3600000);
            sb2.append("h");
            j9 %= 3600000;
        }
        if (j9 >= TimeConstants.ONE_MINUTE_DIFFERENCE) {
            sb2.append(j9 / TimeConstants.ONE_MINUTE_DIFFERENCE);
            sb2.append("m");
            j9 %= TimeConstants.ONE_MINUTE_DIFFERENCE;
        }
        if (j9 >= 1000) {
            sb2.append(j9 / 1000);
            sb2.append(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
            j9 %= 1000;
        }
        if (j9 > 0) {
            sb2.append(j9);
            sb2.append("ms");
        }
    }
}
