package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.PaymentProviderSerializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002EDB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010*JB\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b/\u0010\u001dJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R \u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010$R \u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u00109\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010&R \u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010(R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010*R \u0010\u000b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bC\u00108\u001a\u0004\bB\u0010*¨\u0006F"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SavedBancontactCard;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethod;", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "paymentProvider", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "type", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "cardStatus", "", "cardIdentifier", "displayValue", "<init>", "(Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/CardStatus;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/CardStatus;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/SavedBancontactCard;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "component2", "()Lcom/app/tgtg/model/remote/payment/PaymentType;", "component3", "()Lcom/app/tgtg/model/remote/payment/CardStatus;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/CardStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/payment/SavedBancontactCard;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "getPaymentProvider", "getPaymentProvider$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "getType", "getType$annotations", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "getCardStatus", "getCardStatus$annotations", "Ljava/lang/String;", "getCardIdentifier", "getCardIdentifier$annotations", "getDisplayValue", "getDisplayValue$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SavedBancontactCard extends BasicSavedPaymentMethod implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String cardIdentifier;

    @NotNull
    private final CardStatus cardStatus;

    @NotNull
    private final String displayValue;

    @NotNull
    private final PaymentProvider paymentProvider;

    @NotNull
    private final PaymentType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<SavedBancontactCard> CREATOR = new Creator();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavedBancontactCard(int i11, PaymentProvider paymentProvider, PaymentType paymentType, CardStatus cardStatus, String str, String str2, m1 m1Var) {
        super(null);
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, SavedBancontactCard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.paymentProvider = paymentProvider;
        this.type = paymentType;
        this.cardStatus = cardStatus;
        this.cardIdentifier = str;
        this.displayValue = str2;
    }

    public static /* synthetic */ SavedBancontactCard copy$default(SavedBancontactCard savedBancontactCard, PaymentProvider paymentProvider, PaymentType paymentType, CardStatus cardStatus, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentProvider = savedBancontactCard.paymentProvider;
        }
        if ((i11 & 2) != 0) {
            paymentType = savedBancontactCard.type;
        }
        if ((i11 & 4) != 0) {
            cardStatus = savedBancontactCard.cardStatus;
        }
        if ((i11 & 8) != 0) {
            str = savedBancontactCard.cardIdentifier;
        }
        if ((i11 & 16) != 0) {
            str2 = savedBancontactCard.displayValue;
        }
        String str3 = str2;
        CardStatus cardStatus2 = cardStatus;
        return savedBancontactCard.copy(paymentProvider, paymentType, cardStatus2, str, str3);
    }

    public static final /* synthetic */ void write$Self$app(SavedBancontactCard self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, PaymentProviderSerializer.INSTANCE, self.getPaymentProvider());
        output.i(serialDesc, 1, PaymentTypeSerializer.INSTANCE, self.getType());
        output.i(serialDesc, 2, CardStatusSerializer.INSTANCE, self.getCardStatus());
        output.q(serialDesc, 3, self.cardIdentifier);
        output.q(serialDesc, 4, self.getDisplayValue());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CardStatus getCardStatus() {
        return this.cardStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardIdentifier() {
        return this.cardIdentifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    @NotNull
    public final SavedBancontactCard copy(@NotNull PaymentProvider paymentProvider, @NotNull PaymentType type, @NotNull CardStatus cardStatus, @NotNull String cardIdentifier, @NotNull String displayValue) {
        paymentProvider.getClass();
        type.getClass();
        cardStatus.getClass();
        cardIdentifier.getClass();
        displayValue.getClass();
        return new SavedBancontactCard(paymentProvider, type, cardStatus, cardIdentifier, displayValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedBancontactCard)) {
            return false;
        }
        SavedBancontactCard savedBancontactCard = (SavedBancontactCard) other;
        return this.paymentProvider == savedBancontactCard.paymentProvider && this.type == savedBancontactCard.type && this.cardStatus == savedBancontactCard.cardStatus && Intrinsics.areEqual(this.cardIdentifier, savedBancontactCard.cardIdentifier) && Intrinsics.areEqual(this.displayValue, savedBancontactCard.displayValue);
    }

    @NotNull
    public final String getCardIdentifier() {
        return this.cardIdentifier;
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public CardStatus getCardStatus() {
        return this.cardStatus;
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public PaymentType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.displayValue.hashCode() + l1.b((this.cardStatus.hashCode() + ((this.type.hashCode() + (this.paymentProvider.hashCode() * 31)) * 31)) * 31, 31, this.cardIdentifier);
    }

    @NotNull
    public String toString() {
        PaymentProvider paymentProvider = this.paymentProvider;
        PaymentType paymentType = this.type;
        CardStatus cardStatus = this.cardStatus;
        String str = this.cardIdentifier;
        String str2 = this.displayValue;
        StringBuilder sb2 = new StringBuilder("SavedBancontactCard(paymentProvider=");
        sb2.append(paymentProvider);
        sb2.append(", type=");
        sb2.append(paymentType);
        sb2.append(", cardStatus=");
        sb2.append(cardStatus);
        sb2.append(", cardIdentifier=");
        sb2.append(str);
        sb2.append(", displayValue=");
        return k.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.paymentProvider.name());
        dest.writeString(this.type.name());
        dest.writeString(this.cardStatus.name());
        dest.writeString(this.cardIdentifier);
        dest.writeString(this.displayValue);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SavedBancontactCard$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/SavedBancontactCard;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SavedBancontactCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavedBancontactCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavedBancontactCard createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SavedBancontactCard(PaymentProvider.valueOf(parcel.readString()), PaymentType.valueOf(parcel.readString()), CardStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavedBancontactCard[] newArray(int i11) {
            return new SavedBancontactCard[i11];
        }
    }

    @g("identifier")
    public static /* synthetic */ void getCardIdentifier$annotations() {
    }

    @g("status")
    public static /* synthetic */ void getCardStatus$annotations() {
    }

    @g("display_value")
    public static /* synthetic */ void getDisplayValue$annotations() {
    }

    @g("payment_provider")
    public static /* synthetic */ void getPaymentProvider$annotations() {
    }

    @g("payment_type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedBancontactCard(@NotNull PaymentProvider paymentProvider, @NotNull PaymentType paymentType, @NotNull CardStatus cardStatus, @NotNull String str, @NotNull String str2) {
        super(null);
        paymentProvider.getClass();
        paymentType.getClass();
        cardStatus.getClass();
        str.getClass();
        str2.getClass();
        this.paymentProvider = paymentProvider;
        this.type = paymentType;
        this.cardStatus = cardStatus;
        this.cardIdentifier = str;
        this.displayValue = str2;
    }
}
