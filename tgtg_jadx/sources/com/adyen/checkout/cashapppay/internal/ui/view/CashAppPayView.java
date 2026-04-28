package com.adyen.checkout.cashapppay.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.adyen.checkout.card.internal.ui.view.c;
import com.adyen.checkout.cashapppay.databinding.CashAppPayViewBinding;
import com.adyen.checkout.cashapppay.internal.ui.CashAppPayDelegate;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayComponentParams;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayInputData;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import i4.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001f¨\u0006 "}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/view/CashAppPayView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "initSwitch", "()V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/cashapppay/databinding/CashAppPayViewBinding;", "binding", "Lcom/adyen/checkout/cashapppay/databinding/CashAppPayViewBinding;", "Lcom/adyen/checkout/cashapppay/internal/ui/CashAppPayDelegate;", "Lcom/adyen/checkout/cashapppay/internal/ui/CashAppPayDelegate;", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashAppPayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashAppPayView.kt\ncom/adyen/checkout/cashapppay/internal/ui/view/CashAppPayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,71:1\n1#2:72\n256#3,2:73\n*S KotlinDebug\n*F\n+ 1 CashAppPayView.kt\ncom/adyen/checkout/cashapppay/internal/ui/view/CashAppPayView\n*L\n60#1:73,2\n*E\n"})
public final class CashAppPayView extends LinearLayout implements ComponentView {

    @NotNull
    private final CashAppPayViewBinding binding;
    private CashAppPayDelegate delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        CashAppPayViewBinding cashAppPayViewBindingInflate = CashAppPayViewBinding.inflate(LayoutInflater.from(context), this);
        cashAppPayViewBindingInflate.getClass();
        this.binding = cashAppPayViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, 0);
    }

    private final void initLocalizedStrings(Context localizedContext) {
        SwitchCompat switchCompat = this.binding.switchStorePaymentMethod;
        switchCompat.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(switchCompat, com.adyen.checkout.cashapppay.R.style.AdyenCheckout_CashAppPay_StorePaymentSwitch, localizedContext, false, 4, null);
    }

    private final void initSwitch() {
        SwitchCompat switchCompat = this.binding.switchStorePaymentMethod;
        switchCompat.getClass();
        CashAppPayDelegate cashAppPayDelegate = this.delegate;
        if (cashAppPayDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            cashAppPayDelegate = null;
        }
        ComponentParams componentParams = cashAppPayDelegate.getComponentParams();
        componentParams.getClass();
        switchCompat.setVisibility(((CashAppPayComponentParams) componentParams).getShowStorePaymentField() ? 0 : 8);
        this.binding.switchStorePaymentMethod.setOnCheckedChangeListener(new c(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSwitch$lambda$1(CashAppPayView cashAppPayView, CompoundButton compoundButton, final boolean z11) {
        cashAppPayView.getClass();
        CashAppPayDelegate cashAppPayDelegate = cashAppPayView.delegate;
        if (cashAppPayDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            cashAppPayDelegate = null;
        }
        cashAppPayDelegate.updateInputData(new Function1<CashAppPayInputData, Unit>() { // from class: com.adyen.checkout.cashapppay.internal.ui.view.CashAppPayView$initSwitch$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CashAppPayInputData cashAppPayInputData) {
                cashAppPayInputData.getClass();
                cashAppPayInputData.setStorePaymentSelected(z11);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CashAppPayInputData) obj);
                return Unit.f26487a;
            }
        });
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof CashAppPayDelegate)) {
            a.f("Unsupported delegate type");
            return;
        }
        this.delegate = (CashAppPayDelegate) delegate;
        initLocalizedStrings(localizedContext);
        initSwitch();
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
    public CashAppPayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CashAppPayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashAppPayView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
