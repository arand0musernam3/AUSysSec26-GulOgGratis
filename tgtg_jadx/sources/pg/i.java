package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.customview.FavoriteIconView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends a8.k {
    public static final /* synthetic */ int G = 0;
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final View D;
    public final ImageView E;
    public final TextView F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f34896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardView f34897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f34898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f34899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f34900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f34901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final FavoriteIconView f34902y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j1 f34903z;

    public i(a8.b bVar, View view, TextView textView, CardView cardView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, FavoriteIconView favoriteIconView, j1 j1Var, LinearLayout linearLayout, TextView textView5, TextView textView6, View view2, ImageView imageView, TextView textView7) {
        super(0, view, bVar);
        this.f34896s = textView;
        this.f34897t = cardView;
        this.f34898u = textView2;
        this.f34899v = constraintLayout;
        this.f34900w = textView3;
        this.f34901x = textView4;
        this.f34902y = favoriteIconView;
        this.f34903z = j1Var;
        this.A = linearLayout;
        this.B = textView5;
        this.C = textView6;
        this.D = view2;
        this.E = imageView;
        this.F = textView7;
    }
}
