package uq;

import com.app.tgtg.feature.tabprofile.impact.co2esaved.Co2eSavedActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Co2eSavedActivity f41494b;

    public /* synthetic */ b(Co2eSavedActivity co2eSavedActivity, int i11) {
        this.f41493a = i11;
        this.f41494b = co2eSavedActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41493a) {
            case 0:
                return this.f41494b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f41494b.getViewModelStore();
            default:
                return this.f41494b.getDefaultViewModelCreationExtras();
        }
    }
}
