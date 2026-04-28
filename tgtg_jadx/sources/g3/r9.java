package g3;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.e0 f19436a = new m3.e0(new fw.b(27));

    public static final void a(m5.u0 u0Var, Function2 function2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(15327438);
        int i12 = (sVar.f(u0Var) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function2) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            m3.e0 e0Var = f19436a;
            m3.i.a(e0Var.a(((m5.u0) sVar.j(e0Var)).d(u0Var)), function2, sVar, (i12 & 112) | 8);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b3.x(u0Var, function2, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r27, b4.t r28, long r29, long r31, long r33, x5.k r35, long r36, int r38, boolean r39, int r40, int r41, m5.u0 r42, m3.n r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.r9.b(java.lang.String, b4.t, long, long, long, x5.k, long, int, boolean, int, int, m5.u0, m3.n, int, int, int):void");
    }

    public static final void c(final m5.h hVar, final b4.t tVar, final long j9, long j11, long j12, final x5.k kVar, long j13, int i11, boolean z11, int i12, int i13, final Map map, Function1 function1, m5.u0 u0Var, m3.n nVar, final int i14) {
        m5.h hVar2;
        int i15;
        b4.t tVar2;
        long j14;
        m3.s sVar;
        final long j15;
        final long j16;
        final long j17;
        final int i16;
        final boolean z12;
        final int i17;
        final int i18;
        final Function1 function12;
        final m5.u0 u0Var2;
        long j18;
        int i19;
        Function1 function13;
        int i21;
        int i22;
        int i23;
        m5.u0 u0Var3;
        boolean z13;
        long j19;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(2027001676);
        if ((i14 & 6) == 0) {
            hVar2 = hVar;
            i15 = (sVar2.f(hVar2) ? 4 : 2) | i14;
        } else {
            hVar2 = hVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            tVar2 = tVar;
            i15 |= sVar2.f(tVar2) ? 32 : 16;
        } else {
            tVar2 = tVar;
        }
        if ((i14 & MLKEMEngine.KyberPolyBytes) == 0) {
            j14 = j9;
            i15 |= sVar2.e(j14) ? 256 : 128;
        } else {
            j14 = j9;
        }
        int i24 = i15 | 115043328;
        if ((805306368 & i14) == 0) {
            i24 |= sVar2.f(kVar) ? 536870912 : 268435456;
        }
        int i25 = (sVar2.h(map) ? 131072 : 65536) | 5795254;
        if (sVar2.R(i24 & 1, ((306783379 & i24) == 306783378 && (4793491 & i25) == 4793490) ? false : true)) {
            sVar2.W();
            if ((i14 & 1) == 0 || sVar2.z()) {
                j18 = z5.o.f47289c;
                Object objM = sVar2.M();
                if (objM == m3.m.f29332a) {
                    objM = new g2.q(20);
                    sVar2.k0(objM);
                }
                i19 = i25 & (-29360129);
                function13 = (Function1) objM;
                i21 = Integer.MAX_VALUE;
                i22 = 1;
                i23 = 1;
                j16 = j18;
                u0Var3 = (m5.u0) sVar2.j(f19436a);
                z13 = true;
                j19 = j16;
            } else {
                sVar2.U();
                j18 = j11;
                j19 = j13;
                i22 = i11;
                z13 = z11;
                i21 = i12;
                i23 = i13;
                function13 = function1;
                u0Var3 = u0Var;
                i19 = i25 & (-29360129);
                j16 = j12;
            }
            sVar2.r();
            int i26 = i24 << 3;
            int i27 = (i24 & 14) | 3072 | (i24 & 112) | (i24 & 896) | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
            int i28 = ((i24 >> 27) & 14) | 224688 | ((i19 << 3) & 3670016) | 12582912;
            sVar = sVar2;
            long j21 = j14;
            j15 = j18;
            boolean z14 = z13;
            int i29 = i21;
            int i31 = i23;
            int i32 = i22;
            e(hVar2, tVar2, j21, j15, j16, null, kVar, j19, i32, z14, i29, i31, map, function13, u0Var3, sVar, i27, i28, 0);
            j17 = j19;
            i16 = i32;
            z12 = z14;
            i17 = i29;
            i18 = i31;
            function12 = function13;
            u0Var2 = u0Var3;
        } else {
            sVar = sVar2;
            sVar.U();
            j15 = j11;
            j16 = j12;
            j17 = j13;
            i16 = i11;
            z12 = z11;
            i17 = i12;
            i18 = i13;
            function12 = function1;
            u0Var2 = u0Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.p9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i14 | 1);
                    r9.c(hVar, tVar, j9, j15, j16, kVar, j17, i16, z12, i17, i18, map, function12, u0Var2, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r42, b4.t r43, long r44, long r46, q5.r r48, long r49, x5.l r51, x5.k r52, long r53, int r55, boolean r56, int r57, int r58, kotlin.jvm.functions.Function1 r59, m5.u0 r60, m3.n r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.r9.d(java.lang.String, b4.t, long, long, q5.r, long, x5.l, x5.k, long, int, boolean, int, int, kotlin.jvm.functions.Function1, m5.u0, m3.n, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(m5.h r61, b4.t r62, long r63, long r65, long r67, x5.l r69, x5.k r70, long r71, int r73, boolean r74, int r75, int r76, java.util.Map r77, kotlin.jvm.functions.Function1 r78, m5.u0 r79, m3.n r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.r9.e(m5.h, b4.t, long, long, long, x5.l, x5.k, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, m5.u0, m3.n, int, int, int):void");
    }
}
