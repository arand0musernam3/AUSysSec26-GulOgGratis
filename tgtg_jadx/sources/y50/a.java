package y50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final a[] FOR_BITS;
    private final int bits;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        FOR_BITS = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i11) {
        this.bits = i11;
    }

    public final int a() {
        return this.bits;
    }
}
