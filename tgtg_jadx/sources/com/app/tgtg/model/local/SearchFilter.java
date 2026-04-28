package com.app.tgtg.model.local;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.ItemCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\n\u00101\u001a\u00020\u000fH\u0096\u0080\u0004J\u0014\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0082\u0004J\n\u00105\u001a\u000206H\u0096\u0080\u0004J\u0006\u00107\u001a\u00020\u000fJ\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0005j\b\u0012\u0004\u0012\u00020\u000f`\u0007J\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0005j\b\u0012\u0004\u0012\u00020\u000f`\u0007J\u0006\u0010:\u001a\u00020\u000fJ\u0006\u0010;\u001a\u00020\u000fJ\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000f0=J\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0=J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0=J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0019\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\u0019\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007HÆ\u0003J\u0019\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u0007HÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u00072\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0006\u0010I\u001a\u000206J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u000206R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0016\"\u0004\b-\u0010\u0018R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0016R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0016¨\u0006O"}, d2 = {"Lcom/app/tgtg/model/local/SearchFilter;", "Landroid/os/Parcelable;", "showOnlyAvailable", "", "collectionDays", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/local/CollectionDayModel;", "Lkotlin/collections/ArrayList;", "collectionTimes", "Lcom/app/tgtg/model/local/CollectionTimeModel;", "foodTypes", "Lcom/app/tgtg/model/remote/item/ItemCategory;", "dietPrefs", "Lcom/app/tgtg/model/local/DietPreferenceModel;", "searchText", "", "sortOption", "Lcom/app/tgtg/model/local/SortingPreference;", "isFromDeepLink", "<init>", "(ZLjava/util/ArrayList;Lcom/app/tgtg/model/local/CollectionTimeModel;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Lcom/app/tgtg/model/local/SortingPreference;Z)V", "getShowOnlyAvailable", "()Z", "setShowOnlyAvailable", "(Z)V", "getCollectionDays", "()Ljava/util/ArrayList;", "setCollectionDays", "(Ljava/util/ArrayList;)V", "getCollectionTimes", "()Lcom/app/tgtg/model/local/CollectionTimeModel;", "setCollectionTimes", "(Lcom/app/tgtg/model/local/CollectionTimeModel;)V", "getFoodTypes", "setFoodTypes", "getDietPrefs", "setDietPrefs", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "getSortOption", "()Lcom/app/tgtg/model/local/SortingPreference;", "setSortOption", "(Lcom/app/tgtg/model/local/SortingPreference;)V", "setFromDeepLink", "isFilterOn", "isSearchOn", "isPickupTimeSet", "toString", "equals", "other", "", "hashCode", "", "getFootTypesAsStringList", "getCategoriesAsStringArray", "getDietPreferencesAsStringArray", "getDietPreferencesAsStringList", "getCollectionDaysAsStringList", "getCollectionDaysStringList", "", "getFoodTypesStringList", "getDietPrefsStringList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSearchFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFilter.kt\ncom/app/tgtg/model/local/SearchFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1915#2,2:103\n1915#2,2:105\n1586#2:107\n1661#2,3:108\n1586#2:111\n1661#2,3:112\n1586#2:115\n1661#2,3:116\n*S KotlinDebug\n*F\n+ 1 SearchFilter.kt\ncom/app/tgtg/model/local/SearchFilter\n*L\n68#1:103,2\n76#1:105,2\n91#1:107\n91#1:108,3\n95#1:111\n95#1:112,3\n99#1:115\n99#1:116,3\n*E\n"})
public final /* data */ class SearchFilter implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SearchFilter> CREATOR = new Creator();

    @NotNull
    private ArrayList<CollectionDayModel> collectionDays;

    @NotNull
    private CollectionTimeModel collectionTimes;

    @NotNull
    private ArrayList<DietPreferenceModel> dietPrefs;

    @NotNull
    private ArrayList<ItemCategory> foodTypes;
    private boolean isFromDeepLink;

    @NotNull
    private String searchText;
    private boolean showOnlyAvailable;

    @NotNull
    private SortingPreference sortOption;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ SearchFilter(boolean r4, java.util.ArrayList r5, com.app.tgtg.model.local.CollectionTimeModel r6, java.util.ArrayList r7, java.util.ArrayList r8, java.lang.String r9, com.app.tgtg.model.local.SortingPreference r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r3 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L5
            r4 = 1
        L5:
            r13 = r12 & 2
            if (r13 == 0) goto Le
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        Le:
            r13 = r12 & 4
            r0 = 0
            if (r13 == 0) goto L2d
            com.app.tgtg.model.local.CollectionTimeModel r6 = new com.app.tgtg.model.local.CollectionTimeModel
            r13 = 0
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r1 = 1103101952(0x41c00000, float:24.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float[] r13 = new java.lang.Float[]{r13, r1}
            java.util.List r13 = kotlin.collections.d0.h(r13)
            r1 = 0
            r2 = 2
            r6.<init>(r13, r0, r2, r1)
        L2d:
            r13 = r12 & 8
            if (r13 == 0) goto L36
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L36:
            r13 = r12 & 16
            if (r13 == 0) goto L3f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L3f:
            r13 = r12 & 32
            if (r13 == 0) goto L45
            java.lang.String r9 = ""
        L45:
            r13 = r12 & 64
            if (r13 == 0) goto L4b
            com.app.tgtg.model.local.SortingPreference r10 = com.app.tgtg.model.local.SortingPreference.RELEVANCE
        L4b:
            r12 = r12 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L59
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            goto L62
        L59:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r3
        L62:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.local.SearchFilter.<init>(boolean, java.util.ArrayList, com.app.tgtg.model.local.CollectionTimeModel, java.util.ArrayList, java.util.ArrayList, java.lang.String, com.app.tgtg.model.local.SortingPreference, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchFilter copy$default(SearchFilter searchFilter, boolean z11, ArrayList arrayList, CollectionTimeModel collectionTimeModel, ArrayList arrayList2, ArrayList arrayList3, String str, SortingPreference sortingPreference, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = searchFilter.showOnlyAvailable;
        }
        if ((i11 & 2) != 0) {
            arrayList = searchFilter.collectionDays;
        }
        if ((i11 & 4) != 0) {
            collectionTimeModel = searchFilter.collectionTimes;
        }
        if ((i11 & 8) != 0) {
            arrayList2 = searchFilter.foodTypes;
        }
        if ((i11 & 16) != 0) {
            arrayList3 = searchFilter.dietPrefs;
        }
        if ((i11 & 32) != 0) {
            str = searchFilter.searchText;
        }
        if ((i11 & 64) != 0) {
            sortingPreference = searchFilter.sortOption;
        }
        if ((i11 & 128) != 0) {
            z12 = searchFilter.isFromDeepLink;
        }
        SortingPreference sortingPreference2 = sortingPreference;
        boolean z13 = z12;
        ArrayList arrayList4 = arrayList3;
        String str2 = str;
        return searchFilter.copy(z11, arrayList, collectionTimeModel, arrayList2, arrayList4, str2, sortingPreference2, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowOnlyAvailable() {
        return this.showOnlyAvailable;
    }

    @NotNull
    public final ArrayList<CollectionDayModel> component2() {
        return this.collectionDays;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CollectionTimeModel getCollectionTimes() {
        return this.collectionTimes;
    }

    @NotNull
    public final ArrayList<ItemCategory> component4() {
        return this.foodTypes;
    }

    @NotNull
    public final ArrayList<DietPreferenceModel> component5() {
        return this.dietPrefs;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SortingPreference getSortOption() {
        return this.sortOption;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsFromDeepLink() {
        return this.isFromDeepLink;
    }

    @NotNull
    public final SearchFilter copy(boolean showOnlyAvailable, @NotNull ArrayList<CollectionDayModel> collectionDays, @NotNull CollectionTimeModel collectionTimes, @NotNull ArrayList<ItemCategory> foodTypes, @NotNull ArrayList<DietPreferenceModel> dietPrefs, @NotNull String searchText, @NotNull SortingPreference sortOption, boolean isFromDeepLink) {
        collectionDays.getClass();
        collectionTimes.getClass();
        foodTypes.getClass();
        dietPrefs.getClass();
        searchText.getClass();
        sortOption.getClass();
        return new SearchFilter(showOnlyAvailable, collectionDays, collectionTimes, foodTypes, dietPrefs, searchText, sortOption, isFromDeepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof SearchFilter) {
            SearchFilter searchFilter = (SearchFilter) other;
            if (this.showOnlyAvailable == searchFilter.showOnlyAvailable && Intrinsics.areEqual(this.collectionDays, searchFilter.collectionDays) && Intrinsics.areEqual(this.collectionTimes, searchFilter.collectionTimes) && Intrinsics.areEqual(this.foodTypes, searchFilter.foodTypes) && Intrinsics.areEqual(this.dietPrefs, searchFilter.dietPrefs) && Intrinsics.areEqual(this.searchText, searchFilter.searchText) && this.sortOption == searchFilter.sortOption) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ArrayList<String> getCategoriesAsStringArray() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<T> it = this.foodTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((ItemCategory) it.next()).name());
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<CollectionDayModel> getCollectionDays() {
        return this.collectionDays;
    }

    @NotNull
    public final String getCollectionDaysAsStringList() {
        return this.collectionDays.isEmpty() ? "NONE" : CollectionsKt.U(this.collectionDays, MessageLogView.COMMA_SEPARATOR, null, null, null, 62);
    }

    @NotNull
    public final List<String> getCollectionDaysStringList() {
        ArrayList<CollectionDayModel> arrayList = this.collectionDays;
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CollectionDayModel) it.next()).name());
        }
        return arrayList2;
    }

    @NotNull
    public final CollectionTimeModel getCollectionTimes() {
        return this.collectionTimes;
    }

    @NotNull
    public final ArrayList<String> getDietPreferencesAsStringArray() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<T> it = this.dietPrefs.iterator();
        while (it.hasNext()) {
            arrayList.add(((DietPreferenceModel) it.next()).name());
        }
        return arrayList;
    }

    @NotNull
    public final String getDietPreferencesAsStringList() {
        return this.dietPrefs.isEmpty() ? "NONE" : CollectionsKt.U(this.dietPrefs, MessageLogView.COMMA_SEPARATOR, null, null, null, 62);
    }

    @NotNull
    public final ArrayList<DietPreferenceModel> getDietPrefs() {
        return this.dietPrefs;
    }

    @NotNull
    public final List<String> getDietPrefsStringList() {
        ArrayList<DietPreferenceModel> arrayList = this.dietPrefs;
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((DietPreferenceModel) it.next()).name());
        }
        return arrayList2;
    }

    @NotNull
    public final ArrayList<ItemCategory> getFoodTypes() {
        return this.foodTypes;
    }

    @NotNull
    public final List<String> getFoodTypesStringList() {
        ArrayList<ItemCategory> arrayList = this.foodTypes;
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ItemCategory) it.next()).name());
        }
        return arrayList2;
    }

    @NotNull
    public final String getFootTypesAsStringList() {
        return this.foodTypes.isEmpty() ? "NONE" : CollectionsKt.U(this.foodTypes, MessageLogView.COMMA_SEPARATOR, null, null, null, 62);
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public final boolean getShowOnlyAvailable() {
        return this.showOnlyAvailable;
    }

    @NotNull
    public final SortingPreference getSortOption() {
        return this.sortOption;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.showOnlyAvailable), this.collectionDays, this.collectionTimes, this.foodTypes, this.dietPrefs, this.searchText, this.sortOption);
    }

    public final boolean isFilterOn() {
        return (this.collectionDays.isEmpty() && !this.collectionTimes.isActive() && this.foodTypes.isEmpty() && this.dietPrefs.isEmpty() && this.showOnlyAvailable) ? false : true;
    }

    public final boolean isFromDeepLink() {
        return this.isFromDeepLink;
    }

    public final boolean isPickupTimeSet() {
        return this.collectionTimes.isActive();
    }

    public final boolean isSearchOn() {
        return this.searchText.length() > 0;
    }

    public final void setCollectionDays(@NotNull ArrayList<CollectionDayModel> arrayList) {
        arrayList.getClass();
        this.collectionDays = arrayList;
    }

    public final void setCollectionTimes(@NotNull CollectionTimeModel collectionTimeModel) {
        collectionTimeModel.getClass();
        this.collectionTimes = collectionTimeModel;
    }

    public final void setDietPrefs(@NotNull ArrayList<DietPreferenceModel> arrayList) {
        arrayList.getClass();
        this.dietPrefs = arrayList;
    }

    public final void setFoodTypes(@NotNull ArrayList<ItemCategory> arrayList) {
        arrayList.getClass();
        this.foodTypes = arrayList;
    }

    public final void setFromDeepLink(boolean z11) {
        this.isFromDeepLink = z11;
    }

    public final void setSearchText(@NotNull String str) {
        str.getClass();
        this.searchText = str;
    }

    public final void setShowOnlyAvailable(boolean z11) {
        this.showOnlyAvailable = z11;
    }

    public final void setSortOption(@NotNull SortingPreference sortingPreference) {
        sortingPreference.getClass();
        this.sortOption = sortingPreference;
    }

    @NotNull
    public String toString() {
        return "ShowOnlyAvailable: " + this.showOnlyAvailable + ", time: " + this.collectionTimes + ", categories: " + this.foodTypes;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.showOnlyAvailable ? 1 : 0);
        ArrayList<CollectionDayModel> arrayList = this.collectionDays;
        dest.writeInt(arrayList.size());
        Iterator<CollectionDayModel> it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        this.collectionTimes.writeToParcel(dest, flags);
        ArrayList<ItemCategory> arrayList2 = this.foodTypes;
        dest.writeInt(arrayList2.size());
        Iterator<ItemCategory> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            dest.writeString(it2.next().name());
        }
        ArrayList<DietPreferenceModel> arrayList3 = this.dietPrefs;
        dest.writeInt(arrayList3.size());
        Iterator<DietPreferenceModel> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            dest.writeString(it3.next().name());
        }
        dest.writeString(this.searchText);
        dest.writeString(this.sortOption.name());
        dest.writeInt(this.isFromDeepLink ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchFilter createFromParcel(Parcel parcel) {
            String string;
            parcel.getClass();
            boolean z11 = parcel.readInt() != 0;
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(CollectionDayModel.valueOf(parcel.readString()));
            }
            CollectionTimeModel collectionTimeModelCreateFromParcel = CollectionTimeModel.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(ItemCategory.valueOf(parcel.readString()));
            }
            int i15 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i15);
            int i16 = 0;
            while (true) {
                string = parcel.readString();
                if (i16 == i15) {
                    break;
                }
                arrayList3.add(DietPreferenceModel.valueOf(string));
                i16++;
            }
            return new SearchFilter(z11, arrayList, collectionTimeModelCreateFromParcel, arrayList2, arrayList3, string, SortingPreference.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchFilter[] newArray(int i11) {
            return new SearchFilter[i11];
        }
    }

    public SearchFilter(boolean z11, @NotNull ArrayList<CollectionDayModel> arrayList, @NotNull CollectionTimeModel collectionTimeModel, @NotNull ArrayList<ItemCategory> arrayList2, @NotNull ArrayList<DietPreferenceModel> arrayList3, @NotNull String str, @NotNull SortingPreference sortingPreference, boolean z12) {
        arrayList.getClass();
        collectionTimeModel.getClass();
        arrayList2.getClass();
        arrayList3.getClass();
        str.getClass();
        sortingPreference.getClass();
        this.showOnlyAvailable = z11;
        this.collectionDays = arrayList;
        this.collectionTimes = collectionTimeModel;
        this.foodTypes = arrayList2;
        this.dietPrefs = arrayList3;
        this.searchText = str;
        this.sortOption = sortingPreference;
        this.isFromDeepLink = z12;
    }

    public SearchFilter() {
        this(false, null, null, null, null, null, null, false, 255, null);
    }
}
