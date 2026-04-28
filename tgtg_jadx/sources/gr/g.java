package gr;

import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackingConsentActivity f20815b;

    public /* synthetic */ g(TrackingConsentActivity trackingConsentActivity, int i11) {
        this.f20814a = i11;
        this.f20815b = trackingConsentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20814a) {
            case 0:
                return this.f20815b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f20815b.getViewModelStore();
            default:
                return this.f20815b.getDefaultViewModelCreationExtras();
        }
    }
}
