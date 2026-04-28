package com.adyen.checkout.components.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/AddressLookupCallback;", "", "onLookupCompletion", "", "lookupAddress", "Lcom/adyen/checkout/components/core/LookupAddress;", "onQueryChanged", "", "query", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AddressLookupCallback {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean onLookupCompletion(@NotNull AddressLookupCallback addressLookupCallback, @NotNull LookupAddress lookupAddress) {
            lookupAddress.getClass();
            return false;
        }
    }

    boolean onLookupCompletion(@NotNull LookupAddress lookupAddress);

    void onQueryChanged(@NotNull String query);
}
