package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f39398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39399c;

    public c0(t tVar, p0 p0Var, long j9) {
        this.f39397a = tVar;
        this.f39398b = p0Var;
        this.f39399c = j9;
    }

    @Override // t1.i
    public final x1 a(v1 v1Var) {
        return new od.f(this.f39397a.a(v1Var), this.f39398b, this.f39399c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.areEqual(c0Var.f39397a, this.f39397a) && c0Var.f39398b == this.f39398b && c0Var.f39399c == this.f39399c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39399c) + ((this.f39398b.hashCode() + (this.f39397a.hashCode() * 31)) * 31);
    }
}
