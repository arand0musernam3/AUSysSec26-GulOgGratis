package pg;

import android.view.View;
import android.webkit.WebView;
import com.app.tgtg.customview.TGTGLoadingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n2 extends a8.k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f35012u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TGTGLoadingView f35013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WebView f35014t;

    public n2(a8.b bVar, View view, TGTGLoadingView tGTGLoadingView, WebView webView) {
        super(0, view, bVar);
        this.f35013s = tGTGLoadingView;
        this.f35014t = webView;
    }
}
