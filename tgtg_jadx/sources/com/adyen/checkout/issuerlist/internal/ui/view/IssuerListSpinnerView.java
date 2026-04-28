package com.adyen.checkout.issuerlist.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.issuerlist.databinding.IssuerListSpinnerViewBinding;
import com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListInputData;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.braze.models.FeatureFlag;
import e0.f;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001f\u001a\u00020\r2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\r2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010/R\u001e\u00101\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", "view", "position", "", "id", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "", FeatureFlag.ENABLED, "setEnabled", "(Z)V", "onNothingSelected", "(Landroid/widget/AdapterView;)V", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/issuerlist/databinding/IssuerListSpinnerViewBinding;", "binding", "Lcom/adyen/checkout/issuerlist/databinding/IssuerListSpinnerViewBinding;", "Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerAdapter;", "issuersAdapter", "Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerAdapter;", "Landroid/content/Context;", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "issuerListDelegate", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIssuerListSpinnerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuerListSpinnerView.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,91:1\n1#2:92\n16#3,17:93\n*S KotlinDebug\n*F\n+ 1 IssuerListSpinnerView.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerView\n*L\n76#1:93,17\n*E\n"})
public final class IssuerListSpinnerView extends LinearLayout implements ComponentView, AdapterView.OnItemSelectedListener {

    @NotNull
    private final IssuerListSpinnerViewBinding binding;
    private IssuerListDelegate<?, ?> issuerListDelegate;
    private IssuerListSpinnerAdapter issuersAdapter;
    private Context localizedContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuerListSpinnerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        IssuerListSpinnerViewBinding issuerListSpinnerViewBindingInflate = IssuerListSpinnerViewBinding.inflate(LayoutInflater.from(context), this);
        issuerListSpinnerViewBindingInflate.getClass();
        this.binding = issuerListSpinnerViewBindingInflate;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof IssuerListDelegate)) {
            a.f("Unsupported delegate type");
            return;
        }
        IssuerListDelegate<?, ?> issuerListDelegate = (IssuerListDelegate) delegate;
        this.issuerListDelegate = issuerListDelegate;
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        Context context = getContext();
        context.getClass();
        IssuerListSpinnerAdapter issuerListSpinnerAdapter = new IssuerListSpinnerAdapter(context, issuerListDelegate.getIssuers(), issuerListDelegate.getPaymentMethodType(), issuerListDelegate.getComponentParams().getHideIssuerLogos());
        this.issuersAdapter = issuerListSpinnerAdapter;
        AppCompatSpinner appCompatSpinner = this.binding.spinnerIssuers;
        appCompatSpinner.setAdapter((SpinnerAdapter) issuerListSpinnerAdapter);
        appCompatSpinner.setOnItemSelectedListener(this);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(@NotNull AdapterView<?> parent, @NotNull View view, int position, long id2) {
        parent.getClass();
        view.getClass();
        IssuerListSpinnerAdapter issuerListSpinnerAdapter = this.issuersAdapter;
        IssuerListDelegate<?, ?> issuerListDelegate = null;
        if (issuerListSpinnerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("issuersAdapter");
            issuerListSpinnerAdapter = null;
        }
        final IssuerModel item = issuerListSpinnerAdapter.getItem(position);
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = IssuerListSpinnerView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("onItemSelected - ", item.getName()), null);
        }
        IssuerListDelegate<?, ?> issuerListDelegate2 = this.issuerListDelegate;
        if (issuerListDelegate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("issuerListDelegate");
        } else {
            issuerListDelegate = issuerListDelegate2;
        }
        issuerListDelegate.updateInputData(new Function1<IssuerListInputData, Unit>() { // from class: com.adyen.checkout.issuerlist.internal.ui.view.IssuerListSpinnerView.onItemSelected.2
            {
                super(1);
            }

            public final void invoke(@NotNull IssuerListInputData issuerListInputData) {
                issuerListInputData.getClass();
                issuerListInputData.setSelectedIssuer(item);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IssuerListInputData) obj);
                return Unit.f26487a;
            }
        });
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(@NotNull AdapterView<?> parent) {
        parent.getClass();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.spinnerIssuers.setEnabled(enabled);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IssuerListSpinnerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ IssuerListSpinnerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
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
    public IssuerListSpinnerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    private final void initLocalizedStrings(Context localizedContext) {
    }
}
