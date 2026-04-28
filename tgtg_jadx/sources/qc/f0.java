package qc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements i {
    @Override // qc.i
    public final j a(tc.n nVar, zc.n nVar2) {
        long jY;
        String str = nVar.f39951b;
        b0 b0Var = nVar.f39950a;
        if (!Intrinsics.areEqual(str, "image/svg+xml")) {
            ia0.i iVarP0 = b0Var.p0();
            if (!iVarP0.X(0L, e0.f36903b)) {
                return null;
            }
            ia0.j jVar = e0.f36902a;
            byte[] bArr = jVar.f23647a;
            if (bArr.length <= 0) {
                i4.a.f("bytes is empty");
                return null;
            }
            byte b8 = bArr[0];
            long length = 1024 - ((long) bArr.length);
            long j9 = 0;
            while (true) {
                if (j9 >= length) {
                    jY = -1;
                    break;
                }
                byte b11 = b8;
                long j11 = length;
                jY = iVarP0.y(b11, j9, j11);
                if (jY == -1 || iVarP0.X(jY, jVar)) {
                    break;
                }
                j9 = jY + 1;
                length = j11;
                b8 = b11;
            }
            if (jY == -1) {
                return null;
            }
        }
        return new t(b0Var, nVar2, 1);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f0);
    }

    public final int hashCode() {
        return Boolean.hashCode(true);
    }
}
