package zendesk.logger;

import android.util.Log;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class Logger {
    private static final String ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static LogReceiver platformLogger;
    private static final TimeZone UTC_TIMEZONE = TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE);
    private static final List<LogReceiver> USER_DEFINED_RECEIVERS = new ArrayList();
    private static boolean loggable = false;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class Android implements LogReceiver {
        private static final int MAX_LINE_LENGTH = 4000;

        @Override // zendesk.logger.Logger.LogReceiver
        public void log(Priority priority, String str, String str2, Throwable th2) {
            String androidTag = LoggerHelper.getAndroidTag(str);
            StringBuilder sb2 = new StringBuilder(str2.length());
            if (Priority.ERROR == priority) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Logger.ISO_8601_FORMAT, Locale.US);
                simpleDateFormat.setTimeZone(Logger.UTC_TIMEZONE);
                sb2.append("[UTC ");
                sb2.append(simpleDateFormat.format(new Date()));
                sb2.append("] ");
            }
            sb2.append(str2);
            if (th2 != null) {
                sb2.append(StringUtils.LINE_SEPARATOR);
                sb2.append(Log.getStackTraceString(th2));
            }
            Iterator<String> it = LoggerHelper.splitLogMessage(sb2.toString(), MAX_LINE_LENGTH).iterator();
            while (it.hasNext()) {
                Log.println(priority == null ? Priority.INFO.priority : priority.priority, androidTag, it.next());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class Java implements LogReceiver {
        @Override // zendesk.logger.Logger.LogReceiver
        public void log(Priority priority, String str, String str2, Throwable th2) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("[");
            sb2.append(new SimpleDateFormat(Logger.ISO_8601_FORMAT, Locale.US).format(new Date()));
            sb2.append("] ");
            sb2.append(priority == null ? LoggerHelper.getLevelFromPriority(Priority.INFO.priority) : LoggerHelper.getLevelFromPriority(priority.priority));
            sb2.append(ExpiryDateInput.SEPARATOR);
            if (!StringUtils.hasLength(str)) {
                str = "UNKNOWN";
            }
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            System.out.println(sb2.toString());
            if (th2 != null) {
                th2.printStackTrace(System.out);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface LogReceiver {
        void log(Priority priority, String str, String str2, Throwable th2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public enum Priority {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Priority(int i11) {
            this.priority = i11;
        }
    }

    static {
        platformLogger = new Java();
        try {
            Class.forName("android.os.Build");
            platformLogger = new Android();
        } catch (ClassNotFoundException unused) {
        }
    }

    private Logger() {
    }

    public static void addLogReceiver(LogReceiver logReceiver) {
        if (logReceiver != null) {
            USER_DEFINED_RECEIVERS.add(logReceiver);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        logInternal(Priority.DEBUG, str, str2, null, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        logInternal(Priority.ERROR, str, str2, null, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        logInternal(Priority.INFO, str, str2, null, objArr);
    }

    public static boolean isLoggable() {
        return loggable;
    }

    private static void logInternal(Priority priority, String str, String str2, Throwable th2, Object... objArr) {
        if (loggable) {
            if (str2 == null) {
                str2 = "";
            }
            if (objArr != null && objArr.length > 0) {
                str2 = String.format(Locale.US, str2, objArr);
            }
            platformLogger.log(priority, str, str2, th2);
            Iterator<LogReceiver> it = USER_DEFINED_RECEIVERS.iterator();
            while (it.hasNext()) {
                it.next().log(priority, str, str2, th2);
            }
        }
    }

    public static void removeAllLogReceiver() {
        USER_DEFINED_RECEIVERS.clear();
    }

    public static void setLoggable(boolean z11) {
        loggable = z11;
    }

    public static void v(String str, String str2, Object... objArr) {
        logInternal(Priority.VERBOSE, str, str2, null, objArr);
    }

    public static void w(String str, String str2, Object... objArr) {
        logInternal(Priority.WARN, str, str2, null, objArr);
    }

    public static void d(String str, String str2, Throwable th2, Object... objArr) {
        logInternal(Priority.DEBUG, str, str2, th2, objArr);
    }

    public static void e(String str, String str2, Throwable th2, Object... objArr) {
        logInternal(Priority.ERROR, str, str2, th2, objArr);
    }

    public static void i(String str, String str2, Throwable th2, Object... objArr) {
        logInternal(Priority.INFO, str, str2, th2, objArr);
    }

    public static void v(String str, String str2, Throwable th2, Object... objArr) {
        logInternal(Priority.VERBOSE, str, str2, th2, objArr);
    }

    public static void w(String str, String str2, Throwable th2, Object... objArr) {
        logInternal(Priority.WARN, str, str2, th2, objArr);
    }
}
