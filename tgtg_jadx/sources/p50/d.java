package p50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f34487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f34488d;

    public d(f fVar, int i11, int i12) {
        super(fVar);
        this.f34487c = (short) i11;
        this.f34488d = (short) i12;
    }

    @Override // p50.f
    public final void a(q50.a aVar, byte[] bArr) {
        aVar.b(this.f34487c, this.f34488d);
    }

    public final String toString() {
        short s7 = this.f34488d;
        return "<" + Integer.toBinaryString((1 << s7) | (((1 << s7) - 1) & this.f34487c) | (1 << s7)).substring(1) + '>';
    }
}
