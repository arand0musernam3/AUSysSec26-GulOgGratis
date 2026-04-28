package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.z;
import androidx.recyclerview.widget.RecyclerView;
import ba0.g;
import bg.s;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.databinding.AddressLookupViewBinding;
import com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.model.AddressLookupState;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.braze.h2;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
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
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010$\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0014J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0014J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010$\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00102\u0006\u0010$\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010\u0014J\u0017\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0010H\u0002¢\u0006\u0004\b@\u0010\u0014R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0016\u0010E\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "localizedContext", "", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;", "observeDelegate", "(Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;Lv80/b0;)V", "initLocalizedStrings", "(Landroid/content/Context;)V", "initAddressLookupQuery", "initAddressFormInput", "(Lv80/b0;)V", "initAddressOptions", "initManualEntryFields", "initSubmitAddressButton", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "addressLookupState", "outputDataChanged", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;)V", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Error;", "handleErrorState", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Error;)V", "handleInitialState", "handleLoadingState", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Form;", "handleFormState", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Form;)V", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$SearchResult;", "handleSearchResultState", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$SearchResult;)V", "handleInvalidUIState", "", "query", "onQueryChanged", "(Ljava/lang/String;)V", "", "Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;", "options", "setAddressOptions", "(Ljava/util/List;)V", "Lcom/adyen/checkout/components/core/LookupAddress;", "lookupAddress", "onAddressSelected", "(Lcom/adyen/checkout/components/core/LookupAddress;)V", "removeFocusFromSearch", "Lcom/adyen/checkout/ui/core/databinding/AddressLookupViewBinding;", "binding", "Lcom/adyen/checkout/ui/core/databinding/AddressLookupViewBinding;", "Landroid/content/Context;", "addressLookupDelegate", "Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter;", "addressLookupOptionsAdapter", "Lcom/adyen/checkout/ui/core/internal/ui/view/AddressLookupOptionsAdapter;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddressLookupView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLookupView.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AddressLookupView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,308:1\n1#2:309\n256#3,2:310\n256#3,2:312\n256#3,2:314\n256#3,2:316\n256#3,2:318\n256#3,2:320\n256#3,2:322\n256#3,2:324\n256#3,2:326\n256#3,2:328\n256#3,2:330\n256#3,2:332\n256#3,2:334\n256#3,2:336\n256#3,2:338\n256#3,2:340\n256#3,2:342\n256#3,2:344\n256#3,2:346\n256#3,2:348\n256#3,2:350\n256#3,2:352\n256#3,2:354\n256#3,2:356\n256#3,2:358\n256#3,2:360\n256#3,2:362\n256#3,2:364\n256#3,2:366\n256#3,2:368\n256#3,2:370\n256#3,2:372\n256#3,2:374\n256#3,2:376\n256#3,2:378\n256#3,2:380\n256#3,2:382\n256#3,2:384\n256#3,2:386\n256#3,2:388\n256#3,2:390\n256#3,2:392\n256#3,2:394\n256#3,2:396\n256#3,2:398\n256#3,2:400\n256#3,2:402\n256#3,2:404\n256#3,2:406\n256#3,2:408\n256#3,2:410\n*S KotlinDebug\n*F\n+ 1 AddressLookupView.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AddressLookupView\n*L\n205#1:310,2\n206#1:312,2\n207#1:314,2\n208#1:316,2\n209#1:318,2\n210#1:320,2\n211#1:322,2\n212#1:324,2\n213#1:326,2\n214#1:328,2\n221#1:330,2\n222#1:332,2\n223#1:334,2\n224#1:336,2\n225#1:338,2\n226#1:340,2\n227#1:342,2\n228#1:344,2\n229#1:346,2\n230#1:348,2\n234#1:350,2\n238#1:352,2\n239#1:354,2\n240#1:356,2\n241#1:358,2\n242#1:360,2\n243#1:362,2\n244#1:364,2\n245#1:366,2\n246#1:368,2\n247#1:370,2\n258#1:372,2\n259#1:374,2\n260#1:376,2\n261#1:378,2\n262#1:380,2\n263#1:382,2\n264#1:384,2\n265#1:386,2\n266#1:388,2\n267#1:390,2\n272#1:392,2\n273#1:394,2\n274#1:396,2\n275#1:398,2\n276#1:400,2\n277#1:402,2\n278#1:404,2\n279#1:406,2\n280#1:408,2\n281#1:410,2\n*E\n"})
public final class AddressLookupView extends LinearLayout implements ComponentView {
    private AddressLookupDelegate addressLookupDelegate;

    @Nullable
    private AddressLookupOptionsAdapter addressLookupOptionsAdapter;

    @NotNull
    private final AddressLookupViewBinding binding;
    private Context localizedContext;

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView$observeDelegate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView$observeDelegate$1", f = "AddressLookupView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01421 extends i implements Function2<AddressLookupState, x70.c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C01421(x70.c<? super C01421> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
            C01421 c01421 = AddressLookupView.this.new C01421(cVar);
            c01421.L$0 = obj;
            return c01421;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AddressLookupState addressLookupState, @Nullable x70.c<? super Unit> cVar) {
            return ((C01421) create(addressLookupState, cVar)).invokeSuspend(Unit.f26487a);
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
            AddressLookupView.this.outputDataChanged((AddressLookupState) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView$observeDelegate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView$observeDelegate$2", f = "AddressLookupView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", InAppMessageBase.MESSAGE, ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<String, x70.c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AddressLookupView.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable String str, @Nullable x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            Context context = null;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            String string = (String) this.L$0;
            if (string == null) {
                Context context2 = AddressLookupView.this.localizedContext;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                } else {
                    context = context2;
                }
                string = context.getString(R.string.component_error);
                string.getClass();
            }
            z zVar = new z(AddressLookupView.this.getContext());
            k.c cVar = (k.c) zVar.f2543c;
            cVar.f25521d = cVar.f25518a.getText(R.string.error_dialog_title);
            cVar.f25523f = string;
            int i11 = R.string.error_dialog_button;
            e eVar = new e();
            cVar.f25524g = cVar.f25518a.getText(i11);
            cVar.f25525h = eVar;
            zVar.g().show();
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressLookupView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        AddressLookupViewBinding addressLookupViewBindingInflate = AddressLookupViewBinding.inflate(LayoutInflater.from(context), this);
        addressLookupViewBindingInflate.getClass();
        this.binding = addressLookupViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, dimension);
    }

    private final void handleErrorState(AddressLookupState.Error addressLookupState) {
        RecyclerView recyclerView = this.binding.recyclerViewAddressLookupOptions;
        recyclerView.getClass();
        recyclerView.setVisibility(8);
        TextView textView = this.binding.textViewInitialDisclaimer;
        textView.getClass();
        textView.setVisibility(8);
        TextView textView2 = this.binding.textViewError;
        textView2.getClass();
        textView2.setVisibility(0);
        TextView textView3 = this.binding.textViewManualEntryError;
        textView3.getClass();
        textView3.setVisibility(0);
        TextView textView4 = this.binding.textViewManualEntryInitial;
        textView4.getClass();
        textView4.setVisibility(8);
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        addressFormInput.getClass();
        addressFormInput.setVisibility(8);
        ProgressBar progressBar = this.binding.progressBar;
        progressBar.getClass();
        progressBar.setVisibility(8);
        Button button = this.binding.buttonManualEntry;
        button.getClass();
        button.setVisibility(8);
        View view = this.binding.divider;
        view.getClass();
        view.setVisibility(8);
        MaterialButton materialButton = this.binding.buttonSubmitAddress;
        materialButton.getClass();
        materialButton.setVisibility(8);
        TextView textView5 = this.binding.textViewManualEntryError;
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        String string = context.getString(R.string.checkout_address_lookup_empty_description, addressLookupState.getQuery());
        string.getClass();
        textView5.setText(ViewExtensionsKt.formatStringWithHyperlink(string, "#"));
    }

    private final void handleFormState(final AddressLookupState.Form addressLookupState) {
        RecyclerView recyclerView = this.binding.recyclerViewAddressLookupOptions;
        recyclerView.getClass();
        recyclerView.setVisibility(8);
        TextView textView = this.binding.textViewInitialDisclaimer;
        textView.getClass();
        textView.setVisibility(8);
        TextView textView2 = this.binding.textViewError;
        textView2.getClass();
        textView2.setVisibility(8);
        TextView textView3 = this.binding.textViewManualEntryError;
        textView3.getClass();
        textView3.setVisibility(8);
        TextView textView4 = this.binding.textViewManualEntryInitial;
        textView4.getClass();
        textView4.setVisibility(8);
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        addressFormInput.getClass();
        addressFormInput.setVisibility(0);
        ProgressBar progressBar = this.binding.progressBar;
        progressBar.getClass();
        progressBar.setVisibility(8);
        Button button = this.binding.buttonManualEntry;
        button.getClass();
        button.setVisibility(8);
        View view = this.binding.divider;
        view.getClass();
        view.setVisibility(8);
        MaterialButton materialButton = this.binding.buttonSubmitAddress;
        materialButton.getClass();
        materialButton.setVisibility(0);
        AddressLookupDelegate addressLookupDelegate = this.addressLookupDelegate;
        if (addressLookupDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressLookupDelegate");
            addressLookupDelegate = null;
        }
        addressLookupDelegate.getAddressDelegate().updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView.handleFormState.1
            {
                super(1);
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                if (addressLookupState.getSelectedAddress() == null) {
                    addressInputModel.resetAll();
                } else {
                    addressInputModel.set(addressLookupState.getSelectedAddress());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }
        });
    }

    private final void handleInitialState() {
        RecyclerView recyclerView = this.binding.recyclerViewAddressLookupOptions;
        recyclerView.getClass();
        recyclerView.setVisibility(8);
        TextView textView = this.binding.textViewInitialDisclaimer;
        textView.getClass();
        textView.setVisibility(0);
        TextView textView2 = this.binding.textViewError;
        textView2.getClass();
        textView2.setVisibility(8);
        TextView textView3 = this.binding.textViewManualEntryError;
        textView3.getClass();
        textView3.setVisibility(8);
        TextView textView4 = this.binding.textViewManualEntryInitial;
        textView4.getClass();
        textView4.setVisibility(0);
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        addressFormInput.getClass();
        addressFormInput.setVisibility(8);
        ProgressBar progressBar = this.binding.progressBar;
        progressBar.getClass();
        progressBar.setVisibility(8);
        Button button = this.binding.buttonManualEntry;
        button.getClass();
        button.setVisibility(8);
        View view = this.binding.divider;
        view.getClass();
        view.setVisibility(8);
        MaterialButton materialButton = this.binding.buttonSubmitAddress;
        materialButton.getClass();
        materialButton.setVisibility(8);
    }

    private final void handleInvalidUIState() {
        RecyclerView recyclerView = this.binding.recyclerViewAddressLookupOptions;
        recyclerView.getClass();
        recyclerView.setVisibility(8);
        TextView textView = this.binding.textViewInitialDisclaimer;
        textView.getClass();
        textView.setVisibility(8);
        TextView textView2 = this.binding.textViewError;
        textView2.getClass();
        textView2.setVisibility(8);
        TextView textView3 = this.binding.textViewManualEntryError;
        textView3.getClass();
        textView3.setVisibility(8);
        TextView textView4 = this.binding.textViewManualEntryInitial;
        textView4.getClass();
        textView4.setVisibility(8);
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        addressFormInput.getClass();
        addressFormInput.setVisibility(0);
        ProgressBar progressBar = this.binding.progressBar;
        progressBar.getClass();
        progressBar.setVisibility(8);
        Button button = this.binding.buttonManualEntry;
        button.getClass();
        button.setVisibility(8);
        View view = this.binding.divider;
        view.getClass();
        view.setVisibility(8);
        MaterialButton materialButton = this.binding.buttonSubmitAddress;
        materialButton.getClass();
        materialButton.setVisibility(0);
        highlightValidationErrors();
    }

    private final void handleLoadingState() {
        ProgressBar progressBar = this.binding.progressBar;
        progressBar.getClass();
        progressBar.setVisibility(0);
    }

    private final void handleSearchResultState(AddressLookupState.SearchResult addressLookupState) {
        RecyclerView recyclerView = this.binding.recyclerViewAddressLookupOptions;
        recyclerView.getClass();
        recyclerView.setVisibility(0);
        TextView textView = this.binding.textViewInitialDisclaimer;
        textView.getClass();
        textView.setVisibility(8);
        TextView textView2 = this.binding.textViewError;
        textView2.getClass();
        textView2.setVisibility(8);
        TextView textView3 = this.binding.textViewManualEntryError;
        textView3.getClass();
        textView3.setVisibility(8);
        TextView textView4 = this.binding.textViewManualEntryInitial;
        textView4.getClass();
        textView4.setVisibility(8);
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        addressFormInput.getClass();
        addressFormInput.setVisibility(8);
        ProgressBar progressBar = this.binding.progressBar;
        progressBar.getClass();
        progressBar.setVisibility(8);
        Button button = this.binding.buttonManualEntry;
        button.getClass();
        button.setVisibility(0);
        View view = this.binding.divider;
        view.getClass();
        view.setVisibility(0);
        MaterialButton materialButton = this.binding.buttonSubmitAddress;
        materialButton.getClass();
        materialButton.setVisibility(8);
        setAddressOptions(addressLookupState.getOptions());
    }

    private final void initAddressFormInput(b0 coroutineScope) {
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        AddressLookupDelegate addressLookupDelegate = this.addressLookupDelegate;
        if (addressLookupDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressLookupDelegate");
            addressLookupDelegate = null;
        }
        addressFormInput.attachDelegate(addressLookupDelegate.getAddressDelegate(), coroutineScope);
    }

    private final void initAddressLookupQuery() {
        SearchView searchView = this.binding.textInputLayoutAddressLookupQuerySearch;
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView$initAddressLookupQuery$1$1
            @Override // android.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(@NotNull String newText) {
                newText.getClass();
                this.this$0.onQueryChanged(newText);
                return true;
            }

            @Override // android.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(@NotNull String query) {
                query.getClass();
                this.this$0.removeFocusFromSearch();
                return true;
            }
        });
        searchView.setOnQueryTextFocusChangeListener(new s(searchView, 4));
        searchView.requestFocus();
        ViewExtensionsKt.showKeyboard(searchView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAddressLookupQuery$lambda$2$lambda$1(SearchView searchView, View view, boolean z11) {
        searchView.getClass();
        searchView.setSelected(z11);
    }

    private final void initAddressOptions() {
        AddressLookupOptionsAdapter addressLookupOptionsAdapter = new AddressLookupOptionsAdapter(new C01411(this));
        this.addressLookupOptionsAdapter = addressLookupOptionsAdapter;
        this.binding.recyclerViewAddressLookupOptions.setAdapter(addressLookupOptionsAdapter);
    }

    private final void initLocalizedStrings(Context localizedContext) {
        SearchView searchView = this.binding.textInputLayoutAddressLookupQuerySearch;
        searchView.getClass();
        ViewExtensionsKt.setLocalizedQueryHintFromStyle(searchView, R.style.AdyenCheckout_AddressLookup_Query, localizedContext);
        TextView textView = this.binding.textViewInitialDisclaimer;
        textView.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView, R.style.AdyenCheckout_AddressLookup_InitialDisclaimer_Title, localizedContext, false, 4, null);
        TextView textView2 = this.binding.textViewManualEntryInitial;
        String string = localizedContext.getString(R.string.checkout_address_lookup_initial_description);
        string.getClass();
        textView2.setText(ViewExtensionsKt.formatStringWithHyperlink(string, "#"));
        TextView textView3 = this.binding.textViewError;
        textView3.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView3, R.style.AdyenCheckout_AddressLookup_Empty_Title, localizedContext, false, 4, null);
        TextView textView4 = this.binding.textViewManualEntryError;
        textView4.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle(textView4, R.style.AdyenCheckout_AddressLookup_Empty_Description, localizedContext, true);
        Button button = this.binding.buttonManualEntry;
        button.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(button, R.style.AdyenCheckout_AddressLookup_Button_Manual, localizedContext, false, 4, null);
        MaterialButton materialButton = this.binding.buttonSubmitAddress;
        materialButton.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(materialButton, R.style.AdyenCheckout_AddressLookup_Button_Submit, localizedContext, false, 4, null);
        this.binding.addressFormInput.initLocalizedContext(localizedContext);
    }

    private final void initManualEntryFields() {
        d dVar = new d(this, 1);
        this.binding.textViewManualEntryError.setOnClickListener(dVar);
        this.binding.textViewManualEntryInitial.setOnClickListener(dVar);
        this.binding.buttonManualEntry.setOnClickListener(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initManualEntryFields$lambda$4(AddressLookupView addressLookupView, View view) {
        addressLookupView.getClass();
        AddressLookupDelegate addressLookupDelegate = addressLookupView.addressLookupDelegate;
        if (addressLookupDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressLookupDelegate");
            addressLookupDelegate = null;
        }
        addressLookupDelegate.onManualEntryModeSelected();
        addressLookupView.removeFocusFromSearch();
    }

    private final void initSubmitAddressButton() {
        this.binding.buttonSubmitAddress.setOnClickListener(new d(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSubmitAddressButton$lambda$5(AddressLookupView addressLookupView, View view) {
        addressLookupView.getClass();
        AddressLookupDelegate addressLookupDelegate = addressLookupView.addressLookupDelegate;
        if (addressLookupDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressLookupDelegate");
            addressLookupDelegate = null;
        }
        addressLookupDelegate.submitAddress();
    }

    private final void observeDelegate(AddressLookupDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getAddressLookupStateFlow(), new C01421(null), 5));
        r.u(coroutineScope, new w(delegate.getAddressLookupErrorPopupFlow(), new AnonymousClass2(null), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddressSelected(LookupAddress lookupAddress) {
        removeFocusFromSearch();
        AddressLookupDelegate addressLookupDelegate = this.addressLookupDelegate;
        if (addressLookupDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressLookupDelegate");
            addressLookupDelegate = null;
        }
        addressLookupDelegate.onAddressLookupCompletion(lookupAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onQueryChanged(String query) {
        AddressLookupDelegate addressLookupDelegate = this.addressLookupDelegate;
        if (addressLookupDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressLookupDelegate");
            addressLookupDelegate = null;
        }
        addressLookupDelegate.onAddressQueryChanged(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(AddressLookupState addressLookupState) {
        if (addressLookupState instanceof AddressLookupState.Error) {
            handleErrorState((AddressLookupState.Error) addressLookupState);
            return;
        }
        if (addressLookupState instanceof AddressLookupState.Initial) {
            handleInitialState();
            return;
        }
        if (Intrinsics.areEqual(addressLookupState, AddressLookupState.Loading.INSTANCE)) {
            handleLoadingState();
            return;
        }
        if (addressLookupState instanceof AddressLookupState.Form) {
            handleFormState((AddressLookupState.Form) addressLookupState);
        } else if (addressLookupState instanceof AddressLookupState.SearchResult) {
            handleSearchResultState((AddressLookupState.SearchResult) addressLookupState);
        } else if (Intrinsics.areEqual(addressLookupState, AddressLookupState.InvalidUI.INSTANCE)) {
            handleInvalidUIState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeFocusFromSearch() {
        SearchView searchView = this.binding.textInputLayoutAddressLookupQuerySearch;
        searchView.getClass();
        ViewExtensionsKt.hideKeyboard(searchView);
        this.binding.textInputLayoutAddressLookupQuerySearch.clearFocus();
    }

    private final void setAddressOptions(List<LookupOption> options) {
        if (this.addressLookupOptionsAdapter == null) {
            initAddressOptions();
        }
        AddressLookupOptionsAdapter addressLookupOptionsAdapter = this.addressLookupOptionsAdapter;
        if (addressLookupOptionsAdapter != null) {
            addressLookupOptionsAdapter.submitList(options);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void highlightValidationErrors() {
        this.binding.addressFormInput.highlightValidationErrors(false);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof AddressLookupDelegate)) {
            i4.a.f("Unsupported delegate type");
            return;
        }
        AddressLookupDelegate addressLookupDelegate = (AddressLookupDelegate) delegate;
        this.addressLookupDelegate = addressLookupDelegate;
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        observeDelegate(addressLookupDelegate, coroutineScope);
        initAddressLookupQuery();
        initAddressFormInput(coroutineScope);
        initAddressOptions();
        initManualEntryFields();
        initSubmitAddressButton();
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView$initAddressOptions$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C01411 extends FunctionReferenceImpl implements Function1<LookupAddress, Unit> {
        public C01411(Object obj) {
            super(1, obj, AddressLookupView.class, "onAddressSelected", "onAddressSelected(Lcom/adyen/checkout/components/core/LookupAddress;)V", 0);
        }

        public final void invoke(@NotNull LookupAddress lookupAddress) {
            lookupAddress.getClass();
            ((AddressLookupView) this.receiver).onAddressSelected(lookupAddress);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LookupAddress) obj);
            return Unit.f26487a;
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressLookupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AddressLookupView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressLookupView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
