package com.adyen.checkout.components.core;

import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"mapToAddressInputModel", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "Lcom/adyen/checkout/components/core/AddressData;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AddressDataKt {
    @NotNull
    public static final AddressInputModel mapToAddressInputModel(@NotNull AddressData addressData) {
        addressData.getClass();
        String postalCode = addressData.getPostalCode();
        String street = addressData.getStreet();
        String stateOrProvince = addressData.getStateOrProvince();
        String houseNumberOrName = addressData.getHouseNumberOrName();
        String apartmentSuite = addressData.getApartmentSuite();
        if (apartmentSuite == null) {
            apartmentSuite = "";
        }
        return new AddressInputModel(postalCode, street, stateOrProvince, houseNumberOrName, apartmentSuite, addressData.getCity(), addressData.getCountry(), null, 128, null);
    }
}
