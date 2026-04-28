package com.app.tgtg.model.local;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem$$serializer;
import com.braze.Constants;
import e0.f;
import ft.c;
import ft.e;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qb.s;
import qc.y;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import uu.a;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0002hiBW\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bi\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,J1\u0010.\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020\u000302¢\u0006\u0004\b3\u00104J\u0015\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u00020\u0005¢\u0006\u0004\b:\u0010)J\u000f\u0010;\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\n¢\u0006\u0004\b?\u00101J\u001d\u0010C\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\n¢\u0006\u0004\bC\u0010DJ`\u0010E\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bG\u0010)J\u0010\u0010H\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bH\u00101J\u001a\u0010K\u001a\u00020#2\b\u0010J\u001a\u0004\u0018\u00010IHÖ\u0003¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\bQ\u00104J\u0010\u0010R\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\bR\u0010)J\u0010\u0010S\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\bS\u0010'J\u0010\u0010T\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\bT\u0010'J\u0010\u0010U\u001a\u00020\nHÂ\u0003¢\u0006\u0004\bU\u00101J\u0012\u0010V\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\bV\u0010<J\u0012\u0010W\u001a\u0004\u0018\u00010\u000eHÂ\u0003¢\u0006\u0004\bW\u0010>J'\u0010_\u001a\u00020\u001e2\u0006\u0010X\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[H\u0001¢\u0006\u0004\b]\u0010^R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010`R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010aR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010bR\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010cR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010eR\u001a\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0013\u0010b\u0012\u0004\bf\u0010g¨\u0006j"}, d2 = {"Lcom/app/tgtg/model/local/BasketManager;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketBriefItem;", "basketItems", "", "itemCountryId", "", "createdAtTs", "savedAtTs", "", "maximumItemCount", "Lcom/app/tgtg/model/local/LatestBasketInteraction;", "latestBasketInteraction", "Lcom/app/tgtg/model/local/LatestInteractionOrigin;", "latestInteractionOrigin", "<init>", "(Ljava/util/List;Ljava/lang/String;JJILcom/app/tgtg/model/local/LatestBasketInteraction;Lcom/app/tgtg/model/local/LatestInteractionOrigin;)V", "seen0", "persistTime", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;JJILcom/app/tgtg/model/local/LatestBasketInteraction;Lcom/app/tgtg/model/local/LatestInteractionOrigin;JLm90/m1;)V", "userCountryId", "allowedItemCount", "restoreBasketManager", "(Ljava/lang/String;I)Lcom/app/tgtg/model/local/BasketManager;", "Lcom/app/tgtg/model/remote/item/response/ManufacturerItem;", "item", "itemCount", "", "updateBasketItem", "(Lcom/app/tgtg/model/remote/item/response/ManufacturerItem;Ljava/lang/String;ILcom/app/tgtg/model/local/LatestBasketInteraction;Lcom/app/tgtg/model/local/LatestInteractionOrigin;)V", "currentCount", "allowedCount", "", "canAddItemToBasket", "(II)Z", "getCreatedAt", "()J", "getCountryId", "()Ljava/lang/String;", "itemId", "getQuantity", "(Ljava/lang/String;)I", "quantity", "setQuantity", "(Ljava/lang/String;ILcom/app/tgtg/model/local/LatestBasketInteraction;Lcom/app/tgtg/model/local/LatestInteractionOrigin;)V", "getTotalBasketItems", "()I", "", "getBasketItems", "()Ljava/util/List;", "Lcom/app/tgtg/model/remote/UserId;", "userId", "getBasketId-M00Rnn0", "(Ljava/lang/String;)Ljava/lang/String;", "getBasketId", "toJson", "getLatestBasketInteraction", "()Lcom/app/tgtg/model/local/LatestBasketInteraction;", "getLatestInteractionOrigin", "()Lcom/app/tgtg/model/local/LatestInteractionOrigin;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "copy", "(Ljava/util/List;Ljava/lang/String;JJILcom/app/tgtg/model/local/LatestBasketInteraction;Lcom/app/tgtg/model/local/LatestInteractionOrigin;)Lcom/app/tgtg/model/local/BasketManager;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "addOrRemoveItem", "(ILjava/lang/String;)V", "getPostChangeQuantity", "(Ljava/lang/String;I)I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/local/BasketManager;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "Ljava/lang/String;", "J", "I", "Lcom/app/tgtg/model/local/LatestBasketInteraction;", "Lcom/app/tgtg/model/local/LatestInteractionOrigin;", "getPersistTime$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketManager.kt\ncom/app/tgtg/model/local/BasketManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n296#2,2:202\n1807#2,3:204\n231#2,2:207\n1807#2,3:210\n231#2,2:213\n1807#2,3:215\n296#2,2:218\n1#3:209\n*S KotlinDebug\n*F\n+ 1 BasketManager.kt\ncom/app/tgtg/model/local/BasketManager\n*L\n91#1:202,2\n105#1:204,3\n109#1:207,2\n150#1:210,3\n154#1:213,2\n157#1:215,3\n165#1:218,2\n*E\n"})
public final /* data */ class BasketManager implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<BasketBriefItem> basketItems;
    private long createdAtTs;

    @NotNull
    private String itemCountryId;

    @Nullable
    private LatestBasketInteraction latestBasketInteraction;

    @Nullable
    private LatestInteractionOrigin latestInteractionOrigin;
    private int maximumItemCount;
    private final long persistTime;
    private long savedAtTs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BasketManager> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(10)), null, null, null, null, l.a(mVar, new a(11)), l.a(mVar, new a(12)), null};
    }

    public /* synthetic */ BasketManager(int i11, List list, String str, long j9, long j11, int i12, LatestBasketInteraction latestBasketInteraction, LatestInteractionOrigin latestInteractionOrigin, long j12, m1 m1Var) {
        this.basketItems = (i11 & 1) == 0 ? new ArrayList() : list;
        if ((i11 & 2) == 0) {
            this.itemCountryId = "";
        } else {
            this.itemCountryId = str;
        }
        if ((i11 & 4) == 0) {
            this.createdAtTs = 0L;
        } else {
            this.createdAtTs = j9;
        }
        if ((i11 & 8) == 0) {
            this.savedAtTs = 0L;
        } else {
            this.savedAtTs = j11;
        }
        if ((i11 & 16) == 0) {
            this.maximumItemCount = 20;
        } else {
            this.maximumItemCount = i12;
        }
        if ((i11 & 32) == 0) {
            this.latestBasketInteraction = null;
        } else {
            this.latestBasketInteraction = latestBasketInteraction;
        }
        if ((i11 & 64) == 0) {
            this.latestInteractionOrigin = null;
        } else {
            this.latestInteractionOrigin = latestInteractionOrigin;
        }
        if ((i11 & 128) == 0) {
            this.persistTime = 43200000L;
        } else {
            this.persistTime = j12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasketBriefItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        LatestBasketInteraction[] latestBasketInteractionArrValues = LatestBasketInteraction.values();
        latestBasketInteractionArrValues.getClass();
        return new i90.a("com.app.tgtg.model.local.LatestBasketInteraction", (Enum[]) latestBasketInteractionArrValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$1() {
        LatestInteractionOrigin[] latestInteractionOriginArrValues = LatestInteractionOrigin.values();
        latestInteractionOriginArrValues.getClass();
        return new i90.a("com.app.tgtg.model.local.LatestInteractionOrigin", (Enum[]) latestInteractionOriginArrValues);
    }

    private final void addOrRemoveItem(int itemCount, String itemId) {
        List<BasketBriefItem> list = this.basketItems;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((BasketBriefItem) it.next()).getItemId(), itemId)) {
                    List<BasketBriefItem> list2 = this.basketItems;
                    if (itemCount == 0) {
                        list2.removeIf(new fn.h(new s(itemId, 28), 13));
                        return;
                    }
                    for (BasketBriefItem basketBriefItem : list2) {
                        if (Intrinsics.areEqual(basketBriefItem.getItemId(), itemId)) {
                            basketBriefItem.setItemCount(itemCount);
                            return;
                        }
                    }
                    y.h("Collection contains no element matching the predicate.");
                    return;
                }
            }
        }
        List<BasketBriefItem> list3 = this.basketItems;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((BasketBriefItem) it2.next()).getItemId(), itemId)) {
                    return;
                }
            }
        }
        if (getTotalBasketItems() + itemCount <= this.maximumItemCount) {
            this.basketItems.add(new BasketBriefItem(itemId, itemCount));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addOrRemoveItem$lambda$1(String str, BasketBriefItem basketBriefItem) {
        basketBriefItem.getClass();
        return Intrinsics.areEqual(basketBriefItem.getItemId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addOrRemoveItem$lambda$2(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private final List<BasketBriefItem> component1() {
        return this.basketItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getItemCountryId() {
        return this.itemCountryId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final long getCreatedAtTs() {
        return this.createdAtTs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final long getSavedAtTs() {
        return this.savedAtTs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final int getMaximumItemCount() {
        return this.maximumItemCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final LatestBasketInteraction getLatestBasketInteraction() {
        return this.latestBasketInteraction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final LatestInteractionOrigin getLatestInteractionOrigin() {
        return this.latestInteractionOrigin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketManager copy$default(BasketManager basketManager, List list, String str, long j9, long j11, int i11, LatestBasketInteraction latestBasketInteraction, LatestInteractionOrigin latestInteractionOrigin, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = basketManager.basketItems;
        }
        if ((i12 & 2) != 0) {
            str = basketManager.itemCountryId;
        }
        if ((i12 & 4) != 0) {
            j9 = basketManager.createdAtTs;
        }
        if ((i12 & 8) != 0) {
            j11 = basketManager.savedAtTs;
        }
        if ((i12 & 16) != 0) {
            i11 = basketManager.maximumItemCount;
        }
        if ((i12 & 32) != 0) {
            latestBasketInteraction = basketManager.latestBasketInteraction;
        }
        if ((i12 & 64) != 0) {
            latestInteractionOrigin = basketManager.latestInteractionOrigin;
        }
        LatestInteractionOrigin latestInteractionOrigin2 = latestInteractionOrigin;
        int i13 = i11;
        long j12 = j11;
        long j13 = j9;
        return basketManager.copy(list, str, j13, j12, i13, latestBasketInteraction, latestInteractionOrigin2);
    }

    @NotNull
    public static final BasketManager fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    private final int getPostChangeQuantity(String itemId, int quantity) {
        Object next;
        int totalBasketItems = getTotalBasketItems();
        Iterator<T> it = this.basketItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((BasketBriefItem) next).getItemId(), itemId)) {
                break;
            }
        }
        BasketBriefItem basketBriefItem = (BasketBriefItem) next;
        return (totalBasketItems - (basketBriefItem != null ? basketBriefItem.getItemCount() : 0)) + quantity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setQuantity$lambda$1(String str, BasketBriefItem basketBriefItem) {
        basketBriefItem.getClass();
        return Intrinsics.areEqual(basketBriefItem.getItemId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setQuantity$lambda$2(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final /* synthetic */ void write$Self$app(BasketManager self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.basketItems, new ArrayList())) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.basketItems);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.itemCountryId, "")) {
            output.q(serialDesc, 1, self.itemCountryId);
        }
        if (output.C(serialDesc) || self.createdAtTs != 0) {
            output.B(serialDesc, 2, self.createdAtTs);
        }
        if (output.C(serialDesc) || self.savedAtTs != 0) {
            output.B(serialDesc, 3, self.savedAtTs);
        }
        if (output.C(serialDesc) || self.maximumItemCount != 20) {
            output.m(4, self.maximumItemCount, serialDesc);
        }
        if (output.C(serialDesc) || self.latestBasketInteraction != null) {
            output.r(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.latestBasketInteraction);
        }
        if (output.C(serialDesc) || self.latestInteractionOrigin != null) {
            output.r(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.latestInteractionOrigin);
        }
        if (!output.C(serialDesc) && self.persistTime == 43200000) {
            return;
        }
        output.B(serialDesc, 7, self.persistTime);
    }

    public final boolean canAddItemToBasket(int currentCount, int allowedCount) {
        return currentCount < allowedCount;
    }

    @NotNull
    public final BasketManager copy(@NotNull List<BasketBriefItem> basketItems, @NotNull String itemCountryId, long createdAtTs, long savedAtTs, int maximumItemCount, @Nullable LatestBasketInteraction latestBasketInteraction, @Nullable LatestInteractionOrigin latestInteractionOrigin) {
        basketItems.getClass();
        itemCountryId.getClass();
        return new BasketManager(basketItems, itemCountryId, createdAtTs, savedAtTs, maximumItemCount, latestBasketInteraction, latestInteractionOrigin);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketManager)) {
            return false;
        }
        BasketManager basketManager = (BasketManager) other;
        return Intrinsics.areEqual(this.basketItems, basketManager.basketItems) && Intrinsics.areEqual(this.itemCountryId, basketManager.itemCountryId) && this.createdAtTs == basketManager.createdAtTs && this.savedAtTs == basketManager.savedAtTs && this.maximumItemCount == basketManager.maximumItemCount && this.latestBasketInteraction == basketManager.latestBasketInteraction && this.latestInteractionOrigin == basketManager.latestInteractionOrigin;
    }

    @NotNull
    /* JADX INFO: renamed from: getBasketId-M00Rnn0, reason: not valid java name */
    public final String m184getBasketIdM00Rnn0(@NotNull String userId) {
        userId.getClass();
        long j9 = this.createdAtTs;
        if (j9 == 0) {
            return "";
        }
        return userId + "_" + (j9 / 1000);
    }

    @NotNull
    public final List<BasketBriefItem> getBasketItems() {
        return this.basketItems;
    }

    @NotNull
    public final String getCountryId() {
        return this.itemCountryId;
    }

    public final long getCreatedAt() {
        return this.createdAtTs;
    }

    @Nullable
    public final LatestBasketInteraction getLatestBasketInteraction() {
        LatestBasketInteraction latestBasketInteraction = this.latestBasketInteraction;
        this.latestBasketInteraction = null;
        c.G(this);
        return latestBasketInteraction;
    }

    @Nullable
    public final LatestInteractionOrigin getLatestInteractionOrigin() {
        return this.latestInteractionOrigin;
    }

    public final int getQuantity(@NotNull String itemId) {
        Object next;
        itemId.getClass();
        Iterator<T> it = this.basketItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((BasketBriefItem) next).getItemId(), itemId)) {
                break;
            }
        }
        BasketBriefItem basketBriefItem = (BasketBriefItem) next;
        if (basketBriefItem != null) {
            return basketBriefItem.getItemCount();
        }
        return 0;
    }

    public final int getTotalBasketItems() {
        Iterator<T> it = this.basketItems.iterator();
        int itemCount = 0;
        while (it.hasNext()) {
            itemCount += ((BasketBriefItem) it.next()).getItemCount();
        }
        return itemCount;
    }

    public int hashCode() {
        int iB = k.b(this.maximumItemCount, f.b(f.b(l1.b(this.basketItems.hashCode() * 31, 31, this.itemCountryId), 31, this.createdAtTs), 31, this.savedAtTs), 31);
        LatestBasketInteraction latestBasketInteraction = this.latestBasketInteraction;
        int iHashCode = (iB + (latestBasketInteraction == null ? 0 : latestBasketInteraction.hashCode())) * 31;
        LatestInteractionOrigin latestInteractionOrigin = this.latestInteractionOrigin;
        return iHashCode + (latestInteractionOrigin != null ? latestInteractionOrigin.hashCode() : 0);
    }

    @Nullable
    public final BasketManager restoreBasketManager(@NotNull String userCountryId, int allowedItemCount) {
        userCountryId.getClass();
        if (e.f17923d.f17917n == null) {
            SharedPreferences sharedPreferencesX = c.x();
            String strY = c.y();
            BasketManager basketManagerFromJson = null;
            if (strY == null) {
                strY = null;
            }
            String string = sharedPreferencesX.getString(strY + "_basketManager", "");
            ft.d dVar = e.f17923d;
            string.getClass();
            if (string.length() != 0 && !Intrinsics.areEqual(string, "{}")) {
                basketManagerFromJson = INSTANCE.fromJson(string);
            }
            dVar.f17917n = basketManagerFromJson;
        }
        BasketManager basketManager = e.f17923d.f17917n;
        if (basketManager != null) {
            basketManager.maximumItemCount = allowedItemCount;
        }
        if (INSTANCE.isBasketValid(basketManager, userCountryId)) {
            this.savedAtTs = System.currentTimeMillis();
            return basketManager;
        }
        return new BasketManager(new ArrayList(), userCountryId, 0L, System.currentTimeMillis(), allowedItemCount, null, null, 96, null);
    }

    public final void setQuantity(@NotNull String itemId, int quantity, @Nullable LatestBasketInteraction latestBasketInteraction, @Nullable LatestInteractionOrigin latestInteractionOrigin) {
        itemId.getClass();
        this.savedAtTs = System.currentTimeMillis();
        this.latestBasketInteraction = latestBasketInteraction;
        this.latestInteractionOrigin = latestInteractionOrigin;
        if (getTotalBasketItems() == 0) {
            this.createdAtTs = System.currentTimeMillis();
        }
        List<BasketBriefItem> list = this.basketItems;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((BasketBriefItem) it.next()).getItemId(), itemId)) {
                    if (quantity == 0) {
                        this.basketItems.removeIf(new fn.h(new s(itemId, 29), 14));
                    } else if (getPostChangeQuantity(itemId, quantity) <= this.maximumItemCount) {
                        for (BasketBriefItem basketBriefItem : this.basketItems) {
                            if (Intrinsics.areEqual(basketBriefItem.getItemId(), itemId)) {
                                basketBriefItem.setItemCount(quantity);
                            }
                        }
                        y.h("Collection contains no element matching the predicate.");
                        return;
                    }
                }
            }
            if (quantity > 0 && getPostChangeQuantity(itemId, quantity) <= this.maximumItemCount) {
                this.basketItems.add(new BasketBriefItem(itemId, quantity));
            }
        } else if (quantity > 0) {
            this.basketItems.add(new BasketBriefItem(itemId, quantity));
        }
        if (getTotalBasketItems() > 0) {
            c.G(this);
        } else {
            this.createdAtTs = 0L;
            c.G(null);
        }
    }

    @NotNull
    public final String toJson() {
        return n90.c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        List<BasketBriefItem> list = this.basketItems;
        String str = this.itemCountryId;
        long j9 = this.createdAtTs;
        long j11 = this.savedAtTs;
        int i11 = this.maximumItemCount;
        LatestBasketInteraction latestBasketInteraction = this.latestBasketInteraction;
        LatestInteractionOrigin latestInteractionOrigin = this.latestInteractionOrigin;
        StringBuilder sb2 = new StringBuilder("BasketManager(basketItems=");
        sb2.append(list);
        sb2.append(", itemCountryId=");
        sb2.append(str);
        sb2.append(", createdAtTs=");
        sb2.append(j9);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", savedAtTs=", j11, ", maximumItemCount=");
        sb2.append(i11);
        sb2.append(", latestBasketInteraction=");
        sb2.append(latestBasketInteraction);
        sb2.append(", latestInteractionOrigin=");
        sb2.append(latestInteractionOrigin);
        sb2.append(")");
        return sb2.toString();
    }

    public final void updateBasketItem(@NotNull ManufacturerItem item, @NotNull String userCountryId, int itemCount, @Nullable LatestBasketInteraction latestBasketInteraction, @Nullable LatestInteractionOrigin latestInteractionOrigin) {
        item.getClass();
        userCountryId.getClass();
        this.latestBasketInteraction = latestBasketInteraction;
        this.latestInteractionOrigin = latestInteractionOrigin;
        String isoCode = mv.d.m(item).getStoreLocation().getAddress().getPickupCountry().getIsoCode();
        if (isoCode == null) {
            isoCode = "";
        }
        if (isoCode.length() <= 0 || !Intrinsics.areEqual(isoCode, userCountryId)) {
            this.createdAtTs = 0L;
            c.G(null);
            return;
        }
        String strMo340getItemIdFvU5WIY = item.getInformation().mo340getItemIdFvU5WIY();
        if (this.itemCountryId.length() == 0) {
            this.itemCountryId = isoCode;
        } else if (!Intrinsics.areEqual(this.itemCountryId, isoCode)) {
            return;
        }
        if (getTotalBasketItems() == 0) {
            this.createdAtTs = System.currentTimeMillis();
        }
        this.savedAtTs = System.currentTimeMillis();
        addOrRemoveItem(itemCount, strMo340getItemIdFvU5WIY);
        if (getTotalBasketItems() <= 0) {
            this.createdAtTs = 0L;
            c.G(null);
        } else if (getTotalBasketItems() <= this.maximumItemCount) {
            c.G(this);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.basketItems, dest);
        while (itR.hasNext()) {
            ((BasketBriefItem) itR.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.itemCountryId);
        dest.writeLong(this.createdAtTs);
        dest.writeLong(this.savedAtTs);
        dest.writeInt(this.maximumItemCount);
        LatestBasketInteraction latestBasketInteraction = this.latestBasketInteraction;
        if (latestBasketInteraction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(latestBasketInteraction.name());
        }
        LatestInteractionOrigin latestInteractionOrigin = this.latestInteractionOrigin;
        if (latestInteractionOrigin == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(latestInteractionOrigin.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¨\u0006\u0010"}, d2 = {"Lcom/app/tgtg/model/local/BasketManager$Companion;", "", "<init>", "()V", "fromJson", "Lcom/app/tgtg/model/local/BasketManager;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "", "deleteBasket", "", "isBasketValid", "", "basketManager", "userCountryId", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deleteBasket() {
            c.G(null);
        }

        @NotNull
        public final BasketManager fromJson(@NotNull String s7) {
            s7.getClass();
            return (BasketManager) n90.c.f30748d.b(serializer(), s7);
        }

        public final boolean isBasketValid(@Nullable BasketManager basketManager, @NotNull String userCountryId) {
            userCountryId.getClass();
            return basketManager != null && System.currentTimeMillis() - basketManager.savedAtTs < basketManager.persistTime && Intrinsics.areEqual(basketManager.itemCountryId, userCountryId) && basketManager.getTotalBasketItems() > 0;
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketManager$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BasketManager> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketManager createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(BasketBriefItem.CREATOR, parcel, arrayList, iC, 1);
            }
            return new BasketManager(arrayList, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : LatestBasketInteraction.valueOf(parcel.readString()), parcel.readInt() != 0 ? LatestInteractionOrigin.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketManager[] newArray(int i11) {
            return new BasketManager[i11];
        }
    }

    private static /* synthetic */ void getPersistTime$annotations() {
    }

    public BasketManager() {
        this(null, null, 0L, 0L, 0, null, null, 127, null);
    }

    public BasketManager(@NotNull List<BasketBriefItem> list, @NotNull String str, long j9, long j11, int i11, @Nullable LatestBasketInteraction latestBasketInteraction, @Nullable LatestInteractionOrigin latestInteractionOrigin) {
        list.getClass();
        str.getClass();
        this.basketItems = list;
        this.itemCountryId = str;
        this.createdAtTs = j9;
        this.savedAtTs = j11;
        this.maximumItemCount = i11;
        this.latestBasketInteraction = latestBasketInteraction;
        this.latestInteractionOrigin = latestInteractionOrigin;
        this.persistTime = 43200000L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BasketManager(List list, String str, long j9, long j11, int i11, LatestBasketInteraction latestBasketInteraction, LatestInteractionOrigin latestInteractionOrigin, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        LatestInteractionOrigin latestInteractionOrigin2;
        LatestBasketInteraction latestBasketInteraction2;
        int i13;
        list = (i12 & 1) != 0 ? new ArrayList() : list;
        str = (i12 & 2) != 0 ? "" : str;
        j9 = (i12 & 4) != 0 ? 0L : j9;
        j11 = (i12 & 8) != 0 ? 0L : j11;
        i11 = (i12 & 16) != 0 ? 20 : i11;
        latestBasketInteraction = (i12 & 32) != 0 ? null : latestBasketInteraction;
        if ((i12 & 64) != 0) {
            latestInteractionOrigin2 = null;
            i13 = i11;
            latestBasketInteraction2 = latestBasketInteraction;
        } else {
            latestInteractionOrigin2 = latestInteractionOrigin;
            latestBasketInteraction2 = latestBasketInteraction;
            i13 = i11;
        }
        this(list, str, j9, j11, i13, latestBasketInteraction2, latestInteractionOrigin2);
    }
}
