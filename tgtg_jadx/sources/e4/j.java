package e4;

import b5.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final boolean a(i iVar, long j9) {
        if (!iVar.getNode().isAttached()) {
            return false;
        }
        x xVar = b5.m.g(iVar).G.f5857c;
        if (!xVar.n()) {
            return false;
        }
        long jS = xVar.S(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jS >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS & 4294967295L));
        long j11 = iVar.f15745r;
        float f11 = ((int) (j11 >> 32)) + fIntBitsToFloat;
        float f12 = ((int) (j11 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j9 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f11) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f12;
    }
}
