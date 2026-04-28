package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f35178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f35179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f35180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f35181e;

    public /* synthetic */ u(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, int i11) {
        this.f35177a = i11;
        this.f35178b = constraintLayout;
        this.f35179c = imageView;
        this.f35180d = textView;
        this.f35181e = textView2;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f35177a) {
        }
        return this.f35178b;
    }
}
