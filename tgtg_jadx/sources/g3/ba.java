package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18379b = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f18380c = 40;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d2.b2 f18381d;

    static {
        float f11 = 4;
        f18378a = f11;
        float f12 = 8;
        f18381d = new d2.b2(f12, f11, f12, f11);
    }

    public static final void a(final da daVar, b4.t tVar, float f11, i4.v0 v0Var, long j9, long j11, float f12, float f13, final u3.d dVar, m3.n nVar, final int i11) {
        int i12;
        m3.s sVar;
        final b4.t tVar2;
        final float f14;
        final i4.v0 v0Var2;
        final long j12;
        final long j13;
        final float f15;
        final float f16;
        long jE;
        int i13;
        float f17;
        long jE2;
        float f18;
        b4.t tVar3;
        i4.v0 v0Var3;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-343758958);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar2.f(daVar) : sVar2.h(daVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = i12 | 3504;
        if ((i11 & 24576) == 0) {
            i14 = i12 | 11696;
        }
        if ((196608 & i11) == 0) {
            i14 |= 65536;
        }
        if ((1572864 & i11) == 0) {
            i14 |= 524288;
        }
        int i15 = 113246208 | i14;
        if ((805306368 & i11) == 0) {
            i15 |= sVar2.h(dVar) ? 536870912 : 268435456;
        }
        if (sVar2.R(i15 & 1, (306783379 & i15) != 306783378)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                f14 = z9.f19906a;
                i4.v0 v0VarB = m6.b(l3.m0.f27045b, sVar2);
                jE = r0.e(l3.m0.f27046c, sVar2);
                i13 = i15 & (-4186113);
                f17 = 0;
                jE2 = r0.e(l3.m0.f27044a, sVar2);
                f18 = 0;
                tVar3 = b4.q.f5711a;
                v0Var3 = v0VarB;
            } else {
                sVar2.U();
                i13 = i15 & (-4186113);
                tVar3 = tVar;
                f14 = f11;
                v0Var3 = v0Var;
                jE = j9;
                jE2 = j11;
                f17 = f12;
                f18 = f13;
            }
            sVar2.r();
            sVar2.a0(-1719869687);
            sVar2.q(false);
            int i16 = i13 >> 9;
            sVar = sVar2;
            q7.a(tVar3, v0Var3, jE2, 0L, f17, f18, null, u3.e.e(-1573998995, sVar2, new fg.d(f14, jE, dVar)), sVar, (57344 & i16) | 12582912 | (i16 & 458752), 72);
            j12 = jE;
            tVar2 = tVar3;
            v0Var2 = v0Var3;
            j13 = jE2;
            f15 = f17;
            f16 = f18;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
            f14 = f11;
            v0Var2 = v0Var;
            j12 = j9;
            j13 = j11;
            f15 = f12;
            f16 = f13;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.aa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ba.a(daVar, tVar2, f14, v0Var2, j12, j13, f15, f16, dVar, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(d6.i0 r26, u3.d r27, g3.ea r28, b4.t r29, boolean r30, kotlin.jvm.functions.Function2 r31, m3.n r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.ba.b(d6.i0, u3.d, g3.ea, b4.t, boolean, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final ea c(m3.n nVar) {
        v1.l1 l1Var = i3.h.f23115a;
        boolean zG = ((m3.s) nVar).g(false) | ((m3.s) nVar).f(l1Var);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        if (zG || objM == m3.m.f29332a) {
            objM = new ea(l1Var);
            sVar.k0(objM);
        }
        return (ea) objM;
    }
}
