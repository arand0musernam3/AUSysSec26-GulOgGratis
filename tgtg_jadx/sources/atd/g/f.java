package atd.g;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f4838b;

    public /* synthetic */ f(Application application, int i11) {
        this.f4837a = i11;
        this.f4838b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4837a) {
            case 0:
                return BuildConfig.getMessageVersion(this.f4838b);
            case 1:
                return BuildConfig.parseHexColorCode(this.f4838b);
            case 2:
                return BuildConfig.getHeadingTextColor(this.f4838b);
            case 3:
                return BuildConfig.ExpandableInfoCustomization(this.f4838b);
            case 4:
                return BuildConfig.requireNonEmpty(this.f4838b);
            case 5:
                return BuildConfig.getHeadingTextFontSize(this.f4838b);
            case 6:
                return BuildConfig.setHeadingTextColor(this.f4838b);
            case 7:
                return BuildConfig.setHeadingTextFontName(this.f4838b);
            case 8:
                return BuildConfig.setHeadingTextFontSize(this.f4838b);
            case 9:
                return BuildConfig.getHeadingTextFontName(this.f4838b);
            case 10:
                return BuildConfig.Customization(this.f4838b);
            case 11:
                return BuildConfig.getTextColor(this.f4838b);
            case 12:
                return BuildConfig.setTextFontSize(this.f4838b);
            case 13:
                return BuildConfig.getTextFontSize(this.f4838b);
            case 14:
                return BuildConfig.setTextColor(this.f4838b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BuildConfig.setTextFontName(this.f4838b);
            case 16:
                return BuildConfig.getTextFontName(this.f4838b);
            case 17:
                return BuildConfig.requireHexColorCode(this.f4838b);
            case 18:
                return BuildConfig.requireNonNegative(this.f4838b);
            case 19:
                return BuildConfig.setExpandableInfoCustomization(this.f4838b);
            case 20:
                return BuildConfig.getExpandableInfoCustomization(this.f4838b);
            case 21:
                return BuildConfig.getOrCreateButtonCustomization(this.f4838b);
            case 22:
                return BuildConfig.setTintColor(this.f4838b);
            default:
                return BuildConfig.getOrCreateCustomization(this.f4838b);
        }
    }
}
