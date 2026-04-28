package com.braze.support;

import android.util.Log;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001LB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0010\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b!\u0010 J+\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\"\u0010 J+\u0010#\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b#\u0010 J'\u0010$\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b$\u0010 J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0007¢\u0006\u0004\b\u0005\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0007¢\u0006\u0004\b(\u0010\u0003J\u001b\u0010)\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010\u0003R\u001a\u0010.\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\f\n\u0004\b.\u0010,\u0012\u0004\b/\u0010\u0003R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101RD\u00104\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000f\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010\u0003\u001a\u0004\b6\u00107\"\u0004\b8\u00109RD\u0010<\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010,R\u0014\u0010C\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010,R0\u0010G\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001a8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010,\u0012\u0004\bK\u0010\u0003\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u001d¨\u0006M"}, d2 = {"Lcom/braze/support/BrazeLogger;", "", "<init>", "()V", "", "getBrazeLogTag", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/braze/support/BrazeLogger$Priority;", "priority", "", "tr", "", "skipSdkDebug", "Lkotlin/Function0;", InAppMessageBase.MESSAGE, "", "brazelog", "(Ljava/lang/Object;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "tag", "(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "brazeLogTag", "(Ljava/lang/Object;)Ljava/lang/String;", "enableVerboseLogging", "returnOnDebug", "checkForSystemLogLevelProperty", "(Z)V", "", "initialLogLevel", "setInitialLogLevelFromConfiguration", "(I)V", "msg", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "i", "w", "e", "Ljava/lang/Class;", "classForTag", "(Ljava/lang/Class;)Ljava/lang/String;", "resetForTesting", "toStringSafe", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "SUPPRESS", "I", "getSUPPRESS$annotations", "VERBOSE", "getVERBOSE$annotations", "isSystemPropLogLevelSet", "Z", "hasLogLevelBeenSetForAppRun", "Lkotlin/Function3;", "onLoggedCallback", "Li80/n;", "getOnLoggedCallback", "()Li80/n;", "setOnLoggedCallback", "(Li80/n;)V", "getOnLoggedCallback$annotations", "Lkotlin/Function4;", "sdkDebuggerCallback", "Li80/o;", "getSdkDebuggerCallback$android_sdk_base_release", "()Li80/o;", "setSdkDebuggerCallback$android_sdk_base_release", "(Li80/o;)V", "DESIRED_MAX_BRAZE_TAG_LENGTH", "LOG_LEVEL_PROPERTY_NAME_BRAZE", "Ljava/lang/String;", "LOG_LEVEL_PROPERTY_NAME_APPBOY", "MAX_REMAINING_LENGTH_FOR_CLASS_TAG", "logLevel", "getLogLevel", "()I", "setLogLevel", "getLogLevel$annotations", "Priority", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeLogger {
    private static final int DESIRED_MAX_BRAZE_TAG_LENGTH = 80;
    private static final String LOG_LEVEL_PROPERTY_NAME_APPBOY = "log.tag.APPBOY";
    private static final String LOG_LEVEL_PROPERTY_NAME_BRAZE = "log.tag.BRAZE";
    private static final int MAX_REMAINING_LENGTH_FOR_CLASS_TAG = 65;
    public static final int SUPPRESS = Integer.MAX_VALUE;
    public static final int VERBOSE = 2;
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static i80.n onLoggedCallback;
    private static i80.o sdkDebuggerCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/braze/support/BrazeLogger$Priority;", "", "logLevel", "", "<init>", "(Ljava/lang/String;II)V", "getLogLevel", "()I", "D", "I", "E", "V", "W", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Priority {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        private final int logLevel;
        public static final Priority D = new Priority("D", 0, 3);
        public static final Priority I = new Priority("I", 1, 4);
        public static final Priority E = new Priority("E", 2, 6);
        public static final Priority V = new Priority("V", 3, 2);
        public static final Priority W = new Priority("W", 4, 5);

        private static final /* synthetic */ Priority[] $values() {
            return new Priority[]{D, I, E, V, W};
        }

        static {
            Priority[] priorityArr$values = $values();
            $VALUES = priorityArr$values;
            $ENTRIES = v0.n.w(priorityArr$values);
        }

        private Priority(String str, int i11, int i12) {
            this.logLevel = i12;
        }

        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    private BrazeLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_logLevel_$lambda$0(int i11) {
        return j4.s.f(i11, "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: ");
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th2, boolean z11, Function0 function0, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            priority = Priority.D;
        }
        Priority priority2 = priority;
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        Throwable th3 = th2;
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        brazeLogger.brazelog(obj, priority2, th3, z11, (Function0<String>) function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String brazelog$lambda$7(Function0 function0) {
        return INSTANCE.toStringSafe(function0);
    }

    public static final void checkForSystemLogLevelProperty(boolean returnOnDebug) {
        String strA = x.a(LOG_LEVEL_PROPERTY_NAME_BRAZE);
        if ("verbose".equalsIgnoreCase(StringsKt.e0(x.a(LOG_LEVEL_PROPERTY_NAME_APPBOY)).toString()) || "verbose".equalsIgnoreCase(StringsKt.e0(strA).toString())) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.I, (Throwable) null, false, (Function0) new m60.a(14), 6, (Object) null);
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        checkForSystemLogLevelProperty(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkForSystemLogLevelProperty$lambda$1() {
        return "BrazeLogger log level set to VERBOSE via device system property for BRAZE/APPBOY. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
    }

    public static final void d(String tag, String msg, Throwable tr2) {
        tag.getClass();
        msg.getClass();
        brazelog$default(INSTANCE, tag, Priority.D, tr2, false, (Function0) new lw.m(msg, 29), 8, (Object) null);
    }

    public static /* synthetic */ void d$default(String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        d(str, str2, th2);
    }

    public static final void e(String tag, String msg, Throwable tr2) {
        tag.getClass();
        msg.getClass();
        tr2.getClass();
        brazelog$default(INSTANCE, tag, Priority.D, tr2, false, (Function0) new mw.d(msg, 0), 8, (Object) null);
    }

    public static final void enableVerboseLogging() {
        setLogLevel(2);
    }

    public static final String getBrazeLogTag(Class<?> classForTag) {
        classForTag.getClass();
        String name = classForTag.getName();
        int length = name.length();
        if (length > MAX_REMAINING_LENGTH_FOR_CLASS_TAG) {
            name = name.substring(length - MAX_REMAINING_LENGTH_FOR_CLASS_TAG);
        }
        return Constants.LOG_TAG_PREFIX.concat(name);
    }

    public static final int getLogLevel() {
        return logLevel;
    }

    public static final i80.n getOnLoggedCallback() {
        return onLoggedCallback;
    }

    public static final void i(String tag, String msg, Throwable tr2) {
        tag.getClass();
        msg.getClass();
        brazelog$default(INSTANCE, tag, Priority.I, tr2, false, (Function0) new mw.d(msg, 2), 8, (Object) null);
    }

    public static /* synthetic */ void i$default(String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        i(str, str2, th2);
    }

    public static final void resetForTesting() {
        isSystemPropLogLevelSet = false;
        hasLogLevelBeenSetForAppRun = false;
        onLoggedCallback = null;
        sdkDebuggerCallback = null;
    }

    public static final void setInitialLogLevelFromConfiguration(int initialLogLevel) {
        if (hasLogLevelBeenSetForAppRun) {
            return;
        }
        setLogLevel(initialLogLevel);
    }

    public static final void setLogLevel(int i11) {
        if (isSystemPropLogLevelSet) {
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.W, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(i11, 13), 6, (Object) null);
        } else {
            hasLogLevelBeenSetForAppRun = true;
            logLevel = i11;
        }
    }

    public static final void setOnLoggedCallback(i80.n nVar) {
        onLoggedCallback = nVar;
    }

    private final String toStringSafe(Function0<? extends Object> function0) {
        try {
            return String.valueOf(function0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    public static final void v(String tag, String msg, Throwable tr2) {
        tag.getClass();
        msg.getClass();
        brazelog$default(INSTANCE, tag, Priority.V, tr2, false, (Function0) new mw.d(msg, 3), 8, (Object) null);
    }

    public static /* synthetic */ void v$default(String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        v(str, str2, th2);
    }

    public static final void w(String tag, String msg, Throwable tr2) {
        tag.getClass();
        msg.getClass();
        brazelog$default(INSTANCE, tag, Priority.W, tr2, false, (Function0) new mw.d(msg, 1), 8, (Object) null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        w(str, str2, th2);
    }

    public final String brazeLogTag(Object obj) {
        obj.getClass();
        String name = obj.getClass().getName();
        String strY = StringsKt.Y(name, '$');
        String strW = StringsKt.W('.', strY, strY);
        return strW.length() == 0 ? getBrazeLogTag(name) : getBrazeLogTag(strW);
    }

    public final void brazelog(String tag, Priority priority, Throwable tr2, boolean skipSdkDebug, Function0<String> message) {
        i80.o oVar;
        tag.getClass();
        priority.getClass();
        message.getClass();
        u70.t tVarB = u70.l.b(new ki.a(29, message));
        i80.n nVar = onLoggedCallback;
        if (nVar != null) {
            nVar.invoke(priority, tVarB.getValue(), tr2);
        }
        if (!skipSdkDebug && (oVar = sdkDebuggerCallback) != null) {
            oVar.invoke(tag, priority, tVarB.getValue(), tr2);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i11 = b.f10752a[priority.ordinal()];
            if (i11 == 1) {
                if (tr2 == null) {
                    Log.d(tag, (String) tVarB.getValue());
                    return;
                } else {
                    Log.d(tag, (String) tVarB.getValue(), tr2);
                    return;
                }
            }
            if (i11 == 2) {
                if (tr2 == null) {
                    Log.i(tag, (String) tVarB.getValue());
                    return;
                } else {
                    Log.i(tag, (String) tVarB.getValue(), tr2);
                    return;
                }
            }
            if (i11 == 3) {
                if (tr2 == null) {
                    Log.w(tag, (String) tVarB.getValue());
                    return;
                } else {
                    Log.e(tag, (String) tVarB.getValue(), tr2);
                    return;
                }
            }
            if (i11 == 4) {
                if (tr2 == null) {
                    Log.w(tag, (String) tVarB.getValue());
                    return;
                } else {
                    Log.w(tag, (String) tVarB.getValue(), tr2);
                    return;
                }
            }
            if (i11 != 5) {
                e40.a.f();
            } else if (tr2 == null) {
                Log.v(tag, (String) tVarB.getValue());
            } else {
                Log.v(tag, (String) tVarB.getValue(), tr2);
            }
        }
    }

    public final i80.o getSdkDebuggerCallback$android_sdk_base_release() {
        return sdkDebuggerCallback;
    }

    public final void setSdkDebuggerCallback$android_sdk_base_release(i80.o oVar) {
        sdkDebuggerCallback = oVar;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static /* synthetic */ void getOnLoggedCallback$annotations() {
    }

    public static /* synthetic */ void getSUPPRESS$annotations() {
    }

    public static /* synthetic */ void getVERBOSE$annotations() {
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th2, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            priority = Priority.D;
        }
        Priority priority2 = priority;
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        Throwable th3 = th2;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        brazeLogger.brazelog(str, priority2, th3, z11, (Function0<String>) function0);
    }

    public static final void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        i$default(str, str2, null, 4, null);
    }

    public static final void v(String str, String str2) {
        str.getClass();
        str2.getClass();
        v$default(str, str2, null, 4, null);
    }

    public static final void w(String str, String str2) {
        str.getClass();
        str2.getClass();
        w$default(str, str2, null, 4, null);
    }

    public static final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        d$default(str, str2, null, 4, null);
    }

    public final String getBrazeLogTag(String str) {
        str.getClass();
        return Constants.LOG_TAG_PREFIX + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d$lambda$3(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e$lambda$6(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i$lambda$4(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v$lambda$2(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w$lambda$5(String str) {
        return str;
    }

    public final void brazelog(Object obj, Priority priority, Throwable th2, boolean z11, Function0<String> function0) {
        obj.getClass();
        priority.getClass();
        function0.getClass();
        if (logLevel <= priority.getLogLevel() || sdkDebuggerCallback != null) {
            brazelog(brazeLogTag(obj), priority, th2, z11, function0);
        }
    }
}
