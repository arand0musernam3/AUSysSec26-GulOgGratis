package com.adyen.checkout.ui.core.internal.ui.view;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressFormInput f8843b;

    public /* synthetic */ c(AddressFormInput addressFormInput, int i11) {
        this.f8842a = i11;
        this.f8843b = addressFormInput;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        switch (this.f8842a) {
            case 0:
                AddressFormInput.initCityInput$lambda$25$lambda$24(this.f8843b, view, z11);
                break;
            case 1:
                AddressFormInput.initStreetInput$lambda$9$lambda$8(this.f8843b, view, z11);
                break;
            case 2:
                AddressFormInput.initProvinceTerritoryInput$lambda$29$lambda$28(this.f8843b, view, z11);
                break;
            case 3:
                AddressFormInput.initHouseNumberInput$lambda$13$lambda$12(this.f8843b, view, z11);
                break;
            case 4:
                AddressFormInput.initApartmentSuiteInput$lambda$17$lambda$16(this.f8843b, view, z11);
                break;
            default:
                AddressFormInput.initPostalCodeInput$lambda$21$lambda$20(this.f8843b, view, z11);
                break;
        }
    }
}
