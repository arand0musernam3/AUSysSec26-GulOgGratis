package com.adyen.checkout.card.internal.ui.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.r2;
import com.adyen.checkout.card.databinding.CardBrandItemBinding;
import com.adyen.checkout.card.internal.ui.model.CardBrandItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardBrandAdapter;", "Landroidx/recyclerview/widget/b1;", "Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;", "Lcom/adyen/checkout/card/internal/ui/view/CardBrandItemViewHolder;", "Lkotlin/Function1;", "", "onItemClicked", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adyen/checkout/card/internal/ui/view/CardBrandItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/adyen/checkout/card/internal/ui/view/CardBrandItemViewHolder;I)V", "", "", "payloads", "(Lcom/adyen/checkout/card/internal/ui/view/CardBrandItemViewHolder;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardBrandAdapter extends b1 {

    @NotNull
    private final Function1<CardBrandItem, Unit> onItemClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardBrandAdapter(@NotNull Function1<? super CardBrandItem, Unit> function1) {
        super(CardBrandItemDiffCallback.INSTANCE);
        function1.getClass();
        this.onItemClicked = function1;
    }

    public void onBindViewHolder(@NotNull CardBrandItemViewHolder holder, int position, @NotNull List<Object> payloads) {
        holder.getClass();
        payloads.getClass();
        if (payloads.isEmpty()) {
            super.onBindViewHolder((r2) holder, position, payloads);
        } else if (Intrinsics.areEqual(CollectionsKt.firstOrNull(payloads), Boolean.TRUE)) {
            holder.bindSelectedState(((CardBrandItem) getCurrentList().get(position)).isSelected());
        }
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public CardBrandItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        CardBrandItemBinding cardBrandItemBindingInflate = CardBrandItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        cardBrandItemBindingInflate.getClass();
        return new CardBrandItemViewHolder(cardBrandItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.l1
    public /* bridge */ /* synthetic */ void onBindViewHolder(r2 r2Var, int i11, List list) {
        onBindViewHolder((CardBrandItemViewHolder) r2Var, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull CardBrandItemViewHolder holder, int position) {
        holder.getClass();
        CardBrandItem cardBrandItem = (CardBrandItem) getCurrentList().get(position);
        cardBrandItem.getClass();
        holder.bind(cardBrandItem, this.onItemClicked);
    }
}
