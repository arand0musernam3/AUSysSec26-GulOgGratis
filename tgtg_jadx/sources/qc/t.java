package qc;

import m2.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f36929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zc.n f36930c;

    public /* synthetic */ t(b0 b0Var, zc.n nVar, int i11) {
        this.f36928a = i11;
        this.f36929b = b0Var;
        this.f36930c = nVar;
    }

    @Override // qc.j
    public final Object a(x70.c cVar) {
        switch (this.f36928a) {
            case 0:
                return v80.f0.G(new b2(this, 15), (z70.c) cVar);
            default:
                return v80.f0.G(new b2(this, 16), (z70.c) cVar);
        }
    }
}
