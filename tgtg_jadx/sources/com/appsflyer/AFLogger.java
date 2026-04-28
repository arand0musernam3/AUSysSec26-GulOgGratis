package com.appsflyer;

import al.u;
import com.adyen.checkout.components.core.Address;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1hSDK;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;
import u70.j;
import u70.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0019J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0019J#\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u001dJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ+\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010 J+\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010 J3\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010!J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010$\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b&\u0010%J'\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+JG\u0010.\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010+J'\u00101\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010+J'\u00102\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010+J\u001f\u00103\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104R\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\u0001058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u0015\u00106\u001a\u0002098BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b:\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1hSDK;", "<init>", "()V", "", "logMessage", "", "shouldRemoteDebug", "", "afInfoLog", "(Ljava/lang/String;Z)V", "debugLogMessage", "afDebugLog", InAppMessageBase.MESSAGE, "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "warningLogMessage", "afWarnLog", "rdLogMessage", "afVerboseLog", "(Ljava/lang/String;)V", "afRDLog", "afLogForce", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "afErrorLogForExcManagerOnly", "disableReporting", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFg1hSDK;)V", "unregisterClient", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "msg", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "", "getMediationNetwork", "Lu70/j;", "getCurrencyIso4217Code", "Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAFLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n36#2:279\n36#2:280\n36#2:281\n36#2:282\n36#2:283\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n*L\n177#1:279\n189#1:280\n208#1:281\n224#1:282\n243#1:283\n35#1:284,2\n*E\n"})
public final class AFLogger extends AFg1hSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private static final j getCurrencyIso4217Code = l.b(new Function0<Set<AFg1hSDK>>() { // from class: com.appsflyer.AFLogger.8
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1hSDK> invoke() {
            return new LinkedHashSet();
        }
    });

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private static final j getMediationNetwork = l.b(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.3
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1oSDK.AFAdRevenueData();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i11) {
            this.level = i11;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @d
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        debugLogMessage.getClass();
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, true);
    }

    @d
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.H(errorLogMessage)) {
            errorLogMessage = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, ex2, false, false, false, false, 120, null);
    }

    @d
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex2, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.H(errorLogMessage)) {
            errorLogMessage = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, ex2, false, false, !disableReporting, false, 64, null);
    }

    @d
    public static final void afInfoLog(@NotNull String logMessage) {
        logMessage.getClass();
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, true);
    }

    @d
    public static final void afLogForce(@NotNull String logMessage) {
        logMessage.getClass();
        INSTANCE.force(AFg1cSDK.OTHER, logMessage);
    }

    @d
    public static final void afRDLog(@NotNull String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, true);
    }

    @d
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, false);
    }

    @d
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        warningLogMessage.getClass();
        AFg1hSDK.w$default(INSTANCE, AFg1cSDK.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Function1 function1) {
        function1.getClass();
        Iterator it = ((Set) getCurrencyIso4217Code.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFg1hSDK) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFg1hSDK[] aFg1hSDKArr) {
        aFg1hSDKArr.getClass();
        i0.t((Set) getCurrencyIso4217Code.getValue(), aFg1hSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new u(new Function1<AFg1hSDK, Unit>() { // from class: com.appsflyer.AFLogger.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMonetizationNetwork(@NotNull AFg1hSDK aFg1hSDK) {
                aFg1hSDK.getClass();
                aFg1hSDK.d(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getMonetizationNetwork((AFg1hSDK) obj);
                return Unit.f26487a;
            }
        }, 22));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull final AFg1cSDK tag, @NotNull final String msg, @NotNull final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new u(new Function1<AFg1hSDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFAdRevenueData(@NotNull AFg1hSDK aFg1hSDK) {
                aFg1hSDK.getClass();
                aFg1hSDK.e(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                AFAdRevenueData((AFg1hSDK) obj);
                return Unit.f26487a;
            }
        }, 22));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull final AFg1cSDK tag, @NotNull final String msg) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new u(new Function1<AFg1hSDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFAdRevenueData(@NotNull AFg1hSDK aFg1hSDK) {
                aFg1hSDK.getClass();
                aFg1hSDK.force(tag, msg);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                AFAdRevenueData((AFg1hSDK) obj);
                return Unit.f26487a;
            }
        }, 22));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new u(new Function1<AFg1hSDK, Unit>() { // from class: com.appsflyer.AFLogger.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMediationNetwork(@NotNull AFg1hSDK aFg1hSDK) {
                aFg1hSDK.getClass();
                aFg1hSDK.i(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getMediationNetwork((AFg1hSDK) obj);
                return Unit.f26487a;
            }
        }, 22));
    }

    public final void registerClient(@NotNull AFg1hSDK... client) {
        client.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(client, 1));
    }

    public final void unregisterClient(@NotNull AFg1hSDK... client) {
        client.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(client, 0));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new u(new Function1<AFg1hSDK, Unit>() { // from class: com.appsflyer.AFLogger.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMonetizationNetwork(@NotNull AFg1hSDK aFg1hSDK) {
                aFg1hSDK.getClass();
                aFg1hSDK.v(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getMonetizationNetwork((AFg1hSDK) obj);
                return Unit.f26487a;
            }
        }, 22));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMediationNetwork.getValue()).execute(new u(new Function1<AFg1hSDK, Unit>() { // from class: com.appsflyer.AFLogger.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getCurrencyIso4217Code(@NotNull AFg1hSDK aFg1hSDK) {
                aFg1hSDK.getClass();
                aFg1hSDK.w(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getCurrencyIso4217Code((AFg1hSDK) obj);
                return Unit.f26487a;
            }
        }, 22));
    }

    @d
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        debugLogMessage.getClass();
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @d
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        logMessage.getClass();
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @d
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        warningLogMessage.getClass();
        INSTANCE.w(AFg1cSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1hSDK[] aFg1hSDKArr) {
        aFg1hSDKArr.getClass();
        ((Set) getCurrencyIso4217Code.getValue()).removeAll(y.W(aFg1hSDKArr));
    }

    @d
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex2, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        message.getClass();
        ex2.getClass();
        AFg1hSDK.e$default(INSTANCE, AFg1cSDK.OTHER, message, ex2, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @d
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.H(errorLogMessage)) {
            errorLogMessage = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, ex2, false, false, true, false, 64, null);
    }

    @d
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex2, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.H(errorLogMessage)) {
            errorLogMessage = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, ex2, false, printThrowable, false, false, 104, null);
    }

    @d
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex2, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.H(errorLogMessage)) {
            errorLogMessage = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, ex2, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
