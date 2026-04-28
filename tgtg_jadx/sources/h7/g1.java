package h7;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsCompat;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f21541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsCompat f21542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsCompat f21543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f21545e;

    public g1(o1 o1Var, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i11, View view) {
        this.f21541a = o1Var;
        this.f21542b = windowInsetsCompat;
        this.f21543c = windowInsetsCompat2;
        this.f21544d = i11;
        this.f21545e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        o1 o1Var = this.f21541a;
        n1 n1Var = o1Var.f21602a;
        n1Var.e(animatedFraction);
        float fC = n1Var.c();
        PathInterpolator pathInterpolator = j1.f21568e;
        int i11 = Build.VERSION.SDK_INT;
        WindowInsetsCompat windowInsetsCompat = this.f21542b;
        x1 w1Var = i11 >= 36 ? new w1(windowInsetsCompat) : i11 >= 35 ? new v1(windowInsetsCompat) : i11 >= 34 ? new u1(windowInsetsCompat) : i11 >= 31 ? new t1(windowInsetsCompat) : i11 >= 30 ? new s1(windowInsetsCompat) : i11 >= 29 ? new r1(windowInsetsCompat) : new p1(windowInsetsCompat);
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((this.f21544d & i12) == 0) {
                w1Var.d(i12, windowInsetsCompat.e(i12));
            } else {
                x6.d dVarE = windowInsetsCompat.e(i12);
                x6.d dVarE2 = this.f21543c.e(i12);
                float f11 = 1.0f - fC;
                w1Var.d(i12, WindowInsetsCompat.p(dVarE, (int) (((double) ((dVarE.f43873a - dVarE2.f43873a) * f11)) + 0.5d), (int) (((double) ((dVarE.f43874b - dVarE2.f43874b) * f11)) + 0.5d), (int) (((double) ((dVarE.f43875c - dVarE2.f43875c) * f11)) + 0.5d), (int) (((double) ((dVarE.f43876d - dVarE2.f43876d) * f11)) + 0.5d)));
            }
        }
        j1.h(this.f21545e, w1Var.b(), Collections.singletonList(o1Var));
    }
}
