package com.adyen.checkout.googlepay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.googlepay.R;
import com.google.android.gms.wallet.button.PayButton;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGooglePayButtonBinding implements a {

    @NonNull
    public final PayButton payButton;

    @NonNull
    private final View rootView;

    private ViewGooglePayButtonBinding(@NonNull View view, @NonNull PayButton payButton) {
        this.rootView = view;
        this.payButton = payButton;
    }

    @NonNull
    public static ViewGooglePayButtonBinding bind(@NonNull View view) {
        int i11 = R.id.payButton;
        PayButton payButton = (PayButton) g.t(i11, view);
        if (payButton != null) {
            return new ViewGooglePayButtonBinding(view, payButton);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static ViewGooglePayButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_google_pay_button, viewGroup);
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
