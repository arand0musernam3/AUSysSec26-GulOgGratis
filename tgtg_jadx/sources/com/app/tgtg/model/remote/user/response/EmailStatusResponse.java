package com.app.tgtg.model.remote.user.response;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import or.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/EmailStatusResponse;", "", "Lor/e;", "status", "", "currentEmail", "pendingEmail", "<init>", "(Lor/e;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILor/e;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/EmailStatusResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lor/e;", "getStatus", "()Lor/e;", "getStatus$annotations", "()V", "Ljava/lang/String;", "getCurrentEmail", "()Ljava/lang/String;", "getCurrentEmail$annotations", "getPendingEmail", "getPendingEmail$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmailStatusResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String currentEmail;

    @Nullable
    private final String pendingEmail;

    @NotNull
    private final e status;

    public /* synthetic */ EmailStatusResponse(int i11, e eVar, String str, String str2, m1 m1Var) {
        this.status = (i11 & 1) == 0 ? e.UNKNOWN : eVar;
        if ((i11 & 2) == 0) {
            this.currentEmail = null;
        } else {
            this.currentEmail = str;
        }
        if ((i11 & 4) == 0) {
            this.pendingEmail = null;
        } else {
            this.pendingEmail = str2;
        }
    }

    public static final /* synthetic */ void write$Self$app(EmailStatusResponse self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.status != e.UNKNOWN) {
            output.i(serialDesc, 0, or.h.f32959a, self.status);
        }
        if (output.C(serialDesc) || self.currentEmail != null) {
            output.r(serialDesc, 1, r1.f29848a, self.currentEmail);
        }
        if (!output.C(serialDesc) && self.pendingEmail == null) {
            return;
        }
        output.r(serialDesc, 2, r1.f29848a, self.pendingEmail);
    }

    @Nullable
    public final String getCurrentEmail() {
        return this.currentEmail;
    }

    @Nullable
    public final String getPendingEmail() {
        return this.pendingEmail;
    }

    @NotNull
    public final e getStatus() {
        return this.status;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/EmailStatusResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/EmailStatusResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EmailStatusResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("current_email")
    public static /* synthetic */ void getCurrentEmail$annotations() {
    }

    @g("pending_email")
    public static /* synthetic */ void getPendingEmail$annotations() {
    }

    @g("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    public EmailStatusResponse() {
        this((e) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public EmailStatusResponse(@NotNull e eVar, @Nullable String str, @Nullable String str2) {
        eVar.getClass();
        this.status = eVar;
        this.currentEmail = str;
        this.pendingEmail = str2;
    }

    public /* synthetic */ EmailStatusResponse(e eVar, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? e.UNKNOWN : eVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
