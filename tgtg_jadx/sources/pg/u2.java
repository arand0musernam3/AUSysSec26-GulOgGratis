package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u2 extends a8.k {
    public static final /* synthetic */ int J = 0;
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final RelativeLayout D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final LinearLayout H;
    public final TextView I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CardView f35192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j1 f35193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f35194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f35195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f35196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f35197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f35198y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f35199z;

    public u2(a8.b bVar, View view, ImageView imageView, CardView cardView, j1 j1Var, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, ConstraintLayout constraintLayout, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2, TextView textView4) {
        super(0, view, bVar);
        this.f35192s = cardView;
        this.f35193t = j1Var;
        this.f35194u = imageView2;
        this.f35195v = imageView3;
        this.f35196w = linearLayout;
        this.f35197x = constraintLayout;
        this.f35198y = imageView4;
        this.f35199z = imageView5;
        this.A = imageView6;
        this.B = imageView7;
        this.C = imageView8;
        this.D = relativeLayout;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
        this.H = linearLayout2;
        this.I = textView4;
    }
}
