package pg;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f35277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f35278c;

    public y0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.f35276a = constraintLayout;
        this.f35277b = imageView;
        this.f35278c = imageView2;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f35276a;
    }
}
