package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.w;
import com.adyen.checkout.ui.core.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AddressLookupOptionItemViewBinding implements a {

    @NonNull
    public final View divider;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView textViewAddressDescription;

    @NonNull
    public final AppCompatTextView textViewAddressHeader;

    private AddressLookupOptionItemViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ProgressBar progressBar, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.divider = view;
        this.progressBar = progressBar;
        this.textViewAddressDescription = appCompatTextView;
        this.textViewAddressHeader = appCompatTextView2;
    }

    @NonNull
    public static AddressLookupOptionItemViewBinding bind(@NonNull View view) {
        int i11 = R.id.divider;
        View viewT = g.t(i11, view);
        if (viewT != null) {
            i11 = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) g.t(i11, view);
            if (progressBar != null) {
                i11 = R.id.textView_addressDescription;
                AppCompatTextView appCompatTextView = (AppCompatTextView) g.t(i11, view);
                if (appCompatTextView != null) {
                    i11 = R.id.textView_addressHeader;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) g.t(i11, view);
                    if (appCompatTextView2 != null) {
                        return new AddressLookupOptionItemViewBinding((ConstraintLayout) view, viewT, progressBar, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static AddressLookupOptionItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.address_lookup_option_item_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // sa.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AddressLookupOptionItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
