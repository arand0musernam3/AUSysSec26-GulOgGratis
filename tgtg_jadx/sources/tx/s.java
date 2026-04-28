package tx;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.Core.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.AppEvents.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.CodelessEvents.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.RestrictiveDataFiltering.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t.Instrument.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[t.CrashReport.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[t.CrashShield.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[t.ThreadCheck.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[t.ErrorReport.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[t.AnrReport.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[t.AAM.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[t.CloudBridge.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[t.PrivacyProtection.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[t.SuggestedEvents.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[t.IntelligentIntegrity.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[t.StdParamEnforcement.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[t.ProtectedMode.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[t.BannedParamFiltering.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[t.MACARuleMatching.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[t.BlocklistEvents.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[t.FilterRedactedEvents.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[t.FilterSensitiveParams.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[t.ModelRequest.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[t.EventDeactivation.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[t.OnDeviceEventProcessing.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[t.OnDevicePostInstallEventProcessing.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[t.IapLogging.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[t.IapLoggingLib2.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[t.IapLoggingLib5To7.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[t.AndroidManualImplicitPurchaseDedupe.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[t.AndroidManualImplicitSubsDedupe.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[t.AndroidIAPSubscriptionAutoLogging.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[t.Monitoring.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[t.Megatron.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[t.Elora.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[t.GPSARATriggers.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[t.GPSPACAProcessing.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[t.GPSTopicsObservation.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[t.ReferrerForDeepLink.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[t.ServiceUpdateCompliance.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[t.Login.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[t.ChromeCustomTabsPrefetching.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[t.IgnoreAppSwitchToLoggedOut.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[t.BypassAppSwitch.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[t.Share.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
