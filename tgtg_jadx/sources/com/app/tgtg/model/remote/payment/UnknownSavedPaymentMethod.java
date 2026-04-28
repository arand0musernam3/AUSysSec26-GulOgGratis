package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import i90.h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import lu.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0016HÖ\u0081\u0004J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001dJ\n\u0010\u001e\u001a\u00020\u0012HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/app/tgtg/model/remote/payment/UnknownSavedPaymentMethod;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/payment/BasicSavedPaymentMethod;", "<init>", "()V", "paymentProvider", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "getPaymentProvider", "()Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "type", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "getType", "()Lcom/app/tgtg/model/remote/payment/PaymentType;", "cardStatus", "Lcom/app/tgtg/model/remote/payment/CardStatus;", "getCardStatus", "()Lcom/app/tgtg/model/remote/payment/CardStatus;", "displayValue", "", "getDisplayValue", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UnknownSavedPaymentMethod extends BasicSavedPaymentMethod implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final UnknownSavedPaymentMethod INSTANCE = new UnknownSavedPaymentMethod();

    @NotNull
    public static final Parcelable.Creator<UnknownSavedPaymentMethod> CREATOR = new Creator();
    private static final /* synthetic */ j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(7));

    private UnknownSavedPaymentMethod() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new i90.a("com.app.tgtg.model.remote.payment.UnknownSavedPaymentMethod", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return (KSerializer) $cachedSerializer$delegate.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        return this == other || (other instanceof UnknownSavedPaymentMethod);
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public CardStatus getCardStatus() {
        return CardStatus.UNKNOWN;
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public String getDisplayValue() {
        return "";
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public PaymentProvider getPaymentProvider() {
        return PaymentProvider.UNKNOWN;
    }

    @Override // com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod
    @NotNull
    public PaymentType getType() {
        return PaymentType.UNKNOWN;
    }

    public int hashCode() {
        return -27910483;
    }

    @NotNull
    public final KSerializer serializer() {
        return get$cachedSerializer();
    }

    @NotNull
    public String toString() {
        return "UnknownSavedPaymentMethod";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(1);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnknownSavedPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnknownSavedPaymentMethod createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return UnknownSavedPaymentMethod.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnknownSavedPaymentMethod[] newArray(int i11) {
            return new UnknownSavedPaymentMethod[i11];
        }
    }
}
