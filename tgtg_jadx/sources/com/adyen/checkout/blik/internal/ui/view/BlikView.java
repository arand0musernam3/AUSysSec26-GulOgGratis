package com.adyen.checkout.blik.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.s;
import com.adyen.checkout.blik.databinding.BlikViewBinding;
import com.adyen.checkout.blik.internal.ui.BlikDelegate;
import com.adyen.checkout.blik.internal.ui.model.BlikInputData;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.google.android.material.textfield.TextInputLayout;
import i4.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import w.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/adyen/checkout/blik/internal/ui/view/BlikView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "initBlikCodeInput", "()V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/blik/databinding/BlikViewBinding;", "binding", "Lcom/adyen/checkout/blik/databinding/BlikViewBinding;", "Landroid/content/Context;", "Lcom/adyen/checkout/blik/internal/ui/BlikDelegate;", "blikDelegate", "Lcom/adyen/checkout/blik/internal/ui/BlikDelegate;", "blik_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlikView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlikView.kt\ncom/adyen/checkout/blik/internal/ui/view/BlikView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,108:1\n1#2:109\n16#3,17:110\n*S KotlinDebug\n*F\n+ 1 BlikView.kt\ncom/adyen/checkout/blik/internal/ui/view/BlikView\n*L\n97#1:110,17\n*E\n"})
public final class BlikView extends LinearLayout implements ComponentView {

    @NotNull
    private final BlikViewBinding binding;
    private BlikDelegate blikDelegate;
    private Context localizedContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlikView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        BlikViewBinding blikViewBindingInflate = BlikViewBinding.inflate(LayoutInflater.from(context), this);
        blikViewBindingInflate.getClass();
        this.binding = blikViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, 0);
    }

    private final void initBlikCodeInput() {
        this.binding.editTextBlikCode.setOnChangeListener(new z(this, 15));
        this.binding.editTextBlikCode.setOnFocusChangeListener(new s(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBlikCodeInput$lambda$1(final BlikView blikView, Editable editable) {
        blikView.getClass();
        editable.getClass();
        BlikDelegate blikDelegate = blikView.blikDelegate;
        if (blikDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blikDelegate");
            blikDelegate = null;
        }
        blikDelegate.updateInputData(new Function1<BlikInputData, Unit>() { // from class: com.adyen.checkout.blik.internal.ui.view.BlikView$initBlikCodeInput$1$1
            {
                super(1);
            }

            public final void invoke(@NotNull BlikInputData blikInputData) {
                blikInputData.getClass();
                blikInputData.setBlikCode(this.this$0.binding.editTextBlikCode.getRawValue());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BlikInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = blikView.binding.textInputLayoutBlikCode;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBlikCodeInput$lambda$2(BlikView blikView, View view, boolean z11) {
        blikView.getClass();
        BlikDelegate blikDelegate = blikView.blikDelegate;
        Context context = null;
        if (blikDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blikDelegate");
            blikDelegate = null;
        }
        Validation validation = blikDelegate.getOutputData().getBlikCodeField().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = blikView.binding.textInputLayoutBlikCode;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else {
            if (validation.isValid()) {
                return;
            }
            int reason = ((Validation.Invalid) validation).getReason();
            TextInputLayout textInputLayout2 = blikView.binding.textInputLayoutBlikCode;
            textInputLayout2.getClass();
            Context context2 = blikView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            String string = context.getString(reason);
            string.getClass();
            ViewExtensionsKt.showError(textInputLayout2, string);
        }
    }

    private final void initLocalizedStrings(Context localizedContext) {
        TextInputLayout textInputLayout = this.binding.textInputLayoutBlikCode;
        textInputLayout.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout, com.adyen.checkout.blik.R.style.AdyenCheckout_Blik_BlikCodeInput, localizedContext);
        TextView textView = this.binding.textViewBlikHeader;
        textView.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView, com.adyen.checkout.blik.R.style.AdyenCheckout_Blik_BlikHeaderTextView, localizedContext, false, 4, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void highlightValidationErrors() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        Context context = null;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = BlikView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "highlightValidationErrors", null);
        }
        BlikDelegate blikDelegate = this.blikDelegate;
        if (blikDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blikDelegate");
            blikDelegate = null;
        }
        Validation validation = blikDelegate.getOutputData().getBlikCodeField().getValidation();
        if (validation.isValid()) {
            return;
        }
        this.binding.textInputLayoutBlikCode.requestFocus();
        int reason = ((Validation.Invalid) validation).getReason();
        TextInputLayout textInputLayout = this.binding.textInputLayoutBlikCode;
        textInputLayout.getClass();
        Context context2 = this.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context2;
        }
        String string = context.getString(reason);
        string.getClass();
        ViewExtensionsKt.showError(textInputLayout, string);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof BlikDelegate)) {
            a.f("Unsupported delegate type");
            return;
        }
        this.blikDelegate = (BlikDelegate) delegate;
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        initBlikCodeInput();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlikView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BlikView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlikView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
