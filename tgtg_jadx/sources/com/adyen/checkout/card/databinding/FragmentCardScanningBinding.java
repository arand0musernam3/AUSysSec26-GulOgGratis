package com.adyen.checkout.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.card.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentCardScanningBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView scanButton;

    private FragmentCardScanningBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView) {
        this.rootView = linearLayout;
        this.scanButton = imageView;
    }

    @NonNull
    public static FragmentCardScanningBinding bind(@NonNull View view) {
        int i11 = R.id.scan_button;
        ImageView imageView = (ImageView) g.t(i11, view);
        if (imageView != null) {
            return new FragmentCardScanningBinding((LinearLayout) view, imageView);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static FragmentCardScanningBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_card_scanning, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // sa.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentCardScanningBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
