package com.app.tgtg.model.remote;

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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010&R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010,R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010#\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010&¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/UpdateEmailResult;", "", "", "emailUpdated", "", "msg", "statusCode", "<init>", "(ILjava/lang/String;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/String;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/UpdateEmailResult;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;I)Lcom/app/tgtg/model/remote/UpdateEmailResult;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEmailUpdated", "setEmailUpdated", "(I)V", "getEmailUpdated$annotations", "()V", "Ljava/lang/String;", "getMsg", "setMsg", "(Ljava/lang/String;)V", "getMsg$annotations", "getStatusCode", "setStatusCode", "getStatusCode$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UpdateEmailResult {
    private int emailUpdated;

    @Nullable
    private String msg;
    private int statusCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ UpdateEmailResult(int i11, int i12, String str, int i13, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.emailUpdated = 0;
        } else {
            this.emailUpdated = i12;
        }
        if ((i11 & 2) == 0) {
            this.msg = null;
        } else {
            this.msg = str;
        }
        if ((i11 & 4) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i13;
        }
    }

    public static /* synthetic */ UpdateEmailResult copy$default(UpdateEmailResult updateEmailResult, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = updateEmailResult.emailUpdated;
        }
        if ((i13 & 2) != 0) {
            str = updateEmailResult.msg;
        }
        if ((i13 & 4) != 0) {
            i12 = updateEmailResult.statusCode;
        }
        return updateEmailResult.copy(i11, str, i12);
    }

    public static final /* synthetic */ void write$Self$app(UpdateEmailResult self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.emailUpdated != 0) {
            output.m(0, self.emailUpdated, serialDesc);
        }
        if (output.C(serialDesc) || self.msg != null) {
            output.r(serialDesc, 1, r1.f29848a, self.msg);
        }
        if (!output.C(serialDesc) && self.statusCode == 0) {
            return;
        }
        output.m(2, self.statusCode, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEmailUpdated() {
        return this.emailUpdated;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final UpdateEmailResult copy(int emailUpdated, @Nullable String msg, int statusCode) {
        return new UpdateEmailResult(emailUpdated, msg, statusCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateEmailResult)) {
            return false;
        }
        UpdateEmailResult updateEmailResult = (UpdateEmailResult) other;
        return this.emailUpdated == updateEmailResult.emailUpdated && Intrinsics.areEqual(this.msg, updateEmailResult.msg) && this.statusCode == updateEmailResult.statusCode;
    }

    public final int getEmailUpdated() {
        return this.emailUpdated;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.emailUpdated) * 31;
        String str = this.msg;
        return Integer.hashCode(this.statusCode) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void setEmailUpdated(int i11) {
        this.emailUpdated = i11;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public final void setStatusCode(int i11) {
        this.statusCode = i11;
    }

    @NotNull
    public String toString() {
        int i11 = this.emailUpdated;
        String str = this.msg;
        int i12 = this.statusCode;
        StringBuilder sb2 = new StringBuilder("UpdateEmailResult(emailUpdated=");
        sb2.append(i11);
        sb2.append(", msg=");
        sb2.append(str);
        sb2.append(", statusCode=");
        return k.i(i12, ")", sb2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/UpdateEmailResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/UpdateEmailResult;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UpdateEmailResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("email_updated")
    public static /* synthetic */ void getEmailUpdated$annotations() {
    }

    @g("msg")
    public static /* synthetic */ void getMsg$annotations() {
    }

    @g("status_code")
    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public UpdateEmailResult() {
        this(0, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    public UpdateEmailResult(int i11, @Nullable String str, int i12) {
        this.emailUpdated = i11;
        this.msg = str;
        this.statusCode = i12;
    }

    public /* synthetic */ UpdateEmailResult(int i11, String str, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? 0 : i12);
    }
}
