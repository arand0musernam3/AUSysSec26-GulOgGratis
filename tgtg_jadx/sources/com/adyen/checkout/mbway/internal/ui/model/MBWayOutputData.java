package com.adyen.checkout.mbway.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.components.core.internal.util.ValidationUtils;
import com.adyen.checkout.mbway.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/mbway/internal/ui/model/MBWayOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "mobilePhoneNumber", "", "(Ljava/lang/String;)V", "isValid", "", "()Z", "mobilePhoneNumberFieldState", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "getMobilePhoneNumberFieldState", "()Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "validateMobileNumber", "mobileNumber", "mbway_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MBWayOutputData implements OutputData {

    @NotNull
    private final FieldState<String> mobilePhoneNumberFieldState;

    public MBWayOutputData(@NotNull String str) {
        str.getClass();
        this.mobilePhoneNumberFieldState = validateMobileNumber(str);
    }

    private final FieldState<String> validateMobileNumber(String mobileNumber) {
        return (mobileNumber.length() <= 0 || !ValidationUtils.INSTANCE.isPhoneNumberValid(mobileNumber)) ? new FieldState<>(mobileNumber, new Validation.Invalid(R.string.checkout_mbway_phone_number_not_valid, false, 2, null)) : new FieldState<>(mobileNumber, Validation.Valid.INSTANCE);
    }

    @NotNull
    public final FieldState<String> getMobilePhoneNumberFieldState() {
        return this.mobilePhoneNumberFieldState;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    /* JADX INFO: renamed from: isValid */
    public boolean getIsValid() {
        return this.mobilePhoneNumberFieldState.getValidation().isValid();
    }
}
