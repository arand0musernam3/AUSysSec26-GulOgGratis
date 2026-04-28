package ih;

import com.app.tgtg.feature.badges.ui.BadgesActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BadgesActivity f23840b;

    public /* synthetic */ c(BadgesActivity badgesActivity, int i11) {
        this.f23839a = i11;
        this.f23840b = badgesActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23839a) {
            case 0:
                return this.f23840b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f23840b.getViewModelStore();
            default:
                return this.f23840b.getDefaultViewModelCreationExtras();
        }
    }
}
