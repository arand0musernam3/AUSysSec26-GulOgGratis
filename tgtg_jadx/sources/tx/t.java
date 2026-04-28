package tx;

import android.R;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.appsflyer.attribution.RequestError;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum t {
    Unknown(-1),
    Core(0),
    AppEvents(65536),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    ProtectedMode(66564),
    MACARuleMatching(66565),
    BlocklistEvents(66566),
    FilterRedactedEvents(66567),
    FilterSensitiveParams(66568),
    StdParamEnforcement(R.attr.trimPathEnd),
    BannedParamFiltering(R.attr.trimPathOffset),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    IapLoggingLib5To7(67330),
    AndroidManualImplicitPurchaseDedupe(67331),
    AndroidManualImplicitSubsDedupe(67332),
    AndroidIAPSubscriptionAutoLogging(67333),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    Megatron(262144),
    Elora(327680),
    GPSARATriggers(393216),
    GPSPACAProcessing(458752),
    GPSTopicsObservation(524288),
    ReferrerForDeepLink(589824),
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    Share(33554432);


    @NotNull
    public static final r Companion = new r();
    private final int code;

    t(int i11) {
        this.code = i11;
    }

    public final t c() {
        int i11 = this.code;
        if ((i11 & 255) > 0) {
            Companion.getClass();
            return r.a(i11 & (-256));
        }
        if ((65280 & i11) > 0) {
            Companion.getClass();
            return r.a(i11 & (-65536));
        }
        if ((16711680 & i11) <= 0) {
            Companion.getClass();
            return r.a(0);
        }
        r rVar = Companion;
        int i12 = i11 & RoundCornerImageView.DEFAULT_STROKE_COLOR;
        rVar.getClass();
        return r.a(i12);
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (s.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "RestrictiveDataFiltering";
            case 5:
                return "Instrument";
            case 6:
                return "CrashReport";
            case 7:
                return "CrashShield";
            case 8:
                return "ThreadCheck";
            case 9:
                return "ErrorReport";
            case 10:
                return "AnrReport";
            case 11:
                return "AAM";
            case 12:
                return "AppEventsCloudbridge";
            case 13:
                return "PrivacyProtection";
            case 14:
                return "SuggestedEvents";
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return "IntelligentIntegrity";
            case 16:
                return "StdParamEnforcement";
            case 17:
                return "ProtectedMode";
            case 18:
                return "BannedParamFiltering";
            case 19:
                return "MACARuleMatching";
            case 20:
                return "BlocklistEvents";
            case 21:
                return "FilterRedactedEvents";
            case 22:
                return "FilterSensitiveParams";
            case 23:
                return "ModelRequest";
            case 24:
                return "EventDeactivation";
            case 25:
                return "OnDeviceEventProcessing";
            case 26:
                return "OnDevicePostInstallEventProcessing";
            case 27:
                return "IAPLogging";
            case 28:
                return "IAPLoggingLib2";
            case 29:
                return "IAPLoggingLib5To7";
            case 30:
                return "AndroidManualImplicitPurchaseDedupe";
            case BERTags.DATE /* 31 */:
                return "AndroidManualImplicitSubsDedupe";
            case 32:
                return "AndroidIAPSubscriptionAutoLogging";
            case 33:
                return "Monitoring";
            case BERTags.DURATION /* 34 */:
                return "Megatron";
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                return "Elora";
            case 36:
                return "GPSARATriggers";
            case 37:
                return "GPSPACAProcessing";
            case 38:
                return "GPSTopicsObservation";
            case 39:
                return "ReferrerForDeepLink";
            case 40:
                return "ServiceUpdateCompliance";
            case RequestError.NO_DEV_KEY /* 41 */:
                return "LoginKit";
            case 42:
                return "ChromeCustomTabsPrefetching";
            case 43:
                return "IgnoreAppSwitchToLoggedOut";
            case 44:
                return "BypassAppSwitch";
            case 45:
                return "ShareKit";
            default:
                return PaymentMethodTypes.UNKNOWN;
        }
    }
}
