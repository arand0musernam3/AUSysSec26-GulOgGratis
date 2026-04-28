package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import c50.w;
import com.adyen.checkout.ui.core.R;
import com.google.android.material.textfield.TextInputLayout;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AddressFormInputBinding implements a {

    @NonNull
    public final AppCompatAutoCompleteTextView autoCompleteTextViewCountry;

    @NonNull
    public final LinearLayout linearLayoutFormContainer;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextInputLayout textInputLayoutCountry;

    @NonNull
    public final TextView textViewHeader;

    private AddressFormInputBinding(@NonNull View view, @NonNull AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, @NonNull LinearLayout linearLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView) {
        this.rootView = view;
        this.autoCompleteTextViewCountry = appCompatAutoCompleteTextView;
        this.linearLayoutFormContainer = linearLayout;
        this.textInputLayoutCountry = textInputLayout;
        this.textViewHeader = textView;
    }

    @NonNull
    public static AddressFormInputBinding bind(@NonNull View view) {
        int i11 = R.id.autoCompleteTextView_country;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) g.t(i11, view);
        if (appCompatAutoCompleteTextView != null) {
            i11 = R.id.linearLayout_formContainer;
            LinearLayout linearLayout = (LinearLayout) g.t(i11, view);
            if (linearLayout != null) {
                i11 = R.id.textInputLayout_country;
                TextInputLayout textInputLayout = (TextInputLayout) g.t(i11, view);
                if (textInputLayout != null) {
                    i11 = R.id.textView_header;
                    TextView textView = (TextView) g.t(i11, view);
                    if (textView != null) {
                        return new AddressFormInputBinding(view, appCompatAutoCompleteTextView, linearLayout, textInputLayout, textView);
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static AddressFormInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.address_form_input, viewGroup);
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
