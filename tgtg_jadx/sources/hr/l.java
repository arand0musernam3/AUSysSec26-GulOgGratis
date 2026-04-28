package hr;

import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f22453b;

    public /* synthetic */ l(SettingsActivity settingsActivity, int i11) {
        this.f22452a = i11;
        this.f22453b = settingsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22452a) {
            case 0:
                return this.f22453b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f22453b.getViewModelStore();
            default:
                return this.f22453b.getDefaultViewModelCreationExtras();
        }
    }
}
