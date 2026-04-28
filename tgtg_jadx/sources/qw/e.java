package qw;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.Gender;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37284b;

    public /* synthetic */ e(String str, int i11) {
        this.f37283a = i11;
        this.f37284b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37283a) {
            case 0:
                return com.braze.triggers.managers.b.d(this.f37284b);
            case 1:
                return com.braze.triggers.managers.b.b(this.f37284b);
            case 2:
                return com.braze.triggers.managers.b.a(this.f37284b);
            case 3:
                return com.braze.triggers.managers.b.c(this.f37284b);
            case 4:
                return com.braze.triggers.managers.f.a(this.f37284b);
            case 5:
                return com.braze.triggers.managers.h.c(this.f37284b);
            case 6:
                return com.braze.triggers.managers.h.a(this.f37284b);
            case 7:
                return com.braze.triggers.managers.h.b(this.f37284b);
            case 8:
                return BrazeConfigurationProvider._get_applicationIconResourceId_$lambda$12(this.f37284b);
            case 9:
                return com.braze.configuration.e.a(this.f37284b);
            case 10:
                return com.braze.configuration.e.c(this.f37284b);
            case 11:
                return com.braze.triggers.utils.c.a(this.f37284b);
            case 12:
                return com.braze.triggers.utils.c.c(this.f37284b);
            case 13:
                return com.braze.triggers.utils.c.b(this.f37284b);
            case 14:
                return UriAction.getWebViewActivityIntent$lambda$7(this.f37284b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return UriAction.getIntentArrayWithConfiguredBackStack$lambda$10(this.f37284b);
            case 16:
                return UriAction.getIntentArrayWithConfiguredBackStack$lambda$12(this.f37284b);
            case 17:
                return BrazeActionParser.getBrazeActionVersionAndJson$lambda$8(this.f37284b);
            case 18:
                return BrazeActionParser.execute$lambda$2(this.f37284b);
            case 19:
                return DelayedInitializationAnalyticsBehavior.Companion.fromString$lambda$1(this.f37284b);
            case 20:
                return Gender.Companion.getGender$lambda$1(this.f37284b);
            case 21:
                return com.braze.enums.b.b(this.f37284b);
            case 22:
                return DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$3(this.f37284b);
            case 23:
                return DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$19$lambda$17(this.f37284b);
            case 24:
                return DefaultBrazeImageLoader.renderUrlIntoView$lambda$2(this.f37284b);
            case 25:
                return DefaultBrazeImageLoader.getBitmapFromUrl$lambda$11(this.f37284b);
            case 26:
                return DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$19$lambda$18(this.f37284b);
            case 27:
                return DefaultBrazeImageLoader.getBitmapFromCache$lambda$15$lambda$14(this.f37284b);
            case 28:
                return DefaultBrazeImageLoader.getBitmapFromCache$lambda$16(this.f37284b);
            default:
                return DefaultBrazeImageLoader.putBitmapIntoCache$lambda$20(this.f37284b);
        }
    }
}
