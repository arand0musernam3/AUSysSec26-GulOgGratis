package com.app.tgtg.model.remote.support.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefOrder$$serializer;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010 ¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/support/response/RefundResponse;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/support/response/RefundState;", "refundState", "Lcom/app/tgtg/model/remote/brief/BriefOrder;", "briefOrder", "<init>", "(Lcom/app/tgtg/model/remote/support/response/RefundState;Lcom/app/tgtg/model/remote/brief/BriefOrder;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/support/response/RefundState;Lcom/app/tgtg/model/remote/brief/BriefOrder;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/support/response/RefundResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/support/response/RefundState;", "component2", "()Lcom/app/tgtg/model/remote/brief/BriefOrder;", "copy", "(Lcom/app/tgtg/model/remote/support/response/RefundState;Lcom/app/tgtg/model/remote/brief/BriefOrder;)Lcom/app/tgtg/model/remote/support/response/RefundResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/support/response/RefundState;", "getRefundState", "getRefundState$annotations", "()V", "Lcom/app/tgtg/model/remote/brief/BriefOrder;", "getBriefOrder", "getBriefOrder$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RefundResponse implements Parcelable {

    @Nullable
    private final BriefOrder briefOrder;

    @NotNull
    private final RefundState refundState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RefundResponse> CREATOR = new Creator();

    public /* synthetic */ RefundResponse(int i11, RefundState refundState, BriefOrder briefOrder, m1 m1Var) {
        if (2 != (i11 & 2)) {
            c1.j(i11, 2, RefundResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.refundState = RefundState.UNKNOWN;
        } else {
            this.refundState = refundState;
        }
        this.briefOrder = briefOrder;
    }

    public static /* synthetic */ RefundResponse copy$default(RefundResponse refundResponse, RefundState refundState, BriefOrder briefOrder, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            refundState = refundResponse.refundState;
        }
        if ((i11 & 2) != 0) {
            briefOrder = refundResponse.briefOrder;
        }
        return refundResponse.copy(refundState, briefOrder);
    }

    public static final /* synthetic */ void write$Self$app(RefundResponse self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.refundState != RefundState.UNKNOWN) {
            output.i(serialDesc, 0, RefundStateSerializer.INSTANCE, self.refundState);
        }
        output.r(serialDesc, 1, BriefOrder$$serializer.INSTANCE, self.briefOrder);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RefundState getRefundState() {
        return this.refundState;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BriefOrder getBriefOrder() {
        return this.briefOrder;
    }

    @NotNull
    public final RefundResponse copy(@NotNull RefundState refundState, @Nullable BriefOrder briefOrder) {
        refundState.getClass();
        return new RefundResponse(refundState, briefOrder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundResponse)) {
            return false;
        }
        RefundResponse refundResponse = (RefundResponse) other;
        return this.refundState == refundResponse.refundState && Intrinsics.areEqual(this.briefOrder, refundResponse.briefOrder);
    }

    @Nullable
    public final BriefOrder getBriefOrder() {
        return this.briefOrder;
    }

    @NotNull
    public final RefundState getRefundState() {
        return this.refundState;
    }

    public int hashCode() {
        int iHashCode = this.refundState.hashCode() * 31;
        BriefOrder briefOrder = this.briefOrder;
        return iHashCode + (briefOrder == null ? 0 : briefOrder.hashCode());
    }

    @NotNull
    public String toString() {
        return "RefundResponse(refundState=" + this.refundState + ", briefOrder=" + this.briefOrder + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.refundState.name());
        BriefOrder briefOrder = this.briefOrder;
        if (briefOrder == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            briefOrder.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/support/response/RefundResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/support/response/RefundResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RefundResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RefundResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefundResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RefundResponse(RefundState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BriefOrder.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefundResponse[] newArray(int i11) {
            return new RefundResponse[i11];
        }
    }

    @g("brief_order")
    public static /* synthetic */ void getBriefOrder$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getRefundState$annotations() {
    }

    public RefundResponse(@NotNull RefundState refundState, @Nullable BriefOrder briefOrder) {
        refundState.getClass();
        this.refundState = refundState;
        this.briefOrder = briefOrder;
    }

    public /* synthetic */ RefundResponse(RefundState refundState, BriefOrder briefOrder, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? RefundState.UNKNOWN : refundState, briefOrder);
    }
}
