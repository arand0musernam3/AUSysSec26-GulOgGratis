package com.appsflyer.internal;

import c50.w;
import com.adyen.checkout.components.core.Address;
import com.braze.Constants;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getMonetizationNetwork", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1cSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAFLoggerBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,69:1\n36#2:70\n*S KotlinDebug\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n*L\n61#1:70\n*E\n"})
public abstract class AFg1hSDK {
    public static long getRevenue = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static /* synthetic */ void d$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            w.d();
            return;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.d(aFg1cSDK, str, z11);
    }

    public static /* synthetic */ void e$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if (obj != null) {
            w.d();
            return;
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        if ((i11 & 32) != 0) {
            z13 = true;
        }
        if ((i11 & 64) != 0) {
            z14 = true;
        }
        aFg1hSDK.e(aFg1cSDK, str, th2, z11, z12, z13, z14);
    }

    public static /* synthetic */ void i$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            w.d();
            return;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.i(aFg1cSDK, str, z11);
    }

    public static /* synthetic */ void v$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            w.d();
            return;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.v(aFg1cSDK, str, z11);
    }

    public static /* synthetic */ void w$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            w.d();
            return;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.w(aFg1cSDK, str, z11);
    }

    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13) {
        aFg1cSDK.getClass();
        str.getClass();
        th2.getClass();
        e$default(this, aFg1cSDK, str, th2, z11, z12, z13, false, 64, null);
    }

    public void force(@NotNull AFg1cSDK tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
    }

    @NotNull
    public final String getMonetizationNetwork(@Nullable String str, @NotNull AFg1cSDK aFg1cSDK) {
        aFg1cSDK.getClass();
        if (str == null || StringsKt.H(str)) {
            str = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - getRevenue;
        String name = Thread.currentThread().getName();
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(jCurrentTimeMillis);
        sb2.append(") [");
        sb2.append(name);
        return r8.k.p(sb2, "] ", strWithTag$SDK_prodRelease);
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1cSDK aFg1cSDK) {
        str.getClass();
        aFg1cSDK.getClass();
        return s.k("[", aFg1cSDK.getCurrencyIso4217Code, "] ", str);
    }

    public void d(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public void i(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public void v(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public void w(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2) {
        aFg1cSDK.getClass();
        str.getClass();
        th2.getClass();
        e$default(this, aFg1cSDK, str, th2, false, false, false, false, 120, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z11) {
        aFg1cSDK.getClass();
        str.getClass();
        th2.getClass();
        e$default(this, aFg1cSDK, str, th2, z11, false, false, false, 112, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12) {
        aFg1cSDK.getClass();
        str.getClass();
        th2.getClass();
        e$default(this, aFg1cSDK, str, th2, z11, z12, false, false, 96, null);
    }

    public void e(@NotNull AFg1cSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
    }
}
