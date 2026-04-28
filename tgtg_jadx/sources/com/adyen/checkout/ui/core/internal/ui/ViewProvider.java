package com.adyen.checkout.ui.core.internal.ui;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "", "getView", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "viewType", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "context", "Landroid/content/Context;", "layoutInflater", "Landroid/view/LayoutInflater;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ViewProvider {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static ComponentView getView(@NotNull ViewProvider viewProvider, @NotNull ComponentViewType componentViewType, @NotNull LayoutInflater layoutInflater) {
            componentViewType.getClass();
            layoutInflater.getClass();
            Context context = layoutInflater.getContext();
            context.getClass();
            return viewProvider.getView(componentViewType, context);
        }
    }

    @NotNull
    ComponentView getView(@NotNull ComponentViewType viewType, @NotNull Context context);

    @NotNull
    ComponentView getView(@NotNull ComponentViewType viewType, @NotNull LayoutInflater layoutInflater);
}
