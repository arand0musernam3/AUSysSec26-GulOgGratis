package com.adyen.checkout.ui.core.internal.ui.view;

import android.text.Editable;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements AdyenTextInputEditText.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressFormInput f8841b;

    public /* synthetic */ b(AddressFormInput addressFormInput, int i11) {
        this.f8840a = i11;
        this.f8841b = addressFormInput;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText.Listener
    public final void onTextChanged(Editable editable) {
        switch (this.f8840a) {
            case 0:
                AddressFormInput.initCityInput$lambda$25$lambda$23(this.f8841b, editable);
                break;
            case 1:
                AddressFormInput.initStreetInput$lambda$9$lambda$7(this.f8841b, editable);
                break;
            case 2:
                AddressFormInput.initProvinceTerritoryInput$lambda$29$lambda$27(this.f8841b, editable);
                break;
            case 3:
                AddressFormInput.initHouseNumberInput$lambda$13$lambda$11(this.f8841b, editable);
                break;
            case 4:
                AddressFormInput.initApartmentSuiteInput$lambda$17$lambda$15(this.f8841b, editable);
                break;
            default:
                AddressFormInput.initPostalCodeInput$lambda$21$lambda$19(this.f8841b, editable);
                break;
        }
    }
}
