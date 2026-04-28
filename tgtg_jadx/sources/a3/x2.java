package a3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f626e;

    public x2(boolean z11, int i11, int i12, i0 i0Var, f0 f0Var) {
        this.f622a = z11;
        this.f623b = i11;
        this.f624c = i12;
        this.f625d = i0Var;
        this.f626e = f0Var;
    }

    @Override // a3.n1
    public final boolean a() {
        return this.f622a;
    }

    @Override // a3.n1
    public final f0 b() {
        return this.f626e;
    }

    @Override // a3.n1
    public final i0 c() {
        return this.f625d;
    }

    @Override // a3.n1
    public final f0 d() {
        return this.f626e;
    }

    @Override // a3.n1
    public final int e() {
        return this.f624c;
    }

    @Override // a3.n1
    public final f0 f() {
        return this.f626e;
    }

    @Override // a3.n1
    public final k g() {
        int i11 = this.f623b;
        int i12 = this.f624c;
        return i11 < i12 ? k.NOT_CROSSED : i11 > i12 ? k.CROSSED : this.f626e.b();
    }

    @Override // a3.n1
    public final int getSize() {
        return 1;
    }

    @Override // a3.n1
    public final q1.k0 h(i0 i0Var) {
        boolean z11 = i0Var.f387c;
        h0 h0Var = i0Var.f386b;
        h0 h0Var2 = i0Var.f385a;
        if ((!z11 && h0Var2.f367b > h0Var.f367b) || (z11 && h0Var2.f367b <= h0Var.f367b)) {
            i0Var = i0.a(i0Var, null, null, !z11, 3);
        }
        long j9 = this.f626e.f337a;
        q1.k0 k0Var = q1.w.f35850a;
        q1.k0 k0Var2 = new q1.k0();
        k0Var2.h(j9, i0Var);
        return k0Var2;
    }

    @Override // a3.n1
    public final boolean i(n1 n1Var) {
        if (this.f625d == null || n1Var == null || !(n1Var instanceof x2)) {
            return true;
        }
        x2 x2Var = (x2) n1Var;
        if (this.f623b != x2Var.f623b || this.f624c != x2Var.f624c || this.f622a != x2Var.f622a) {
            return true;
        }
        f0 f0Var = x2Var.f626e;
        f0 f0Var2 = this.f626e;
        return (f0Var2.f337a == f0Var.f337a && f0Var2.f339c == f0Var.f339c && f0Var2.f340d == f0Var.f340d) ? false : true;
    }

    @Override // a3.n1
    public final f0 k() {
        return this.f626e;
    }

    @Override // a3.n1
    public final int l() {
        return this.f623b;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f622a + ", crossed=" + g() + ", info=\n\t" + this.f626e + ')';
    }

    @Override // a3.n1
    public final void j(Function1 function1) {
    }
}
