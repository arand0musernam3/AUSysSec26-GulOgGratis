package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f9960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9964f;

    public d1(boolean z11, Long l, String str, long j9, long j11, long j12) {
        this.f9959a = z11;
        this.f9960b = l;
        this.f9961c = str;
        this.f9962d = j9;
        this.f9963e = j11;
        this.f9964f = j12;
    }

    public final String a() {
        return this.f9961c;
    }

    public final Long b() {
        return this.f9960b;
    }

    public final long c() {
        return this.f9962d;
    }

    public final long d() {
        return this.f9963e;
    }

    public final long e() {
        return this.f9964f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f9959a == d1Var.f9959a && Intrinsics.areEqual(this.f9960b, d1Var.f9960b) && Intrinsics.areEqual(this.f9961c, d1Var.f9961c) && this.f9962d == d1Var.f9962d && this.f9963e == d1Var.f9963e && this.f9964f == d1Var.f9964f;
    }

    public final boolean f() {
        return this.f9959a;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f9959a) * 31;
        Long l = this.f9960b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f9961c;
        return Long.hashCode(this.f9964f) + e0.f.b(e0.f.b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f9962d), 31, this.f9963e);
    }

    public final String toString() {
        boolean z11 = this.f9959a;
        Long l = this.f9960b;
        String str = this.f9961c;
        long j9 = this.f9962d;
        long j11 = this.f9963e;
        long j12 = this.f9964f;
        StringBuilder sb2 = new StringBuilder("Config(isEnabled=");
        sb2.append(z11);
        sb2.append(", sdkDebuggerExpirationTime=");
        sb2.append(l);
        sb2.append(", sdkDebuggerAuthCode=");
        sb2.append(str);
        sb2.append(", sdkDebuggerFlushIntervalBytes=");
        sb2.append(j9);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", sdkDebuggerFlushIntervalSeconds=", j11, ", sdkDebuggerMaxPayloadBytes=");
        return w.a0.j(j12, ")", sb2);
    }

    public /* synthetic */ d1() {
        this(false, null, null, 0L, 0L, 0L);
    }
}
