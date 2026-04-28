package com.adyen.checkout.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.w;
import com.adyen.checkout.card.R;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class CardBrandItemBinding implements a {

    @NonNull
    public final RoundCornerImageView imageViewCardBrandLogo;

    @NonNull
    public final MaterialRadioButton radioButtonCardBrand;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView textViewCardBrandName;

    private CardBrandItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RoundCornerImageView roundCornerImageView, @NonNull MaterialRadioButton materialRadioButton, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.imageViewCardBrandLogo = roundCornerImageView;
        this.radioButtonCardBrand = materialRadioButton;
        this.textViewCardBrandName = appCompatTextView;
    }

    @NonNull
    public static CardBrandItemBinding bind(@NonNull View view) {
        int i11 = R.id.imageView_cardBrandLogo;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) g.t(i11, view);
        if (roundCornerImageView != null) {
            i11 = R.id.radioButton_cardBrand;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) g.t(i11, view);
            if (materialRadioButton != null) {
                i11 = R.id.textView_cardBrandName;
                AppCompatTextView appCompatTextView = (AppCompatTextView) g.t(i11, view);
                if (appCompatTextView != null) {
                    return new CardBrandItemBinding((ConstraintLayout) view, roundCornerImageView, materialRadioButton, appCompatTextView);
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static CardBrandItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.card_brand_item, viewGroup, false);
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
    public static CardBrandItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
