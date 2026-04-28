package a3;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f290d;

    public /* synthetic */ c(int i11, Object obj, boolean z11, boolean z12) {
        this.f287a = i11;
        this.f290d = obj;
        this.f288b = z11;
        this.f289c = z12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f287a) {
            case 0:
                j5.b0 b0Var = (j5.b0) obj;
                long jA = ((t) this.f290d).a();
                b0Var.b(m1.f480c, new l1(this.f288b ? m2.t0.SelectionStart : m2.t0.SelectionEnd, jA, this.f289c ? k1.Left : k1.Right, (9223372034707292159L & jA) != 9205357640488583168L));
                break;
            default:
                dn.f fVar = (dn.f) this.f290d;
                ((Animation) obj).getClass();
                fVar.f15006n = false;
                pg.c2 c2Var = fVar.f14994a;
                fVar.h(true);
                if (this.f288b) {
                    ConstraintLayout constraintLayout = c2Var.f34819w;
                    constraintLayout.getClass();
                    constraintLayout.setVisibility(8);
                } else if (!this.f289c) {
                    c2Var.f34818v.clearAnimation();
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, d70.b.a(52));
                    translateAnimation.setDuration(300L);
                    translateAnimation.setAnimationListener(new c70.a(new dn.a(fVar, 3), new dn.a(fVar, 4)));
                    new Handler(Looper.getMainLooper()).postDelayed(new dn.b(fVar, translateAnimation, 3), 500L);
                } else if (fVar.f15005m != null) {
                    fVar.b(false);
                }
                break;
        }
        return Unit.f26487a;
    }
}
