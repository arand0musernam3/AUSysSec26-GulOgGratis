package com.adyen.checkout.core;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/core/AdyenLogLevel;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT", "NONE", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AdyenLogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdyenLogLevel[] $VALUES;
    private final int priority;
    public static final AdyenLogLevel VERBOSE = new AdyenLogLevel("VERBOSE", 0, 2);
    public static final AdyenLogLevel DEBUG = new AdyenLogLevel("DEBUG", 1, 3);
    public static final AdyenLogLevel INFO = new AdyenLogLevel("INFO", 2, 4);
    public static final AdyenLogLevel WARN = new AdyenLogLevel("WARN", 3, 5);
    public static final AdyenLogLevel ERROR = new AdyenLogLevel("ERROR", 4, 6);
    public static final AdyenLogLevel ASSERT = new AdyenLogLevel("ASSERT", 5, 7);
    public static final AdyenLogLevel NONE = new AdyenLogLevel("NONE", 6, 100);

    private static final /* synthetic */ AdyenLogLevel[] $values() {
        return new AdyenLogLevel[]{VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT, NONE};
    }

    static {
        AdyenLogLevel[] adyenLogLevelArr$values = $values();
        $VALUES = adyenLogLevelArr$values;
        $ENTRIES = n.w(adyenLogLevelArr$values);
    }

    private AdyenLogLevel(String str, int i11, int i12) {
        this.priority = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AdyenLogLevel valueOf(String str) {
        return (AdyenLogLevel) Enum.valueOf(AdyenLogLevel.class, str);
    }

    public static AdyenLogLevel[] values() {
        return (AdyenLogLevel[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
