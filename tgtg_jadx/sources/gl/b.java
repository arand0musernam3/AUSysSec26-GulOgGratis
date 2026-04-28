package gl;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.o0;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mv.m0;
import pg.t2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20531b;

    public /* synthetic */ b(l lVar, int i11) {
        this.f20530a = i11;
        this.f20531b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20530a) {
            case 0:
                av.a aVar = (av.a) obj;
                aVar.getClass();
                m0 m0Var = sa0.a.f38953a;
                m0Var.h("OnboardingSurvey");
                m0Var.c("Navigation event observed", new Object[0]);
                if (aVar instanceof av.a) {
                    l lVar = this.f20531b;
                    o0 o0VarRequireActivity = lVar.requireActivity();
                    o0VarRequireActivity.getClass();
                    Intent intentA = aVar.a(o0VarRequireActivity);
                    o0 o0VarRequireActivity2 = lVar.requireActivity();
                    o0VarRequireActivity2.getClass();
                    lVar.startActivity(intentA, mv.a.b(o0VarRequireActivity2));
                    if (aVar.f4842c) {
                        lVar.requireActivity().finishAffinity();
                    }
                }
                break;
            case 1:
                ((View) obj).getClass();
                t2 t2Var = this.f20531b.f20556h;
                t2Var.getClass();
                pd.g.G((ViewPager2) t2Var.f35173j);
                break;
            case 2:
                ((View) obj).getClass();
                m0 m0Var2 = sa0.a.f38953a;
                m0Var2.h("OnboardingSurvey");
                m0Var2.c("Next button clicked", new Object[0]);
                this.f20531b.s();
                break;
            case 3:
                ((View) obj).getClass();
                m0 m0Var3 = sa0.a.f38953a;
                m0Var3.h("OnboardingSurvey");
                m0Var3.c("Skip button clicked", new Object[0]);
                l lVar2 = this.f20531b;
                q qVarR = lVar2.r();
                int iQ = lVar2.q();
                if (iQ == 0) {
                    qVarR.f20571e.d(cv.i.ACTION_SKIP_ONBOARDING, dv.a.SOURCE, "Its_A_Surprise");
                } else {
                    qVarR.f(iQ, true);
                }
                lVar2.s();
                break;
            default:
                ((View) obj).getClass();
                m0 m0Var4 = sa0.a.f38953a;
                m0Var4.h("OnboardingSurvey");
                m0Var4.c("Next button clicked", new Object[0]);
                this.f20531b.s();
                break;
        }
        return Unit.f26487a;
    }
}
