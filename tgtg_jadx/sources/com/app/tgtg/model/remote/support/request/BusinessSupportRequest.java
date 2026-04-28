package com.app.tgtg.model.remote.support.request;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.b;
import wr.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010%\u0012\u0004\b-\u0010*\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010(R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010.\u0012\u0004\b2\u0010*\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/support/request/BusinessSupportRequest;", "", "", InAppMessageBase.MESSAGE, "subject", "Lwr/b;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lwr/b;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lwr/b;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/support/request/BusinessSupportRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lwr/b;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lwr/b;)Lcom/app/tgtg/model/remote/support/request/BusinessSupportRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "setMessage", "(Ljava/lang/String;)V", "getMessage$annotations", "()V", "getSubject", "setSubject", "getSubject$annotations", "Lwr/b;", "getReason", "setReason", "(Lwr/b;)V", "getReason$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BusinessSupportRequest {

    @Nullable
    private String message;

    @Nullable
    private b reason;

    @Nullable
    private String subject;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ BusinessSupportRequest(int i11, String str, String str2, b bVar, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i11 & 2) == 0) {
            this.subject = null;
        } else {
            this.subject = str2;
        }
        if ((i11 & 4) == 0) {
            this.reason = null;
        } else {
            this.reason = bVar;
        }
    }

    public static /* synthetic */ BusinessSupportRequest copy$default(BusinessSupportRequest businessSupportRequest, String str, String str2, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = businessSupportRequest.message;
        }
        if ((i11 & 2) != 0) {
            str2 = businessSupportRequest.subject;
        }
        if ((i11 & 4) != 0) {
            bVar = businessSupportRequest.reason;
        }
        return businessSupportRequest.copy(str, str2, bVar);
    }

    public static final /* synthetic */ void write$Self$app(BusinessSupportRequest self, l90.b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.message != null) {
            output.r(serialDesc, 0, r1.f29848a, self.message);
        }
        if (output.C(serialDesc) || self.subject != null) {
            output.r(serialDesc, 1, r1.f29848a, self.subject);
        }
        if (!output.C(serialDesc) && self.reason == null) {
            return;
        }
        output.r(serialDesc, 2, c.f43521a, self.reason);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final b getReason() {
        return this.reason;
    }

    @NotNull
    public final BusinessSupportRequest copy(@Nullable String message, @Nullable String subject, @Nullable b reason) {
        return new BusinessSupportRequest(message, subject, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusinessSupportRequest)) {
            return false;
        }
        BusinessSupportRequest businessSupportRequest = (BusinessSupportRequest) other;
        return Intrinsics.areEqual(this.message, businessSupportRequest.message) && Intrinsics.areEqual(this.subject, businessSupportRequest.subject) && this.reason == businessSupportRequest.reason;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final b getReason() {
        return this.reason;
    }

    @Nullable
    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subject;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.reason;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setReason(@Nullable b bVar) {
        this.reason = bVar;
    }

    public final void setSubject(@Nullable String str) {
        this.subject = str;
    }

    @NotNull
    public String toString() {
        String str = this.message;
        String str2 = this.subject;
        b bVar = this.reason;
        StringBuilder sbT = f.t("BusinessSupportRequest(message=", str, ", subject=", str2, ", reason=");
        sbT.append(bVar);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/support/request/BusinessSupportRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/support/request/BusinessSupportRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BusinessSupportRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(InAppMessageBase.MESSAGE)
    public static /* synthetic */ void getMessage$annotations() {
    }

    @g("reason")
    public static /* synthetic */ void getReason$annotations() {
    }

    @g("subject")
    public static /* synthetic */ void getSubject$annotations() {
    }

    public BusinessSupportRequest() {
        this((String) null, (String) null, (b) null, 7, (DefaultConstructorMarker) null);
    }

    public BusinessSupportRequest(@Nullable String str, @Nullable String str2, @Nullable b bVar) {
        this.message = str;
        this.subject = str2;
        this.reason = bVar;
    }

    public /* synthetic */ BusinessSupportRequest(String str, String str2, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bVar);
    }
}
