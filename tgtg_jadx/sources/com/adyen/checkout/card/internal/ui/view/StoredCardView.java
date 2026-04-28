package com.adyen.checkout.card.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import ba0.g;
import bg.s;
import com.adyen.checkout.card.databinding.StoredCardViewBinding;
import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.card.internal.ui.CardDelegate;
import com.adyen.checkout.card.internal.ui.model.CardInputData;
import com.adyen.checkout.card.internal.ui.model.CardOutputData;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.adyen.checkout.ui.core.internal.ui.view.SecurityCodeInput;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.braze.h2;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import w.z;
import y80.r;
import y80.w;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u0016J'\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/StoredCardView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "observeDelegate", "(Lcom/adyen/checkout/card/internal/ui/CardDelegate;Lv80/b0;)V", "initSecurityCodeInput", "()V", "Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "cardOutputData", "outputDataChanged", "(Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)V", "setDetectedCardBrand", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/card/databinding/StoredCardViewBinding;", "binding", "Lcom/adyen/checkout/card/databinding/StoredCardViewBinding;", "Landroid/content/Context;", "cardDelegate", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStoredCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoredCardView.kt\ncom/adyen/checkout/card/internal/ui/view/StoredCardView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,162:1\n1#2:163\n254#3:164\n*S KotlinDebug\n*F\n+ 1 StoredCardView.kt\ncom/adyen/checkout/card/internal/ui/view/StoredCardView\n*L\n123#1:164\n*E\n"})
public final class StoredCardView extends LinearLayout implements ComponentView {

    @NotNull
    private final StoredCardViewBinding binding;
    private CardDelegate cardDelegate;
    private Context localizedContext;

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.view.StoredCardView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.view.StoredCardView$observeDelegate$1", f = "StoredCardView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CardOutputData, x70.c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = StoredCardView.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CardOutputData cardOutputData, @Nullable x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(cardOutputData, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            StoredCardView.this.outputDataChanged((CardOutputData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoredCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        StoredCardViewBinding storedCardViewBindingInflate = StoredCardViewBinding.inflate(LayoutInflater.from(context), this);
        storedCardViewBindingInflate.getClass();
        this.binding = storedCardViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, 0);
    }

    private final void initLocalizedStrings(Context localizedContext) {
        TextInputLayout textInputLayout = this.binding.textInputLayoutCardNumber;
        textInputLayout.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout, com.adyen.checkout.card.R.style.AdyenCheckout_Card_CardNumberInput, localizedContext);
        TextInputLayout textInputLayout2 = this.binding.textInputLayoutExpiryDate;
        textInputLayout2.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout2, com.adyen.checkout.card.R.style.AdyenCheckout_Card_ExpiryDateInput, localizedContext);
        TextInputLayout textInputLayout3 = this.binding.textInputLayoutSecurityCode;
        textInputLayout3.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout3, com.adyen.checkout.card.R.style.AdyenCheckout_Card_SecurityCodeInput, localizedContext);
    }

    private final void initSecurityCodeInput() {
        EditText editText = this.binding.textInputLayoutSecurityCode.getEditText();
        SecurityCodeInput securityCodeInput = editText instanceof SecurityCodeInput ? (SecurityCodeInput) editText : null;
        if (securityCodeInput != null) {
            securityCodeInput.setOnChangeListener(new z(this, 16));
        }
        if (securityCodeInput != null) {
            securityCodeInput.setOnFocusChangeListener(new s(this, 2));
        }
        TextInputLayout textInputLayout = getVisibility() == 0 ? this.binding.textInputLayoutSecurityCode : null;
        if (textInputLayout != null) {
            textInputLayout.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSecurityCodeInput$lambda$1(StoredCardView storedCardView, final Editable editable) {
        storedCardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = storedCardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.StoredCardView$initSecurityCodeInput$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setSecurityCode(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = storedCardView.binding.textInputLayoutSecurityCode;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSecurityCodeInput$lambda$2(StoredCardView storedCardView, View view, boolean z11) {
        storedCardView.getClass();
        CardDelegate cardDelegate = storedCardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getSecurityCodeState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = storedCardView.binding.textInputLayoutSecurityCode;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = storedCardView.binding.textInputLayoutSecurityCode;
            textInputLayout2.getClass();
            Context context2 = storedCardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    private final void observeDelegate(CardDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(CardOutputData cardOutputData) {
        CardNumberInput cardNumberInput = this.binding.editTextCardNumber;
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        cardNumberInput.setText(context.getString(com.adyen.checkout.card.R.string.card_number_4digit, cardOutputData.getCardNumberState().getValue()));
        this.binding.editTextExpiryDate.setText(cardOutputData.getExpiryDateState().getValue());
        setDetectedCardBrand(cardOutputData);
    }

    private final void setDetectedCardBrand(CardOutputData cardOutputData) {
        List<DetectedCardType> detectedCardTypes = cardOutputData.getDetectedCardTypes();
        if (detectedCardTypes.isEmpty()) {
            return;
        }
        this.binding.cardBrandLogoImageViewPrimary.setStrokeWidth(4.0f);
        RoundCornerImageView roundCornerImageView = this.binding.cardBrandLogoImageViewPrimary;
        roundCornerImageView.getClass();
        CardDelegate cardDelegate = this.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Environment environment = cardDelegate.getComponentParams().getEnvironment();
        String txVariant = detectedCardTypes.get(0).getCardBrand().getTxVariant();
        int i11 = com.adyen.checkout.card.R.drawable.ic_card;
        ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView, environment, txVariant, null, null, null, i11, i11, 28, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void highlightValidationErrors() {
        CardDelegate cardDelegate = this.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getSecurityCodeState().getValidation();
        if (validation instanceof Validation.Invalid) {
            this.binding.textInputLayoutSecurityCode.requestFocus();
            TextInputLayout textInputLayout = this.binding.textInputLayoutSecurityCode;
            textInputLayout.getClass();
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof CardDelegate)) {
            i4.a.f("Unsupported delegate type");
            return;
        }
        CardDelegate cardDelegate = (CardDelegate) delegate;
        this.cardDelegate = cardDelegate;
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        observeDelegate(cardDelegate, coroutineScope);
        initSecurityCodeInput();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CardViewExtKt.setFlagSecureOnRootView(this, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CardViewExtKt.setFlagSecureOnRootView(this, false);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoredCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ StoredCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoredCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
