package com.adyen.checkout.cashapppay.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.adyen.checkout.cashapppay.databinding.CashAppPayButtonViewBinding;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.view.PayButton;
import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/view/CashAppPayButtonView;", "Lcom/adyen/checkout/ui/core/internal/ui/view/PayButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;Lv80/b0;)V", "", FeatureFlag.ENABLED, "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", TextBundle.TEXT_ENTRY, "setText", "(Ljava/lang/String;)V", "Lcom/adyen/checkout/cashapppay/databinding/CashAppPayButtonViewBinding;", "binding", "Lcom/adyen/checkout/cashapppay/databinding/CashAppPayButtonViewBinding;", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CashAppPayButtonView extends PayButton {

    @NotNull
    private final CashAppPayButtonViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        CashAppPayButtonViewBinding cashAppPayButtonViewBindingInflate = CashAppPayButtonViewBinding.inflate(LayoutInflater.from(context), this);
        cashAppPayButtonViewBindingInflate.getClass();
        this.binding = cashAppPayButtonViewBindingInflate;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton
    public void initialize(@NotNull ButtonDelegate delegate, @NotNull b0 coroutineScope) {
        delegate.getClass();
        coroutineScope.getClass();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton, android.view.View
    public void setEnabled(boolean enabled) {
        this.binding.payButton.setEnabled(enabled);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton, android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener listener) {
        this.binding.payButton.setOnClickListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashAppPayButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CashAppPayButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashAppPayButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton
    public void setText(@Nullable String text) {
    }
}
