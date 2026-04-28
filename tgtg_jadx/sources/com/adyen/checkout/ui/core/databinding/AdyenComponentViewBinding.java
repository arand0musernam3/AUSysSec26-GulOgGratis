package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.ui.core.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AdyenComponentViewBinding implements a {

    @NonNull
    public final FrameLayout frameLayoutButtonContainer;

    @NonNull
    public final FrameLayout frameLayoutComponentContainer;

    @NonNull
    private final View rootView;

    private AdyenComponentViewBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = view;
        this.frameLayoutButtonContainer = frameLayout;
        this.frameLayoutComponentContainer = frameLayout2;
    }

    @NonNull
    public static AdyenComponentViewBinding bind(@NonNull View view) {
        int i11 = R.id.frameLayout_buttonContainer;
        FrameLayout frameLayout = (FrameLayout) g.t(i11, view);
        if (frameLayout != null) {
            i11 = R.id.frameLayout_componentContainer;
            FrameLayout frameLayout2 = (FrameLayout) g.t(i11, view);
            if (frameLayout2 != null) {
                return new AdyenComponentViewBinding(view, frameLayout, frameLayout2);
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static AdyenComponentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.adyen_component_view, viewGroup);
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
