package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.feature.orderview.OrderRedeemer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f35281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f35282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f35283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f35284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f35285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f35286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoordinatorLayout f35287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RelativeLayout f35288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OrderRedeemer f35289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f35290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinearLayout f35291k;
    public final TextView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f35292m;

    public y2(CoordinatorLayout coordinatorLayout, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView, LinearLayout linearLayout, ImageView imageView, CoordinatorLayout coordinatorLayout2, RelativeLayout relativeLayout, OrderRedeemer orderRedeemer, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4) {
        this.f35281a = coordinatorLayout;
        this.f35282b = lottieAnimationView;
        this.f35283c = lottieAnimationView2;
        this.f35284d = textView;
        this.f35285e = linearLayout;
        this.f35286f = imageView;
        this.f35287g = coordinatorLayout2;
        this.f35288h = relativeLayout;
        this.f35289i = orderRedeemer;
        this.f35290j = textView2;
        this.f35291k = linearLayout2;
        this.l = textView3;
        this.f35292m = textView4;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f35281a;
    }
}
