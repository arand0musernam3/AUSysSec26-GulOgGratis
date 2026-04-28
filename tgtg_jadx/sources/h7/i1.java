package h7;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsAnimationCompat$Callback f21564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WindowInsetsCompat f21565b;

    public i1(View view, WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        WindowInsetsCompat windowInsetsCompatB;
        this.f21564a = windowInsetsAnimationCompat$Callback;
        WindowInsetsCompat windowInsetsCompatY = ViewCompat.y(view);
        if (windowInsetsCompatY != null) {
            int i11 = Build.VERSION.SDK_INT;
            windowInsetsCompatB = (i11 >= 36 ? new w1(windowInsetsCompatY) : i11 >= 35 ? new v1(windowInsetsCompatY) : i11 >= 34 ? new u1(windowInsetsCompatY) : i11 >= 31 ? new t1(windowInsetsCompatY) : i11 >= 30 ? new s1(windowInsetsCompatY) : i11 >= 29 ? new r1(windowInsetsCompatY) : new p1(windowInsetsCompatY)).b();
        } else {
            windowInsetsCompatB = null;
        }
        this.f21565b = windowInsetsCompatB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (view.isLaidOut()) {
            WindowInsetsCompat windowInsetsCompatW = WindowInsetsCompat.w(windowInsets, view);
            if (this.f21565b == null) {
                this.f21565b = ViewCompat.y(view);
            }
            if (this.f21565b == null) {
                this.f21565b = windowInsetsCompatW;
                if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackJ = j1.j(view);
                if (windowInsetsAnimationCompat$CallbackJ == null || !Objects.equals(windowInsetsAnimationCompat$CallbackJ.f2738a, windowInsetsCompatW)) {
                    int[] iArr = new int[1];
                    int[] iArr2 = new int[1];
                    WindowInsetsCompat windowInsetsCompat = this.f21565b;
                    for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                        x6.d dVarE = windowInsetsCompatW.e(i11);
                        x6.d dVarE2 = windowInsetsCompat.e(i11);
                        int i12 = dVarE.f43873a;
                        int i13 = dVarE2.f43873a;
                        boolean z11 = i12 > i13 || dVarE.f43874b > dVarE2.f43874b || dVarE.f43875c > dVarE2.f43875c || dVarE.f43876d > dVarE2.f43876d;
                        if (z11 != (i12 < i13 || dVarE.f43874b < dVarE2.f43874b || dVarE.f43875c < dVarE2.f43875c || dVarE.f43876d < dVarE2.f43876d)) {
                            if (z11) {
                                iArr[0] = iArr[0] | i11;
                            } else {
                                iArr2[0] = iArr2[0] | i11;
                            }
                        }
                    }
                    int i14 = iArr[0];
                    int i15 = iArr2[0];
                    int i16 = i14 | i15;
                    if (i16 == 0) {
                        this.f21565b = windowInsetsCompatW;
                        if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                            return view.onApplyWindowInsets(windowInsets);
                        }
                    } else {
                        WindowInsetsCompat windowInsetsCompat2 = this.f21565b;
                        o1 o1Var = new o1(i16, (h2.c() & i14) != 0 ? j1.f21568e : (h2.c() & i15) != 0 ? j1.f21569f : (i14 & h2.h()) != 0 ? j1.f21570g : (h2.h() & i15) != 0 ? j1.f21571h : null, (h2.c() & i16) != 0 ? 160L : 250L);
                        o1Var.f21602a.e(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o1Var.f21602a.b());
                        x6.d dVarE3 = windowInsetsCompatW.e(i16);
                        x6.d dVarE4 = windowInsetsCompat2.e(i16);
                        f1 f1Var = new f1(x6.d.b(Math.min(dVarE3.f43873a, dVarE4.f43873a), Math.min(dVarE3.f43874b, dVarE4.f43874b), Math.min(dVarE3.f43875c, dVarE4.f43875c), Math.min(dVarE3.f43876d, dVarE4.f43876d)), x6.d.b(Math.max(dVarE3.f43873a, dVarE4.f43873a), Math.max(dVarE3.f43874b, dVarE4.f43874b), Math.max(dVarE3.f43875c, dVarE4.f43875c), Math.max(dVarE3.f43876d, dVarE4.f43876d)));
                        j1.g(view, o1Var, windowInsetsCompatW, false);
                        duration.addUpdateListener(new g1(o1Var, windowInsetsCompatW, windowInsetsCompat2, i16, view));
                        duration.addListener(new h20.b(1, o1Var, view));
                        y.a(view, new h1(0, view, o1Var, f1Var, duration));
                        this.f21565b = windowInsetsCompatW;
                        if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                            return view.onApplyWindowInsets(windowInsets);
                        }
                    }
                } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            }
        } else {
            this.f21565b = WindowInsetsCompat.w(windowInsets, view);
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
