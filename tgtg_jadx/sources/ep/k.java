package ep;

import g9.f0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f16295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f16296c;

    public /* synthetic */ k(d0 d0Var, f0 f0Var, int i11) {
        this.f16294a = i11;
        this.f16295b = d0Var;
        this.f16296c = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g9.z zVar;
        switch (this.f16294a) {
            case 0:
                hp.g gVar = (hp.g) obj;
                gVar.getClass();
                d0 d0Var = this.f16295b;
                d0Var.getClass();
                a2 a2Var = d0Var.f16258s;
                a2Var.getClass();
                a2Var.k(null, gVar);
                g9.p.f(this.f16296c, hp.t.INSTANCE.f22335a);
                break;
            case 1:
                hp.g gVar2 = (hp.g) obj;
                gVar2.getClass();
                d0 d0Var2 = this.f16295b;
                d0Var2.getClass();
                a2 a2Var2 = d0Var2.f16258s;
                a2Var2.getClass();
                a2Var2.k(null, gVar2);
                g9.p.f(this.f16296c, hp.t.INSTANCE.f22335a);
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                g9.l lVarB = this.f16296c.b();
                d0 d0Var3 = this.f16295b;
                d0Var3.getClass();
                dv.d dVar = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? dv.d.NONE : dv.d.RECIPE_INTRO_THIRD_STEP : dv.d.RECIPE_INTRO_SECOND_STEP : dv.d.RECIPE_INTRO_FIRST_STEP;
                dv.d dVarF = Intrinsics.areEqual((lVarB == null || (zVar = lVarB.f20163b) == null) ? null : zVar.f20258b.f27564f, hp.v.INSTANCE.f22335a) ? dv.d.EMPTY_SAVED_RECIPE_LIST : d0Var3.f();
                d0Var3.r(cv.i.SCREEN_FRIDGE_INTRO, h0.g.E(new Pair(dv.a.NPS_STEP, new dv.c(dVar != null ? dVar.a() : null)), new Pair(dv.a.OPENED_FROM, new dv.c(dVarF != null ? dVarF.a() : null))));
                break;
            default:
                hp.g gVar3 = (hp.g) obj;
                gVar3.getClass();
                d0 d0Var4 = this.f16295b;
                d0Var4.getClass();
                a2 a2Var3 = d0Var4.f16258s;
                a2Var3.getClass();
                a2Var3.k(null, gVar3);
                g9.p.f(this.f16296c, hp.t.INSTANCE.f22335a);
                break;
        }
        return Unit.f26487a;
    }
}
