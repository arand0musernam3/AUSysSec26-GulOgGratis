package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f34766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f34767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f34768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f34769d;

    public a1(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView) {
        this.f34766a = linearLayout;
        this.f34767b = linearLayout2;
        this.f34768c = imageView;
        this.f34769d = textView;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f34766a;
    }
}
