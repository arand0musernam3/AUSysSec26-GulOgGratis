package com.adyen.checkout.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.card.R;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class BrandLogoBinding implements a {

    @NonNull
    public final RoundCornerImageView imageViewBrandLogo;

    @NonNull
    private final FrameLayout rootView;

    private BrandLogoBinding(@NonNull FrameLayout frameLayout, @NonNull RoundCornerImageView roundCornerImageView) {
        this.rootView = frameLayout;
        this.imageViewBrandLogo = roundCornerImageView;
    }

    @NonNull
    public static BrandLogoBinding bind(@NonNull View view) {
        int i11 = R.id.imageView_brandLogo;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) g.t(i11, view);
        if (roundCornerImageView != null) {
            return new BrandLogoBinding((FrameLayout) view, roundCornerImageView);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static BrandLogoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.brand_logo, viewGroup, false);
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
    public static BrandLogoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
