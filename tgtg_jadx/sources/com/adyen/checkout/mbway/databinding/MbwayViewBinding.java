package com.adyen.checkout.mbway.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import c50.w;
import com.adyen.checkout.mbway.R;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MbwayViewBinding implements a {

    @NonNull
    public final AppCompatAutoCompleteTextView autoCompleteTextViewCountry;

    @NonNull
    public final AdyenTextInputEditText editTextMobileNumber;

    @NonNull
    public final LinearLayout layoutContainer;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextInputLayout textInputLayoutCountry;

    @NonNull
    public final TextInputLayout textInputLayoutMobileNumber;

    private MbwayViewBinding(@NonNull View view, @NonNull AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, @NonNull AdyenTextInputEditText adyenTextInputEditText, @NonNull LinearLayout linearLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        this.rootView = view;
        this.autoCompleteTextViewCountry = appCompatAutoCompleteTextView;
        this.editTextMobileNumber = adyenTextInputEditText;
        this.layoutContainer = linearLayout;
        this.textInputLayoutCountry = textInputLayout;
        this.textInputLayoutMobileNumber = textInputLayout2;
    }

    @NonNull
    public static MbwayViewBinding bind(@NonNull View view) {
        int i11 = R.id.autoCompleteTextView_country;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) g.t(i11, view);
        if (appCompatAutoCompleteTextView != null) {
            i11 = R.id.editText_mobileNumber;
            AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) g.t(i11, view);
            if (adyenTextInputEditText != null) {
                i11 = R.id.layout_container;
                LinearLayout linearLayout = (LinearLayout) g.t(i11, view);
                if (linearLayout != null) {
                    i11 = R.id.textInputLayout_country;
                    TextInputLayout textInputLayout = (TextInputLayout) g.t(i11, view);
                    if (textInputLayout != null) {
                        i11 = R.id.textInputLayout_mobileNumber;
                        TextInputLayout textInputLayout2 = (TextInputLayout) g.t(i11, view);
                        if (textInputLayout2 != null) {
                            return new MbwayViewBinding(view, appCompatAutoCompleteTextView, adyenTextInputEditText, linearLayout, textInputLayout, textInputLayout2);
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static MbwayViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.mbway_view, viewGroup);
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
