package com.app.tgtg.model.remote.support.response;

import com.app.tgtg.model.remote.support.RefundType;
import com.app.tgtg.model.remote.support.RefundTypeSerializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010&R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/app/tgtg/model/remote/support/response/ConsumerRefundChoiceRequest;", "", "", "refundingUuid", "Lcom/app/tgtg/model/remote/support/RefundType;", "refundingType", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/support/RefundType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/support/RefundType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/support/response/ConsumerRefundChoiceRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/support/RefundType;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/support/RefundType;)Lcom/app/tgtg/model/remote/support/response/ConsumerRefundChoiceRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRefundingUuid", "setRefundingUuid", "(Ljava/lang/String;)V", "getRefundingUuid$annotations", "()V", "Lcom/app/tgtg/model/remote/support/RefundType;", "getRefundingType", "setRefundingType", "(Lcom/app/tgtg/model/remote/support/RefundType;)V", "getRefundingType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ConsumerRefundChoiceRequest {

    @Nullable
    private RefundType refundingType;

    @Nullable
    private String refundingUuid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ConsumerRefundChoiceRequest(int i11, String str, RefundType refundType, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.refundingUuid = null;
        } else {
            this.refundingUuid = str;
        }
        if ((i11 & 2) == 0) {
            this.refundingType = null;
        } else {
            this.refundingType = refundType;
        }
    }

    public static /* synthetic */ ConsumerRefundChoiceRequest copy$default(ConsumerRefundChoiceRequest consumerRefundChoiceRequest, String str, RefundType refundType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = consumerRefundChoiceRequest.refundingUuid;
        }
        if ((i11 & 2) != 0) {
            refundType = consumerRefundChoiceRequest.refundingType;
        }
        return consumerRefundChoiceRequest.copy(str, refundType);
    }

    public static final /* synthetic */ void write$Self$app(ConsumerRefundChoiceRequest self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.refundingUuid != null) {
            output.r(serialDesc, 0, r1.f29848a, self.refundingUuid);
        }
        if (!output.C(serialDesc) && self.refundingType == null) {
            return;
        }
        output.r(serialDesc, 1, RefundTypeSerializer.INSTANCE, self.refundingType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRefundingUuid() {
        return this.refundingUuid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RefundType getRefundingType() {
        return this.refundingType;
    }

    @NotNull
    public final ConsumerRefundChoiceRequest copy(@Nullable String refundingUuid, @Nullable RefundType refundingType) {
        return new ConsumerRefundChoiceRequest(refundingUuid, refundingType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerRefundChoiceRequest)) {
            return false;
        }
        ConsumerRefundChoiceRequest consumerRefundChoiceRequest = (ConsumerRefundChoiceRequest) other;
        return Intrinsics.areEqual(this.refundingUuid, consumerRefundChoiceRequest.refundingUuid) && this.refundingType == consumerRefundChoiceRequest.refundingType;
    }

    @Nullable
    public final RefundType getRefundingType() {
        return this.refundingType;
    }

    @Nullable
    public final String getRefundingUuid() {
        return this.refundingUuid;
    }

    public int hashCode() {
        String str = this.refundingUuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RefundType refundType = this.refundingType;
        return iHashCode + (refundType != null ? refundType.hashCode() : 0);
    }

    public final void setRefundingType(@Nullable RefundType refundType) {
        this.refundingType = refundType;
    }

    public final void setRefundingUuid(@Nullable String str) {
        this.refundingUuid = str;
    }

    @NotNull
    public String toString() {
        return "ConsumerRefundChoiceRequest(refundingUuid=" + this.refundingUuid + ", refundingType=" + this.refundingType + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/support/response/ConsumerRefundChoiceRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/support/response/ConsumerRefundChoiceRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ConsumerRefundChoiceRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("refunding_type")
    public static /* synthetic */ void getRefundingType$annotations() {
    }

    @g("refunding_uuid")
    public static /* synthetic */ void getRefundingUuid$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerRefundChoiceRequest() {
        this((String) null, (RefundType) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ConsumerRefundChoiceRequest(@Nullable String str, @Nullable RefundType refundType) {
        this.refundingUuid = str;
        this.refundingType = refundType;
    }

    public /* synthetic */ ConsumerRefundChoiceRequest(String str, RefundType refundType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : refundType);
    }
}
