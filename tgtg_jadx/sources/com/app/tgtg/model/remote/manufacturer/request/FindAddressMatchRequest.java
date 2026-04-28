package com.app.tgtg.model.remote.manufacturer.request;

import com.appsflyer.AdRevenueScheme;
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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001c¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/FindAddressMatchRequest;", "", "", "query", AdRevenueScheme.COUNTRY, "addressId", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/FindAddressMatchRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/app/tgtg/model/remote/manufacturer/request/FindAddressMatchRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuery", "getQuery$annotations", "()V", "getCountry", "getCountry$annotations", "getAddressId", "getAddressId$annotations", "I", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FindAddressMatchRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String addressId;

    @NotNull
    private final String country;
    private final int quantity;

    @NotNull
    private final String query;

    public /* synthetic */ FindAddressMatchRequest(int i11, String str, String str2, String str3, int i12, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, FindAddressMatchRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.query = str;
        this.country = str2;
        this.addressId = str3;
        this.quantity = i12;
    }

    public static /* synthetic */ FindAddressMatchRequest copy$default(FindAddressMatchRequest findAddressMatchRequest, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = findAddressMatchRequest.query;
        }
        if ((i12 & 2) != 0) {
            str2 = findAddressMatchRequest.country;
        }
        if ((i12 & 4) != 0) {
            str3 = findAddressMatchRequest.addressId;
        }
        if ((i12 & 8) != 0) {
            i11 = findAddressMatchRequest.quantity;
        }
        return findAddressMatchRequest.copy(str, str2, str3, i11);
    }

    public static final /* synthetic */ void write$Self$app(FindAddressMatchRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.query);
        output.q(serialDesc, 1, self.country);
        output.r(serialDesc, 2, r1.f29848a, self.addressId);
        output.m(3, self.quantity, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final FindAddressMatchRequest copy(@NotNull String query, @NotNull String country, @Nullable String addressId, int quantity) {
        query.getClass();
        country.getClass();
        return new FindAddressMatchRequest(query, country, addressId, quantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FindAddressMatchRequest)) {
            return false;
        }
        FindAddressMatchRequest findAddressMatchRequest = (FindAddressMatchRequest) other;
        return Intrinsics.areEqual(this.query, findAddressMatchRequest.query) && Intrinsics.areEqual(this.country, findAddressMatchRequest.country) && Intrinsics.areEqual(this.addressId, findAddressMatchRequest.addressId) && this.quantity == findAddressMatchRequest.quantity;
    }

    @Nullable
    public final String getAddressId() {
        return this.addressId;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        int iB = l1.b(this.query.hashCode() * 31, 31, this.country);
        String str = this.addressId;
        return Integer.hashCode(this.quantity) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.query;
        String str2 = this.country;
        String str3 = this.addressId;
        int i11 = this.quantity;
        StringBuilder sbT = f.t("FindAddressMatchRequest(query=", str, ", country=", str2, ", addressId=");
        sbT.append(str3);
        sbT.append(", quantity=");
        sbT.append(i11);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/FindAddressMatchRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/FindAddressMatchRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FindAddressMatchRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("address_id")
    public static /* synthetic */ void getAddressId$annotations() {
    }

    @g(AdRevenueScheme.COUNTRY)
    public static /* synthetic */ void getCountry$annotations() {
    }

    @g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @g("query")
    public static /* synthetic */ void getQuery$annotations() {
    }

    public FindAddressMatchRequest(@NotNull String str, @NotNull String str2, @Nullable String str3, int i11) {
        str.getClass();
        str2.getClass();
        this.query = str;
        this.country = str2;
        this.addressId = str3;
        this.quantity = i11;
    }
}
