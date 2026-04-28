package com.adyen.checkout.card.internal.util;

import com.adyen.checkout.card.internal.ui.model.AddressFieldPolicyParams;
import com.adyen.checkout.ui.core.internal.ui.model.AddressFieldPolicy;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import e40.a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/internal/util/CardAddressValidationUtils;", "", "()V", "isAddressOptional", "", "addressParams", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "cardType", "", "Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardAddressValidationUtils {

    @NotNull
    public static final CardAddressValidationUtils INSTANCE = new CardAddressValidationUtils();

    private CardAddressValidationUtils() {
    }

    public final boolean isAddressOptional(@NotNull AddressParams addressParams, @Nullable String cardType) {
        addressParams.getClass();
        Boolean boolValueOf = null;
        if (addressParams instanceof AddressParams.FullAddress) {
            AddressFieldPolicy addressFieldPolicy = ((AddressParams.FullAddress) addressParams).getAddressFieldPolicy();
            AddressFieldPolicyParams addressFieldPolicyParams = addressFieldPolicy instanceof AddressFieldPolicyParams ? (AddressFieldPolicyParams) addressFieldPolicy : null;
            if (addressFieldPolicyParams != null) {
                boolValueOf = Boolean.valueOf(isAddressOptional(addressFieldPolicyParams, cardType));
            }
        } else if (addressParams instanceof AddressParams.PostalCode) {
            AddressFieldPolicy addressFieldPolicy2 = ((AddressParams.PostalCode) addressParams).getAddressFieldPolicy();
            AddressFieldPolicyParams addressFieldPolicyParams2 = addressFieldPolicy2 instanceof AddressFieldPolicyParams ? (AddressFieldPolicyParams) addressFieldPolicy2 : null;
            if (addressFieldPolicyParams2 != null) {
                boolValueOf = Boolean.valueOf(isAddressOptional(addressFieldPolicyParams2, cardType));
            }
        } else if (Intrinsics.areEqual(addressParams, AddressParams.None.INSTANCE)) {
            boolValueOf = Boolean.TRUE;
        } else {
            if (!(addressParams instanceof AddressParams.Lookup)) {
                a.f();
                return false;
            }
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    private final boolean isAddressOptional(AddressFieldPolicyParams addressFieldPolicyParams, String str) {
        if (addressFieldPolicyParams instanceof AddressFieldPolicyParams.Optional) {
            return true;
        }
        if (addressFieldPolicyParams instanceof AddressFieldPolicyParams.OptionalForCardTypes) {
            return CollectionsKt.I(((AddressFieldPolicyParams.OptionalForCardTypes) addressFieldPolicyParams).getBrands(), str);
        }
        if (addressFieldPolicyParams instanceof AddressFieldPolicyParams.Required) {
            return false;
        }
        a.f();
        return false;
    }
}
