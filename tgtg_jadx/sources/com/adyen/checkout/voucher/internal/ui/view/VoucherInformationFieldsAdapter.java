package com.adyen.checkout.voucher.internal.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.w;
import com.adyen.checkout.voucher.databinding.FullVoucherInformationFieldBinding;
import com.adyen.checkout.voucher.internal.ui.model.VoucherInformationField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter;", "Landroidx/recyclerview/widget/b1;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;", "Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter$InformationFieldViewHolder;", "Landroid/content/Context;", "context", "localizedContext", "<init>", "(Landroid/content/Context;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter$InformationFieldViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter$InformationFieldViewHolder;I)V", "Landroid/content/Context;", "InformationFieldViewHolder", "InformationFieldsDiffCallback", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VoucherInformationFieldsAdapter extends b1 {

    @NotNull
    private final Context context;

    @NotNull
    private final Context localizedContext;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter$InformationFieldViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/voucher/databinding/FullVoucherInformationFieldBinding;", "binding", "Landroid/content/Context;", "localizedContext", "<init>", "(Lcom/adyen/checkout/voucher/databinding/FullVoucherInformationFieldBinding;Landroid/content/Context;)V", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;", "model", "", "bindItem", "(Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;)V", "Lcom/adyen/checkout/voucher/databinding/FullVoucherInformationFieldBinding;", "Landroid/content/Context;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InformationFieldViewHolder extends r2 {

        @NotNull
        private final FullVoucherInformationFieldBinding binding;

        @NotNull
        private final Context localizedContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InformationFieldViewHolder(@NotNull FullVoucherInformationFieldBinding fullVoucherInformationFieldBinding, @NotNull Context context) {
            super(fullVoucherInformationFieldBinding.getRoot());
            fullVoucherInformationFieldBinding.getClass();
            context.getClass();
            this.binding = fullVoucherInformationFieldBinding;
            this.localizedContext = context;
        }

        public final void bindItem(@NotNull VoucherInformationField model) {
            model.getClass();
            this.binding.textViewInformationLabel.setText(this.localizedContext.getString(model.getLabelResId()));
            this.binding.textViewInformationValue.setText(model.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter$InformationFieldsDiffCallback;", "Landroidx/recyclerview/widget/w;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;)Z", "areContentsTheSame", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InformationFieldsDiffCallback extends w {

        @NotNull
        public static final InformationFieldsDiffCallback INSTANCE = new InformationFieldsDiffCallback();

        private InformationFieldsDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areContentsTheSame(@NotNull VoucherInformationField oldItem, @NotNull VoucherInformationField newItem) {
            oldItem.getClass();
            newItem.getClass();
            return areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areItemsTheSame(@NotNull VoucherInformationField oldItem, @NotNull VoucherInformationField newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoucherInformationFieldsAdapter(@NotNull Context context, @NotNull Context context2) {
        super(InformationFieldsDiffCallback.INSTANCE);
        context.getClass();
        context2.getClass();
        this.context = context;
        this.localizedContext = context2;
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull InformationFieldViewHolder holder, int position) {
        holder.getClass();
        VoucherInformationField voucherInformationField = (VoucherInformationField) getCurrentList().get(position);
        voucherInformationField.getClass();
        holder.bindItem(voucherInformationField);
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public InformationFieldViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        FullVoucherInformationFieldBinding fullVoucherInformationFieldBindingInflate = FullVoucherInformationFieldBinding.inflate(LayoutInflater.from(this.context), parent, false);
        fullVoucherInformationFieldBindingInflate.getClass();
        return new InformationFieldViewHolder(fullVoucherInformationFieldBindingInflate, this.localizedContext);
    }
}
