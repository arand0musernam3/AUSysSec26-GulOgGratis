package com.adyen.checkout.issuerlist.internal.ui.view;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.r2;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.ui.core.databinding.SpinnerListWithImageBinding;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerViewHolder;", "Landroidx/recyclerview/widget/r2;", "Lcom/adyen/checkout/ui/core/databinding/SpinnerListWithImageBinding;", "binding", "", "paymentMethod", "", "hideIssuerLogo", "<init>", "(Lcom/adyen/checkout/ui/core/databinding/SpinnerListWithImageBinding;Ljava/lang/String;Z)V", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "model", "", "bind", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;)V", "Lcom/adyen/checkout/ui/core/databinding/SpinnerListWithImageBinding;", "Ljava/lang/String;", "Z", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIssuerListSpinnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuerListSpinnerAdapter.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n256#2,2:78\n*S KotlinDebug\n*F\n+ 1 IssuerListSpinnerAdapter.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerViewHolder\n*L\n73#1:78,2\n*E\n"})
public final class IssuerListSpinnerViewHolder extends r2 {

    @NotNull
    private final SpinnerListWithImageBinding binding;
    private final boolean hideIssuerLogo;

    @NotNull
    private final String paymentMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuerListSpinnerViewHolder(@NotNull SpinnerListWithImageBinding spinnerListWithImageBinding, @NotNull String str, boolean z11) {
        super(spinnerListWithImageBinding.getRoot());
        spinnerListWithImageBinding.getClass();
        str.getClass();
        this.binding = spinnerListWithImageBinding;
        this.paymentMethod = str;
        this.hideIssuerLogo = z11;
    }

    public final void bind(@NotNull IssuerModel model) {
        model.getClass();
        this.binding.textViewTitle.setText(model.getName());
        boolean z11 = this.hideIssuerLogo;
        SpinnerListWithImageBinding spinnerListWithImageBinding = this.binding;
        if (z11) {
            AppCompatImageView appCompatImageView = spinnerListWithImageBinding.imageViewLogo;
            appCompatImageView.getClass();
            appCompatImageView.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView2 = spinnerListWithImageBinding.imageViewLogo;
            appCompatImageView2.getClass();
            ImageLoadingExtensionsKt.loadLogo$default(appCompatImageView2, model.getEnvironment(), this.paymentMethod, model.getId(), null, null, 0, 0, 120, null);
        }
    }
}
