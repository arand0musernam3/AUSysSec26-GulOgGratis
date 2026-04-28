package tm;

import android.content.SharedPreferences;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.m0;
import ao.r1;
import ao.z1;
import com.app.tgtg.model.PickupIntervalDateObject;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.ItemDetailLevel;
import com.app.tgtg.model.remote.mapService.request.FilteredBy;
import com.app.tgtg.model.remote.mapService.request.MapClustersRequestKt;
import com.app.tgtg.model.remote.mapService.response.Clusters;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.google.android.gms.internal.measurement.cg;
import cv.i;
import ft.j;
import h0.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.u;
import pm.z;
import r8.k;
import sr.r;
import v80.f0;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltm/e;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrowseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowseViewModel.kt\ncom/app/tgtg/feature/main/fragments/browse/viewmodel/BrowseViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,822:1\n1#2:823\n1512#3:824\n1538#3,3:825\n1541#3,3:835\n1512#3:838\n1538#3,3:839\n1541#3,3:849\n1512#3:856\n1538#3,3:857\n1541#3,3:867\n1512#3:876\n1538#3,3:877\n1541#3,3:887\n777#3:890\n873#3,2:891\n410#4,7:828\n410#4,7:842\n410#4,7:860\n410#4,7:880\n129#5:852\n158#5,3:853\n193#5,3:870\n193#5,3:873\n*S KotlinDebug\n*F\n+ 1 BrowseViewModel.kt\ncom/app/tgtg/feature/main/fragments/browse/viewmodel/BrowseViewModel\n*L\n511#1:824\n511#1:825,3\n511#1:835,3\n517#1:838\n517#1:839,3\n517#1:849,3\n519#1:856\n519#1:857,3\n519#1:867,3\n575#1:876\n575#1:877,3\n575#1:887,3\n600#1:890\n600#1:891,2\n511#1:828,7\n517#1:842,7\n519#1:860,7\n575#1:880,7\n518#1:852\n518#1:853,3\n520#1:870,3\n521#1:873,3\n*E\n"})
public final class e extends l1 {
    public final o0 A;
    public boolean B;
    public boolean C;
    public final o0 D;
    public final o0 E;
    public final h1 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public final int K;
    public LatLngInfo L;
    public int M;
    public int N;
    public final int O;
    public final int P;
    public boolean Q;
    public final int R;
    public boolean S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f40306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f40307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f40308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f40309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.b f40310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f40311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rg.d f40312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rm.c f40313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z1 f40314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g3 f40315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jm.b f40316k;
    public final ij.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f40317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f40318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f40319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f40320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f40321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f40322r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f40323s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f40324t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Map f40325u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o0 f40326v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o0 f40327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f40328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0 f40329y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o0 f40330z;

    public e(r1 r1Var, cv.b bVar, j jVar, m0 m0Var, ft.b bVar2, u uVar, wj.d dVar, rg.d dVar2, rm.c cVar, z1 z1Var, g3 g3Var, jm.b bVar3, ij.b bVar4) {
        r1Var.getClass();
        bVar.getClass();
        jVar.getClass();
        m0Var.getClass();
        bVar2.getClass();
        uVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        z1Var.getClass();
        g3Var.getClass();
        bVar3.getClass();
        bVar4.getClass();
        this.f40306a = r1Var;
        this.f40307b = bVar;
        this.f40308c = jVar;
        this.f40309d = m0Var;
        this.f40310e = bVar2;
        this.f40311f = uVar;
        this.f40312g = dVar2;
        this.f40313h = cVar;
        this.f40314i = z1Var;
        this.f40315j = g3Var;
        this.f40316k = bVar3;
        this.l = bVar4;
        this.f40317m = new o0();
        o0 o0Var = new o0();
        Boolean bool = Boolean.FALSE;
        o0Var.k(bool);
        this.f40318n = o0Var;
        this.f40319o = new o0();
        this.f40320p = new o0();
        o0 o0Var2 = new o0();
        this.f40321q = o0Var2;
        this.f40322r = o0Var2;
        o0 o0Var3 = new o0();
        this.f40323s = o0Var3;
        this.f40324t = o0Var3;
        o0 o0Var4 = new o0();
        this.f40326v = o0Var4;
        this.f40327w = o0Var4;
        o0 o0Var5 = new o0();
        this.f40328x = o0Var5;
        this.f40329y = o0Var5;
        o0 o0Var6 = new o0();
        this.f40330z = o0Var6;
        this.A = o0Var6;
        o0 o0Var7 = new o0(bool);
        this.D = o0Var7;
        this.E = o0Var7;
        this.F = dVar.f43510f;
        this.K = 60000;
        this.N = 1;
        this.O = 1;
        this.P = 400;
        this.R = 10;
        if (z1Var.f4511d) {
            return;
        }
        z1Var.f4511d = true;
        ft.c.I("HalfExpanded");
    }

    public static final FilteredBy a(e eVar) {
        ArrayList arrayListD;
        ij.b bVar = eVar.l;
        ft.b bVar2 = eVar.f40310e;
        if (!eVar.f40311f.c()) {
            bVar2.getClass();
            return new FilteredBy(ft.b.a().getCategoriesAsStringArray(), ft.b.a().getDietPreferencesAsStringArray(), MapClustersRequestKt.getPickupIntervals(ft.b.a()), ft.b.a().isSearchOn() ? StringsKt.e0(ft.b.a().getSearchText()).toString() : null, ft.b.a().getShowOnlyAvailable());
        }
        List listR0 = CollectionsKt.r0((Iterable) bVar.f24031d.f45488a.getValue());
        List listR02 = CollectionsKt.r0((Iterable) bVar.f24033f.f45488a.getValue());
        if (bVar.c()) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(11, 3);
            arrayListD = d0.d(new PickupIntervalDateObject(calendar.getTime(), calendar2.getTime()));
        } else {
            Pair pair = (Pair) bVar.l.f45488a.getValue();
            if (pair == null) {
                arrayListD = null;
            } else {
                int iIntValue = ((Number) pair.f26485a).intValue();
                int iIntValue2 = ((Number) pair.f26486b).intValue();
                gj.a aVar = (gj.a) bVar.f24040n.f45488a.getValue();
                int i11 = aVar == null ? -1 : ij.a.$EnumSwitchMapping$0[aVar.ordinal()];
                if (i11 == -1) {
                    arrayListD = iIntValue < iIntValue2 ? d0.d(new PickupIntervalDateObject(ij.b.a(0, iIntValue).getTime(), ij.b.a(0, iIntValue2).getTime())) : d0.d(new PickupIntervalDateObject(ij.b.a(0, iIntValue).getTime(), ij.b.a(1, iIntValue2).getTime()));
                } else if (i11 == 1) {
                    arrayListD = d0.d(new PickupIntervalDateObject(ij.b.a(0, iIntValue).getTime(), ij.b.a(0, iIntValue2).getTime()));
                } else if (i11 == 2) {
                    arrayListD = d0.d(new PickupIntervalDateObject(ij.b.a(0, iIntValue).getTime(), ij.b.a(1, 0).getTime()));
                } else {
                    if (i11 != 3) {
                        e40.a.f();
                        return null;
                    }
                    arrayListD = d0.d(new PickupIntervalDateObject(ij.b.a(1, 0).getTime(), ij.b.a(1, iIntValue2).getTime()));
                }
            }
        }
        bVar2.getClass();
        return new FilteredBy(listR0, listR02, arrayListD, ft.b.a().isSearchOn() ? StringsKt.e0(ft.b.a().getSearchText()).toString() : null, !((Boolean) bVar.f24042p.f45488a.getValue()).booleanValue());
    }

    public static final List b(e eVar) {
        eVar.getClass();
        try {
            return eVar.f40315j.m().getUserPointsOfInterests();
        } catch (Exception e5) {
            mv.m0 m0Var = sa0.a.f38953a;
            m0Var.h("BrowseViewModel");
            m0Var.e(e5, "Failed to get user points of interest", new Object[0]);
            return null;
        }
    }

    public static st.b f() {
        ft.d dVar = ft.e.f17923d;
        if (dVar.f17910f == null) {
            SharedPreferences sharedPreferencesX = ft.c.x();
            String strY = ft.c.y();
            if (strY == null) {
                strY = null;
            }
            double dLongBitsToDouble = Double.longBitsToDouble(sharedPreferencesX.getLong(k.l(strY, "lat_browse"), Double.doubleToRawLongBits(0.0d)));
            SharedPreferences sharedPreferencesX2 = ft.c.x();
            String strY2 = ft.c.y();
            dVar.f17910f = new st.b(dLongBitsToDouble, Double.longBitsToDouble(sharedPreferencesX2.getLong(k.l(strY2 != null ? strY2 : null, "lng_browse"), Double.doubleToRawLongBits(0.0d))));
        }
        st.b bVar = ft.e.f17923d.f17910f;
        return bVar == null ? new st.b(0.0d, 0.0d) : bVar;
    }

    public final BasicItem c(LatLngInfo latLngInfo) {
        List list;
        latLngInfo.getClass();
        Map map = this.f40325u;
        if (map == null || (list = (List) map.get(latLngInfo)) == null) {
            return null;
        }
        return (BasicItem) list.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (((java.lang.Boolean) r0.f24042p.f45488a.getValue()).booleanValue() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (ft.b.a().isSearchOn() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        return new com.app.tgtg.model.local.GenericErrors.MapViewTooWide(new sr.r(22));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.app.tgtg.model.local.GenericErrors d() {
        /*
            r3 = this;
            mv.u r0 = r3.f40311f
            boolean r0 = r0.c()
            ft.b r1 = r3.f40310e
            if (r0 == 0) goto L70
            r1.getClass()
            com.app.tgtg.model.local.SearchFilter r0 = ft.b.a()
            boolean r1 = r0.isSearchOn()
            if (r1 != 0) goto L95
            boolean r0 = r0.isFilterOn()
            if (r0 != 0) goto L95
            ij.b r0 = r3.l
            y80.h1 r1 = r0.f24031d
            y80.y1 r1 = r1.f45488a
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L95
            y80.h1 r1 = r0.f24033f
            y80.y1 r1 = r1.f45488a
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L95
            y80.h1 r1 = r0.f24029b
            y80.y1 r1 = r1.f45488a
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L95
            y80.h1 r1 = r0.l
            y80.y1 r1 = r1.f45488a
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto L95
            boolean r1 = r0.c()
            if (r1 != 0) goto L95
            y80.h1 r0 = r0.f24042p
            y80.y1 r0 = r0.f45488a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L88
            goto L95
        L70:
            r1.getClass()
            com.app.tgtg.model.local.SearchFilter r0 = ft.b.a()
            boolean r0 = r0.isFilterOn()
            if (r0 != 0) goto L95
            com.app.tgtg.model.local.SearchFilter r0 = ft.b.a()
            boolean r0 = r0.isSearchOn()
            if (r0 == 0) goto L88
            goto L95
        L88:
            com.app.tgtg.model.local.GenericErrors$MapViewTooWide r0 = new com.app.tgtg.model.local.GenericErrors$MapViewTooWide
            sr.r r1 = new sr.r
            r2 = 22
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        L95:
            com.app.tgtg.model.local.GenericErrors$NoResultWithFilterOn r0 = new com.app.tgtg.model.local.GenericErrors$NoResultWithFilterOn
            sr.r r1 = new sr.r
            r2 = 21
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.e.d():com.app.tgtg.model.local.GenericErrors");
    }

    public final pm.j e() {
        this.f40314i.getClass();
        SharedPreferences sharedPreferencesX = ft.c.x();
        String strY = ft.c.y();
        Object obj = null;
        if (strY == null) {
            strY = null;
        }
        String string = sharedPreferencesX.getString(strY + "_browseStartSheetStatus", "HalfExpanded");
        if (string == null) {
            return null;
        }
        Iterator<E> it = pm.j.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((pm.j) next).name(), string)) {
                obj = next;
                break;
            }
        }
        return (pm.j) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.ArrayList] */
    public final void g(xk.b bVar) {
        ?? arrayList;
        StoreLocation storeLocation;
        LatLngInfo latLngInfo;
        MapClustersResponse mapClustersResponse = (MapClustersResponse) this.f40321q.d();
        boolean zQ = cg.q(mapClustersResponse != null ? mapClustersResponse.getFullDetailItems() : null);
        o0 o0Var = this.f40330z;
        if (!zQ) {
            List<Clusters> clusters = mapClustersResponse != null ? mapClustersResponse.getClusters() : null;
            ?? r13 = clusters == null || clusters.isEmpty();
            size = (mapClustersResponse != null ? mapClustersResponse.getItemDetailLevel() : null) == ItemDetailLevel.NONE ? 1 : 0;
            if (!r13 == true || size == 0) {
                o0Var.k(new qt.a(new GenericErrors.MapViewTooWide(new r(23))));
                return;
            } else {
                o0Var.i(new qt.a(d()));
                return;
            }
        }
        if (mapClustersResponse != null) {
            List<BasicItem> fullDetailItems = mapClustersResponse.getFullDetailItems();
            if (fullDetailItems == null) {
                fullDetailItems = n0.f26529a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : fullDetailItems) {
                String strM370getStoreId7QsYvu8 = mv.d.m((BasicItem) obj).m370getStoreId7QsYvu8();
                StoreId storeIdM269boximpl = strM370getStoreId7QsYvu8 != null ? StoreId.m269boximpl(strM370getStoreId7QsYvu8) : null;
                ?? arrayList2 = linkedHashMap.get(storeIdM269boximpl);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(storeIdM269boximpl, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            List listR0 = CollectionsKt.r0(linkedHashMap.values());
            List list = listR0.isEmpty() ? null : listR0;
            if (list == null || list.isEmpty()) {
                arrayList = n0.f26529a;
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    BasicItem basicItem = (BasicItem) CollectionsKt.firstOrNull((List) obj2);
                    if (basicItem != null && (storeLocation = mv.d.m(basicItem).getStoreLocation()) != null && (latLngInfo = storeLocation.getLatLngInfo()) != null) {
                        LatLngInfo latLngInfo2 = bVar.f44440a;
                        LatLngInfo latLngInfo3 = bVar.f44441b;
                        if (latLngInfo3.getLatitude() >= latLngInfo.getLatitude() && latLngInfo2.getLatitude() <= latLngInfo.getLatitude() && latLngInfo3.getLongitude() >= latLngInfo.getLongitude() && latLngInfo2.getLongitude() <= latLngInfo.getLongitude()) {
                            arrayList.add(obj2);
                        }
                    }
                }
            }
            if (!cg.q(arrayList)) {
                o0Var.i(new qt.a(d()));
                return;
            }
            if (arrayList != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    size += ((List) it.next()).size();
                }
            }
            this.f40328x.i(new z(arrayList, size));
        }
    }

    public final int h(LatLngInfo latLngInfo) {
        List list;
        latLngInfo.getClass();
        Map map = this.f40325u;
        Integer numValueOf = null;
        if (map != null && (list = (List) map.get(latLngInfo)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String strM370getStoreId7QsYvu8 = mv.d.m((BasicItem) obj).m370getStoreId7QsYvu8();
                StoreId storeIdM269boximpl = strM370getStoreId7QsYvu8 != null ? StoreId.m269boximpl(strM370getStoreId7QsYvu8) : null;
                Object arrayList = linkedHashMap.get(storeIdM269boximpl);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(storeIdM269boximpl, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            numValueOf = Integer.valueOf(linkedHashMap.size());
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final boolean i() {
        return this.J == 0 || System.currentTimeMillis() - this.J >= ((long) (this.K * 2));
    }

    public final float j() {
        SharedPreferences sharedPreferencesX = ft.c.x();
        String strY = ft.c.y();
        if (strY == null) {
            strY = null;
        }
        float f11 = sharedPreferencesX.getFloat(strY + "zoomLevelBrowse", 15.0f);
        if (this.f40311f.b()) {
            return 13.0f;
        }
        return f11;
    }

    public final void k(pm.j jVar, boolean z11) {
        jVar.getClass();
        if (z11) {
            return;
        }
        this.f40314i.getClass();
        ft.c.I(jVar.name());
        if (this.f40311f.b()) {
            int i11 = a.$EnumSwitchMapping$0[jVar.ordinal()];
            if (i11 == 1) {
                m("Map");
                return;
            }
            if (i11 == 2) {
                m("Half");
            } else if (i11 == 3) {
                m("List");
            } else {
                e40.a.f();
            }
        }
    }

    public final void l(BasicItem basicItem) {
        basicItem.getClass();
        f0.B(m1.d(this), null, null, new d(this, basicItem, null, 0), 3);
    }

    public final void m(String str) {
        n(i.SCREEN_BROWSE, g.E(new Pair(dv.a.CURRENT_STATE, new dv.c(str))));
    }

    public final void n(i iVar, dv.b bVar) {
        iVar.getClass();
        this.f40307b.c(iVar, bVar);
    }
}
