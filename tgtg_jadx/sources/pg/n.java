package pg;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import com.app.tgtg.customview.TGTGLoadingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends a8.k {
    public static final /* synthetic */ int H = 0;
    public final ImageButton A;
    public final TextView B;
    public final NestedScrollView C;
    public final ImageView D;
    public final TGTGLoadingView E;
    public final p F;
    public final MotionLayout G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearLayout f35000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f35001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f35002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button f35003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f35004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinearLayout f35005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageButton f35006y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinearLayout f35007z;

    public n(a8.b bVar, View view, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, Button button, ImageView imageView2, LinearLayout linearLayout3, ImageButton imageButton, LinearLayout linearLayout4, ImageButton imageButton2, TextView textView, NestedScrollView nestedScrollView, ImageView imageView3, TGTGLoadingView tGTGLoadingView, p pVar, MotionLayout motionLayout) {
        super(0, view, bVar);
        this.f35000s = linearLayout;
        this.f35001t = linearLayout2;
        this.f35002u = imageView;
        this.f35003v = button;
        this.f35004w = imageView2;
        this.f35005x = linearLayout3;
        this.f35006y = imageButton;
        this.f35007z = linearLayout4;
        this.A = imageButton2;
        this.B = textView;
        this.C = nestedScrollView;
        this.D = imageView3;
        this.E = tGTGLoadingView;
        this.F = pVar;
        this.G = motionLayout;
    }
}
