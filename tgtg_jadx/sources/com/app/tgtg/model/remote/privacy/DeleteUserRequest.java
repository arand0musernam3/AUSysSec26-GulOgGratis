package com.app.tgtg.model.remote.privacy;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010!\u0012\u0004\b)\u0010&\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010$¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/privacy/DeleteUserRequest;", "", "", "advertisingId", "firebaseInstanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/privacy/DeleteUserRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/privacy/DeleteUserRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "getAdvertisingId$annotations", "()V", "getFirebaseInstanceId", "setFirebaseInstanceId", "getFirebaseInstanceId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeleteUserRequest {

    @Nullable
    private String advertisingId;

    @Nullable
    private String firebaseInstanceId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DeleteUserRequest(int i11, String str, String str2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, DeleteUserRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.advertisingId = str;
        this.firebaseInstanceId = str2;
    }

    public static /* synthetic */ DeleteUserRequest copy$default(DeleteUserRequest deleteUserRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deleteUserRequest.advertisingId;
        }
        if ((i11 & 2) != 0) {
            str2 = deleteUserRequest.firebaseInstanceId;
        }
        return deleteUserRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(DeleteUserRequest self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.advertisingId);
        output.r(serialDesc, 1, r1Var, self.firebaseInstanceId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirebaseInstanceId() {
        return this.firebaseInstanceId;
    }

    @NotNull
    public final DeleteUserRequest copy(@Nullable String advertisingId, @Nullable String firebaseInstanceId) {
        return new DeleteUserRequest(advertisingId, firebaseInstanceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteUserRequest)) {
            return false;
        }
        DeleteUserRequest deleteUserRequest = (DeleteUserRequest) other;
        return Intrinsics.areEqual(this.advertisingId, deleteUserRequest.advertisingId) && Intrinsics.areEqual(this.firebaseInstanceId, deleteUserRequest.firebaseInstanceId);
    }

    @Nullable
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @Nullable
    public final String getFirebaseInstanceId() {
        return this.firebaseInstanceId;
    }

    public int hashCode() {
        String str = this.advertisingId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firebaseInstanceId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAdvertisingId(@Nullable String str) {
        this.advertisingId = str;
    }

    public final void setFirebaseInstanceId(@Nullable String str) {
        this.firebaseInstanceId = str;
    }

    @NotNull
    public String toString() {
        return a.d("DeleteUserRequest(advertisingId=", this.advertisingId, ", firebaseInstanceId=", this.firebaseInstanceId, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/privacy/DeleteUserRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/privacy/DeleteUserRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DeleteUserRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("android_advertising_id")
    public static /* synthetic */ void getAdvertisingId$annotations() {
    }

    @g("firebase_instance_id")
    public static /* synthetic */ void getFirebaseInstanceId$annotations() {
    }

    public DeleteUserRequest(@Nullable String str, @Nullable String str2) {
        this.advertisingId = str;
        this.firebaseInstanceId = str2;
    }
}
