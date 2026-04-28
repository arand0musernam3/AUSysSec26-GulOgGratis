package com.braze.requests.util;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f10486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f10488e;

    public g(int i11, int i12, e eVar) {
        float fFloatValue;
        eVar.getClass();
        this.f10484a = i11;
        this.f10485b = i12;
        this.f10486c = eVar;
        Long l = eVar.readLong(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, 0L);
        this.f10487d = l != null ? l.longValue() : 0L;
        Float f11 = eVar.readFloat(DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT, Float.valueOf(this.f10484a < 1 ? 1 : r5));
        if (f11 != null) {
            fFloatValue = f11.floatValue();
        }
        this.f10488e = fFloatValue;
    }

    public static final String b(int i11, int i12) {
        return k.k("TokenBucketRateLimiter updated with new capacity: ", i11, i12, " and refill rate: ");
    }

    public final long a() {
        double dA = a(DateTimeUtils.nowInMillisecondsSystemClock());
        this.f10488e = dA;
        this.f10486c.writeData(DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT, Float.valueOf((float) dA));
        double d3 = this.f10488e;
        if (d3 >= 1.0d) {
            return 0L;
        }
        double d11 = ((double) 1) - d3;
        int i11 = this.f10485b;
        return Math.max(0L, (long) (d11 * ((double) (i11 >= 1 ? i11 : 1)) * ((double) 1000)));
    }

    public final String toString() {
        int i11 = this.f10484a;
        if (i11 < 1) {
            i11 = 1;
        }
        double d3 = i11;
        int i12 = this.f10485b;
        int i13 = i12 >= 1 ? i12 : 1;
        String dateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(this.f10487d, null, null, 3, null);
        long j9 = this.f10487d;
        double dA = a(DateTimeUtils.nowInMillisecondsSystemClock());
        StringBuilder sb2 = new StringBuilder("(capacity=");
        sb2.append(d3);
        sb2.append(", refillRate=");
        sb2.append(i13);
        sb2.append(", lastCallAt='");
        sb2.append(dateFromMillis$default);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "', lastCallAt raw value='", j9, "', currentTokenCount=");
        sb2.append(dA);
        sb2.append(")");
        return sb2.toString();
    }

    public final double a(long j9) {
        double d3 = this.f10488e;
        double d11 = j9 - this.f10487d;
        int i11 = this.f10485b;
        if (i11 < 1) {
            i11 = 1;
        }
        return Math.min(((d11 / ((double) i11)) / ((double) 1000)) + d3, this.f10484a >= 1 ? r0 : 1);
    }

    public final void a(int i11, int i12) {
        if (i11 < 1 || i12 < 1) {
            return;
        }
        if (this.f10484a == i11 && this.f10485b == i12) {
            return;
        }
        this.f10484a = i11;
        this.f10485b = i12;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.b(i11, i12, 3), 6, (Object) null);
    }
}
