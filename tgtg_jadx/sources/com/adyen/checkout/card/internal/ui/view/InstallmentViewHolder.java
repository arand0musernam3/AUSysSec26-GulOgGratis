package com.adyen.checkout.card.internal.ui.view;

import android.content.Context;
import androidx.recyclerview.widget.r2;
import com.adyen.checkout.card.databinding.InstallmentViewBinding;
import com.adyen.checkout.card.internal.util.InstallmentUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/InstallmentViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/card/databinding/InstallmentViewBinding;", "binding", "Landroid/content/Context;", "localizedContext", "<init>", "(Lcom/adyen/checkout/card/databinding/InstallmentViewBinding;Landroid/content/Context;)V", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "installmentModel", "", "bindItem", "(Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;)V", "Lcom/adyen/checkout/card/databinding/InstallmentViewBinding;", "Landroid/content/Context;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InstallmentViewHolder extends r2 {

    @NotNull
    private final InstallmentViewBinding binding;

    @NotNull
    private final Context localizedContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentViewHolder(@NotNull InstallmentViewBinding installmentViewBinding, @NotNull Context context) {
        super(installmentViewBinding.getRoot());
        installmentViewBinding.getClass();
        context.getClass();
        this.binding = installmentViewBinding;
        this.localizedContext = context;
    }

    public final void bindItem(@NotNull InstallmentModel installmentModel) {
        installmentModel.getClass();
        this.binding.textViewInstallmentOption.setText(InstallmentUtils.INSTANCE.getTextForInstallmentOption(this.localizedContext, installmentModel));
    }
}
