package com.app.tgtg.model.remote;

import b3.i;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import wt.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J'\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010-R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010*\u0012\u0004\b2\u0010/\u001a\u0004\b0\u0010\u0012\"\u0004\b1\u0010-R0\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00103\u0012\u0004\b7\u0010/\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u00106R*\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00108\u0012\u0004\b<\u0010/\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010;R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010=\u0012\u0004\bA\u0010/\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/app/tgtg/model/remote/EmailCheckResult;", "", "", "exists", "hasPassword", "", "", "thirdPartyLoginProviders", "msg", "", "statusCode", "<init>", "(ZZLjava/util/List;Ljava/lang/String;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZZLjava/util/List;Ljava/lang/String;ILm90/m1;)V", "component1", "()Z", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()I", "copy", "(ZZLjava/util/List;Ljava/lang/String;I)Lcom/app/tgtg/model/remote/EmailCheckResult;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/EmailCheckResult;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Z", "getExists", "setExists", "(Z)V", "getExists$annotations", "()V", "getHasPassword", "setHasPassword", "getHasPassword$annotations", "Ljava/util/List;", "getThirdPartyLoginProviders", "setThirdPartyLoginProviders", "(Ljava/util/List;)V", "getThirdPartyLoginProviders$annotations", "Ljava/lang/String;", "getMsg", "setMsg", "(Ljava/lang/String;)V", "getMsg$annotations", "I", "getStatusCode", "setStatusCode", "(I)V", "getStatusCode$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class EmailCheckResult {
    private boolean exists;
    private boolean hasPassword;

    @Nullable
    private String msg;
    private int statusCode;

    @Nullable
    private List<String> thirdPartyLoginProviders;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new a(2)), null, null};

    public /* synthetic */ EmailCheckResult(int i11, boolean z11, boolean z12, List list, String str, int i12, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.exists = false;
        } else {
            this.exists = z11;
        }
        if ((i11 & 2) == 0) {
            this.hasPassword = false;
        } else {
            this.hasPassword = z12;
        }
        if ((i11 & 4) == 0) {
            this.thirdPartyLoginProviders = null;
        } else {
            this.thirdPartyLoginProviders = list;
        }
        if ((i11 & 8) == 0) {
            this.msg = null;
        } else {
            this.msg = str;
        }
        if ((i11 & 16) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailCheckResult copy$default(EmailCheckResult emailCheckResult, boolean z11, boolean z12, List list, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = emailCheckResult.exists;
        }
        if ((i12 & 2) != 0) {
            z12 = emailCheckResult.hasPassword;
        }
        if ((i12 & 4) != 0) {
            list = emailCheckResult.thirdPartyLoginProviders;
        }
        if ((i12 & 8) != 0) {
            str = emailCheckResult.msg;
        }
        if ((i12 & 16) != 0) {
            i11 = emailCheckResult.statusCode;
        }
        int i13 = i11;
        List list2 = list;
        return emailCheckResult.copy(z11, z12, list2, str, i13);
    }

    public static final /* synthetic */ void write$Self$app(EmailCheckResult self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.exists) {
            output.p(serialDesc, 0, self.exists);
        }
        if (output.C(serialDesc) || self.hasPassword) {
            output.p(serialDesc, 1, self.hasPassword);
        }
        if (output.C(serialDesc) || self.thirdPartyLoginProviders != null) {
            output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.thirdPartyLoginProviders);
        }
        if (output.C(serialDesc) || self.msg != null) {
            output.r(serialDesc, 3, r1.f29848a, self.msg);
        }
        if (!output.C(serialDesc) && self.statusCode == 0) {
            return;
        }
        output.m(4, self.statusCode, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasPassword() {
        return this.hasPassword;
    }

    @Nullable
    public final List<String> component3() {
        return this.thirdPartyLoginProviders;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final EmailCheckResult copy(boolean exists, boolean hasPassword, @Nullable List<String> thirdPartyLoginProviders, @Nullable String msg, int statusCode) {
        return new EmailCheckResult(exists, hasPassword, thirdPartyLoginProviders, msg, statusCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailCheckResult)) {
            return false;
        }
        EmailCheckResult emailCheckResult = (EmailCheckResult) other;
        return this.exists == emailCheckResult.exists && this.hasPassword == emailCheckResult.hasPassword && Intrinsics.areEqual(this.thirdPartyLoginProviders, emailCheckResult.thirdPartyLoginProviders) && Intrinsics.areEqual(this.msg, emailCheckResult.msg) && this.statusCode == emailCheckResult.statusCode;
    }

    public final boolean getExists() {
        return this.exists;
    }

    public final boolean getHasPassword() {
        return this.hasPassword;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final List<String> getThirdPartyLoginProviders() {
        return this.thirdPartyLoginProviders;
    }

    public int hashCode() {
        int iE = k.e(Boolean.hashCode(this.exists) * 31, 31, this.hasPassword);
        List<String> list = this.thirdPartyLoginProviders;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.msg;
        return Integer.hashCode(this.statusCode) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void setExists(boolean z11) {
        this.exists = z11;
    }

    public final void setHasPassword(boolean z11) {
        this.hasPassword = z11;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public final void setStatusCode(int i11) {
        this.statusCode = i11;
    }

    public final void setThirdPartyLoginProviders(@Nullable List<String> list) {
        this.thirdPartyLoginProviders = list;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.exists;
        boolean z12 = this.hasPassword;
        List<String> list = this.thirdPartyLoginProviders;
        String str = this.msg;
        int i11 = this.statusCode;
        StringBuilder sbP = i.p("EmailCheckResult(exists=", z11, ", hasPassword=", z12, ", thirdPartyLoginProviders=");
        sbP.append(list);
        sbP.append(", msg=");
        sbP.append(str);
        sbP.append(", statusCode=");
        return k.i(i11, ")", sbP);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/EmailCheckResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/EmailCheckResult;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EmailCheckResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("exists")
    public static /* synthetic */ void getExists$annotations() {
    }

    @g("has_password")
    public static /* synthetic */ void getHasPassword$annotations() {
    }

    @g("msg")
    public static /* synthetic */ void getMsg$annotations() {
    }

    @g("status_code")
    public static /* synthetic */ void getStatusCode$annotations() {
    }

    @g("third_party_login_providers")
    public static /* synthetic */ void getThirdPartyLoginProviders$annotations() {
    }

    public EmailCheckResult() {
        this(false, false, (List) null, (String) null, 0, 31, (DefaultConstructorMarker) null);
    }

    public EmailCheckResult(boolean z11, boolean z12, @Nullable List<String> list, @Nullable String str, int i11) {
        this.exists = z11;
        this.hasPassword = z12;
        this.thirdPartyLoginProviders = list;
        this.msg = str;
        this.statusCode = i11;
    }

    public /* synthetic */ EmailCheckResult(boolean z11, boolean z12, List list, String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? 0 : i11);
    }
}
