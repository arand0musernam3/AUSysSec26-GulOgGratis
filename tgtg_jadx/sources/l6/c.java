package l6;

import f6.t;
import n6.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends k6.g {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public k6.k f27390n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f27391o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public n6.a f27392p0;

    public c(t tVar) {
        super(tVar, k6.l.BARRIER);
    }

    @Override // k6.g, k6.b, k6.h
    public final void apply() {
        s();
        int i11 = b.f27389a[this.f27390n0.ordinal()];
        int i12 = 3;
        if (i11 == 3 || i11 == 4) {
            i12 = 1;
        } else if (i11 == 5) {
            i12 = 2;
        } else if (i11 != 6) {
            i12 = 0;
        }
        n6.a aVar = this.f27392p0;
        aVar.f30545x0 = i12;
        aVar.f30547z0 = this.f27391o0;
    }

    @Override // k6.b
    public final k6.b k(int i11) {
        this.f27391o0 = i11;
        return this;
    }

    @Override // k6.b
    public final k6.b l(Float f11) {
        this.f27391o0 = this.f26047k0.c(f11);
        return this;
    }

    @Override // k6.g
    public final m s() {
        if (this.f27392p0 == null) {
            this.f27392p0 = new n6.a();
        }
        return this.f27392p0;
    }
}
