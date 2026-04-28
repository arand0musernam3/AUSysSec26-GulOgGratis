package pg;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.customview.DiscoverLocationView;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35015a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f35016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f35017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f35018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f35019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f35020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f35021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f35022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f35023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f35024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f35025k;
    public final View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f35026m;

    public o0(MotionLayout motionLayout, TextView textView, TextView textView2, ImageButton imageButton, LinearLayout linearLayout, ImageView imageView, ImageButton imageButton2, MotionLayout motionLayout2, RecyclerView recyclerView, ConstraintLayout constraintLayout, TextView textView3, TextView textView4) {
        this.f35018d = motionLayout;
        this.f35019e = textView;
        this.f35020f = textView2;
        this.f35021g = imageButton;
        this.f35022h = linearLayout;
        this.f35023i = imageView;
        this.f35024j = imageButton2;
        this.f35025k = motionLayout2;
        this.f35016b = recyclerView;
        this.f35017c = constraintLayout;
        this.l = textView3;
        this.f35026m = textView4;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f35015a) {
            case 0:
                return this.f35017c;
            default:
                return (MotionLayout) this.f35018d;
        }
    }

    public o0(ConstraintLayout constraintLayout, RecyclerView recyclerView, ComposeView composeView, DiscoverSheetView discoverSheetView, GenericErrorView genericErrorView, TGTGLoadingView tGTGLoadingView, DiscoverLocationView discoverLocationView, NewLocationPicker newLocationPicker, b1 b1Var, ComposeView composeView2, FrameLayout frameLayout, v vVar) {
        this.f35017c = constraintLayout;
        this.f35016b = recyclerView;
        this.f35018d = composeView;
        this.f35020f = discoverSheetView;
        this.f35021g = genericErrorView;
        this.f35022h = tGTGLoadingView;
        this.f35023i = discoverLocationView;
        this.f35024j = newLocationPicker;
        this.f35025k = b1Var;
        this.f35019e = composeView2;
        this.l = frameLayout;
        this.f35026m = vVar;
    }
}
