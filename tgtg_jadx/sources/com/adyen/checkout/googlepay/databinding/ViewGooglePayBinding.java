package com.adyen.checkout.googlepay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import c50.w;
import com.adyen.checkout.googlepay.R;
import com.adyen.checkout.ui.core.internal.ui.view.ProcessingPaymentView;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGooglePayBinding implements a {

    @NonNull
    public final FragmentContainerView fragmentContainer;

    @NonNull
    public final ProcessingPaymentView processingPaymentView;

    @NonNull
    private final View rootView;

    private ViewGooglePayBinding(@NonNull View view, @NonNull FragmentContainerView fragmentContainerView, @NonNull ProcessingPaymentView processingPaymentView) {
        this.rootView = view;
        this.fragmentContainer = fragmentContainerView;
        this.processingPaymentView = processingPaymentView;
    }

    @NonNull
    public static ViewGooglePayBinding bind(@NonNull View view) {
        int i11 = R.id.fragmentContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) g.t(i11, view);
        if (fragmentContainerView != null) {
            i11 = R.id.processingPaymentView;
            ProcessingPaymentView processingPaymentView = (ProcessingPaymentView) g.t(i11, view);
            if (processingPaymentView != null) {
                return new ViewGooglePayBinding(view, fragmentContainerView, processingPaymentView);
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static ViewGooglePayBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_google_pay, viewGroup);
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
