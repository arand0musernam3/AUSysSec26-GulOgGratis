package gd;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends n4.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fd.l f20397f;

    public n(fd.l lVar) {
        this.f20397f = lVar;
    }

    @Override // n4.b
    public final long h() {
        fd.l lVar = this.f20397f;
        int iB = lVar.b();
        float f11 = iB > 0 ? iB : Float.NaN;
        int height = lVar.getHeight();
        return (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(height > 0 ? height : Float.NaN)) & 4294967295L);
    }

    @Override // n4.b
    public final void i(k4.d dVar) {
        fd.l lVar = this.f20397f;
        int iB = lVar.b();
        float fIntBitsToFloat = iB > 0 ? Float.intBitsToFloat((int) (dVar.d() >> 32)) / iB : 1.0f;
        int height = lVar.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / height : 1.0f;
        j30.g gVarG0 = dVar.g0();
        long jO = gVarG0.o();
        gVarG0.i().e();
        try {
            ((jd.f) gVarG0.f24502b).o(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            lVar.c(i4.d.a(dVar.g0().i()));
        } finally {
            r8.k.y(gVarG0, jO);
        }
    }
}
