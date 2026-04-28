package com.adyen.checkout.googlepay.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import ba0.g;
import com.adyen.checkout.googlepay.GooglePayButtonStyling;
import com.adyen.checkout.googlepay.GooglePayButtonTheme;
import com.adyen.checkout.googlepay.GooglePayButtonType;
import com.adyen.checkout.googlepay.R;
import com.adyen.checkout.googlepay.databinding.ViewGooglePayButtonBinding;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayOutputData;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.view.PayButton;
import com.braze.h2;
import com.braze.models.FeatureFlag;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.wallet.button.ButtonOptions;
import f10.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import y70.a;
import y80.r;
import y80.w;
import z70.e;
import z70.i;
import zz.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/GooglePayButtonView;", "Lcom/adyen/checkout/ui/core/internal/ui/view/PayButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "", "observeDelegate", "(Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;Lv80/b0;)V", "Lcom/adyen/checkout/googlepay/GooglePayButtonType;", "mapStyledButtonType", "(I)Lcom/adyen/checkout/googlepay/GooglePayButtonType;", "Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;", "mapStyledButtonTheme", "(I)Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;", "mapStyledCornerRadius", "(I)Ljava/lang/Integer;", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "initialize", "(Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;Lv80/b0;)V", "", FeatureFlag.ENABLED, "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", TextBundle.TEXT_ENTRY, "setText", "(Ljava/lang/String;)V", "Lcom/adyen/checkout/googlepay/databinding/ViewGooglePayButtonBinding;", "binding", "Lcom/adyen/checkout/googlepay/databinding/ViewGooglePayButtonBinding;", "styledButtonType", "Lcom/adyen/checkout/googlepay/GooglePayButtonType;", "styledButtonTheme", "Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;", "styledCornerRadius", "Ljava/lang/Integer;", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayButtonView.kt\ncom/adyen/checkout/googlepay/internal/ui/GooglePayButtonView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class GooglePayButtonView extends PayButton {

    @NotNull
    private final ViewGooglePayButtonBinding binding;

    @Nullable
    private final GooglePayButtonTheme styledButtonTheme;

    @Nullable
    private final GooglePayButtonType styledButtonType;

    @Nullable
    private final Integer styledCornerRadius;

    /* JADX INFO: renamed from: com.adyen.checkout.googlepay.internal.ui.GooglePayButtonView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.googlepay.internal.ui.GooglePayButtonView$observeDelegate$1", f = "GooglePayButtonView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGooglePayButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayButtonView.kt\ncom/adyen/checkout/googlepay/internal/ui/GooglePayButtonView$observeDelegate$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,131:1\n256#2,2:132\n*S KotlinDebug\n*F\n+ 1 GooglePayButtonView.kt\ncom/adyen/checkout/googlepay/internal/ui/GooglePayButtonView$observeDelegate$1\n*L\n91#1:132,2\n*E\n"})
    public static final class AnonymousClass1 extends i implements Function2<GooglePayOutputData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = GooglePayButtonView.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull GooglePayOutputData googlePayOutputData, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(googlePayOutputData, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            GooglePayOutputData googlePayOutputData = (GooglePayOutputData) this.L$0;
            com.google.android.gms.wallet.button.PayButton payButton = GooglePayButtonView.this.binding.payButton;
            payButton.getClass();
            payButton.setVisibility(googlePayOutputData.isButtonVisible() ? 0 : 8);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        ViewGooglePayButtonBinding viewGooglePayButtonBindingInflate = ViewGooglePayButtonBinding.inflate(LayoutInflater.from(context), this);
        viewGooglePayButtonBindingInflate.getClass();
        this.binding = viewGooglePayButtonBindingInflate;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.GooglePayButtonView, i11, R.style.AdyenCheckout_GooglePay_Button);
        typedArrayObtainStyledAttributes.getClass();
        this.styledButtonType = mapStyledButtonType(typedArrayObtainStyledAttributes.getInt(R.styleable.GooglePayButtonView_adyenGooglePayButtonType, -1));
        this.styledButtonTheme = mapStyledButtonTheme(typedArrayObtainStyledAttributes.getInt(R.styleable.GooglePayButtonView_adyenGooglePayButtonTheme, -1));
        this.styledCornerRadius = mapStyledCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.GooglePayButtonView_adyenGooglePayButtonCornerRadius, -1));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final GooglePayButtonTheme mapStyledButtonTheme(int i11) {
        if (i11 == 0) {
            return GooglePayButtonTheme.LIGHT;
        }
        if (i11 != 1) {
            return null;
        }
        return GooglePayButtonTheme.DARK;
    }

    private final GooglePayButtonType mapStyledButtonType(int i11) {
        switch (i11) {
            case 0:
                return GooglePayButtonType.BUY;
            case 1:
                return GooglePayButtonType.BOOK;
            case 2:
                return GooglePayButtonType.CHECKOUT;
            case 3:
                return GooglePayButtonType.DONATE;
            case 4:
                return GooglePayButtonType.ORDER;
            case 5:
                return GooglePayButtonType.PAY;
            case 6:
                return GooglePayButtonType.SUBSCRIBE;
            case 7:
                return GooglePayButtonType.PLAIN;
            default:
                return null;
        }
    }

    private final Integer mapStyledCornerRadius(int i11) {
        if (i11 == -1) {
            return null;
        }
        return Integer.valueOf(i11);
    }

    private final void observeDelegate(GooglePayDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton
    public void initialize(@NotNull ButtonDelegate delegate, @NotNull b0 coroutineScope) {
        GooglePayButtonType buttonType;
        GooglePayButtonTheme buttonTheme;
        b bVar;
        Integer cornerRadius;
        delegate.getClass();
        coroutineScope.getClass();
        if (!(delegate instanceof GooglePayDelegate)) {
            h2.b("Check failed.");
            return;
        }
        GooglePayDelegate googlePayDelegate = (GooglePayDelegate) delegate;
        observeDelegate(googlePayDelegate, coroutineScope);
        GooglePayButtonStyling googlePayButtonStyling = googlePayDelegate.getComponentParams().getGooglePayButtonStyling();
        if (googlePayButtonStyling == null || (buttonType = googlePayButtonStyling.getButtonType()) == null) {
            buttonType = this.styledButtonType;
        }
        if (googlePayButtonStyling == null || (buttonTheme = googlePayButtonStyling.getButtonTheme()) == null) {
            buttonTheme = this.styledButtonTheme;
        }
        Integer numValueOf = (googlePayButtonStyling == null || (cornerRadius = googlePayButtonStyling.getCornerRadius()) == null) ? this.styledCornerRadius : Integer.valueOf((int) (cornerRadius.intValue() * Resources.getSystem().getDisplayMetrics().density));
        com.google.android.gms.wallet.button.PayButton payButton = this.binding.payButton;
        ButtonOptions buttonOptions = new ButtonOptions();
        if (buttonType != null) {
            buttonOptions.f12179a = buttonType.getValue();
        }
        if (buttonTheme != null) {
            buttonOptions.f12180b = buttonTheme.getValue();
        }
        if (numValueOf != null) {
            buttonOptions.f12181c = numValueOf.intValue();
            buttonOptions.f12183e = true;
        }
        String allowedPaymentMethods = googlePayDelegate.getGooglePayButtonParameters().getAllowedPaymentMethods();
        buttonOptions.f12182d = allowedPaymentMethods;
        a50.c cVar = payButton.f12185b;
        int i11 = buttonOptions.f12179a;
        if (i11 != 0) {
            ((ButtonOptions) cVar.f822b).f12179a = i11;
        }
        int i12 = buttonOptions.f12180b;
        if (i12 != 0) {
            ((ButtonOptions) cVar.f822b).f12180b = i12;
        }
        if (buttonOptions.f12183e) {
            int i13 = buttonOptions.f12181c;
            ButtonOptions buttonOptions2 = (ButtonOptions) cVar.f822b;
            buttonOptions2.f12181c = i13;
            buttonOptions2.f12183e = true;
        }
        if (allowedPaymentMethods != null) {
            ((ButtonOptions) cVar.f822b).f12182d = allowedPaymentMethods;
        }
        if (payButton.isInEditMode()) {
            payButton.a((ButtonOptions) cVar.f822b);
            return;
        }
        payButton.removeAllViews();
        ButtonOptions buttonOptions3 = (ButtonOptions) cVar.f822b;
        if (GoogleApiAvailability.f11044d.b(payButton.getContext(), 232100000) != 0) {
            payButton.a(buttonOptions3);
            Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
            return;
        }
        if (TextUtils.isEmpty(buttonOptions3.f12182d)) {
            Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
            return;
        }
        Context context = payButton.getContext();
        i0.h(context);
        try {
            d dVarC = d.c(context, d.f48425b, "com.google.android.gms.wallet_dynamite");
            View view = null;
            try {
                IBinder iBinderB = dVarC.b("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
                if (iBinderB == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                    bVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(iBinderB, "com.google.android.gms.wallet.button.IPayButtonCreator", 6);
                }
                if (bVar != null) {
                    view = (View) yz.b.V(bVar.O(new yz.b(new Context[]{dVarC.f48438a, context}), buttonOptions3));
                } else {
                    Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
                }
            } catch (RemoteException e5) {
                e = e5;
                Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            } catch (DynamiteModule$LoadingException e11) {
                e = e11;
                Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            }
            payButton.f12186c = view;
            if (view == null) {
                Log.e("PayButton", "Failed to create buttonView");
            } else {
                payButton.addView(view);
                payButton.f12186c.setOnClickListener(payButton);
            }
        } catch (DynamiteModule$LoadingException e12) {
            throw new IllegalStateException(e12);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton, android.view.View
    public void setEnabled(boolean enabled) {
        this.binding.payButton.setEnabled(enabled);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton, android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener listener) {
        this.binding.payButton.setOnClickListener(listener);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.PayButton
    public void setText(@Nullable String text) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ GooglePayButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
