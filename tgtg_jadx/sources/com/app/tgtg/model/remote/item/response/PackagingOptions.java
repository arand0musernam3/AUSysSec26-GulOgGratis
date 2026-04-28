package com.app.tgtg.model.remote.item.response;

import b3.i;
import com.app.tgtg.R;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0014"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "", "trackingName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingName", "()Ljava/lang/String;", "UNKNOWN", "CANT_BRING_ANYTHING", "BAG_ALLOWED", "MUST_BRING_BAG", "MUST_BRING_PACKAGING", "ADDITIONAL_CHARGES_MAY_APPLY", "ADDITIONAL_CHARGES_MANDATED", "getStringId", "", "getInfo", "Lcom/app/tgtg/model/remote/item/response/PackagingOptions$PackagingInfo;", "PackagingInfo", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class PackagingOptions {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ PackagingOptions[] $VALUES;

    @NotNull
    private final String trackingName;
    public static final PackagingOptions UNKNOWN = new PackagingOptions("UNKNOWN", 0) { // from class: com.app.tgtg.model.remote.item.response.PackagingOptions.UNKNOWN
        {
            String str = "Unknown";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        @NotNull
        public PackagingInfo getInfo() {
            return new PackagingInfo(false, 0, 0, 0, false, 0, 0, 0, null, 511, null);
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        public int getStringId() {
            return R.string.error_no_order;
        }
    };
    public static final PackagingOptions CANT_BRING_ANYTHING = new PackagingOptions("CANT_BRING_ANYTHING", 1) { // from class: com.app.tgtg.model.remote.item.response.PackagingOptions.CANT_BRING_ANYTHING
        {
            String str = "Store_Provides";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        @NotNull
        public PackagingInfo getInfo() {
            return new PackagingInfo(true, R.string.item_view_packaging_container_provided, 0, 0, true, R.string.item_view_packaging_bag_provided, 0, 0, null, 204, null);
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        public int getStringId() {
            return R.string.item_view_directions_packaging_cant_bring_anything;
        }
    };
    public static final PackagingOptions BAG_ALLOWED = new PackagingOptions("BAG_ALLOWED", 2) { // from class: com.app.tgtg.model.remote.item.response.PackagingOptions.BAG_ALLOWED
        {
            String str = "Bag_Allowed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        @NotNull
        public PackagingInfo getInfo() {
            return new PackagingInfo(true, R.string.item_view_packaging_container_provided, 0, 0, true, R.string.item_view_packaging_bag_provided, 0, 0, Integer.valueOf(R.string.item_view_packaging_recommend_bring_bag), 204, null);
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        public int getStringId() {
            return R.string.item_view_directions_packaging_bag_allowed;
        }
    };
    public static final PackagingOptions MUST_BRING_BAG = new PackagingOptions("MUST_BRING_BAG", 3) { // from class: com.app.tgtg.model.remote.item.response.PackagingOptions.MUST_BRING_BAG
        {
            String str = "Bag_Required";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        @NotNull
        public PackagingInfo getInfo() {
            return new PackagingInfo(true, R.string.item_view_packaging_container_provided, 0, 0, false, 0, 0, 0, Integer.valueOf(R.string.item_view_packaging_must_bring_bag), 252, null);
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        public int getStringId() {
            return R.string.item_view_directions_packaging_must_bring_bag;
        }
    };
    public static final PackagingOptions MUST_BRING_PACKAGING = new PackagingOptions("MUST_BRING_PACKAGING", 4) { // from class: com.app.tgtg.model.remote.item.response.PackagingOptions.MUST_BRING_PACKAGING
        {
            String str = "All_Required";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        @NotNull
        public PackagingInfo getInfo() {
            return new PackagingInfo(false, 0, 0, 0, false, 0, 0, 0, Integer.valueOf(R.string.item_view_packaging_must_bring_both), 255, null);
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        public int getStringId() {
            return R.string.item_view_directions_packaging_must_bring_packaging;
        }
    };
    public static final PackagingOptions ADDITIONAL_CHARGES_MAY_APPLY = new PackagingOptions("ADDITIONAL_CHARGES_MAY_APPLY", 5) { // from class: com.app.tgtg.model.remote.item.response.PackagingOptions.ADDITIONAL_CHARGES_MAY_APPLY
        {
            String str = "Bag_Fee";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        @NotNull
        public PackagingInfo getInfo() {
            return new PackagingInfo(true, R.string.item_view_packaging_container_provided, 0, 0, true, R.string.item_view_packaging_bag_provided, 0, 0, Integer.valueOf(R.string.item_view_packaging_small_fee), 204, null);
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        public int getStringId() {
            return R.string.item_view_packaging_additional_charge_description;
        }
    };
    public static final PackagingOptions ADDITIONAL_CHARGES_MANDATED = new PackagingOptions("ADDITIONAL_CHARGES_MANDATED", 6) { // from class: com.app.tgtg.model.remote.item.response.PackagingOptions.ADDITIONAL_CHARGES_MANDATED
        {
            String str = "Bag_Fee_Mandated";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        @NotNull
        public PackagingInfo getInfo() {
            return new PackagingInfo(true, R.string.item_view_packaging_container_provided, 0, 0, true, R.string.item_view_packaging_bag_provided, 0, 0, Integer.valueOf(R.string.item_view_packaging_small_fee_local_law), 204, null);
        }

        @Override // com.app.tgtg.model.remote.item.response.PackagingOptions
        public int getStringId() {
            return R.string.item_view_packaging_additional_mandated_charge_description;
        }
    };

    private static final /* synthetic */ PackagingOptions[] $values() {
        return new PackagingOptions[]{UNKNOWN, CANT_BRING_ANYTHING, BAG_ALLOWED, MUST_BRING_BAG, MUST_BRING_PACKAGING, ADDITIONAL_CHARGES_MAY_APPLY, ADDITIONAL_CHARGES_MANDATED};
    }

    static {
        PackagingOptions[] packagingOptionsArr$values = $values();
        $VALUES = packagingOptionsArr$values;
        $ENTRIES = n.w(packagingOptionsArr$values);
    }

    private PackagingOptions(String str, int i11, String str2) {
        this.trackingName = str2;
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static PackagingOptions valueOf(String str) {
        return (PackagingOptions) Enum.valueOf(PackagingOptions.class, str);
    }

    public static PackagingOptions[] values() {
        return (PackagingOptions[]) $VALUES.clone();
    }

    @NotNull
    public abstract PackagingInfo getInfo();

    public abstract int getStringId();

    @NotNull
    public final String getTrackingName() {
        return this.trackingName;
    }

    public /* synthetic */ PackagingOptions(String str, int i11, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, str2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/PackagingOptions$PackagingInfo;", "", "containerProvided", "", "containerProvidedString", "", "containerLabel", "containerIcon", "bagProvided", "bagProvidedString", "bagLabel", "bagIcon", "infoBoxText", "<init>", "(ZIIIZIIILjava/lang/Integer;)V", "getContainerProvided", "()Z", "getContainerProvidedString", "()I", "getContainerLabel", "getContainerIcon", "getBagProvided", "getBagProvidedString", "getBagLabel", "getBagIcon", "getInfoBoxText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZIIIZIIILjava/lang/Integer;)Lcom/app/tgtg/model/remote/item/response/PackagingOptions$PackagingInfo;", "equals", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackagingInfo {
        public static final int $stable = 0;
        private final int bagIcon;
        private final int bagLabel;
        private final boolean bagProvided;
        private final int bagProvidedString;
        private final int containerIcon;
        private final int containerLabel;
        private final boolean containerProvided;
        private final int containerProvidedString;

        @Nullable
        private final Integer infoBoxText;

        public /* synthetic */ PackagingInfo(boolean z11, int i11, int i12, int i13, boolean z12, int i14, int i15, int i16, Integer num, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this((i17 & 1) != 0 ? false : z11, (i17 & 2) != 0 ? R.string.item_view_packaging_container_not_provided : i11, (i17 & 4) != 0 ? R.string.item_view_packaging_container_title : i12, (i17 & 8) != 0 ? R.drawable.packaging_container : i13, (i17 & 16) != 0 ? false : z12, (i17 & 32) != 0 ? R.string.item_view_packaging_bag_not_provided : i14, (i17 & 64) != 0 ? R.string.item_view_packaging_bag_title : i15, (i17 & 128) != 0 ? R.drawable.packaging_bag : i16, (i17 & 256) != 0 ? null : num);
        }

        public static /* synthetic */ PackagingInfo copy$default(PackagingInfo packagingInfo, boolean z11, int i11, int i12, int i13, boolean z12, int i14, int i15, int i16, Integer num, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                z11 = packagingInfo.containerProvided;
            }
            if ((i17 & 2) != 0) {
                i11 = packagingInfo.containerProvidedString;
            }
            if ((i17 & 4) != 0) {
                i12 = packagingInfo.containerLabel;
            }
            if ((i17 & 8) != 0) {
                i13 = packagingInfo.containerIcon;
            }
            if ((i17 & 16) != 0) {
                z12 = packagingInfo.bagProvided;
            }
            if ((i17 & 32) != 0) {
                i14 = packagingInfo.bagProvidedString;
            }
            if ((i17 & 64) != 0) {
                i15 = packagingInfo.bagLabel;
            }
            if ((i17 & 128) != 0) {
                i16 = packagingInfo.bagIcon;
            }
            if ((i17 & 256) != 0) {
                num = packagingInfo.infoBoxText;
            }
            int i18 = i16;
            Integer num2 = num;
            int i19 = i14;
            int i21 = i15;
            boolean z13 = z12;
            int i22 = i12;
            return packagingInfo.copy(z11, i11, i22, i13, z13, i19, i21, i18, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getContainerProvided() {
            return this.containerProvided;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getContainerProvidedString() {
            return this.containerProvidedString;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getContainerLabel() {
            return this.containerLabel;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getContainerIcon() {
            return this.containerIcon;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getBagProvided() {
            return this.bagProvided;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBagProvidedString() {
            return this.bagProvidedString;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getBagLabel() {
            return this.bagLabel;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getBagIcon() {
            return this.bagIcon;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getInfoBoxText() {
            return this.infoBoxText;
        }

        @NotNull
        public final PackagingInfo copy(boolean containerProvided, int containerProvidedString, int containerLabel, int containerIcon, boolean bagProvided, int bagProvidedString, int bagLabel, int bagIcon, @Nullable Integer infoBoxText) {
            return new PackagingInfo(containerProvided, containerProvidedString, containerLabel, containerIcon, bagProvided, bagProvidedString, bagLabel, bagIcon, infoBoxText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackagingInfo)) {
                return false;
            }
            PackagingInfo packagingInfo = (PackagingInfo) other;
            return this.containerProvided == packagingInfo.containerProvided && this.containerProvidedString == packagingInfo.containerProvidedString && this.containerLabel == packagingInfo.containerLabel && this.containerIcon == packagingInfo.containerIcon && this.bagProvided == packagingInfo.bagProvided && this.bagProvidedString == packagingInfo.bagProvidedString && this.bagLabel == packagingInfo.bagLabel && this.bagIcon == packagingInfo.bagIcon && Intrinsics.areEqual(this.infoBoxText, packagingInfo.infoBoxText);
        }

        public final int getBagIcon() {
            return this.bagIcon;
        }

        public final int getBagLabel() {
            return this.bagLabel;
        }

        public final boolean getBagProvided() {
            return this.bagProvided;
        }

        public final int getBagProvidedString() {
            return this.bagProvidedString;
        }

        public final int getContainerIcon() {
            return this.containerIcon;
        }

        public final int getContainerLabel() {
            return this.containerLabel;
        }

        public final boolean getContainerProvided() {
            return this.containerProvided;
        }

        public final int getContainerProvidedString() {
            return this.containerProvidedString;
        }

        @Nullable
        public final Integer getInfoBoxText() {
            return this.infoBoxText;
        }

        public int hashCode() {
            int iB = k.b(this.bagIcon, k.b(this.bagLabel, k.b(this.bagProvidedString, k.e(k.b(this.containerIcon, k.b(this.containerLabel, k.b(this.containerProvidedString, Boolean.hashCode(this.containerProvided) * 31, 31), 31), 31), 31, this.bagProvided), 31), 31), 31);
            Integer num = this.infoBoxText;
            return iB + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            boolean z11 = this.containerProvided;
            int i11 = this.containerProvidedString;
            int i12 = this.containerLabel;
            int i13 = this.containerIcon;
            boolean z12 = this.bagProvided;
            int i14 = this.bagProvidedString;
            int i15 = this.bagLabel;
            int i16 = this.bagIcon;
            Integer num = this.infoBoxText;
            StringBuilder sb2 = new StringBuilder("PackagingInfo(containerProvided=");
            sb2.append(z11);
            sb2.append(", containerProvidedString=");
            sb2.append(i11);
            sb2.append(", containerLabel=");
            f.C(sb2, i12, ", containerIcon=", i13, ", bagProvided=");
            sb2.append(z12);
            sb2.append(", bagProvidedString=");
            sb2.append(i14);
            sb2.append(", bagLabel=");
            f.C(sb2, i15, ", bagIcon=", i16, ", infoBoxText=");
            return i.m(sb2, num, ")");
        }

        public PackagingInfo(boolean z11, int i11, int i12, int i13, boolean z12, int i14, int i15, int i16, @Nullable Integer num) {
            this.containerProvided = z11;
            this.containerProvidedString = i11;
            this.containerLabel = i12;
            this.containerIcon = i13;
            this.bagProvided = z12;
            this.bagProvidedString = i14;
            this.bagLabel = i15;
            this.bagIcon = i16;
            this.infoBoxText = num;
        }

        public PackagingInfo() {
            this(false, 0, 0, 0, false, 0, 0, 0, null, 511, null);
        }
    }
}
