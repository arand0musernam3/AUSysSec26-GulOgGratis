package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010 ¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemCardType;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/ItemCardTypeEnum;", "itemCardType", "", "itemCardText", "<init>", "(Lcom/app/tgtg/model/remote/item/ItemCardTypeEnum;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/ItemCardTypeEnum;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/ItemCardType;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/item/ItemCardTypeEnum;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/app/tgtg/model/remote/item/ItemCardTypeEnum;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/ItemCardType;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/item/ItemCardTypeEnum;", "getItemCardType", "getItemCardType$annotations", "()V", "Ljava/lang/String;", "getItemCardText", "getItemCardText$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemCardType implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String itemCardText;

    @NotNull
    private final ItemCardTypeEnum itemCardType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ItemCardType> CREATOR = new Creator();

    public /* synthetic */ ItemCardType(int i11, ItemCardTypeEnum itemCardTypeEnum, String str, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, ItemCardType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemCardType = itemCardTypeEnum;
        this.itemCardText = str;
    }

    public static /* synthetic */ ItemCardType copy$default(ItemCardType itemCardType, ItemCardTypeEnum itemCardTypeEnum, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemCardTypeEnum = itemCardType.itemCardType;
        }
        if ((i11 & 2) != 0) {
            str = itemCardType.itemCardText;
        }
        return itemCardType.copy(itemCardTypeEnum, str);
    }

    public static final /* synthetic */ void write$Self$app(ItemCardType self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, ItemCardTypeEnumSerializer.INSTANCE, self.itemCardType);
        output.q(serialDesc, 1, self.itemCardText);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ItemCardTypeEnum getItemCardType() {
        return this.itemCardType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemCardText() {
        return this.itemCardText;
    }

    @NotNull
    public final ItemCardType copy(@NotNull ItemCardTypeEnum itemCardType, @NotNull String itemCardText) {
        itemCardType.getClass();
        itemCardText.getClass();
        return new ItemCardType(itemCardType, itemCardText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemCardType)) {
            return false;
        }
        ItemCardType itemCardType = (ItemCardType) other;
        return this.itemCardType == itemCardType.itemCardType && Intrinsics.areEqual(this.itemCardText, itemCardType.itemCardText);
    }

    @NotNull
    public final String getItemCardText() {
        return this.itemCardText;
    }

    @NotNull
    public final ItemCardTypeEnum getItemCardType() {
        return this.itemCardType;
    }

    public int hashCode() {
        return this.itemCardText.hashCode() + (this.itemCardType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ItemCardType(itemCardType=" + this.itemCardType + ", itemCardText=" + this.itemCardText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.itemCardType.name());
        dest.writeString(this.itemCardText);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemCardType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemCardType$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemCardType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemCardType createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ItemCardType(ItemCardTypeEnum.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemCardType[] newArray(int i11) {
            return new ItemCardType[i11];
        }
    }

    @g("item_card_text")
    public static /* synthetic */ void getItemCardText$annotations() {
    }

    @g("item_card_type")
    public static /* synthetic */ void getItemCardType$annotations() {
    }

    public ItemCardType(@NotNull ItemCardTypeEnum itemCardTypeEnum, @NotNull String str) {
        itemCardTypeEnum.getClass();
        str.getClass();
        this.itemCardType = itemCardTypeEnum;
        this.itemCardText = str;
    }
}
