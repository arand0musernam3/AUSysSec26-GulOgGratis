package com.app.tgtg.model.remote.brief;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import e0.f;
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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ4\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001f¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "", "itemName", "itemLogoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/brief/BriefItemInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-RWxzYZM", "()Ljava/lang/String;", "component1", "component2", "component3", "copy-61jw6ic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemId-RWxzYZM", "getItemId-RWxzYZM$annotations", "()V", "getItemName", "getItemName$annotations", "getItemLogoUrl", "getItemLogoUrl$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BriefItemInfo implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String itemId;

    @Nullable
    private final String itemLogoUrl;

    @Nullable
    private final String itemName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<BriefItemInfo> CREATOR = new Creator();

    private /* synthetic */ BriefItemInfo(int i11, String str, String str2, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, BriefItemInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.itemName = str2;
        this.itemLogoUrl = str3;
    }

    /* JADX INFO: renamed from: copy-61jw6ic$default, reason: not valid java name */
    public static /* synthetic */ BriefItemInfo m310copy61jw6ic$default(BriefItemInfo briefItemInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = briefItemInfo.itemId;
        }
        if ((i11 & 2) != 0) {
            str2 = briefItemInfo.itemName;
        }
        if ((i11 & 4) != 0) {
            str3 = briefItemInfo.itemLogoUrl;
        }
        return briefItemInfo.m313copy61jw6ic(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(BriefItemInfo self, b output, SerialDescriptor serialDesc) {
        ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
        String str = self.itemId;
        output.r(serialDesc, 0, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.itemName);
        output.r(serialDesc, 2, r1Var, self.itemLogoUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemLogoUrl() {
        return this.itemLogoUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-61jw6ic, reason: not valid java name */
    public final BriefItemInfo m313copy61jw6ic(@Nullable String itemId, @Nullable String itemName, @Nullable String itemLogoUrl) {
        return new BriefItemInfo(itemId, itemName, itemLogoUrl, null);
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.brief.BriefItemInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.brief.BriefItemInfo r5 = (com.app.tgtg.model.remote.brief.BriefItemInfo) r5
            java.lang.String r1 = r4.itemId
            java.lang.String r3 = r5.itemId
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
            boolean r1 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.itemName
            java.lang.String r3 = r5.itemName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.itemLogoUrl
            java.lang.String r5 = r5.itemLogoUrl
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.brief.BriefItemInfo.equals(java.lang.Object):boolean");
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m314getItemIdRWxzYZM() {
        return this.itemId;
    }

    @Nullable
    public final String getItemLogoUrl() {
        return this.itemLogoUrl;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    public int hashCode() {
        String str = this.itemId;
        int iM202hashCodeimpl = (str == null ? 0 : ItemId.m202hashCodeimpl(str)) * 31;
        String str2 = this.itemName;
        int iHashCode = (iM202hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemLogoUrl;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        return k.p(f.t("BriefItemInfo(itemId=", str == null ? Address.ADDRESS_NULL_PLACEHOLDER : ItemId.m203toStringimpl(str), ", itemName=", this.itemName, ", itemLogoUrl="), this.itemLogoUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        String str = this.itemId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ItemId.m204writeToParcelimpl(str, dest, flags);
        }
        dest.writeString(this.itemName);
        dest.writeString(this.itemLogoUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefItemInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BriefItemInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BriefItemInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefItemInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ItemId itemIdCreateFromParcel = parcel.readInt() == 0 ? null : ItemId.CREATOR.createFromParcel(parcel);
            return new BriefItemInfo(itemIdCreateFromParcel != null ? itemIdCreateFromParcel.m205unboximpl() : null, parcel.readString(), parcel.readString(), defaultConstructorMarker);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefItemInfo[] newArray(int i11) {
            return new BriefItemInfo[i11];
        }
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m311getItemIdRWxzYZM$annotations() {
    }

    @g("logo_url")
    public static /* synthetic */ void getItemLogoUrl$annotations() {
    }

    @g("item_name")
    public static /* synthetic */ void getItemName$annotations() {
    }

    public /* synthetic */ BriefItemInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    public /* synthetic */ BriefItemInfo(int i11, String str, String str2, String str3, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, m1Var);
    }

    private BriefItemInfo(String str, String str2, String str3) {
        this.itemId = str;
        this.itemName = str2;
        this.itemLogoUrl = str3;
    }
}
