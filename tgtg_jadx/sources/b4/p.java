package b4;

import androidx.compose.ui.platform.ComposeView;
import d6.g0;
import d6.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import m3.b1;
import s1.h0;
import s1.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(c5.a aVar, int i11, int i12) {
        super(2);
        this.f5709a = i12;
        this.f5710b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5709a) {
            case 0:
                t tVar = (t) obj;
                t tVarB = (r) obj2;
                m3.n nVar = (m3.n) this.f5710b;
                if (tVarB instanceof n) {
                    i80.n nVar2 = ((n) tVarB).f5707c;
                    nVar2.getClass();
                    tVarB = a.b((t) ((i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(nVar2, 3)).invoke(q.f5711a, nVar, 0), nVar);
                }
                return tVar.then(tVarB);
            case 1:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.s sVar = (m3.s) nVar3;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((c5.a) this.f5710b).a(sVar, 0);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 2:
                ((Number) obj2).intValue();
                ((ComposeView) this.f5710b).a((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 3:
                ((d4.e) this.f5710b).k(((Number) obj).intValue(), (j5.t) obj2);
                return Unit.f26487a;
            case 4:
                m3.n nVar4 = (m3.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar4;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM = sVar2.M();
                    if (objM == m3.m.f29332a) {
                        objM = d6.d.f14440b;
                        sVar2.k0(objM);
                    }
                    ex.i.i(j5.r.c(q.f5711a, false, (Function1) objM), (Function2) ((b1) this.f5710b).getValue(), sVar2, 0);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 5:
                ((Number) obj2).intValue();
                ((z) this.f5710b).a((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 6:
                ((Number) obj2).intValue();
                ((g0) this.f5710b).a((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            default:
                h0 h0Var = (h0) obj;
                h0 h0Var2 = (h0) obj2;
                h0 h0Var3 = h0.PostExit;
                return Boolean.valueOf(h0Var == h0Var3 && h0Var2 == h0Var3 && !((y0) this.f5710b).f38733a.f38645e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, int i11) {
        super(2);
        this.f5709a = i11;
        this.f5710b = obj;
    }
}
