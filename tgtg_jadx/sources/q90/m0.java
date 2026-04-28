package q90;

import java.nio.charset.Charset;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {
    public static l0 a(String str, z zVar) {
        str.getClass();
        Pair pairL = wd.a.l(zVar);
        Charset charset = (Charset) pairL.f26485a;
        z zVar2 = (z) pairL.f26486b;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return b(zVar2, bytes, 0, bytes.length);
    }

    public static l0 b(z zVar, byte[] bArr, int i11, int i12) {
        bArr.getClass();
        r90.e.a(bArr.length, i11, i12);
        return new l0(zVar, bArr, i12, i11);
    }

    public static /* synthetic */ l0 c(m0 m0Var, byte[] bArr, z zVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            zVar = null;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        int length = bArr.length;
        m0Var.getClass();
        return b(zVar, bArr, i11, length);
    }
}
