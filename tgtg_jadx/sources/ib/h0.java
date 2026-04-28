package ib;

import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f23729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f23730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f23731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f23732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f23735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f23737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f23738k;
    public final int l;

    public h0(UUID uuid, g0 g0Var, HashSet hashSet, h hVar, h hVar2, int i11, int i12, e eVar, long j9, f0 f0Var, long j11, int i13) {
        uuid.getClass();
        g0Var.getClass();
        hVar.getClass();
        hVar2.getClass();
        this.f23728a = uuid;
        this.f23729b = g0Var;
        this.f23730c = hashSet;
        this.f23731d = hVar;
        this.f23732e = hVar2;
        this.f23733f = i11;
        this.f23734g = i12;
        this.f23735h = eVar;
        this.f23736i = j9;
        this.f23737j = f0Var;
        this.f23738k = j11;
        this.l = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(h0.class, obj.getClass())) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f23733f == h0Var.f23733f && this.f23734g == h0Var.f23734g && Intrinsics.areEqual(this.f23728a, h0Var.f23728a) && this.f23729b == h0Var.f23729b && Intrinsics.areEqual(this.f23731d, h0Var.f23731d) && Intrinsics.areEqual(this.f23735h, h0Var.f23735h) && this.f23736i == h0Var.f23736i && Intrinsics.areEqual(this.f23737j, h0Var.f23737j) && this.f23738k == h0Var.f23738k && this.l == h0Var.l && Intrinsics.areEqual(this.f23730c, h0Var.f23730c)) {
            return Intrinsics.areEqual(this.f23732e, h0Var.f23732e);
        }
        return false;
    }

    public final int hashCode() {
        int iB = e0.f.b((this.f23735h.hashCode() + ((((((this.f23732e.hashCode() + ((this.f23730c.hashCode() + ((this.f23731d.hashCode() + ((this.f23729b.hashCode() + (this.f23728a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f23733f) * 31) + this.f23734g) * 31)) * 31, 31, this.f23736i);
        f0 f0Var = this.f23737j;
        return Integer.hashCode(this.l) + e0.f.b((iB + (f0Var != null ? f0Var.hashCode() : 0)) * 31, 31, this.f23738k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f23728a + "', state=" + this.f23729b + ", outputData=" + this.f23731d + ", tags=" + this.f23730c + ", progress=" + this.f23732e + ", runAttemptCount=" + this.f23733f + ", generation=" + this.f23734g + ", constraints=" + this.f23735h + ", initialDelayMillis=" + this.f23736i + ", periodicityInfo=" + this.f23737j + ", nextScheduleTimeMillis=" + this.f23738k + "}, stopReason=" + this.l;
    }
}
