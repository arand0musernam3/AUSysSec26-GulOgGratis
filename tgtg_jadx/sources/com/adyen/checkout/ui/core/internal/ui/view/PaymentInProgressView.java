package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.s;
import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.exception.CancellationException;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.databinding.ViewPaymentInProgressBinding;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/PaymentInProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/ui/core/databinding/ViewPaymentInProgressBinding;", "binding", "Lcom/adyen/checkout/ui/core/databinding/ViewPaymentInProgressBinding;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentInProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentInProgressView.kt\ncom/adyen/checkout/ui/core/internal/ui/view/PaymentInProgressView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class PaymentInProgressView extends ConstraintLayout implements ComponentView {

    @NotNull
    private final ViewPaymentInProgressBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentInProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        ViewPaymentInProgressBinding viewPaymentInProgressBindingInflate = ViewPaymentInProgressBinding.inflate(LayoutInflater.from(context), this);
        viewPaymentInProgressBindingInflate.getClass();
        this.binding = viewPaymentInProgressBindingInflate;
    }

    private final void initLocalizedStrings(Context localizedContext) {
        ViewPaymentInProgressBinding viewPaymentInProgressBinding = this.binding;
        TextView textView = viewPaymentInProgressBinding.textViewPaymentInProgressTitle;
        textView.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView, R.style.AdyenCheckout_PaymentInProgressView_TitleTextView, localizedContext, false, 4, null);
        TextView textView2 = viewPaymentInProgressBinding.textViewPaymentInProgressDescription;
        textView2.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView2, R.style.AdyenCheckout_PaymentInProgressView_DescriptionTextView, localizedContext, false, 4, null);
        MaterialButton materialButton = viewPaymentInProgressBinding.buttonPaymentInProgressCancel;
        materialButton.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(materialButton, R.style.AdyenCheckout_PaymentInProgressView_CancelButton, localizedContext, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ComponentDelegate componentDelegate, View view) {
        componentDelegate.getClass();
        ((ActionDelegate) componentDelegate).onError(new CancellationException("Payment in progress was cancelled"));
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof ActionDelegate)) {
            i4.a.f("Unsupported delegate type");
        } else {
            initLocalizedStrings(localizedContext);
            this.binding.buttonPaymentInProgressCancel.setOnClickListener(new s((ActionDelegate) delegate, 11));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentInProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ PaymentInProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void highlightValidationErrors() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentInProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
