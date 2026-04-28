package com.adyen.checkout.blik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.blik.R;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class BlikViewBinding implements a {

    @NonNull
    public final AdyenTextInputEditText editTextBlikCode;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextInputLayout textInputLayoutBlikCode;

    @NonNull
    public final TextView textViewBlikHeader;

    private BlikViewBinding(@NonNull View view, @NonNull AdyenTextInputEditText adyenTextInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView) {
        this.rootView = view;
        this.editTextBlikCode = adyenTextInputEditText;
        this.textInputLayoutBlikCode = textInputLayout;
        this.textViewBlikHeader = textView;
    }

    @NonNull
    public static BlikViewBinding bind(@NonNull View view) {
        int i11 = R.id.editText_blikCode;
        AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) g.t(i11, view);
        if (adyenTextInputEditText != null) {
            i11 = R.id.textInputLayout_blikCode;
            TextInputLayout textInputLayout = (TextInputLayout) g.t(i11, view);
            if (textInputLayout != null) {
                i11 = R.id.textView_blikHeader;
                TextView textView = (TextView) g.t(i11, view);
                if (textView != null) {
                    return new BlikViewBinding(view, adyenTextInputEditText, textInputLayout, textView);
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static BlikViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.blik_view, viewGroup);
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
