package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemTypeSerializer;
import com.app.tgtg.model.remote.manufacturer.request.CardsType;
import com.app.tgtg.model.remote.manufacturer.request.CardsTypeSerializer;
import i90.g;
import i90.h;
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
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0002BAB3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBI\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*JD\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010*¨\u0006C"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CategoryCarouselMnuV2;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "", "Lcom/app/tgtg/model/remote/item/response/CategoryCard;", "cards", "", MessageBundle.TITLE_ENTRY, "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "Lcom/app/tgtg/model/remote/manufacturer/request/CardsType;", "cardsType", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Lcom/app/tgtg/model/remote/manufacturer/request/CardsType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Lcom/app/tgtg/model/remote/manufacturer/request/CardsType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/CategoryCarouselMnuV2;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "component4", "()Lcom/app/tgtg/model/remote/manufacturer/request/CardsType;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Lcom/app/tgtg/model/remote/manufacturer/request/CardsType;)Lcom/app/tgtg/model/remote/item/response/CategoryCarouselMnuV2;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "getCards$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "getElementType$annotations", "Lcom/app/tgtg/model/remote/manufacturer/request/CardsType;", "getCardsType", "getCardsType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("SMALL_CARDS_CAROUSEL")
public final /* data */ class CategoryCarouselMnuV2 extends ElementMnuV2 implements Parcelable {

    @NotNull
    private final List<CategoryCard> cards;

    @Nullable
    private final CardsType cardsType;

    @Nullable
    private final AdapterItemType elementType;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CategoryCarouselMnuV2> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new e(14)), null, null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryCarouselMnuV2(int i11, List list, String str, AdapterItemType adapterItemType, CardsType cardsType, m1 m1Var) {
        super(i11, m1Var);
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, CategoryCarouselMnuV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.cards = list;
        this.title = str;
        this.elementType = adapterItemType;
        this.cardsType = cardsType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(CategoryCard$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryCarouselMnuV2 copy$default(CategoryCarouselMnuV2 categoryCarouselMnuV2, List list, String str, AdapterItemType adapterItemType, CardsType cardsType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = categoryCarouselMnuV2.cards;
        }
        if ((i11 & 2) != 0) {
            str = categoryCarouselMnuV2.title;
        }
        if ((i11 & 4) != 0) {
            adapterItemType = categoryCarouselMnuV2.elementType;
        }
        if ((i11 & 8) != 0) {
            cardsType = categoryCarouselMnuV2.cardsType;
        }
        return categoryCarouselMnuV2.copy(list, str, adapterItemType, cardsType);
    }

    public static final /* synthetic */ void write$Self$app(CategoryCarouselMnuV2 self, b output, SerialDescriptor serialDesc) {
        ElementMnuV2.write$Self(self, output, serialDesc);
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.cards);
        output.r(serialDesc, 1, r1.f29848a, self.title);
        output.r(serialDesc, 2, AdapterItemTypeSerializer.INSTANCE, self.getElementType());
        output.r(serialDesc, 3, CardsTypeSerializer.INSTANCE, self.cardsType);
    }

    @NotNull
    public final List<CategoryCard> component1() {
        return this.cards;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CardsType getCardsType() {
        return this.cardsType;
    }

    @NotNull
    public final CategoryCarouselMnuV2 copy(@NotNull List<CategoryCard> cards, @Nullable String title, @Nullable AdapterItemType elementType, @Nullable CardsType cardsType) {
        cards.getClass();
        return new CategoryCarouselMnuV2(cards, title, elementType, cardsType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryCarouselMnuV2)) {
            return false;
        }
        CategoryCarouselMnuV2 categoryCarouselMnuV2 = (CategoryCarouselMnuV2) other;
        return Intrinsics.areEqual(this.cards, categoryCarouselMnuV2.cards) && Intrinsics.areEqual(this.title, categoryCarouselMnuV2.title) && this.elementType == categoryCarouselMnuV2.elementType && this.cardsType == categoryCarouselMnuV2.cardsType;
    }

    @NotNull
    public final List<CategoryCard> getCards() {
        return this.cards;
    }

    @Nullable
    public final CardsType getCardsType() {
        return this.cardsType;
    }

    @Override // com.app.tgtg.model.remote.item.response.ElementMnuV2
    @Nullable
    public AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.cards.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdapterItemType adapterItemType = this.elementType;
        int iHashCode3 = (iHashCode2 + (adapterItemType == null ? 0 : adapterItemType.hashCode())) * 31;
        CardsType cardsType = this.cardsType;
        return iHashCode3 + (cardsType != null ? cardsType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CategoryCarouselMnuV2(cards=" + this.cards + ", title=" + this.title + ", elementType=" + this.elementType + ", cardsType=" + this.cardsType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.cards, dest);
        while (itR.hasNext()) {
            ((CategoryCard) itR.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.title);
        AdapterItemType adapterItemType = this.elementType;
        if (adapterItemType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adapterItemType.name());
        }
        CardsType cardsType = this.cardsType;
        if (cardsType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cardsType.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CategoryCarouselMnuV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/CategoryCarouselMnuV2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CategoryCarouselMnuV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryCarouselMnuV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryCarouselMnuV2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(CategoryCard.CREATOR, parcel, arrayList, iC, 1);
            }
            return new CategoryCarouselMnuV2(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : AdapterItemType.valueOf(parcel.readString()), parcel.readInt() != 0 ? CardsType.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryCarouselMnuV2[] newArray(int i11) {
            return new CategoryCarouselMnuV2[i11];
        }
    }

    @g("cards")
    public static /* synthetic */ void getCards$annotations() {
    }

    @g("cards_type")
    public static /* synthetic */ void getCardsType$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getElementType$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryCarouselMnuV2(@NotNull List<CategoryCard> list, @Nullable String str, @Nullable AdapterItemType adapterItemType, @Nullable CardsType cardsType) {
        super(null);
        list.getClass();
        this.cards = list;
        this.title = str;
        this.elementType = adapterItemType;
        this.cardsType = cardsType;
    }
}
