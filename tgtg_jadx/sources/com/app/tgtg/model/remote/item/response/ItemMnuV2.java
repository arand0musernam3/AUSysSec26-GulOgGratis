package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemTypeSerializer;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000254B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J&\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemMnuV2;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "item", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "<init>", "(Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/ItemMnuV2;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "component2", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "copy", "(Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;)Lcom/app/tgtg/model/remote/item/response/ItemMnuV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "getItem", "getItem$annotations", "()V", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "getElementType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("ITEM_V2")
public final /* data */ class ItemMnuV2 extends ElementMnuV2 implements Parcelable {

    @Nullable
    private final AdapterItemType elementType;

    @NotNull
    private final BaseItemMnuV2 item;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ItemMnuV2> CREATOR = new Creator();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ItemMnuV2(int i11, BaseItemMnuV2 baseItemMnuV2, AdapterItemType adapterItemType, m1 m1Var) {
        super(i11, m1Var);
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, ItemMnuV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.item = baseItemMnuV2;
        this.elementType = adapterItemType;
    }

    public static /* synthetic */ ItemMnuV2 copy$default(ItemMnuV2 itemMnuV2, BaseItemMnuV2 baseItemMnuV2, AdapterItemType adapterItemType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            baseItemMnuV2 = itemMnuV2.item;
        }
        if ((i11 & 2) != 0) {
            adapterItemType = itemMnuV2.elementType;
        }
        return itemMnuV2.copy(baseItemMnuV2, adapterItemType);
    }

    public static final /* synthetic */ void write$Self$app(ItemMnuV2 self, b output, SerialDescriptor serialDesc) {
        ElementMnuV2.write$Self(self, output, serialDesc);
        output.i(serialDesc, 0, BaseItemMnuV2$$serializer.INSTANCE, self.item);
        output.r(serialDesc, 1, AdapterItemTypeSerializer.INSTANCE, self.getElementType());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BaseItemMnuV2 getItem() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AdapterItemType getElementType() {
        return this.elementType;
    }

    @NotNull
    public final ItemMnuV2 copy(@NotNull BaseItemMnuV2 item, @Nullable AdapterItemType elementType) {
        item.getClass();
        return new ItemMnuV2(item, elementType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemMnuV2)) {
            return false;
        }
        ItemMnuV2 itemMnuV2 = (ItemMnuV2) other;
        return Intrinsics.areEqual(this.item, itemMnuV2.item) && this.elementType == itemMnuV2.elementType;
    }

    @Override // com.app.tgtg.model.remote.item.response.ElementMnuV2
    @Nullable
    public AdapterItemType getElementType() {
        return this.elementType;
    }

    @NotNull
    public final BaseItemMnuV2 getItem() {
        return this.item;
    }

    public int hashCode() {
        int iHashCode = this.item.hashCode() * 31;
        AdapterItemType adapterItemType = this.elementType;
        return iHashCode + (adapterItemType == null ? 0 : adapterItemType.hashCode());
    }

    @NotNull
    public String toString() {
        return "ItemMnuV2(item=" + this.item + ", elementType=" + this.elementType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.item.writeToParcel(dest, flags);
        AdapterItemType adapterItemType = this.elementType;
        if (adapterItemType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adapterItemType.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ItemMnuV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ItemMnuV2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemMnuV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemMnuV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemMnuV2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ItemMnuV2(BaseItemMnuV2.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdapterItemType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemMnuV2[] newArray(int i11) {
            return new ItemMnuV2[i11];
        }
    }

    @g("type")
    public static /* synthetic */ void getElementType$annotations() {
    }

    @g("item")
    public static /* synthetic */ void getItem$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemMnuV2(@NotNull BaseItemMnuV2 baseItemMnuV2, @Nullable AdapterItemType adapterItemType) {
        super(null);
        baseItemMnuV2.getClass();
        this.item = baseItemMnuV2;
        this.elementType = adapterItemType;
    }
}
