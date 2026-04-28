package com.adyen.checkout.card.internal.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.adyen.checkout.card.internal.ui.CardComponentViewType;
import com.adyen.checkout.card.internal.ui.view.CardView;
import com.adyen.checkout.card.internal.ui.view.StoredCardView;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ViewProvider;
import com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView;
import i4.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardViewProvider;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "()V", "getView", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "viewType", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "context", "Landroid/content/Context;", "layoutInflater", "Landroid/view/LayoutInflater;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardViewProvider implements ViewProvider {

    @NotNull
    public static final CardViewProvider INSTANCE = new CardViewProvider();

    private CardViewProvider() {
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvider
    @NotNull
    public ComponentView getView(@NotNull ComponentViewType viewType, @NotNull LayoutInflater layoutInflater) {
        viewType.getClass();
        layoutInflater.getClass();
        if (viewType instanceof CardComponentViewType.DefaultCardView) {
            return new CardView(layoutInflater, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (viewType instanceof CardComponentViewType.StoredCardView) {
            Context context = layoutInflater.getContext();
            context.getClass();
            return new StoredCardView(context, null, 0, 6, null);
        }
        if (!(viewType instanceof CardComponentViewType.AddressLookup)) {
            a.f("Unsupported view type");
            return null;
        }
        Context context2 = layoutInflater.getContext();
        context2.getClass();
        return new AddressLookupView(context2, null, 0, 6, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvider
    @NotNull
    public ComponentView getView(@NotNull ComponentViewType viewType, @NotNull Context context) {
        viewType.getClass();
        context.getClass();
        if (viewType instanceof CardComponentViewType.DefaultCardView) {
            return new CardView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (viewType instanceof CardComponentViewType.StoredCardView) {
            return new StoredCardView(context, null, 0, 6, null);
        }
        if (!(viewType instanceof CardComponentViewType.AddressLookup)) {
            a.f("Unsupported view type");
            return null;
        }
        return new AddressLookupView(context, null, 0, 6, null);
    }
}
