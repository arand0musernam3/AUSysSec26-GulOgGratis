package com.app.tgtg.model.remote.brief;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!JL\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010!¨\u0006?"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/StoreId;", "storeId", "", "storeDisplayName", "countryIsoCode", "storeLogoUrl", "storeTimezone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-7QsYvu8", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy-utmfMBY", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStoreId-7QsYvu8", "getStoreId-7QsYvu8$annotations", "()V", "getStoreDisplayName", "getStoreDisplayName$annotations", "getCountryIsoCode", "getCountryIsoCode$annotations", "getStoreLogoUrl", "getStoreLogoUrl$annotations", "getStoreTimezone", "getStoreTimezone$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BriefStoreInfo implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String countryIsoCode;

    @Nullable
    private final String storeDisplayName;

    @Nullable
    private final String storeId;

    @Nullable
    private final String storeLogoUrl;

    @Nullable
    private final String storeTimezone;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<BriefStoreInfo> CREATOR = new Creator();

    private /* synthetic */ BriefStoreInfo(int i11, String str, String str2, String str3, String str4, String str5, m1 m1Var) {
        if (28 != (i11 & 28)) {
            c1.j(i11, 28, BriefStoreInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.storeId = null;
        } else {
            this.storeId = str;
        }
        if ((i11 & 2) == 0) {
            this.storeDisplayName = null;
        } else {
            this.storeDisplayName = str2;
        }
        this.countryIsoCode = str3;
        this.storeLogoUrl = str4;
        this.storeTimezone = str5;
    }

    /* JADX INFO: renamed from: copy-utmfMBY$default, reason: not valid java name */
    public static /* synthetic */ BriefStoreInfo m324copyutmfMBY$default(BriefStoreInfo briefStoreInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = briefStoreInfo.storeId;
        }
        if ((i11 & 2) != 0) {
            str2 = briefStoreInfo.storeDisplayName;
        }
        if ((i11 & 4) != 0) {
            str3 = briefStoreInfo.countryIsoCode;
        }
        if ((i11 & 8) != 0) {
            str4 = briefStoreInfo.storeLogoUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = briefStoreInfo.storeTimezone;
        }
        String str6 = str5;
        String str7 = str3;
        return briefStoreInfo.m327copyutmfMBY(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$app(BriefStoreInfo self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.storeId != null) {
            StoreId$$serializer storeId$$serializer = StoreId$$serializer.INSTANCE;
            String str = self.storeId;
            output.r(serialDesc, 0, storeId$$serializer, str != null ? StoreId.m269boximpl(str) : null);
        }
        if (output.C(serialDesc) || self.storeDisplayName != null) {
            output.r(serialDesc, 1, r1.f29848a, self.storeDisplayName);
        }
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 2, r1Var, self.countryIsoCode);
        output.r(serialDesc, 3, r1Var, self.storeLogoUrl);
        output.r(serialDesc, 4, r1Var, self.storeTimezone);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-7QsYvu8, reason: not valid java name and from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStoreDisplayName() {
        return this.storeDisplayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStoreTimezone() {
        return this.storeTimezone;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-utmfMBY, reason: not valid java name */
    public final BriefStoreInfo m327copyutmfMBY(@Nullable String storeId, @Nullable String storeDisplayName, @Nullable String countryIsoCode, @Nullable String storeLogoUrl, @Nullable String storeTimezone) {
        return new BriefStoreInfo(storeId, storeDisplayName, countryIsoCode, storeLogoUrl, storeTimezone, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.brief.BriefStoreInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.brief.BriefStoreInfo r5 = (com.app.tgtg.model.remote.brief.BriefStoreInfo) r5
            java.lang.String r1 = r4.storeId
            java.lang.String r3 = r5.storeId
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.StoreId.m273equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.storeDisplayName
            java.lang.String r3 = r5.storeDisplayName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.countryIsoCode
            java.lang.String r3 = r5.countryIsoCode
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.storeLogoUrl
            java.lang.String r3 = r5.storeLogoUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.storeTimezone
            java.lang.String r5 = r5.storeTimezone
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L4e
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.brief.BriefStoreInfo.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    @Nullable
    public final String getStoreDisplayName() {
        return this.storeDisplayName;
    }

    @Nullable
    /* JADX INFO: renamed from: getStoreId-7QsYvu8, reason: not valid java name */
    public final String m328getStoreId7QsYvu8() {
        return this.storeId;
    }

    @Nullable
    public final String getStoreLogoUrl() {
        return this.storeLogoUrl;
    }

    @Nullable
    public final String getStoreTimezone() {
        return this.storeTimezone;
    }

    public int hashCode() {
        String str = this.storeId;
        int iM274hashCodeimpl = (str == null ? 0 : StoreId.m274hashCodeimpl(str)) * 31;
        String str2 = this.storeDisplayName;
        int iHashCode = (iM274hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryIsoCode;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeLogoUrl;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.storeTimezone;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.storeId;
        String strM275toStringimpl = str == null ? Address.ADDRESS_NULL_PLACEHOLDER : StoreId.m275toStringimpl(str);
        String str2 = this.storeDisplayName;
        String str3 = this.countryIsoCode;
        String str4 = this.storeLogoUrl;
        String str5 = this.storeTimezone;
        StringBuilder sbT = f.t("BriefStoreInfo(storeId=", strM275toStringimpl, ", storeDisplayName=", str2, ", countryIsoCode=");
        s.A(sbT, str3, ", storeLogoUrl=", str4, ", storeTimezone=");
        return k.p(sbT, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        String str = this.storeId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            StoreId.m276writeToParcelimpl(str, dest, flags);
        }
        dest.writeString(this.storeDisplayName);
        dest.writeString(this.countryIsoCode);
        dest.writeString(this.storeLogoUrl);
        dest.writeString(this.storeTimezone);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefStoreInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BriefStoreInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BriefStoreInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefStoreInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            StoreId storeIdCreateFromParcel = parcel.readInt() == 0 ? null : StoreId.CREATOR.createFromParcel(parcel);
            return new BriefStoreInfo(storeIdCreateFromParcel != null ? storeIdCreateFromParcel.m277unboximpl() : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefStoreInfo[] newArray(int i11) {
            return new BriefStoreInfo[i11];
        }
    }

    @g("country_iso_code")
    public static /* synthetic */ void getCountryIsoCode$annotations() {
    }

    @g("store_display_name")
    public static /* synthetic */ void getStoreDisplayName$annotations() {
    }

    @g("store_id")
    /* JADX INFO: renamed from: getStoreId-7QsYvu8$annotations, reason: not valid java name */
    public static /* synthetic */ void m325getStoreId7QsYvu8$annotations() {
    }

    @g("logo_url")
    public static /* synthetic */ void getStoreLogoUrl$annotations() {
    }

    @g("storeTimeZone")
    public static /* synthetic */ void getStoreTimezone$annotations() {
    }

    public /* synthetic */ BriefStoreInfo(String str, String str2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5);
    }

    public /* synthetic */ BriefStoreInfo(int i11, String str, String str2, String str3, String str4, String str5, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, m1Var);
    }

    private BriefStoreInfo(String str, String str2, String str3, String str4, String str5) {
        this.storeId = str;
        this.storeDisplayName = str2;
        this.countryIsoCode = str3;
        this.storeLogoUrl = str4;
        this.storeTimezone = str5;
    }

    public /* synthetic */ BriefStoreInfo(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3, str4, str5, null);
    }
}
