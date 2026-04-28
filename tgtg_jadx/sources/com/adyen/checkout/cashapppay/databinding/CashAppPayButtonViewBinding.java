package com.adyen.checkout.cashapppay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import app.cash.paykit.core.ui.CashAppPayButton;
import c50.w;
import com.adyen.checkout.cashapppay.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class CashAppPayButtonViewBinding implements a {

    @NonNull
    public final CashAppPayButton payButton;

    @NonNull
    private final View rootView;

    private CashAppPayButtonViewBinding(@NonNull View view, @NonNull CashAppPayButton cashAppPayButton) {
        this.rootView = view;
        this.payButton = cashAppPayButton;
    }

    @NonNull
    public static CashAppPayButtonViewBinding bind(@NonNull View view) {
        int i11 = R.id.payButton;
        CashAppPayButton cashAppPayButton = (CashAppPayButton) g.t(i11, view);
        if (cashAppPayButton != null) {
            return new CashAppPayButtonViewBinding(view, cashAppPayButton);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static CashAppPayButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.cash_app_pay_button_view, viewGroup);
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
