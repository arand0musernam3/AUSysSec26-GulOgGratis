package rm;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import mv.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MapClustersResponse f38141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f38142b;

    public final LinkedHashMap a() {
        ArrayList arrayList = this.f38142b;
        if (arrayList != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                String strM370getStoreId7QsYvu8 = d.m((BasicItem) obj).m370getStoreId7QsYvu8();
                if (strM370getStoreId7QsYvu8 == null) {
                    strM370getStoreId7QsYvu8 = null;
                }
                Object arrayList2 = linkedHashMap.get(strM370getStoreId7QsYvu8);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(strM370getStoreId7QsYvu8, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(w0.a(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(d.m((BasicItem) CollectionsKt.O((List) entry.getValue())), entry.getValue());
            }
            List listN = z0.n(linkedHashMap2);
            if (listN != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj2 : listN) {
                    StoreLocation storeLocation = ((StoreInformation) ((Pair) obj2).f26485a).getStoreLocation();
                    LatLngInfo latLngInfo = storeLocation != null ? storeLocation.getLatLngInfo() : null;
                    latLngInfo.getClass();
                    Object arrayList3 = linkedHashMap3.get(latLngInfo);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(latLngInfo, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                return linkedHashMap3;
            }
        }
        return null;
    }

    public final void b(MapClustersResponse mapClustersResponse) {
        ArrayList arrayList;
        this.f38141a = mapClustersResponse;
        List<BasicItem> fullDetailItems = mapClustersResponse.getFullDetailItems();
        if (fullDetailItems != null) {
            arrayList = new ArrayList();
            for (Object obj : fullDetailItems) {
                BasicItem basicItem = (BasicItem) obj;
                if (basicItem.getMatchesFilters() == null || Intrinsics.areEqual(basicItem.getMatchesFilters(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        this.f38142b = arrayList;
    }
}
