package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AddressFormDefaultBinding implements a {

    @NonNull
    public final AdyenTextInputEditText editTextApartmentSuite;

    @NonNull
    public final AdyenTextInputEditText editTextCity;

    @NonNull
    public final AdyenTextInputEditText editTextHouseNumber;

    @NonNull
    public final AdyenTextInputEditText editTextPostalCode;

    @NonNull
    public final AdyenTextInputEditText editTextProvinceTerritory;

    @NonNull
    public final AdyenTextInputEditText editTextStreet;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextInputLayout textInputLayoutApartmentSuite;

    @NonNull
    public final TextInputLayout textInputLayoutCity;

    @NonNull
    public final TextInputLayout textInputLayoutHouseNumber;

    @NonNull
    public final TextInputLayout textInputLayoutPostalCode;

    @NonNull
    public final TextInputLayout textInputLayoutProvinceTerritory;

    @NonNull
    public final TextInputLayout textInputLayoutStreet;

    private AddressFormDefaultBinding(@NonNull View view, @NonNull AdyenTextInputEditText adyenTextInputEditText, @NonNull AdyenTextInputEditText adyenTextInputEditText2, @NonNull AdyenTextInputEditText adyenTextInputEditText3, @NonNull AdyenTextInputEditText adyenTextInputEditText4, @NonNull AdyenTextInputEditText adyenTextInputEditText5, @NonNull AdyenTextInputEditText adyenTextInputEditText6, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6) {
        this.rootView = view;
        this.editTextApartmentSuite = adyenTextInputEditText;
        this.editTextCity = adyenTextInputEditText2;
        this.editTextHouseNumber = adyenTextInputEditText3;
        this.editTextPostalCode = adyenTextInputEditText4;
        this.editTextProvinceTerritory = adyenTextInputEditText5;
        this.editTextStreet = adyenTextInputEditText6;
        this.textInputLayoutApartmentSuite = textInputLayout;
        this.textInputLayoutCity = textInputLayout2;
        this.textInputLayoutHouseNumber = textInputLayout3;
        this.textInputLayoutPostalCode = textInputLayout4;
        this.textInputLayoutProvinceTerritory = textInputLayout5;
        this.textInputLayoutStreet = textInputLayout6;
    }

    @NonNull
    public static AddressFormDefaultBinding bind(@NonNull View view) {
        int i11 = R.id.editText_apartmentSuite;
        AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) g.t(i11, view);
        if (adyenTextInputEditText != null) {
            i11 = R.id.editText_city;
            AdyenTextInputEditText adyenTextInputEditText2 = (AdyenTextInputEditText) g.t(i11, view);
            if (adyenTextInputEditText2 != null) {
                i11 = R.id.editText_houseNumber;
                AdyenTextInputEditText adyenTextInputEditText3 = (AdyenTextInputEditText) g.t(i11, view);
                if (adyenTextInputEditText3 != null) {
                    i11 = R.id.editText_postalCode;
                    AdyenTextInputEditText adyenTextInputEditText4 = (AdyenTextInputEditText) g.t(i11, view);
                    if (adyenTextInputEditText4 != null) {
                        i11 = R.id.editText_provinceTerritory;
                        AdyenTextInputEditText adyenTextInputEditText5 = (AdyenTextInputEditText) g.t(i11, view);
                        if (adyenTextInputEditText5 != null) {
                            i11 = R.id.editText_street;
                            AdyenTextInputEditText adyenTextInputEditText6 = (AdyenTextInputEditText) g.t(i11, view);
                            if (adyenTextInputEditText6 != null) {
                                i11 = R.id.textInputLayout_apartmentSuite;
                                TextInputLayout textInputLayout = (TextInputLayout) g.t(i11, view);
                                if (textInputLayout != null) {
                                    i11 = R.id.textInputLayout_city;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) g.t(i11, view);
                                    if (textInputLayout2 != null) {
                                        i11 = R.id.textInputLayout_houseNumber;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) g.t(i11, view);
                                        if (textInputLayout3 != null) {
                                            i11 = R.id.textInputLayout_postalCode;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) g.t(i11, view);
                                            if (textInputLayout4 != null) {
                                                i11 = R.id.textInputLayout_provinceTerritory;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) g.t(i11, view);
                                                if (textInputLayout5 != null) {
                                                    i11 = R.id.textInputLayout_street;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) g.t(i11, view);
                                                    if (textInputLayout6 != null) {
                                                        return new AddressFormDefaultBinding(view, adyenTextInputEditText, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, adyenTextInputEditText5, adyenTextInputEditText6, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static AddressFormDefaultBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.address_form_default, viewGroup);
            return bind(viewGroup);
        }
        w.l("parent");
        return null;
    }

    @Override // sa.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
