package g3;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18646b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f18647c;

    static {
        float f11 = 2;
        f18645a = f11;
        f18647c = f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r23, kotlin.jvm.functions.Function1 r24, b4.t r25, boolean r26, g3.z r27, m3.n r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.g0.a(boolean, kotlin.jvm.functions.Function1, b4.t, boolean, g3.z, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r26, l5.a r27, b4.t r28, g3.z r29, k4.h r30, k4.h r31, m3.n r32, int r33) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.g0.b(boolean, l5.a, b4.t, g3.z, k4.h, k4.h, m3.n, int):void");
    }

    public static final void c(l5.a aVar, Function0 function0, k4.h hVar, k4.h hVar2, b4.t tVar, boolean z11, z zVar, m3.n nVar, int i11) {
        int i12;
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-406243761);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(aVar.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(hVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(hVar2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(tVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(zVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.f(null) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (4793491 & i13) != 4793490)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            t5 t5VarA = s5.a(l3.n.f27053f / 2, 4, 0L, false);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarE = function0 != null ? k2.c.e(qVar, aVar, null, t5VarA, z11, new j5.j(1), function0) : qVar;
            if (function0 != null) {
                z4.o oVar = o2.f19198a;
                tVar2 = z2.f19875b;
            } else {
                tVar2 = qVar;
            }
            int i14 = i13 << 6;
            b(z11, aVar, tVar.then(tVar2).then(tVarE).then(d2.c.z(qVar, f18645a)), zVar, hVar, hVar2, sVar, ((i13 >> 15) & 14) | ((i13 << 3) & 112) | ((i13 >> 9) & 7168) | (57344 & i14) | (i14 & 458752));
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c0(aVar, function0, hVar, hVar2, tVar, z11, zVar, i11);
        }
    }
}
