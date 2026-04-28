package r8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public final void e(g gVar, int i11) {
        float[] fArr = this.f37755a;
        int i12 = i11 + 1;
        long jA = gVar.a(fArr[i11], fArr[i12]);
        fArr[i11] = Float.intBitsToFloat((int) (jA >> 32));
        fArr[i12] = Float.intBitsToFloat((int) (4294967295L & jA));
    }
}
