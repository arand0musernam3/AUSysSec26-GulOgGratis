package com.adyen.checkout.card.internal.ui.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.w;
import com.adyen.checkout.card.databinding.BrandLogoBinding;
import com.adyen.checkout.card.internal.ui.model.CardListItem;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u0011\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter;", "Landroidx/recyclerview/widget/b1;", "Lcom/adyen/checkout/card/internal/ui/model/CardListItem;", "Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter$ImageViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter$ImageViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter$ImageViewHolder;I)V", "Companion", "CardDiffCallback", "ImageViewHolder", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardListAdapter extends b1 {
    private static final float VIEW_ALPHA_DETECTED = 1.0f;
    private static final float VIEW_ALPHA_NON_DETECTED = 0.2f;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter$CardDiffCallback;", "Landroidx/recyclerview/widget/w;", "Lcom/adyen/checkout/card/internal/ui/model/CardListItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/adyen/checkout/card/internal/ui/model/CardListItem;Lcom/adyen/checkout/card/internal/ui/model/CardListItem;)Z", "areContentsTheSame", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CardDiffCallback extends w {

        @NotNull
        public static final CardDiffCallback INSTANCE = new CardDiffCallback();

        private CardDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areContentsTheSame(@NotNull CardListItem oldItem, @NotNull CardListItem newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areItemsTheSame(@NotNull CardListItem oldItem, @NotNull CardListItem newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem.getCardBrand().getTxVariant(), newItem.getCardBrand().getTxVariant());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/card/databinding/BrandLogoBinding;", "binding", "<init>", "(Lcom/adyen/checkout/card/databinding/BrandLogoBinding;)V", "Lcom/adyen/checkout/card/internal/ui/model/CardListItem;", "card", "", "alpha", "", "bind", "(Lcom/adyen/checkout/card/internal/ui/model/CardListItem;F)V", "Lcom/adyen/checkout/card/databinding/BrandLogoBinding;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageViewHolder extends r2 {

        @NotNull
        private final BrandLogoBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(@NotNull BrandLogoBinding brandLogoBinding) {
            super(brandLogoBinding.getRoot());
            brandLogoBinding.getClass();
            this.binding = brandLogoBinding;
        }

        public final void bind(@NotNull CardListItem card, float alpha) {
            card.getClass();
            this.binding.imageViewBrandLogo.setAlpha(alpha);
            RoundCornerImageView roundCornerImageView = this.binding.imageViewBrandLogo;
            roundCornerImageView.getClass();
            ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView, card.getEnvironment(), card.getCardBrand().getTxVariant(), null, null, null, 0, 0, 124, null);
        }
    }

    public CardListAdapter() {
        super(CardDiffCallback.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull ImageViewHolder holder, int position) {
        holder.getClass();
        CardListItem cardListItem = (CardListItem) getCurrentList().get(position);
        holder.bind(cardListItem, cardListItem.isDetected() ? VIEW_ALPHA_DETECTED : VIEW_ALPHA_NON_DETECTED);
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public ImageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        BrandLogoBinding brandLogoBindingInflate = BrandLogoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        brandLogoBindingInflate.getClass();
        return new ImageViewHolder(brandLogoBindingInflate);
    }
}
