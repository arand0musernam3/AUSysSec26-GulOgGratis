package h7;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f21568e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u8.a f21569f = new u8.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f21570g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f21571h = new AccelerateInterpolator(1.5f);

    public static void f(View view, o1 o1Var) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackJ = j(view);
        if (windowInsetsAnimationCompat$CallbackJ != null) {
            windowInsetsAnimationCompat$CallbackJ.b(o1Var);
            if (windowInsetsAnimationCompat$CallbackJ.a() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                f(viewGroup.getChildAt(i11), o1Var);
            }
        }
    }

    public static void g(View view, o1 o1Var, WindowInsetsCompat windowInsetsCompat, boolean z11) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackJ = j(view);
        if (windowInsetsAnimationCompat$CallbackJ != null) {
            windowInsetsAnimationCompat$CallbackJ.f2738a = windowInsetsCompat;
            if (!z11) {
                windowInsetsAnimationCompat$CallbackJ.c(o1Var);
                z11 = windowInsetsAnimationCompat$CallbackJ.a() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), o1Var, windowInsetsCompat, z11);
            }
        }
    }

    public static void h(View view, WindowInsetsCompat windowInsetsCompat, List list) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackJ = j(view);
        if (windowInsetsAnimationCompat$CallbackJ != null) {
            windowInsetsCompat = windowInsetsAnimationCompat$CallbackJ.d(windowInsetsCompat, list);
            if (windowInsetsAnimationCompat$CallbackJ.a() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), windowInsetsCompat, list);
            }
        }
    }

    public static void i(View view, o1 o1Var, f1 f1Var) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackJ = j(view);
        if (windowInsetsAnimationCompat$CallbackJ != null) {
            windowInsetsAnimationCompat$CallbackJ.e(o1Var, f1Var);
            if (windowInsetsAnimationCompat$CallbackJ.a() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                i(viewGroup.getChildAt(i11), o1Var, f1Var);
            }
        }
    }

    public static WindowInsetsAnimationCompat$Callback j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof i1) {
            return ((i1) tag).f21564a;
        }
        return null;
    }
}
