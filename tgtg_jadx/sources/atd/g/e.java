package atd.g;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f4836b;

    public /* synthetic */ e(Application application, int i11) {
        this.f4835a = i11;
        this.f4836b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4835a) {
            case 0:
                return BuildConfig.getScreenCustomization(this.f4836b);
            case 1:
                return BuildConfig.setToolbarCustomization(this.f4836b);
            case 2:
                return BuildConfig.getTextBoxCustomization(this.f4836b);
            case 3:
                return BuildConfig.setTextBoxCustomization(this.f4836b);
            case 4:
                return BuildConfig.getStatusBarColor(this.f4836b);
            case 5:
                return BuildConfig.getLabelCustomization(this.f4836b);
            case 6:
                return BuildConfig.setLabelCustomization(this.f4836b);
            case 7:
                return BuildConfig.setSelectionItemCustomization(this.f4836b);
            case 8:
                return BuildConfig.setToolbarTitle(this.f4836b);
            case 9:
                return BuildConfig.getSelectionItemCustomization(this.f4836b);
            case 10:
                return BuildConfig.TextBoxCustomization(this.f4836b);
            case 11:
                return BuildConfig.setHeaderText(this.f4836b);
            case 12:
                return BuildConfig.ToolbarCustomization(this.f4836b);
            case 13:
                return BuildConfig.setSelectionIndicatorTintColor(this.f4836b);
            case 14:
                return BuildConfig.getHeaderText(this.f4836b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BuildConfig.describeContents(this.f4836b);
            case 16:
                return BuildConfig.writeToParcel(this.f4836b);
            case 17:
                return BuildConfig.setButtonText(this.f4836b);
            case 18:
                return BuildConfig.setScreenBackgroundColor(this.f4836b);
            case 19:
                return BuildConfig.e1(this.f4836b);
            case 20:
                return BuildConfig.SDKRuntimeException(this.f4836b);
            case 21:
                return BuildConfig.InvalidInputException(this.f4836b);
            case 22:
                return BuildConfig.SDKAlreadyInitializedException(this.f4836b);
            case 23:
                return BuildConfig.SDKNotInitializedException(this.f4836b);
            case 24:
                return BuildConfig.getSDKEphemeralPublicKey(this.f4836b);
            case 25:
                return BuildConfig.ChallengeResultCancelled(this.f4836b);
            case 26:
                return BuildConfig.getSDKReferenceNumber(this.f4836b);
            case 27:
                return BuildConfig.AuthenticationRequestParameters(this.f4836b);
            case 28:
                return BuildConfig.getSDKTransactionID(this.f4836b);
            default:
                return BuildConfig.getSDKAppID(this.f4836b);
        }
    }
}
