package com.adyen.checkout.ui.core.internal.ui;

import android.content.Context;
import androidx.recyclerview.widget.r2;
import com.adyen.checkout.ui.core.databinding.TextItemViewBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/content/Context;", "localizedContext", "Lcom/adyen/checkout/ui/core/databinding/TextItemViewBinding;", "binding", "<init>", "(Landroid/content/Context;Lcom/adyen/checkout/ui/core/databinding/TextItemViewBinding;)V", "Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListItem;", "item", "", "bindItem", "(Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListItem;)V", "Landroid/content/Context;", "Lcom/adyen/checkout/ui/core/databinding/TextItemViewBinding;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocalizedTextViewHolder extends r2 {

    @NotNull
    private final TextItemViewBinding binding;

    @NotNull
    private final Context localizedContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizedTextViewHolder(@NotNull Context context, @NotNull TextItemViewBinding textItemViewBinding) {
        super(textItemViewBinding.getRoot());
        context.getClass();
        textItemViewBinding.getClass();
        this.localizedContext = context;
        this.binding = textItemViewBinding;
    }

    public final void bindItem(@NotNull LocalizedTextListItem item) {
        item.getClass();
        this.binding.textViewTitle.setText(this.localizedContext.getString(item.getTextResId()));
    }
}
