package com.app.tgtg.model.remote.item.requests;

import com.app.tgtg.model.PickupIntervalDateObject;
import com.app.tgtg.model.PickupIntervalDateObject$$serializer;
import com.app.tgtg.model.local.CollectionDayModel;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import com.braze.h2;
import com.braze.models.BrazeGeofence;
import db0.c;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0003higB©\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cB³\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0018\u0010 JÆ\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0017\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J+\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010,j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`-2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b9\u0010&J\u0010\u0010:\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b:\u0010&J\u0010\u0010;\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b=\u0010<J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b@\u0010?J\u0018\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fHÂ\u0003¢\u0006\u0004\bA\u0010?J\u0012\u0010B\u001a\u0004\u0018\u00010\rHÂ\u0003¢\u0006\u0004\bB\u0010$J\u0010\u0010C\u001a\u00020\tHÂ\u0003¢\u0006\u0004\bC\u0010<J\u0010\u0010D\u001a\u00020\tHÂ\u0003¢\u0006\u0004\bD\u0010<J\u0012\u0010E\u001a\u0004\u0018\u00010\rHÂ\u0003¢\u0006\u0004\bE\u0010$J\u0012\u0010F\u001a\u0004\u0018\u00010\rHÂ\u0003¢\u0006\u0004\bF\u0010$J\u0010\u0010G\u001a\u00020\tHÂ\u0003¢\u0006\u0004\bG\u0010<J'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010Q\u0012\u0004\bR\u0010SR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010T\u0012\u0004\bU\u0010SR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u0012\u0004\bW\u0010SR\u001a\u0010\b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u0010V\u0012\u0004\bX\u0010SR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010Y\u0012\u0004\bZ\u0010SR\u001a\u0010\u000b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010Y\u0012\u0004\b[\u0010SR$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000e\u0010\\\u0012\u0004\b]\u0010SR$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010\\\u0012\u0004\b^\u0010SR$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010\\\u0012\u0004\b_\u0010SR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0012\u0010`\u0012\u0004\ba\u0010SR\u001c\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0013\u0010Y\u0012\u0004\bb\u0010SR\u001a\u0010\u0014\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0014\u0010Y\u0012\u0004\bc\u0010SR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u0010`\u0012\u0004\bd\u0010SR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0016\u0010`\u0012\u0004\be\u0010SR\u001a\u0010\u0017\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010Y\u0012\u0004\bf\u0010S¨\u0006j"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;", "", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "origin", "", BrazeGeofence.RADIUS_METERS, "", "pageSize", "page", "", "discover", "favoritesOnly", "", "", "itemCategory", "dietCategories", "Lcom/app/tgtg/model/PickupIntervalDateObject;", "pickupIntervals", "searchPhrase", "withStockOnly", "hiddenOnly", "soldOutItemId", "sortOption", "expandRadiusIfNotEnoughItems", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;DIIZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Z)V", "Lcom/app/tgtg/model/remote/item/requests/ListItemRequest$Builder;", "builder", "(Lcom/app/tgtg/model/remote/item/requests/ListItemRequest$Builder;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/LatLngInfo;DIIZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLm90/m1;)V", "copy", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;DIIZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/local/SearchFilter;", "filters", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getPickupIntervals", "(Lcom/app/tgtg/model/local/SearchFilter;)Ljava/util/ArrayList;", "", "rawTime", "Ljava/util/Calendar;", "getTime", "(F)Ljava/util/Calendar;", "component1", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component2", "()D", "component3", "component4", "component5", "()Z", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getOrigin$annotations", "()V", "D", "getRadius$annotations", "I", "getPageSize$annotations", "getPage$annotations", "Z", "getDiscover$annotations", "getFavoritesOnly$annotations", "Ljava/util/List;", "getItemCategory$annotations", "getDietCategories$annotations", "getPickupIntervals$annotations", "Ljava/lang/String;", "getSearchPhrase$annotations", "getWithStockOnly$annotations", "getHiddenOnly$annotations", "getSoldOutItemId$annotations", "getSortOption$annotations", "getExpandRadiusIfNotEnoughItems$annotations", "Companion", "Builder", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ListItemRequest {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private List<String> dietCategories;
    private final boolean discover;
    private final boolean expandRadiusIfNotEnoughItems;
    private final boolean favoritesOnly;
    private final boolean hiddenOnly;

    @Nullable
    private List<String> itemCategory;

    @Nullable
    private final LatLngInfo origin;
    private final int page;
    private final int pageSize;

    @Nullable
    private List<PickupIntervalDateObject> pickupIntervals;
    private final double radius;

    @Nullable
    private String searchPhrase;

    @Nullable
    private String soldOutItemId;

    @Nullable
    private String sortOption;
    private boolean withStockOnly;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, l.a(mVar, new c(12)), l.a(mVar, new c(13)), l.a(mVar, new c(14)), null, null, null, null, null, null};
    }

    private ListItemRequest(Builder builder) {
        this(builder.getOrigin$app(), builder.getRadius$app(), builder.getPageSize$app(), builder.getPage$app(), builder.getDiscover$app(), builder.getFavoritesOnly$app(), (List) null, (List) null, (List) null, (String) null, builder.getWithStockOnly$app(), builder.getHiddenOnly$app(), builder.getSoldOutItemId$app(), (String) null, builder.getExpandRadiusIfNotEnoughItems$app(), 9152, (DefaultConstructorMarker) null);
        if (!this.hiddenOnly) {
            this.withStockOnly = builder.getFilter$app().getShowOnlyAvailable();
        }
        this.pickupIntervals = builder.getPickupInterval$app() != null ? builder.getPickupInterval$app() : getPickupIntervals(builder.getFilter$app());
        this.itemCategory = builder.getFilter$app().getCategoriesAsStringArray();
        this.dietCategories = builder.getFilter$app().getDietPreferencesAsStringArray();
        this.sortOption = builder.getFilter$app().getSortOption().name();
        if (builder.getFilter$app().isSearchOn()) {
            this.searchPhrase = builder.getFilter$app().getSearchText();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(PickupIntervalDateObject$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final LatLngInfo getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final String getSearchPhrase() {
        return this.searchPhrase;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    private final boolean getWithStockOnly() {
        return this.withStockOnly;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    private final boolean getHiddenOnly() {
        return this.hiddenOnly;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    private final String getSoldOutItemId() {
        return this.soldOutItemId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    private final String getSortOption() {
        return this.sortOption;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    private final boolean getExpandRadiusIfNotEnoughItems() {
        return this.expandRadiusIfNotEnoughItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final double getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final boolean getDiscover() {
        return this.discover;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final boolean getFavoritesOnly() {
        return this.favoritesOnly;
    }

    private final List<String> component7() {
        return this.itemCategory;
    }

    private final List<String> component8() {
        return this.dietCategories;
    }

    private final List<PickupIntervalDateObject> component9() {
        return this.pickupIntervals;
    }

    private final ArrayList<PickupIntervalDateObject> getPickupIntervals(SearchFilter filters) {
        if (!filters.isPickupTimeSet() && filters.getCollectionDays().isEmpty()) {
            return null;
        }
        ArrayList<PickupIntervalDateObject> arrayList = new ArrayList<>();
        Calendar time = getTime(filters.getCollectionTimes().getRawStartTime());
        Calendar time2 = getTime(filters.getCollectionTimes().getRawEndTime());
        ArrayList<CollectionDayModel> collectionDays = filters.getCollectionDays();
        CollectionDayModel collectionDayModel = CollectionDayModel.TODAY;
        if (collectionDays.contains(collectionDayModel) && collectionDays.contains(CollectionDayModel.TOMORROW)) {
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            time.add(5, 1);
            time2.add(5, 1);
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            return arrayList;
        }
        if (collectionDays.contains(collectionDayModel)) {
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            return arrayList;
        }
        if (collectionDays.contains(CollectionDayModel.TOMORROW)) {
            time.add(5, 1);
            time2.add(5, 1);
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            return arrayList;
        }
        if (filters.isPickupTimeSet()) {
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            time.add(5, 1);
            time2.add(5, 1);
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
        }
        return arrayList;
    }

    private final Calendar getTime(float rawTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar.set(13, 0);
        calendar.set(11, (int) rawTime);
        calendar.set(12, rawTime % ((float) 1) != 0.0f ? 30 : 0);
        return calendar;
    }

    public static final /* synthetic */ void write$Self$app(ListItemRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, LatLngInfo$$serializer.INSTANCE, self.origin);
        output.z(serialDesc, 1, self.radius);
        output.m(2, self.pageSize, serialDesc);
        output.m(3, self.page, serialDesc);
        output.p(serialDesc, 4, self.discover);
        output.p(serialDesc, 5, self.favoritesOnly);
        if (output.C(serialDesc) || self.itemCategory != null) {
            output.r(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.itemCategory);
        }
        if (output.C(serialDesc) || self.dietCategories != null) {
            output.r(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.dietCategories);
        }
        if (output.C(serialDesc) || self.pickupIntervals != null) {
            output.r(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.pickupIntervals);
        }
        if (output.C(serialDesc) || self.searchPhrase != null) {
            output.r(serialDesc, 9, r1.f29848a, self.searchPhrase);
        }
        output.p(serialDesc, 10, self.withStockOnly);
        output.p(serialDesc, 11, self.hiddenOnly);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 12, r1Var, self.soldOutItemId);
        if (output.C(serialDesc) || self.sortOption != null) {
            output.r(serialDesc, 13, r1Var, self.sortOption);
        }
        output.p(serialDesc, 14, self.expandRadiusIfNotEnoughItems);
    }

    @NotNull
    public final ListItemRequest copy(@Nullable LatLngInfo origin, double radius, int pageSize, int page, boolean discover, boolean favoritesOnly, @Nullable List<String> itemCategory, @Nullable List<String> dietCategories, @Nullable List<PickupIntervalDateObject> pickupIntervals, @Nullable String searchPhrase, boolean withStockOnly, boolean hiddenOnly, @Nullable String soldOutItemId, @Nullable String sortOption, boolean expandRadiusIfNotEnoughItems) {
        return new ListItemRequest(origin, radius, pageSize, page, discover, favoritesOnly, itemCategory, dietCategories, pickupIntervals, searchPhrase, withStockOnly, hiddenOnly, soldOutItemId, sortOption, expandRadiusIfNotEnoughItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListItemRequest)) {
            return false;
        }
        ListItemRequest listItemRequest = (ListItemRequest) other;
        return Intrinsics.areEqual(this.origin, listItemRequest.origin) && Double.compare(this.radius, listItemRequest.radius) == 0 && this.pageSize == listItemRequest.pageSize && this.page == listItemRequest.page && this.discover == listItemRequest.discover && this.favoritesOnly == listItemRequest.favoritesOnly && Intrinsics.areEqual(this.itemCategory, listItemRequest.itemCategory) && Intrinsics.areEqual(this.dietCategories, listItemRequest.dietCategories) && Intrinsics.areEqual(this.pickupIntervals, listItemRequest.pickupIntervals) && Intrinsics.areEqual(this.searchPhrase, listItemRequest.searchPhrase) && this.withStockOnly == listItemRequest.withStockOnly && this.hiddenOnly == listItemRequest.hiddenOnly && Intrinsics.areEqual(this.soldOutItemId, listItemRequest.soldOutItemId) && Intrinsics.areEqual(this.sortOption, listItemRequest.sortOption) && this.expandRadiusIfNotEnoughItems == listItemRequest.expandRadiusIfNotEnoughItems;
    }

    public int hashCode() {
        LatLngInfo latLngInfo = this.origin;
        int iE = k.e(k.e(k.b(this.page, k.b(this.pageSize, s.b(this.radius, (latLngInfo == null ? 0 : latLngInfo.hashCode()) * 31, 31), 31), 31), 31, this.discover), 31, this.favoritesOnly);
        List<String> list = this.itemCategory;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.dietCategories;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PickupIntervalDateObject> list3 = this.pickupIntervals;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.searchPhrase;
        int iE2 = k.e(k.e((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.withStockOnly), 31, this.hiddenOnly);
        String str2 = this.soldOutItemId;
        int iHashCode4 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sortOption;
        return Boolean.hashCode(this.expandRadiusIfNotEnoughItems) + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        LatLngInfo latLngInfo = this.origin;
        double d3 = this.radius;
        int i11 = this.pageSize;
        int i12 = this.page;
        boolean z11 = this.discover;
        boolean z12 = this.favoritesOnly;
        List<String> list = this.itemCategory;
        List<String> list2 = this.dietCategories;
        List<PickupIntervalDateObject> list3 = this.pickupIntervals;
        String str = this.searchPhrase;
        boolean z13 = this.withStockOnly;
        boolean z14 = this.hiddenOnly;
        String str2 = this.soldOutItemId;
        String str3 = this.sortOption;
        boolean z15 = this.expandRadiusIfNotEnoughItems;
        StringBuilder sb2 = new StringBuilder("ListItemRequest(origin=");
        sb2.append(latLngInfo);
        sb2.append(", radius=");
        sb2.append(d3);
        sb2.append(", pageSize=");
        sb2.append(i11);
        sb2.append(", page=");
        sb2.append(i12);
        sb2.append(", discover=");
        sb2.append(z11);
        sb2.append(", favoritesOnly=");
        sb2.append(z12);
        sb2.append(", itemCategory=");
        sb2.append(list);
        sb2.append(", dietCategories=");
        sb2.append(list2);
        sb2.append(", pickupIntervals=");
        sb2.append(list3);
        sb2.append(", searchPhrase=");
        sb2.append(str);
        sb2.append(", withStockOnly=");
        sb2.append(z13);
        sb2.append(", hiddenOnly=");
        sb2.append(z14);
        s.A(sb2, ", soldOutItemId=", str2, ", sortOption=", str3);
        sb2.append(", expandRadiusIfNotEnoughItems=");
        sb2.append(z15);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ListItemRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ListItemRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("diet_categories")
    private static /* synthetic */ void getDietCategories$annotations() {
    }

    @g("discover")
    private static /* synthetic */ void getDiscover$annotations() {
    }

    @g("expand_radius_if_not_enough_items")
    private static /* synthetic */ void getExpandRadiusIfNotEnoughItems$annotations() {
    }

    @g("favorites_only")
    private static /* synthetic */ void getFavoritesOnly$annotations() {
    }

    @g("hidden_only")
    private static /* synthetic */ void getHiddenOnly$annotations() {
    }

    @g("item_categories")
    private static /* synthetic */ void getItemCategory$annotations() {
    }

    @g("origin")
    private static /* synthetic */ void getOrigin$annotations() {
    }

    @g("page")
    private static /* synthetic */ void getPage$annotations() {
    }

    @g("page_size")
    private static /* synthetic */ void getPageSize$annotations() {
    }

    @g("pickup_intervals")
    private static /* synthetic */ void getPickupIntervals$annotations() {
    }

    @g(BrazeGeofence.RADIUS_METERS)
    private static /* synthetic */ void getRadius$annotations() {
    }

    @g("search_phrase")
    private static /* synthetic */ void getSearchPhrase$annotations() {
    }

    @g("sold_out_item_context")
    private static /* synthetic */ void getSoldOutItemId$annotations() {
    }

    @g("sort_option")
    private static /* synthetic */ void getSortOption$annotations() {
    }

    @g("with_stock_only")
    private static /* synthetic */ void getWithStockOnly$annotations() {
    }

    public /* synthetic */ ListItemRequest(int i11, LatLngInfo latLngInfo, double d3, int i12, int i13, boolean z11, boolean z12, List list, List list2, List list3, String str, boolean z13, boolean z14, String str2, String str3, boolean z15, m1 m1Var) {
        if (23615 != (i11 & 23615)) {
            c1.j(i11, 23615, ListItemRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.origin = latLngInfo;
        this.radius = d3;
        this.pageSize = i12;
        this.page = i13;
        this.discover = z11;
        this.favoritesOnly = z12;
        if ((i11 & 64) == 0) {
            this.itemCategory = null;
        } else {
            this.itemCategory = list;
        }
        if ((i11 & 128) == 0) {
            this.dietCategories = null;
        } else {
            this.dietCategories = list2;
        }
        if ((i11 & 256) == 0) {
            this.pickupIntervals = null;
        } else {
            this.pickupIntervals = list3;
        }
        if ((i11 & 512) == 0) {
            this.searchPhrase = null;
        } else {
            this.searchPhrase = str;
        }
        this.withStockOnly = z13;
        this.hiddenOnly = z14;
        this.soldOutItemId = str2;
        if ((i11 & 8192) == 0) {
            this.sortOption = null;
        } else {
            this.sortOption = str3;
        }
        this.expandRadiusIfNotEnoughItems = z15;
    }

    public ListItemRequest(@Nullable LatLngInfo latLngInfo, double d3, int i11, int i12, boolean z11, boolean z12, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<PickupIntervalDateObject> list3, @Nullable String str, boolean z13, boolean z14, @Nullable String str2, @Nullable String str3, boolean z15) {
        this.origin = latLngInfo;
        this.radius = d3;
        this.pageSize = i11;
        this.page = i12;
        this.discover = z11;
        this.favoritesOnly = z12;
        this.itemCategory = list;
        this.dietCategories = list2;
        this.pickupIntervals = list3;
        this.searchPhrase = str;
        this.withStockOnly = z13;
        this.hiddenOnly = z14;
        this.soldOutItemId = str2;
        this.sortOption = str3;
        this.expandRadiusIfNotEnoughItems = z15;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010@\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0003J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u0011J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\nJ\u000e\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0015J\u0006\u0010M\u001a\u00020NJ\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\bPJ\u000e\u0010Q\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\bRJ\u000e\u0010S\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\bTJ\u000e\u0010U\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\bVJ\u000e\u0010W\u001a\u00020\nHÀ\u0003¢\u0006\u0002\bXJ\u000e\u0010Y\u001a\u00020\nHÀ\u0003¢\u0006\u0002\bZJ\u000e\u0010[\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b\\J\u000e\u0010]\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b^J\u000e\u0010_\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\b`J\u0010\u0010a\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0002\bbJ\u000e\u0010c\u001a\u00020\nHÀ\u0003¢\u0006\u0002\bdJ\"\u0010e\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016HÀ\u0003¢\u0006\u0002\bfJ\u0099\u0001\u0010g\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\n2\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016HÆ\u0001J\u0014\u0010h\u001a\u00020\n2\b\u0010i\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010j\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010k\u001a\u00020\u0011HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010\f\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001a\u0010\r\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u0012\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006l"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ListItemRequest$Builder;", "", "origin", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", BrazeGeofence.RADIUS_METERS, "", "pageSize", "", "page", "discover", "", "favoritesOnly", "hiddenOnly", "withStockOnly", "filter", "Lcom/app/tgtg/model/local/SearchFilter;", "soldOutItemId", "", "expandRadiusIfNotEnoughItems", "pickupInterval", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/PickupIntervalDateObject;", "Lkotlin/collections/ArrayList;", "<init>", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;DIIZZZZLcom/app/tgtg/model/local/SearchFilter;Ljava/lang/String;ZLjava/util/ArrayList;)V", "getOrigin$app", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "setOrigin$app", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "getRadius$app", "()D", "setRadius$app", "(D)V", "getPageSize$app", "()I", "setPageSize$app", "(I)V", "getPage$app", "setPage$app", "getDiscover$app", "()Z", "setDiscover$app", "(Z)V", "getFavoritesOnly$app", "setFavoritesOnly$app", "getHiddenOnly$app", "setHiddenOnly$app", "getWithStockOnly$app", "setWithStockOnly$app", "getFilter$app", "()Lcom/app/tgtg/model/local/SearchFilter;", "setFilter$app", "(Lcom/app/tgtg/model/local/SearchFilter;)V", "getSoldOutItemId$app", "()Ljava/lang/String;", "setSoldOutItemId$app", "(Ljava/lang/String;)V", "getExpandRadiusIfNotEnoughItems$app", "setExpandRadiusIfNotEnoughItems$app", "getPickupInterval$app", "()Ljava/util/ArrayList;", "setPickupInterval$app", "(Ljava/util/ArrayList;)V", "setFilter", "setWithStockOnly", "setLocation", "location", "setRadius", "setPageSize", "setPage", "setSoldOutItemId", "itemId", "setHiddenOnly", "setExpandRadiusIfNotEnoughItems", "expand", "setPickupInterval", "pickupIntervals", "build", "Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;", "component1", "component1$app", "component2", "component2$app", "component3", "component3$app", "component4", "component4$app", "component5", "component5$app", "component6", "component6$app", "component7", "component7$app", "component8", "component8$app", "component9", "component9$app", "component10", "component10$app", "component11", "component11$app", "component12", "component12$app", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nListItemRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItemRequest.kt\ncom/app/tgtg/model/remote/item/requests/ListItemRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final /* data */ class Builder {
        public static final int $stable = 8;
        private boolean discover;
        private boolean expandRadiusIfNotEnoughItems;
        private boolean favoritesOnly;

        @NotNull
        private SearchFilter filter;
        private boolean hiddenOnly;

        @Nullable
        private LatLngInfo origin;
        private int page;
        private int pageSize;

        @Nullable
        private ArrayList<PickupIntervalDateObject> pickupInterval;
        private double radius;

        @Nullable
        private String soldOutItemId;
        private boolean withStockOnly;

        public /* synthetic */ Builder(LatLngInfo latLngInfo, double d3, int i11, int i12, boolean z11, boolean z12, boolean z13, boolean z14, SearchFilter searchFilter, String str, boolean z15, ArrayList arrayList, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : latLngInfo, (i13 & 2) != 0 ? 0.0d : d3, (i13 & 4) != 0 ? 400 : i11, (i13 & 8) != 0 ? 1 : i12, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? false : z14, (i13 & 256) != 0 ? new SearchFilter(false, null, null, null, null, null, null, false, 255, null) : searchFilter, (i13 & 512) != 0 ? null : str, (i13 & 1024) == 0 ? z15 : false, (i13 & NewHope.SENDB_BYTES) != 0 ? null : arrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, LatLngInfo latLngInfo, double d3, int i11, int i12, boolean z11, boolean z12, boolean z13, boolean z14, SearchFilter searchFilter, String str, boolean z15, ArrayList arrayList, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                latLngInfo = builder.origin;
            }
            return builder.copy(latLngInfo, (i13 & 2) != 0 ? builder.radius : d3, (i13 & 4) != 0 ? builder.pageSize : i11, (i13 & 8) != 0 ? builder.page : i12, (i13 & 16) != 0 ? builder.discover : z11, (i13 & 32) != 0 ? builder.favoritesOnly : z12, (i13 & 64) != 0 ? builder.hiddenOnly : z13, (i13 & 128) != 0 ? builder.withStockOnly : z14, (i13 & 256) != 0 ? builder.filter : searchFilter, (i13 & 512) != 0 ? builder.soldOutItemId : str, (i13 & 1024) != 0 ? builder.expandRadiusIfNotEnoughItems : z15, (i13 & NewHope.SENDB_BYTES) != 0 ? builder.pickupInterval : arrayList);
        }

        @NotNull
        public final ListItemRequest build() {
            ListItemRequest listItemRequest = new ListItemRequest(this, null);
            if (!(listItemRequest.radius == 0.0d)) {
                return listItemRequest;
            }
            h2.b("Missing radius");
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: component1$app, reason: from getter */
        public final LatLngInfo getOrigin() {
            return this.origin;
        }

        @Nullable
        /* JADX INFO: renamed from: component10$app, reason: from getter */
        public final String getSoldOutItemId() {
            return this.soldOutItemId;
        }

        /* JADX INFO: renamed from: component11$app, reason: from getter */
        public final boolean getExpandRadiusIfNotEnoughItems() {
            return this.expandRadiusIfNotEnoughItems;
        }

        @Nullable
        public final ArrayList<PickupIntervalDateObject> component12$app() {
            return this.pickupInterval;
        }

        /* JADX INFO: renamed from: component2$app, reason: from getter */
        public final double getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: component3$app, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        /* JADX INFO: renamed from: component4$app, reason: from getter */
        public final int getPage() {
            return this.page;
        }

        /* JADX INFO: renamed from: component5$app, reason: from getter */
        public final boolean getDiscover() {
            return this.discover;
        }

        /* JADX INFO: renamed from: component6$app, reason: from getter */
        public final boolean getFavoritesOnly() {
            return this.favoritesOnly;
        }

        /* JADX INFO: renamed from: component7$app, reason: from getter */
        public final boolean getHiddenOnly() {
            return this.hiddenOnly;
        }

        /* JADX INFO: renamed from: component8$app, reason: from getter */
        public final boolean getWithStockOnly() {
            return this.withStockOnly;
        }

        @NotNull
        /* JADX INFO: renamed from: component9$app, reason: from getter */
        public final SearchFilter getFilter() {
            return this.filter;
        }

        @NotNull
        public final Builder copy(@Nullable LatLngInfo origin, double radius, int pageSize, int page, boolean discover, boolean favoritesOnly, boolean hiddenOnly, boolean withStockOnly, @NotNull SearchFilter filter, @Nullable String soldOutItemId, boolean expandRadiusIfNotEnoughItems, @Nullable ArrayList<PickupIntervalDateObject> pickupInterval) {
            filter.getClass();
            return new Builder(origin, radius, pageSize, page, discover, favoritesOnly, hiddenOnly, withStockOnly, filter, soldOutItemId, expandRadiusIfNotEnoughItems, pickupInterval);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.origin, builder.origin) && Double.compare(this.radius, builder.radius) == 0 && this.pageSize == builder.pageSize && this.page == builder.page && this.discover == builder.discover && this.favoritesOnly == builder.favoritesOnly && this.hiddenOnly == builder.hiddenOnly && this.withStockOnly == builder.withStockOnly && Intrinsics.areEqual(this.filter, builder.filter) && Intrinsics.areEqual(this.soldOutItemId, builder.soldOutItemId) && this.expandRadiusIfNotEnoughItems == builder.expandRadiusIfNotEnoughItems && Intrinsics.areEqual(this.pickupInterval, builder.pickupInterval);
        }

        public final boolean getDiscover$app() {
            return this.discover;
        }

        public final boolean getExpandRadiusIfNotEnoughItems$app() {
            return this.expandRadiusIfNotEnoughItems;
        }

        public final boolean getFavoritesOnly$app() {
            return this.favoritesOnly;
        }

        @NotNull
        public final SearchFilter getFilter$app() {
            return this.filter;
        }

        public final boolean getHiddenOnly$app() {
            return this.hiddenOnly;
        }

        @Nullable
        public final LatLngInfo getOrigin$app() {
            return this.origin;
        }

        public final int getPage$app() {
            return this.page;
        }

        public final int getPageSize$app() {
            return this.pageSize;
        }

        @Nullable
        public final ArrayList<PickupIntervalDateObject> getPickupInterval$app() {
            return this.pickupInterval;
        }

        public final double getRadius$app() {
            return this.radius;
        }

        @Nullable
        public final String getSoldOutItemId$app() {
            return this.soldOutItemId;
        }

        public final boolean getWithStockOnly$app() {
            return this.withStockOnly;
        }

        public int hashCode() {
            LatLngInfo latLngInfo = this.origin;
            int iHashCode = (this.filter.hashCode() + k.e(k.e(k.e(k.e(k.b(this.page, k.b(this.pageSize, s.b(this.radius, (latLngInfo == null ? 0 : latLngInfo.hashCode()) * 31, 31), 31), 31), 31, this.discover), 31, this.favoritesOnly), 31, this.hiddenOnly), 31, this.withStockOnly)) * 31;
            String str = this.soldOutItemId;
            int iE = k.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.expandRadiusIfNotEnoughItems);
            ArrayList<PickupIntervalDateObject> arrayList = this.pickupInterval;
            return iE + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setDiscover$app(boolean z11) {
            this.discover = z11;
        }

        @NotNull
        public final Builder setExpandRadiusIfNotEnoughItems(boolean expand) {
            this.expandRadiusIfNotEnoughItems = expand;
            return this;
        }

        public final void setExpandRadiusIfNotEnoughItems$app(boolean z11) {
            this.expandRadiusIfNotEnoughItems = z11;
        }

        public final void setFavoritesOnly$app(boolean z11) {
            this.favoritesOnly = z11;
        }

        @NotNull
        public final Builder setFilter(@NotNull SearchFilter filter) {
            filter.getClass();
            this.filter = filter;
            return this;
        }

        public final void setFilter$app(@NotNull SearchFilter searchFilter) {
            searchFilter.getClass();
            this.filter = searchFilter;
        }

        @NotNull
        public final Builder setHiddenOnly(boolean hiddenOnly) {
            this.radius = 30.0d;
            this.pageSize = 10;
            this.hiddenOnly = hiddenOnly;
            return this;
        }

        public final void setHiddenOnly$app(boolean z11) {
            this.hiddenOnly = z11;
        }

        @NotNull
        public final Builder setLocation(@NotNull LatLngInfo location) {
            location.getClass();
            this.origin = location;
            return this;
        }

        public final void setOrigin$app(@Nullable LatLngInfo latLngInfo) {
            this.origin = latLngInfo;
        }

        @NotNull
        public final Builder setPage(int page) {
            this.page = page;
            return this;
        }

        public final void setPage$app(int i11) {
            this.page = i11;
        }

        @NotNull
        public final Builder setPageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public final void setPageSize$app(int i11) {
            this.pageSize = i11;
        }

        @NotNull
        public final Builder setPickupInterval(@NotNull PickupIntervalDateObject pickupIntervals) {
            pickupIntervals.getClass();
            this.pickupInterval = d0.d(pickupIntervals);
            return this;
        }

        public final void setPickupInterval$app(@Nullable ArrayList<PickupIntervalDateObject> arrayList) {
            this.pickupInterval = arrayList;
        }

        @NotNull
        public final Builder setRadius(double radius) {
            this.radius = radius;
            return this;
        }

        public final void setRadius$app(double d3) {
            this.radius = d3;
        }

        @NotNull
        public final Builder setSoldOutItemId(@NotNull String itemId) {
            itemId.getClass();
            this.soldOutItemId = itemId;
            return this;
        }

        public final void setSoldOutItemId$app(@Nullable String str) {
            this.soldOutItemId = str;
        }

        @NotNull
        public final Builder setWithStockOnly(boolean withStockOnly) {
            this.withStockOnly = withStockOnly;
            return this;
        }

        public final void setWithStockOnly$app(boolean z11) {
            this.withStockOnly = z11;
        }

        @NotNull
        public String toString() {
            return "Builder(origin=" + this.origin + ", radius=" + this.radius + ", pageSize=" + this.pageSize + ", page=" + this.page + ", discover=" + this.discover + ", favoritesOnly=" + this.favoritesOnly + ", hiddenOnly=" + this.hiddenOnly + ", withStockOnly=" + this.withStockOnly + ", filter=" + this.filter + ", soldOutItemId=" + this.soldOutItemId + ", expandRadiusIfNotEnoughItems=" + this.expandRadiusIfNotEnoughItems + ", pickupInterval=" + this.pickupInterval + ")";
        }

        public Builder(@Nullable LatLngInfo latLngInfo, double d3, int i11, int i12, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull SearchFilter searchFilter, @Nullable String str, boolean z15, @Nullable ArrayList<PickupIntervalDateObject> arrayList) {
            searchFilter.getClass();
            this.origin = latLngInfo;
            this.radius = d3;
            this.pageSize = i11;
            this.page = i12;
            this.discover = z11;
            this.favoritesOnly = z12;
            this.hiddenOnly = z13;
            this.withStockOnly = z14;
            this.filter = searchFilter;
            this.soldOutItemId = str;
            this.expandRadiusIfNotEnoughItems = z15;
            this.pickupInterval = arrayList;
        }

        public Builder() {
            this(null, 0.0d, 0, 0, false, false, false, false, null, null, false, null, 4095, null);
        }
    }

    public /* synthetic */ ListItemRequest(LatLngInfo latLngInfo, double d3, int i11, int i12, boolean z11, boolean z12, List list, List list2, List list3, String str, boolean z13, boolean z14, String str2, String str3, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(latLngInfo, d3, i11, i12, z11, z12, (i13 & 64) != 0 ? null : list, (i13 & 128) != 0 ? null : list2, (i13 & 256) != 0 ? null : list3, (i13 & 512) != 0 ? null : str, z13, z14, str2, (i13 & 8192) != 0 ? null : str3, z15);
    }

    public /* synthetic */ ListItemRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
