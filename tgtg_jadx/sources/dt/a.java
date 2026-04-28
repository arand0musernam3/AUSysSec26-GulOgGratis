package dt;

import com.app.tgtg.feature.webview.ui.WebViewActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f15168b;

    public /* synthetic */ a(WebViewActivity webViewActivity, int i11) {
        this.f15167a = i11;
        this.f15168b = webViewActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15167a) {
            case 0:
                return this.f15168b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f15168b.getViewModelStore();
            default:
                return this.f15168b.getDefaultViewModelCreationExtras();
        }
    }
}
