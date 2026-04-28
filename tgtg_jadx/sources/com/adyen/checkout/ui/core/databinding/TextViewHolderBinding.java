package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.ui.core.R;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class TextViewHolderBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView textView;

    private TextViewHolderBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.textView = textView2;
    }

    @NonNull
    public static TextViewHolderBinding bind(@NonNull View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new TextViewHolderBinding(textView, textView);
        }
        w.l("rootView");
        return null;
    }

    @NonNull
    public static TextViewHolderBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.text_view_holder, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // sa.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TextViewHolderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
