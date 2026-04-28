package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.f2;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f10086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f10087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f10088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10089d;

    public s(Context context, com.braze.events.d dVar, i3 i3Var) {
        context.getClass();
        dVar.getClass();
        i3Var.getClass();
        this.f10086a = dVar;
        this.f10087b = i3Var;
        this.f10088c = new f2(context);
    }

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        long jR = this.f10087b.r();
        if (jR == -1 || this.f10089d) {
            return false;
        }
        Long l = this.f10088c.readLong(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, -1L);
        long jLongValue = l != null ? l.longValue() : -1L;
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.f(1, jR, jNowInSeconds, jLongValue), 7, (Object) null);
        return jR + jLongValue < jNowInSeconds;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(4), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(3), 7, (Object) null);
        this.f10086a.b(com.braze.events.internal.n.f9816a, com.braze.events.internal.n.class);
        this.f10089d = true;
    }

    public final void e() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(jNowInSeconds, 13), 7, (Object) null);
        this.f10088c.writeData(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, Long.valueOf(jNowInSeconds));
        this.f10089d = false;
    }

    public static final String a(long j9, long j11, long j12) {
        StringBuilder sbG = l1.g("Messaging session timeout: ", j9, ", current diff: ");
        sbG.append(j11 - j12);
        return sbG.toString();
    }

    public static final String a(long j9) {
        return e0.f.i(j9, "Messaging session stopped. Adding new messaging session timestamp: ");
    }
}
