package com.adyen.checkout.issuerlist.internal.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.w;
import bg.n0;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.ui.core.databinding.RecyclerListWithImageBinding;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter;", "Landroidx/recyclerview/widget/b1;", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter$IssuerViewHolder;", "", "paymentMethod", "", "hideIssuerLogo", "Lkotlin/Function1;", "", "onItemClicked", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter$IssuerViewHolder;", "viewHolder", "position", "onBindViewHolder", "(Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter$IssuerViewHolder;I)V", "Ljava/lang/String;", "Z", "Lkotlin/jvm/functions/Function1;", "IssuerDiffCallBack", "IssuerViewHolder", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IssuerListRecyclerAdapter extends b1 {
    private final boolean hideIssuerLogo;

    @NotNull
    private final Function1<IssuerModel, Unit> onItemClicked;

    @NotNull
    private final String paymentMethod;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter$IssuerDiffCallBack;", "Landroidx/recyclerview/widget/w;", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;)Z", "areContentsTheSame", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IssuerDiffCallBack extends w {

        @NotNull
        public static final IssuerDiffCallBack INSTANCE = new IssuerDiffCallBack();

        private IssuerDiffCallBack() {
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areContentsTheSame(@NotNull IssuerModel oldItem, @NotNull IssuerModel newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areItemsTheSame(@NotNull IssuerModel oldItem, @NotNull IssuerModel newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter$IssuerViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/ui/core/databinding/RecyclerListWithImageBinding;", "binding", "", "hideIssuerLogo", "<init>", "(Lcom/adyen/checkout/ui/core/databinding/RecyclerListWithImageBinding;Z)V", "", "paymentMethod", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "issuerModel", "Lkotlin/Function1;", "", "onItemClicked", "bind", "(Ljava/lang/String;Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;ZLkotlin/jvm/functions/Function1;)V", "Lcom/adyen/checkout/ui/core/databinding/RecyclerListWithImageBinding;", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIssuerListRecyclerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuerListRecyclerAdapter.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter$IssuerViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n256#2,2:73\n*S KotlinDebug\n*F\n+ 1 IssuerListRecyclerAdapter.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerAdapter$IssuerViewHolder\n*L\n42#1:73,2\n*E\n"})
    public static final class IssuerViewHolder extends r2 {

        @NotNull
        private final RecyclerListWithImageBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IssuerViewHolder(@NotNull RecyclerListWithImageBinding recyclerListWithImageBinding, boolean z11) {
            super(recyclerListWithImageBinding.getRoot());
            recyclerListWithImageBinding.getClass();
            this.binding = recyclerListWithImageBinding;
            RoundCornerImageView roundCornerImageView = recyclerListWithImageBinding.imageViewLogo;
            roundCornerImageView.getClass();
            roundCornerImageView.setVisibility(!z11 ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(Function1 function1, IssuerModel issuerModel, View view) {
            function1.getClass();
            issuerModel.getClass();
            function1.invoke(issuerModel);
        }

        public final void bind(@NotNull String paymentMethod, @NotNull IssuerModel issuerModel, boolean hideIssuerLogo, @NotNull Function1<? super IssuerModel, Unit> onItemClicked) {
            paymentMethod.getClass();
            issuerModel.getClass();
            onItemClicked.getClass();
            this.binding.getRoot().setOnClickListener(new n0(5, onItemClicked, issuerModel));
            this.binding.textViewTitle.setText(issuerModel.getName());
            if (hideIssuerLogo) {
                return;
            }
            RoundCornerImageView roundCornerImageView = this.binding.imageViewLogo;
            roundCornerImageView.getClass();
            ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView, issuerModel.getEnvironment(), paymentMethod, issuerModel.getId(), null, null, 0, 0, 120, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IssuerListRecyclerAdapter(@NotNull String str, boolean z11, @NotNull Function1<? super IssuerModel, Unit> function1) {
        super(IssuerDiffCallBack.INSTANCE);
        str.getClass();
        function1.getClass();
        this.paymentMethod = str;
        this.hideIssuerLogo = z11;
        this.onItemClicked = function1;
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull IssuerViewHolder viewHolder, int position) {
        viewHolder.getClass();
        String str = this.paymentMethod;
        Object obj = getCurrentList().get(position);
        obj.getClass();
        viewHolder.bind(str, (IssuerModel) obj, this.hideIssuerLogo, this.onItemClicked);
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public IssuerViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
        viewGroup.getClass();
        RecyclerListWithImageBinding recyclerListWithImageBindingInflate = RecyclerListWithImageBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        recyclerListWithImageBindingInflate.getClass();
        return new IssuerViewHolder(recyclerListWithImageBindingInflate, this.hideIssuerLogo);
    }
}
