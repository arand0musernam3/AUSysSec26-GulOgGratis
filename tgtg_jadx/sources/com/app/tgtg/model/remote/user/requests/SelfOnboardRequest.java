package com.app.tgtg.model.remote.user.requests;

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
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SelfOnboardRequest;", "", "", "countryId", "storeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/SelfOnboardRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/SelfOnboardRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "()V", "getStoreName", "getStoreName$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SelfOnboardRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String countryId;

    @NotNull
    private final String storeName;

    public /* synthetic */ SelfOnboardRequest(int i11, String str, String str2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, SelfOnboardRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.countryId = str;
        this.storeName = str2;
    }

    public static /* synthetic */ SelfOnboardRequest copy$default(SelfOnboardRequest selfOnboardRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = selfOnboardRequest.countryId;
        }
        if ((i11 & 2) != 0) {
            str2 = selfOnboardRequest.storeName;
        }
        return selfOnboardRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(SelfOnboardRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.countryId);
        output.q(serialDesc, 1, self.storeName);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    public final SelfOnboardRequest copy(@NotNull String countryId, @NotNull String storeName) {
        countryId.getClass();
        storeName.getClass();
        return new SelfOnboardRequest(countryId, storeName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfOnboardRequest)) {
            return false;
        }
        SelfOnboardRequest selfOnboardRequest = (SelfOnboardRequest) other;
        return Intrinsics.areEqual(this.countryId, selfOnboardRequest.countryId) && Intrinsics.areEqual(this.storeName, selfOnboardRequest.storeName);
    }

    @NotNull
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        return this.storeName.hashCode() + (this.countryId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("SelfOnboardRequest(countryId=", this.countryId, ", storeName=", this.storeName, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SelfOnboardRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/SelfOnboardRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SelfOnboardRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    public SelfOnboardRequest(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.countryId = str;
        this.storeName = str2;
    }
}
