package tf;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANALYTICS_SDK;
    public static final a DIAGNOSTICS;
    public static final a SESSION_REPLAY_PRIVACY_CONFIG;
    public static final a SESSION_REPLAY_SAMPLING_CONFIG;

    @NotNull
    private final String value;

    static {
        a aVar = new a("ANALYTICS_SDK", 0, "analyticsSDK.androidSDK");
        ANALYTICS_SDK = aVar;
        a aVar2 = new a("DIAGNOSTICS", 1, "diagnostics.androidSDK");
        DIAGNOSTICS = aVar2;
        a aVar3 = new a("SESSION_REPLAY_PRIVACY_CONFIG", 2, "sessionReplay.sr_android_privacy_config");
        SESSION_REPLAY_PRIVACY_CONFIG = aVar3;
        a aVar4 = new a("SESSION_REPLAY_SAMPLING_CONFIG", 3, "sessionReplay.sr_android_sampling_config");
        SESSION_REPLAY_SAMPLING_CONFIG = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = new a80.b(aVarArr);
    }

    public a(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String c() {
        return this.value;
    }
}
