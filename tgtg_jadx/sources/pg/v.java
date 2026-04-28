package pg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f35201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f35202c;

    public v(LinearLayout linearLayout, TextView textView) {
        this.f35200a = 2;
        this.f35202c = linearLayout;
        this.f35201b = textView;
    }

    public static v a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.signup_store_view_web, viewGroup, false);
        WebView webView = (WebView) pd.g.t(R.id.webView, viewInflate);
        if (webView != null) {
            return new v((ConstraintLayout) viewInflate, webView, 6);
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.webView)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f35200a) {
        }
        return (ConstraintLayout) this.f35201b;
    }

    public /* synthetic */ v(View view, View view2, int i11) {
        this.f35200a = i11;
        this.f35201b = view;
        this.f35202c = view2;
    }
}
