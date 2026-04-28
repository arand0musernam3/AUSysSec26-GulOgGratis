package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.card.internal.ui.view.InstallmentModel;
import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import com.adyen.checkout.ui.core.internal.ui.AddressFormUIState;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0006\u0010$\u001a\u00020\u0010¢\u0006\u0002\u0010%J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\t\u0010F\u001a\u00020\u0012HÆ\u0003J\t\u0010G\u001a\u00020\u0012HÆ\u0003J\t\u0010H\u001a\u00020\u0012HÆ\u0003J\t\u0010I\u001a\u00020\u0010HÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\t\u0010K\u001a\u00020\u0010HÆ\u0003J\t\u0010L\u001a\u00020\u0010HÆ\u0003J\t\u0010M\u001a\u00020\u001cHÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010!HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010<J\t\u0010S\u001a\u00020\u0010HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\fHÆ\u0003J\u0011\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003HÆ\u0003J¼\u0002\u0010[\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020\u00102\b\u0010^\u001a\u0004\u0018\u00010_HÖ\u0003J\t\u0010`\u001a\u00020#HÖ\u0001J\t\u0010a\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0011\u0010$\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u00109R\u0011\u0010\u001a\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00109R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00109R\u0014\u0010:\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00109R\u0015\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u00109R\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bB\u00109R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-¨\u0006b"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "cardNumberState", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "", "expiryDateState", "securityCodeState", "holderNameState", "socialSecurityNumberState", "kcpBirthDateOrTaxNumberState", "kcpCardPasswordState", "addressState", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "installmentState", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "shouldStorePaymentMethod", "", "cvcUIState", "Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "expiryDateUIState", "holderNameUIState", "showStorePaymentField", "detectedCardTypes", "", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "isSocialSecurityNumberRequired", "isKCPAuthRequired", "addressUIState", "Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "installmentOptions", "cardBrands", "Lcom/adyen/checkout/card/internal/ui/model/CardListItem;", "dualBrandData", "Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;", "kcpBirthDateOrTaxNumberHint", "", "isCardListVisible", "(Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;ZLcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;ZLjava/util/List;ZZLcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;Ljava/util/List;Ljava/util/List;Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;Ljava/lang/Integer;Z)V", "getAddressState", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "getAddressUIState", "()Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "getCardBrands", "()Ljava/util/List;", "getCardNumberState", "()Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "getCvcUIState", "()Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "getDetectedCardTypes", "getDualBrandData", "()Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;", "getExpiryDateState", "getExpiryDateUIState", "getHolderNameState", "getHolderNameUIState", "getInstallmentOptions", "getInstallmentState", "()Z", "isValid", "getKcpBirthDateOrTaxNumberHint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKcpBirthDateOrTaxNumberState", "getKcpCardPasswordState", "getSecurityCodeState", "getShouldStorePaymentMethod", "getShowStorePaymentField", "getSocialSecurityNumberState", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;ZLcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;ZLjava/util/List;ZZLcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;Ljava/util/List;Ljava/util/List;Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;Ljava/lang/Integer;Z)Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "equals", "other", "", "hashCode", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardOutputData implements OutputData {

    @NotNull
    private final AddressOutputData addressState;

    @NotNull
    private final AddressFormUIState addressUIState;

    @NotNull
    private final List<CardListItem> cardBrands;

    @NotNull
    private final FieldState<String> cardNumberState;

    @NotNull
    private final InputFieldUIState cvcUIState;

    @NotNull
    private final List<DetectedCardType> detectedCardTypes;

    @Nullable
    private final DualBrandData dualBrandData;

    @NotNull
    private final FieldState<String> expiryDateState;

    @NotNull
    private final InputFieldUIState expiryDateUIState;

    @NotNull
    private final FieldState<String> holderNameState;

    @NotNull
    private final InputFieldUIState holderNameUIState;

    @NotNull
    private final List<InstallmentModel> installmentOptions;

    @NotNull
    private final FieldState<InstallmentModel> installmentState;
    private final boolean isCardListVisible;
    private final boolean isKCPAuthRequired;
    private final boolean isSocialSecurityNumberRequired;

    @Nullable
    private final Integer kcpBirthDateOrTaxNumberHint;

    @NotNull
    private final FieldState<String> kcpBirthDateOrTaxNumberState;

    @NotNull
    private final FieldState<String> kcpCardPasswordState;

    @NotNull
    private final FieldState<String> securityCodeState;
    private final boolean shouldStorePaymentMethod;
    private final boolean showStorePaymentField;

    @NotNull
    private final FieldState<String> socialSecurityNumberState;

    public CardOutputData(@NotNull FieldState<String> fieldState, @NotNull FieldState<String> fieldState2, @NotNull FieldState<String> fieldState3, @NotNull FieldState<String> fieldState4, @NotNull FieldState<String> fieldState5, @NotNull FieldState<String> fieldState6, @NotNull FieldState<String> fieldState7, @NotNull AddressOutputData addressOutputData, @NotNull FieldState<InstallmentModel> fieldState8, boolean z11, @NotNull InputFieldUIState inputFieldUIState, @NotNull InputFieldUIState inputFieldUIState2, @NotNull InputFieldUIState inputFieldUIState3, boolean z12, @NotNull List<DetectedCardType> list, boolean z13, boolean z14, @NotNull AddressFormUIState addressFormUIState, @NotNull List<InstallmentModel> list2, @NotNull List<CardListItem> list3, @Nullable DualBrandData dualBrandData, @Nullable Integer num, boolean z15) {
        fieldState.getClass();
        fieldState2.getClass();
        fieldState3.getClass();
        fieldState4.getClass();
        fieldState5.getClass();
        fieldState6.getClass();
        fieldState7.getClass();
        addressOutputData.getClass();
        fieldState8.getClass();
        inputFieldUIState.getClass();
        inputFieldUIState2.getClass();
        inputFieldUIState3.getClass();
        list.getClass();
        addressFormUIState.getClass();
        list2.getClass();
        list3.getClass();
        this.cardNumberState = fieldState;
        this.expiryDateState = fieldState2;
        this.securityCodeState = fieldState3;
        this.holderNameState = fieldState4;
        this.socialSecurityNumberState = fieldState5;
        this.kcpBirthDateOrTaxNumberState = fieldState6;
        this.kcpCardPasswordState = fieldState7;
        this.addressState = addressOutputData;
        this.installmentState = fieldState8;
        this.shouldStorePaymentMethod = z11;
        this.cvcUIState = inputFieldUIState;
        this.expiryDateUIState = inputFieldUIState2;
        this.holderNameUIState = inputFieldUIState3;
        this.showStorePaymentField = z12;
        this.detectedCardTypes = list;
        this.isSocialSecurityNumberRequired = z13;
        this.isKCPAuthRequired = z14;
        this.addressUIState = addressFormUIState;
        this.installmentOptions = list2;
        this.cardBrands = list3;
        this.dualBrandData = dualBrandData;
        this.kcpBirthDateOrTaxNumberHint = num;
        this.isCardListVisible = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardOutputData copy$default(CardOutputData cardOutputData, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, FieldState fieldState5, FieldState fieldState6, FieldState fieldState7, AddressOutputData addressOutputData, FieldState fieldState8, boolean z11, InputFieldUIState inputFieldUIState, InputFieldUIState inputFieldUIState2, InputFieldUIState inputFieldUIState3, boolean z12, List list, boolean z13, boolean z14, AddressFormUIState addressFormUIState, List list2, List list3, DualBrandData dualBrandData, Integer num, boolean z15, int i11, Object obj) {
        boolean z16;
        Integer num2;
        FieldState fieldState9 = (i11 & 1) != 0 ? cardOutputData.cardNumberState : fieldState;
        FieldState fieldState10 = (i11 & 2) != 0 ? cardOutputData.expiryDateState : fieldState2;
        FieldState fieldState11 = (i11 & 4) != 0 ? cardOutputData.securityCodeState : fieldState3;
        FieldState fieldState12 = (i11 & 8) != 0 ? cardOutputData.holderNameState : fieldState4;
        FieldState fieldState13 = (i11 & 16) != 0 ? cardOutputData.socialSecurityNumberState : fieldState5;
        FieldState fieldState14 = (i11 & 32) != 0 ? cardOutputData.kcpBirthDateOrTaxNumberState : fieldState6;
        FieldState fieldState15 = (i11 & 64) != 0 ? cardOutputData.kcpCardPasswordState : fieldState7;
        AddressOutputData addressOutputData2 = (i11 & 128) != 0 ? cardOutputData.addressState : addressOutputData;
        FieldState fieldState16 = (i11 & 256) != 0 ? cardOutputData.installmentState : fieldState8;
        boolean z17 = (i11 & 512) != 0 ? cardOutputData.shouldStorePaymentMethod : z11;
        InputFieldUIState inputFieldUIState4 = (i11 & 1024) != 0 ? cardOutputData.cvcUIState : inputFieldUIState;
        InputFieldUIState inputFieldUIState5 = (i11 & NewHope.SENDB_BYTES) != 0 ? cardOutputData.expiryDateUIState : inputFieldUIState2;
        InputFieldUIState inputFieldUIState6 = (i11 & 4096) != 0 ? cardOutputData.holderNameUIState : inputFieldUIState3;
        boolean z18 = (i11 & 8192) != 0 ? cardOutputData.showStorePaymentField : z12;
        FieldState fieldState17 = fieldState9;
        List list4 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? cardOutputData.detectedCardTypes : list;
        boolean z19 = (i11 & 32768) != 0 ? cardOutputData.isSocialSecurityNumberRequired : z13;
        boolean z21 = (i11 & 65536) != 0 ? cardOutputData.isKCPAuthRequired : z14;
        AddressFormUIState addressFormUIState2 = (i11 & 131072) != 0 ? cardOutputData.addressUIState : addressFormUIState;
        List list5 = (i11 & 262144) != 0 ? cardOutputData.installmentOptions : list2;
        List list6 = (i11 & 524288) != 0 ? cardOutputData.cardBrands : list3;
        DualBrandData dualBrandData2 = (i11 & 1048576) != 0 ? cardOutputData.dualBrandData : dualBrandData;
        Integer num3 = (i11 & 2097152) != 0 ? cardOutputData.kcpBirthDateOrTaxNumberHint : num;
        if ((i11 & 4194304) != 0) {
            num2 = num3;
            z16 = cardOutputData.isCardListVisible;
        } else {
            z16 = z15;
            num2 = num3;
        }
        return cardOutputData.copy(fieldState17, fieldState10, fieldState11, fieldState12, fieldState13, fieldState14, fieldState15, addressOutputData2, fieldState16, z17, inputFieldUIState4, inputFieldUIState5, inputFieldUIState6, z18, list4, z19, z21, addressFormUIState2, list5, list6, dualBrandData2, num2, z16);
    }

    @NotNull
    public final FieldState<String> component1() {
        return this.cardNumberState;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShouldStorePaymentMethod() {
        return this.shouldStorePaymentMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final InputFieldUIState getCvcUIState() {
        return this.cvcUIState;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final InputFieldUIState getExpiryDateUIState() {
        return this.expiryDateUIState;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final InputFieldUIState getHolderNameUIState() {
        return this.holderNameUIState;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShowStorePaymentField() {
        return this.showStorePaymentField;
    }

    @NotNull
    public final List<DetectedCardType> component15() {
        return this.detectedCardTypes;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsSocialSecurityNumberRequired() {
        return this.isSocialSecurityNumberRequired;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsKCPAuthRequired() {
        return this.isKCPAuthRequired;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final AddressFormUIState getAddressUIState() {
        return this.addressUIState;
    }

    @NotNull
    public final List<InstallmentModel> component19() {
        return this.installmentOptions;
    }

    @NotNull
    public final FieldState<String> component2() {
        return this.expiryDateState;
    }

    @NotNull
    public final List<CardListItem> component20() {
        return this.cardBrands;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final DualBrandData getDualBrandData() {
        return this.dualBrandData;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getKcpBirthDateOrTaxNumberHint() {
        return this.kcpBirthDateOrTaxNumberHint;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsCardListVisible() {
        return this.isCardListVisible;
    }

    @NotNull
    public final FieldState<String> component3() {
        return this.securityCodeState;
    }

    @NotNull
    public final FieldState<String> component4() {
        return this.holderNameState;
    }

    @NotNull
    public final FieldState<String> component5() {
        return this.socialSecurityNumberState;
    }

    @NotNull
    public final FieldState<String> component6() {
        return this.kcpBirthDateOrTaxNumberState;
    }

    @NotNull
    public final FieldState<String> component7() {
        return this.kcpCardPasswordState;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AddressOutputData getAddressState() {
        return this.addressState;
    }

    @NotNull
    public final FieldState<InstallmentModel> component9() {
        return this.installmentState;
    }

    @NotNull
    public final CardOutputData copy(@NotNull FieldState<String> cardNumberState, @NotNull FieldState<String> expiryDateState, @NotNull FieldState<String> securityCodeState, @NotNull FieldState<String> holderNameState, @NotNull FieldState<String> socialSecurityNumberState, @NotNull FieldState<String> kcpBirthDateOrTaxNumberState, @NotNull FieldState<String> kcpCardPasswordState, @NotNull AddressOutputData addressState, @NotNull FieldState<InstallmentModel> installmentState, boolean shouldStorePaymentMethod, @NotNull InputFieldUIState cvcUIState, @NotNull InputFieldUIState expiryDateUIState, @NotNull InputFieldUIState holderNameUIState, boolean showStorePaymentField, @NotNull List<DetectedCardType> detectedCardTypes, boolean isSocialSecurityNumberRequired, boolean isKCPAuthRequired, @NotNull AddressFormUIState addressUIState, @NotNull List<InstallmentModel> installmentOptions, @NotNull List<CardListItem> cardBrands, @Nullable DualBrandData dualBrandData, @Nullable Integer kcpBirthDateOrTaxNumberHint, boolean isCardListVisible) {
        cardNumberState.getClass();
        expiryDateState.getClass();
        securityCodeState.getClass();
        holderNameState.getClass();
        socialSecurityNumberState.getClass();
        kcpBirthDateOrTaxNumberState.getClass();
        kcpCardPasswordState.getClass();
        addressState.getClass();
        installmentState.getClass();
        cvcUIState.getClass();
        expiryDateUIState.getClass();
        holderNameUIState.getClass();
        detectedCardTypes.getClass();
        addressUIState.getClass();
        installmentOptions.getClass();
        cardBrands.getClass();
        return new CardOutputData(cardNumberState, expiryDateState, securityCodeState, holderNameState, socialSecurityNumberState, kcpBirthDateOrTaxNumberState, kcpCardPasswordState, addressState, installmentState, shouldStorePaymentMethod, cvcUIState, expiryDateUIState, holderNameUIState, showStorePaymentField, detectedCardTypes, isSocialSecurityNumberRequired, isKCPAuthRequired, addressUIState, installmentOptions, cardBrands, dualBrandData, kcpBirthDateOrTaxNumberHint, isCardListVisible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardOutputData)) {
            return false;
        }
        CardOutputData cardOutputData = (CardOutputData) other;
        return Intrinsics.areEqual(this.cardNumberState, cardOutputData.cardNumberState) && Intrinsics.areEqual(this.expiryDateState, cardOutputData.expiryDateState) && Intrinsics.areEqual(this.securityCodeState, cardOutputData.securityCodeState) && Intrinsics.areEqual(this.holderNameState, cardOutputData.holderNameState) && Intrinsics.areEqual(this.socialSecurityNumberState, cardOutputData.socialSecurityNumberState) && Intrinsics.areEqual(this.kcpBirthDateOrTaxNumberState, cardOutputData.kcpBirthDateOrTaxNumberState) && Intrinsics.areEqual(this.kcpCardPasswordState, cardOutputData.kcpCardPasswordState) && Intrinsics.areEqual(this.addressState, cardOutputData.addressState) && Intrinsics.areEqual(this.installmentState, cardOutputData.installmentState) && this.shouldStorePaymentMethod == cardOutputData.shouldStorePaymentMethod && this.cvcUIState == cardOutputData.cvcUIState && this.expiryDateUIState == cardOutputData.expiryDateUIState && this.holderNameUIState == cardOutputData.holderNameUIState && this.showStorePaymentField == cardOutputData.showStorePaymentField && Intrinsics.areEqual(this.detectedCardTypes, cardOutputData.detectedCardTypes) && this.isSocialSecurityNumberRequired == cardOutputData.isSocialSecurityNumberRequired && this.isKCPAuthRequired == cardOutputData.isKCPAuthRequired && this.addressUIState == cardOutputData.addressUIState && Intrinsics.areEqual(this.installmentOptions, cardOutputData.installmentOptions) && Intrinsics.areEqual(this.cardBrands, cardOutputData.cardBrands) && Intrinsics.areEqual(this.dualBrandData, cardOutputData.dualBrandData) && Intrinsics.areEqual(this.kcpBirthDateOrTaxNumberHint, cardOutputData.kcpBirthDateOrTaxNumberHint) && this.isCardListVisible == cardOutputData.isCardListVisible;
    }

    @NotNull
    public final AddressOutputData getAddressState() {
        return this.addressState;
    }

    @NotNull
    public final AddressFormUIState getAddressUIState() {
        return this.addressUIState;
    }

    @NotNull
    public final List<CardListItem> getCardBrands() {
        return this.cardBrands;
    }

    @NotNull
    public final FieldState<String> getCardNumberState() {
        return this.cardNumberState;
    }

    @NotNull
    public final InputFieldUIState getCvcUIState() {
        return this.cvcUIState;
    }

    @NotNull
    public final List<DetectedCardType> getDetectedCardTypes() {
        return this.detectedCardTypes;
    }

    @Nullable
    public final DualBrandData getDualBrandData() {
        return this.dualBrandData;
    }

    @NotNull
    public final FieldState<String> getExpiryDateState() {
        return this.expiryDateState;
    }

    @NotNull
    public final InputFieldUIState getExpiryDateUIState() {
        return this.expiryDateUIState;
    }

    @NotNull
    public final FieldState<String> getHolderNameState() {
        return this.holderNameState;
    }

    @NotNull
    public final InputFieldUIState getHolderNameUIState() {
        return this.holderNameUIState;
    }

    @NotNull
    public final List<InstallmentModel> getInstallmentOptions() {
        return this.installmentOptions;
    }

    @NotNull
    public final FieldState<InstallmentModel> getInstallmentState() {
        return this.installmentState;
    }

    @Nullable
    public final Integer getKcpBirthDateOrTaxNumberHint() {
        return this.kcpBirthDateOrTaxNumberHint;
    }

    @NotNull
    public final FieldState<String> getKcpBirthDateOrTaxNumberState() {
        return this.kcpBirthDateOrTaxNumberState;
    }

    @NotNull
    public final FieldState<String> getKcpCardPasswordState() {
        return this.kcpCardPasswordState;
    }

    @NotNull
    public final FieldState<String> getSecurityCodeState() {
        return this.securityCodeState;
    }

    public final boolean getShouldStorePaymentMethod() {
        return this.shouldStorePaymentMethod;
    }

    public final boolean getShowStorePaymentField() {
        return this.showStorePaymentField;
    }

    @NotNull
    public final FieldState<String> getSocialSecurityNumberState() {
        return this.socialSecurityNumberState;
    }

    public int hashCode() {
        int iC = f.c(this.cardBrands, f.c(this.installmentOptions, (this.addressUIState.hashCode() + k.e(k.e(f.c(this.detectedCardTypes, k.e((this.holderNameUIState.hashCode() + ((this.expiryDateUIState.hashCode() + ((this.cvcUIState.hashCode() + k.e((this.installmentState.hashCode() + ((this.addressState.hashCode() + ((this.kcpCardPasswordState.hashCode() + ((this.kcpBirthDateOrTaxNumberState.hashCode() + ((this.socialSecurityNumberState.hashCode() + ((this.holderNameState.hashCode() + ((this.securityCodeState.hashCode() + ((this.expiryDateState.hashCode() + (this.cardNumberState.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.shouldStorePaymentMethod)) * 31)) * 31)) * 31, 31, this.showStorePaymentField), 31), 31, this.isSocialSecurityNumberRequired), 31, this.isKCPAuthRequired)) * 31, 31), 31);
        DualBrandData dualBrandData = this.dualBrandData;
        int iHashCode = (iC + (dualBrandData == null ? 0 : dualBrandData.hashCode())) * 31;
        Integer num = this.kcpBirthDateOrTaxNumberHint;
        return Boolean.hashCode(this.isCardListVisible) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final boolean isCardListVisible() {
        return this.isCardListVisible;
    }

    public final boolean isKCPAuthRequired() {
        return this.isKCPAuthRequired;
    }

    public final boolean isSocialSecurityNumberRequired() {
        return this.isSocialSecurityNumberRequired;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    /* JADX INFO: renamed from: isValid */
    public boolean getIsValid() {
        return this.cardNumberState.getValidation().isValid() && this.expiryDateState.getValidation().isValid() && this.securityCodeState.getValidation().isValid() && this.holderNameState.getValidation().isValid() && this.socialSecurityNumberState.getValidation().isValid() && this.kcpBirthDateOrTaxNumberState.getValidation().isValid() && this.kcpCardPasswordState.getValidation().isValid() && this.installmentState.getValidation().isValid() && this.addressState.getIsValid();
    }

    @NotNull
    public String toString() {
        FieldState<String> fieldState = this.cardNumberState;
        FieldState<String> fieldState2 = this.expiryDateState;
        FieldState<String> fieldState3 = this.securityCodeState;
        FieldState<String> fieldState4 = this.holderNameState;
        FieldState<String> fieldState5 = this.socialSecurityNumberState;
        FieldState<String> fieldState6 = this.kcpBirthDateOrTaxNumberState;
        FieldState<String> fieldState7 = this.kcpCardPasswordState;
        AddressOutputData addressOutputData = this.addressState;
        FieldState<InstallmentModel> fieldState8 = this.installmentState;
        boolean z11 = this.shouldStorePaymentMethod;
        InputFieldUIState inputFieldUIState = this.cvcUIState;
        InputFieldUIState inputFieldUIState2 = this.expiryDateUIState;
        InputFieldUIState inputFieldUIState3 = this.holderNameUIState;
        boolean z12 = this.showStorePaymentField;
        List<DetectedCardType> list = this.detectedCardTypes;
        boolean z13 = this.isSocialSecurityNumberRequired;
        boolean z14 = this.isKCPAuthRequired;
        AddressFormUIState addressFormUIState = this.addressUIState;
        List<InstallmentModel> list2 = this.installmentOptions;
        List<CardListItem> list3 = this.cardBrands;
        DualBrandData dualBrandData = this.dualBrandData;
        Integer num = this.kcpBirthDateOrTaxNumberHint;
        boolean z15 = this.isCardListVisible;
        StringBuilder sb2 = new StringBuilder("CardOutputData(cardNumberState=");
        sb2.append(fieldState);
        sb2.append(", expiryDateState=");
        sb2.append(fieldState2);
        sb2.append(", securityCodeState=");
        sb2.append(fieldState3);
        sb2.append(", holderNameState=");
        sb2.append(fieldState4);
        sb2.append(", socialSecurityNumberState=");
        sb2.append(fieldState5);
        sb2.append(", kcpBirthDateOrTaxNumberState=");
        sb2.append(fieldState6);
        sb2.append(", kcpCardPasswordState=");
        sb2.append(fieldState7);
        sb2.append(", addressState=");
        sb2.append(addressOutputData);
        sb2.append(", installmentState=");
        sb2.append(fieldState8);
        sb2.append(", shouldStorePaymentMethod=");
        sb2.append(z11);
        sb2.append(", cvcUIState=");
        sb2.append(inputFieldUIState);
        sb2.append(", expiryDateUIState=");
        sb2.append(inputFieldUIState2);
        sb2.append(", holderNameUIState=");
        sb2.append(inputFieldUIState3);
        sb2.append(", showStorePaymentField=");
        sb2.append(z12);
        sb2.append(", detectedCardTypes=");
        sb2.append(list);
        sb2.append(", isSocialSecurityNumberRequired=");
        sb2.append(z13);
        sb2.append(", isKCPAuthRequired=");
        sb2.append(z14);
        sb2.append(", addressUIState=");
        sb2.append(addressFormUIState);
        sb2.append(", installmentOptions=");
        sb2.append(list2);
        sb2.append(", cardBrands=");
        sb2.append(list3);
        sb2.append(", dualBrandData=");
        sb2.append(dualBrandData);
        sb2.append(", kcpBirthDateOrTaxNumberHint=");
        sb2.append(num);
        sb2.append(", isCardListVisible=");
        return s.o(sb2, z15, ")");
    }
}
