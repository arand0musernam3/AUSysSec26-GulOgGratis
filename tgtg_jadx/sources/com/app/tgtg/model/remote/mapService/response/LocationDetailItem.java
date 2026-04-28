package com.app.tgtg.model.remote.mapService.response;

import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/LocationDetailItem;", "", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/StoreId;", "storeId", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/response/LocationDetailItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getItemId-FvU5WIY", "()Ljava/lang/String;", "getItemId-FvU5WIY$annotations", "()V", "getStoreId-Q2NXY1A", "getStoreId-Q2NXY1A$annotations", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getLocation", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getLocation$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocationDetailItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String itemId;

    @NotNull
    private final LatLngInfo location;

    @NotNull
    private final String storeId;

    private /* synthetic */ LocationDetailItem(int i11, String str, String str2, LatLngInfo latLngInfo, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, LocationDetailItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.storeId = str2;
        this.location = latLngInfo;
    }

    public static final /* synthetic */ void write$Self$app(LocationDetailItem self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, ItemId$$serializer.INSTANCE, ItemId.m197boximpl(self.itemId));
        output.i(serialDesc, 1, StoreId$$serializer.INSTANCE, StoreId.m269boximpl(self.storeId));
        output.i(serialDesc, 2, LatLngInfo$$serializer.INSTANCE, self.location);
    }

    @NotNull
    /* JADX INFO: renamed from: getItemId-FvU5WIY, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final LatLngInfo getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: getStoreId-Q2NXY1A, reason: not valid java name and from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/LocationDetailItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/response/LocationDetailItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LocationDetailItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-FvU5WIY$annotations, reason: not valid java name */
    public static /* synthetic */ void m404getItemIdFvU5WIY$annotations() {
    }

    @g("location")
    public static /* synthetic */ void getLocation$annotations() {
    }

    @g("store_id")
    /* JADX INFO: renamed from: getStoreId-Q2NXY1A$annotations, reason: not valid java name */
    public static /* synthetic */ void m405getStoreIdQ2NXY1A$annotations() {
    }

    public /* synthetic */ LocationDetailItem(String str, String str2, LatLngInfo latLngInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, latLngInfo);
    }

    public /* synthetic */ LocationDetailItem(int i11, String str, String str2, LatLngInfo latLngInfo, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, latLngInfo, m1Var);
    }

    private LocationDetailItem(String str, String str2, LatLngInfo latLngInfo) {
        str.getClass();
        str2.getClass();
        latLngInfo.getClass();
        this.itemId = str;
        this.storeId = str2;
        this.location = latLngInfo;
    }
}
