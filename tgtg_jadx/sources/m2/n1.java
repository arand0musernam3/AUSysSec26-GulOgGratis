package m2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {
    public static void a(r5.y yVar, k1 k1Var, m5.q0 q0Var, z4.z zVar, r5.d0 d0Var, boolean z11, r5.s sVar) {
        if (z11) {
            int iR = sVar.r(m5.t0.f(yVar.f37715b));
            String str = o1.f29050a;
            h4.c cVarB = iR < q0Var.f29617a.f29603a.f29538b.length() ? q0Var.b(iR) : iR != 0 ? q0Var.b(iR - 1) : new h4.c(0.0f, 0.0f, 1.0f, (int) (o1.a(k1Var.f28955b, k1Var.f28960g, k1Var.f28961h, o1.f29050a, 1) & 4294967295L));
            float f11 = cVarB.f21381b;
            float f12 = cVarB.f21380a;
            long jS = zVar.S((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
            h4.c cVarS = na0.a.S((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jS & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jS >> 32)))) << 32), (((long) Float.floatToRawIntBits(cVarB.f21382c - f12)) << 32) | (((long) Float.floatToRawIntBits(cVarB.f21383d - f11)) & 4294967295L));
            if (Intrinsics.areEqual((r5.d0) d0Var.f37665a.f37718b.get(), d0Var)) {
                d0Var.f37666b.b(cVarS);
            }
        }
    }
}
