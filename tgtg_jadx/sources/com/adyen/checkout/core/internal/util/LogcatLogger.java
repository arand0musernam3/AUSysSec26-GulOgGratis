package com.adyen.checkout.core.internal.util;

import android.annotation.SuppressLint;
import android.util.Log;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/core/internal/util/LogcatLogger;", "Lcom/adyen/checkout/core/AdyenLogger;", "()V", "minLogLevel", "Lcom/adyen/checkout/core/AdyenLogLevel;", "concatThrowable", "", InAppMessageBase.MESSAGE, "throwable", "", "log", "", "level", "tag", "logToLogcat", "priority", "", "setLogLevel", "shouldLog", "", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LogcatLogger implements AdyenLogger {
    private static final int MAX_LOG_LENGTH = 2048;
    private static final int MAX_TAG_LENGTH = 23;

    @NotNull
    private AdyenLogLevel minLogLevel = AdyenLogLevel.NONE;

    private final String concatThrowable(String message, Throwable throwable) {
        return throwable != null ? k.m(message, ": ", Log.getStackTraceString(throwable)) : message;
    }

    @SuppressLint({"NotAdyenLog"})
    private final void logToLogcat(int priority, String tag, String message) {
        if (priority != AdyenLogLevel.NONE.getPriority()) {
            if (priority == 7) {
                Log.wtf(tag, message);
            } else {
                Log.println(priority, tag, message);
            }
        }
    }

    @Override // com.adyen.checkout.core.AdyenLogger
    public void log(@NotNull AdyenLogLevel level, @NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        level.getClass();
        tag.getClass();
        message.getClass();
        tag.getClass();
        String strConcatThrowable = concatThrowable(message, throwable);
        if (strConcatThrowable.length() < 2048) {
            logToLogcat(level.getPriority(), tag, strConcatThrowable);
            return;
        }
        int length = strConcatThrowable.length() / 2048;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            String strSubstring = i11 != length ? strConcatThrowable.substring(i11 * 2048, (i11 + 1) * 2048) : strConcatThrowable.substring(i11 * 2048);
            logToLogcat(level.getPriority(), tag + "-" + i11, strSubstring);
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // com.adyen.checkout.core.AdyenLogger
    public void setLogLevel(@NotNull AdyenLogLevel level) {
        level.getClass();
        this.minLogLevel = level;
    }

    @Override // com.adyen.checkout.core.AdyenLogger
    public boolean shouldLog(@NotNull AdyenLogLevel level) {
        level.getClass();
        return level.getPriority() >= this.minLogLevel.getPriority();
    }
}
