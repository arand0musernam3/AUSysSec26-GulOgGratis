package g7;

import g6.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20085c;

    public b(int i11) {
        super(i11);
        this.f20085c = new Object();
    }

    @Override // g6.e
    public final Object a() {
        Object objA;
        synchronized (this.f20085c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // g6.e
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f20085c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
