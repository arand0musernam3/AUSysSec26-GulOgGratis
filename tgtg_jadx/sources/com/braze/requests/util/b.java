package com.braze.requests.util;

import android.os.SystemClock;
import com.braze.g2;
import com.braze.support.BrazeLogger;
import j4.s;
import kotlin.jvm.functions.Function0;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10472g = (int) 45000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l80.e f10477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10478f;

    public b(int i11, int i12, int i13, int i14) {
        this.f10473a = i11;
        this.f10474b = i12;
        this.f10475c = i13;
        this.f10476d = i14;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i15 = (int) jUptimeMillis;
        int i16 = (int) (jUptimeMillis >> 32);
        int i17 = ~i15;
        int i18 = (i15 << 10) ^ (i16 >>> 4);
        l80.g gVar = new l80.g();
        gVar.f27506c = i15;
        gVar.f27507d = i16;
        gVar.f27508e = 0;
        gVar.f27509f = 0;
        gVar.f27510g = i17;
        gVar.f27511h = i18;
        gVar.g();
        for (int i19 = 0; i19 < 64; i19++) {
            gVar.b();
        }
        this.f10477e = gVar;
    }

    public final int a(int i11) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jt.g(this, 14), 7, (Object) null);
        l80.e eVar = this.f10477e;
        int i12 = this.f10478f * this.f10476d;
        eVar.getClass();
        int iMin = Math.min(i11, i12) + eVar.c(Math.abs(i11 - i12) + 1);
        this.f10478f = Math.max(this.f10475c, Math.min(this.f10473a, iMin));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g2(this, i11, iMin, 2), 7, (Object) null);
        return this.f10478f;
    }

    public final String toString() {
        int i11 = this.f10473a;
        int i12 = this.f10474b;
        int i13 = this.f10475c;
        int i14 = this.f10476d;
        l80.e eVar = this.f10477e;
        int i15 = this.f10478f;
        boolean z11 = i15 != 0;
        StringBuilder sbR = k.r(i11, i12, "ExponentialBackoffStateProvider(maxSleepDurationMs=", ", defaultNormalFlushIntervalMs=", ", minSleepDurationMs=");
        e0.f.C(sbR, i13, ", scaleFactor=", i14, ", randomSleepDurationGenerator=");
        sbR.append(eVar);
        sbR.append(", lastSleepDurationMs=");
        sbR.append(i15);
        sbR.append(", isBackingOff=");
        return s.o(sbR, z11, ")");
    }

    public static final String a(b bVar) {
        return s.f(bVar.f10478f, "Computing new sleep delay. Previous sleep delay: ");
    }

    public static final String a(b bVar, int i11, int i12) {
        int i13 = bVar.f10478f;
        int i14 = bVar.f10473a;
        int i15 = bVar.f10475c;
        int i16 = bVar.f10476d;
        StringBuilder sbR = k.r(i13, i11, "New sleep duration: ", " ms. Default sleep duration: ", " ms. Max sleep: ");
        e0.f.C(sbR, i14, " ms. Min sleep: ", i15, " ms. Scale factor: ");
        sbR.append(i16);
        sbR.append(" randomValueBetweenSleepIntervals: ");
        sbR.append(i12);
        return sbR.toString();
    }
}
