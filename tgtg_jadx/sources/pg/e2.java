package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f34844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f34845c;

    public e2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f34843a = constraintLayout;
        this.f34844b = imageView;
        this.f34845c = textView;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f34843a;
    }
}
