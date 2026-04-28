package g20;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f18289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f18291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f18292k;
    public float[] l;

    public i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f18288g = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.f18289h = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.f18275b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new androidx.vectordrawable.graphics.drawable.e(view, 5));
        return animatorSet;
    }

    public final float[] c() {
        float[] fArr;
        View view;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        if (this.l == null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = (view = this.f18275b).getRootWindowInsets()) == null) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                int i11 = displayMetrics.widthPixels;
                int i12 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                int radius = (i13 == 0 && i14 == 0 && (roundedCorner4 = rootWindowInsets.getRoundedCorner(0)) != null) ? roundedCorner4.getRadius() : 0;
                int i15 = width + i13;
                int radius2 = (i15 < i11 || i14 != 0 || (roundedCorner3 = rootWindowInsets.getRoundedCorner(1)) == null) ? 0 : roundedCorner3.getRadius();
                int radius3 = (i15 < i11 || i14 + height < i12 || (roundedCorner2 = rootWindowInsets.getRoundedCorner(2)) == null) ? 0 : roundedCorner2.getRadius();
                int radius4 = (i13 != 0 || i14 + height < i12 || (roundedCorner = rootWindowInsets.getRoundedCorner(3)) == null) ? 0 : roundedCorner.getRadius();
                float f11 = radius;
                float f12 = radius2;
                float f13 = radius3;
                float f14 = radius4;
                fArr = new float[]{f11, f11, f12, f12, f13, f13, f14, f14};
            }
            this.l = fArr;
        }
        return this.l;
    }
}
