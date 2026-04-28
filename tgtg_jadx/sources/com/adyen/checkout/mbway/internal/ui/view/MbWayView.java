package com.adyen.checkout.mbway.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import b3.i;
import bg.s;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.mbway.databinding.MbwayViewBinding;
import com.adyen.checkout.mbway.internal.ui.MBWayDelegate;
import com.adyen.checkout.mbway.internal.ui.model.MBWayInputData;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.CountryAdapter;
import com.adyen.checkout.ui.core.internal.ui.model.CountryModel;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0016\u0010\u0014\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006$"}, d2 = {"Lcom/adyen/checkout/mbway/internal/ui/view/MbWayView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initMobileNumberInput", "()V", "initCountryInput", "Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "countryModel", "onCountrySelected", "(Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "localizedContext", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/mbway/databinding/MbwayViewBinding;", "binding", "Lcom/adyen/checkout/mbway/databinding/MbwayViewBinding;", "Landroid/content/Context;", "Lcom/adyen/checkout/mbway/internal/ui/MBWayDelegate;", "Lcom/adyen/checkout/mbway/internal/ui/MBWayDelegate;", "mbway_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMbWayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MbWayView.kt\ncom/adyen/checkout/mbway/internal/ui/view/MbWayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,117:1\n1#2:118\n16#3,17:119\n*S KotlinDebug\n*F\n+ 1 MbWayView.kt\ncom/adyen/checkout/mbway/internal/ui/view/MbWayView\n*L\n100#1:119,17\n*E\n"})
public final class MbWayView extends LinearLayout implements ComponentView {

    @NotNull
    private final MbwayViewBinding binding;
    private MBWayDelegate delegate;
    private Context localizedContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MbWayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        MbwayViewBinding mbwayViewBindingInflate = MbwayViewBinding.inflate(LayoutInflater.from(context), this);
        mbwayViewBindingInflate.getClass();
        this.binding = mbwayViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, 0);
    }

    private final void initCountryInput() {
        MBWayDelegate mBWayDelegate = this.delegate;
        MBWayDelegate mBWayDelegate2 = null;
        if (mBWayDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            mBWayDelegate = null;
        }
        List<CountryModel> supportedCountries = mBWayDelegate.getSupportedCountries();
        Context context = getContext();
        context.getClass();
        Context context2 = this.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context2 = null;
        }
        final CountryAdapter countryAdapter = new CountryAdapter(context, context2);
        countryAdapter.setItems(supportedCountries);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.binding.autoCompleteTextViewCountry;
        appCompatAutoCompleteTextView.setInputType(0);
        appCompatAutoCompleteTextView.setAdapter(countryAdapter);
        appCompatAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.adyen.checkout.mbway.internal.ui.view.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
                MbWayView.initCountryInput$lambda$4$lambda$3(countryAdapter, this, adapterView, view, i11, j9);
            }
        });
        MBWayDelegate mBWayDelegate3 = this.delegate;
        if (mBWayDelegate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        } else {
            mBWayDelegate2 = mBWayDelegate3;
        }
        CountryModel initiallySelectedCountry = mBWayDelegate2.getInitiallySelectedCountry();
        if (initiallySelectedCountry != null) {
            this.binding.autoCompleteTextViewCountry.setText(initiallySelectedCountry.toShortString());
            onCountrySelected(initiallySelectedCountry);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCountryInput$lambda$4$lambda$3(CountryAdapter countryAdapter, MbWayView mbWayView, AdapterView adapterView, View view, int i11, long j9) {
        countryAdapter.getClass();
        mbWayView.getClass();
        mbWayView.onCountrySelected(countryAdapter.getItem(i11));
    }

    private final void initMobileNumberInput() {
        this.binding.editTextMobileNumber.setOnChangeListener(new z(this, 19));
        this.binding.editTextMobileNumber.setOnFocusChangeListener(new s(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMobileNumberInput$lambda$1(MbWayView mbWayView, final Editable editable) {
        mbWayView.getClass();
        editable.getClass();
        MBWayDelegate mBWayDelegate = mbWayView.delegate;
        if (mBWayDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            mBWayDelegate = null;
        }
        mBWayDelegate.updateInputData(new Function1<MBWayInputData, Unit>() { // from class: com.adyen.checkout.mbway.internal.ui.view.MbWayView$initMobileNumberInput$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull MBWayInputData mBWayInputData) {
                mBWayInputData.getClass();
                mBWayInputData.setLocalPhoneNumber(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MBWayInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = mbWayView.binding.textInputLayoutMobileNumber;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMobileNumberInput$lambda$2(MbWayView mbWayView, View view, boolean z11) {
        mbWayView.getClass();
        MBWayDelegate mBWayDelegate = mbWayView.delegate;
        Context context = null;
        if (mBWayDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            mBWayDelegate = null;
        }
        Validation validation = mBWayDelegate.getOutputData().getMobilePhoneNumberFieldState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = mbWayView.binding.textInputLayoutMobileNumber;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = mbWayView.binding.textInputLayoutMobileNumber;
            textInputLayout2.getClass();
            Context context2 = mbWayView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    private final void onCountrySelected(final CountryModel countryModel) {
        MBWayDelegate mBWayDelegate = this.delegate;
        if (mBWayDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            mBWayDelegate = null;
        }
        mBWayDelegate.updateInputData(new Function1<MBWayInputData, Unit>() { // from class: com.adyen.checkout.mbway.internal.ui.view.MbWayView.onCountrySelected.1
            {
                super(1);
            }

            public final void invoke(@NotNull MBWayInputData mBWayInputData) {
                mBWayInputData.getClass();
                mBWayInputData.setCountryCode(countryModel.getCallingCode());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MBWayInputData) obj);
                return Unit.f26487a;
            }
        });
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void highlightValidationErrors() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        Context context = null;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = MbWayView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "highlightValidationErrors", null);
        }
        MBWayDelegate mBWayDelegate = this.delegate;
        if (mBWayDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            mBWayDelegate = null;
        }
        Validation validation = mBWayDelegate.getOutputData().getMobilePhoneNumberFieldState().getValidation();
        if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout = this.binding.textInputLayoutMobileNumber;
            textInputLayout.getClass();
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            i.z((Validation.Invalid) validation, context, textInputLayout);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof MBWayDelegate)) {
            i4.a.f("Unsupported delegate type");
            return;
        }
        this.delegate = (MBWayDelegate) delegate;
        this.localizedContext = localizedContext;
        initMobileNumberInput();
        initCountryInput();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MbWayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ MbWayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MbWayView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
