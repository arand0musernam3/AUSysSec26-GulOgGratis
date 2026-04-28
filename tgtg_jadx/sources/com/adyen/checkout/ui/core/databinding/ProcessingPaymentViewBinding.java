package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.ui.core.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessingPaymentViewBinding implements a {

    @NonNull
    public final ProgressBar progressBarPaymentInProgress;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView textViewPaymentInProgressDescription;

    private ProcessingPaymentViewBinding(@NonNull View view, @NonNull ProgressBar progressBar, @NonNull TextView textView) {
        this.rootView = view;
        this.progressBarPaymentInProgress = progressBar;
        this.textViewPaymentInProgressDescription = textView;
    }

    @NonNull
    public static ProcessingPaymentViewBinding bind(@NonNull View view) {
        int i11 = R.id.progressBar_paymentInProgress;
        ProgressBar progressBar = (ProgressBar) g.t(i11, view);
        if (progressBar != null) {
            i11 = R.id.textView_paymentInProgress_description;
            TextView textView = (TextView) g.t(i11, view);
            if (textView != null) {
                return new ProcessingPaymentViewBinding(view, progressBar, textView);
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static ProcessingPaymentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.processing_payment_view, viewGroup);
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
