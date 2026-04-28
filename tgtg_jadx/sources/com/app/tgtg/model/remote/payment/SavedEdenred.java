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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002A@B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J8\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010#R \u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010%R \u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010'R \u0010\n\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010)¨\u0006B"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SavedEdenred;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethod;", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "paymentProvider", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "type", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "cardStatus", "", "displayValue", "<init>", "(Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/CardStatus;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/CardStatus;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/SavedEdenred;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "component2", "()Lcom/app/tgtg/model/remote/payment/PaymentType;", "component3", "()Lcom/app/tgtg/model/remote/payment/CardStatus;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/payment/PaymentType;Lcom/app/tgtg/model/remote/payment/CardStatus;Ljava/lang/String;)Lcom/app/tgtg/model/remote/payment/SavedEdenred;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "getPaymentProvider", "getPaymentProvider$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "getType", "getType$annotations", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "getCardStatus", "getCardStatus$annotations", "Ljava/lang/String;", "getDisplayValue", "getDisplayValue$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SavedEdenred extends BasicSavedPaymentMethod implements Parcelable {
    public static final int $stable = 0;

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
    public static final Parcelable.Creator<SavedEdenred> CREATOR = new Creator();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavedEdenred(int i11, PaymentProvider paymentProvider, PaymentType paymentType, CardStatus cardStatus, String str, m1 m1Var) {
        super(null);
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, SavedEdenred$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.paymentProvider = paymentProvider;
        this.type = paymentType;
        this.cardStatus = cardStatus;
        this.displayValue = str;
    }

    public static /* synthetic */ SavedEdenred copy$default(SavedEdenred savedEdenred, PaymentProvider paymentProvider, PaymentType paymentType, CardStatus cardStatus, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentProvider = savedEdenred.paymentProvider;
        }
        if ((i11 & 2) != 0) {
            paymentType = savedEdenred.type;
        }
        if ((i11 & 4) != 0) {
            cardStatus = savedEdenred.cardStatus;
        }
        if ((i11 & 8) != 0) {
            str = savedEdenred.displayValue;
        }
        return savedEdenred.copy(paymentProvider, paymentType, cardStatus, str);
    }

    public static final /* synthetic */ void write$Self$app(SavedEdenred self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, PaymentProviderSerializer.INSTANCE, self.getPaymentProvider());
        output.i(serialDesc, 1, PaymentTypeSerializer.INSTANCE, self.getType());
        output.i(serialDesc, 2, CardStatusSerializer.INSTANCE, self.getCardStatus());
        output.q(serialDesc, 3, self.getDisplayValue());
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
    public final String getDisplayValue() {
        return this.displayValue;
    }

    @NotNull
    public final SavedEdenred copy(@NotNull PaymentProvider paymentProvider, @NotNull PaymentType type, @NotNull CardStatus cardStatus, @NotNull String displayValue) {
        paymentProvider.getClass();
        type.getClass();
        cardStatus.getClass();
        displayValue.getClass();
        return new SavedEdenred(paymentProvider, type, cardStatus, displayValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedEdenred)) {
            return false;
        }
        SavedEdenred savedEdenred = (SavedEdenred) other;
        return this.paymentProvider == savedEdenred.paymentProvider && this.type == savedEdenred.type && this.cardStatus == savedEdenred.cardStatus && Intrinsics.areEqual(this.displayValue, savedEdenred.displayValue);
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
        return this.displayValue.hashCode() + ((this.cardStatus.hashCode() + ((this.type.hashCode() + (this.paymentProvider.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SavedEdenred(paymentProvider=" + this.paymentProvider + ", type=" + this.type + ", cardStatus=" + this.cardStatus + ", displayValue=" + this.displayValue + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.paymentProvider.name());
        dest.writeString(this.type.name());
        dest.writeString(this.cardStatus.name());
        dest.writeString(this.displayValue);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SavedEdenred$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/SavedEdenred;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SavedEdenred$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavedEdenred> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavedEdenred createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SavedEdenred(PaymentProvider.valueOf(parcel.readString()), PaymentType.valueOf(parcel.readString()), CardStatus.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavedEdenred[] newArray(int i11) {
            return new SavedEdenred[i11];
        }
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
    public SavedEdenred(@NotNull PaymentProvider paymentProvider, @NotNull PaymentType paymentType, @NotNull CardStatus cardStatus, @NotNull String str) {
        super(null);
        paymentProvider.getClass();
        paymentType.getClass();
        cardStatus.getClass();
        str.getClass();
        this.paymentProvider = paymentProvider;
        this.type = paymentType;
        this.cardStatus = cardStatus;
        this.displayValue = str;
    }
}
