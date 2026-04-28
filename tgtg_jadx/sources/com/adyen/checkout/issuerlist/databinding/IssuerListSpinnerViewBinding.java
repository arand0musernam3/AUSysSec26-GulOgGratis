package com.adyen.checkout.issuerlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatSpinner;
import c50.w;
import com.adyen.checkout.issuerlist.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class IssuerListSpinnerViewBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatSpinner spinnerIssuers;

    private IssuerListSpinnerViewBinding(@NonNull View view, @NonNull AppCompatSpinner appCompatSpinner) {
        this.rootView = view;
        this.spinnerIssuers = appCompatSpinner;
    }

    @NonNull
    public static IssuerListSpinnerViewBinding bind(@NonNull View view) {
        int i11 = R.id.spinner_issuers;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) g.t(i11, view);
        if (appCompatSpinner != null) {
            return new IssuerListSpinnerViewBinding(view, appCompatSpinner);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static IssuerListSpinnerViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.issuer_list_spinner_view, viewGroup);
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
