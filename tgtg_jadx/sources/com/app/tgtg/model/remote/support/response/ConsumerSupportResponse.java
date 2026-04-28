package com.app.tgtg.model.remote.support.response;

import android.os.Parcel;
import android.os.Parcelable;
import e0.f;
import i90.g;
import i90.h;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.k1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tr.e;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JF\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u0010J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010-\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u00101R0\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00104\u0012\u0004\b8\u00103\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u00107R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010.\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u00101R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010.\u0012\u0004\b>\u00103\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u00101¨\u0006A"}, d2 = {"Lcom/app/tgtg/model/remote/support/response/ConsumerSupportResponse;", "Landroid/os/Parcelable;", "", "refundingUuid", "", "supportedRefundingTypes", "supportRequestId", "supportRequestState", "<init>", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()[Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/support/response/ConsumerSupportResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/support/response/ConsumerSupportResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getRefundingUuid", "setRefundingUuid", "(Ljava/lang/String;)V", "getRefundingUuid$annotations", "()V", "[Ljava/lang/String;", "getSupportedRefundingTypes", "setSupportedRefundingTypes", "([Ljava/lang/String;)V", "getSupportedRefundingTypes$annotations", "getSupportRequestId", "setSupportRequestId", "getSupportRequestId$annotations", "getSupportRequestState", "setSupportRequestState", "getSupportRequestState$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ConsumerSupportResponse implements Parcelable {

    @Nullable
    private String refundingUuid;

    @Nullable
    private String supportRequestId;

    @Nullable
    private String supportRequestState;

    @Nullable
    private String[] supportedRefundingTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ConsumerSupportResponse> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new e(3)), null, null};

    public /* synthetic */ ConsumerSupportResponse(int i11, String str, String[] strArr, String str2, String str3, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.refundingUuid = null;
        } else {
            this.refundingUuid = str;
        }
        if ((i11 & 2) == 0) {
            this.supportedRefundingTypes = null;
        } else {
            this.supportedRefundingTypes = strArr;
        }
        if ((i11 & 4) == 0) {
            this.supportRequestId = null;
        } else {
            this.supportRequestId = str2;
        }
        if ((i11 & 8) == 0) {
            this.supportRequestState = null;
        } else {
            this.supportRequestState = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new k1(Reflection.getOrCreateKotlinClass(String.class), r1.f29848a);
    }

    public static /* synthetic */ ConsumerSupportResponse copy$default(ConsumerSupportResponse consumerSupportResponse, String str, String[] strArr, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = consumerSupportResponse.refundingUuid;
        }
        if ((i11 & 2) != 0) {
            strArr = consumerSupportResponse.supportedRefundingTypes;
        }
        if ((i11 & 4) != 0) {
            str2 = consumerSupportResponse.supportRequestId;
        }
        if ((i11 & 8) != 0) {
            str3 = consumerSupportResponse.supportRequestState;
        }
        return consumerSupportResponse.copy(str, strArr, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(ConsumerSupportResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.refundingUuid != null) {
            output.r(serialDesc, 0, r1.f29848a, self.refundingUuid);
        }
        if (output.C(serialDesc) || self.supportedRefundingTypes != null) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.supportedRefundingTypes);
        }
        if (output.C(serialDesc) || self.supportRequestId != null) {
            output.r(serialDesc, 2, r1.f29848a, self.supportRequestId);
        }
        if (!output.C(serialDesc) && self.supportRequestState == null) {
            return;
        }
        output.r(serialDesc, 3, r1.f29848a, self.supportRequestState);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRefundingUuid() {
        return this.refundingUuid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getSupportedRefundingTypes() {
        return this.supportedRefundingTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSupportRequestId() {
        return this.supportRequestId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSupportRequestState() {
        return this.supportRequestState;
    }

    @NotNull
    public final ConsumerSupportResponse copy(@Nullable String refundingUuid, @Nullable String[] supportedRefundingTypes, @Nullable String supportRequestId, @Nullable String supportRequestState) {
        return new ConsumerSupportResponse(refundingUuid, supportedRefundingTypes, supportRequestId, supportRequestState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerSupportResponse)) {
            return false;
        }
        ConsumerSupportResponse consumerSupportResponse = (ConsumerSupportResponse) other;
        return Intrinsics.areEqual(this.refundingUuid, consumerSupportResponse.refundingUuid) && Intrinsics.areEqual(this.supportedRefundingTypes, consumerSupportResponse.supportedRefundingTypes) && Intrinsics.areEqual(this.supportRequestId, consumerSupportResponse.supportRequestId) && Intrinsics.areEqual(this.supportRequestState, consumerSupportResponse.supportRequestState);
    }

    @Nullable
    public final String getRefundingUuid() {
        return this.refundingUuid;
    }

    @Nullable
    public final String getSupportRequestId() {
        return this.supportRequestId;
    }

    @Nullable
    public final String getSupportRequestState() {
        return this.supportRequestState;
    }

    @Nullable
    public final String[] getSupportedRefundingTypes() {
        return this.supportedRefundingTypes;
    }

    public int hashCode() {
        String str = this.refundingUuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String[] strArr = this.supportedRefundingTypes;
        int iHashCode2 = (iHashCode + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String str2 = this.supportRequestId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportRequestState;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setRefundingUuid(@Nullable String str) {
        this.refundingUuid = str;
    }

    public final void setSupportRequestId(@Nullable String str) {
        this.supportRequestId = str;
    }

    public final void setSupportRequestState(@Nullable String str) {
        this.supportRequestState = str;
    }

    public final void setSupportedRefundingTypes(@Nullable String[] strArr) {
        this.supportedRefundingTypes = strArr;
    }

    @NotNull
    public String toString() {
        String str = this.refundingUuid;
        String string = Arrays.toString(this.supportedRefundingTypes);
        return f.o(f.t("ConsumerSupportResponse(refundingUuid=", str, ", supportedRefundingTypes=", string, ", supportRequestId="), this.supportRequestId, ", supportRequestState=", this.supportRequestState, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.refundingUuid);
        dest.writeStringArray(this.supportedRefundingTypes);
        dest.writeString(this.supportRequestId);
        dest.writeString(this.supportRequestState);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/support/response/ConsumerSupportResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/support/response/ConsumerSupportResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ConsumerSupportResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsumerSupportResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSupportResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ConsumerSupportResponse(parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSupportResponse[] newArray(int i11) {
            return new ConsumerSupportResponse[i11];
        }
    }

    @g("refunding_uuid")
    public static /* synthetic */ void getRefundingUuid$annotations() {
    }

    @g("support_request_id")
    public static /* synthetic */ void getSupportRequestId$annotations() {
    }

    @g("support_request_state")
    public static /* synthetic */ void getSupportRequestState$annotations() {
    }

    @g("supported_refunding_types")
    public static /* synthetic */ void getSupportedRefundingTypes$annotations() {
    }

    public ConsumerSupportResponse() {
        this((String) null, (String[]) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public ConsumerSupportResponse(@Nullable String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String str3) {
        this.refundingUuid = str;
        this.supportedRefundingTypes = strArr;
        this.supportRequestId = str2;
        this.supportRequestState = str3;
    }

    public /* synthetic */ ConsumerSupportResponse(String str, String[] strArr, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : strArr, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
