package com.adyen.checkout.redirect.internal.ui;

import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ViewProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/redirect/internal/ui/RedirectComponentViewType;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "()V", "viewProvider", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "getViewProvider", "()Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RedirectComponentViewType implements ComponentViewType {

    @NotNull
    public static final RedirectComponentViewType INSTANCE = new RedirectComponentViewType();

    @NotNull
    private static final ViewProvider viewProvider = RedirectViewProvider.INSTANCE;

    private RedirectComponentViewType() {
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentViewType
    @NotNull
    public ViewProvider getViewProvider() {
        return viewProvider;
    }
}
