package x90;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static int a(int i11, int i12, int i13) throws IOException {
        if ((i12 & 8) != 0) {
            i11--;
        }
        if (i13 <= i11) {
            return i11 - i13;
        }
        i4.a.k(r8.k.k("PROTOCOL_ERROR padding ", i13, i11, " > remaining length "));
        return 0;
    }
}
