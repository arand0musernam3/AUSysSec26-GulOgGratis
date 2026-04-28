package qj;

import com.app.tgtg.feature.deeplink.DeepLinkActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeepLinkActivity f37065b;

    public /* synthetic */ b(DeepLinkActivity deepLinkActivity, int i11) {
        this.f37064a = i11;
        this.f37065b = deepLinkActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37064a) {
            case 0:
                return this.f37065b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f37065b.getViewModelStore();
            case 2:
                return this.f37065b.getDefaultViewModelCreationExtras();
            case 3:
                return this.f37065b.getDefaultViewModelProviderFactory();
            case 4:
                return this.f37065b.getViewModelStore();
            default:
                return this.f37065b.getDefaultViewModelCreationExtras();
        }
    }
}
