package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f34855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f34856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f34857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f34858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f34859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f34860f;

    public f1(LinearLayout linearLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView) {
        this.f34855a = linearLayout;
        this.f34856b = constraintLayout;
        this.f34857c = imageView;
        this.f34858d = imageView2;
        this.f34859e = imageView3;
        this.f34860f = textView;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f34855a;
    }
}
