package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import c50.w;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AddressFormUsBinding implements a {

    @NonNull
    public final AppCompatAutoCompleteTextView autoCompleteTextViewState;

    @NonNull
    public final AdyenTextInputEditText editTextApartmentSuite;

    @NonNull
    public final AdyenTextInputEditText editTextCity;

    @NonNull
    public final AdyenTextInputEditText editTextPostalCode;

    @NonNull
    public final AdyenTextInputEditText editTextStreet;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextInputLayout textInputLayoutApartmentSuite;

    @NonNull
    public final TextInputLayout textInputLayoutCity;

    @NonNull
    public final TextInputLayout textInputLayoutPostalCode;

    @NonNull
    public final TextInputLayout textInputLayoutState;

    @NonNull
    public final TextInputLayout textInputLayoutStreet;

    private AddressFormUsBinding(@NonNull View view, @NonNull AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, @NonNull AdyenTextInputEditText adyenTextInputEditText, @NonNull AdyenTextInputEditText adyenTextInputEditText2, @NonNull AdyenTextInputEditText adyenTextInputEditText3, @NonNull AdyenTextInputEditText adyenTextInputEditText4, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5) {
        this.rootView = view;
        this.autoCompleteTextViewState = appCompatAutoCompleteTextView;
        this.editTextApartmentSuite = adyenTextInputEditText;
        this.editTextCity = adyenTextInputEditText2;
        this.editTextPostalCode = adyenTextInputEditText3;
        this.editTextStreet = adyenTextInputEditText4;
        this.textInputLayoutApartmentSuite = textInputLayout;
        this.textInputLayoutCity = textInputLayout2;
        this.textInputLayoutPostalCode = textInputLayout3;
        this.textInputLayoutState = textInputLayout4;
        this.textInputLayoutStreet = textInputLayout5;
    }

    @NonNull
    public static AddressFormUsBinding bind(@NonNull View view) {
        int i11 = R.id.autoCompleteTextView_state;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) g.t(i11, view);
        if (appCompatAutoCompleteTextView != null) {
            i11 = R.id.editText_apartmentSuite;
            AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) g.t(i11, view);
            if (adyenTextInputEditText != null) {
                i11 = R.id.editText_city;
                AdyenTextInputEditText adyenTextInputEditText2 = (AdyenTextInputEditText) g.t(i11, view);
                if (adyenTextInputEditText2 != null) {
                    i11 = R.id.editText_postalCode;
                    AdyenTextInputEditText adyenTextInputEditText3 = (AdyenTextInputEditText) g.t(i11, view);
                    if (adyenTextInputEditText3 != null) {
                        i11 = R.id.editText_street;
                        AdyenTextInputEditText adyenTextInputEditText4 = (AdyenTextInputEditText) g.t(i11, view);
                        if (adyenTextInputEditText4 != null) {
                            i11 = R.id.textInputLayout_apartmentSuite;
                            TextInputLayout textInputLayout = (TextInputLayout) g.t(i11, view);
                            if (textInputLayout != null) {
                                i11 = R.id.textInputLayout_city;
                                TextInputLayout textInputLayout2 = (TextInputLayout) g.t(i11, view);
                                if (textInputLayout2 != null) {
                                    i11 = R.id.textInputLayout_postalCode;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) g.t(i11, view);
                                    if (textInputLayout3 != null) {
                                        i11 = R.id.textInputLayout_state;
                                        TextInputLayout textInputLayout4 = (TextInputLayout) g.t(i11, view);
                                        if (textInputLayout4 != null) {
                                            i11 = R.id.textInputLayout_street;
                                            TextInputLayout textInputLayout5 = (TextInputLayout) g.t(i11, view);
                                            if (textInputLayout5 != null) {
                                                return new AddressFormUsBinding(view, appCompatAutoCompleteTextView, adyenTextInputEditText, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5);
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
    public static AddressFormUsBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.address_form_us, viewGroup);
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
