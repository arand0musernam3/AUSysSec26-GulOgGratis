package com.adyen.checkout.ui.core.internal.ui;

import androidx.recyclerview.widget.r2;
import com.adyen.checkout.ui.core.databinding.TextItemViewBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/TextViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/ui/core/databinding/TextItemViewBinding;", "binding", "<init>", "(Lcom/adyen/checkout/ui/core/databinding/TextItemViewBinding;)V", "Lcom/adyen/checkout/ui/core/internal/ui/TextListItem;", "item", "", "bindItem", "(Lcom/adyen/checkout/ui/core/internal/ui/TextListItem;)V", "Lcom/adyen/checkout/ui/core/databinding/TextItemViewBinding;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextViewHolder extends r2 {

    @NotNull
    private final TextItemViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewHolder(@NotNull TextItemViewBinding textItemViewBinding) {
        super(textItemViewBinding.getRoot());
        textItemViewBinding.getClass();
        this.binding = textItemViewBinding;
    }

    public final void bindItem(@NotNull TextListItem item) {
        item.getClass();
        this.binding.textViewTitle.setText(item.getText());
    }
}
