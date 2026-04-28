package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import c50.w;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class RecyclerListWithImageBinding implements a {

    @NonNull
    public final RoundCornerImageView imageViewLogo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatTextView textViewTitle;

    private RecyclerListWithImageBinding(@NonNull LinearLayout linearLayout, @NonNull RoundCornerImageView roundCornerImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.imageViewLogo = roundCornerImageView;
        this.textViewTitle = appCompatTextView;
    }

    @NonNull
    public static RecyclerListWithImageBinding bind(@NonNull View view) {
        int i11 = R.id.imageView_logo;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) g.t(i11, view);
        if (roundCornerImageView != null) {
            i11 = R.id.textView_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) g.t(i11, view);
            if (appCompatTextView != null) {
                return new RecyclerListWithImageBinding((LinearLayout) view, roundCornerImageView, appCompatTextView);
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static RecyclerListWithImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.recycler_list_with_image, viewGroup, false);
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
    public static RecyclerListWithImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
