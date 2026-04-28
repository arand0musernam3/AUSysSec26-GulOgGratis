package com.adyen.checkout.googlepay;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "LIGHT", "DARK", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayButtonTheme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GooglePayButtonTheme[] $VALUES;
    private final int value;
    public static final GooglePayButtonTheme LIGHT = new GooglePayButtonTheme("LIGHT", 0, 2);
    public static final GooglePayButtonTheme DARK = new GooglePayButtonTheme("DARK", 1, 1);

    private static final /* synthetic */ GooglePayButtonTheme[] $values() {
        return new GooglePayButtonTheme[]{LIGHT, DARK};
    }

    static {
        GooglePayButtonTheme[] googlePayButtonThemeArr$values = $values();
        $VALUES = googlePayButtonThemeArr$values;
        $ENTRIES = n.w(googlePayButtonThemeArr$values);
    }

    private GooglePayButtonTheme(String str, int i11, int i12) {
        this.value = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GooglePayButtonTheme valueOf(String str) {
        return (GooglePayButtonTheme) Enum.valueOf(GooglePayButtonTheme.class, str);
    }

    public static GooglePayButtonTheme[] values() {
        return (GooglePayButtonTheme[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
