package pg;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import com.app.tgtg.customview.BasketButtonRow;
import com.app.tgtg.customview.TGTGLoadingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 extends a8.k {
    public static final /* synthetic */ int J = 0;
    public final ImageButton A;
    public final LinearLayout B;
    public final ImageButton C;
    public final TextView D;
    public final NestedScrollView E;
    public final ImageView F;
    public final TGTGLoadingView G;
    public final k2 H;
    public final MotionLayout I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BasketButtonRow f34770s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f34771t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout f34772u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f34773v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f34774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Button f34775x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f34776y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinearLayout f34777z;

    public a2(a8.b bVar, View view, BasketButtonRow basketButtonRow, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, Button button, ImageView imageView2, LinearLayout linearLayout4, ImageButton imageButton, LinearLayout linearLayout5, ImageButton imageButton2, TextView textView, NestedScrollView nestedScrollView, ImageView imageView3, TGTGLoadingView tGTGLoadingView, k2 k2Var, MotionLayout motionLayout) {
        super(0, view, bVar);
        this.f34770s = basketButtonRow;
        this.f34771t = linearLayout;
        this.f34772u = linearLayout2;
        this.f34773v = linearLayout3;
        this.f34774w = imageView;
        this.f34775x = button;
        this.f34776y = imageView2;
        this.f34777z = linearLayout4;
        this.A = imageButton;
        this.B = linearLayout5;
        this.C = imageButton2;
        this.D = textView;
        this.E = nestedScrollView;
        this.F = imageView3;
        this.G = tGTGLoadingView;
        this.H = k2Var;
        this.I = motionLayout;
    }
}
