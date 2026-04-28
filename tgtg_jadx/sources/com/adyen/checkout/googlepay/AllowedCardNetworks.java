package com.adyen.checkout.googlepay;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/googlepay/AllowedCardNetworks;", "", "()V", AllowedCardNetworks.AMEX, "", AllowedCardNetworks.DISCOVER, AllowedCardNetworks.INTERAC, AllowedCardNetworks.JCB, AllowedCardNetworks.MASTERCARD, AllowedCardNetworks.VISA, "allAllowedCardNetworks", "", "getAllAllowedCardNetworks$googlepay_release", "()Ljava/util/List;", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AllowedCardNetworks {

    @NotNull
    public static final AllowedCardNetworks INSTANCE = new AllowedCardNetworks();

    @NotNull
    public static final String AMEX = "AMEX";

    @NotNull
    public static final String DISCOVER = "DISCOVER";

    @NotNull
    public static final String INTERAC = "INTERAC";

    @NotNull
    public static final String JCB = "JCB";

    @NotNull
    public static final String MASTERCARD = "MASTERCARD";

    @NotNull
    public static final String VISA = "VISA";

    @NotNull
    private static final List<String> allAllowedCardNetworks = d0.h(AMEX, DISCOVER, INTERAC, JCB, MASTERCARD, VISA);

    private AllowedCardNetworks() {
    }

    @NotNull
    public final List<String> getAllAllowedCardNetworks$googlepay_release() {
        return allAllowedCardNetworks;
    }
}
