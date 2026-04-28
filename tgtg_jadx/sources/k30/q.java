package k30;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends j00.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25920c;

    public q(Object obj) {
        super(1);
        this.f25919b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f25920c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f25920c) {
            i1.c();
            return null;
        }
        this.f25920c = true;
        return this.f25919b;
    }
}
