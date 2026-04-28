package zq;

import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MoneySavedActivity f48043b;

    public /* synthetic */ d(MoneySavedActivity moneySavedActivity, int i11) {
        this.f48042a = i11;
        this.f48043b = moneySavedActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48042a) {
            case 0:
                return this.f48043b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f48043b.getViewModelStore();
            default:
                return this.f48043b.getDefaultViewModelCreationExtras();
        }
    }
}
