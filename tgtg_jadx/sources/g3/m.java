package g3;

import com.app.tgtg.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f19068a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f19070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f19071d;

    static {
        l3.r rVar = l3.u0.f27147a;
        float f11 = l3.u0.f27152f;
        f19069b = 640;
        f19070c = 56;
        f19071d = 125;
    }

    public final void a(b4.t tVar, float f11, float f12, i4.v0 v0Var, long j9, m3.n nVar, int i11) {
        m3.s sVar;
        b4.t tVar2;
        float f13;
        float f14;
        i4.v0 v0Var2;
        long j11;
        i4.v0 v0Var3;
        long jE;
        final float f15;
        final float f16;
        b4.t tVar3;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1364277227);
        int i12 = i11 | 9654;
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                float f17 = l3.u0.f27151e;
                float f18 = l3.u0.f27150d;
                v0Var3 = ((k6) sVar2.j(m6.f19099a)).f18965e;
                jE = r0.e(l3.u0.f27149c, sVar2);
                f15 = f18;
                f16 = f17;
                tVar3 = b4.q.f5711a;
            } else {
                sVar2.U();
                tVar3 = tVar;
                f16 = f11;
                f15 = f12;
                v0Var3 = v0Var;
                jE = j9;
            }
            sVar2.r();
            String strJ = i3.r.j(sVar2, R.string.m3c_bottom_sheet_drag_handle_description);
            b4.t tVarB = d2.c.B(tVar3, 0.0f, s6.f19476a, 1);
            boolean zF = sVar2.f(strJ);
            Object objM = sVar2.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new c60.e(strJ, 23);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            q7.a(j5.r.c(tVarB, false, (Function1) objM), v0Var3, jE, 0L, 0.0f, 0.0f, null, u3.e.e(-1039573072, sVar2, new Function2() { // from class: g3.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar3 = (m3.s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d2.p.a(d2.m2.n(b4.q.f5711a, f16, f15), sVar3, 0);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 12582912, 120);
            f14 = f15;
            v0Var2 = v0Var3;
            j11 = jE;
            f13 = f16;
            tVar2 = tVar3;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
            f13 = f11;
            f14 = f12;
            v0Var2 = v0Var;
            j11 = j9;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b3.t(this, tVar2, f13, f14, v0Var2, j11, i11);
        }
    }
}
