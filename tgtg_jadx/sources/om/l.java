package om;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g1;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.p0;
import c1.q;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.DietPreferenceModel;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.Clusters;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.p;
import m2.c2;
import m3.k1;
import m3.s;
import o00.x0;
import pm.y;
import pm.z;
import u70.t;
import v80.b0;
import v80.f0;
import v80.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lom/l;", "Landroidx/fragment/app/Fragment;", "Lv80/b0;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentMap.kt\ncom/app/tgtg/feature/main/fragments/browse/map/FragmentMap\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1352:1\n172#2,9:1353\n172#2,9:1362\n85#3:1371\n117#3,2:1372\n257#4,2:1374\n257#4,2:1376\n257#4,2:1378\n257#4,2:1380\n257#4,2:1382\n257#4,2:1384\n257#4,2:1386\n257#4,2:1388\n257#4,2:1390\n257#4,2:1392\n257#4,2:1394\n176#4,2:1422\n176#4,2:1424\n257#4,2:1426\n257#4,2:1436\n257#4,2:1438\n257#4,2:1440\n257#4,2:1454\n257#4,2:1462\n257#4,2:1464\n257#4,2:1466\n257#4,2:1468\n257#4,2:1470\n257#4,2:1472\n1#5:1396\n221#6,2:1397\n221#6,2:1413\n518#7,7:1399\n518#7,7:1406\n518#7,7:1415\n1586#8:1428\n1661#8,3:1429\n1586#8:1432\n1661#8,3:1433\n1128#9,6:1442\n1128#9,6:1448\n1128#9,6:1456\n*S KotlinDebug\n*F\n+ 1 FragmentMap.kt\ncom/app/tgtg/feature/main/fragments/browse/map/FragmentMap\n*L\n114#1:1353,9\n115#1:1362,9\n143#1:1371\n143#1:1372,2\n233#1:1374,2\n234#1:1376,2\n280#1:1378,2\n281#1:1380,2\n317#1:1382,2\n318#1:1384,2\n464#1:1386,2\n465#1:1388,2\n467#1:1390,2\n468#1:1392,2\n557#1:1394,2\n944#1:1422,2\n1010#1:1424,2\n1205#1:1426,2\n1311#1:1436,2\n168#1:1438,2\n310#1:1440,2\n291#1:1454,2\n353#1:1462,2\n751#1:1464,2\n767#1:1466,2\n819#1:1468,2\n1222#1:1470,2\n1215#1:1472,2\n586#1:1397,2\n638#1:1413,2\n632#1:1399,7\n635#1:1406,7\n639#1:1415,7\n1286#1:1428\n1286#1:1429,3\n1288#1:1432\n1288#1:1433,3\n267#1:1442,6\n273#1:1448,6\n306#1:1456,6\n*E\n"})
public final class l extends jg.d implements b0 {
    public boolean A;
    public pg.c B;
    public final LinkedHashMap C;
    public final ActivityResultLauncher D;
    public final d E;
    public final d F;
    public final c G;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f32671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1 f32674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n1 f32675k;
    public final j1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public rt.f f32676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public st.a f32677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t00.c f32678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rt.a f32679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Double f32680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public st.b f32681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f32682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LatLngInfo f32683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LatLngInfo f32684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f32685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f32686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f32687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FrameLayout f32688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k1 f32689z;

    /* JADX WARN: Type inference failed for: r0v15, types: [om.d] */
    /* JADX WARN: Type inference failed for: r0v16, types: [om.d] */
    public l() {
        super(2);
        this.f32672h = true;
        this.f32674j = new n1(Reflection.getOrCreateKotlinClass(tm.e.class), new k(this, 0), new k(this, 2), new k(this, 1));
        this.f32675k = new n1(Reflection.getOrCreateKotlinClass(zj.j.class), new k(this, 3), new k(this, 5), new k(this, 4));
        this.l = f0.c();
        this.f32679p = new rt.a();
        this.f32682s = new LinkedHashMap();
        this.f32685v = new y(null, null, null);
        this.f32689z = m3.i.w(sm.b.DEFAULT);
        this.C = new LinkedHashMap();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new g1(3), new mp.a(this, 3));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.D = activityResultLauncherRegisterForActivityResult;
        final int i11 = 0;
        this.E = new p0(this) { // from class: om.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f32652b;

            {
                this.f32652b = this;
            }

            @Override // androidx.lifecycle.p0
            public final void a(Object obj) {
                int i12;
                StoreInformation storeInformationM;
                Picture logoPicture;
                StoreInformation storeInformationM2;
                Picture logoPicture2;
                Clusters clusters;
                z zVar;
                List<Clusters> clusters2;
                Object next;
                int i13 = 0;
                switch (i11) {
                    case 0:
                        Map map = (Map) obj;
                        map.getClass();
                        l lVar = this.f32652b;
                        LinkedHashMap linkedHashMap = lVar.f32682s;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            LatLngInfo latLngInfo = (LatLngInfo) entry.getKey();
                            if (!linkedHashMap.containsKey(latLngInfo) || linkedHashMap.get(latLngInfo) != map.get(latLngInfo)) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            LatLngInfo latLngInfo2 = (LatLngInfo) entry2.getKey();
                            if (!map.containsKey(latLngInfo2) || linkedHashMap.get(latLngInfo2) != map.get(latLngInfo2)) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            st.a aVar = lVar.f32677n;
                            if (aVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                aVar = null;
                            }
                            ((rt.d) aVar).m((LatLngInfo) entry3.getKey());
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                            LatLngInfo latLngInfo3 = (LatLngInfo) entry4.getKey();
                            if (map.containsKey(latLngInfo3) && linkedHashMap.get(latLngInfo3) == map.get(latLngInfo3)) {
                                linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                            }
                        }
                        linkedHashMap.clear();
                        linkedHashMap.putAll(linkedHashMap4);
                        linkedHashMap.putAll(linkedHashMap2);
                        for (Map.Entry entry5 : linkedHashMap2.entrySet()) {
                            o oVar = (o) entry5.getValue();
                            int[] iArr = e.$EnumSwitchMapping$0;
                            switch (iArr[oVar.ordinal()]) {
                                case 1:
                                    BasicItem basicItemC = lVar.C().c((LatLngInfo) entry5.getKey());
                                    l.w(lVar, (LatLngInfo) entry5.getKey(), (basicItemC == null || (storeInformationM = mv.d.m(basicItemC)) == null || (logoPicture = storeInformationM.getLogoPicture()) == null) ? null : logoPicture.getCurrentUrl(), false, true, 4);
                                    break;
                                case 2:
                                    l.x(lVar, (LatLngInfo) entry5.getKey(), lVar.C().h((LatLngInfo) entry5.getKey()), false, 12);
                                    break;
                                case 3:
                                case 4:
                                    LatLngInfo latLngInfo4 = (LatLngInfo) entry5.getKey();
                                    BasicItem basicItemC2 = lVar.C().c((LatLngInfo) entry5.getKey());
                                    l.w(lVar, latLngInfo4, (basicItemC2 == null || (storeInformationM2 = mv.d.m(basicItemC2)) == null || (logoPicture2 = storeInformationM2.getLogoPicture()) == null) ? null : logoPicture2.getCurrentUrl(), false, false, 12);
                                    break;
                                case 5:
                                    LatLngInfo latLngInfo5 = (LatLngInfo) entry5.getKey();
                                    tm.e eVarC = lVar.C();
                                    LatLngInfo latLngInfo6 = (LatLngInfo) entry5.getKey();
                                    eVarC.getClass();
                                    latLngInfo6.getClass();
                                    MapClustersResponse mapClustersResponse = (MapClustersResponse) eVarC.f40321q.d();
                                    if (mapClustersResponse == null || (clusters2 = mapClustersResponse.getClusters()) == null) {
                                        clusters = null;
                                    } else {
                                        Iterator<T> it = clusters2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                Clusters clusters3 = (Clusters) next;
                                                if (clusters3.getLocation().getLatitude() != latLngInfo6.getLatitude() || clusters3.getLocation().getLongitude() != latLngInfo6.getLongitude()) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        clusters = (Clusters) next;
                                    }
                                    int count = clusters != null ? clusters.getCount() : 0;
                                    mc.a aVarA = mc.a.a(lVar.getLayoutInflater());
                                    ((AppCompatTextView) aVarA.f29924d).setText(String.valueOf(count));
                                    st.a aVar2 = lVar.f32677n;
                                    if (aVar2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                        aVar2 = null;
                                    }
                                    ConstraintLayout constraintLayout = (ConstraintLayout) aVarA.f29922b;
                                    constraintLayout.getClass();
                                    Context contextRequireContext = lVar.requireContext();
                                    contextRequireContext.getClass();
                                    ((rt.d) aVar2).c(latLngInfo5, constraintLayout, contextRequireContext);
                                    pg.c cVar = lVar.B;
                                    cVar.getClass();
                                    y sheetData = ((MapBottomSheet) cVar.f34805f).getSheetData();
                                    List list = (sheetData == null || (zVar = sheetData.f35565a) == null) ? null : zVar.f35568a;
                                    if (list == null || list.isEmpty()) {
                                        pg.c cVar2 = lVar.B;
                                        cVar2.getClass();
                                        y sheetData2 = ((MapBottomSheet) cVar2.f34805f).getSheetData();
                                        if (sheetData2 != null) {
                                            sheetData2.f35566b = null;
                                        }
                                        lVar.B();
                                    }
                                    break;
                                case 6:
                                    LatLngInfo latLngInfo7 = (LatLngInfo) entry5.getKey();
                                    mc.a aVarA2 = mc.a.a(lVar.getLayoutInflater());
                                    ((AppCompatTextView) aVarA2.f29924d).setPadding(2, 2, 2, 2);
                                    ((AppCompatImageView) aVarA2.f29923c).setImageResource(R.drawable.green_marker);
                                    st.a aVar3 = lVar.f32677n;
                                    if (aVar3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                        aVar3 = null;
                                    }
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) aVarA2.f29922b;
                                    constraintLayout2.getClass();
                                    Context contextRequireContext2 = lVar.requireContext();
                                    contextRequireContext2.getClass();
                                    ((rt.d) aVar3).c(latLngInfo7, constraintLayout2, contextRequireContext2);
                                    break;
                                case 7:
                                case 8:
                                case 9:
                                    LatLngInfo latLngInfo8 = (LatLngInfo) entry5.getKey();
                                    o oVar2 = (o) entry5.getValue();
                                    mc.a aVarA3 = mc.a.a(lVar.getLayoutInflater());
                                    int i14 = iArr[oVar2.ordinal()];
                                    if (i14 == 7) {
                                        i12 = R.drawable.home_map_dot_marker;
                                    } else if (i14 == 8) {
                                        i12 = R.drawable.work_map_dot_marker;
                                    } else if (i14 == 9) {
                                        i12 = R.drawable.other_map_dot_marker;
                                    }
                                    ((AppCompatImageView) aVarA3.f29923c).setImageResource(i12);
                                    st.a aVar4 = lVar.f32677n;
                                    if (aVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                        aVar4 = null;
                                    }
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) aVarA3.f29922b;
                                    constraintLayout3.getClass();
                                    Context contextRequireContext3 = lVar.requireContext();
                                    contextRequireContext3.getClass();
                                    ((rt.d) aVar4).c(latLngInfo8, constraintLayout3, contextRequireContext3);
                                    break;
                                default:
                                    e40.a.f();
                                    break;
                            }
                        }
                        if (lVar.C().f40311f.b()) {
                            if (!lVar.H()) {
                                pg.c cVar3 = lVar.B;
                                cVar3.getClass();
                                ((MapBottomSheet) cVar3.f34805f).setVisibility(0);
                                lVar.L(false);
                                lVar.C().g(lVar.F());
                            }
                            break;
                        } else if (!lVar.H() && !map.isEmpty()) {
                            lVar.B();
                            break;
                        }
                        break;
                    default:
                        z zVar2 = (z) obj;
                        zVar2.getClass();
                        if (cg.q(zVar2.f35568a)) {
                            l lVar2 = this.f32652b;
                            pg.c cVar4 = lVar2.B;
                            cVar4.getClass();
                            MapBottomSheet mapBottomSheet = (MapBottomSheet) cVar4.f34805f;
                            int i15 = 6;
                            mapBottomSheet.setSheetData(y.a(lVar2.f32685v, zVar2, null, null, 6));
                            if (lVar2.f32686w) {
                                lVar2.f32686w = false;
                                long j9 = lVar2.f32687x + 1;
                                lVar2.f32687x = j9;
                                mapBottomSheet.setListScrollToTopRequestId(Long.valueOf(j9));
                            }
                            int i16 = 1;
                            mapBottomSheet.setTopOffset(lVar2.E(true));
                            Fragment parentFragment = lVar2.getParentFragment();
                            lm.i iVar = parentFragment instanceof lm.i ? (lm.i) parentFragment : null;
                            mapBottomSheet.setTopViewHeightDp(iVar != null ? iVar.v() : 0);
                            mapBottomSheet.setOnItemCardClicked(new f(lVar2, i13));
                            mapBottomSheet.setOnFlashSalesItemCardClicked(new f(lVar2, i16));
                            mapBottomSheet.setOnFavoriteClicked(new a(lVar2, i15));
                            lVar2.L(false);
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.F = new p0(this) { // from class: om.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f32652b;

            {
                this.f32652b = this;
            }

            @Override // androidx.lifecycle.p0
            public final void a(Object obj) {
                int i122;
                StoreInformation storeInformationM;
                Picture logoPicture;
                StoreInformation storeInformationM2;
                Picture logoPicture2;
                Clusters clusters;
                z zVar;
                List<Clusters> clusters2;
                Object next;
                int i13 = 0;
                switch (i12) {
                    case 0:
                        Map map = (Map) obj;
                        map.getClass();
                        l lVar = this.f32652b;
                        LinkedHashMap linkedHashMap = lVar.f32682s;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            LatLngInfo latLngInfo = (LatLngInfo) entry.getKey();
                            if (!linkedHashMap.containsKey(latLngInfo) || linkedHashMap.get(latLngInfo) != map.get(latLngInfo)) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            LatLngInfo latLngInfo2 = (LatLngInfo) entry2.getKey();
                            if (!map.containsKey(latLngInfo2) || linkedHashMap.get(latLngInfo2) != map.get(latLngInfo2)) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            st.a aVar = lVar.f32677n;
                            if (aVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                aVar = null;
                            }
                            ((rt.d) aVar).m((LatLngInfo) entry3.getKey());
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                            LatLngInfo latLngInfo3 = (LatLngInfo) entry4.getKey();
                            if (map.containsKey(latLngInfo3) && linkedHashMap.get(latLngInfo3) == map.get(latLngInfo3)) {
                                linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                            }
                        }
                        linkedHashMap.clear();
                        linkedHashMap.putAll(linkedHashMap4);
                        linkedHashMap.putAll(linkedHashMap2);
                        for (Map.Entry entry5 : linkedHashMap2.entrySet()) {
                            o oVar = (o) entry5.getValue();
                            int[] iArr = e.$EnumSwitchMapping$0;
                            switch (iArr[oVar.ordinal()]) {
                                case 1:
                                    BasicItem basicItemC = lVar.C().c((LatLngInfo) entry5.getKey());
                                    l.w(lVar, (LatLngInfo) entry5.getKey(), (basicItemC == null || (storeInformationM = mv.d.m(basicItemC)) == null || (logoPicture = storeInformationM.getLogoPicture()) == null) ? null : logoPicture.getCurrentUrl(), false, true, 4);
                                    break;
                                case 2:
                                    l.x(lVar, (LatLngInfo) entry5.getKey(), lVar.C().h((LatLngInfo) entry5.getKey()), false, 12);
                                    break;
                                case 3:
                                case 4:
                                    LatLngInfo latLngInfo4 = (LatLngInfo) entry5.getKey();
                                    BasicItem basicItemC2 = lVar.C().c((LatLngInfo) entry5.getKey());
                                    l.w(lVar, latLngInfo4, (basicItemC2 == null || (storeInformationM2 = mv.d.m(basicItemC2)) == null || (logoPicture2 = storeInformationM2.getLogoPicture()) == null) ? null : logoPicture2.getCurrentUrl(), false, false, 12);
                                    break;
                                case 5:
                                    LatLngInfo latLngInfo5 = (LatLngInfo) entry5.getKey();
                                    tm.e eVarC = lVar.C();
                                    LatLngInfo latLngInfo6 = (LatLngInfo) entry5.getKey();
                                    eVarC.getClass();
                                    latLngInfo6.getClass();
                                    MapClustersResponse mapClustersResponse = (MapClustersResponse) eVarC.f40321q.d();
                                    if (mapClustersResponse == null || (clusters2 = mapClustersResponse.getClusters()) == null) {
                                        clusters = null;
                                    } else {
                                        Iterator<T> it = clusters2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                Clusters clusters3 = (Clusters) next;
                                                if (clusters3.getLocation().getLatitude() != latLngInfo6.getLatitude() || clusters3.getLocation().getLongitude() != latLngInfo6.getLongitude()) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        clusters = (Clusters) next;
                                    }
                                    int count = clusters != null ? clusters.getCount() : 0;
                                    mc.a aVarA = mc.a.a(lVar.getLayoutInflater());
                                    ((AppCompatTextView) aVarA.f29924d).setText(String.valueOf(count));
                                    st.a aVar2 = lVar.f32677n;
                                    if (aVar2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                        aVar2 = null;
                                    }
                                    ConstraintLayout constraintLayout = (ConstraintLayout) aVarA.f29922b;
                                    constraintLayout.getClass();
                                    Context contextRequireContext = lVar.requireContext();
                                    contextRequireContext.getClass();
                                    ((rt.d) aVar2).c(latLngInfo5, constraintLayout, contextRequireContext);
                                    pg.c cVar = lVar.B;
                                    cVar.getClass();
                                    y sheetData = ((MapBottomSheet) cVar.f34805f).getSheetData();
                                    List list = (sheetData == null || (zVar = sheetData.f35565a) == null) ? null : zVar.f35568a;
                                    if (list == null || list.isEmpty()) {
                                        pg.c cVar2 = lVar.B;
                                        cVar2.getClass();
                                        y sheetData2 = ((MapBottomSheet) cVar2.f34805f).getSheetData();
                                        if (sheetData2 != null) {
                                            sheetData2.f35566b = null;
                                        }
                                        lVar.B();
                                    }
                                    break;
                                case 6:
                                    LatLngInfo latLngInfo7 = (LatLngInfo) entry5.getKey();
                                    mc.a aVarA2 = mc.a.a(lVar.getLayoutInflater());
                                    ((AppCompatTextView) aVarA2.f29924d).setPadding(2, 2, 2, 2);
                                    ((AppCompatImageView) aVarA2.f29923c).setImageResource(R.drawable.green_marker);
                                    st.a aVar3 = lVar.f32677n;
                                    if (aVar3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                        aVar3 = null;
                                    }
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) aVarA2.f29922b;
                                    constraintLayout2.getClass();
                                    Context contextRequireContext2 = lVar.requireContext();
                                    contextRequireContext2.getClass();
                                    ((rt.d) aVar3).c(latLngInfo7, constraintLayout2, contextRequireContext2);
                                    break;
                                case 7:
                                case 8:
                                case 9:
                                    LatLngInfo latLngInfo8 = (LatLngInfo) entry5.getKey();
                                    o oVar2 = (o) entry5.getValue();
                                    mc.a aVarA3 = mc.a.a(lVar.getLayoutInflater());
                                    int i14 = iArr[oVar2.ordinal()];
                                    if (i14 == 7) {
                                        i122 = R.drawable.home_map_dot_marker;
                                    } else if (i14 == 8) {
                                        i122 = R.drawable.work_map_dot_marker;
                                    } else if (i14 == 9) {
                                        i122 = R.drawable.other_map_dot_marker;
                                    }
                                    ((AppCompatImageView) aVarA3.f29923c).setImageResource(i122);
                                    st.a aVar4 = lVar.f32677n;
                                    if (aVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                        aVar4 = null;
                                    }
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) aVarA3.f29922b;
                                    constraintLayout3.getClass();
                                    Context contextRequireContext3 = lVar.requireContext();
                                    contextRequireContext3.getClass();
                                    ((rt.d) aVar4).c(latLngInfo8, constraintLayout3, contextRequireContext3);
                                    break;
                                default:
                                    e40.a.f();
                                    break;
                            }
                        }
                        if (lVar.C().f40311f.b()) {
                            if (!lVar.H()) {
                                pg.c cVar3 = lVar.B;
                                cVar3.getClass();
                                ((MapBottomSheet) cVar3.f34805f).setVisibility(0);
                                lVar.L(false);
                                lVar.C().g(lVar.F());
                            }
                            break;
                        } else if (!lVar.H() && !map.isEmpty()) {
                            lVar.B();
                            break;
                        }
                        break;
                    default:
                        z zVar2 = (z) obj;
                        zVar2.getClass();
                        if (cg.q(zVar2.f35568a)) {
                            l lVar2 = this.f32652b;
                            pg.c cVar4 = lVar2.B;
                            cVar4.getClass();
                            MapBottomSheet mapBottomSheet = (MapBottomSheet) cVar4.f34805f;
                            int i15 = 6;
                            mapBottomSheet.setSheetData(y.a(lVar2.f32685v, zVar2, null, null, 6));
                            if (lVar2.f32686w) {
                                lVar2.f32686w = false;
                                long j9 = lVar2.f32687x + 1;
                                lVar2.f32687x = j9;
                                mapBottomSheet.setListScrollToTopRequestId(Long.valueOf(j9));
                            }
                            int i16 = 1;
                            mapBottomSheet.setTopOffset(lVar2.E(true));
                            Fragment parentFragment = lVar2.getParentFragment();
                            lm.i iVar = parentFragment instanceof lm.i ? (lm.i) parentFragment : null;
                            mapBottomSheet.setTopViewHeightDp(iVar != null ? iVar.v() : 0);
                            mapBottomSheet.setOnItemCardClicked(new f(lVar2, i13));
                            mapBottomSheet.setOnFlashSalesItemCardClicked(new f(lVar2, i16));
                            mapBottomSheet.setOnFavoriteClicked(new a(lVar2, i15));
                            lVar2.L(false);
                        }
                        break;
                }
            }
        };
        this.G = new c(this, 25);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(om.l r13, z70.c r14) {
        /*
            boolean r0 = r14 instanceof om.g
            if (r0 == 0) goto L13
            r0 = r14
            om.g r0 = (om.g) r0
            int r1 = r0.f32657m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32657m = r1
            goto L18
        L13:
            om.g r0 = new om.g
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f32656k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f32657m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            om.l r0 = r0.f32655j
            ba0.g.M(r14)     // Catch: java.lang.Throwable -> L63
            goto L50
        L2a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            return r4
        L30:
            ba0.g.M(r14)
            boolean r14 = r13.isAdded()
            if (r14 != 0) goto L3a
            return r4
        L3a:
            ft.j r14 = ft.j.f17932h     // Catch: java.lang.Throwable -> L63
            if (r14 != 0) goto L44
            java.lang.String r14 = "instance"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r14)     // Catch: java.lang.Throwable -> L63
            r14 = r4
        L44:
            r0.f32655j = r13     // Catch: java.lang.Throwable -> L63
            r0.f32657m = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r14 = r14.g(r0)     // Catch: java.lang.Throwable -> L63
            if (r14 != r1) goto L4f
            return r1
        L4f:
            r0 = r13
        L50:
            com.app.tgtg.model.remote.item.LatLngInfo r14 = (com.app.tgtg.model.remote.item.LatLngInfo) r14     // Catch: java.lang.Throwable -> L63
            r0.getClass()     // Catch: java.lang.Throwable -> L63
            st.b r0 = new st.b     // Catch: java.lang.Throwable -> L63
            double r1 = r14.getLatitude()     // Catch: java.lang.Throwable -> L63
            double r5 = r14.getLongitude()     // Catch: java.lang.Throwable -> L63
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L63
            return r0
        L63:
            pm.k r7 = new pm.k
            r14 = 2132018263(0x7f140457, float:1.9674828E38)
            java.lang.String r8 = r13.getString(r14)
            r8.getClass()
            r14 = 2132018262(0x7f140456, float:1.9674826E38)
            java.lang.String r9 = r13.getString(r14)
            r9.getClass()
            r14 = 2132018261(0x7f140455, float:1.9674824E38)
            java.lang.String r10 = r13.getString(r14)
            r10.getClass()
            om.c r11 = new om.c
            r14 = 2
            r11.<init>(r13, r14)
            om.c r12 = new om.c
            r14 = 3
            r12.<init>(r13, r14)
            r7.<init>(r8, r9, r10, r11, r12)
            r13.M(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: om.l.s(om.l, z70.c):java.lang.Object");
    }

    public static final Location t(l lVar) {
        lVar.getClass();
        Location location = new Location("StartLoc");
        st.b bVar = lVar.f32681r;
        location.setLatitude(bVar != null ? bVar.f39278a : 0.0d);
        st.b bVar2 = lVar.f32681r;
        location.setLongitude(bVar2 != null ? bVar2.f39279b : 0.0d);
        return location;
    }

    public static /* synthetic */ void w(l lVar, LatLngInfo latLngInfo, String str, boolean z11, boolean z12, int i11) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        lVar.v(latLngInfo, str, z11, z12);
    }

    public static void x(l lVar, LatLngInfo latLngInfo, int i11, boolean z11, int i12) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        mc.a aVarA = mc.a.a(lVar.getLayoutInflater());
        AppCompatTextView appCompatTextView = (AppCompatTextView) aVarA.f29924d;
        int i13 = z11 ? 40 : 26;
        appCompatTextView.setPadding(i13, i13, i13, i13);
        appCompatTextView.setText(String.valueOf(i11));
        ((AppCompatImageView) aVarA.f29923c).setImageResource(R.drawable.green_marker);
        st.a aVar = lVar.f32677n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) aVarA.f29922b;
        constraintLayout.getClass();
        Context contextRequireContext = lVar.requireContext();
        contextRequireContext.getClass();
        ((rt.d) aVar).c(latLngInfo, constraintLayout, contextRequireContext);
    }

    public final void A() {
        this.f32683t = null;
        this.f32684u = null;
        pg.c cVar = this.B;
        cVar.getClass();
        ((MapBottomSheet) cVar.f34805f).setSheetData(null);
        L(true);
    }

    public final void B() {
        this.f32683t = null;
        this.f32684u = null;
        pg.c cVar = this.B;
        cVar.getClass();
        ((MapBottomSheet) cVar.f34805f).setMarkerType(null);
        pg.c cVar2 = this.B;
        cVar2.getClass();
        ((MapBottomSheet) cVar2.f34805f).setVisibility(C().f40311f.b() ? 0 : 8);
    }

    public final tm.e C() {
        return (tm.e) this.f32674j.getValue();
    }

    public final void D() {
        st.a aVar;
        f0.B(this, null, null, new h(this, null, 0), 3);
        st.a aVar2 = this.f32677n;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar2 = null;
        }
        xk.b bVarI = ((rt.d) aVar2).i();
        LatLngInfo latLngInfo = bVarI.f44440a;
        LatLngInfo latLngInfo2 = bVarI.f44441b;
        LatLngInfo latLngInfo3 = new LatLngInfo(latLngInfo2.getLatitude(), latLngInfo.getLongitude());
        LatLngInfo latLngInfo4 = new LatLngInfo(latLngInfo.getLatitude(), latLngInfo2.getLongitude());
        tm.e eVarC = C();
        int iA = d70.b.a(32);
        st.a aVar3 = this.f32677n;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar3 = null;
        }
        aVar3.getClass();
        LinkedHashMap linkedHashMap = this.C;
        linkedHashMap.getClass();
        rt.d dVar = (rt.d) aVar3;
        Double dValueOf = Double.valueOf(dVar.j());
        Object objValueOf = linkedHashMap.get(dValueOf);
        if (objValueOf == null) {
            v00.i iVarU = dVar.f38233a.r().u();
            iVarU.getClass();
            LatLng latLng = iVarU.f41670a;
            latLng.getClass();
            LatLng latLng2 = iVarU.f41671b;
            latLng2.getClass();
            double radians = Math.toRadians(latLng.f12145a);
            double radians2 = Math.toRadians(latLng.f12146b);
            double radians3 = Math.toRadians(latLng2.f12145a);
            double radians4 = radians2 - Math.toRadians(latLng2.f12146b);
            double dSin = Math.sin((radians - radians3) * 0.5d);
            double dSin2 = Math.sin(radians4 * 0.5d);
            objValueOf = Double.valueOf(Math.asin(Math.sqrt((Math.cos(radians3) * Math.cos(radians) * dSin2 * dSin2) + (dSin * dSin))) * ((double) 2) * 6371009.0d);
            linkedHashMap.put(dValueOf, objValueOf);
        }
        double dDoubleValue = (((double) iA) * ((Number) objValueOf).doubleValue()) / ((double) d70.b.c().width());
        st.a aVar4 = this.f32677n;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar4 = null;
        }
        float fH = ((rt.d) aVar4).h();
        st.a aVar5 = this.f32677n;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar5 = null;
        }
        boolean z11 = fH == ((rt.d) aVar5).j();
        eVarC.getClass();
        f0.B(m1.d(eVarC), null, null, new tm.c(eVarC, latLngInfo3, latLngInfo4, dDoubleValue, z11, null), 3);
        st.a aVar6 = this.f32677n;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        } else {
            aVar = aVar6;
        }
        Location locationG = ((rt.d) aVar).g();
        tm.e eVarC2 = C();
        st.b bVar = new st.b(locationG.getLatitude(), locationG.getLongitude());
        eVarC2.getClass();
        ft.c.X(bVar);
    }

    public final int E(boolean z11) {
        Fragment parentFragment = getParentFragment();
        lm.i iVar = parentFragment instanceof lm.i ? (lm.i) parentFragment : null;
        int iV = iVar != null ? iVar.v() : 0;
        if (iV > 0) {
            int i11 = z11 ? iV - 84 : iV + 20;
            if (i11 >= 0) {
                return i11;
            }
        }
        return 0;
    }

    public final xk.b F() {
        st.a aVar = this.f32677n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        }
        xk.b bVarI = ((rt.d) aVar).i();
        LatLngInfo latLngInfo = bVarI.f44440a;
        int iU = 0;
        if (!C().f40311f.b()) {
            Fragment parentFragment = getParentFragment();
            lm.i iVar = parentFragment instanceof lm.i ? (lm.i) parentFragment : null;
            if (iVar != null) {
                iU = iVar.u();
            }
        }
        boolean zB = C().f40311f.b();
        Rect rectC = d70.b.c();
        float fFloatValue = Integer.valueOf(rectC.right).floatValue();
        t tVar = d70.b.f14569a;
        Object value = tVar.getValue();
        value.getClass();
        float f11 = fFloatValue / ((DisplayMetrics) value).density;
        float fFloatValue2 = Integer.valueOf(rectC.bottom).floatValue();
        Object value2 = tVar.getValue();
        value2.getClass();
        float fHeight = new RectF(0.0f, 0.0f, f11, fFloatValue2 / ((DisplayMetrics) value2).density).height();
        pg.c cVar = this.B;
        cVar.getClass();
        float collapsedSheetFractionValue = ((MapBottomSheet) cVar.f34805f).getCollapsedSheetFractionValue();
        LatLngInfo latLngInfo2 = new LatLngInfo(latLngInfo.getLatitude(), latLngInfo.getLongitude());
        LatLngInfo latLngInfo3 = bVarI.f44441b;
        LatLngInfo latLngInfo4 = new LatLngInfo(latLngInfo3.getLatitude(), latLngInfo3.getLongitude());
        double latitude = zB ? latLngInfo4.getLatitude() : latLngInfo4.getLatitude() - ((latLngInfo4.getLatitude() - latLngInfo.getLatitude()) * ((double) (iU / fHeight)));
        double latitude2 = latLngInfo2.getLatitude() + ((latLngInfo4.getLatitude() - latLngInfo.getLatitude()) * ((double) collapsedSheetFractionValue));
        double d3 = (latitude - latitude2) * 0.02d;
        double longitude = (latLngInfo3.getLongitude() - latLngInfo.getLongitude()) * 0.02d;
        return new xk.b(new LatLngInfo(latitude2 - d3, latLngInfo.getLongitude() - longitude), new LatLngInfo(latitude + d3, latLngInfo3.getLongitude() + longitude));
    }

    public final void G(String str, f70.i iVar) {
        tm.e eVarC = C();
        eVarC.getClass();
        iVar.getClass();
        eVarC.f40316k.b(str, iVar, null, null);
    }

    public final boolean H() {
        pg.c cVar = this.B;
        cVar.getClass();
        y sheetData = ((MapBottomSheet) cVar.f34805f).getSheetData();
        return cg.q(sheetData != null ? sheetData.f35566b : null);
    }

    public final void I(st.b bVar, float f11) {
        if (bVar != null) {
            this.A = true;
            xk.a aVar = new xk.a(new LatLngInfo(bVar.f39278a, bVar.f39279b), null, null, null, 14);
            st.a aVar2 = this.f32677n;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar2 = null;
            }
            st.a.a(aVar2, aVar, f11, 4);
        }
    }

    public final void J() {
        if (androidx.core.app.e.a(requireContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            this.D.a("android.permission.ACCESS_FINE_LOCATION", null);
            return;
        }
        if (C().f40308c.i()) {
            u();
            return;
        }
        this.f32673i = true;
        tm.e eVarC = C();
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        eVarC.getClass();
        eVarC.f40308c.c(o0VarRequireActivity);
    }

    public final void K() {
        StoreInformation storeInformationM;
        Picture logoPicture;
        LatLngInfo latLngInfo = this.f32684u;
        if (latLngInfo != null) {
            int iH = C().h(latLngInfo);
            BasicItem basicItemC = C().c(latLngInfo);
            st.a aVar = null;
            String currentUrl = (basicItemC == null || (storeInformationM = mv.d.m(basicItemC)) == null || (logoPicture = storeInformationM.getLogoPicture()) == null) ? null : logoPicture.getCurrentUrl();
            o oVar = (o) this.f32682s.get(latLngInfo);
            st.a aVar2 = this.f32677n;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            } else {
                aVar = aVar2;
            }
            ((rt.d) aVar).m(latLngInfo);
            if (oVar == o.MULTI_STORES) {
                x(this, latLngInfo, iH, false, 12);
            } else {
                w(this, latLngInfo, currentUrl, false, oVar == o.SOLD_OUT, 4);
            }
        }
    }

    public final void L(boolean z11) {
        boolean zB = C().f40311f.b();
        pg.c cVar = this.B;
        if (zB) {
            cVar.getClass();
            ((ComposeView) cVar.f34803d).setVisibility(8);
            pg.c cVar2 = this.B;
            cVar2.getClass();
            ((ComposeView) cVar2.f34804e).setVisibility(z11 ? 0 : 8);
            return;
        }
        cVar.getClass();
        ((ComposeView) cVar.f34804e).setVisibility(8);
        pg.c cVar3 = this.B;
        cVar3.getClass();
        ((ComposeView) cVar3.f34803d).setVisibility(0);
    }

    public final void M(pm.k kVar) {
        pg.c cVar = this.B;
        cVar.getClass();
        ((ComposeView) cVar.f34806g).setVisibility(8);
        pg.c cVar2 = this.B;
        cVar2.getClass();
        ((MapBottomSheet) cVar2.f34805f).setVisibility(0);
        pg.c cVar3 = this.B;
        cVar3.getClass();
        ((MapBottomSheet) cVar3.f34805f).setSheetData(y.a(this.f32685v, null, n0.f26529a, kVar, 1));
        pg.c cVar4 = this.B;
        cVar4.getClass();
        ((MapBottomSheet) cVar4.f34805f).getShowBottomSheet().invoke();
        L(false);
    }

    public final void N() {
        C().n(cv.i.TEMP_LIVE_LOCATION_CLICKED, h0.g.E(new Pair(dv.a.GPS_ENABLED, new dv.c(Boolean.valueOf(androidx.core.app.e.a(requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 && C().f40308c.i())))));
    }

    public final void O() {
        ((zj.j) this.f32675k.getValue()).f47948a.getClass();
        SearchFilter searchFilterA = ft.b.a();
        cv.i iVar = C().f40311f.b() ? cv.i.SCREEN_BROWSE : cv.i.SCREEN_MAP;
        tm.e eVarC = C();
        Pair pair = new Pair(dv.a.HAS_SEARCH, new dv.c(Boolean.valueOf(searchFilterA.isSearchOn())));
        Pair pair2 = new Pair(dv.a.HAS_TIME_FILTER, new dv.c(Boolean.valueOf(searchFilterA.isPickupTimeSet())));
        dv.a aVar = dv.a.SELECTED_CATEGORY;
        ArrayList<ItemCategory> foodTypes = searchFilterA.getFoodTypes();
        ArrayList arrayList = new ArrayList(e0.o(foodTypes, 10));
        Iterator<T> it = foodTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((ItemCategory) it.next()).name());
        }
        Pair pair3 = new Pair(aVar, new dv.c(arrayList));
        Pair pair4 = new Pair(dv.a.HIDE_SOLD_OUT, new dv.c(Boolean.valueOf(searchFilterA.getShowOnlyAvailable())));
        dv.a aVar2 = dv.a.SELECTED_DIET_TYPE;
        ArrayList<DietPreferenceModel> dietPrefs = searchFilterA.getDietPrefs();
        ArrayList arrayList2 = new ArrayList(e0.o(dietPrefs, 10));
        Iterator<T> it2 = dietPrefs.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DietPreferenceModel) it2.next()).name());
        }
        eVarC.n(iVar, h0.g.E(pair, pair2, pair3, pair4, new Pair(aVar2, new dv.c(arrayList2))));
    }

    public final void P(sm.b bVar) {
        this.f32689z.setValue(bVar);
        if (C().f40311f.b()) {
            pg.c cVar = this.B;
            cVar.getClass();
            ((MapBottomSheet) cVar.f34805f).setCurrentLocationButtonState(bVar);
        }
    }

    public final void Q(LatLngInfo latLngInfo, boolean z11) {
        BasicItem basicItemC = C().c(latLngInfo);
        o oVar = (o) this.f32682s.get(latLngInfo);
        if (basicItemC != null) {
            st.a aVar = this.f32677n;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar = null;
            }
            ((rt.d) aVar).m(latLngInfo);
            int i11 = oVar == null ? -1 : e.$EnumSwitchMapping$0[oVar.ordinal()];
            if (i11 == 1) {
                v(latLngInfo, mv.d.m(basicItemC).getLogoPicture().getCurrentUrl(), z11, true);
            } else if (i11 != 2) {
                w(this, latLngInfo, mv.d.m(basicItemC).getLogoPicture().getCurrentUrl(), z11, false, 8);
            } else {
                x(this, latLngInfo, C().h(latLngInfo), z11, 8);
            }
        }
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        c90.f fVar = v80.p0.f42144a;
        w80.c cVar = a90.p.f1044a;
        j1 j1Var = this.l;
        j1Var.getClass();
        return kotlin.coroutines.e.c(j1Var, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.browse_map, viewGroup, false);
        int i11 = R.id.browseMapViewContainer;
        FrameLayout frameLayout = (FrameLayout) pd.g.t(R.id.browseMapViewContainer, viewInflate);
        t00.c cVar = null;
        if (frameLayout != null) {
            i11 = R.id.currentLocationButton;
            ComposeView composeView = (ComposeView) pd.g.t(R.id.currentLocationButton, viewInflate);
            if (composeView != null) {
                i11 = R.id.currentLocationButtonExp;
                ComposeView composeView2 = (ComposeView) pd.g.t(R.id.currentLocationButtonExp, viewInflate);
                if (composeView2 != null) {
                    i11 = R.id.mapBottomSheetView;
                    MapBottomSheet mapBottomSheet = (MapBottomSheet) pd.g.t(R.id.mapBottomSheetView, viewInflate);
                    if (mapBottomSheet != null) {
                        i11 = R.id.mapButton;
                        ComposeView composeView3 = (ComposeView) pd.g.t(R.id.mapButton, viewInflate);
                        if (composeView3 != null) {
                            i11 = R.id.newLocationPicker;
                            NewLocationPicker newLocationPicker = (NewLocationPicker) pd.g.t(R.id.newLocationPicker, viewInflate);
                            if (newLocationPicker != null) {
                                i11 = R.id.tempView;
                                if (pd.g.t(R.id.tempView, viewInflate) != null) {
                                    this.B = new pg.c((ConstraintLayout) viewInflate, frameLayout, composeView, composeView2, mapBottomSheet, composeView3, newLocationPicker, 1);
                                    o0 activity = getActivity();
                                    FrameLayout frameLayout2 = activity != null ? new FrameLayout(activity) : null;
                                    this.f32688y = frameLayout2;
                                    if (frameLayout2 != null) {
                                        Resources resources = getResources();
                                        ThreadLocal threadLocal = w6.j.f43256a;
                                        frameLayout2.setBackgroundColor(resources.getColor(R.color.opacity_white_70, null));
                                    }
                                    pg.c cVar2 = this.B;
                                    cVar2.getClass();
                                    ConstraintLayout constraintLayout = cVar2.f34801b;
                                    constraintLayout.getClass();
                                    constraintLayout.addView(this.f32688y, new ViewGroup.LayoutParams(-1, -1));
                                    Context contextRequireContext = requireContext();
                                    contextRequireContext.getClass();
                                    this.f32679p.getClass();
                                    rt.f fVar = new rt.f(contextRequireContext);
                                    this.f32676m = fVar;
                                    this.f32678o = fVar.f38239a;
                                    pg.c cVar3 = this.B;
                                    cVar3.getClass();
                                    FrameLayout frameLayout3 = (FrameLayout) cVar3.f34802c;
                                    t00.c cVar4 = this.f32678o;
                                    if (cVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapView");
                                    } else {
                                        cVar = cVar4;
                                    }
                                    frameLayout3.addView(cVar);
                                    pg.c cVar5 = this.B;
                                    cVar5.getClass();
                                    ConstraintLayout constraintLayout2 = cVar5.f34801b;
                                    constraintLayout2.getClass();
                                    return constraintLayout2;
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        rt.f fVar = this.f32676m;
        if (fVar != null) {
            fVar.c();
        }
        st.a aVar = this.f32677n;
        if (aVar != null) {
            try {
                u00.g gVar = (u00.g) ((rt.d) aVar).f38233a.f33836b;
                gVar.M(14, gVar.L());
            } catch (RemoteException e5) {
                qc.y.l(e5);
                return;
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        rt.f fVar = this.f32676m;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar = null;
        }
        fVar.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        rt.f fVar = this.f32676m;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar = null;
        }
        fVar.e();
        this.f32672h = false;
        if (this.f32677n != null) {
            tm.e eVarC = C();
            st.a aVar = this.f32677n;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar = null;
            }
            float fJ = ((rt.d) aVar).j();
            eVarC.getClass();
            SharedPreferences.Editor editorEdit = ft.c.x().edit();
            String strY = ft.c.y();
            editorEdit.putFloat((strY != null ? strY : null) + "zoomLevelBrowse", fJ);
            editorEdit.apply();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i11 = 5;
        if (!isVisible()) {
            new Handler().postDelayed(new m0.l(this, 5), 200L);
            return;
        }
        rt.f fVar = this.f32676m;
        x70.c cVar = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar = null;
        }
        fVar.f();
        O();
        C().f40307b.b(cv.i.BRAZE_MAP_SCREEN_SHOWN);
        FrameLayout frameLayout = this.f32688y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        if (Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION)) {
            String string = getString(R.string.browse_list_error_no_location_selected_title);
            string.getClass();
            String string2 = getString(R.string.browse_list_error_no_location_selected_message);
            string2.getClass();
            String string3 = getString(R.string.browse_list_error_no_location_selected_action_text);
            string3.getClass();
            M(new pm.k(string, string2, string3, new c(this, i11), new c(this, 12)));
            return;
        }
        if (this.f32673i && C().f40308c.i()) {
            u();
            this.f32673i = false;
        }
        tm.e eVarC = C();
        eVarC.getClass();
        eVarC.B = Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        P((!C().B || C().C) ? sm.b.DEFAULT : sm.b.CLICKED);
        if (this.f32677n != null) {
            z();
        }
        if (C().H) {
            f0.B(this, null, null, new j(this, C().I, null), 3);
            C().H = false;
            C().I = false;
        }
        if (C().i()) {
            f0.B(this, null, null, new h(this, cVar, 1), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        rt.f fVar = this.f32676m;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar = null;
        }
        fVar.g(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        rt.f fVar = this.f32676m;
        t00.c cVar = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar = null;
        }
        fVar.b(bundle);
        rt.f fVar2 = this.f32676m;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar2 = null;
        }
        fVar2.a(new a(this, 2));
        t00.c cVar2 = this.f32678o;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
        } else {
            cVar = cVar2;
        }
        cVar.setVisibility(0);
        tm.e eVarC = C();
        androidx.lifecycle.o0 o0Var = eVarC.f40327w;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        m0.c.f0(o0Var, viewLifecycleOwner, new a(this, 3));
        androidx.lifecycle.o0 o0Var2 = eVarC.f40320p;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        m0.c.f0(o0Var2, viewLifecycleOwner2, new a(this, 4));
        androidx.lifecycle.o0 o0Var3 = eVarC.A;
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        m0.c.f0(o0Var3, viewLifecycleOwner3, new a(this, 5));
        pg.c cVar3 = this.B;
        cVar3.getClass();
        final int i11 = 1;
        ((ComposeView) cVar3.f34803d).setContent(new u3.d(new Function2(this) { // from class: om.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i12 = i11;
                m3.f fVar3 = m3.m.f29332a;
                l lVar = this.f32648b;
                int i13 = 1;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i12) {
                    case 0:
                        s sVar = (s) nVar;
                        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            String strU = o30.f0.U(sVar, R.string.browse_tab_map);
                            n4.b bVarZ = x0.z(R.drawable.map_icon, sVar, 0);
                            boolean zH = sVar.h(lVar);
                            Object objM = sVar.M();
                            if (zH || objM == fVar3) {
                                objM = new c(lVar, i13);
                                sVar.k0(objM);
                            }
                            pm.a.c(strU, bVarZ, (Function0) objM, sVar, 64);
                        } else {
                            sVar.U();
                        }
                        break;
                    case 1:
                        s sVar2 = (s) nVar;
                        if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            sm.b bVar = (sm.b) lVar.f32689z.getValue();
                            boolean zH2 = sVar2.h(lVar);
                            Object objM2 = sVar2.M();
                            if (zH2 || objM2 == fVar3) {
                                objM2 = new c(lVar, 7);
                                sVar2.k0(objM2);
                            }
                            w0.e.b(bVar, null, (Function0) objM2, sVar2, 0, 2);
                        } else {
                            sVar2.U();
                        }
                        break;
                    default:
                        s sVar3 = (s) nVar;
                        if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            sm.b bVar2 = (sm.b) lVar.f32689z.getValue();
                            boolean zH3 = sVar3.h(lVar);
                            Object objM3 = sVar3.M();
                            if (zH3 || objM3 == fVar3) {
                                objM3 = new c(lVar, 8);
                                sVar3.k0(objM3);
                            }
                            w0.e.b(bVar2, null, (Function0) objM3, sVar3, 0, 2);
                        } else {
                            sVar3.U();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, true, -2092244907));
        pg.c cVar4 = this.B;
        cVar4.getClass();
        final int i12 = 2;
        ((ComposeView) cVar4.f34804e).setContent(new u3.d(new Function2(this) { // from class: om.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i122 = i12;
                m3.f fVar3 = m3.m.f29332a;
                l lVar = this.f32648b;
                int i13 = 1;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i122) {
                    case 0:
                        s sVar = (s) nVar;
                        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            String strU = o30.f0.U(sVar, R.string.browse_tab_map);
                            n4.b bVarZ = x0.z(R.drawable.map_icon, sVar, 0);
                            boolean zH = sVar.h(lVar);
                            Object objM = sVar.M();
                            if (zH || objM == fVar3) {
                                objM = new c(lVar, i13);
                                sVar.k0(objM);
                            }
                            pm.a.c(strU, bVarZ, (Function0) objM, sVar, 64);
                        } else {
                            sVar.U();
                        }
                        break;
                    case 1:
                        s sVar2 = (s) nVar;
                        if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            sm.b bVar = (sm.b) lVar.f32689z.getValue();
                            boolean zH2 = sVar2.h(lVar);
                            Object objM2 = sVar2.M();
                            if (zH2 || objM2 == fVar3) {
                                objM2 = new c(lVar, 7);
                                sVar2.k0(objM2);
                            }
                            w0.e.b(bVar, null, (Function0) objM2, sVar2, 0, 2);
                        } else {
                            sVar2.U();
                        }
                        break;
                    default:
                        s sVar3 = (s) nVar;
                        if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            sm.b bVar2 = (sm.b) lVar.f32689z.getValue();
                            boolean zH3 = sVar3.h(lVar);
                            Object objM3 = sVar3.M();
                            if (zH3 || objM3 == fVar3) {
                                objM3 = new c(lVar, 8);
                                sVar3.k0(objM3);
                            }
                            w0.e.b(bVar2, null, (Function0) objM3, sVar3, 0, 2);
                        } else {
                            sVar3.U();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, true, -1935209908));
        boolean zB = C().f40311f.b();
        pg.c cVar5 = this.B;
        if (!zB) {
            cVar5.getClass();
            ((ComposeView) cVar5.f34803d).setVisibility(0);
            pg.c cVar6 = this.B;
            cVar6.getClass();
            ((ComposeView) cVar6.f34804e).setVisibility(8);
            return;
        }
        cVar5.getClass();
        ((ComposeView) cVar5.f34803d).setVisibility(8);
        pg.c cVar7 = this.B;
        cVar7.getClass();
        ComposeView composeView = (ComposeView) cVar7.f34804e;
        pg.c cVar8 = this.B;
        cVar8.getClass();
        composeView.setVisibility(((MapBottomSheet) cVar8.f34805f).getSheetData() != null ? 8 : 0);
        pg.c cVar9 = this.B;
        cVar9.getClass();
        ((MapBottomSheet) cVar9.f34805f).setCurrentLocationButtonState((sm.b) this.f32689z.getValue());
        pg.c cVar10 = this.B;
        cVar10.getClass();
        ((MapBottomSheet) cVar10.f34805f).setOnCurrentLocationButtonClicked(new c(this, 26));
        pg.c cVar11 = this.B;
        cVar11.getClass();
        ((MapBottomSheet) cVar11.f34805f).setOnFullyExpanded(new a(this, 0));
        pg.c cVar12 = this.B;
        cVar12.getClass();
        ((MapBottomSheet) cVar12.f34805f).setOnSheetReachedTheTopView(new a(this, 1));
        pg.c cVar13 = this.B;
        cVar13.getClass();
        final int i13 = 0;
        ((ComposeView) cVar13.f34806g).setContent(new u3.d(new Function2(this) { // from class: om.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i122 = i13;
                m3.f fVar3 = m3.m.f29332a;
                l lVar = this.f32648b;
                int i132 = 1;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i122) {
                    case 0:
                        s sVar = (s) nVar;
                        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            String strU = o30.f0.U(sVar, R.string.browse_tab_map);
                            n4.b bVarZ = x0.z(R.drawable.map_icon, sVar, 0);
                            boolean zH = sVar.h(lVar);
                            Object objM = sVar.M();
                            if (zH || objM == fVar3) {
                                objM = new c(lVar, i132);
                                sVar.k0(objM);
                            }
                            pm.a.c(strU, bVarZ, (Function0) objM, sVar, 64);
                        } else {
                            sVar.U();
                        }
                        break;
                    case 1:
                        s sVar2 = (s) nVar;
                        if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            sm.b bVar = (sm.b) lVar.f32689z.getValue();
                            boolean zH2 = sVar2.h(lVar);
                            Object objM2 = sVar2.M();
                            if (zH2 || objM2 == fVar3) {
                                objM2 = new c(lVar, 7);
                                sVar2.k0(objM2);
                            }
                            w0.e.b(bVar, null, (Function0) objM2, sVar2, 0, 2);
                        } else {
                            sVar2.U();
                        }
                        break;
                    default:
                        s sVar3 = (s) nVar;
                        if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            sm.b bVar2 = (sm.b) lVar.f32689z.getValue();
                            boolean zH3 = sVar3.h(lVar);
                            Object objM3 = sVar3.M();
                            if (zH3 || objM3 == fVar3) {
                                objM3 = new c(lVar, 8);
                                sVar3.k0(objM3);
                            }
                            w0.e.b(bVar2, null, (Function0) objM3, sVar3, 0, 2);
                        } else {
                            sVar3.U();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, true, 956412784));
    }

    public final void u() {
        tm.e eVarC = C();
        eVarC.f40308c.getClass();
        ft.c.g0(AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        eVarC.B = true;
        eVarC.C = false;
        P(sm.b.CLICKED);
        tm.e eVarC2 = C();
        eVarC2.f40308c.e(false, new q(eVarC2, 8));
    }

    public final void v(LatLngInfo latLngInfo, String str, boolean z11, boolean z12) {
        if (str != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            ba0.g.p(contextRequireContext, str, z11 ? d70.b.a(48) : d70.b.a(32), z11 ? d70.b.a(48) : d70.b.a(32), d70.b.a(1), requireContext().getColor(R.color.neutral_40), z12, new c2(11, this, latLngInfo));
        }
    }

    public final void y(st.b bVar, float f11) {
        if (bVar != null) {
            this.A = true;
            st.a aVar = this.f32677n;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar = null;
            }
            ((rt.d) aVar).e(bVar, Float.valueOf(f11), new n90.p(15), new n90.p(16));
        }
    }

    public final void z() {
        if (this.f32677n == null) {
            return;
        }
        if (!C().B) {
            C().getClass();
            I(tm.e.f(), C().j());
        } else {
            P(sm.b.CLICKED);
            tm.e eVarC = C();
            eVarC.f40308c.e(false, new q(eVarC, 8));
        }
    }
}
