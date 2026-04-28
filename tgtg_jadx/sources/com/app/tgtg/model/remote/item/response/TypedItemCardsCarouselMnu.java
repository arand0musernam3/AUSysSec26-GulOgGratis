package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemTypeSerializer;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002CBB=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010(JP\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\bA\u00107\u001a\u0004\b@\u0010(¨\u0006D"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/TypedItemCardsCarouselMnu;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "items", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "", MessageBundle.TITLE_ENTRY, "subtitle", "carouselType", "<init>", "(Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/TypedItemCardsCarouselMnu;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/response/TypedItemCardsCarouselMnu;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getItems$annotations", "()V", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "getElementType$annotations", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getCarouselType", "getCarouselType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("TYPED_ITEM_CARDS_CAROUSEL")
public final /* data */ class TypedItemCardsCarouselMnu extends ElementMnuV2 implements Parcelable {

    @Nullable
    private final String carouselType;

    @Nullable
    private final AdapterItemType elementType;

    @NotNull
    private final List<BaseItemMnuV2> items;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TypedItemCardsCarouselMnu> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(10)), null, null, null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TypedItemCardsCarouselMnu(int i11, List list, AdapterItemType adapterItemType, String str, String str2, String str3, m1 m1Var) {
        super(i11, m1Var);
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, TypedItemCardsCarouselMnu$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.items = list;
        this.elementType = adapterItemType;
        this.title = str;
        this.subtitle = str2;
        this.carouselType = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BaseItemMnuV2$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypedItemCardsCarouselMnu copy$default(TypedItemCardsCarouselMnu typedItemCardsCarouselMnu, List list, AdapterItemType adapterItemType, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = typedItemCardsCarouselMnu.items;
        }
        if ((i11 & 2) != 0) {
            adapterItemType = typedItemCardsCarouselMnu.elementType;
        }
        if ((i11 & 4) != 0) {
            str = typedItemCardsCarouselMnu.title;
        }
        if ((i11 & 8) != 0) {
            str2 = typedItemCardsCarouselMnu.subtitle;
        }
        if ((i11 & 16) != 0) {
            str3 = typedItemCardsCarouselMnu.carouselType;
        }
        String str4 = str3;
        String str5 = str;
        return typedItemCardsCarouselMnu.copy(list, adapterItemType, str5, str2, str4);
    }

    public static final /* synthetic */ void write$Self$app(TypedItemCardsCarouselMnu self, b output, SerialDescriptor serialDesc) {
        ElementMnuV2.write$Self(self, output, serialDesc);
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.items);
        output.r(serialDesc, 1, AdapterItemTypeSerializer.INSTANCE, self.getElementType());
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 2, r1Var, self.title);
        output.r(serialDesc, 3, r1Var, self.subtitle);
        output.r(serialDesc, 4, r1Var, self.carouselType);
    }

    @NotNull
    public final List<BaseItemMnuV2> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCarouselType() {
        return this.carouselType;
    }

    @NotNull
    public final TypedItemCardsCarouselMnu copy(@NotNull List<BaseItemMnuV2> items, @Nullable AdapterItemType elementType, @Nullable String title, @Nullable String subtitle, @Nullable String carouselType) {
        items.getClass();
        return new TypedItemCardsCarouselMnu(items, elementType, title, subtitle, carouselType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypedItemCardsCarouselMnu)) {
            return false;
        }
        TypedItemCardsCarouselMnu typedItemCardsCarouselMnu = (TypedItemCardsCarouselMnu) other;
        return Intrinsics.areEqual(this.items, typedItemCardsCarouselMnu.items) && this.elementType == typedItemCardsCarouselMnu.elementType && Intrinsics.areEqual(this.title, typedItemCardsCarouselMnu.title) && Intrinsics.areEqual(this.subtitle, typedItemCardsCarouselMnu.subtitle) && Intrinsics.areEqual(this.carouselType, typedItemCardsCarouselMnu.carouselType);
    }

    @Nullable
    public final String getCarouselType() {
        return this.carouselType;
    }

    @Override // com.app.tgtg.model.remote.item.response.ElementMnuV2
    @Nullable
    public AdapterItemType getElementType() {
        return this.elementType;
    }

    @NotNull
    public final List<BaseItemMnuV2> getItems() {
        return this.items;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        AdapterItemType adapterItemType = this.elementType;
        int iHashCode2 = (iHashCode + (adapterItemType == null ? 0 : adapterItemType.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carouselType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BaseItemMnuV2> list = this.items;
        AdapterItemType adapterItemType = this.elementType;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.carouselType;
        StringBuilder sb2 = new StringBuilder("TypedItemCardsCarouselMnu(items=");
        sb2.append(list);
        sb2.append(", elementType=");
        sb2.append(adapterItemType);
        sb2.append(", title=");
        s.A(sb2, str, ", subtitle=", str2, ", carouselType=");
        return k.p(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.items, dest);
        while (itR.hasNext()) {
            ((BaseItemMnuV2) itR.next()).writeToParcel(dest, flags);
        }
        AdapterItemType adapterItemType = this.elementType;
        if (adapterItemType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adapterItemType.name());
        }
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.carouselType);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/TypedItemCardsCarouselMnu$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/TypedItemCardsCarouselMnu;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TypedItemCardsCarouselMnu$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TypedItemCardsCarouselMnu> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TypedItemCardsCarouselMnu createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(BaseItemMnuV2.CREATOR, parcel, arrayList, iC, 1);
            }
            return new TypedItemCardsCarouselMnu(arrayList, parcel.readInt() == 0 ? null : AdapterItemType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TypedItemCardsCarouselMnu[] newArray(int i11) {
            return new TypedItemCardsCarouselMnu[i11];
        }
    }

    @g("carousel_type")
    public static /* synthetic */ void getCarouselType$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getElementType$annotations() {
    }

    @g("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedItemCardsCarouselMnu(@NotNull List<BaseItemMnuV2> list, @Nullable AdapterItemType adapterItemType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        super(null);
        list.getClass();
        this.items = list;
        this.elementType = adapterItemType;
        this.title = str;
        this.subtitle = str2;
        this.carouselType = str3;
    }
}
