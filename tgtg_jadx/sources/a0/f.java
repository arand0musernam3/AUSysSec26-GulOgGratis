package a0;

import b0.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements t70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f63b;

    public /* synthetic */ f(h hVar, int i11) {
        this.f62a = i11;
        this.f63b = hVar;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f62a) {
            case 0:
                h hVar = this.f63b;
                return (i0.b) hVar.f68a.invoke(((k) hVar.f71d.getValue()).f5259a);
            default:
                return ((k) this.f63b.f71d.getValue()).f5260b;
        }
    }
}
