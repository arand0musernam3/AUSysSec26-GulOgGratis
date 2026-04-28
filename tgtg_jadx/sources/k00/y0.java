package k00;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y0 implements Comparable {
    public static int e(byte b8) {
        return (b8 >> 5) & 7;
    }

    public static y0 f(byte... bArr) {
        bArr.getClass();
        a1 a1Var = new a1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a.k(a1Var);
        } finally {
            try {
                a1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int c() {
        return 0;
    }

    public final y0 d(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (y0) cls.cast(this);
        }
        throw new zzho(j4.s.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
