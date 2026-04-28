package com.adyen.checkout.await.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.await.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AwaitViewBinding implements a {

    @NonNull
    public final ImageView imageViewLogo;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView textViewOpenApp;

    @NonNull
    public final TextView textViewWaitingConfirmation;

    private AwaitViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.imageViewLogo = imageView;
        this.textViewOpenApp = textView;
        this.textViewWaitingConfirmation = textView2;
    }

    @NonNull
    public static AwaitViewBinding bind(@NonNull View view) {
        int i11 = R.id.imageView_logo;
        ImageView imageView = (ImageView) g.t(i11, view);
        if (imageView != null) {
            i11 = R.id.textView_open_app;
            TextView textView = (TextView) g.t(i11, view);
            if (textView != null) {
                i11 = R.id.textView_waiting_confirmation;
                TextView textView2 = (TextView) g.t(i11, view);
                if (textView2 != null) {
                    return new AwaitViewBinding(view, imageView, textView, textView2);
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static AwaitViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.await_view, viewGroup);
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
