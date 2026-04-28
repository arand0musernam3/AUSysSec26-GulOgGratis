package pg;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f34876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f34877c;

    public /* synthetic */ g1(ConstraintLayout constraintLayout, TextView textView, int i11) {
        this.f34875a = i11;
        this.f34876b = constraintLayout;
        this.f34877c = textView;
    }

    public static g1 a(View view) {
        TextView textView = (TextView) pd.g.t(R.id.tvCountry, view);
        if (textView != null) {
            return new g1((ConstraintLayout) view, textView, 0);
        }
        c50.w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvCountry)));
        return null;
    }

    public static g1 b(View view) {
        TextView textView = (TextView) pd.g.t(R.id.tvDietary, view);
        if (textView != null) {
            return new g1((ConstraintLayout) view, textView, 1);
        }
        c50.w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvDietary)));
        return null;
    }

    public static g1 c(View view) {
        TextView textView = (TextView) pd.g.t(R.id.tvGender, view);
        if (textView != null) {
            return new g1((ConstraintLayout) view, textView, 2);
        }
        c50.w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvGender)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f34875a) {
        }
        return this.f34876b;
    }
}
