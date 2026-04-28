package com.adyen.checkout.cashapppay;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/cashapppay/CashAppPayEnvironment;", "", "(Ljava/lang/String;I)V", "SANDBOX", "PRODUCTION", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CashAppPayEnvironment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CashAppPayEnvironment[] $VALUES;
    public static final CashAppPayEnvironment SANDBOX = new CashAppPayEnvironment("SANDBOX", 0);
    public static final CashAppPayEnvironment PRODUCTION = new CashAppPayEnvironment("PRODUCTION", 1);

    private static final /* synthetic */ CashAppPayEnvironment[] $values() {
        return new CashAppPayEnvironment[]{SANDBOX, PRODUCTION};
    }

    static {
        CashAppPayEnvironment[] cashAppPayEnvironmentArr$values = $values();
        $VALUES = cashAppPayEnvironmentArr$values;
        $ENTRIES = n.w(cashAppPayEnvironmentArr$values);
    }

    private CashAppPayEnvironment(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CashAppPayEnvironment valueOf(String str) {
        return (CashAppPayEnvironment) Enum.valueOf(CashAppPayEnvironment.class, str);
    }

    public static CashAppPayEnvironment[] values() {
        return (CashAppPayEnvironment[]) $VALUES.clone();
    }
}
