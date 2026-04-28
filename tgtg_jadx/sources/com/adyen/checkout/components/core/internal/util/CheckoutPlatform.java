package com.adyen.checkout.components.core.internal.util;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/CheckoutPlatform;", "", "(Ljava/lang/String;I)V", "ANDROID", "FLUTTER", "REACT_NATIVE", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckoutPlatform {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CheckoutPlatform[] $VALUES;
    public static final CheckoutPlatform ANDROID = new CheckoutPlatform("ANDROID", 0);
    public static final CheckoutPlatform FLUTTER = new CheckoutPlatform("FLUTTER", 1);
    public static final CheckoutPlatform REACT_NATIVE = new CheckoutPlatform("REACT_NATIVE", 2);

    private static final /* synthetic */ CheckoutPlatform[] $values() {
        return new CheckoutPlatform[]{ANDROID, FLUTTER, REACT_NATIVE};
    }

    static {
        CheckoutPlatform[] checkoutPlatformArr$values = $values();
        $VALUES = checkoutPlatformArr$values;
        $ENTRIES = n.w(checkoutPlatformArr$values);
    }

    private CheckoutPlatform(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CheckoutPlatform valueOf(String str) {
        return (CheckoutPlatform) Enum.valueOf(CheckoutPlatform.class, str);
    }

    public static CheckoutPlatform[] values() {
        return (CheckoutPlatform[]) $VALUES.clone();
    }
}
