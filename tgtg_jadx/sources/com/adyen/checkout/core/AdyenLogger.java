package com.adyen.checkout.core;

import com.adyen.checkout.core.internal.util.LogcatLogger;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/core/AdyenLogger;", "", "log", "", "level", "Lcom/adyen/checkout/core/AdyenLogLevel;", "tag", "", InAppMessageBase.MESSAGE, "throwable", "", "setLogLevel", "shouldLog", "", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AdyenLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void log(@NotNull AdyenLogLevel level, @NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    void setLogLevel(@NotNull AdyenLogLevel level);

    boolean shouldLog(@NotNull AdyenLogLevel level);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0000@BX\u0081\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/core/AdyenLogger$Companion;", "", "()V", "didSetLogLevelManually", "", "<set-?>", "Lcom/adyen/checkout/core/AdyenLogger;", "logger", "getLogger$annotations", "getLogger", "()Lcom/adyen/checkout/core/AdyenLogger;", "resetLogger", "", "setInitialLogLevel", "level", "Lcom/adyen/checkout/core/AdyenLogLevel;", "setLogLevel", "logLevel", "", "setLogger", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private static boolean didSetLogLevelManually;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static volatile AdyenLogger logger = new LogcatLogger();

        private Companion() {
        }

        @NotNull
        public final AdyenLogger getLogger() {
            return logger;
        }

        public final void resetLogger() {
            logger = new LogcatLogger();
            didSetLogLevelManually = false;
        }

        public final void setInitialLogLevel(@NotNull AdyenLogLevel level) {
            level.getClass();
            if (didSetLogLevelManually) {
                return;
            }
            logger.setLogLevel(level);
        }

        @d
        public final void setLogLevel(int logLevel) {
            setLogLevel(logLevel != 2 ? logLevel != 3 ? logLevel != 4 ? logLevel != 5 ? logLevel != 6 ? AdyenLogLevel.NONE : AdyenLogLevel.ERROR : AdyenLogLevel.WARN : AdyenLogLevel.INFO : AdyenLogLevel.DEBUG : AdyenLogLevel.VERBOSE);
        }

        public final void setLogger(@NotNull AdyenLogger logger2) {
            logger2.getClass();
            logger = logger2;
        }

        public static /* synthetic */ void getLogger$annotations() {
        }

        public final void setLogLevel(@NotNull AdyenLogLevel level) {
            level.getClass();
            didSetLogLevelManually = true;
            logger.setLogLevel(level);
        }
    }
}
