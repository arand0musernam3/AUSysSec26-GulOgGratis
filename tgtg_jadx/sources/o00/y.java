package o00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends j00.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31778c;

    public y(Object obj) {
        super(3);
        this.f31777b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f31778c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f31778c) {
            m0.i1.c();
            return null;
        }
        this.f31778c = true;
        return this.f31777b;
    }
}
