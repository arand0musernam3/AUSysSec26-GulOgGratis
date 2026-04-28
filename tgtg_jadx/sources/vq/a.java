package vq;

import android.content.Context;
import b4.q;
import b4.t;
import c5.v0;
import d2.c;
import d2.m2;
import g3.s0;
import j5.r;
import ki.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l2.g;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import o00.x0;
import u3.e;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f42513b;

    public /* synthetic */ a(int i11, int i12, Function0 function0) {
        this.f42512a = i12;
        this.f42513b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f42512a) {
            case 0:
                num.getClass();
                x0.b(this.f42513b, nVar, i.F(7));
                break;
            case 1:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fE = d70.a.e(sVar, w.b.u((Context) sVar.j(v0.f7390b)));
                    float f11 = 275;
                    t tVarE = m2.e(m2.q(q.f5711a, fE), f11);
                    Object objM = sVar.M();
                    if (objM == m.f29332a) {
                        objM = new g0(21);
                        sVar.k0(objM);
                    }
                    s0.b(c.A(r.c(tVarE, false, (Function1) objM), lv.t.f28251e, lv.t.f28249c), g.b(12), s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, e.e(1473345892, sVar, new f(fE, f11, this.f42513b)), sVar, 196608, 16);
                } else {
                    sVar.U();
                }
                break;
            case 2:
                num.getClass();
                yj.a.i(this.f42513b, nVar, i.F(1));
                break;
            case 3:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t tVarT = m2.t(m2.d(q.f5711a, 1.0f), 3);
                    Object objM2 = sVar2.M();
                    if (objM2 == m.f29332a) {
                        objM2 = new g0(24);
                        sVar2.k0(objM2);
                    }
                    s0.b(c.A(r.c(tVarT, false, (Function1) objM2), lv.t.f28253g, lv.t.f28251e), g.b(12), s0.p(lv.s.J, sVar2, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, e.e(1266913060, sVar2, new bm.c(6, this.f42513b)), sVar2, 196608, 16);
                } else {
                    sVar2.U();
                }
                break;
            default:
                num.getClass();
                yj.a.j(this.f42513b, nVar, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(int i11, Function0 function0) {
        this.f42512a = i11;
        this.f42513b = function0;
    }
}
