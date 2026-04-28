package dn;

import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14982b;

    public /* synthetic */ a(f fVar, int i11) {
        this.f14981a = i11;
        this.f14982b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Animation animation = (Animation) obj;
        switch (this.f14981a) {
            case 0:
                animation.getClass();
                f fVar = this.f14982b;
                ConstraintLayout constraintLayout = fVar.f14994a.f34816t;
                constraintLayout.getClass();
                constraintLayout.setVisibility(0);
                fVar.h(true);
                break;
            case 1:
                animation.getClass();
                this.f14982b.e();
                break;
            case 2:
                animation.getClass();
                f fVar2 = this.f14982b;
                fVar2.f15006n = true;
                ConstraintLayout constraintLayout2 = fVar2.f14994a.f34819w;
                constraintLayout2.getClass();
                constraintLayout2.setVisibility(0);
                fVar2.h(true);
                break;
            case 3:
                animation.getClass();
                ConstraintLayout constraintLayout3 = this.f14982b.f14994a.f34816t;
                constraintLayout3.getClass();
                constraintLayout3.setVisibility(0);
                break;
            default:
                animation.getClass();
                f fVar3 = this.f14982b;
                fVar3.f15006n = false;
                ConstraintLayout constraintLayout4 = fVar3.f14994a.f34816t;
                constraintLayout4.getClass();
                constraintLayout4.setVisibility(8);
                fVar3.h(false);
                break;
        }
        return Unit.f26487a;
    }
}
