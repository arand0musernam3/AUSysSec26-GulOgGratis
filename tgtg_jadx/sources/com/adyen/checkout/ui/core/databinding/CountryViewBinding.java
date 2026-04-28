package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.ui.core.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class CountryViewBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView textViewCountry;

    @NonNull
    public final TextView textViewCountryCode;

    private CountryViewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.textViewCountry = textView;
        this.textViewCountryCode = textView2;
    }

    @NonNull
    public static CountryViewBinding bind(@NonNull View view) {
        int i11 = R.id.textView_country;
        TextView textView = (TextView) g.t(i11, view);
        if (textView != null) {
            i11 = R.id.textView_countryCode;
            TextView textView2 = (TextView) g.t(i11, view);
            if (textView2 != null) {
                return new CountryViewBinding((LinearLayout) view, textView, textView2);
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static CountryViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.country_view, viewGroup, false);
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
    public static CountryViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
