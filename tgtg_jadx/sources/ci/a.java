package ci;

import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainCharityActivity f8162b;

    public /* synthetic */ a(MainCharityActivity mainCharityActivity, int i11) {
        this.f8161a = i11;
        this.f8162b = mainCharityActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8161a) {
            case 0:
                return this.f8162b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f8162b.getViewModelStore();
            default:
                return this.f8162b.getDefaultViewModelCreationExtras();
        }
    }
}
