package qc;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements i {
    @Override // qc.i
    public final j a(tc.n nVar, zc.n nVar2) {
        ia0.i iVarP0 = nVar.f39950a.p0();
        if (!iVarP0.X(0L, r.f36920b) && !iVarP0.X(0L, r.f36919a) && (!iVarP0.X(0L, r.f36921c) || !iVarP0.X(8L, r.f36922d) || !iVarP0.X(12L, r.f36923e) || !iVarP0.request(17L) || ((byte) (iVarP0.h().G(16L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !iVarP0.X(4L, r.f36924f)) {
                return null;
            }
            if (!iVarP0.X(8L, r.f36925g) && !iVarP0.X(8L, r.f36926h) && !iVarP0.X(8L, r.f36927i)) {
                return null;
            }
        }
        return new a0(nVar.f39950a, nVar2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    public final int hashCode() {
        return u.class.hashCode();
    }
}
