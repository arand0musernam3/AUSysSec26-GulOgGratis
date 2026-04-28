package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.ui.core.R;
import com.google.android.material.button.MaterialButton;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultPayButtonViewBinding implements a {

    @NonNull
    public final MaterialButton payButton;

    @NonNull
    private final View rootView;

    private DefaultPayButtonViewBinding(@NonNull View view, @NonNull MaterialButton materialButton) {
        this.rootView = view;
        this.payButton = materialButton;
    }

    @NonNull
    public static DefaultPayButtonViewBinding bind(@NonNull View view) {
        int i11 = R.id.payButton;
        MaterialButton materialButton = (MaterialButton) g.t(i11, view);
        if (materialButton != null) {
            return new DefaultPayButtonViewBinding(view, materialButton);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static DefaultPayButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.default_pay_button_view, viewGroup);
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
