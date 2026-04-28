package pg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliveryCategoryCarousel;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliverySortingBottomSheet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 extends a8.k {
    public static final /* synthetic */ int N = 0;
    public final GenericErrorView A;
    public final ImageView B;
    public final RecyclerView C;
    public final ProgressBar D;
    public final ConstraintLayout E;
    public final ImageView F;
    public final LinearLayout G;
    public final ImageButton H;
    public final ConstraintLayout I;
    public final DeliverySortingBottomSheet J;
    public final SwipeRefreshLayout K;
    public final TextView L;
    public final TextView M;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f34815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f34816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f34817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f34818v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f34819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f34820x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f34821y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DeliveryCategoryCarousel f34822z;

    public c2(a8.b bVar, View view, TextView textView, ConstraintLayout constraintLayout, TextView textView2, LinearLayout linearLayout, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, DeliveryCategoryCarousel deliveryCategoryCarousel, GenericErrorView genericErrorView, ImageView imageView, RecyclerView recyclerView, ProgressBar progressBar, ConstraintLayout constraintLayout3, ImageView imageView2, LinearLayout linearLayout2, ImageButton imageButton, ConstraintLayout constraintLayout4, DeliverySortingBottomSheet deliverySortingBottomSheet, SwipeRefreshLayout swipeRefreshLayout, TextView textView5, TextView textView6) {
        super(0, view, bVar);
        this.f34815s = textView;
        this.f34816t = constraintLayout;
        this.f34817u = textView2;
        this.f34818v = linearLayout;
        this.f34819w = constraintLayout2;
        this.f34820x = textView3;
        this.f34821y = textView4;
        this.f34822z = deliveryCategoryCarousel;
        this.A = genericErrorView;
        this.B = imageView;
        this.C = recyclerView;
        this.D = progressBar;
        this.E = constraintLayout3;
        this.F = imageView2;
        this.G = linearLayout2;
        this.H = imageButton;
        this.I = constraintLayout4;
        this.J = deliverySortingBottomSheet;
        this.K = swipeRefreshLayout;
        this.L = textView5;
        this.M = textView6;
    }
}
