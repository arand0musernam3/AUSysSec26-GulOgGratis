package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba0.g;
import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.AddressDelegate;
import com.adyen.checkout.ui.core.internal.ui.AddressSpecification;
import com.adyen.checkout.ui.core.internal.ui.TextListAdapter;
import com.adyen.checkout.ui.core.internal.ui.model.AddressListItem;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.braze.h2;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
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
import y80.r;
import y80.w;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b0\u0010/J\u0019\u00101\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b1\u0010/J\u0019\u00102\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b2\u0010/J\u0019\u00103\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b3\u0010/J\u0019\u00104\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b4\u0010/J\u0019\u00105\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b5\u0010/J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\u00020\u000e*\u00020:2\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001d0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010I\u001a\u0004\u0018\u00010:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010L\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010P\u001a\u0004\u0018\u00010M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u0004\u0018\u00010M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0016\u0010V\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010X\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0016\u0010\\\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010UR\u0016\u0010^\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010UR\u0016\u0010`\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010UR\u0016\u0010d\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0016\u0010f\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0016\u0010h\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010cR\u0016\u0010j\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010cR\u0016\u0010l\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010cR\u0016\u0010n\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010cR\u0016\u0010p\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010cR\u0016\u0010r\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010c¨\u0006s"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AddressFormInput;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "", "attachDelegate", "(Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;Lv80/b0;)V", "localizedContext", "initLocalizedContext", "(Landroid/content/Context;)V", "", "isErrorFocusedPreviously", "highlightValidationErrors", "(Z)V", "isOptional", "updateAddressHint", "subscribeCountryAndStateList", "(Lv80/b0;)V", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressListItem;", "countryList", "updateCountries", "(Ljava/util/List;)V", "stateList", "updateStates", "Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification;", "specification", "populateFormFields", "(Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification;)V", "addressSpecification", "initForm", "initHeader", "()V", "styleResId", "initCountryInput", "(I)V", "initStreetInput", "(Ljava/lang/Integer;)V", "initHouseNumberInput", "initApartmentSuiteInput", "initPostalCodeInput", "initCityInput", "initProvinceTerritoryInput", "initStatesInput", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "outputData", "updateInputFields", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;)V", "Landroid/widget/TextView;", "", "newText", "setTextIfChanged", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/content/Context;", "Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "currentSpec", "Lcom/adyen/checkout/ui/core/internal/ui/AddressSpecification;", "Lcom/adyen/checkout/ui/core/internal/ui/TextListAdapter;", "countryAdapter", "Lcom/adyen/checkout/ui/core/internal/ui/TextListAdapter;", "statesAdapter", "getTextViewHeader", "()Landroid/widget/TextView;", "textViewHeader", "getFormContainer", "()Landroid/widget/LinearLayout;", "formContainer", "Landroid/widget/AutoCompleteTextView;", "getAutoCompleteTextViewCountry", "()Landroid/widget/AutoCompleteTextView;", "autoCompleteTextViewCountry", "getAutoCompleteTextViewState", "autoCompleteTextViewState", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "getEditTextStreet", "()Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "editTextStreet", "getEditTextHouseNumber", "editTextHouseNumber", "getEditTextApartmentSuite", "editTextApartmentSuite", "getEditTextPostalCode", "editTextPostalCode", "getEditTextCity", "editTextCity", "getEditTextProvinceTerritory", "editTextProvinceTerritory", "Lcom/google/android/material/textfield/TextInputLayout;", "getTextInputLayoutCountry", "()Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayoutCountry", "getTextInputLayoutStreet", "textInputLayoutStreet", "getTextInputLayoutHouseNumber", "textInputLayoutHouseNumber", "getTextInputLayoutApartmentSuite", "textInputLayoutApartmentSuite", "getTextInputLayoutPostalCode", "textInputLayoutPostalCode", "getTextInputLayoutCity", "textInputLayoutCity", "getTextInputLayoutProvinceTerritory", "textInputLayoutProvinceTerritory", "getTextInputLayoutState", "textInputLayoutState", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddressFormInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressFormInput.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AddressFormInput\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n295#2,2:513\n295#2,2:515\n295#2,2:517\n1#3:519\n*S KotlinDebug\n*F\n+ 1 AddressFormInput.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AddressFormInput\n*L\n220#1:513,2\n233#1:515,2\n313#1:517,2\n*E\n"})
public final class AddressFormInput extends LinearLayout {

    @NotNull
    private TextListAdapter<AddressListItem> countryAdapter;

    @Nullable
    private AddressSpecification currentSpec;
    private AddressDelegate delegate;
    private Context localizedContext;

    @NotNull
    private TextListAdapter<AddressListItem> statesAdapter;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressSpecification.values().length];
            try {
                iArr[AddressSpecification.BR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressSpecification.CA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressSpecification.GB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddressSpecification.US.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AddressSpecification.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$subscribeCountryAndStateList$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$subscribeCountryAndStateList$1", f = "AddressFormInput.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "addressOutputData", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<AddressOutputData, x70.c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = AddressFormInput.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AddressOutputData addressOutputData, @Nullable x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(addressOutputData, cVar)).invokeSuspend(Unit.f26487a);
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
            AddressOutputData addressOutputData = (AddressOutputData) this.L$0;
            AddressFormInput.this.updateCountries(addressOutputData.getCountryOptions());
            AddressFormInput.this.updateStates(addressOutputData.getStateOptions());
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.countryAdapter = new TextListAdapter<>(context);
        this.statesAdapter = new TextListAdapter<>(context);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.address_form_input, (ViewGroup) this, true);
        AutoCompleteTextView autoCompleteTextViewCountry = getAutoCompleteTextViewCountry();
        if (autoCompleteTextViewCountry != null) {
            autoCompleteTextViewCountry.setAutofillHints("addressCountry");
            autoCompleteTextViewCountry.setInputType(0);
            autoCompleteTextViewCountry.setAdapter(this.countryAdapter);
            autoCompleteTextViewCountry.setOnItemClickListener(new a(this, 0));
        }
    }

    private final AutoCompleteTextView getAutoCompleteTextViewCountry() {
        return (AutoCompleteTextView) getRootView().findViewById(R.id.autoCompleteTextView_country);
    }

    private final AutoCompleteTextView getAutoCompleteTextViewState() {
        return (AutoCompleteTextView) getRootView().findViewById(R.id.autoCompleteTextView_state);
    }

    private final AdyenTextInputEditText getEditTextApartmentSuite() {
        return (AdyenTextInputEditText) getRootView().findViewById(R.id.editText_apartmentSuite);
    }

    private final AdyenTextInputEditText getEditTextCity() {
        return (AdyenTextInputEditText) getRootView().findViewById(R.id.editText_city);
    }

    private final AdyenTextInputEditText getEditTextHouseNumber() {
        return (AdyenTextInputEditText) getRootView().findViewById(R.id.editText_houseNumber);
    }

    private final AdyenTextInputEditText getEditTextPostalCode() {
        LinearLayout formContainer = getFormContainer();
        if (formContainer != null) {
            return (AdyenTextInputEditText) formContainer.findViewById(R.id.editText_postalCode);
        }
        return null;
    }

    private final AdyenTextInputEditText getEditTextProvinceTerritory() {
        return (AdyenTextInputEditText) getRootView().findViewById(R.id.editText_provinceTerritory);
    }

    private final AdyenTextInputEditText getEditTextStreet() {
        return (AdyenTextInputEditText) getRootView().findViewById(R.id.editText_street);
    }

    private final LinearLayout getFormContainer() {
        return (LinearLayout) getRootView().findViewById(R.id.linearLayout_formContainer);
    }

    private final TextInputLayout getTextInputLayoutApartmentSuite() {
        return (TextInputLayout) getRootView().findViewById(R.id.textInputLayout_apartmentSuite);
    }

    private final TextInputLayout getTextInputLayoutCity() {
        return (TextInputLayout) getRootView().findViewById(R.id.textInputLayout_city);
    }

    private final TextInputLayout getTextInputLayoutCountry() {
        return (TextInputLayout) getRootView().findViewById(R.id.textInputLayout_country);
    }

    private final TextInputLayout getTextInputLayoutHouseNumber() {
        return (TextInputLayout) getRootView().findViewById(R.id.textInputLayout_houseNumber);
    }

    private final TextInputLayout getTextInputLayoutPostalCode() {
        LinearLayout formContainer = getFormContainer();
        if (formContainer != null) {
            return (TextInputLayout) formContainer.findViewById(R.id.textInputLayout_postalCode);
        }
        return null;
    }

    private final TextInputLayout getTextInputLayoutProvinceTerritory() {
        return (TextInputLayout) getRootView().findViewById(R.id.textInputLayout_provinceTerritory);
    }

    private final TextInputLayout getTextInputLayoutState() {
        return (TextInputLayout) getRootView().findViewById(R.id.textInputLayout_state);
    }

    private final TextInputLayout getTextInputLayoutStreet() {
        return (TextInputLayout) getRootView().findViewById(R.id.textInputLayout_street);
    }

    private final TextView getTextViewHeader() {
        return (TextView) getRootView().findViewById(R.id.textView_header);
    }

    private final void initApartmentSuiteInput(Integer styleResId) {
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutApartmentSuite = getTextInputLayoutApartmentSuite();
            if (textInputLayoutApartmentSuite != null) {
                Context context = this.localizedContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutApartmentSuite, iIntValue, context);
            }
        }
        AdyenTextInputEditText editTextApartmentSuite = getEditTextApartmentSuite();
        if (editTextApartmentSuite != null) {
            editTextApartmentSuite.setAutofillHints("aptNumber");
            int i11 = 4;
            editTextApartmentSuite.setOnChangeListener(new b(this, i11));
            editTextApartmentSuite.setOnFocusChangeListener(new c(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initApartmentSuiteInput$lambda$17$lambda$15(AddressFormInput addressFormInput, final Editable editable) {
        addressFormInput.getClass();
        editable.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initApartmentSuiteInput$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.setApartmentSuite(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initApartmentSuiteInput$lambda$17$lambda$16(AddressFormInput addressFormInput, View view, boolean z11) {
        TextInputLayout textInputLayoutApartmentSuite;
        addressFormInput.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Validation validation = addressDelegate.getAddressOutputData().getApartmentSuite().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutApartmentSuite2 = addressFormInput.getTextInputLayoutApartmentSuite();
            if (textInputLayoutApartmentSuite2 != null) {
                ViewExtensionsKt.hideError(textInputLayoutApartmentSuite2);
                return;
            }
            return;
        }
        if (!(validation instanceof Validation.Invalid) || (textInputLayoutApartmentSuite = addressFormInput.getTextInputLayoutApartmentSuite()) == null) {
            return;
        }
        Context context2 = addressFormInput.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context2;
        }
        b3.i.z((Validation.Invalid) validation, context, textInputLayoutApartmentSuite);
    }

    private final void initCityInput(Integer styleResId) {
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutCity = getTextInputLayoutCity();
            if (textInputLayoutCity != null) {
                Context context = this.localizedContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutCity, iIntValue, context);
            }
        }
        AdyenTextInputEditText editTextCity = getEditTextCity();
        if (editTextCity != null) {
            editTextCity.setAutofillHints("addressLocality");
            int i11 = 0;
            editTextCity.setOnChangeListener(new b(this, i11));
            editTextCity.setOnFocusChangeListener(new c(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCityInput$lambda$25$lambda$23(AddressFormInput addressFormInput, final Editable editable) {
        addressFormInput.getClass();
        editable.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initCityInput$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.setCity(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayoutCity = addressFormInput.getTextInputLayoutCity();
        if (textInputLayoutCity != null) {
            ViewExtensionsKt.hideError(textInputLayoutCity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCityInput$lambda$25$lambda$24(AddressFormInput addressFormInput, View view, boolean z11) {
        TextInputLayout textInputLayoutCity;
        addressFormInput.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Validation validation = addressDelegate.getAddressOutputData().getCity().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutCity2 = addressFormInput.getTextInputLayoutCity();
            if (textInputLayoutCity2 != null) {
                ViewExtensionsKt.hideError(textInputLayoutCity2);
                return;
            }
            return;
        }
        if (!(validation instanceof Validation.Invalid) || (textInputLayoutCity = addressFormInput.getTextInputLayoutCity()) == null) {
            return;
        }
        Context context2 = addressFormInput.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context2;
        }
        b3.i.z((Validation.Invalid) validation, context, textInputLayoutCity);
    }

    private final void initCountryInput(int styleResId) {
        Object next;
        TextInputLayout textInputLayoutCountry = getTextInputLayoutCountry();
        if (textInputLayoutCountry != null) {
            Context context = this.localizedContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context = null;
            }
            ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutCountry, styleResId, context);
        }
        AddressDelegate addressDelegate = this.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Iterator<T> it = addressDelegate.getAddressOutputData().getCountryOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((AddressListItem) next).getSelected()) {
                    break;
                }
            }
        }
        AddressListItem addressListItem = (AddressListItem) next;
        String name = addressListItem != null ? addressListItem.getName() : null;
        AutoCompleteTextView autoCompleteTextViewCountry = getAutoCompleteTextViewCountry();
        if (autoCompleteTextViewCountry != null) {
            autoCompleteTextViewCountry.setText(name);
        }
    }

    private final void initForm(AddressSpecification addressSpecification) {
        initHeader();
        initCountryInput(addressSpecification.getCountry().getStyleResId());
        AddressSpecification.AddressFieldSpec street$ui_core_release = addressSpecification.getStreet();
        AddressDelegate addressDelegate = this.delegate;
        AddressDelegate addressDelegate2 = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        initStreetInput(street$ui_core_release.getStyleResId(addressDelegate.getAddressOutputData().isOptional()));
        AddressSpecification.AddressFieldSpec houseNumber$ui_core_release = addressSpecification.getHouseNumber();
        AddressDelegate addressDelegate3 = this.delegate;
        if (addressDelegate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate3 = null;
        }
        initHouseNumberInput(houseNumber$ui_core_release.getStyleResId(addressDelegate3.getAddressOutputData().isOptional()));
        AddressSpecification.AddressFieldSpec apartmentSuite$ui_core_release = addressSpecification.getApartmentSuite();
        AddressDelegate addressDelegate4 = this.delegate;
        if (addressDelegate4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate4 = null;
        }
        initApartmentSuiteInput(apartmentSuite$ui_core_release.getStyleResId(addressDelegate4.getAddressOutputData().isOptional()));
        AddressSpecification.AddressFieldSpec postalCode$ui_core_release = addressSpecification.getPostalCode();
        AddressDelegate addressDelegate5 = this.delegate;
        if (addressDelegate5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate5 = null;
        }
        initPostalCodeInput(postalCode$ui_core_release.getStyleResId(addressDelegate5.getAddressOutputData().isOptional()));
        AddressSpecification.AddressFieldSpec city$ui_core_release = addressSpecification.getCity();
        AddressDelegate addressDelegate6 = this.delegate;
        if (addressDelegate6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate6 = null;
        }
        initCityInput(city$ui_core_release.getStyleResId(addressDelegate6.getAddressOutputData().isOptional()));
        AddressSpecification.AddressFieldSpec stateProvince$ui_core_release = addressSpecification.getStateProvince();
        AddressDelegate addressDelegate7 = this.delegate;
        if (addressDelegate7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate7 = null;
        }
        initProvinceTerritoryInput(stateProvince$ui_core_release.getStyleResId(addressDelegate7.getAddressOutputData().isOptional()));
        AddressSpecification.AddressFieldSpec stateProvince$ui_core_release2 = addressSpecification.getStateProvince();
        AddressDelegate addressDelegate8 = this.delegate;
        if (addressDelegate8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        } else {
            addressDelegate2 = addressDelegate8;
        }
        initStatesInput(stateProvince$ui_core_release2.getStyleResId(addressDelegate2.getAddressOutputData().isOptional()));
    }

    private final void initHeader() {
        TextView textViewHeader = getTextViewHeader();
        if (textViewHeader != null) {
            int i11 = R.style.AdyenCheckout_AddressForm_HeaderTextAppearance;
            Context context = this.localizedContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context = null;
            }
            ViewExtensionsKt.setLocalizedTextFromStyle$default(textViewHeader, i11, context, false, 4, null);
        }
    }

    private final void initHouseNumberInput(Integer styleResId) {
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutHouseNumber = getTextInputLayoutHouseNumber();
            if (textInputLayoutHouseNumber != null) {
                Context context = this.localizedContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutHouseNumber, iIntValue, context);
            }
        }
        AdyenTextInputEditText editTextHouseNumber = getEditTextHouseNumber();
        if (editTextHouseNumber != null) {
            int i11 = 3;
            editTextHouseNumber.setOnChangeListener(new b(this, i11));
            editTextHouseNumber.setOnFocusChangeListener(new c(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHouseNumberInput$lambda$13$lambda$11(AddressFormInput addressFormInput, final Editable editable) {
        addressFormInput.getClass();
        editable.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initHouseNumberInput$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.setHouseNumberOrName(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayoutHouseNumber = addressFormInput.getTextInputLayoutHouseNumber();
        if (textInputLayoutHouseNumber != null) {
            ViewExtensionsKt.hideError(textInputLayoutHouseNumber);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHouseNumberInput$lambda$13$lambda$12(AddressFormInput addressFormInput, View view, boolean z11) {
        TextInputLayout textInputLayoutHouseNumber;
        addressFormInput.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Validation validation = addressDelegate.getAddressOutputData().getHouseNumberOrName().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutHouseNumber2 = addressFormInput.getTextInputLayoutHouseNumber();
            if (textInputLayoutHouseNumber2 != null) {
                ViewExtensionsKt.hideError(textInputLayoutHouseNumber2);
                return;
            }
            return;
        }
        if (!(validation instanceof Validation.Invalid) || (textInputLayoutHouseNumber = addressFormInput.getTextInputLayoutHouseNumber()) == null) {
            return;
        }
        Context context2 = addressFormInput.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context2;
        }
        b3.i.z((Validation.Invalid) validation, context, textInputLayoutHouseNumber);
    }

    private final void initPostalCodeInput(Integer styleResId) {
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutPostalCode = getTextInputLayoutPostalCode();
            if (textInputLayoutPostalCode != null) {
                Context context = this.localizedContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutPostalCode, iIntValue, context);
            }
        }
        AdyenTextInputEditText editTextPostalCode = getEditTextPostalCode();
        if (editTextPostalCode != null) {
            editTextPostalCode.setAutofillHints("postalCode");
            int i11 = 5;
            editTextPostalCode.setOnChangeListener(new b(this, i11));
            editTextPostalCode.setOnFocusChangeListener(new c(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPostalCodeInput$lambda$21$lambda$19(AddressFormInput addressFormInput, final Editable editable) {
        addressFormInput.getClass();
        editable.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initPostalCodeInput$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.setPostalCode(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayoutPostalCode = addressFormInput.getTextInputLayoutPostalCode();
        if (textInputLayoutPostalCode != null) {
            ViewExtensionsKt.hideError(textInputLayoutPostalCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPostalCodeInput$lambda$21$lambda$20(AddressFormInput addressFormInput, View view, boolean z11) {
        TextInputLayout textInputLayoutPostalCode;
        addressFormInput.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Validation validation = addressDelegate.getAddressOutputData().getPostalCode().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutPostalCode2 = addressFormInput.getTextInputLayoutPostalCode();
            if (textInputLayoutPostalCode2 != null) {
                ViewExtensionsKt.hideError(textInputLayoutPostalCode2);
                return;
            }
            return;
        }
        if (!(validation instanceof Validation.Invalid) || (textInputLayoutPostalCode = addressFormInput.getTextInputLayoutPostalCode()) == null) {
            return;
        }
        Context context2 = addressFormInput.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context2;
        }
        b3.i.z((Validation.Invalid) validation, context, textInputLayoutPostalCode);
    }

    private final void initProvinceTerritoryInput(Integer styleResId) {
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutProvinceTerritory = getTextInputLayoutProvinceTerritory();
            if (textInputLayoutProvinceTerritory != null) {
                Context context = this.localizedContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutProvinceTerritory, iIntValue, context);
            }
        }
        AdyenTextInputEditText editTextProvinceTerritory = getEditTextProvinceTerritory();
        if (editTextProvinceTerritory != null) {
            editTextProvinceTerritory.setAutofillHints("addressRegion");
            int i11 = 2;
            editTextProvinceTerritory.setOnChangeListener(new b(this, i11));
            editTextProvinceTerritory.setOnFocusChangeListener(new c(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initProvinceTerritoryInput$lambda$29$lambda$27(AddressFormInput addressFormInput, final Editable editable) {
        addressFormInput.getClass();
        editable.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initProvinceTerritoryInput$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.setStateOrProvince(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayoutProvinceTerritory = addressFormInput.getTextInputLayoutProvinceTerritory();
        if (textInputLayoutProvinceTerritory != null) {
            ViewExtensionsKt.hideError(textInputLayoutProvinceTerritory);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initProvinceTerritoryInput$lambda$29$lambda$28(AddressFormInput addressFormInput, View view, boolean z11) {
        TextInputLayout textInputLayoutProvinceTerritory;
        addressFormInput.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Validation validation = addressDelegate.getAddressOutputData().getStateOrProvince().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutProvinceTerritory2 = addressFormInput.getTextInputLayoutProvinceTerritory();
            if (textInputLayoutProvinceTerritory2 != null) {
                ViewExtensionsKt.hideError(textInputLayoutProvinceTerritory2);
                return;
            }
            return;
        }
        if (!(validation instanceof Validation.Invalid) || (textInputLayoutProvinceTerritory = addressFormInput.getTextInputLayoutProvinceTerritory()) == null) {
            return;
        }
        Context context2 = addressFormInput.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context2;
        }
        b3.i.z((Validation.Invalid) validation, context, textInputLayoutProvinceTerritory);
    }

    private final void initStatesInput(Integer styleResId) {
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutState = getTextInputLayoutState();
            if (textInputLayoutState != null) {
                Context context = this.localizedContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutState, iIntValue, context);
            }
        }
        AutoCompleteTextView autoCompleteTextViewState = getAutoCompleteTextViewState();
        if (autoCompleteTextViewState != null) {
            autoCompleteTextViewState.setAutofillHints("addressRegion");
            AddressListItem addressListItem = (AddressListItem) this.statesAdapter.getItem(new Function1<AddressListItem, Boolean>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initStatesInput$2$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull AddressListItem addressListItem2) {
                    addressListItem2.getClass();
                    return Boolean.valueOf(addressListItem2.getSelected());
                }
            });
            autoCompleteTextViewState.setText(addressListItem != null ? addressListItem.getName() : null);
            autoCompleteTextViewState.setInputType(0);
            autoCompleteTextViewState.setAdapter(this.statesAdapter);
            autoCompleteTextViewState.setOnItemClickListener(new a(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStatesInput$lambda$32$lambda$31(final AddressFormInput addressFormInput, AdapterView adapterView, View view, final int i11, long j9) {
        addressFormInput.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initStatesInput$2$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.setStateOrProvince(((AddressListItem) this.this$0.statesAdapter.getItem(i11)).getCode());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayoutState = addressFormInput.getTextInputLayoutState();
        if (textInputLayoutState != null) {
            ViewExtensionsKt.hideError(textInputLayoutState);
        }
    }

    private final void initStreetInput(Integer styleResId) {
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutStreet = getTextInputLayoutStreet();
            if (textInputLayoutStreet != null) {
                Context context = this.localizedContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutStreet, iIntValue, context);
            }
        }
        AdyenTextInputEditText editTextStreet = getEditTextStreet();
        if (editTextStreet != null) {
            editTextStreet.setAutofillHints("streetAddress");
            int i11 = 1;
            editTextStreet.setOnChangeListener(new b(this, i11));
            editTextStreet.setOnFocusChangeListener(new c(this, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStreetInput$lambda$9$lambda$7(AddressFormInput addressFormInput, final Editable editable) {
        addressFormInput.getClass();
        editable.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$initStreetInput$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.setStreet(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayoutStreet = addressFormInput.getTextInputLayoutStreet();
        if (textInputLayoutStreet != null) {
            ViewExtensionsKt.hideError(textInputLayoutStreet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStreetInput$lambda$9$lambda$8(AddressFormInput addressFormInput, View view, boolean z11) {
        TextInputLayout textInputLayoutStreet;
        addressFormInput.getClass();
        AddressDelegate addressDelegate = addressFormInput.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Validation validation = addressDelegate.getAddressOutputData().getStreet().getValidation();
        if (z11) {
            TextInputLayout textInputLayoutStreet2 = addressFormInput.getTextInputLayoutStreet();
            if (textInputLayoutStreet2 != null) {
                ViewExtensionsKt.hideError(textInputLayoutStreet2);
                return;
            }
            return;
        }
        if (!(validation instanceof Validation.Invalid) || (textInputLayoutStreet = addressFormInput.getTextInputLayoutStreet()) == null) {
            return;
        }
        Context context2 = addressFormInput.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context2;
        }
        b3.i.z((Validation.Invalid) validation, context, textInputLayoutStreet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(AddressFormInput addressFormInput, AdapterView adapterView, View view, int i11, long j9) {
        addressFormInput.getClass();
        final AddressListItem addressListItem = (AddressListItem) addressFormInput.countryAdapter.getItem(i11);
        AddressDelegate addressDelegate = addressFormInput.delegate;
        AddressDelegate addressDelegate2 = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        if (!Intrinsics.areEqual(addressDelegate.getAddressOutputData().getCountry().getValue(), addressListItem.getCode())) {
            AddressDelegate addressDelegate3 = addressFormInput.delegate;
            if (addressDelegate3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            } else {
                addressDelegate2 = addressDelegate3;
            }
            addressDelegate2.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$1$1$1
                {
                    super(1);
                }

                public final void invoke(@NotNull AddressInputModel addressInputModel) {
                    addressInputModel.getClass();
                    addressInputModel.setStateOrProvince("");
                    addressInputModel.setCountry(addressListItem.getCode());
                    addressInputModel.setCountryDisplayName(addressListItem.getName());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AddressInputModel) obj);
                    return Unit.f26487a;
                }
            });
            addressFormInput.populateFormFields(AddressSpecification.INSTANCE.fromString(addressListItem.getCode()));
        }
        TextInputLayout textInputLayoutCountry = addressFormInput.getTextInputLayoutCountry();
        if (textInputLayoutCountry != null) {
            ViewExtensionsKt.hideError(textInputLayoutCountry);
        }
    }

    private final void populateFormFields(AddressSpecification specification) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[specification.ordinal()];
        if (i12 == 1) {
            i11 = R.layout.address_form_br;
        } else if (i12 == 2) {
            i11 = R.layout.address_form_ca;
        } else if (i12 == 3) {
            i11 = R.layout.address_form_gb;
        } else if (i12 == 4) {
            i11 = R.layout.address_form_us;
        } else {
            if (i12 != 5) {
                e40.a.f();
                return;
            }
            i11 = R.layout.address_form_default;
        }
        boolean zHasFocus = hasFocus();
        LinearLayout formContainer = getFormContainer();
        if (formContainer != null) {
            formContainer.removeAllViews();
        }
        LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) getFormContainer(), true);
        AddressDelegate addressDelegate = this.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        updateInputFields(addressDelegate.getAddressOutputData());
        initForm(specification);
        if (zHasFocus) {
            requestFocus();
        }
    }

    private final void setTextIfChanged(TextView textView, String str) {
        if (Intrinsics.areEqual(str, textView.getText().toString())) {
            return;
        }
        textView.setText(str);
    }

    private final void subscribeCountryAndStateList(b0 coroutineScope) {
        AddressDelegate addressDelegate = this.delegate;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        r.u(coroutineScope, new w(addressDelegate.getAddressOutputDataFlow(), new AnonymousClass1(null), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCountries(List<AddressListItem> countryList) {
        Object next;
        AddressDelegate addressDelegate;
        AddressListItem addressListItem = (AddressListItem) this.countryAdapter.getItem(new Function1<AddressListItem, Boolean>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$updateCountries$currentSelected$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull AddressListItem addressListItem2) {
                addressListItem2.getClass();
                return Boolean.valueOf(addressListItem2.getSelected());
            }
        });
        this.countryAdapter.setItems(countryList);
        Iterator<T> it = countryList.iterator();
        while (true) {
            addressDelegate = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((AddressListItem) next).getSelected()) {
                    break;
                }
            }
        }
        AddressListItem addressListItem2 = (AddressListItem) next;
        AddressSpecification addressSpecificationFromString = AddressSpecification.INSTANCE.fromString(addressListItem2 != null ? addressListItem2.getCode() : null);
        if (addressSpecificationFromString == this.currentSpec && Intrinsics.areEqual(addressListItem, addressListItem2)) {
            AddressDelegate addressDelegate2 = this.delegate;
            if (addressDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            } else {
                addressDelegate = addressDelegate2;
            }
            updateInputFields(addressDelegate.getAddressOutputData());
            return;
        }
        this.currentSpec = addressSpecificationFromString;
        AutoCompleteTextView autoCompleteTextViewCountry = getAutoCompleteTextViewCountry();
        if (autoCompleteTextViewCountry != null) {
            autoCompleteTextViewCountry.setText(addressListItem2 != null ? addressListItem2.getName() : null);
        }
        populateFormFields(addressSpecificationFromString);
    }

    private final void updateInputFields(AddressOutputData outputData) {
        AdyenTextInputEditText editTextStreet = getEditTextStreet();
        if (editTextStreet != null) {
            setTextIfChanged(editTextStreet, outputData.getStreet().getValue());
        }
        AdyenTextInputEditText editTextHouseNumber = getEditTextHouseNumber();
        if (editTextHouseNumber != null) {
            setTextIfChanged(editTextHouseNumber, outputData.getHouseNumberOrName().getValue());
        }
        AdyenTextInputEditText editTextApartmentSuite = getEditTextApartmentSuite();
        if (editTextApartmentSuite != null) {
            setTextIfChanged(editTextApartmentSuite, outputData.getApartmentSuite().getValue());
        }
        AdyenTextInputEditText editTextPostalCode = getEditTextPostalCode();
        if (editTextPostalCode != null) {
            setTextIfChanged(editTextPostalCode, outputData.getPostalCode().getValue());
        }
        AdyenTextInputEditText editTextCity = getEditTextCity();
        if (editTextCity != null) {
            setTextIfChanged(editTextCity, outputData.getCity().getValue());
        }
        AdyenTextInputEditText editTextProvinceTerritory = getEditTextProvinceTerritory();
        if (editTextProvinceTerritory != null) {
            setTextIfChanged(editTextProvinceTerritory, outputData.getStateOrProvince().getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStates(List<AddressListItem> stateList) {
        AddressDelegate addressDelegate;
        Object next;
        this.statesAdapter.setItems(stateList);
        Iterator<T> it = stateList.iterator();
        while (true) {
            addressDelegate = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((AddressListItem) next).getSelected()) {
                    break;
                }
            }
        }
        final AddressListItem addressListItem = (AddressListItem) next;
        if (addressListItem != null) {
            AutoCompleteTextView autoCompleteTextViewState = getAutoCompleteTextViewState();
            if (autoCompleteTextViewState != null) {
                autoCompleteTextViewState.setText(addressListItem.getName());
            }
            AddressDelegate addressDelegate2 = this.delegate;
            if (addressDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
                addressDelegate2 = null;
            }
            if (Intrinsics.areEqual(addressDelegate2.getAddressOutputData().getStateOrProvince().getValue(), addressListItem.getCode())) {
                return;
            }
            AddressDelegate addressDelegate3 = this.delegate;
            if (addressDelegate3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            } else {
                addressDelegate = addressDelegate3;
            }
            addressDelegate.updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput$updateStates$2$1
                {
                    super(1);
                }

                public final void invoke(@NotNull AddressInputModel addressInputModel) {
                    addressInputModel.getClass();
                    addressInputModel.setStateOrProvince(addressListItem.getCode());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AddressInputModel) obj);
                    return Unit.f26487a;
                }
            });
        }
    }

    public final void attachDelegate(@NotNull AddressDelegate delegate, @NotNull b0 coroutineScope) {
        delegate.getClass();
        coroutineScope.getClass();
        this.delegate = delegate;
        subscribeCountryAndStateList(coroutineScope);
    }

    public final void highlightValidationErrors(boolean isErrorFocusedPreviously) {
        AddressDelegate addressDelegate = this.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        Validation validation = addressDelegate.getAddressOutputData().getCountry().getValidation();
        boolean z11 = true;
        if (validation instanceof Validation.Invalid) {
            if (!isErrorFocusedPreviously) {
                TextInputLayout textInputLayoutCountry = getTextInputLayoutCountry();
                if (textInputLayoutCountry != null) {
                    textInputLayoutCountry.requestFocus();
                }
                isErrorFocusedPreviously = true;
            }
            TextInputLayout textInputLayoutCountry2 = getTextInputLayoutCountry();
            if (textInputLayoutCountry2 != null) {
                Context context2 = this.localizedContext;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context2 = null;
                }
                b3.i.z((Validation.Invalid) validation, context2, textInputLayoutCountry2);
            }
        }
        AddressDelegate addressDelegate2 = this.delegate;
        if (addressDelegate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate2 = null;
        }
        Validation validation2 = addressDelegate2.getAddressOutputData().getStreet().getValidation();
        if (validation2 instanceof Validation.Invalid) {
            if (!isErrorFocusedPreviously) {
                TextInputLayout textInputLayoutStreet = getTextInputLayoutStreet();
                if (textInputLayoutStreet != null) {
                    textInputLayoutStreet.requestFocus();
                }
                isErrorFocusedPreviously = true;
            }
            TextInputLayout textInputLayoutStreet2 = getTextInputLayoutStreet();
            if (textInputLayoutStreet2 != null) {
                Context context3 = this.localizedContext;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context3 = null;
                }
                b3.i.z((Validation.Invalid) validation2, context3, textInputLayoutStreet2);
            }
        }
        AddressDelegate addressDelegate3 = this.delegate;
        if (addressDelegate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate3 = null;
        }
        Validation validation3 = addressDelegate3.getAddressOutputData().getHouseNumberOrName().getValidation();
        if (validation3 instanceof Validation.Invalid) {
            if (!isErrorFocusedPreviously) {
                TextInputLayout textInputLayoutHouseNumber = getTextInputLayoutHouseNumber();
                if (textInputLayoutHouseNumber != null) {
                    textInputLayoutHouseNumber.requestFocus();
                }
                isErrorFocusedPreviously = true;
            }
            TextInputLayout textInputLayoutHouseNumber2 = getTextInputLayoutHouseNumber();
            if (textInputLayoutHouseNumber2 != null) {
                Context context4 = this.localizedContext;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context4 = null;
                }
                b3.i.z((Validation.Invalid) validation3, context4, textInputLayoutHouseNumber2);
            }
        }
        AddressDelegate addressDelegate4 = this.delegate;
        if (addressDelegate4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate4 = null;
        }
        Validation validation4 = addressDelegate4.getAddressOutputData().getApartmentSuite().getValidation();
        if (validation4 instanceof Validation.Invalid) {
            if (!isErrorFocusedPreviously) {
                TextInputLayout textInputLayoutApartmentSuite = getTextInputLayoutApartmentSuite();
                if (textInputLayoutApartmentSuite != null) {
                    textInputLayoutApartmentSuite.requestFocus();
                }
                isErrorFocusedPreviously = true;
            }
            TextInputLayout textInputLayoutApartmentSuite2 = getTextInputLayoutApartmentSuite();
            if (textInputLayoutApartmentSuite2 != null) {
                Context context5 = this.localizedContext;
                if (context5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context5 = null;
                }
                b3.i.z((Validation.Invalid) validation4, context5, textInputLayoutApartmentSuite2);
            }
        }
        AddressDelegate addressDelegate5 = this.delegate;
        if (addressDelegate5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate5 = null;
        }
        Validation validation5 = addressDelegate5.getAddressOutputData().getPostalCode().getValidation();
        if (validation5 instanceof Validation.Invalid) {
            if (!isErrorFocusedPreviously) {
                TextInputLayout textInputLayoutPostalCode = getTextInputLayoutPostalCode();
                if (textInputLayoutPostalCode != null) {
                    textInputLayoutPostalCode.requestFocus();
                }
                isErrorFocusedPreviously = true;
            }
            TextInputLayout textInputLayoutPostalCode2 = getTextInputLayoutPostalCode();
            if (textInputLayoutPostalCode2 != null) {
                Context context6 = this.localizedContext;
                if (context6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context6 = null;
                }
                b3.i.z((Validation.Invalid) validation5, context6, textInputLayoutPostalCode2);
            }
        }
        AddressDelegate addressDelegate6 = this.delegate;
        if (addressDelegate6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate6 = null;
        }
        Validation validation6 = addressDelegate6.getAddressOutputData().getCity().getValidation();
        if (validation6 instanceof Validation.Invalid) {
            if (isErrorFocusedPreviously) {
                z11 = isErrorFocusedPreviously;
            } else {
                TextInputLayout textInputLayoutCity = getTextInputLayoutCity();
                if (textInputLayoutCity != null) {
                    textInputLayoutCity.requestFocus();
                }
            }
            TextInputLayout textInputLayoutCity2 = getTextInputLayoutCity();
            if (textInputLayoutCity2 != null) {
                Context context7 = this.localizedContext;
                if (context7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context7 = null;
                }
                b3.i.z((Validation.Invalid) validation6, context7, textInputLayoutCity2);
            }
            isErrorFocusedPreviously = z11;
        }
        AddressDelegate addressDelegate7 = this.delegate;
        if (addressDelegate7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate7 = null;
        }
        Validation validation7 = addressDelegate7.getAddressOutputData().getStateOrProvince().getValidation();
        if (validation7 instanceof Validation.Invalid) {
            if (!isErrorFocusedPreviously) {
                TextInputLayout textInputLayoutProvinceTerritory = getTextInputLayoutProvinceTerritory();
                if (textInputLayoutProvinceTerritory != null) {
                    textInputLayoutProvinceTerritory.requestFocus();
                }
                TextInputLayout textInputLayoutState = getTextInputLayoutState();
                if (textInputLayoutState != null) {
                    textInputLayoutState.requestFocus();
                }
            }
            TextInputLayout textInputLayoutProvinceTerritory2 = getTextInputLayoutProvinceTerritory();
            if (textInputLayoutProvinceTerritory2 != null) {
                Context context8 = this.localizedContext;
                if (context8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context8 = null;
                }
                b3.i.z((Validation.Invalid) validation7, context8, textInputLayoutProvinceTerritory2);
            }
            TextInputLayout textInputLayoutState2 = getTextInputLayoutState();
            if (textInputLayoutState2 != null) {
                Context context9 = this.localizedContext;
                if (context9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                } else {
                    context = context9;
                }
                b3.i.z((Validation.Invalid) validation7, context, textInputLayoutState2);
            }
        }
    }

    public final void initLocalizedContext(@NotNull Context localizedContext) {
        localizedContext.getClass();
        this.localizedContext = localizedContext;
    }

    public final void updateAddressHint(boolean isOptional) {
        AddressSpecification.Companion companion = AddressSpecification.INSTANCE;
        AddressDelegate addressDelegate = this.delegate;
        Context context = null;
        if (addressDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            addressDelegate = null;
        }
        AddressSpecification addressSpecificationFromString = companion.fromString(addressDelegate.getAddressOutputData().getCountry().getValue());
        Integer styleResId = addressSpecificationFromString.getStreet().getStyleResId(isOptional);
        if (styleResId != null) {
            int iIntValue = styleResId.intValue();
            TextInputLayout textInputLayoutStreet = getTextInputLayoutStreet();
            if (textInputLayoutStreet != null) {
                Context context2 = this.localizedContext;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context2 = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutStreet, iIntValue, context2);
            }
        }
        Integer styleResId2 = addressSpecificationFromString.getHouseNumber().getStyleResId(isOptional);
        if (styleResId2 != null) {
            int iIntValue2 = styleResId2.intValue();
            TextInputLayout textInputLayoutHouseNumber = getTextInputLayoutHouseNumber();
            if (textInputLayoutHouseNumber != null) {
                Context context3 = this.localizedContext;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context3 = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutHouseNumber, iIntValue2, context3);
            }
        }
        Integer styleResId3 = addressSpecificationFromString.getApartmentSuite().getStyleResId(isOptional);
        if (styleResId3 != null) {
            int iIntValue3 = styleResId3.intValue();
            TextInputLayout textInputLayoutApartmentSuite = getTextInputLayoutApartmentSuite();
            if (textInputLayoutApartmentSuite != null) {
                Context context4 = this.localizedContext;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context4 = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutApartmentSuite, iIntValue3, context4);
            }
        }
        Integer styleResId4 = addressSpecificationFromString.getPostalCode().getStyleResId(isOptional);
        if (styleResId4 != null) {
            int iIntValue4 = styleResId4.intValue();
            TextInputLayout textInputLayoutPostalCode = getTextInputLayoutPostalCode();
            if (textInputLayoutPostalCode != null) {
                Context context5 = this.localizedContext;
                if (context5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context5 = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutPostalCode, iIntValue4, context5);
            }
        }
        Integer styleResId5 = addressSpecificationFromString.getCity().getStyleResId(isOptional);
        if (styleResId5 != null) {
            int iIntValue5 = styleResId5.intValue();
            TextInputLayout textInputLayoutCity = getTextInputLayoutCity();
            if (textInputLayoutCity != null) {
                Context context6 = this.localizedContext;
                if (context6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context6 = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutCity, iIntValue5, context6);
            }
        }
        Integer styleResId6 = addressSpecificationFromString.getStateProvince().getStyleResId(isOptional);
        if (styleResId6 != null) {
            int iIntValue6 = styleResId6.intValue();
            TextInputLayout textInputLayoutProvinceTerritory = getTextInputLayoutProvinceTerritory();
            if (textInputLayoutProvinceTerritory != null) {
                Context context7 = this.localizedContext;
                if (context7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                    context7 = null;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutProvinceTerritory, iIntValue6, context7);
            }
        }
        Integer styleResId7 = addressSpecificationFromString.getStateProvince().getStyleResId(isOptional);
        if (styleResId7 != null) {
            int iIntValue7 = styleResId7.intValue();
            TextInputLayout textInputLayoutState = getTextInputLayoutState();
            if (textInputLayoutState != null) {
                Context context8 = this.localizedContext;
                if (context8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                } else {
                    context = context8;
                }
                ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayoutState, iIntValue7, context);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AddressFormInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
