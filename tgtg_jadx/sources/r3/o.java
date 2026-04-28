package r3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f37609d;

    public o(g gVar) {
        this.f37609d = gVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f37607c;
        this.f37607c = i11 + 2;
        Object[] objArr = this.f37605a;
        return new a(this.f37609d, objArr[i11], objArr[i11 + 1]);
    }
}
