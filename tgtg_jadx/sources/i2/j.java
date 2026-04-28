package i2;

import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h2.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f22865a;

    public j(e0 e0Var) {
        this.f22865a = e0Var;
    }

    @Override // h2.v
    public final int a() {
        return this.f22865a.o();
    }

    @Override // h2.v
    public final int b() {
        return Math.min(r0.o() - 1, ((g) ((h) CollectionsKt.W(this.f22865a.n().f22906a))).f22846a);
    }

    @Override // h2.v
    public final int c() {
        int i11;
        e0 e0Var = this.f22865a;
        if (e0Var.n().f22906a.size() == 0) {
            return 0;
        }
        int iL = w.b.L(e0Var.n());
        int i12 = e0Var.n().f22907b + e0Var.n().f22908c;
        if (i12 != 0 && (i11 = iL / i12) >= 1) {
            return i11;
        }
        return 1;
    }

    @Override // h2.v
    public final boolean d() {
        return !this.f22865a.n().f22906a.isEmpty();
    }

    @Override // h2.v
    public final int e() {
        return Math.max(0, this.f22865a.f22823e);
    }
}
