package com.adyen.checkout.googlepay;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayButtonType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BUY", "BOOK", "CHECKOUT", "DONATE", "ORDER", "PAY", "SUBSCRIBE", "PLAIN", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayButtonType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GooglePayButtonType[] $VALUES;
    private final int value;
    public static final GooglePayButtonType BUY = new GooglePayButtonType("BUY", 0, 1);
    public static final GooglePayButtonType BOOK = new GooglePayButtonType("BOOK", 1, 2);
    public static final GooglePayButtonType CHECKOUT = new GooglePayButtonType("CHECKOUT", 2, 3);
    public static final GooglePayButtonType DONATE = new GooglePayButtonType("DONATE", 3, 4);
    public static final GooglePayButtonType ORDER = new GooglePayButtonType("ORDER", 4, 5);
    public static final GooglePayButtonType PAY = new GooglePayButtonType("PAY", 5, 6);
    public static final GooglePayButtonType SUBSCRIBE = new GooglePayButtonType("SUBSCRIBE", 6, 7);
    public static final GooglePayButtonType PLAIN = new GooglePayButtonType("PLAIN", 7, 8);

    private static final /* synthetic */ GooglePayButtonType[] $values() {
        return new GooglePayButtonType[]{BUY, BOOK, CHECKOUT, DONATE, ORDER, PAY, SUBSCRIBE, PLAIN};
    }

    static {
        GooglePayButtonType[] googlePayButtonTypeArr$values = $values();
        $VALUES = googlePayButtonTypeArr$values;
        $ENTRIES = n.w(googlePayButtonTypeArr$values);
    }

    private GooglePayButtonType(String str, int i11, int i12) {
        this.value = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GooglePayButtonType valueOf(String str) {
        return (GooglePayButtonType) Enum.valueOf(GooglePayButtonType.class, str);
    }

    public static GooglePayButtonType[] values() {
        return (GooglePayButtonType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
