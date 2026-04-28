package com.app.tgtg.model.remote.profile.response;

import com.appsflyer.AdRevenueScheme;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;", "", "", AdRevenueScheme.COUNTRY, "", "userCount", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountry", "getCountry$annotations", "()V", "Ljava/lang/Integer;", "getUserCount", "setUserCount", "(Ljava/lang/Integer;)V", "getUserCount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class StoreSignupCardDetails {

    @NotNull
    private final String country;

    @Nullable
    private Integer userCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ StoreSignupCardDetails(int i11, String str, Integer num, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, StoreSignupCardDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.country = str;
        if ((i11 & 2) == 0) {
            this.userCount = 0;
        } else {
            this.userCount = num;
        }
    }

    public static /* synthetic */ StoreSignupCardDetails copy$default(StoreSignupCardDetails storeSignupCardDetails, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storeSignupCardDetails.country;
        }
        if ((i11 & 2) != 0) {
            num = storeSignupCardDetails.userCount;
        }
        return storeSignupCardDetails.copy(str, num);
    }

    public static final /* synthetic */ void write$Self$app(StoreSignupCardDetails self, b output, SerialDescriptor serialDesc) {
        Integer num;
        output.q(serialDesc, 0, self.country);
        if (output.C(serialDesc) || (num = self.userCount) == null || num.intValue() != 0) {
            output.r(serialDesc, 1, l0.f29821a, self.userCount);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getUserCount() {
        return this.userCount;
    }

    @NotNull
    public final StoreSignupCardDetails copy(@NotNull String country, @Nullable Integer userCount) {
        country.getClass();
        return new StoreSignupCardDetails(country, userCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreSignupCardDetails)) {
            return false;
        }
        StoreSignupCardDetails storeSignupCardDetails = (StoreSignupCardDetails) other;
        return Intrinsics.areEqual(this.country, storeSignupCardDetails.country) && Intrinsics.areEqual(this.userCount, storeSignupCardDetails.userCount);
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Integer getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        Integer num = this.userCount;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setUserCount(@Nullable Integer num) {
        this.userCount = num;
    }

    @NotNull
    public String toString() {
        return "StoreSignupCardDetails(country=" + this.country + ", userCount=" + this.userCount + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/response/StoreSignupCardDetails;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StoreSignupCardDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(AdRevenueScheme.COUNTRY)
    public static /* synthetic */ void getCountry$annotations() {
    }

    @g("user_count")
    public static /* synthetic */ void getUserCount$annotations() {
    }

    public StoreSignupCardDetails(@NotNull String str, @Nullable Integer num) {
        str.getClass();
        this.country = str;
        this.userCount = num;
    }

    public /* synthetic */ StoreSignupCardDetails(String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : num);
    }
}
