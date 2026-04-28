package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.w;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.ui.core.databinding.LogoViewHolderBinding;
import com.adyen.checkout.ui.core.databinding.TextViewHolderBinding;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.model.LogoTextItem;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0016\u0017\u0018B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/LogoTextAdapter;", "Landroidx/recyclerview/widget/b1;", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem;", "Landroidx/recyclerview/widget/r2;", "Landroid/content/Context;", "localizedContext", "<init>", "(Landroid/content/Context;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/r2;", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/r2;I)V", "Landroid/content/Context;", "LogoTextItemDiffCallback", "LogoViewHolder", "TextViewHolder", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LogoTextAdapter extends b1 {

    @NotNull
    private final Context localizedContext;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/LogoTextAdapter$LogoTextItemDiffCallback;", "Landroidx/recyclerview/widget/w;", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem;Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem;)Z", "areContentsTheSame", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogoTextItemDiffCallback extends w {

        @NotNull
        public static final LogoTextItemDiffCallback INSTANCE = new LogoTextItemDiffCallback();

        private LogoTextItemDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areContentsTheSame(@NotNull LogoTextItem oldItem, @NotNull LogoTextItem newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areItemsTheSame(@NotNull LogoTextItem oldItem, @NotNull LogoTextItem newItem) {
            oldItem.getClass();
            newItem.getClass();
            if (oldItem instanceof LogoTextItem.LogoItem) {
                String logoPath = ((LogoTextItem.LogoItem) oldItem).getLogoPath();
                LogoTextItem.LogoItem logoItem = newItem instanceof LogoTextItem.LogoItem ? (LogoTextItem.LogoItem) newItem : null;
                return Intrinsics.areEqual(logoPath, logoItem != null ? logoItem.getLogoPath() : null);
            }
            if (oldItem instanceof LogoTextItem.TextItem) {
                LogoTextItem.TextItem textItem = newItem instanceof LogoTextItem.TextItem ? (LogoTextItem.TextItem) newItem : null;
                return textItem != null && ((LogoTextItem.TextItem) oldItem).getTextResId() == textItem.getTextResId();
            }
            e40.a.f();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/LogoTextAdapter$LogoViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/ui/core/databinding/LogoViewHolderBinding;", "binding", "<init>", "(Lcom/adyen/checkout/ui/core/databinding/LogoViewHolderBinding;)V", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoItem;", "item", "", "bind", "(Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoItem;)V", "Lcom/adyen/checkout/ui/core/databinding/LogoViewHolderBinding;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogoViewHolder extends r2 {

        @NotNull
        private final LogoViewHolderBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoViewHolder(@NotNull LogoViewHolderBinding logoViewHolderBinding) {
            super(logoViewHolderBinding.getRoot());
            logoViewHolderBinding.getClass();
            this.binding = logoViewHolderBinding;
        }

        public final void bind(@NotNull LogoTextItem.LogoItem item) {
            item.getClass();
            RoundCornerImageView roundCornerImageView = this.binding.imageViewBrandLogo;
            roundCornerImageView.getClass();
            ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView, item.getEnvironment(), item.getLogoPath(), null, null, null, 0, 0, 124, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/LogoTextAdapter$TextViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/ui/core/databinding/TextViewHolderBinding;", "binding", "Landroid/content/Context;", "localizedContext", "<init>", "(Lcom/adyen/checkout/ui/core/databinding/TextViewHolderBinding;Landroid/content/Context;)V", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$TextItem;", "item", "", "bind", "(Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$TextItem;)V", "Lcom/adyen/checkout/ui/core/databinding/TextViewHolderBinding;", "Landroid/content/Context;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextViewHolder extends r2 {

        @NotNull
        private final TextViewHolderBinding binding;

        @NotNull
        private final Context localizedContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextViewHolder(@NotNull TextViewHolderBinding textViewHolderBinding, @NotNull Context context) {
            super(textViewHolderBinding.getRoot());
            textViewHolderBinding.getClass();
            context.getClass();
            this.binding = textViewHolderBinding;
            this.localizedContext = context;
        }

        public final void bind(@NotNull LogoTextItem.TextItem item) {
            item.getClass();
            this.binding.textView.setText(this.localizedContext.getString(item.getTextResId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoTextAdapter(@NotNull Context context) {
        super(LogoTextItemDiffCallback.INSTANCE);
        context.getClass();
        this.localizedContext = context;
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemViewType(int position) {
        return ((LogoTextItem) getCurrentList().get(position)).getViewType().getType();
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull r2 holder, int position) {
        holder.getClass();
        LogoTextItem logoTextItem = (LogoTextItem) getCurrentList().get(position);
        if (holder instanceof LogoViewHolder) {
            logoTextItem.getClass();
            ((LogoViewHolder) holder).bind((LogoTextItem.LogoItem) logoTextItem);
        } else if (holder instanceof TextViewHolder) {
            logoTextItem.getClass();
            ((TextViewHolder) holder).bind((LogoTextItem.TextItem) logoTextItem);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public r2 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == LogoTextItem.LogoTextItemViewType.Logo.getType()) {
            LogoViewHolderBinding logoViewHolderBindingInflate = LogoViewHolderBinding.inflate(layoutInflaterFrom, parent, false);
            logoViewHolderBindingInflate.getClass();
            return new LogoViewHolder(logoViewHolderBindingInflate);
        }
        if (viewType != LogoTextItem.LogoTextItemViewType.Text.getType()) {
            throw new CheckoutException(s.f(viewType, "Unexpected viewType on onCreateViewHolder - "), null, 2, null);
        }
        TextViewHolderBinding textViewHolderBindingInflate = TextViewHolderBinding.inflate(layoutInflaterFrom, parent, false);
        textViewHolderBindingInflate.getClass();
        return new TextViewHolder(textViewHolderBindingInflate, this.localizedContext);
    }
}
