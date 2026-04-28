package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.components.core.AddressLookupCallback;
import com.adyen.checkout.components.core.AddressLookupResult;
import com.adyen.checkout.components.core.LookupAddress;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/internal/AddressLookupComponent;", "", "setAddressLookupCallback", "", "addressLookupCallback", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "setAddressLookupResult", "addressLookupResult", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "updateAddressLookupOptions", "options", "", "Lcom/adyen/checkout/components/core/LookupAddress;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AddressLookupComponent {
    void setAddressLookupCallback(@NotNull AddressLookupCallback addressLookupCallback);

    void setAddressLookupResult(@NotNull AddressLookupResult addressLookupResult);

    void updateAddressLookupOptions(@NotNull List<LookupAddress> options);
}
