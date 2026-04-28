package com.adyen.checkout.card.internal.ui.view;

import androidx.recyclerview.widget.w;
import com.adyen.checkout.card.internal.ui.model.CardBrandItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardBrandItemDiffCallback;", "Landroidx/recyclerview/widget/w;", "Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;)Z", "areContentsTheSame", "", "getChangePayload", "(Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;)Ljava/lang/Object;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardBrandItemDiffCallback extends w {

    @NotNull
    public static final CardBrandItemDiffCallback INSTANCE = new CardBrandItemDiffCallback();

    private CardBrandItemDiffCallback() {
    }

    @Override // androidx.recyclerview.widget.w
    public boolean areContentsTheSame(@NotNull CardBrandItem oldItem, @NotNull CardBrandItem newItem) {
        oldItem.getClass();
        newItem.getClass();
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.w
    public boolean areItemsTheSame(@NotNull CardBrandItem oldItem, @NotNull CardBrandItem newItem) {
        oldItem.getClass();
        newItem.getClass();
        return Intrinsics.areEqual(oldItem.getBrand().getTxVariant(), newItem.getBrand().getTxVariant());
    }

    @Override // androidx.recyclerview.widget.w
    @Nullable
    public Object getChangePayload(@NotNull CardBrandItem oldItem, @NotNull CardBrandItem newItem) {
        oldItem.getClass();
        newItem.getClass();
        if (oldItem.isSelected() != newItem.isSelected()) {
            return Boolean.TRUE;
        }
        return null;
    }
}
