package com.app.tgtg.model.remote.voucher.request;

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
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010$R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010!\u0012\u0004\b)\u0010&\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010$¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/request/AddVoucherRequest;", "", "", "activationCode", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/request/AddVoucherRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/voucher/request/AddVoucherRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivationCode", "setActivationCode", "(Ljava/lang/String;)V", "getActivationCode$annotations", "()V", "getDeviceId", "setDeviceId", "getDeviceId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AddVoucherRequest {

    @Nullable
    private String activationCode;

    @NotNull
    private String deviceId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AddVoucherRequest(int i11, String str, String str2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, AddVoucherRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.activationCode = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ AddVoucherRequest copy$default(AddVoucherRequest addVoucherRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addVoucherRequest.activationCode;
        }
        if ((i11 & 2) != 0) {
            str2 = addVoucherRequest.deviceId;
        }
        return addVoucherRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(AddVoucherRequest self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, r1.f29848a, self.activationCode);
        output.q(serialDesc, 1, self.deviceId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivationCode() {
        return this.activationCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final AddVoucherRequest copy(@Nullable String activationCode, @NotNull String deviceId) {
        deviceId.getClass();
        return new AddVoucherRequest(activationCode, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddVoucherRequest)) {
            return false;
        }
        AddVoucherRequest addVoucherRequest = (AddVoucherRequest) other;
        return Intrinsics.areEqual(this.activationCode, addVoucherRequest.activationCode) && Intrinsics.areEqual(this.deviceId, addVoucherRequest.deviceId);
    }

    @Nullable
    public final String getActivationCode() {
        return this.activationCode;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        String str = this.activationCode;
        return this.deviceId.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setActivationCode(@Nullable String str) {
        this.activationCode = str;
    }

    public final void setDeviceId(@NotNull String str) {
        str.getClass();
        this.deviceId = str;
    }

    @NotNull
    public String toString() {
        return a.d("AddVoucherRequest(activationCode=", this.activationCode, ", deviceId=", this.deviceId, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/request/AddVoucherRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/request/AddVoucherRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddVoucherRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("activation_code")
    public static /* synthetic */ void getActivationCode$annotations() {
    }

    @g("device_id")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    public AddVoucherRequest(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        this.activationCode = str;
        this.deviceId = str2;
    }
}
