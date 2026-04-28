package com.app.tgtg.model.remote.user.response.charity;

import b3.i;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jv\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\u0017R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u001cR \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bC\u00108\u001a\u0004\bB\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\bE\u00108\u001a\u0004\bD\u0010\u0017R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010\u0017R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bI\u00108\u001a\u0004\bH\u0010\u0017R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010J\u0012\u0004\bL\u00108\u001a\u0004\bK\u0010\"¨\u0006O"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "", "", "id", "name", "logo", "address", "", "latitude", "longitude", "startTime", "endTime", "storeBranch", "Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;", "collectorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()D", "component6", "component7", "component8", "component9", "component10", "()Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;)Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "getLogo", "getLogo$annotations", "getAddress", "getAddress$annotations", "D", "getLatitude", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "getStartTime", "getStartTime$annotations", "getEndTime", "getEndTime$annotations", "getStoreBranch", "getStoreBranch$annotations", "Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;", "getCollectorType", "getCollectorType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CharityDayScheduleStore {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String address;

    @NotNull
    private final CharityPlanCollectorType collectorType;

    @NotNull
    private final String endTime;

    @NotNull
    private final String id;
    private final double latitude;

    @Nullable
    private final String logo;
    private final double longitude;

    @NotNull
    private final String name;

    @NotNull
    private final String startTime;

    @NotNull
    private final String storeBranch;

    public /* synthetic */ CharityDayScheduleStore(int i11, String str, String str2, String str3, String str4, double d3, double d11, String str5, String str6, String str7, CharityPlanCollectorType charityPlanCollectorType, m1 m1Var) {
        if (1023 != (i11 & 1023)) {
            c1.j(i11, 1023, CharityDayScheduleStore$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.logo = str3;
        this.address = str4;
        this.latitude = d3;
        this.longitude = d11;
        this.startTime = str5;
        this.endTime = str6;
        this.storeBranch = str7;
        this.collectorType = charityPlanCollectorType;
    }

    public static /* synthetic */ CharityDayScheduleStore copy$default(CharityDayScheduleStore charityDayScheduleStore, String str, String str2, String str3, String str4, double d3, double d11, String str5, String str6, String str7, CharityPlanCollectorType charityPlanCollectorType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = charityDayScheduleStore.id;
        }
        if ((i11 & 2) != 0) {
            str2 = charityDayScheduleStore.name;
        }
        if ((i11 & 4) != 0) {
            str3 = charityDayScheduleStore.logo;
        }
        if ((i11 & 8) != 0) {
            str4 = charityDayScheduleStore.address;
        }
        if ((i11 & 16) != 0) {
            d3 = charityDayScheduleStore.latitude;
        }
        if ((i11 & 32) != 0) {
            d11 = charityDayScheduleStore.longitude;
        }
        if ((i11 & 64) != 0) {
            str5 = charityDayScheduleStore.startTime;
        }
        if ((i11 & 128) != 0) {
            str6 = charityDayScheduleStore.endTime;
        }
        if ((i11 & 256) != 0) {
            str7 = charityDayScheduleStore.storeBranch;
        }
        if ((i11 & 512) != 0) {
            charityPlanCollectorType = charityDayScheduleStore.collectorType;
        }
        double d12 = d11;
        double d13 = d3;
        String str8 = str3;
        String str9 = str4;
        return charityDayScheduleStore.copy(str, str2, str8, str9, d13, d12, str5, str6, str7, charityPlanCollectorType);
    }

    public static final /* synthetic */ void write$Self$app(CharityDayScheduleStore self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.name);
        output.r(serialDesc, 2, r1.f29848a, self.logo);
        output.q(serialDesc, 3, self.address);
        output.z(serialDesc, 4, self.latitude);
        output.z(serialDesc, 5, self.longitude);
        output.q(serialDesc, 6, self.startTime);
        output.q(serialDesc, 7, self.endTime);
        output.q(serialDesc, 8, self.storeBranch);
        output.i(serialDesc, 9, CharityPlanCollectorTypeSerializer.INSTANCE, self.collectorType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CharityPlanCollectorType getCollectorType() {
        return this.collectorType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStoreBranch() {
        return this.storeBranch;
    }

    @NotNull
    public final CharityDayScheduleStore copy(@NotNull String id2, @NotNull String name, @Nullable String logo, @NotNull String address, double latitude, double longitude, @NotNull String startTime, @NotNull String endTime, @NotNull String storeBranch, @NotNull CharityPlanCollectorType collectorType) {
        i.B(id2, name, address, startTime, endTime);
        storeBranch.getClass();
        collectorType.getClass();
        return new CharityDayScheduleStore(id2, name, logo, address, latitude, longitude, startTime, endTime, storeBranch, collectorType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharityDayScheduleStore)) {
            return false;
        }
        CharityDayScheduleStore charityDayScheduleStore = (CharityDayScheduleStore) other;
        return Intrinsics.areEqual(this.id, charityDayScheduleStore.id) && Intrinsics.areEqual(this.name, charityDayScheduleStore.name) && Intrinsics.areEqual(this.logo, charityDayScheduleStore.logo) && Intrinsics.areEqual(this.address, charityDayScheduleStore.address) && Double.compare(this.latitude, charityDayScheduleStore.latitude) == 0 && Double.compare(this.longitude, charityDayScheduleStore.longitude) == 0 && Intrinsics.areEqual(this.startTime, charityDayScheduleStore.startTime) && Intrinsics.areEqual(this.endTime, charityDayScheduleStore.endTime) && Intrinsics.areEqual(this.storeBranch, charityDayScheduleStore.storeBranch) && this.collectorType == charityDayScheduleStore.collectorType;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final CharityPlanCollectorType getCollectorType() {
        return this.collectorType;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getStoreBranch() {
        return this.storeBranch;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.name);
        String str = this.logo;
        return this.collectorType.hashCode() + l1.b(l1.b(l1.b(s.b(this.longitude, s.b(this.latitude, l1.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.address), 31), 31), 31, this.startTime), 31, this.endTime), 31, this.storeBranch);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.logo;
        String str4 = this.address;
        double d3 = this.latitude;
        double d11 = this.longitude;
        String str5 = this.startTime;
        String str6 = this.endTime;
        String str7 = this.storeBranch;
        CharityPlanCollectorType charityPlanCollectorType = this.collectorType;
        StringBuilder sbT = f.t("CharityDayScheduleStore(id=", str, ", name=", str2, ", logo=");
        s.A(sbT, str3, ", address=", str4, ", latitude=");
        sbT.append(d3);
        sbT.append(", longitude=");
        sbT.append(d11);
        sbT.append(", startTime=");
        s.A(sbT, str5, ", endTime=", str6, ", storeBranch=");
        sbT.append(str7);
        sbT.append(", collectorType=");
        sbT.append(charityPlanCollectorType);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CharityDayScheduleStore$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("address")
    public static /* synthetic */ void getAddress$annotations() {
    }

    @g("collector_type")
    public static /* synthetic */ void getCollectorType$annotations() {
    }

    @g("pickup_window_end")
    public static /* synthetic */ void getEndTime$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("latitude")
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @g("logo_url")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @g("longitude")
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("pickup_window_start")
    public static /* synthetic */ void getStartTime$annotations() {
    }

    @g("store_branch")
    public static /* synthetic */ void getStoreBranch$annotations() {
    }

    public CharityDayScheduleStore(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, double d3, double d11, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull CharityPlanCollectorType charityPlanCollectorType) {
        i.B(str, str2, str4, str5, str6);
        str7.getClass();
        charityPlanCollectorType.getClass();
        this.id = str;
        this.name = str2;
        this.logo = str3;
        this.address = str4;
        this.latitude = d3;
        this.longitude = d11;
        this.startTime = str5;
        this.endTime = str6;
        this.storeBranch = str7;
        this.collectorType = charityPlanCollectorType;
    }
}
