package cr;

import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegalActivity f13421b;

    public /* synthetic */ c(LegalActivity legalActivity, int i11) {
        this.f13420a = i11;
        this.f13421b = legalActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13420a) {
            case 0:
                return this.f13421b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f13421b.getViewModelStore();
            default:
                return this.f13421b.getDefaultViewModelCreationExtras();
        }
    }
}
