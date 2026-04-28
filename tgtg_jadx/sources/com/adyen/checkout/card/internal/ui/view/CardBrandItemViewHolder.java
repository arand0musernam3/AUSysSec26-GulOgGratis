package com.adyen.checkout.card.internal.ui.view;

import android.view.View;
import androidx.recyclerview.widget.r2;
import bg.n0;
import com.adyen.checkout.card.databinding.CardBrandItemBinding;
import com.adyen.checkout.card.internal.ui.model.CardBrandItem;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardBrandItemViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/card/databinding/CardBrandItemBinding;", "binding", "<init>", "(Lcom/adyen/checkout/card/databinding/CardBrandItemBinding;)V", "Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;", "cardBrandItem", "Lkotlin/Function1;", "", "onItemClicked", "bind", "(Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;Lkotlin/jvm/functions/Function1;)V", "", "isSelected", "bindSelectedState", "(Z)V", "Lcom/adyen/checkout/card/databinding/CardBrandItemBinding;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardBrandItemViewHolder extends r2 {

    @NotNull
    private final CardBrandItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandItemViewHolder(@NotNull CardBrandItemBinding cardBrandItemBinding) {
        super(cardBrandItemBinding.getRoot());
        cardBrandItemBinding.getClass();
        this.binding = cardBrandItemBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function1 function1, CardBrandItem cardBrandItem, View view) {
        function1.getClass();
        cardBrandItem.getClass();
        function1.invoke(cardBrandItem);
    }

    public final void bind(@NotNull CardBrandItem cardBrandItem, @NotNull Function1<? super CardBrandItem, Unit> onItemClicked) {
        cardBrandItem.getClass();
        onItemClicked.getClass();
        this.binding.getRoot().setOnClickListener(new n0(4, onItemClicked, cardBrandItem));
        RoundCornerImageView roundCornerImageView = this.binding.imageViewCardBrandLogo;
        roundCornerImageView.getClass();
        ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView, cardBrandItem.getEnvironment(), cardBrandItem.getBrand().getTxVariant(), null, null, null, 0, 0, 124, null);
        this.binding.textViewCardBrandName.setText(cardBrandItem.getName());
        this.binding.radioButtonCardBrand.setChecked(cardBrandItem.isSelected());
    }

    public final void bindSelectedState(boolean isSelected) {
        this.binding.radioButtonCardBrand.setChecked(isSelected);
    }
}
