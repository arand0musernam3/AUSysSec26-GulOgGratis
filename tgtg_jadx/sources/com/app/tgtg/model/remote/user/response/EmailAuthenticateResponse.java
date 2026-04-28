package com.app.tgtg.model.remote.user.response;

import e0.f;
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
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010%\u0012\u0004\b-\u0010*\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010(R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010.\u0012\u0004\b2\u0010*\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateResponse;", "", "", "partnerUrl", "pollingId", "Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;)Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartnerUrl", "setPartnerUrl", "(Ljava/lang/String;)V", "getPartnerUrl$annotations", "()V", "getPollingId", "setPollingId", "getPollingId$annotations", "Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;", "getState", "setState", "(Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;)V", "getState$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class EmailAuthenticateResponse {

    @Nullable
    private String partnerUrl;

    @Nullable
    private String pollingId;

    @NotNull
    private EmailAuthenticateState state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EmailAuthenticateResponse(int i11, String str, String str2, EmailAuthenticateState emailAuthenticateState, m1 m1Var) {
        if (4 != (i11 & 4)) {
            c1.j(i11, 4, EmailAuthenticateResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.partnerUrl = null;
        } else {
            this.partnerUrl = str;
        }
        if ((i11 & 2) == 0) {
            this.pollingId = null;
        } else {
            this.pollingId = str2;
        }
        this.state = emailAuthenticateState;
    }

    public static /* synthetic */ EmailAuthenticateResponse copy$default(EmailAuthenticateResponse emailAuthenticateResponse, String str, String str2, EmailAuthenticateState emailAuthenticateState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emailAuthenticateResponse.partnerUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = emailAuthenticateResponse.pollingId;
        }
        if ((i11 & 4) != 0) {
            emailAuthenticateState = emailAuthenticateResponse.state;
        }
        return emailAuthenticateResponse.copy(str, str2, emailAuthenticateState);
    }

    public static final /* synthetic */ void write$Self$app(EmailAuthenticateResponse self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.partnerUrl != null) {
            output.r(serialDesc, 0, r1.f29848a, self.partnerUrl);
        }
        if (output.C(serialDesc) || self.pollingId != null) {
            output.r(serialDesc, 1, r1.f29848a, self.pollingId);
        }
        output.i(serialDesc, 2, EmailAuthenticateStateSerializer.INSTANCE, self.state);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPartnerUrl() {
        return this.partnerUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPollingId() {
        return this.pollingId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EmailAuthenticateState getState() {
        return this.state;
    }

    @NotNull
    public final EmailAuthenticateResponse copy(@Nullable String partnerUrl, @Nullable String pollingId, @NotNull EmailAuthenticateState state) {
        state.getClass();
        return new EmailAuthenticateResponse(partnerUrl, pollingId, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailAuthenticateResponse)) {
            return false;
        }
        EmailAuthenticateResponse emailAuthenticateResponse = (EmailAuthenticateResponse) other;
        return Intrinsics.areEqual(this.partnerUrl, emailAuthenticateResponse.partnerUrl) && Intrinsics.areEqual(this.pollingId, emailAuthenticateResponse.pollingId) && this.state == emailAuthenticateResponse.state;
    }

    @Nullable
    public final String getPartnerUrl() {
        return this.partnerUrl;
    }

    @Nullable
    public final String getPollingId() {
        return this.pollingId;
    }

    @NotNull
    public final EmailAuthenticateState getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.partnerUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pollingId;
        return this.state.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void setPartnerUrl(@Nullable String str) {
        this.partnerUrl = str;
    }

    public final void setPollingId(@Nullable String str) {
        this.pollingId = str;
    }

    public final void setState(@NotNull EmailAuthenticateState emailAuthenticateState) {
        emailAuthenticateState.getClass();
        this.state = emailAuthenticateState;
    }

    @NotNull
    public String toString() {
        String str = this.partnerUrl;
        String str2 = this.pollingId;
        EmailAuthenticateState emailAuthenticateState = this.state;
        StringBuilder sbT = f.t("EmailAuthenticateResponse(partnerUrl=", str, ", pollingId=", str2, ", state=");
        sbT.append(emailAuthenticateState);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EmailAuthenticateResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("partner_url")
    public static /* synthetic */ void getPartnerUrl$annotations() {
    }

    @g("polling_id")
    public static /* synthetic */ void getPollingId$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    public EmailAuthenticateResponse(@Nullable String str, @Nullable String str2, @NotNull EmailAuthenticateState emailAuthenticateState) {
        emailAuthenticateState.getClass();
        this.partnerUrl = str;
        this.pollingId = str2;
        this.state = emailAuthenticateState;
    }

    public /* synthetic */ EmailAuthenticateResponse(String str, String str2, EmailAuthenticateState emailAuthenticateState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, emailAuthenticateState);
    }
}
