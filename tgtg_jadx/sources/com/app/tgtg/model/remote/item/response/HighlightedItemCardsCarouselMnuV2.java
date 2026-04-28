package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
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
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002FEB=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,JP\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b/\u0010)J\u0010\u00100\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b0\u0010\u001eJ\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010)R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010)R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bD\u00109\u001a\u0004\bC\u0010,¨\u0006G"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/HighlightedItemCardsCarouselMnuV2;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "items", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "", MessageBundle.TITLE_ENTRY, "subtitle", "Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "modularFeedAction", "<init>", "(Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/HighlightedItemCardsCarouselMnuV2;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "copy", "(Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;)Lcom/app/tgtg/model/remote/item/response/HighlightedItemCardsCarouselMnuV2;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getItems$annotations", "()V", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "getElementType$annotations", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "getModularFeedAction", "getModularFeedAction$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("HIGHLIGHTED_ITEM_CARDS_CAROUSEL")
public final /* data */ class HighlightedItemCardsCarouselMnuV2 extends ElementMnuV2 implements Parcelable {

    @Nullable
    private final AdapterItemType elementType;

    @NotNull
    private final List<BaseItemMnuV2> items;

    @Nullable
    private final ModularFeedAction modularFeedAction;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HighlightedItemCardsCarouselMnuV2> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new e(25)), null, null, null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HighlightedItemCardsCarouselMnuV2(int i11, List list, AdapterItemType adapterItemType, String str, String str2, ModularFeedAction modularFeedAction, m1 m1Var) {
        super(i11, m1Var);
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, HighlightedItemCardsCarouselMnuV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.items = list;
        this.elementType = adapterItemType;
        this.title = str;
        this.subtitle = str2;
        this.modularFeedAction = modularFeedAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BaseItemMnuV2$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlightedItemCardsCarouselMnuV2 copy$default(HighlightedItemCardsCarouselMnuV2 highlightedItemCardsCarouselMnuV2, List list, AdapterItemType adapterItemType, String str, String str2, ModularFeedAction modularFeedAction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = highlightedItemCardsCarouselMnuV2.items;
        }
        if ((i11 & 2) != 0) {
            adapterItemType = highlightedItemCardsCarouselMnuV2.elementType;
        }
        if ((i11 & 4) != 0) {
            str = highlightedItemCardsCarouselMnuV2.title;
        }
        if ((i11 & 8) != 0) {
            str2 = highlightedItemCardsCarouselMnuV2.subtitle;
        }
        if ((i11 & 16) != 0) {
            modularFeedAction = highlightedItemCardsCarouselMnuV2.modularFeedAction;
        }
        ModularFeedAction modularFeedAction2 = modularFeedAction;
        String str3 = str;
        return highlightedItemCardsCarouselMnuV2.copy(list, adapterItemType, str3, str2, modularFeedAction2);
    }

    public static final /* synthetic */ void write$Self$app(HighlightedItemCardsCarouselMnuV2 self, b output, SerialDescriptor serialDesc) {
        ElementMnuV2.write$Self(self, output, serialDesc);
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.items);
        output.r(serialDesc, 1, AdapterItemTypeSerializer.INSTANCE, self.getElementType());
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 2, r1Var, self.title);
        output.r(serialDesc, 3, r1Var, self.subtitle);
        output.r(serialDesc, 4, ModularFeedAction$$serializer.INSTANCE, self.modularFeedAction);
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
    public final ModularFeedAction getModularFeedAction() {
        return this.modularFeedAction;
    }

    @NotNull
    public final HighlightedItemCardsCarouselMnuV2 copy(@NotNull List<BaseItemMnuV2> items, @Nullable AdapterItemType elementType, @Nullable String title, @Nullable String subtitle, @Nullable ModularFeedAction modularFeedAction) {
        items.getClass();
        return new HighlightedItemCardsCarouselMnuV2(items, elementType, title, subtitle, modularFeedAction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightedItemCardsCarouselMnuV2)) {
            return false;
        }
        HighlightedItemCardsCarouselMnuV2 highlightedItemCardsCarouselMnuV2 = (HighlightedItemCardsCarouselMnuV2) other;
        return Intrinsics.areEqual(this.items, highlightedItemCardsCarouselMnuV2.items) && this.elementType == highlightedItemCardsCarouselMnuV2.elementType && Intrinsics.areEqual(this.title, highlightedItemCardsCarouselMnuV2.title) && Intrinsics.areEqual(this.subtitle, highlightedItemCardsCarouselMnuV2.subtitle) && Intrinsics.areEqual(this.modularFeedAction, highlightedItemCardsCarouselMnuV2.modularFeedAction);
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
    public final ModularFeedAction getModularFeedAction() {
        return this.modularFeedAction;
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
        ModularFeedAction modularFeedAction = this.modularFeedAction;
        return iHashCode4 + (modularFeedAction != null ? modularFeedAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BaseItemMnuV2> list = this.items;
        AdapterItemType adapterItemType = this.elementType;
        String str = this.title;
        String str2 = this.subtitle;
        ModularFeedAction modularFeedAction = this.modularFeedAction;
        StringBuilder sb2 = new StringBuilder("HighlightedItemCardsCarouselMnuV2(items=");
        sb2.append(list);
        sb2.append(", elementType=");
        sb2.append(adapterItemType);
        sb2.append(", title=");
        s.A(sb2, str, ", subtitle=", str2, ", modularFeedAction=");
        sb2.append(modularFeedAction);
        sb2.append(")");
        return sb2.toString();
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
        ModularFeedAction modularFeedAction = this.modularFeedAction;
        if (modularFeedAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            modularFeedAction.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/HighlightedItemCardsCarouselMnuV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/HighlightedItemCardsCarouselMnuV2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HighlightedItemCardsCarouselMnuV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HighlightedItemCardsCarouselMnuV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HighlightedItemCardsCarouselMnuV2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(BaseItemMnuV2.CREATOR, parcel, arrayList, iC, 1);
            }
            return new HighlightedItemCardsCarouselMnuV2(arrayList, parcel.readInt() == 0 ? null : AdapterItemType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ModularFeedAction.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HighlightedItemCardsCarouselMnuV2[] newArray(int i11) {
            return new HighlightedItemCardsCarouselMnuV2[i11];
        }
    }

    @g("type")
    public static /* synthetic */ void getElementType$annotations() {
    }

    @g("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g("action")
    public static /* synthetic */ void getModularFeedAction$annotations() {
    }

    @g("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedItemCardsCarouselMnuV2(@NotNull List<BaseItemMnuV2> list, @Nullable AdapterItemType adapterItemType, @Nullable String str, @Nullable String str2, @Nullable ModularFeedAction modularFeedAction) {
        super(null);
        list.getClass();
        this.items = list;
        this.elementType = adapterItemType;
        this.title = str;
        this.subtitle = str2;
        this.modularFeedAction = modularFeedAction;
    }
}
