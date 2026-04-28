package ib;

import android.net.NetworkRequest;
import java.util.Set;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f23710j = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f23711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rb.f f23712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f23717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f23719i;

    public e(e eVar) {
        eVar.getClass();
        this.f23713c = eVar.f23713c;
        this.f23714d = eVar.f23714d;
        this.f23712b = eVar.f23712b;
        this.f23711a = eVar.f23711a;
        this.f23715e = eVar.f23715e;
        this.f23716f = eVar.f23716f;
        this.f23719i = eVar.f23719i;
        this.f23717g = eVar.f23717g;
        this.f23718h = eVar.f23718h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f23712b.f37841a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(e.class, obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f23713c == eVar.f23713c && this.f23714d == eVar.f23714d && this.f23715e == eVar.f23715e && this.f23716f == eVar.f23716f && this.f23717g == eVar.f23717g && this.f23718h == eVar.f23718h && Intrinsics.areEqual(a(), eVar.a()) && this.f23711a == eVar.f23711a) {
            return Intrinsics.areEqual(this.f23719i, eVar.f23719i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f23711a.hashCode() * 31) + (this.f23713c ? 1 : 0)) * 31) + (this.f23714d ? 1 : 0)) * 31) + (this.f23715e ? 1 : 0)) * 31) + (this.f23716f ? 1 : 0)) * 31;
        long j9 = this.f23717g;
        int i11 = (iHashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j11 = this.f23718h;
        int iHashCode2 = (this.f23719i.hashCode() + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f23711a + ", requiresCharging=" + this.f23713c + ", requiresDeviceIdle=" + this.f23714d + ", requiresBatteryNotLow=" + this.f23715e + ", requiresStorageNotLow=" + this.f23716f + ", contentTriggerUpdateDelayMillis=" + this.f23717g + ", contentTriggerMaxDelayMillis=" + this.f23718h + ", contentUriTriggers=" + this.f23719i + ", }";
    }

    public e(rb.f fVar, x xVar, boolean z11, boolean z12, boolean z13, boolean z14, long j9, long j11, Set set) {
        xVar.getClass();
        set.getClass();
        this.f23712b = fVar;
        this.f23711a = xVar;
        this.f23713c = z11;
        this.f23714d = z12;
        this.f23715e = z13;
        this.f23716f = z14;
        this.f23717g = j9;
        this.f23718h = j11;
        this.f23719i = set;
    }

    public e() {
        x xVar = x.NOT_REQUIRED;
        xVar.getClass();
        p0 p0Var = p0.f26531a;
        p0Var.getClass();
        this.f23712b = new rb.f(null);
        this.f23711a = xVar;
        this.f23713c = false;
        this.f23714d = false;
        this.f23715e = false;
        this.f23716f = false;
        this.f23717g = -1L;
        this.f23718h = -1L;
        this.f23719i = p0Var;
    }
}
