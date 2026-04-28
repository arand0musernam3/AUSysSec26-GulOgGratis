package com.adyen.checkout.ui.core.internal.util;

import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.AddressFormUIState;
import com.adyen.checkout.ui.core.internal.ui.AddressSpecification;
import com.adyen.checkout.ui.core.internal.ui.model.AddressListItem;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J:\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\fJ4\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J4\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/AddressValidationUtils;", "", "()V", "makeValidEmptyAddressOutput", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "addressInputModel", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "validateAddressField", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "", "input", "shouldValidate", "", "validateAddressInput", "addressFormUIState", "Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "countryOptions", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressListItem;", "stateOptions", "isOptional", "validatePostalCode", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddressValidationUtils {

    @NotNull
    public static final AddressValidationUtils INSTANCE = new AddressValidationUtils();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressFormUIState.values().length];
            try {
                iArr[AddressFormUIState.FULL_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressFormUIState.LOOKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressFormUIState.POSTAL_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AddressValidationUtils() {
    }

    private final FieldState<String> validateAddressField(String input, boolean shouldValidate) {
        return (input.length() <= 0 && shouldValidate) ? new FieldState<>(input, new Validation.Invalid(R.string.checkout_address_form_field_not_valid, false, 2, null)) : new FieldState<>(input, Validation.Valid.INSTANCE);
    }

    private final AddressOutputData validateAddressInput(AddressInputModel addressInputModel, boolean isOptional, List<AddressListItem> countryOptions, List<AddressListItem> stateOptions) {
        AddressSpecification addressSpecificationFromString = AddressSpecification.INSTANCE.fromString(addressInputModel.getCountry());
        AddressValidationUtils addressValidationUtils = INSTANCE;
        boolean z11 = false;
        FieldState<String> fieldStateValidateAddressField = addressValidationUtils.validateAddressField(addressInputModel.getPostalCode(), addressSpecificationFromString.getPostalCode().isRequired() && !isOptional);
        FieldState<String> fieldStateValidateAddressField2 = addressValidationUtils.validateAddressField(addressInputModel.getStreet(), addressSpecificationFromString.getStreet().isRequired() && !isOptional);
        FieldState<String> fieldStateValidateAddressField3 = addressValidationUtils.validateAddressField(addressInputModel.getStateOrProvince(), addressSpecificationFromString.getStateProvince().isRequired() && !isOptional);
        FieldState<String> fieldStateValidateAddressField4 = addressValidationUtils.validateAddressField(addressInputModel.getHouseNumberOrName(), addressSpecificationFromString.getHouseNumber().isRequired() && !isOptional);
        FieldState<String> fieldStateValidateAddressField5 = addressValidationUtils.validateAddressField(addressInputModel.getApartmentSuite(), addressSpecificationFromString.getApartmentSuite().isRequired() && !isOptional);
        FieldState<String> fieldStateValidateAddressField6 = addressValidationUtils.validateAddressField(addressInputModel.getCity(), addressSpecificationFromString.getCity().isRequired() && !isOptional);
        String country = addressInputModel.getCountry();
        if (addressSpecificationFromString.getCountry().isRequired() && !isOptional) {
            z11 = true;
        }
        return new AddressOutputData(fieldStateValidateAddressField, fieldStateValidateAddressField2, fieldStateValidateAddressField3, fieldStateValidateAddressField4, fieldStateValidateAddressField5, fieldStateValidateAddressField6, addressValidationUtils.validateAddressField(country, z11), isOptional, countryOptions, stateOptions, addressInputModel.getCountryDisplayName());
    }

    private final AddressOutputData validatePostalCode(AddressInputModel addressInputModel, boolean isOptional, List<AddressListItem> countryOptions, List<AddressListItem> stateOptions) {
        FieldState<String> fieldStateValidateAddressField = INSTANCE.validateAddressField(addressInputModel.getPostalCode(), !isOptional);
        String street = addressInputModel.getStreet();
        Validation.Valid valid = Validation.Valid.INSTANCE;
        return new AddressOutputData(fieldStateValidateAddressField, new FieldState(street, valid), new FieldState(addressInputModel.getStateOrProvince(), valid), new FieldState(addressInputModel.getHouseNumberOrName(), valid), new FieldState(addressInputModel.getApartmentSuite(), valid), new FieldState(addressInputModel.getCity(), valid), new FieldState(addressInputModel.getCountry(), valid), isOptional, countryOptions, stateOptions, addressInputModel.getCountryDisplayName());
    }

    @NotNull
    public final AddressOutputData makeValidEmptyAddressOutput(@NotNull AddressInputModel addressInputModel) {
        addressInputModel.getClass();
        String postalCode = addressInputModel.getPostalCode();
        Validation.Valid valid = Validation.Valid.INSTANCE;
        FieldState fieldState = new FieldState(postalCode, valid);
        FieldState fieldState2 = new FieldState(addressInputModel.getStreet(), valid);
        FieldState fieldState3 = new FieldState(addressInputModel.getStateOrProvince(), valid);
        FieldState fieldState4 = new FieldState(addressInputModel.getHouseNumberOrName(), valid);
        FieldState fieldState5 = new FieldState(addressInputModel.getApartmentSuite(), valid);
        FieldState fieldState6 = new FieldState(addressInputModel.getCity(), valid);
        FieldState fieldState7 = new FieldState(addressInputModel.getCountry(), valid);
        n0 n0Var = n0.f26529a;
        return new AddressOutputData(fieldState, fieldState2, fieldState3, fieldState4, fieldState5, fieldState6, fieldState7, true, n0Var, n0Var, addressInputModel.getCountryDisplayName());
    }

    @NotNull
    public final AddressOutputData validateAddressInput(@NotNull AddressInputModel addressInputModel, @NotNull AddressFormUIState addressFormUIState, @NotNull List<AddressListItem> countryOptions, @NotNull List<AddressListItem> stateOptions, boolean isOptional) {
        addressInputModel.getClass();
        addressFormUIState.getClass();
        countryOptions.getClass();
        stateOptions.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[addressFormUIState.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return validateAddressInput(addressInputModel, isOptional, countryOptions, stateOptions);
        }
        if (i11 != 3) {
            return makeValidEmptyAddressOutput(addressInputModel);
        }
        return validatePostalCode(addressInputModel, isOptional, countryOptions, stateOptions);
    }
}
