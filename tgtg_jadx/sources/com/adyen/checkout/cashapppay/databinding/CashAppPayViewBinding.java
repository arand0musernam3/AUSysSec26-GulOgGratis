package com.adyen.checkout.cashapppay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import c50.w;
import com.adyen.checkout.cashapppay.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class CashAppPayViewBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final SwitchCompat switchStorePaymentMethod;

    private CashAppPayViewBinding(@NonNull View view, @NonNull SwitchCompat switchCompat) {
        this.rootView = view;
        this.switchStorePaymentMethod = switchCompat;
    }

    @NonNull
    public static CashAppPayViewBinding bind(@NonNull View view) {
        int i11 = R.id.switch_storePaymentMethod;
        SwitchCompat switchCompat = (SwitchCompat) g.t(i11, view);
        if (switchCompat != null) {
            return new CashAppPayViewBinding(view, switchCompat);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static CashAppPayViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.cash_app_pay_view, viewGroup);
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
