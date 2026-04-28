package com.app.tgtg.model.remote.user.requests;

import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0018¨\u00060"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/DirectWebToAppLoginRequest;", "", "", "deviceType", "directWebToAppLoginToken", "Lcom/app/tgtg/model/remote/UserId;", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/DirectWebToAppLoginRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3-8nKqa5U", "component3", "copy-N9VT0iE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/DirectWebToAppLoginRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceType", "getDeviceType$annotations", "()V", "getDirectWebToAppLoginToken", "getDirectWebToAppLoginToken$annotations", "getUserId-8nKqa5U", "getUserId-8nKqa5U$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DirectWebToAppLoginRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String deviceType;

    @NotNull
    private final String directWebToAppLoginToken;

    @NotNull
    private final String userId;

    private /* synthetic */ DirectWebToAppLoginRequest(int i11, String str, String str2, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, DirectWebToAppLoginRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deviceType = str;
        this.directWebToAppLoginToken = str2;
        this.userId = str3;
    }

    /* JADX INFO: renamed from: copy-N9VT0iE$default, reason: not valid java name */
    public static /* synthetic */ DirectWebToAppLoginRequest m509copyN9VT0iE$default(DirectWebToAppLoginRequest directWebToAppLoginRequest, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = directWebToAppLoginRequest.deviceType;
        }
        if ((i11 & 2) != 0) {
            str2 = directWebToAppLoginRequest.directWebToAppLoginToken;
        }
        if ((i11 & 4) != 0) {
            str3 = directWebToAppLoginRequest.userId;
        }
        return directWebToAppLoginRequest.m512copyN9VT0iE(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(DirectWebToAppLoginRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.deviceType);
        output.q(serialDesc, 1, self.directWebToAppLoginToken);
        output.i(serialDesc, 2, UserId$$serializer.INSTANCE, UserId.m286boximpl(self.userId));
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirectWebToAppLoginToken() {
        return this.directWebToAppLoginToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3-8nKqa5U, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-N9VT0iE, reason: not valid java name */
    public final DirectWebToAppLoginRequest m512copyN9VT0iE(@NotNull String deviceType, @NotNull String directWebToAppLoginToken, @NotNull String userId) {
        deviceType.getClass();
        directWebToAppLoginToken.getClass();
        userId.getClass();
        return new DirectWebToAppLoginRequest(deviceType, directWebToAppLoginToken, userId, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectWebToAppLoginRequest)) {
            return false;
        }
        DirectWebToAppLoginRequest directWebToAppLoginRequest = (DirectWebToAppLoginRequest) other;
        return Intrinsics.areEqual(this.deviceType, directWebToAppLoginRequest.deviceType) && Intrinsics.areEqual(this.directWebToAppLoginToken, directWebToAppLoginRequest.directWebToAppLoginToken) && UserId.m290equalsimpl0(this.userId, directWebToAppLoginRequest.userId);
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDirectWebToAppLoginToken() {
        return this.directWebToAppLoginToken;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserId-8nKqa5U, reason: not valid java name */
    public final String m513getUserId8nKqa5U() {
        return this.userId;
    }

    public int hashCode() {
        return UserId.m291hashCodeimpl(this.userId) + l1.b(this.deviceType.hashCode() * 31, 31, this.directWebToAppLoginToken);
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        String str2 = this.directWebToAppLoginToken;
        return k.p(f.t("DirectWebToAppLoginRequest(deviceType=", str, ", directWebToAppLoginToken=", str2, ", userId="), UserId.m292toStringimpl(this.userId), ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/DirectWebToAppLoginRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/DirectWebToAppLoginRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DirectWebToAppLoginRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("device_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @g("direct_web_to_app_login_token")
    public static /* synthetic */ void getDirectWebToAppLoginToken$annotations() {
    }

    @g("user_id")
    /* JADX INFO: renamed from: getUserId-8nKqa5U$annotations, reason: not valid java name */
    public static /* synthetic */ void m510getUserId8nKqa5U$annotations() {
    }

    private DirectWebToAppLoginRequest(String str, String str2, String str3) {
        a0.C(str, str2, str3);
        this.deviceType = str;
        this.directWebToAppLoginToken = str2;
        this.userId = str3;
    }

    public /* synthetic */ DirectWebToAppLoginRequest(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    public /* synthetic */ DirectWebToAppLoginRequest(int i11, String str, String str2, String str3, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, m1Var);
    }
}
