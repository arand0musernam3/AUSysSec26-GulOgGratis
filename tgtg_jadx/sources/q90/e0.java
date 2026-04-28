package q90;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {
    public static f0 a(String str) throws IOException {
        f0 f0Var = f0.HTTP_1_0;
        if (Intrinsics.areEqual(str, f0Var.protocol)) {
            return f0Var;
        }
        f0 f0Var2 = f0.HTTP_1_1;
        if (Intrinsics.areEqual(str, f0Var2.protocol)) {
            return f0Var2;
        }
        f0 f0Var3 = f0.H2_PRIOR_KNOWLEDGE;
        if (Intrinsics.areEqual(str, f0Var3.protocol)) {
            return f0Var3;
        }
        f0 f0Var4 = f0.HTTP_2;
        if (Intrinsics.areEqual(str, f0Var4.protocol)) {
            return f0Var4;
        }
        f0 f0Var5 = f0.SPDY_3;
        if (Intrinsics.areEqual(str, f0Var5.protocol)) {
            return f0Var5;
        }
        f0 f0Var6 = f0.QUIC;
        if (Intrinsics.areEqual(str, f0Var6.protocol)) {
            return f0Var6;
        }
        f0 f0Var7 = f0.HTTP_3;
        if (kotlin.text.y.p(str, f0Var7.protocol, false)) {
            return f0Var7;
        }
        i4.a.k("Unexpected protocol: ".concat(str));
        return null;
    }
}
