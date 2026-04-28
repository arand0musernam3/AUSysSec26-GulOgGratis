package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010%JR\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\b<\u00107\u001a\u0004\b;\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\bA\u00107\u001a\u0004\b@\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010%¨\u0006F"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/ItemTag;", "id", "", "shortText", "longText", "Lcom/app/tgtg/model/remote/item/TagVariant;", "variant", "descriptionHeading", "description", "<init>", "(Lcom/app/tgtg/model/remote/item/ItemTag;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/TagVariant;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/ItemTag;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/TagVariant;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/ItemTagInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/item/ItemTag;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/app/tgtg/model/remote/item/TagVariant;", "component5", "component6", "copy", "(Lcom/app/tgtg/model/remote/item/ItemTag;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/TagVariant;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/item/ItemTag;", "getId", "getId$annotations", "()V", "Ljava/lang/String;", "getShortText", "getShortText$annotations", "getLongText", "getLongText$annotations", "Lcom/app/tgtg/model/remote/item/TagVariant;", "getVariant", "getVariant$annotations", "getDescriptionHeading", "getDescriptionHeading$annotations", "getDescription", "getDescription$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemTagInfo implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String description;

    @Nullable
    private final String descriptionHeading;

    @NotNull
    private final ItemTag id;

    @Nullable
    private final String longText;

    @NotNull
    private final String shortText;

    @NotNull
    private final TagVariant variant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ItemTagInfo> CREATOR = new Creator();

    public /* synthetic */ ItemTagInfo(int i11, ItemTag itemTag, String str, String str2, TagVariant tagVariant, String str3, String str4, m1 m1Var) {
        if (2 != (i11 & 2)) {
            c1.j(i11, 2, ItemTagInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = (i11 & 1) == 0 ? ItemTag.UNKNOWN : itemTag;
        this.shortText = str;
        if ((i11 & 4) == 0) {
            this.longText = null;
        } else {
            this.longText = str2;
        }
        if ((i11 & 8) == 0) {
            this.variant = TagVariant.UNKNOWN;
        } else {
            this.variant = tagVariant;
        }
        if ((i11 & 16) == 0) {
            this.descriptionHeading = null;
        } else {
            this.descriptionHeading = str3;
        }
        if ((i11 & 32) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
    }

    public static /* synthetic */ ItemTagInfo copy$default(ItemTagInfo itemTagInfo, ItemTag itemTag, String str, String str2, TagVariant tagVariant, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemTag = itemTagInfo.id;
        }
        if ((i11 & 2) != 0) {
            str = itemTagInfo.shortText;
        }
        if ((i11 & 4) != 0) {
            str2 = itemTagInfo.longText;
        }
        if ((i11 & 8) != 0) {
            tagVariant = itemTagInfo.variant;
        }
        if ((i11 & 16) != 0) {
            str3 = itemTagInfo.descriptionHeading;
        }
        if ((i11 & 32) != 0) {
            str4 = itemTagInfo.description;
        }
        String str5 = str3;
        String str6 = str4;
        return itemTagInfo.copy(itemTag, str, str2, tagVariant, str5, str6);
    }

    public static final /* synthetic */ void write$Self$app(ItemTagInfo self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.id != ItemTag.UNKNOWN) {
            output.i(serialDesc, 0, ItemTagSerializer.INSTANCE, self.id);
        }
        output.q(serialDesc, 1, self.shortText);
        if (output.C(serialDesc) || self.longText != null) {
            output.r(serialDesc, 2, r1.f29848a, self.longText);
        }
        if (output.C(serialDesc) || self.variant != TagVariant.UNKNOWN) {
            output.i(serialDesc, 3, TagVariantSerializer.INSTANCE, self.variant);
        }
        if (output.C(serialDesc) || self.descriptionHeading != null) {
            output.r(serialDesc, 4, r1.f29848a, self.descriptionHeading);
        }
        if (!output.C(serialDesc) && self.description == null) {
            return;
        }
        output.r(serialDesc, 5, r1.f29848a, self.description);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ItemTag getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortText() {
        return this.shortText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLongText() {
        return this.longText;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TagVariant getVariant() {
        return this.variant;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionHeading() {
        return this.descriptionHeading;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final ItemTagInfo copy(@NotNull ItemTag id2, @NotNull String shortText, @Nullable String longText, @NotNull TagVariant variant, @Nullable String descriptionHeading, @Nullable String description) {
        id2.getClass();
        shortText.getClass();
        variant.getClass();
        return new ItemTagInfo(id2, shortText, longText, variant, descriptionHeading, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemTagInfo)) {
            return false;
        }
        ItemTagInfo itemTagInfo = (ItemTagInfo) other;
        return this.id == itemTagInfo.id && Intrinsics.areEqual(this.shortText, itemTagInfo.shortText) && Intrinsics.areEqual(this.longText, itemTagInfo.longText) && this.variant == itemTagInfo.variant && Intrinsics.areEqual(this.descriptionHeading, itemTagInfo.descriptionHeading) && Intrinsics.areEqual(this.description, itemTagInfo.description);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDescriptionHeading() {
        return this.descriptionHeading;
    }

    @NotNull
    public final ItemTag getId() {
        return this.id;
    }

    @Nullable
    public final String getLongText() {
        return this.longText;
    }

    @NotNull
    public final String getShortText() {
        return this.shortText;
    }

    @NotNull
    public final TagVariant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.shortText);
        String str = this.longText;
        int iHashCode = (this.variant.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.descriptionHeading;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ItemTag itemTag = this.id;
        String str = this.shortText;
        String str2 = this.longText;
        TagVariant tagVariant = this.variant;
        String str3 = this.descriptionHeading;
        String str4 = this.description;
        StringBuilder sb2 = new StringBuilder("ItemTagInfo(id=");
        sb2.append(itemTag);
        sb2.append(", shortText=");
        sb2.append(str);
        sb2.append(", longText=");
        sb2.append(str2);
        sb2.append(", variant=");
        sb2.append(tagVariant);
        sb2.append(", descriptionHeading=");
        return f.o(sb2, str3, ", description=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id.name());
        dest.writeString(this.shortText);
        dest.writeString(this.longText);
        dest.writeString(this.variant.name());
        dest.writeString(this.descriptionHeading);
        dest.writeString(this.description);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemTagInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemTagInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemTagInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemTagInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ItemTagInfo(ItemTag.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), TagVariant.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemTagInfo[] newArray(int i11) {
            return new ItemTagInfo[i11];
        }
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("description_heading")
    public static /* synthetic */ void getDescriptionHeading$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("long_text")
    public static /* synthetic */ void getLongText$annotations() {
    }

    @g("short_text")
    public static /* synthetic */ void getShortText$annotations() {
    }

    @g("variant")
    public static /* synthetic */ void getVariant$annotations() {
    }

    public ItemTagInfo(@NotNull ItemTag itemTag, @NotNull String str, @Nullable String str2, @NotNull TagVariant tagVariant, @Nullable String str3, @Nullable String str4) {
        itemTag.getClass();
        str.getClass();
        tagVariant.getClass();
        this.id = itemTag;
        this.shortText = str;
        this.longText = str2;
        this.variant = tagVariant;
        this.descriptionHeading = str3;
        this.description = str4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ItemTagInfo(com.app.tgtg.model.remote.item.ItemTag r2, java.lang.String r3, java.lang.String r4, com.app.tgtg.model.remote.item.TagVariant r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.app.tgtg.model.remote.item.ItemTag r2 = com.app.tgtg.model.remote.item.ItemTag.UNKNOWN
        L6:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto Lc
            r4 = r0
        Lc:
            r9 = r8 & 8
            if (r9 == 0) goto L12
            com.app.tgtg.model.remote.item.TagVariant r5 = com.app.tgtg.model.remote.item.TagVariant.UNKNOWN
        L12:
            r9 = r8 & 16
            if (r9 == 0) goto L17
            r6 = r0
        L17:
            r8 = r8 & 32
            if (r8 == 0) goto L23
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2a
        L23:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2a:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.ItemTagInfo.<init>(com.app.tgtg.model.remote.item.ItemTag, java.lang.String, java.lang.String, com.app.tgtg.model.remote.item.TagVariant, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
