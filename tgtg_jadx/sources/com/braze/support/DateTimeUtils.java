package com.braze.support;

import android.os.Build;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import w.a0;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001d\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010\u001b\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001f\u001a\u0011\u0010 \u001a\u00020\u0000*\u00020\u000b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\b¢\u0006\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&\"\u001c\u0010)\u001a\n (*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0016\u0010-\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.\"!\u00106\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"", "nowInSeconds", "()J", "", "nowInSecondsPrecise", "()D", "nowInMilliseconds", "nowInMillisecondsSystemClock", "", "Lcom/braze/enums/BrazeDateFormat;", "dateFormat", "Ljava/util/Date;", "parseDate", "(Ljava/lang/String;Lcom/braze/enums/BrazeDateFormat;)Ljava/util/Date;", "Ljava/util/TimeZone;", "timeZone", "formatDate", "(Ljava/util/Date;Lcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "formatDateNow", "(Lcom/braze/enums/BrazeDateFormat;)Ljava/lang/String;", "", "year", "month", "day", "hours", "minutes", "seconds", "createDate", "(IIIIII)Ljava/util/Date;", "formatDateFromMillis", "(JLcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "(J)Ljava/util/Date;", "getTimeFromEpochInSeconds", "(Ljava/util/Date;)J", "", "isValidTimeZone", "(Ljava/lang/String;)Z", "MSECS_IN_SEC", "J", "MINIMUM_NETWORK_TIME", "kotlin.jvm.PlatformType", "UTC_TIME_ZONE", "Ljava/util/TimeZone;", "TAG", "Ljava/lang/String;", "shouldUseNetworkTimeClock", "Z", "Ljava/time/Clock;", "networkTimeClock$delegate", "Lu70/j;", "getNetworkTimeClock", "()Ljava/time/Clock;", "getNetworkTimeClock$annotations", "()V", "networkTimeClock", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DateTimeUtils {
    private static final long MINIMUM_NETWORK_TIME = 1691768838316L;
    private static final long MSECS_IN_SEC = 1000;
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE);
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");
    private static boolean shouldUseNetworkTimeClock = true;
    private static final u70.j networkTimeClock$delegate = u70.l.b(new m60.a(16));

    public static final Date createDate(int i11, int i12, int i13, int i14, int i15, int i16) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i11, i12, i13, i14, i15, i16);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        time.getClass();
        return time;
    }

    public static /* synthetic */ Date createDate$default(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 8) != 0) {
            i14 = 0;
        }
        if ((i17 & 16) != 0) {
            i15 = 0;
        }
        if ((i17 & 32) != 0) {
            i16 = 0;
        }
        return createDate(i11, i12, i13, i14, i15, i16);
    }

    public static final String formatDate(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        date.getClass();
        brazeDateFormat.getClass();
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        str.getClass();
        return str;
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            timeZone = UTC_TIME_ZONE;
        }
        return formatDate(date, brazeDateFormat, timeZone);
    }

    public static final String formatDateFromMillis(long j9, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        brazeDateFormat.getClass();
        timeZone.getClass();
        return formatDate(new Date(j9), brazeDateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j9, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i11 & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return formatDateFromMillis(j9, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat brazeDateFormat) {
        brazeDateFormat.getClass();
        Date dateCreateDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return formatDate(dateCreateDate, brazeDateFormat, timeZone);
    }

    private static final Clock getNetworkTimeClock() {
        return (Clock) networkTimeClock$delegate.getValue();
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        date.getClass();
        return date.getTime() / 1000;
    }

    public static final boolean isValidTimeZone(String str) {
        str.getClass();
        String[] availableIDs = TimeZone.getAvailableIDs();
        availableIDs.getClass();
        return y.v(availableIDs, str);
    }

    public static final long nowInMilliseconds() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT >= 33 && shouldUseNetworkTimeClock) {
                long jMillis = getNetworkTimeClock().millis();
                if (jMillis >= MINIMUM_NETWORK_TIME) {
                    return jMillis;
                }
            }
            return jCurrentTimeMillis;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) e5, false, (Function0) new m60.a(15), 8, (Object) null);
            shouldUseNetworkTimeClock = false;
            return jCurrentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nowInMilliseconds$lambda$1() {
        return "Error reading date and time from network. Using system time instead.";
    }

    public static final long nowInMillisecondsSystemClock() {
        return System.currentTimeMillis();
    }

    public static final long nowInSeconds() {
        return nowInMilliseconds() / 1000;
    }

    public static final double nowInSecondsPrecise() {
        return nowInMilliseconds() / 1000.0d;
    }

    public static final Date parseDate(String str, BrazeDateFormat brazeDateFormat) throws Exception {
        str.getClass();
        brazeDateFormat.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date date = simpleDateFormat.parse(str);
            date.getClass();
            return date;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(str, 4), 8, (Object) null);
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseDate$lambda$2(String str) {
        return a0.p("Exception parsing date ", str, ". Returning null");
    }

    private static /* synthetic */ void getNetworkTimeClock$annotations() {
    }

    public static final Date createDate(int i11, int i12, int i13, int i14) {
        return createDate$default(i11, i12, i13, i14, 0, 0, 48, null);
    }

    public static final Date createDate(int i11, int i12, int i13, int i14, int i15) {
        return createDate$default(i11, i12, i13, i14, i15, 0, 32, null);
    }

    public static final Date createDate(int i11, int i12, int i13) {
        return createDate$default(i11, i12, i13, 0, 0, 0, 56, null);
    }

    public static final Date createDate(long j9) {
        return new Date(j9 * 1000);
    }

    public static final String formatDate(Date date, BrazeDateFormat brazeDateFormat) {
        date.getClass();
        brazeDateFormat.getClass();
        return formatDate$default(date, brazeDateFormat, null, 2, null);
    }
}
