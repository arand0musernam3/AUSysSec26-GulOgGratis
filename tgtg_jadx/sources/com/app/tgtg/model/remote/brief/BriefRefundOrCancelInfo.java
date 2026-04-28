package com.app.tgtg.model.remote.brief;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.CancellingEntitySerializer;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.item.response.PaymentStateEnumSerializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J@\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010'¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/PaymentState;", "briefPaymentState", "Lcom/app/tgtg/model/remote/item/response/CancellingEntity;", "cancellingUserType", "", "cancelledOrRefundedAtUtc", "", "expectedBankProcessingDays", "<init>", "(Lcom/app/tgtg/model/remote/item/response/PaymentState;Lcom/app/tgtg/model/remote/item/response/CancellingEntity;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/response/PaymentState;Lcom/app/tgtg/model/remote/item/response/CancellingEntity;Ljava/lang/String;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/item/response/PaymentState;", "component2", "()Lcom/app/tgtg/model/remote/item/response/CancellingEntity;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Integer;", "copy", "(Lcom/app/tgtg/model/remote/item/response/PaymentState;Lcom/app/tgtg/model/remote/item/response/CancellingEntity;Ljava/lang/String;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/item/response/PaymentState;", "getBriefPaymentState", "getBriefPaymentState$annotations", "()V", "Lcom/app/tgtg/model/remote/item/response/CancellingEntity;", "getCancellingUserType", "getCancellingUserType$annotations", "Ljava/lang/String;", "getCancelledOrRefundedAtUtc", "getCancelledOrRefundedAtUtc$annotations", "Ljava/lang/Integer;", "getExpectedBankProcessingDays", "getExpectedBankProcessingDays$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BriefRefundOrCancelInfo implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final PaymentState briefPaymentState;

    @Nullable
    private final String cancelledOrRefundedAtUtc;

    @Nullable
    private final CancellingEntity cancellingUserType;

    @Nullable
    private final Integer expectedBankProcessingDays;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<BriefRefundOrCancelInfo> CREATOR = new Creator();

    public /* synthetic */ BriefRefundOrCancelInfo(int i11, PaymentState paymentState, CancellingEntity cancellingEntity, String str, Integer num, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, BriefRefundOrCancelInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.briefPaymentState = paymentState;
        this.cancellingUserType = cancellingEntity;
        this.cancelledOrRefundedAtUtc = str;
        this.expectedBankProcessingDays = num;
    }

    public static /* synthetic */ BriefRefundOrCancelInfo copy$default(BriefRefundOrCancelInfo briefRefundOrCancelInfo, PaymentState paymentState, CancellingEntity cancellingEntity, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentState = briefRefundOrCancelInfo.briefPaymentState;
        }
        if ((i11 & 2) != 0) {
            cancellingEntity = briefRefundOrCancelInfo.cancellingUserType;
        }
        if ((i11 & 4) != 0) {
            str = briefRefundOrCancelInfo.cancelledOrRefundedAtUtc;
        }
        if ((i11 & 8) != 0) {
            num = briefRefundOrCancelInfo.expectedBankProcessingDays;
        }
        return briefRefundOrCancelInfo.copy(paymentState, cancellingEntity, str, num);
    }

    public static final /* synthetic */ void write$Self$app(BriefRefundOrCancelInfo self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, PaymentStateEnumSerializer.INSTANCE, self.briefPaymentState);
        output.r(serialDesc, 1, CancellingEntitySerializer.INSTANCE, self.cancellingUserType);
        output.r(serialDesc, 2, r1.f29848a, self.cancelledOrRefundedAtUtc);
        output.r(serialDesc, 3, l0.f29821a, self.expectedBankProcessingDays);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentState getBriefPaymentState() {
        return this.briefPaymentState;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CancellingEntity getCancellingUserType() {
        return this.cancellingUserType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCancelledOrRefundedAtUtc() {
        return this.cancelledOrRefundedAtUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getExpectedBankProcessingDays() {
        return this.expectedBankProcessingDays;
    }

    @NotNull
    public final BriefRefundOrCancelInfo copy(@Nullable PaymentState briefPaymentState, @Nullable CancellingEntity cancellingUserType, @Nullable String cancelledOrRefundedAtUtc, @Nullable Integer expectedBankProcessingDays) {
        return new BriefRefundOrCancelInfo(briefPaymentState, cancellingUserType, cancelledOrRefundedAtUtc, expectedBankProcessingDays);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BriefRefundOrCancelInfo)) {
            return false;
        }
        BriefRefundOrCancelInfo briefRefundOrCancelInfo = (BriefRefundOrCancelInfo) other;
        return this.briefPaymentState == briefRefundOrCancelInfo.briefPaymentState && this.cancellingUserType == briefRefundOrCancelInfo.cancellingUserType && Intrinsics.areEqual(this.cancelledOrRefundedAtUtc, briefRefundOrCancelInfo.cancelledOrRefundedAtUtc) && Intrinsics.areEqual(this.expectedBankProcessingDays, briefRefundOrCancelInfo.expectedBankProcessingDays);
    }

    @Nullable
    public final PaymentState getBriefPaymentState() {
        return this.briefPaymentState;
    }

    @Nullable
    public final String getCancelledOrRefundedAtUtc() {
        return this.cancelledOrRefundedAtUtc;
    }

    @Nullable
    public final CancellingEntity getCancellingUserType() {
        return this.cancellingUserType;
    }

    @Nullable
    public final Integer getExpectedBankProcessingDays() {
        return this.expectedBankProcessingDays;
    }

    public int hashCode() {
        PaymentState paymentState = this.briefPaymentState;
        int iHashCode = (paymentState == null ? 0 : paymentState.hashCode()) * 31;
        CancellingEntity cancellingEntity = this.cancellingUserType;
        int iHashCode2 = (iHashCode + (cancellingEntity == null ? 0 : cancellingEntity.hashCode())) * 31;
        String str = this.cancelledOrRefundedAtUtc;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.expectedBankProcessingDays;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BriefRefundOrCancelInfo(briefPaymentState=" + this.briefPaymentState + ", cancellingUserType=" + this.cancellingUserType + ", cancelledOrRefundedAtUtc=" + this.cancelledOrRefundedAtUtc + ", expectedBankProcessingDays=" + this.expectedBankProcessingDays + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        PaymentState paymentState = this.briefPaymentState;
        if (paymentState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paymentState.name());
        }
        CancellingEntity cancellingEntity = this.cancellingUserType;
        if (cancellingEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cancellingEntity.name());
        }
        dest.writeString(this.cancelledOrRefundedAtUtc);
        Integer num = this.expectedBankProcessingDays;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BriefRefundOrCancelInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BriefRefundOrCancelInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefRefundOrCancelInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BriefRefundOrCancelInfo(parcel.readInt() == 0 ? null : PaymentState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CancellingEntity.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefRefundOrCancelInfo[] newArray(int i11) {
            return new BriefRefundOrCancelInfo[i11];
        }
    }

    @g("payment_state")
    public static /* synthetic */ void getBriefPaymentState$annotations() {
    }

    @g("cancelled_or_refunded_at_utc")
    public static /* synthetic */ void getCancelledOrRefundedAtUtc$annotations() {
    }

    @g("cancelling_user_type")
    public static /* synthetic */ void getCancellingUserType$annotations() {
    }

    @g("expected_bank_processing_days")
    public static /* synthetic */ void getExpectedBankProcessingDays$annotations() {
    }

    public BriefRefundOrCancelInfo(@Nullable PaymentState paymentState, @Nullable CancellingEntity cancellingEntity, @Nullable String str, @Nullable Integer num) {
        this.briefPaymentState = paymentState;
        this.cancellingUserType = cancellingEntity;
        this.cancelledOrRefundedAtUtc = str;
        this.expectedBankProcessingDays = num;
    }
}
