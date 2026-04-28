package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002CDBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0010J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J'\u0010.\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b,\u0010-R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010/\u0012\u0004\b3\u00104\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u00102R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00105\u0012\u0004\b9\u00104\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u00108R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00105\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00108R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010/\u0012\u0004\b?\u00104\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u00102R*\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00105\u0012\u0004\bB\u00104\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u00108¨\u0006E"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemBadge;", "Landroid/os/Parcelable;", "", "badgeType", "", "monthCount", "percentage", "ratingGroup", "userCount", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/item/response/ItemBadge;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/ItemBadge;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getBadgeType", "setBadgeType", "(Ljava/lang/String;)V", "getBadgeType$annotations", "()V", "Ljava/lang/Integer;", "getMonthCount", "setMonthCount", "(Ljava/lang/Integer;)V", "getMonthCount$annotations", "getPercentage", "setPercentage", "getPercentage$annotations", "getRatingGroup", "setRatingGroup", "getRatingGroup$annotations", "getUserCount", "setUserCount", "getUserCount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemBadge implements Parcelable {

    @NotNull
    public static final String OVERALL_RATING_TRUST_SCORE = "OVERALL_RATING_TRUST_SCORE";

    @NotNull
    public static final String RATING_GROUP_LIKED = "LIKED";

    @NotNull
    public static final String RATING_GROUP_LOVED = "LOVED";

    @NotNull
    public static final String RATING_GROUP_NONE = "NONE";

    @Nullable
    private String badgeType;

    @Nullable
    private Integer monthCount;

    @Nullable
    private Integer percentage;

    @Nullable
    private String ratingGroup;

    @Nullable
    private Integer userCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ItemBadge> CREATOR = new Creator();

    public /* synthetic */ ItemBadge(int i11, String str, Integer num, Integer num2, String str2, Integer num3, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.badgeType = null;
        } else {
            this.badgeType = str;
        }
        if ((i11 & 2) == 0) {
            this.monthCount = 0;
        } else {
            this.monthCount = num;
        }
        if ((i11 & 4) == 0) {
            this.percentage = null;
        } else {
            this.percentage = num2;
        }
        if ((i11 & 8) == 0) {
            this.ratingGroup = null;
        } else {
            this.ratingGroup = str2;
        }
        if ((i11 & 16) == 0) {
            this.userCount = 0;
        } else {
            this.userCount = num3;
        }
    }

    public static /* synthetic */ ItemBadge copy$default(ItemBadge itemBadge, String str, Integer num, Integer num2, String str2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = itemBadge.badgeType;
        }
        if ((i11 & 2) != 0) {
            num = itemBadge.monthCount;
        }
        if ((i11 & 4) != 0) {
            num2 = itemBadge.percentage;
        }
        if ((i11 & 8) != 0) {
            str2 = itemBadge.ratingGroup;
        }
        if ((i11 & 16) != 0) {
            num3 = itemBadge.userCount;
        }
        Integer num4 = num3;
        Integer num5 = num2;
        return itemBadge.copy(str, num, num5, str2, num4);
    }

    public static final /* synthetic */ void write$Self$app(ItemBadge self, b output, SerialDescriptor serialDesc) {
        Integer num;
        Integer num2;
        if (output.C(serialDesc) || self.badgeType != null) {
            output.r(serialDesc, 0, r1.f29848a, self.badgeType);
        }
        if (output.C(serialDesc) || (num2 = self.monthCount) == null || num2.intValue() != 0) {
            output.r(serialDesc, 1, l0.f29821a, self.monthCount);
        }
        if (output.C(serialDesc) || self.percentage != null) {
            output.r(serialDesc, 2, l0.f29821a, self.percentage);
        }
        if (output.C(serialDesc) || self.ratingGroup != null) {
            output.r(serialDesc, 3, r1.f29848a, self.ratingGroup);
        }
        if (output.C(serialDesc) || (num = self.userCount) == null || num.intValue() != 0) {
            output.r(serialDesc, 4, l0.f29821a, self.userCount);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBadgeType() {
        return this.badgeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMonthCount() {
        return this.monthCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPercentage() {
        return this.percentage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRatingGroup() {
        return this.ratingGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getUserCount() {
        return this.userCount;
    }

    @NotNull
    public final ItemBadge copy(@Nullable String badgeType, @Nullable Integer monthCount, @Nullable Integer percentage, @Nullable String ratingGroup, @Nullable Integer userCount) {
        return new ItemBadge(badgeType, monthCount, percentage, ratingGroup, userCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemBadge)) {
            return false;
        }
        ItemBadge itemBadge = (ItemBadge) other;
        return Intrinsics.areEqual(this.badgeType, itemBadge.badgeType) && Intrinsics.areEqual(this.monthCount, itemBadge.monthCount) && Intrinsics.areEqual(this.percentage, itemBadge.percentage) && Intrinsics.areEqual(this.ratingGroup, itemBadge.ratingGroup) && Intrinsics.areEqual(this.userCount, itemBadge.userCount);
    }

    @Nullable
    public final String getBadgeType() {
        return this.badgeType;
    }

    @Nullable
    public final Integer getMonthCount() {
        return this.monthCount;
    }

    @Nullable
    public final Integer getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final String getRatingGroup() {
        return this.ratingGroup;
    }

    @Nullable
    public final Integer getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        String str = this.badgeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.monthCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.percentage;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.ratingGroup;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.userCount;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setBadgeType(@Nullable String str) {
        this.badgeType = str;
    }

    public final void setMonthCount(@Nullable Integer num) {
        this.monthCount = num;
    }

    public final void setPercentage(@Nullable Integer num) {
        this.percentage = num;
    }

    public final void setRatingGroup(@Nullable String str) {
        this.ratingGroup = str;
    }

    public final void setUserCount(@Nullable Integer num) {
        this.userCount = num;
    }

    @NotNull
    public String toString() {
        String str = this.badgeType;
        Integer num = this.monthCount;
        Integer num2 = this.percentage;
        String str2 = this.ratingGroup;
        Integer num3 = this.userCount;
        StringBuilder sb2 = new StringBuilder("ItemBadge(badgeType=");
        sb2.append(str);
        sb2.append(", monthCount=");
        sb2.append(num);
        sb2.append(", percentage=");
        sb2.append(num2);
        sb2.append(", ratingGroup=");
        sb2.append(str2);
        sb2.append(", userCount=");
        return i.m(sb2, num3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.badgeType);
        Integer num = this.monthCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        Integer num2 = this.percentage;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num2);
        }
        dest.writeString(this.ratingGroup);
        Integer num3 = this.userCount;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemBadge$Companion;", "", "<init>", "()V", ItemBadge.OVERALL_RATING_TRUST_SCORE, "", "RATING_GROUP_LOVED", "RATING_GROUP_LIKED", "RATING_GROUP_NONE", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ItemBadge;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemBadge$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemBadge createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ItemBadge(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemBadge[] newArray(int i11) {
            return new ItemBadge[i11];
        }
    }

    @g("badge_type")
    public static /* synthetic */ void getBadgeType$annotations() {
    }

    @g("month_count")
    public static /* synthetic */ void getMonthCount$annotations() {
    }

    @g("percentage")
    public static /* synthetic */ void getPercentage$annotations() {
    }

    @g("rating_group")
    public static /* synthetic */ void getRatingGroup$annotations() {
    }

    @g("user_count")
    public static /* synthetic */ void getUserCount$annotations() {
    }

    public ItemBadge(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable Integer num3) {
        this.badgeType = str;
        this.monthCount = num;
        this.percentage = num2;
        this.ratingGroup = str2;
        this.userCount = num3;
    }

    public ItemBadge() {
        this((String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ItemBadge(String str, Integer num, Integer num2, String str2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0 : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? 0 : num3);
    }
}
