package com.adyen.checkout.components.core.internal.analytics;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsPlatform;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANDROID", "FLUTTER", "REACT_NATIVE", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnalyticsPlatform {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnalyticsPlatform[] $VALUES;
    public static final AnalyticsPlatform ANDROID = new AnalyticsPlatform("ANDROID", 0, AnalyticsPlatformParams.channel);
    public static final AnalyticsPlatform FLUTTER = new AnalyticsPlatform("FLUTTER", 1, "flutter");
    public static final AnalyticsPlatform REACT_NATIVE = new AnalyticsPlatform("REACT_NATIVE", 2, "react-native");

    @NotNull
    private final String value;

    private static final /* synthetic */ AnalyticsPlatform[] $values() {
        return new AnalyticsPlatform[]{ANDROID, FLUTTER, REACT_NATIVE};
    }

    static {
        AnalyticsPlatform[] analyticsPlatformArr$values = $values();
        $VALUES = analyticsPlatformArr$values;
        $ENTRIES = n.w(analyticsPlatformArr$values);
    }

    private AnalyticsPlatform(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsPlatform valueOf(String str) {
        return (AnalyticsPlatform) Enum.valueOf(AnalyticsPlatform.class, str);
    }

    public static AnalyticsPlatform[] values() {
        return (AnalyticsPlatform[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
