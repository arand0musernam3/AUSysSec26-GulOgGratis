package pg;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import com.app.tgtg.customview.TGTGLoadingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3 extends a8.k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f34892v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f34893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TGTGLoadingView f34894t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final WebView f34895u;

    public h3(a8.b bVar, View view, Button button, TGTGLoadingView tGTGLoadingView, WebView webView) {
        super(0, view, bVar);
        this.f34893s = button;
        this.f34894t = tGTGLoadingView;
        this.f34895u = webView;
    }
}
