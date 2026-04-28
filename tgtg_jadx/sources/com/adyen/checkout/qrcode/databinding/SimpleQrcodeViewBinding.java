package com.adyen.checkout.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.qrcode.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleQrcodeViewBinding implements a {

    @NonNull
    public final MaterialButton copyButton;

    @NonNull
    public final ImageView imageViewLogo;

    @NonNull
    public final ImageView imageViewQrcode;

    @NonNull
    public final LinearProgressIndicator progressIndicator;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView textViewTimer;

    @NonNull
    public final TextView textViewTopLabel;

    @NonNull
    public final TextView textviewAmount;

    @NonNull
    public final TextView textviewCode;

    private SimpleQrcodeViewBinding(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = view;
        this.copyButton = materialButton;
        this.imageViewLogo = imageView;
        this.imageViewQrcode = imageView2;
        this.progressIndicator = linearProgressIndicator;
        this.textViewTimer = textView;
        this.textViewTopLabel = textView2;
        this.textviewAmount = textView3;
        this.textviewCode = textView4;
    }

    @NonNull
    public static SimpleQrcodeViewBinding bind(@NonNull View view) {
        int i11 = R.id.copyButton;
        MaterialButton materialButton = (MaterialButton) g.t(i11, view);
        if (materialButton != null) {
            i11 = R.id.imageView_logo;
            ImageView imageView = (ImageView) g.t(i11, view);
            if (imageView != null) {
                i11 = R.id.imageView_qrcode;
                ImageView imageView2 = (ImageView) g.t(i11, view);
                if (imageView2 != null) {
                    i11 = R.id.progress_indicator;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) g.t(i11, view);
                    if (linearProgressIndicator != null) {
                        i11 = R.id.textView_timer;
                        TextView textView = (TextView) g.t(i11, view);
                        if (textView != null) {
                            i11 = R.id.textView_top_label;
                            TextView textView2 = (TextView) g.t(i11, view);
                            if (textView2 != null) {
                                i11 = R.id.textview_amount;
                                TextView textView3 = (TextView) g.t(i11, view);
                                if (textView3 != null) {
                                    i11 = R.id.textview_code;
                                    TextView textView4 = (TextView) g.t(i11, view);
                                    if (textView4 != null) {
                                        return new SimpleQrcodeViewBinding(view, materialButton, imageView, imageView2, linearProgressIndicator, textView, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static SimpleQrcodeViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.simple_qrcode_view, viewGroup);
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
