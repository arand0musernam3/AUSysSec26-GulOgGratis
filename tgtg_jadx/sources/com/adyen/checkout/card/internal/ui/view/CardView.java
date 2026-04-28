package com.adyen.checkout.card.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import ax.s;
import ba0.g;
import bg.n;
import com.adyen.checkout.card.databinding.CardViewBinding;
import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.card.internal.ui.CardDelegate;
import com.adyen.checkout.card.internal.ui.model.CardBrandItem;
import com.adyen.checkout.card.internal.ui.model.CardInputData;
import com.adyen.checkout.card.internal.ui.model.CardListItem;
import com.adyen.checkout.card.internal.ui.model.CardOutputData;
import com.adyen.checkout.card.internal.ui.model.DualBrandData;
import com.adyen.checkout.card.internal.ui.model.InputFieldUIState;
import com.adyen.checkout.card.internal.util.InstallmentUtils;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.AddressFormUIState;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.adyen.checkout.ui.core.internal.ui.view.SecurityCodeInput;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.braze.h2;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB'\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010%J!\u0010+\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010\u0010J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010;\u001a\u00020\u000e2\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000eH\u0002¢\u0006\u0004\b=\u0010\u0010J\u0013\u0010?\u001a\u00020\u000e*\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bA\u0010\u0010J\u001b\u0010?\u001a\u00020\u000e*\u00020B2\u0006\u0010C\u001a\u000206H\u0002¢\u0006\u0004\b?\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010\u0010J\u000f\u0010F\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010\u0010J\u000f\u0010G\u001a\u00020\u000eH\u0002¢\u0006\u0004\bG\u0010\u0010J\u000f\u0010H\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010\u0010J\u000f\u0010I\u001a\u00020\u000eH\u0002¢\u0006\u0004\bI\u0010\u0010J\u000f\u0010J\u001a\u00020\u000eH\u0002¢\u0006\u0004\bJ\u0010\u0010J\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000eH\u0002¢\u0006\u0004\bM\u0010\u0010J\u0017\u0010N\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bP\u0010%J\u000f\u0010Q\u001a\u00020\u000eH\u0002¢\u0006\u0004\bQ\u0010\u0010J\u0017\u0010T\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020RH\u0002¢\u0006\u0004\bW\u0010UJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020RH\u0002¢\u0006\u0004\bY\u0010UJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010Z\u001a\u000206H\u0002¢\u0006\u0004\b[\u00109J\u0017\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u000206H\u0002¢\u0006\u0004\b]\u00109J\u0017\u0010_\u001a\u00020\u000e2\u0006\u0010^\u001a\u000206H\u0002¢\u0006\u0004\b_\u00109J\u0019\u0010a\u001a\u00020\u000e2\b\u0010`\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\ba\u0010<J\u0017\u0010d\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ\u001f\u0010k\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020b2\u0006\u0010j\u001a\u000206H\u0002¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u00020\u000e2\b\u0010n\u001a\u0004\u0018\u00010mH\u0002¢\u0006\u0004\bo\u0010pJ\u0019\u0010q\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bq\u0010%J%\u0010v\u001a\u00020\u000e2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020s0r2\u0006\u0010u\u001a\u000206H\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010x\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0016\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/view/LayoutInflater;Landroid/util/AttributeSet;I)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "localizedContext", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "Landroid/view/View;", "getView", "()Landroid/view/View;", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "observeDelegate", "(Lcom/adyen/checkout/card/internal/ui/CardDelegate;Lv80/b0;)V", "Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "cardOutputData", "outputDataChanged", "(Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)V", "onCardNumberValidated", "Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;", "dualBrandData", "Lcom/adyen/checkout/components/core/internal/ui/model/Validation;", "validation", "setDualBrandedCardImages", "(Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;Lcom/adyen/checkout/components/core/internal/ui/model/Validation;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "", "expiryDateState", "onExpiryDateValidated", "(Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;)V", "view", "goToNextInputIfFocus", "(Landroid/view/View;)V", "initCardNumberInput", "", "hasFocus", "setCardErrorState", "(Z)V", "stringResId", "setCardNumberError", "(Ljava/lang/Integer;)V", "initExpiryDateInput", "Lcom/adyen/checkout/ui/core/internal/ui/view/ExpiryDateInput;", "setAccessibilityDescription", "(Lcom/adyen/checkout/ui/core/internal/ui/view/ExpiryDateInput;)V", "initSecurityCodeInput", "Lcom/adyen/checkout/ui/core/internal/ui/view/SecurityCodeInput;", "isAmex", "(Lcom/adyen/checkout/ui/core/internal/ui/view/SecurityCodeInput;Z)V", "initHolderNameInput", "initSocialSecurityNumberInput", "initKcpAuthenticationInput", "initKcpBirthDateOrTaxNumberInput", "initKcpCardPasswordInput", "initPostalCodeInput", "initAddressFormInput", "(Lv80/b0;)V", "initAddressLookup", "initCardScanning", "(Lcom/adyen/checkout/card/internal/ui/CardDelegate;)V", "updateInstallments", "initInstallments", "Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "cvcUIState", "handleCvcUIState", "(Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;)V", "expiryDateUIState", "handleExpiryDateUIState", "holderNameUIState", "handleHolderNameUIState", "showStorePaymentField", "setStorePaymentSwitchVisibility", "shouldShowSocialSecurityNumber", "setSocialSecurityNumberVisibility", "shouldShowKCPAuth", "setKcpAuthVisibility", "kcpBirthDateOrTaxNumberHint", "setKcpHint", "Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "addressFormUIState", "setAddressInputVisibility", "(Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;)V", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "addressOutputData", "updateAddressLookupInputText", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;)V", "isOptional", "updateAddressHint", "(Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;Z)V", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "installmentModel", "updateInstallmentSelection", "(Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;)V", "updateInputFields", "", "Lcom/adyen/checkout/card/internal/ui/model/CardListItem;", "cards", "isCardListVisible", "setCardList", "(Ljava/util/List;Z)V", "setCoBadgeBrands", "(Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;)V", "Lcom/adyen/checkout/card/databinding/CardViewBinding;", "binding", "Lcom/adyen/checkout/card/databinding/CardViewBinding;", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentListAdapter;", "installmentListAdapter", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentListAdapter;", "Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter;", "cardListAdapter", "Lcom/adyen/checkout/card/internal/ui/view/CardListAdapter;", "Lcom/adyen/checkout/card/internal/ui/view/CardBrandAdapter;", "cardBrandAdapter", "Lcom/adyen/checkout/card/internal/ui/view/CardBrandAdapter;", "Landroid/content/Context;", "cardDelegate", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardView.kt\ncom/adyen/checkout/card/internal/ui/view/CardView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtensions.kt\ncom/adyen/checkout/ui/core/internal/util/ViewExtensionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,789:1\n1#2:790\n24#3:791\n24#3:792\n24#3:793\n24#3:794\n24#3:795\n24#3:797\n26#3,8:811\n26#3,8:819\n26#3,8:827\n26#3,8:835\n26#3,8:843\n26#3,8:851\n26#3,8:859\n26#3,8:867\n26#3,8:875\n26#3,8:885\n26#3,8:893\n26#3,8:901\n26#3,8:909\n26#3,8:917\n26#3,8:929\n26#3,8:937\n26#3,8:947\n26#3,8:955\n26#3,8:965\n26#3,8:973\n254#4:796\n256#4,2:798\n256#4,2:803\n256#4,2:805\n256#4,2:807\n256#4,2:809\n256#4,2:883\n256#4,2:925\n256#4,2:927\n256#4,2:945\n256#4,2:963\n256#4,2:981\n256#4,2:983\n256#4,2:985\n256#4,2:987\n1755#5,3:800\n*S KotlinDebug\n*F\n+ 1 CardView.kt\ncom/adyen/checkout/card/internal/ui/view/CardView\n*L\n236#1:791\n244#1:792\n252#1:793\n264#1:794\n276#1:795\n288#1:797\n592#1:811,8\n594#1:819,8\n614#1:827,8\n622#1:835,8\n629#1:843,8\n642#1:851,8\n650#1:859,8\n657#1:867,8\n666#1:875,8\n674#1:885,8\n678#1:893,8\n679#1:901,8\n690#1:909,8\n691#1:917,8\n697#1:929,8\n698#1:937,8\n703#1:947,8\n704#1:955,8\n709#1:965,8\n710#1:973,8\n285#1:796\n307#1:798,2\n345#1:803,2\n354#1:805,2\n401#1:807,2\n404#1:809,2\n670#1:883,2\n692#1:925,2\n696#1:927,2\n702#1:945,2\n708#1:963,2\n759#1:981,2\n771#1:983,2\n772#1:985,2\n773#1:987,2\n322#1:800,3\n*E\n"})
public final class CardView extends LinearLayout implements ComponentView {

    @NotNull
    private final CardViewBinding binding;

    @Nullable
    private CardBrandAdapter cardBrandAdapter;
    private CardDelegate cardDelegate;

    @Nullable
    private CardListAdapter cardListAdapter;

    @Nullable
    private InstallmentListAdapter installmentListAdapter;
    private Context localizedContext;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InputFieldUIState.values().length];
            try {
                iArr[InputFieldUIState.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputFieldUIState.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputFieldUIState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AddressFormUIState.values().length];
            try {
                iArr2[AddressFormUIState.FULL_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AddressFormUIState.POSTAL_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AddressFormUIState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AddressFormUIState.LOOKUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.view.CardView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.view.CardView$observeDelegate$1", f = "CardView.kt", l = {}, m = "invokeSuspend")
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
            AnonymousClass1 anonymousClass1 = CardView.this.new AnonymousClass1(cVar);
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
            CardView.this.outputDataChanged((CardOutputData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardView(@NotNull LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet, int i11) {
        super(layoutInflater.getContext(), attributeSet, i11);
        layoutInflater.getClass();
        CardViewBinding cardViewBindingInflate = CardViewBinding.inflate(layoutInflater, this);
        cardViewBindingInflate.getClass();
        this.binding = cardViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, 0);
        cardViewBindingInflate.editTextExpiryDate.setAutofillHints("creditCardExpirationDate");
    }

    private final void goToNextInputIfFocus(View view) {
        if (getRootView().findFocus() != view || view == null) {
            return;
        }
        findViewById(view.getNextFocusForwardId()).requestFocus();
    }

    private final void handleCvcUIState(InputFieldUIState cvcUIState) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[cvcUIState.ordinal()];
        Context context = null;
        if (i11 == 1) {
            TextInputLayout textInputLayout = this.binding.textInputLayoutSecurityCode;
            textInputLayout.getClass();
            textInputLayout.setVisibility(0);
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                b3.i.x(editText, 0, true, true);
            }
            TextInputLayout textInputLayout2 = this.binding.textInputLayoutSecurityCode;
            textInputLayout2.getClass();
            int i12 = com.adyen.checkout.card.R.style.AdyenCheckout_Card_SecurityCodeInput;
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout2, i12, context);
            return;
        }
        if (i11 == 2) {
            TextInputLayout textInputLayout3 = this.binding.textInputLayoutSecurityCode;
            textInputLayout3.getClass();
            textInputLayout3.setVisibility(0);
            EditText editText2 = textInputLayout3.getEditText();
            if (editText2 != null) {
                b3.i.x(editText2, 0, true, true);
            }
            TextInputLayout textInputLayout4 = this.binding.textInputLayoutSecurityCode;
            Context context3 = this.localizedContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context3;
            }
            textInputLayout4.setHint(context.getString(com.adyen.checkout.card.R.string.checkout_card_security_code_optional_hint));
            return;
        }
        if (i11 != 3) {
            return;
        }
        TextInputLayout textInputLayout5 = this.binding.textInputLayoutSecurityCode;
        textInputLayout5.getClass();
        textInputLayout5.setVisibility(8);
        EditText editText3 = textInputLayout5.getEditText();
        if (editText3 != null) {
            b3.i.x(editText3, 8, false, false);
        }
        ViewGroup.LayoutParams layoutParams = this.binding.textInputLayoutExpiryDate.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(0);
        this.binding.textInputLayoutExpiryDate.setLayoutParams(layoutParams2);
    }

    private final void handleExpiryDateUIState(InputFieldUIState expiryDateUIState) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[expiryDateUIState.ordinal()];
        Context context = null;
        if (i11 == 1) {
            TextInputLayout textInputLayout = this.binding.textInputLayoutExpiryDate;
            textInputLayout.getClass();
            textInputLayout.setVisibility(0);
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                b3.i.x(editText, 0, true, true);
            }
            TextInputLayout textInputLayout2 = this.binding.textInputLayoutExpiryDate;
            textInputLayout2.getClass();
            int i12 = com.adyen.checkout.card.R.style.AdyenCheckout_Card_ExpiryDateInput;
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout2, i12, context);
            return;
        }
        if (i11 == 2) {
            TextInputLayout textInputLayout3 = this.binding.textInputLayoutExpiryDate;
            textInputLayout3.getClass();
            textInputLayout3.setVisibility(0);
            EditText editText2 = textInputLayout3.getEditText();
            if (editText2 != null) {
                b3.i.x(editText2, 0, true, true);
            }
            TextInputLayout textInputLayout4 = this.binding.textInputLayoutExpiryDate;
            Context context3 = this.localizedContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context3;
            }
            textInputLayout4.setHint(context.getString(com.adyen.checkout.card.R.string.checkout_card_expiry_date_optional_hint));
            return;
        }
        if (i11 != 3) {
            return;
        }
        TextInputLayout textInputLayout5 = this.binding.textInputLayoutExpiryDate;
        textInputLayout5.getClass();
        textInputLayout5.setVisibility(8);
        EditText editText3 = textInputLayout5.getEditText();
        if (editText3 != null) {
            b3.i.x(editText3, 8, false, false);
        }
        ViewGroup.LayoutParams layoutParams = this.binding.textInputLayoutSecurityCode.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(0);
        this.binding.textInputLayoutSecurityCode.setLayoutParams(layoutParams2);
    }

    private final void handleHolderNameUIState(InputFieldUIState holderNameUIState) {
        TextInputLayout textInputLayout = this.binding.textInputLayoutCardHolder;
        textInputLayout.getClass();
        boolean z11 = holderNameUIState != InputFieldUIState.HIDDEN;
        int i11 = z11 ? 0 : 8;
        textInputLayout.setVisibility(i11);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            b3.i.x(editText, i11, z11, z11);
        }
    }

    private final void initAddressFormInput(b0 coroutineScope) {
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        CardDelegate cardDelegate = this.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        addressFormInput.attachDelegate(cardDelegate, coroutineScope);
    }

    private final void initAddressLookup() {
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.binding.autoCompleteTextViewAddressLookup;
        appCompatAutoCompleteTextView.setInputType(0);
        appCompatAutoCompleteTextView.setSingleLine(false);
        this.binding.autoCompleteTextViewAddressLookup.setOnClickListener(new s(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAddressLookup$lambda$24(CardView cardView, View view) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.startAddressLookup();
    }

    private final void initCardNumberInput() {
        this.binding.editTextCardNumber.setOnChangeListener(new b(this, 3));
        this.binding.editTextCardNumber.setOnFocusChangeListener(new a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCardNumberInput$lambda$7(final CardView cardView, Editable editable) {
        cardView.getClass();
        editable.getClass();
        cardView.setCardErrorState(true);
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initCardNumberInput$1$1
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setCardNumber(this.this$0.binding.editTextCardNumber.getRawValue());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCardNumberInput$lambda$8(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        cardView.setCardErrorState(z11);
    }

    private final void initCardScanning(CardDelegate delegate) {
        CardScanningFragment cardScanningFragment = (CardScanningFragment) this.binding.fragmentContainerCardScanning.getFragment();
        if (cardScanningFragment != null) {
            cardScanningFragment.initialize(delegate);
        }
    }

    private final void initExpiryDateInput() {
        this.binding.editTextExpiryDate.setOnChangeListener(new b(this, 6));
        this.binding.editTextExpiryDate.setOnFocusChangeListener(new a(this, 7));
        ExpiryDateInput expiryDateInput = this.binding.editTextExpiryDate;
        expiryDateInput.getClass();
        setAccessibilityDescription(expiryDateInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExpiryDateInput$lambda$10(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getExpiryDateState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = cardView.binding.textInputLayoutExpiryDate;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = cardView.binding.textInputLayoutExpiryDate;
            textInputLayout2.getClass();
            Context context2 = cardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExpiryDateInput$lambda$9(final CardView cardView, Editable editable) {
        cardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initExpiryDateInput$1$1
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setExpiryDate(this.this$0.binding.editTextExpiryDate.getRawValue());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = cardView.binding.textInputLayoutExpiryDate;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    private final void initHolderNameInput() {
        EditText editText = this.binding.textInputLayoutCardHolder.getEditText();
        AdyenTextInputEditText adyenTextInputEditText = editText instanceof AdyenTextInputEditText ? (AdyenTextInputEditText) editText : null;
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new b(this, 2));
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHolderNameInput$lambda$13(CardView cardView, final Editable editable) {
        cardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initHolderNameInput$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setHolderName(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = cardView.binding.textInputLayoutCardHolder;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHolderNameInput$lambda$14(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getHolderNameState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = cardView.binding.textInputLayoutCardHolder;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = cardView.binding.textInputLayoutCardHolder;
            textInputLayout2.getClass();
            Context context2 = cardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    private final void initInstallments() {
        Context context = getContext();
        context.getClass();
        Context context2 = this.localizedContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context2 = null;
        }
        InstallmentListAdapter installmentListAdapter = new InstallmentListAdapter(context, context2);
        this.installmentListAdapter = installmentListAdapter;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.binding.autoCompleteTextViewInstallments;
        appCompatAutoCompleteTextView.setInputType(0);
        appCompatAutoCompleteTextView.setAdapter(installmentListAdapter);
        appCompatAutoCompleteTextView.setOnItemClickListener(new n(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInstallments$lambda$27$lambda$26$lambda$25(CardView cardView, AdapterView adapterView, View view, int i11, long j9) {
        cardView.getClass();
        InstallmentListAdapter installmentListAdapter = cardView.installmentListAdapter;
        cardView.updateInstallmentSelection(installmentListAdapter != null ? installmentListAdapter.getItem(i11) : null);
    }

    private final void initKcpAuthenticationInput() {
        initKcpBirthDateOrTaxNumberInput();
        initKcpCardPasswordInput();
    }

    private final void initKcpBirthDateOrTaxNumberInput() {
        EditText editText = this.binding.textInputLayoutKcpBirthDateOrTaxNumber.getEditText();
        AdyenTextInputEditText adyenTextInputEditText = editText instanceof AdyenTextInputEditText ? (AdyenTextInputEditText) editText : null;
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new b(this, 1));
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initKcpBirthDateOrTaxNumberInput$lambda$17(CardView cardView, final Editable editable) {
        cardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initKcpBirthDateOrTaxNumberInput$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setKcpBirthDateOrTaxNumber(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = cardView.binding.textInputLayoutKcpBirthDateOrTaxNumber;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initKcpBirthDateOrTaxNumberInput$lambda$18(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getKcpBirthDateOrTaxNumberState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = cardView.binding.textInputLayoutKcpBirthDateOrTaxNumber;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = cardView.binding.textInputLayoutKcpBirthDateOrTaxNumber;
            textInputLayout2.getClass();
            Context context2 = cardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    private final void initKcpCardPasswordInput() {
        EditText editText = this.binding.textInputLayoutKcpCardPassword.getEditText();
        AdyenTextInputEditText adyenTextInputEditText = editText instanceof AdyenTextInputEditText ? (AdyenTextInputEditText) editText : null;
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new b(this, 7));
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initKcpCardPasswordInput$lambda$19(CardView cardView, final Editable editable) {
        cardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initKcpCardPasswordInput$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setKcpCardPassword(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = cardView.binding.textInputLayoutKcpCardPassword;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initKcpCardPasswordInput$lambda$20(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getKcpCardPasswordState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = cardView.binding.textInputLayoutKcpCardPassword;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = cardView.binding.textInputLayoutKcpCardPassword;
            textInputLayout2.getClass();
            Context context2 = cardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
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
        TextInputLayout textInputLayout4 = this.binding.textInputLayoutCardHolder;
        textInputLayout4.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout4, com.adyen.checkout.card.R.style.AdyenCheckout_Card_HolderNameInput, localizedContext);
        TextInputLayout textInputLayout5 = this.binding.textInputLayoutPostalCode;
        textInputLayout5.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout5, R.style.AdyenCheckout_PostalCodeInput, localizedContext);
        TextInputLayout textInputLayout6 = this.binding.textInputLayoutAddressLookup;
        textInputLayout6.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout6, com.adyen.checkout.card.R.style.AdyenCheckout_Card_AddressLookup_DropdownTextInputEditText, localizedContext);
        TextInputLayout textInputLayout7 = this.binding.textInputLayoutSocialSecurityNumber;
        textInputLayout7.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout7, com.adyen.checkout.card.R.style.AdyenCheckout_Card_SocialSecurityNumberInput, localizedContext);
        TextInputLayout textInputLayout8 = this.binding.textInputLayoutKcpBirthDateOrTaxNumber;
        textInputLayout8.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout8, com.adyen.checkout.card.R.style.AdyenCheckout_Card_KcpBirthDateOrTaxNumber, localizedContext);
        TextInputLayout textInputLayout9 = this.binding.textInputLayoutKcpCardPassword;
        textInputLayout9.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout9, com.adyen.checkout.card.R.style.AdyenCheckout_Card_KcpCardPassword, localizedContext);
        TextInputLayout textInputLayout10 = this.binding.textInputLayoutInstallments;
        textInputLayout10.getClass();
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout10, com.adyen.checkout.card.R.style.AdyenCheckout_DropdownTextInputLayout_Installments, localizedContext);
        SwitchCompat switchCompat = this.binding.switchStorePaymentMethod;
        switchCompat.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(switchCompat, com.adyen.checkout.card.R.style.AdyenCheckout_Card_StorePaymentSwitch, localizedContext, false, 4, null);
        this.binding.addressFormInput.initLocalizedContext(localizedContext);
    }

    private final void initPostalCodeInput() {
        EditText editText = this.binding.textInputLayoutPostalCode.getEditText();
        AdyenTextInputEditText adyenTextInputEditText = editText instanceof AdyenTextInputEditText ? (AdyenTextInputEditText) editText : null;
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new b(this, 0));
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPostalCodeInput$lambda$21(CardView cardView, final Editable editable) {
        cardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initPostalCodeInput$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.getAddress().setPostalCode(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = cardView.binding.textInputLayoutPostalCode;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPostalCodeInput$lambda$22(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getAddressState().getPostalCode().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = cardView.binding.textInputLayoutPostalCode;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = cardView.binding.textInputLayoutPostalCode;
            textInputLayout2.getClass();
            Context context2 = cardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    private final void initSecurityCodeInput() {
        EditText editText = this.binding.textInputLayoutSecurityCode.getEditText();
        SecurityCodeInput securityCodeInput = editText instanceof SecurityCodeInput ? (SecurityCodeInput) editText : null;
        if (securityCodeInput != null) {
            securityCodeInput.setOnChangeListener(new b(this, 5));
        }
        if (securityCodeInput != null) {
            securityCodeInput.setOnFocusChangeListener(new a(this, 6));
        }
        SecurityCodeInput securityCodeInput2 = this.binding.editTextSecurityCode;
        securityCodeInput2.getClass();
        setAccessibilityDescription(securityCodeInput2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSecurityCodeInput$lambda$11(CardView cardView, final Editable editable) {
        cardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initSecurityCodeInput$1$1
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
        TextInputLayout textInputLayout = cardView.binding.textInputLayoutSecurityCode;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSecurityCodeInput$lambda$12(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getSecurityCodeState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = cardView.binding.textInputLayoutSecurityCode;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = cardView.binding.textInputLayoutSecurityCode;
            textInputLayout2.getClass();
            Context context2 = cardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    private final void initSocialSecurityNumberInput() {
        EditText editText = this.binding.textInputLayoutSocialSecurityNumber.getEditText();
        AdyenTextInputEditText adyenTextInputEditText = editText instanceof AdyenTextInputEditText ? (AdyenTextInputEditText) editText : null;
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new b(this, 4));
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSocialSecurityNumberInput$lambda$15(CardView cardView, final Editable editable) {
        cardView.getClass();
        editable.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initSocialSecurityNumberInput$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setSocialSecurityNumber(editable.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
        TextInputLayout textInputLayout = cardView.binding.textInputLayoutSocialSecurityNumber;
        textInputLayout.getClass();
        ViewExtensionsKt.hideError(textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSocialSecurityNumberInput$lambda$16(CardView cardView, View view, boolean z11) {
        cardView.getClass();
        CardDelegate cardDelegate = cardView.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getSocialSecurityNumberState().getValidation();
        if (z11) {
            TextInputLayout textInputLayout = cardView.binding.textInputLayoutSocialSecurityNumber;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
        } else if (validation instanceof Validation.Invalid) {
            TextInputLayout textInputLayout2 = cardView.binding.textInputLayoutSocialSecurityNumber;
            textInputLayout2.getClass();
            Context context2 = cardView.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context = context2;
            }
            b3.i.z((Validation.Invalid) validation, context, textInputLayout2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ComponentDelegate componentDelegate, CompoundButton compoundButton, final boolean z11) {
        componentDelegate.getClass();
        ((CardDelegate) componentDelegate).updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$initView$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                cardInputData.setStorePaymentMethodSwitchChecked(z11);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
    }

    private final void observeDelegate(CardDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
    }

    private final void onCardNumberValidated(CardOutputData cardOutputData) {
        if (!Intrinsics.areEqual(this.binding.editTextCardNumber.getRawValue(), cardOutputData.getCardNumberState().getValue())) {
            this.binding.editTextCardNumber.setText(cardOutputData.getCardNumberState().getValue());
        }
        List<DetectedCardType> detectedCardTypes = cardOutputData.getDetectedCardTypes();
        boolean z11 = false;
        if (detectedCardTypes.isEmpty()) {
            RoundCornerImageView roundCornerImageView = this.binding.cardBrandLogoImageViewPrimary;
            roundCornerImageView.setStrokeWidth(0.0f);
            roundCornerImageView.setImageResource(com.adyen.checkout.card.R.drawable.ic_card);
            FrameLayout frameLayout = this.binding.cardBrandLogoContainerSecondary;
            frameLayout.getClass();
            frameLayout.setVisibility(8);
            this.binding.editTextCardNumber.setAmexCardFormat(false);
            SecurityCodeInput securityCodeInput = this.binding.editTextSecurityCode;
            securityCodeInput.getClass();
            setAccessibilityDescription(securityCodeInput, false);
            return;
        }
        DetectedCardType detectedCardType = (DetectedCardType) CollectionsKt.O(detectedCardTypes);
        this.binding.cardBrandLogoImageViewPrimary.setStrokeWidth(4.0f);
        RoundCornerImageView roundCornerImageView2 = this.binding.cardBrandLogoImageViewPrimary;
        roundCornerImageView2.getClass();
        CardDelegate cardDelegate = this.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Environment environment = cardDelegate.getComponentParams().getEnvironment();
        String txVariant = detectedCardTypes.get(0).getCardBrand().getTxVariant();
        int i11 = com.adyen.checkout.card.R.drawable.ic_card;
        ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView2, environment, txVariant, null, null, null, i11, i11, 28, null);
        setDualBrandedCardImages(cardOutputData.getDualBrandData(), cardOutputData.getCardNumberState().getValidation());
        if (!detectedCardTypes.isEmpty()) {
            Iterator<T> it = detectedCardTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.areEqual(((DetectedCardType) it.next()).getCardBrand(), new CardBrand(CardType.AMERICAN_EXPRESS))) {
                    z11 = true;
                    break;
                }
            }
        }
        this.binding.editTextCardNumber.setAmexCardFormat(z11);
        SecurityCodeInput securityCodeInput2 = this.binding.editTextSecurityCode;
        securityCodeInput2.getClass();
        setAccessibilityDescription(securityCodeInput2, z11);
        if (detectedCardTypes.size() == 1) {
            Integer panLength = detectedCardType.getPanLength();
            int length = this.binding.editTextCardNumber.getRawValue().length();
            if (panLength != null && panLength.intValue() == length) {
                Validation validation = cardOutputData.getCardNumberState().getValidation();
                if (validation instanceof Validation.Invalid) {
                    setCardNumberError(Integer.valueOf(((Validation.Invalid) validation).getReason()));
                } else {
                    goToNextInputIfFocus(this.binding.editTextCardNumber);
                }
            }
        }
    }

    private final void onExpiryDateValidated(FieldState<String> expiryDateState) {
        if (!Intrinsics.areEqual(this.binding.editTextExpiryDate.getRawValue(), expiryDateState.getValue())) {
            this.binding.editTextExpiryDate.setText(expiryDateState.getValue());
        }
        if (expiryDateState.getValidation().isValid()) {
            goToNextInputIfFocus(this.binding.editTextExpiryDate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(CardOutputData cardOutputData) {
        onCardNumberValidated(cardOutputData);
        onExpiryDateValidated(cardOutputData.getExpiryDateState());
        setSocialSecurityNumberVisibility(cardOutputData.isSocialSecurityNumberRequired());
        setKcpAuthVisibility(cardOutputData.isKCPAuthRequired());
        setKcpHint(cardOutputData.getKcpBirthDateOrTaxNumberHint());
        setAddressInputVisibility(cardOutputData.getAddressUIState());
        handleCvcUIState(cardOutputData.getCvcUIState());
        handleExpiryDateUIState(cardOutputData.getExpiryDateUIState());
        handleHolderNameUIState(cardOutputData.getHolderNameUIState());
        setStorePaymentSwitchVisibility(cardOutputData.getShowStorePaymentField());
        updateInstallments(cardOutputData);
        updateAddressHint(cardOutputData.getAddressUIState(), cardOutputData.getAddressState().isOptional());
        setCardList(cardOutputData.getCardBrands(), cardOutputData.isCardListVisible());
        setCoBadgeBrands(cardOutputData.getDualBrandData());
        updateAddressLookupInputText(cardOutputData.getAddressState());
    }

    private final void setAccessibilityDescription(SecurityCodeInput securityCodeInput, boolean z11) {
        String str;
        Context context = this.localizedContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        String string = context.getString(com.adyen.checkout.card.R.string.checkout_card_security_code_hint);
        string.getClass();
        Context context3 = this.localizedContext;
        if (z11) {
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context2 = context3;
            }
            String string2 = context2.getString(com.adyen.checkout.card.R.string.checkout_card_security_code_format_4_digits);
            string2.getClass();
            str = string + ", " + string2;
        } else {
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            } else {
                context2 = context3;
            }
            String string3 = context2.getString(com.adyen.checkout.card.R.string.checkout_card_security_code_format_3_digits);
            string3.getClass();
            str = string + ", " + string3;
        }
        ViewExtensionsKt.setAccessibilityDelegateWith(securityCodeInput, str);
    }

    private final void setAddressInputVisibility(AddressFormUIState addressFormUIState) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[addressFormUIState.ordinal()];
        if (i11 == 1) {
            TextInputLayout textInputLayout = this.binding.textInputLayoutPostalCode;
            textInputLayout.getClass();
            textInputLayout.setVisibility(8);
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                b3.i.x(editText, 8, false, false);
            }
            TextInputLayout textInputLayout2 = this.binding.textInputLayoutAddressLookup;
            textInputLayout2.getClass();
            textInputLayout2.setVisibility(8);
            EditText editText2 = textInputLayout2.getEditText();
            if (editText2 != null) {
                b3.i.x(editText2, 8, false, false);
            }
            AddressFormInput addressFormInput = this.binding.addressFormInput;
            addressFormInput.getClass();
            addressFormInput.setVisibility(0);
            return;
        }
        if (i11 == 2) {
            AddressFormInput addressFormInput2 = this.binding.addressFormInput;
            addressFormInput2.getClass();
            addressFormInput2.setVisibility(8);
            TextInputLayout textInputLayout3 = this.binding.textInputLayoutAddressLookup;
            textInputLayout3.getClass();
            textInputLayout3.setVisibility(8);
            EditText editText3 = textInputLayout3.getEditText();
            if (editText3 != null) {
                b3.i.x(editText3, 8, false, false);
            }
            TextInputLayout textInputLayout4 = this.binding.textInputLayoutPostalCode;
            textInputLayout4.getClass();
            textInputLayout4.setVisibility(0);
            EditText editText4 = textInputLayout4.getEditText();
            if (editText4 != null) {
                b3.i.x(editText4, 0, true, true);
                return;
            }
            return;
        }
        if (i11 == 3) {
            AddressFormInput addressFormInput3 = this.binding.addressFormInput;
            addressFormInput3.getClass();
            addressFormInput3.setVisibility(8);
            TextInputLayout textInputLayout5 = this.binding.textInputLayoutPostalCode;
            textInputLayout5.getClass();
            textInputLayout5.setVisibility(8);
            EditText editText5 = textInputLayout5.getEditText();
            if (editText5 != null) {
                b3.i.x(editText5, 8, false, false);
            }
            TextInputLayout textInputLayout6 = this.binding.textInputLayoutAddressLookup;
            textInputLayout6.getClass();
            textInputLayout6.setVisibility(8);
            EditText editText6 = textInputLayout6.getEditText();
            if (editText6 != null) {
                b3.i.x(editText6, 8, false, false);
                return;
            }
            return;
        }
        if (i11 != 4) {
            return;
        }
        AddressFormInput addressFormInput4 = this.binding.addressFormInput;
        addressFormInput4.getClass();
        addressFormInput4.setVisibility(8);
        TextInputLayout textInputLayout7 = this.binding.textInputLayoutPostalCode;
        textInputLayout7.getClass();
        textInputLayout7.setVisibility(8);
        EditText editText7 = textInputLayout7.getEditText();
        if (editText7 != null) {
            b3.i.x(editText7, 8, false, false);
        }
        TextInputLayout textInputLayout8 = this.binding.textInputLayoutAddressLookup;
        textInputLayout8.getClass();
        textInputLayout8.setVisibility(0);
        EditText editText8 = textInputLayout8.getEditText();
        if (editText8 != null) {
            b3.i.x(editText8, 0, true, true);
        }
    }

    private final void setCardErrorState(boolean hasFocus) {
        CardDelegate cardDelegate = this.cardDelegate;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        Validation validation = cardDelegate.getOutputData().getCardNumberState().getValidation();
        boolean z11 = validation instanceof Validation.Invalid;
        Validation.Invalid invalid = z11 ? (Validation.Invalid) validation : null;
        boolean showErrorWhileEditing = invalid != null ? invalid.getShowErrorWhileEditing() : false;
        if (hasFocus && !showErrorWhileEditing) {
            setCardNumberError(null);
        } else if (z11) {
            setCardNumberError(Integer.valueOf(((Validation.Invalid) validation).getReason()));
        }
    }

    private final void setCardList(List<CardListItem> cards, boolean isCardListVisible) {
        RecyclerView recyclerView = this.binding.recyclerViewCardList;
        recyclerView.getClass();
        recyclerView.setVisibility(isCardListVisible ? 0 : 8);
        if (isCardListVisible) {
            if (this.cardListAdapter == null) {
                CardListAdapter cardListAdapter = new CardListAdapter();
                this.cardListAdapter = cardListAdapter;
                this.binding.recyclerViewCardList.setAdapter(cardListAdapter);
            }
            CardListAdapter cardListAdapter2 = this.cardListAdapter;
            if (cardListAdapter2 != null) {
                cardListAdapter2.submitList(cards);
            }
        }
    }

    private final void setCardNumberError(Integer stringResId) {
        CardViewBinding cardViewBinding = this.binding;
        if (stringResId == null) {
            TextInputLayout textInputLayout = cardViewBinding.textInputLayoutCardNumber;
            textInputLayout.getClass();
            ViewExtensionsKt.hideError(textInputLayout);
            LinearLayout linearLayout = this.binding.cardBrandLogoContainer;
            linearLayout.getClass();
            linearLayout.setVisibility(0);
            return;
        }
        TextInputLayout textInputLayout2 = cardViewBinding.textInputLayoutCardNumber;
        textInputLayout2.getClass();
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        String string = context.getString(stringResId.intValue());
        string.getClass();
        ViewExtensionsKt.showError(textInputLayout2, string);
        LinearLayout linearLayout2 = this.binding.cardBrandLogoContainer;
        linearLayout2.getClass();
        linearLayout2.setVisibility(8);
    }

    private final void setCoBadgeBrands(DualBrandData dualBrandData) {
        boolean z11 = dualBrandData != null && dualBrandData.getSelectable();
        RecyclerView recyclerView = this.binding.recyclerViewCobadgeBrands;
        recyclerView.getClass();
        recyclerView.setVisibility(z11 ? 0 : 8);
        TextView textView = this.binding.textViewCobadgeBrandsHeader;
        textView.getClass();
        textView.setVisibility(z11 ? 0 : 8);
        TextView textView2 = this.binding.textViewCobadgeBrandsDescription;
        textView2.getClass();
        textView2.setVisibility(z11 ? 0 : 8);
        if (z11) {
            if (this.cardBrandAdapter == null) {
                CardBrandAdapter cardBrandAdapter = new CardBrandAdapter(new Function1<CardBrandItem, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView.setCoBadgeBrands.1
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull final CardBrandItem cardBrandItem) {
                        cardBrandItem.getClass();
                        CardDelegate cardDelegate = CardView.this.cardDelegate;
                        if (cardDelegate == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
                            cardDelegate = null;
                        }
                        cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView.setCoBadgeBrands.1.1
                            {
                                super(1);
                            }

                            public final void invoke(@NotNull CardInputData cardInputData) {
                                cardInputData.getClass();
                                cardInputData.setSelectedCardBrand(cardBrandItem.getBrand());
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((CardInputData) obj);
                                return Unit.f26487a;
                            }
                        });
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((CardBrandItem) obj);
                        return Unit.f26487a;
                    }
                });
                this.cardBrandAdapter = cardBrandAdapter;
                this.binding.recyclerViewCobadgeBrands.setAdapter(cardBrandAdapter);
            }
            CardBrandAdapter cardBrandAdapter2 = this.cardBrandAdapter;
            if (cardBrandAdapter2 != null) {
                cardBrandAdapter2.submitList(dualBrandData != null ? dualBrandData.getBrandOptions() : null);
            }
        }
    }

    private final void setDualBrandedCardImages(DualBrandData dualBrandData, Validation validation) {
        List<CardBrandItem> brandOptions;
        CardBrandItem cardBrandItem;
        boolean zHasFocus = this.binding.textInputLayoutCardNumber.hasFocus();
        if ((validation instanceof Validation.Invalid) && !zHasFocus) {
            setCardNumberError(Integer.valueOf(((Validation.Invalid) validation).getReason()));
            return;
        }
        Unit unit = null;
        CardDelegate cardDelegate = null;
        unit = null;
        unit = null;
        if (dualBrandData != null && (brandOptions = dualBrandData.getBrandOptions()) != null && (cardBrandItem = (CardBrandItem) CollectionsKt.Q(1, brandOptions)) != null) {
            FrameLayout frameLayout = this.binding.cardBrandLogoContainerSecondary;
            frameLayout.getClass();
            frameLayout.setVisibility(0);
            this.binding.cardBrandLogoImageViewSecondary.setStrokeWidth(4.0f);
            RoundCornerImageView roundCornerImageView = this.binding.cardBrandLogoImageViewSecondary;
            roundCornerImageView.getClass();
            CardDelegate cardDelegate2 = this.cardDelegate;
            if (cardDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            } else {
                cardDelegate = cardDelegate2;
            }
            Environment environment = cardDelegate.getComponentParams().getEnvironment();
            String txVariant = cardBrandItem.getBrand().getTxVariant();
            int i11 = com.adyen.checkout.card.R.drawable.ic_card;
            ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView, environment, txVariant, null, null, null, i11, i11, 28, null);
            unit = Unit.f26487a;
        }
        if (unit == null) {
            FrameLayout frameLayout2 = this.binding.cardBrandLogoContainerSecondary;
            frameLayout2.getClass();
            frameLayout2.setVisibility(8);
        }
    }

    private final void setKcpAuthVisibility(boolean shouldShowKCPAuth) {
        TextInputLayout textInputLayout = this.binding.textInputLayoutKcpBirthDateOrTaxNumber;
        textInputLayout.getClass();
        int i11 = shouldShowKCPAuth ? 0 : 8;
        textInputLayout.setVisibility(i11);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            b3.i.x(editText, i11, shouldShowKCPAuth, shouldShowKCPAuth);
        }
        TextInputLayout textInputLayout2 = this.binding.textInputLayoutKcpCardPassword;
        textInputLayout2.getClass();
        int i12 = shouldShowKCPAuth ? 0 : 8;
        textInputLayout2.setVisibility(i12);
        EditText editText2 = textInputLayout2.getEditText();
        if (editText2 != null) {
            b3.i.x(editText2, i12, shouldShowKCPAuth, shouldShowKCPAuth);
        }
    }

    private final void setKcpHint(Integer kcpBirthDateOrTaxNumberHint) {
        if (kcpBirthDateOrTaxNumberHint != null) {
            TextInputLayout textInputLayout = this.binding.textInputLayoutKcpBirthDateOrTaxNumber;
            Context context = this.localizedContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context = null;
            }
            textInputLayout.setHint(context.getString(kcpBirthDateOrTaxNumberHint.intValue()));
        }
    }

    private final void setSocialSecurityNumberVisibility(boolean shouldShowSocialSecurityNumber) {
        TextInputLayout textInputLayout = this.binding.textInputLayoutSocialSecurityNumber;
        textInputLayout.getClass();
        int i11 = shouldShowSocialSecurityNumber ? 0 : 8;
        textInputLayout.setVisibility(i11);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            b3.i.x(editText, i11, shouldShowSocialSecurityNumber, shouldShowSocialSecurityNumber);
        }
    }

    private final void setStorePaymentSwitchVisibility(boolean showStorePaymentField) {
        SwitchCompat switchCompat = this.binding.switchStorePaymentMethod;
        switchCompat.getClass();
        switchCompat.setVisibility(showStorePaymentField ? 0 : 8);
    }

    private final void updateAddressHint(AddressFormUIState addressFormUIState, boolean isOptional) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[addressFormUIState.ordinal()];
        if (i11 == 1) {
            this.binding.addressFormInput.updateAddressHint(isOptional);
            return;
        }
        if (i11 != 2) {
            return;
        }
        int i12 = isOptional ? R.style.AdyenCheckout_PostalCodeInput_Optional : R.style.AdyenCheckout_PostalCodeInput;
        TextInputLayout textInputLayout = this.binding.textInputLayoutPostalCode;
        textInputLayout.getClass();
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        ViewExtensionsKt.setLocalizedHintFromStyle(textInputLayout, i12, context);
    }

    private final void updateAddressLookupInputText(AddressOutputData addressOutputData) {
        this.binding.autoCompleteTextViewAddressLookup.setText(addressOutputData.formatted());
    }

    private final void updateInputFields(CardOutputData cardOutputData) {
        if (cardOutputData != null) {
            this.binding.editTextCardNumber.setText(cardOutputData.getCardNumberState().getValue());
            this.binding.editTextExpiryDate.setText(cardOutputData.getExpiryDateState().getValue());
            this.binding.editTextSecurityCode.setText(cardOutputData.getSecurityCodeState().getValue());
            this.binding.editTextCardHolder.setText(cardOutputData.getHolderNameState().getValue());
            this.binding.editTextSocialSecurityNumber.setSocialSecurityNumber(cardOutputData.getSocialSecurityNumberState().getValue());
            this.binding.editTextKcpBirthDateOrTaxNumber.setText(cardOutputData.getKcpBirthDateOrTaxNumberState().getValue());
            this.binding.editTextKcpCardPassword.setText(cardOutputData.getKcpCardPasswordState().getValue());
            AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.binding.autoCompleteTextViewInstallments;
            InstallmentUtils installmentUtils = InstallmentUtils.INSTANCE;
            Context context = this.localizedContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context = null;
            }
            appCompatAutoCompleteTextView.setText(installmentUtils.getTextForInstallmentOption(context, cardOutputData.getInstallmentState().getValue()));
        }
    }

    private final void updateInstallmentSelection(final InstallmentModel installmentModel) {
        if (installmentModel != null) {
            CardDelegate cardDelegate = this.cardDelegate;
            if (cardDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
                cardDelegate = null;
            }
            cardDelegate.updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.view.CardView$updateInstallmentSelection$1$1
                {
                    super(1);
                }

                public final void invoke(@NotNull CardInputData cardInputData) {
                    cardInputData.getClass();
                    cardInputData.setInstallmentOption(installmentModel);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((CardInputData) obj);
                    return Unit.f26487a;
                }
            });
        }
    }

    private final void updateInstallments(CardOutputData cardOutputData) {
        TextInputLayout textInputLayout = this.binding.textInputLayoutInstallments;
        textInputLayout.getClass();
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.binding.autoCompleteTextViewInstallments;
        appCompatAutoCompleteTextView.getClass();
        if (cardOutputData.getInstallmentOptions().isEmpty()) {
            textInputLayout.setVisibility(8);
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                b3.i.x(editText, 8, false, false);
                return;
            }
            return;
        }
        if (this.installmentListAdapter == null) {
            initInstallments();
        }
        if (cardOutputData.getInstallmentState().getValue() == null) {
            updateInstallmentSelection((InstallmentModel) CollectionsKt.O(cardOutputData.getInstallmentOptions()));
            InstallmentUtils installmentUtils = InstallmentUtils.INSTANCE;
            Context context = this.localizedContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context = null;
            }
            appCompatAutoCompleteTextView.setText(installmentUtils.getTextForInstallmentOption(context, (InstallmentModel) CollectionsKt.O(cardOutputData.getInstallmentOptions())));
        }
        InstallmentListAdapter installmentListAdapter = this.installmentListAdapter;
        if (installmentListAdapter != null) {
            installmentListAdapter.setItems(cardOutputData.getInstallmentOptions());
        }
        textInputLayout.setVisibility(0);
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            b3.i.x(editText2, 0, true, true);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void highlightValidationErrors() {
        boolean z11;
        CardDelegate cardDelegate = this.cardDelegate;
        Context context = null;
        if (cardDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate = null;
        }
        CardOutputData outputData = cardDelegate.getOutputData();
        Validation validation = outputData.getCardNumberState().getValidation();
        boolean z12 = true;
        if (validation instanceof Validation.Invalid) {
            this.binding.editTextCardNumber.requestFocus();
            setCardNumberError(Integer.valueOf(((Validation.Invalid) validation).getReason()));
            z11 = true;
        } else {
            z11 = false;
        }
        Validation validation2 = outputData.getExpiryDateState().getValidation();
        if (validation2 instanceof Validation.Invalid) {
            if (!z11) {
                this.binding.textInputLayoutExpiryDate.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayout = this.binding.textInputLayoutExpiryDate;
            textInputLayout.getClass();
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context2 = null;
            }
            b3.i.z((Validation.Invalid) validation2, context2, textInputLayout);
        }
        Validation validation3 = outputData.getSecurityCodeState().getValidation();
        if (validation3 instanceof Validation.Invalid) {
            if (!z11) {
                this.binding.textInputLayoutSecurityCode.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayout2 = this.binding.textInputLayoutSecurityCode;
            textInputLayout2.getClass();
            Context context3 = this.localizedContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context3 = null;
            }
            b3.i.z((Validation.Invalid) validation3, context3, textInputLayout2);
        }
        Validation validation4 = outputData.getHolderNameState().getValidation();
        TextInputLayout textInputLayout3 = this.binding.textInputLayoutCardHolder;
        textInputLayout3.getClass();
        if (textInputLayout3.getVisibility() == 0 && (validation4 instanceof Validation.Invalid)) {
            if (!z11) {
                this.binding.textInputLayoutCardHolder.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayout4 = this.binding.textInputLayoutCardHolder;
            textInputLayout4.getClass();
            Context context4 = this.localizedContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context4 = null;
            }
            b3.i.z((Validation.Invalid) validation4, context4, textInputLayout4);
        }
        Validation validation5 = outputData.getAddressState().getPostalCode().getValidation();
        TextInputLayout textInputLayout5 = this.binding.textInputLayoutPostalCode;
        textInputLayout5.getClass();
        if (textInputLayout5.getVisibility() == 0 && (validation5 instanceof Validation.Invalid)) {
            if (!z11) {
                this.binding.textInputLayoutPostalCode.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayout6 = this.binding.textInputLayoutPostalCode;
            textInputLayout6.getClass();
            Context context5 = this.localizedContext;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context5 = null;
            }
            b3.i.z((Validation.Invalid) validation5, context5, textInputLayout6);
        }
        Validation validation6 = outputData.getSocialSecurityNumberState().getValidation();
        TextInputLayout textInputLayout7 = this.binding.textInputLayoutSocialSecurityNumber;
        textInputLayout7.getClass();
        if (textInputLayout7.getVisibility() == 0 && (validation6 instanceof Validation.Invalid)) {
            if (!z11) {
                this.binding.textInputLayoutSocialSecurityNumber.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayout8 = this.binding.textInputLayoutSocialSecurityNumber;
            textInputLayout8.getClass();
            Context context6 = this.localizedContext;
            if (context6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context6 = null;
            }
            b3.i.z((Validation.Invalid) validation6, context6, textInputLayout8);
        }
        Validation validation7 = outputData.getKcpBirthDateOrTaxNumberState().getValidation();
        TextInputLayout textInputLayout9 = this.binding.textInputLayoutKcpBirthDateOrTaxNumber;
        textInputLayout9.getClass();
        if (textInputLayout9.getVisibility() == 0 && (validation7 instanceof Validation.Invalid)) {
            if (!z11) {
                this.binding.textInputLayoutKcpBirthDateOrTaxNumber.requestFocus();
                z11 = true;
            }
            TextInputLayout textInputLayout10 = this.binding.textInputLayoutKcpBirthDateOrTaxNumber;
            textInputLayout10.getClass();
            Context context7 = this.localizedContext;
            if (context7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context7 = null;
            }
            b3.i.z((Validation.Invalid) validation7, context7, textInputLayout10);
        }
        Validation validation8 = outputData.getKcpCardPasswordState().getValidation();
        TextInputLayout textInputLayout11 = this.binding.textInputLayoutKcpCardPassword;
        textInputLayout11.getClass();
        if (textInputLayout11.getVisibility() == 0 && (validation8 instanceof Validation.Invalid)) {
            if (z11) {
                z12 = z11;
            } else {
                this.binding.textInputLayoutKcpCardPassword.requestFocus();
            }
            TextInputLayout textInputLayout12 = this.binding.textInputLayoutKcpCardPassword;
            textInputLayout12.getClass();
            Context context8 = this.localizedContext;
            if (context8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context8 = null;
            }
            b3.i.z((Validation.Invalid) validation8, context8, textInputLayout12);
            z11 = z12;
        }
        AddressFormInput addressFormInput = this.binding.addressFormInput;
        addressFormInput.getClass();
        if (addressFormInput.getVisibility() == 0 && !outputData.getAddressState().getIsValid()) {
            this.binding.addressFormInput.highlightValidationErrors(z11);
        }
        TextInputLayout textInputLayout13 = this.binding.textInputLayoutAddressLookup;
        textInputLayout13.getClass();
        if (textInputLayout13.getVisibility() != 0 || outputData.getAddressState().getIsValid()) {
            return;
        }
        TextInputLayout textInputLayout14 = this.binding.textInputLayoutAddressLookup;
        textInputLayout14.getClass();
        Context context9 = this.localizedContext;
        if (context9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context = context9;
        }
        String string = context.getString(R.string.checkout_address_lookup_validation_empty);
        string.getClass();
        ViewExtensionsKt.showError(textInputLayout14, string);
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
        CardDelegate cardDelegate2 = this.cardDelegate;
        if (cardDelegate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDelegate");
            cardDelegate2 = null;
        }
        updateInputFields(cardDelegate2.getOutputData());
        initCardNumberInput();
        initExpiryDateInput();
        initSecurityCodeInput();
        initHolderNameInput();
        initSocialSecurityNumberInput();
        initKcpAuthenticationInput();
        initPostalCodeInput();
        initAddressFormInput(coroutineScope);
        initAddressLookup();
        initCardScanning(cardDelegate);
        this.binding.switchStorePaymentMethod.setOnCheckedChangeListener(new c(cardDelegate, 0));
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
    public CardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardView(@NotNull LayoutInflater layoutInflater) {
        this(layoutInflater, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        layoutInflater.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardView(@NotNull LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet) {
        this(layoutInflater, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        layoutInflater.getClass();
    }

    public /* synthetic */ CardView(LayoutInflater layoutInflater, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutInflater, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        context.getClass();
    }

    public /* synthetic */ CardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this(layoutInflaterFrom, attributeSet, i11);
    }

    private final void setAccessibilityDescription(ExpiryDateInput expiryDateInput) {
        Context context = this.localizedContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        String string = context.getString(com.adyen.checkout.card.R.string.checkout_card_expiry_date_hint);
        string.getClass();
        Context context3 = this.localizedContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context2 = context3;
        }
        String string2 = context2.getString(com.adyen.checkout.card.R.string.checkout_card_expiry_date_format_label);
        string2.getClass();
        ViewExtensionsKt.setAccessibilityDelegateWith(expiryDateInput, string + ", " + string2);
    }
}
