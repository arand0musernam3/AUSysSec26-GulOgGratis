package pg;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f34922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f34923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f34924d;

    public j1(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.f34921a = constraintLayout;
        this.f34922b = imageView;
        this.f34923c = imageView2;
        this.f34924d = imageView3;
    }

    public static j1 a(View view) {
        int i11 = R.id.iv_flash;
        if (((ImageView) pd.g.t(R.id.iv_flash, view)) != null) {
            i11 = R.id.iv_flash_disabled;
            ImageView imageView = (ImageView) pd.g.t(R.id.iv_flash_disabled, view);
            if (imageView != null) {
                i11 = R.id.iv_flash_sales_rim;
                if (((ImageView) pd.g.t(R.id.iv_flash_sales_rim, view)) != null) {
                    i11 = R.id.iv_flash_sales_rim_disabled;
                    ImageView imageView2 = (ImageView) pd.g.t(R.id.iv_flash_sales_rim_disabled, view);
                    if (imageView2 != null) {
                        i11 = R.id.iv_store_logo;
                        ImageView imageView3 = (ImageView) pd.g.t(R.id.iv_store_logo, view);
                        if (imageView3 != null) {
                            return new j1((ConstraintLayout) view, imageView, imageView2, imageView3);
                        }
                    }
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f34921a;
    }
}
