package com.app.tgtg.model.remote.privacy;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001a¨\u0006%"}, d2 = {"Lcom/app/tgtg/model/remote/privacy/ExportUserRequest;", "", "", "email", "advertisingId", "firebaseInstanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/privacy/ExportUserRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getEmail$annotations", "()V", "getAdvertisingId", "setAdvertisingId", "getAdvertisingId$annotations", "getFirebaseInstanceId", "setFirebaseInstanceId", "getFirebaseInstanceId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExportUserRequest {

    @Nullable
    private String advertisingId;

    @Nullable
    private String email;

    @Nullable
    private String firebaseInstanceId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ExportUserRequest(int i11, String str, String str2, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, ExportUserRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.email = str;
        this.advertisingId = str2;
        this.firebaseInstanceId = str3;
    }

    public static final /* synthetic */ void write$Self$app(ExportUserRequest self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.email);
        output.r(serialDesc, 1, r1Var, self.advertisingId);
        output.r(serialDesc, 2, r1Var, self.firebaseInstanceId);
    }

    @Nullable
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getFirebaseInstanceId() {
        return this.firebaseInstanceId;
    }

    public final void setAdvertisingId(@Nullable String str) {
        this.advertisingId = str;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setFirebaseInstanceId(@Nullable String str) {
        this.firebaseInstanceId = str;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/privacy/ExportUserRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/privacy/ExportUserRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ExportUserRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("android_advertising_id")
    public static /* synthetic */ void getAdvertisingId$annotations() {
    }

    @g("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @g("firebase_instance_id")
    public static /* synthetic */ void getFirebaseInstanceId$annotations() {
    }

    public ExportUserRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.email = str;
        this.advertisingId = str2;
        this.firebaseInstanceId = str3;
    }
}
