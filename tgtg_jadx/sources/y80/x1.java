package y80;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45611b;

    public x1(long j9, long j11) {
        this.f45610a = j9;
        this.f45611b = j11;
        if (j9 < 0) {
            i4.a.i(w2.l1.e("stopTimeout(", j9, " ms) cannot be negative"));
            throw null;
        }
        if (j11 >= 0) {
            return;
        }
        i4.a.i(w2.l1.e("replayExpiration(", j11, " ms) cannot be negative"));
        throw null;
    }

    @Override // y80.q1
    public final i a(z80.y yVar) {
        return r.l(new w(r.y(yVar, new v1(this, null)), new w1(2, null, 0), 3));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.f45610a == x1Var.f45610a && this.f45611b == x1Var.f45611b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45611b) + (Long.hashCode(this.f45610a) * 31);
    }

    public final String toString() {
        v70.e eVar = new v70.e(2);
        long j9 = this.f45610a;
        if (j9 > 0) {
            eVar.add("stopTimeout=" + j9 + "ms");
        }
        long j11 = this.f45611b;
        if (j11 < LongCompanionObject.MAX_VALUE) {
            eVar.add("replayExpiration=" + j11 + "ms");
        }
        return w2.l1.f(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.U(kotlin.collections.c0.a(eVar), null, null, null, null, 63), ')');
    }
}
