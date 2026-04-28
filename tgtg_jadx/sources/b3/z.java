package b3;

import kotlin.jvm.functions.Function2;
import m3.e0;
import m3.w1;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f5675a = new e0(new au.a(11));

    public static final void a(u0 u0Var, Function2 function2, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-13499697);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(u0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function2) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            e0 e0Var = f5675a;
            m3.i.a(e0Var.a(((u0) sVar.j(e0Var)).d(u0Var)), function2, sVar, (i12 & 112) | 8);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new x(u0Var, function2, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r39, b4.t r40, long r41, long r43, long r45, long r47, int r49, boolean r50, int r51, int r52, kotlin.jvm.functions.Function1 r53, m5.u0 r54, m3.n r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.z.b(java.lang.String, b4.t, long, long, long, long, int, boolean, int, int, kotlin.jvm.functions.Function1, m5.u0, m3.n, int, int, int):void");
    }
}
