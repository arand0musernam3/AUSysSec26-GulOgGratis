package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.response.CategoryNavigationCard;
import com.app.tgtg.model.remote.item.response.CategoryNavigationCard$$serializer;
import com.app.tgtg.model.remote.item.response.GroupMnuV2;
import com.app.tgtg.model.remote.item.response.GroupMnuV2$$serializer;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.item.response.SortingChoice$$serializer;
import e0.f;
import eu.a;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+JZ\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b1\u0010\u001eJ\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010%R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010'R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b?\u0010:\u001a\u0004\b>\u0010'R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\bA\u0010:\u001a\u0004\b@\u0010'R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bD\u0010:\u001a\u0004\bC\u0010+¨\u0006G"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemsV2Response;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/manufacturer/response/ModularFeedNavigationHolder;", "navigationHeader", "", "Lcom/app/tgtg/model/remote/item/response/CategoryNavigationCard;", "navigationCategories", "Lcom/app/tgtg/model/remote/item/response/SortingChoice;", "sortingChoices", "Lcom/app/tgtg/model/remote/item/response/GroupMnuV2;", "groups", "Lcom/app/tgtg/model/remote/manufacturer/response/EventData;", "eventData", "<init>", "(Lcom/app/tgtg/model/remote/manufacturer/response/ModularFeedNavigationHolder;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/response/EventData;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/manufacturer/response/ModularFeedNavigationHolder;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/response/EventData;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemsV2Response;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/manufacturer/response/ModularFeedNavigationHolder;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/manufacturer/response/EventData;", "copy", "(Lcom/app/tgtg/model/remote/manufacturer/response/ModularFeedNavigationHolder;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/response/EventData;)Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemsV2Response;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/manufacturer/response/ModularFeedNavigationHolder;", "getNavigationHeader", "getNavigationHeader$annotations", "()V", "Ljava/util/List;", "getNavigationCategories", "getNavigationCategories$annotations", "getSortingChoices", "getSortingChoices$annotations", "getGroups", "getGroups$annotations", "Lcom/app/tgtg/model/remote/manufacturer/response/EventData;", "getEventData", "getEventData$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ManufacturerItemsV2Response implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final EventData eventData;

    @NotNull
    private final List<GroupMnuV2> groups;

    @Nullable
    private final List<CategoryNavigationCard> navigationCategories;

    @Nullable
    private final ModularFeedNavigationHolder navigationHeader;

    @Nullable
    private final List<SortingChoice> sortingChoices;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ManufacturerItemsV2Response> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, l.a(mVar, new a(25)), l.a(mVar, new a(26)), l.a(mVar, new a(27)), null};
    }

    public /* synthetic */ ManufacturerItemsV2Response(int i11, ModularFeedNavigationHolder modularFeedNavigationHolder, List list, List list2, List list3, EventData eventData, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, ManufacturerItemsV2Response$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.navigationHeader = modularFeedNavigationHolder;
        this.navigationCategories = list;
        this.sortingChoices = list2;
        this.groups = list3;
        this.eventData = eventData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(CategoryNavigationCard$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(SortingChoice$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(GroupMnuV2$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManufacturerItemsV2Response copy$default(ManufacturerItemsV2Response manufacturerItemsV2Response, ModularFeedNavigationHolder modularFeedNavigationHolder, List list, List list2, List list3, EventData eventData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            modularFeedNavigationHolder = manufacturerItemsV2Response.navigationHeader;
        }
        if ((i11 & 2) != 0) {
            list = manufacturerItemsV2Response.navigationCategories;
        }
        if ((i11 & 4) != 0) {
            list2 = manufacturerItemsV2Response.sortingChoices;
        }
        if ((i11 & 8) != 0) {
            list3 = manufacturerItemsV2Response.groups;
        }
        if ((i11 & 16) != 0) {
            eventData = manufacturerItemsV2Response.eventData;
        }
        EventData eventData2 = eventData;
        List list4 = list2;
        return manufacturerItemsV2Response.copy(modularFeedNavigationHolder, list, list4, list3, eventData2);
    }

    public static final /* synthetic */ void write$Self$app(ManufacturerItemsV2Response self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, ModularFeedNavigationHolder$$serializer.INSTANCE, self.navigationHeader);
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.navigationCategories);
        output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.sortingChoices);
        output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.groups);
        output.i(serialDesc, 4, EventData$$serializer.INSTANCE, self.eventData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ModularFeedNavigationHolder getNavigationHeader() {
        return this.navigationHeader;
    }

    @Nullable
    public final List<CategoryNavigationCard> component2() {
        return this.navigationCategories;
    }

    @Nullable
    public final List<SortingChoice> component3() {
        return this.sortingChoices;
    }

    @NotNull
    public final List<GroupMnuV2> component4() {
        return this.groups;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EventData getEventData() {
        return this.eventData;
    }

    @NotNull
    public final ManufacturerItemsV2Response copy(@Nullable ModularFeedNavigationHolder navigationHeader, @Nullable List<CategoryNavigationCard> navigationCategories, @Nullable List<SortingChoice> sortingChoices, @NotNull List<GroupMnuV2> groups, @NotNull EventData eventData) {
        groups.getClass();
        eventData.getClass();
        return new ManufacturerItemsV2Response(navigationHeader, navigationCategories, sortingChoices, groups, eventData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManufacturerItemsV2Response)) {
            return false;
        }
        ManufacturerItemsV2Response manufacturerItemsV2Response = (ManufacturerItemsV2Response) other;
        return Intrinsics.areEqual(this.navigationHeader, manufacturerItemsV2Response.navigationHeader) && Intrinsics.areEqual(this.navigationCategories, manufacturerItemsV2Response.navigationCategories) && Intrinsics.areEqual(this.sortingChoices, manufacturerItemsV2Response.sortingChoices) && Intrinsics.areEqual(this.groups, manufacturerItemsV2Response.groups) && Intrinsics.areEqual(this.eventData, manufacturerItemsV2Response.eventData);
    }

    @NotNull
    public final EventData getEventData() {
        return this.eventData;
    }

    @NotNull
    public final List<GroupMnuV2> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<CategoryNavigationCard> getNavigationCategories() {
        return this.navigationCategories;
    }

    @Nullable
    public final ModularFeedNavigationHolder getNavigationHeader() {
        return this.navigationHeader;
    }

    @Nullable
    public final List<SortingChoice> getSortingChoices() {
        return this.sortingChoices;
    }

    public int hashCode() {
        ModularFeedNavigationHolder modularFeedNavigationHolder = this.navigationHeader;
        int iHashCode = (modularFeedNavigationHolder == null ? 0 : modularFeedNavigationHolder.hashCode()) * 31;
        List<CategoryNavigationCard> list = this.navigationCategories;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SortingChoice> list2 = this.sortingChoices;
        return this.eventData.hashCode() + f.c(this.groups, (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ManufacturerItemsV2Response(navigationHeader=" + this.navigationHeader + ", navigationCategories=" + this.navigationCategories + ", sortingChoices=" + this.sortingChoices + ", groups=" + this.groups + ", eventData=" + this.eventData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        ModularFeedNavigationHolder modularFeedNavigationHolder = this.navigationHeader;
        if (modularFeedNavigationHolder == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            modularFeedNavigationHolder.writeToParcel(dest, flags);
        }
        List<CategoryNavigationCard> list = this.navigationCategories;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((CategoryNavigationCard) itQ.next()).writeToParcel(dest, flags);
            }
        }
        List<SortingChoice> list2 = this.sortingChoices;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = i.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((SortingChoice) itQ2.next()).writeToParcel(dest, flags);
            }
        }
        Iterator itR = i.r(this.groups, dest);
        while (itR.hasNext()) {
            ((GroupMnuV2) itR.next()).writeToParcel(dest, flags);
        }
        this.eventData.writeToParcel(dest, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemsV2Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemsV2Response;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ManufacturerItemsV2Response$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ManufacturerItemsV2Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerItemsV2Response createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            ArrayList arrayList2 = null;
            ModularFeedNavigationHolder modularFeedNavigationHolderCreateFromParcel = parcel.readInt() == 0 ? null : ModularFeedNavigationHolder.CREATOR.createFromParcel(parcel);
            int iC = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int iC2 = 0;
                while (iC2 != i11) {
                    iC2 = i.c(CategoryNavigationCard.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = i.c(SortingChoice.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            while (iC != i13) {
                iC = i.c(GroupMnuV2.CREATOR, parcel, arrayList3, iC, 1);
            }
            return new ManufacturerItemsV2Response(modularFeedNavigationHolderCreateFromParcel, arrayList, arrayList2, arrayList3, EventData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerItemsV2Response[] newArray(int i11) {
            return new ManufacturerItemsV2Response[i11];
        }
    }

    @g("event_data")
    public static /* synthetic */ void getEventData$annotations() {
    }

    @g("groups")
    public static /* synthetic */ void getGroups$annotations() {
    }

    @g("navigation_categories")
    public static /* synthetic */ void getNavigationCategories$annotations() {
    }

    @g("navigation_header")
    public static /* synthetic */ void getNavigationHeader$annotations() {
    }

    @g("sorting_choices")
    public static /* synthetic */ void getSortingChoices$annotations() {
    }

    public ManufacturerItemsV2Response(@Nullable ModularFeedNavigationHolder modularFeedNavigationHolder, @Nullable List<CategoryNavigationCard> list, @Nullable List<SortingChoice> list2, @NotNull List<GroupMnuV2> list3, @NotNull EventData eventData) {
        list3.getClass();
        eventData.getClass();
        this.navigationHeader = modularFeedNavigationHolder;
        this.navigationCategories = list;
        this.sortingChoices = list2;
        this.groups = list3;
        this.eventData = eventData;
    }
}
