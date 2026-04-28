package com.adyen.checkout.ui.core.internal.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.w;
import bg.n0;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.ui.core.databinding.AddressLookupOptionItemViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter;", "Landroidx/recyclerview/widget/b1;", "Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter$AddressLookupOptionViewHolder;", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/LookupAddress;", "", "onItemClicked", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter$AddressLookupOptionViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter$AddressLookupOptionViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "AddressLookupOptionDiffCallback", "AddressLookupOptionViewHolder", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddressLookupOptionsAdapter extends b1 {

    @NotNull
    private final Function1<LookupAddress, Unit> onItemClicked;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter$AddressLookupOptionDiffCallback;", "Landroidx/recyclerview/widget/w;", "Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;)Z", "areContentsTheSame", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AddressLookupOptionDiffCallback extends w {

        @NotNull
        public static final AddressLookupOptionDiffCallback INSTANCE = new AddressLookupOptionDiffCallback();

        private AddressLookupOptionDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areContentsTheSame(@NotNull LookupOption oldItem, @NotNull LookupOption newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areItemsTheSame(@NotNull LookupOption oldItem, @NotNull LookupOption newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem.getLookupAddress().getId(), newItem.getLookupAddress().getId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter$AddressLookupOptionViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/ui/core/databinding/AddressLookupOptionItemViewBinding;", "binding", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/LookupAddress;", "", "onItemClicked", "<init>", "(Lcom/adyen/checkout/ui/core/databinding/AddressLookupOptionItemViewBinding;Lkotlin/jvm/functions/Function1;)V", "Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;", "lookupOption", "bindItem", "(Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;)V", "Lcom/adyen/checkout/ui/core/databinding/AddressLookupOptionItemViewBinding;", "Lkotlin/jvm/functions/Function1;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAddressLookupOptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLookupOptionsAdapter.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter$AddressLookupOptionViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,91:1\n256#2,2:92\n*S KotlinDebug\n*F\n+ 1 AddressLookupOptionsAdapter.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter$AddressLookupOptionViewHolder\n*L\n45#1:92,2\n*E\n"})
    public static final class AddressLookupOptionViewHolder extends r2 {

        @NotNull
        private final AddressLookupOptionItemViewBinding binding;

        @NotNull
        private final Function1<LookupAddress, Unit> onItemClicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddressLookupOptionViewHolder(@NotNull AddressLookupOptionItemViewBinding addressLookupOptionItemViewBinding, @NotNull Function1<? super LookupAddress, Unit> function1) {
            super(addressLookupOptionItemViewBinding.getRoot());
            addressLookupOptionItemViewBinding.getClass();
            function1.getClass();
            this.binding = addressLookupOptionItemViewBinding;
            this.onItemClicked = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(AddressLookupOptionViewHolder addressLookupOptionViewHolder, LookupOption lookupOption, View view) {
            addressLookupOptionViewHolder.getClass();
            lookupOption.getClass();
            addressLookupOptionViewHolder.onItemClicked.invoke(lookupOption.getLookupAddress());
        }

        public final void bindItem(@NotNull LookupOption lookupOption) {
            lookupOption.getClass();
            this.binding.getRoot().setOnClickListener(new n0(8, this, lookupOption));
            ProgressBar progressBar = this.binding.progressBar;
            progressBar.getClass();
            progressBar.setVisibility(lookupOption.isLoading() ? 0 : 8);
            this.binding.textViewAddressHeader.setText(lookupOption.getTitle());
            this.binding.textViewAddressDescription.setText(lookupOption.getSubtitle());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressLookupOptionsAdapter(@NotNull Function1<? super LookupAddress, Unit> function1) {
        super(AddressLookupOptionDiffCallback.INSTANCE);
        function1.getClass();
        this.onItemClicked = function1;
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull AddressLookupOptionViewHolder holder, int position) {
        holder.getClass();
        Object obj = getCurrentList().get(position);
        obj.getClass();
        holder.bindItem((LookupOption) obj);
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public AddressLookupOptionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        AddressLookupOptionItemViewBinding addressLookupOptionItemViewBindingInflate = AddressLookupOptionItemViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        addressLookupOptionItemViewBindingInflate.getClass();
        return new AddressLookupOptionViewHolder(addressLookupOptionItemViewBindingInflate, this.onItemClicked);
    }
}
