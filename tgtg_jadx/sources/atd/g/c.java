package atd.g;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f4833b;

    public /* synthetic */ c(Application application, int i11) {
        this.f4832a = i11;
        this.f4833b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4832a) {
            case 0:
                return BuildConfig.setInputLabelTextFontSize(this.f4833b);
            case 1:
                return BuildConfig.setInputLabelTextColor(this.f4833b);
            case 2:
                return BuildConfig.getInputLabelTextFontSize(this.f4833b);
            case 3:
                return BuildConfig.setInputLabelTextFontName(this.f4833b);
            case 4:
                return BuildConfig.getInputLabelTextFontName(this.f4833b);
            case 5:
                return BuildConfig.getSelectionIndicatorTintColor(this.f4833b);
            case 6:
                return BuildConfig.setStatusBarColor(this.f4833b);
            case 7:
                return BuildConfig.SelectionItemCustomization(this.f4833b);
            case 8:
                return BuildConfig.getExpandedStateIndicatorColor(this.f4833b);
            case 9:
                return BuildConfig.getBorderWidth(this.f4833b);
            case 10:
                return BuildConfig.setBorderWidth(this.f4833b);
            case 11:
                return BuildConfig.getBorderColor(this.f4833b);
            case 12:
                return BuildConfig.setHighlightedBackgroundColor(this.f4833b);
            case 13:
                return BuildConfig.getHighlightedBackgroundColor(this.f4833b);
            case 14:
                return BuildConfig.LabelCustomization(this.f4833b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BuildConfig.getInputLabelTextColor(this.f4833b);
            case 16:
                return BuildConfig.setExpandStateIndicatorColor(this.f4833b);
            case 17:
                return BuildConfig.setBackgroundColor(this.f4833b);
            case 18:
                return BuildConfig.getBackgroundColor(this.f4833b);
            case 19:
                return BuildConfig.valueOf(this.f4833b);
            case 20:
                return BuildConfig.parseTypeface(this.f4833b);
            case 21:
                return BuildConfig.setCornerRadius(this.f4833b);
            case 22:
                return BuildConfig.UiCustomizationButtonType(this.f4833b);
            case 23:
                return BuildConfig.ScreenCustomization(this.f4833b);
            case 24:
                return BuildConfig.getButtonText(this.f4833b);
            case 25:
                return BuildConfig.UiCustomization(this.f4833b);
            case 26:
                return BuildConfig.getButtonCustomization(this.f4833b);
            case 27:
                return BuildConfig.getToolbarCustomization(this.f4833b);
            case 28:
                return BuildConfig.setScreenCustomization(this.f4833b);
            default:
                return BuildConfig.setButtonCustomization(this.f4833b);
        }
    }
}
