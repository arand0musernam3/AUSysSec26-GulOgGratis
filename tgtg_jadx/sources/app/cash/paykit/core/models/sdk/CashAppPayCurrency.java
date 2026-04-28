package app.cash.paykit.core.models.sdk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lapp/cash/paykit/core/models/sdk/CashAppPayCurrency;", "", "backendValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getBackendValue", "()Ljava/lang/String;", "USD", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum CashAppPayCurrency {
    USD("USD");


    @NotNull
    private final String backendValue;

    CashAppPayCurrency(String str) {
        this.backendValue = str;
    }

    @NotNull
    public final String getBackendValue() {
        return this.backendValue;
    }
}
