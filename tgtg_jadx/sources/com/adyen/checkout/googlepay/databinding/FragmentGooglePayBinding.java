package com.adyen.checkout.googlepay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.googlepay.R;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentGooglePayBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    private FragmentGooglePayBinding(@NonNull FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @NonNull
    public static FragmentGooglePayBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentGooglePayBinding((FrameLayout) view);
        }
        w.l("rootView");
        return null;
    }

    @NonNull
    public static FragmentGooglePayBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_google_pay, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // sa.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentGooglePayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
