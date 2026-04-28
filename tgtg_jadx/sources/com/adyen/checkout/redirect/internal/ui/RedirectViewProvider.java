package com.adyen.checkout.redirect.internal.ui;

import android.content.Context;
import android.view.LayoutInflater;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ViewProvider;
import com.adyen.checkout.ui.core.internal.ui.view.PaymentInProgressView;
import i4.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/redirect/internal/ui/RedirectViewProvider;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "()V", "getView", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "viewType", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "context", "Landroid/content/Context;", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RedirectViewProvider implements ViewProvider {

    @NotNull
    public static final RedirectViewProvider INSTANCE = new RedirectViewProvider();

    private RedirectViewProvider() {
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvider
    @NotNull
    public ComponentView getView(@NotNull ComponentViewType viewType, @NotNull Context context) {
        viewType.getClass();
        context.getClass();
        if (!Intrinsics.areEqual(viewType, RedirectComponentViewType.INSTANCE)) {
            a.f("Unsupported view type");
            return null;
        }
        return new PaymentInProgressView(context, null, 0, 6, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvider
    @NotNull
    public ComponentView getView(@NotNull ComponentViewType componentViewType, @NotNull LayoutInflater layoutInflater) {
        return ViewProvider.DefaultImpls.getView(this, componentViewType, layoutInflater);
    }
}
