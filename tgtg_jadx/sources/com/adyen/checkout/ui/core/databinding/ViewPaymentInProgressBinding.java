package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.ui.core.R;
import com.google.android.material.button.MaterialButton;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPaymentInProgressBinding implements a {

    @NonNull
    public final MaterialButton buttonPaymentInProgressCancel;

    @NonNull
    public final ProgressBar progressBarPaymentInProgress;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView textViewPaymentInProgressDescription;

    @NonNull
    public final TextView textViewPaymentInProgressTitle;

    private ViewPaymentInProgressBinding(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.buttonPaymentInProgressCancel = materialButton;
        this.progressBarPaymentInProgress = progressBar;
        this.textViewPaymentInProgressDescription = textView;
        this.textViewPaymentInProgressTitle = textView2;
    }

    @NonNull
    public static ViewPaymentInProgressBinding bind(@NonNull View view) {
        int i11 = R.id.button_paymentInProgress_cancel;
        MaterialButton materialButton = (MaterialButton) g.t(i11, view);
        if (materialButton != null) {
            i11 = R.id.progressBar_paymentInProgress;
            ProgressBar progressBar = (ProgressBar) g.t(i11, view);
            if (progressBar != null) {
                i11 = R.id.textView_paymentInProgress_description;
                TextView textView = (TextView) g.t(i11, view);
                if (textView != null) {
                    i11 = R.id.textView_paymentInProgress_title;
                    TextView textView2 = (TextView) g.t(i11, view);
                    if (textView2 != null) {
                        return new ViewPaymentInProgressBinding(view, materialButton, progressBar, textView, textView2);
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static ViewPaymentInProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_payment_in_progress, viewGroup);
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
