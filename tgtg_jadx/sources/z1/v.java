package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements u {
    @Override // z1.u
    public final float a(float f11, float f12, float f13) {
        float fAbs = Math.abs((f12 + f11) - f11);
        float f14 = (0.3f * f13) - (0.0f * fAbs);
        float f15 = f13 - f14;
        if ((fAbs <= f13) && f15 < fAbs) {
            f14 = f13 - fAbs;
        }
        return f11 - f14;
    }
}
