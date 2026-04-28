package om;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.LocationDetailItem;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;
import n90.p;
import pg.u1;
import pm.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f32646b;

    public /* synthetic */ a(l lVar, int i11) {
        this.f32645a = i11;
        this.f32646b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fJ;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        float fE;
        boolean z11;
        List list;
        LocationDetailItem locationDetailItem;
        List<LocationDetailItem> locationDetailItems;
        Object next;
        List list2;
        int i11 = this.f32645a;
        int i12 = 9;
        int i13 = 19;
        int i14 = 18;
        int i15 = 17;
        int i16 = 8;
        boolean z12 = true;
        l lVar = this.f32646b;
        st.a aVar = null;
        st.a aVar2 = null;
        st.a aVar3 = null;
        st.a aVar4 = null;
        switch (i11) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                pg.c cVar = lVar.B;
                cVar.getClass();
                y sheetData = ((MapBottomSheet) cVar.f34805f).getSheetData();
                if ((sheetData != null ? sheetData.f35567c : null) == null && zBooleanValue) {
                    z12 = false;
                }
                pg.c cVar2 = lVar.B;
                cVar2.getClass();
                ComposeView composeView = (ComposeView) cVar2.f34806g;
                if (zBooleanValue) {
                    pg.c cVar3 = lVar.B;
                    cVar3.getClass();
                    y sheetData2 = ((MapBottomSheet) cVar3.f34805f).getSheetData();
                    if ((sheetData2 != null ? sheetData2.f35567c : null) == null) {
                        i16 = 0;
                    }
                }
                composeView.setVisibility(i16);
                Fragment parentFragment = lVar.getParentFragment();
                lm.i iVar = parentFragment instanceof lm.i ? (lm.i) parentFragment : null;
                if (iVar != null) {
                    iVar.f27929s.setValue(Boolean.valueOf(z12));
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                Fragment parentFragment2 = lVar.getParentFragment();
                lm.i iVar2 = parentFragment2 instanceof lm.i ? (lm.i) parentFragment2 : null;
                if (iVar2 != null && iVar2.s().f40311f.b()) {
                    iVar2.f27927q.setValue(bool);
                }
                break;
            case 2:
                st.a aVar5 = (st.a) obj;
                aVar5.getClass();
                lVar.f32677n = aVar5;
                tm.e eVarC = lVar.C();
                eVarC.getClass();
                eVarC.B = Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_YOUR_LOCATION);
                lVar.C().f40324t.e(lVar.getViewLifecycleOwner(), lVar.E);
                lVar.C().f40329y.e(lVar.getViewLifecycleOwner(), lVar.F);
                st.a aVar6 = lVar.f32677n;
                if (aVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar6 = null;
                }
                a aVar7 = new a(lVar, 7);
                rt.d dVar = (rt.d) aVar6;
                dVar.getClass();
                oz.m mVar = dVar.f38233a;
                mp.a aVar8 = new mp.a(aVar7, dVar);
                u00.g gVar = (u00.g) mVar.f33836b;
                try {
                    t00.g gVar2 = new t00.g(mVar, aVar8);
                    Parcel parcelL = gVar.L();
                    n00.d.d(parcelL, gVar2);
                    gVar.M(30, parcelL);
                    st.a aVar9 = lVar.f32677n;
                    if (aVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar9 = null;
                    }
                    c cVar4 = new c(lVar, 23);
                    rt.d dVar2 = (rt.d) aVar9;
                    dVar2.getClass();
                    oz.m mVar2 = dVar2.f38233a;
                    mp.a aVar10 = new mp.a(cVar4, i12);
                    u00.g gVar3 = (u00.g) mVar2.f33836b;
                    try {
                        t00.g gVar4 = new t00.g(mVar2, aVar10, 0);
                        Parcel parcelL2 = gVar3.L();
                        n00.d.d(parcelL2, gVar4);
                        gVar3.M(28, parcelL2);
                        st.a aVar11 = lVar.f32677n;
                        if (aVar11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                            aVar11 = null;
                        }
                        Context contextRequireContext = lVar.requireContext();
                        contextRequireContext.getClass();
                        rt.d dVar3 = (rt.d) aVar11;
                        dVar3.o(contextRequireContext);
                        oz.m mVar3 = dVar3.f38233a;
                        u00.g gVar5 = (u00.g) mVar3.f33836b;
                        try {
                            Parcel parcelL3 = gVar5.L();
                            parcelL3.writeInt(0);
                            Parcel parcelJ = gVar5.J(20, parcelL3);
                            parcelJ.readInt();
                            parcelJ.recycle();
                            dVar3.p();
                            dVar3.w();
                            dVar3.q();
                            dVar3.v();
                            dVar3.t();
                            dVar3.r(false);
                            try {
                                t00.g gVar6 = new t00.g(mVar3, new mp.a(new c(lVar, 14), i16), (byte) 0);
                                Parcel parcelL4 = gVar5.L();
                                n00.d.d(parcelL4, gVar6);
                                gVar5.M(42, parcelL4);
                                dVar3.f38236d = new i(lVar);
                            } catch (RemoteException e5) {
                                qc.y.l(e5);
                                return null;
                            }
                        } catch (RemoteException e11) {
                            qc.y.l(e11);
                            return null;
                        }
                    } catch (RemoteException e12) {
                        qc.y.l(e12);
                        return null;
                    }
                } catch (RemoteException e13) {
                    qc.y.l(e13);
                    return null;
                }
                break;
            case 3:
                st.b bVar = (st.b) obj;
                bVar.getClass();
                lVar.A = true;
                st.a aVar12 = lVar.f32677n;
                if (aVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar12 = null;
                }
                ((rt.d) aVar12).r(true);
                st.a aVar13 = lVar.f32677n;
                if (aVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar13 = null;
                }
                ((rt.d) aVar13).q();
                if (lVar.C().f40311f.b()) {
                    lVar.C().getClass();
                    fJ = 13.0f;
                } else {
                    st.a aVar14 = lVar.f32677n;
                    if (aVar14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    } else {
                        aVar4 = aVar14;
                    }
                    fJ = ((rt.d) aVar4).j();
                    if (fJ < 15.0f) {
                        fJ = 15.0f;
                    }
                }
                lVar.y(bVar, fJ);
                break;
            case 4:
                if (((Boolean) obj).booleanValue() && (lVar.getActivity() instanceof pt.d)) {
                    o0 activity = lVar.getActivity();
                    activity.getClass();
                    u1 u1Var = ((MainActivity) ((pt.d) activity)).f9089q;
                    u1Var.getClass();
                    u1Var.f35188w.a();
                }
                break;
            case 5:
                GenericErrors genericErrors = (GenericErrors) obj;
                genericErrors.getClass();
                pg.c cVar5 = lVar.B;
                cVar5.getClass();
                ((MapBottomSheet) cVar5.f34805f).setVisibility(0);
                if (Intrinsics.areEqual(genericErrors, GenericErrors.Generic.INSTANCE)) {
                    Context contextRequireContext2 = lVar.requireContext();
                    contextRequireContext2.getClass();
                    if (r0.u(contextRequireContext2)) {
                        String string = lVar.getString(R.string.map_error_something_wrong_title);
                        string.getClass();
                        String string2 = lVar.getString(R.string.map_error_something_wrong_message);
                        string2.getClass();
                        String string3 = lVar.getString(R.string.map_error_close_button);
                        string3.getClass();
                        lVar.M(new pm.k(string, string2, string3, new c(lVar, i13), new c(lVar, 20)));
                    } else {
                        String string4 = lVar.getString(R.string.browse_list_no_internet_title);
                        string4.getClass();
                        String string5 = lVar.getString(R.string.browse_list_no_internet_message);
                        string5.getClass();
                        String string6 = lVar.getString(R.string.browse_list_no_internet_action_text);
                        string6.getClass();
                        lVar.M(new pm.k(string4, string5, string6, new c(lVar, 21), new c(lVar, 22)));
                    }
                } else if (genericErrors instanceof GenericErrors.NoResultsWithCurrentLocation) {
                    String string7 = lVar.getString(R.string.map_error_no_stores_location_title);
                    string7.getClass();
                    String string8 = lVar.getString(R.string.browse_list_error_no_results_location_message);
                    string8.getClass();
                    String string9 = lVar.getString(R.string.map_error_zoom_out_button);
                    string9.getClass();
                    lVar.M(new pm.k(string7, string8, string9, new c(lVar, 15), new c(lVar, 16)));
                } else if (genericErrors instanceof GenericErrors.NoResultWithFilterOn) {
                    String string10 = lVar.getString(R.string.map_error_no_results_filter_title);
                    string10.getClass();
                    String string11 = lVar.getString(R.string.browse_list_error_no_results_filter_message);
                    string11.getClass();
                    String string12 = lVar.getString(R.string.browse_list_error_no_results_filter_action_text);
                    string12.getClass();
                    lVar.M(new pm.k(string10, string11, string12, new c(lVar, i12), new c(lVar, 10)));
                } else if (genericErrors instanceof GenericErrors.LocationServiceNotAvailable) {
                    String string13 = lVar.getString(R.string.generic_error_view_no_gps_title);
                    string13.getClass();
                    String string14 = lVar.getString(R.string.generic_error_view_no_gps_description);
                    string14.getClass();
                    String string15 = lVar.getString(R.string.generic_error_view_no_gps_cta);
                    string15.getClass();
                    lVar.M(new pm.k(string13, string14, string15, new c(lVar, i15), new c(lVar, i14)));
                } else if (genericErrors instanceof GenericErrors.MapViewTooWide) {
                    String string16 = lVar.getString(R.string.map_view_too_wide_error_title);
                    string16.getClass();
                    String string17 = lVar.getString(R.string.map_view_too_wide_error_description);
                    string17.getClass();
                    String string18 = lVar.getString(R.string.map_view_too_wide_error_button);
                    string18.getClass();
                    lVar.M(new pm.k(string16, string17, string18, new c(lVar, 11), new c(lVar, 13)));
                }
                break;
            case 6:
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                mv.d.f(basicItem, !basicItem.getFavorite());
                lVar.C().l(basicItem);
                break;
            case 7:
                st.b bVar2 = (st.b) obj;
                bVar2.getClass();
                pg.c cVar6 = lVar.B;
                cVar6.getClass();
                ((MapBottomSheet) cVar6.f34805f).setVisibility(0);
                LatLngInfo latLngInfo = new LatLngInfo(bVar2.f39278a, bVar2.f39279b);
                LinkedHashMap linkedHashMap3 = lVar.f32682s;
                if (linkedHashMap3.get(latLngInfo) != o.CLUSTER) {
                    lVar.C().n(cv.i.ACTION_DOT_CLICKED, null);
                }
                pg.c cVar7 = lVar.B;
                cVar7.getClass();
                ((MapBottomSheet) cVar7.f34805f).setMarkerType((o) linkedHashMap3.get(latLngInfo));
                o oVar = (o) linkedHashMap3.get(latLngInfo);
                int i17 = oVar == null ? -1 : e.$EnumSwitchMapping$0[oVar.ordinal()];
                int i18 = 2;
                if (i17 != 2) {
                    switch (i17) {
                        case 5:
                            st.a aVar15 = lVar.f32677n;
                            if (aVar15 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                aVar15 = null;
                            }
                            st.a aVar16 = lVar.f32677n;
                            if (aVar16 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                aVar16 = null;
                            }
                            float fH = ((rt.d) aVar16).h();
                            st.a aVar17 = lVar.f32677n;
                            if (aVar17 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                            } else {
                                aVar2 = aVar17;
                            }
                            ((rt.d) aVar15).e(bVar2, Float.valueOf(mv.d.e(fH, ((rt.d) aVar2).j())), new p(17), new p(18));
                            break;
                        case 6:
                            tm.e eVarC2 = lVar.C();
                            eVarC2.getClass();
                            rm.c cVar8 = eVarC2.f40313h;
                            cVar8.getClass();
                            MapClustersResponse mapClustersResponse = cVar8.f38141a;
                            if (mapClustersResponse == null || (locationDetailItems = mapClustersResponse.getLocationDetailItems()) == null) {
                                locationDetailItem = null;
                            } else {
                                Iterator<T> it = locationDetailItems.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (Intrinsics.areEqual(((LocationDetailItem) next).getLocation(), latLngInfo)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                locationDetailItem = (LocationDetailItem) next;
                            }
                            String itemId = locationDetailItem != null ? locationDetailItem.getItemId() : null;
                            if (itemId != null) {
                                lVar.G(itemId, f70.i.SCREEN_BROWSE_LIST);
                            }
                            break;
                        case 7:
                        case 8:
                        case 9:
                            lVar.B();
                            break;
                        default:
                            if (!lVar.C().f40311f.b()) {
                                pg.c cVar9 = lVar.B;
                                cVar9.getClass();
                                ((ComposeView) cVar9.f34803d).setVisibility(8);
                            }
                            pg.c cVar10 = lVar.B;
                            cVar10.getClass();
                            ((MapBottomSheet) cVar10.f34805f).setOnItemCardClicked(new f(lVar, i18));
                            pg.c cVar11 = lVar.B;
                            cVar11.getClass();
                            ((MapBottomSheet) cVar11.f34805f).setOnFlashSalesItemCardClicked(new f(lVar, 3));
                            pg.c cVar12 = lVar.B;
                            cVar12.getClass();
                            ((MapBottomSheet) cVar12.f34805f).setOnFavoriteClicked(new a(lVar, i16));
                            if (linkedHashMap3.get(latLngInfo) == o.SINGLE_ITEM || linkedHashMap3.get(latLngInfo) == o.MULTI_ITEMS) {
                                pg.c cVar13 = lVar.B;
                                cVar13.getClass();
                                ((MapBottomSheet) cVar13.f34805f).setOnListButtonClicked(new c(lVar, 24));
                            }
                            tm.e eVarC3 = lVar.C();
                            eVarC3.getClass();
                            Map map = eVarC3.f40325u;
                            if (map == null || (list2 = (List) map.get(latLngInfo)) == null) {
                                list2 = n0.f26529a;
                            }
                            pg.c cVar14 = lVar.B;
                            cVar14.getClass();
                            ((MapBottomSheet) cVar14.f34805f).setSheetData(y.a(lVar.f32685v, null, list2, null, 1));
                            lVar.L(false);
                            pg.c cVar15 = lVar.B;
                            cVar15.getClass();
                            ((MapBottomSheet) cVar15.f34805f).setTopOffset(lVar.E(false));
                            pg.c cVar16 = lVar.B;
                            cVar16.getClass();
                            MapBottomSheet mapBottomSheet = (MapBottomSheet) cVar16.f34805f;
                            Fragment parentFragment3 = lVar.getParentFragment();
                            lm.i iVar3 = parentFragment3 instanceof lm.i ? (lm.i) parentFragment3 : null;
                            mapBottomSheet.setTopViewHeightDp(iVar3 != null ? iVar3.v() : 0);
                            LatLngInfo latLngInfo2 = lVar.f32683t;
                            if (latLngInfo2 != null && lVar.C().c(latLngInfo2) != null) {
                                lVar.Q(latLngInfo2, false);
                            }
                            if (lVar.C().c(latLngInfo) != null) {
                                lVar.Q(latLngInfo, true);
                            }
                            lVar.f32683t = latLngInfo;
                            lVar.f32684u = latLngInfo;
                            lVar.A = true;
                            st.a aVar18 = lVar.f32677n;
                            if (aVar18 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                aVar18 = null;
                            }
                            try {
                                u00.g gVar7 = (u00.g) ((rt.d) aVar18).f38233a.f33836b;
                                Parcel parcelL5 = gVar7.L();
                                parcelL5.writeInt(0);
                                parcelL5.writeInt(40);
                                parcelL5.writeInt(0);
                                parcelL5.writeInt(300);
                                gVar7.M(39, parcelL5);
                                st.b bVar3 = new st.b(latLngInfo.getLatitude(), latLngInfo.getLongitude());
                                st.a aVar19 = lVar.f32677n;
                                if (aVar19 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                } else {
                                    aVar = aVar19;
                                }
                                lVar.y(bVar3, ((rt.d) aVar).j());
                            } catch (RemoteException e14) {
                                qc.y.l(e14);
                                return null;
                            }
                            break;
                    }
                } else {
                    lVar.B();
                    tm.e eVarC4 = lVar.C();
                    eVarC4.getClass();
                    Map map2 = eVarC4.f40325u;
                    if (map2 == null || (list = (List) map2.get(latLngInfo)) == null) {
                        linkedHashMap = null;
                    } else {
                        linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list) {
                            String strM370getStoreId7QsYvu8 = mv.d.m((BasicItem) obj2).m370getStoreId7QsYvu8();
                            if (strM370getStoreId7QsYvu8 == null) {
                                strM370getStoreId7QsYvu8 = null;
                            }
                            Object arrayList2 = linkedHashMap.get(strM370getStoreId7QsYvu8);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap.put(strM370getStoreId7QsYvu8, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                    }
                    if (linkedHashMap != null) {
                        arrayList = new ArrayList(linkedHashMap.size());
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            StoreLocation storeLocation = mv.d.m((BasicItem) ((List) ((Map.Entry) it2.next()).getValue()).get(0)).getStoreLocation();
                            arrayList.add(storeLocation != null ? storeLocation.getLatLngInfo() : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        linkedHashMap2 = new LinkedHashMap();
                        for (Object obj3 : arrayList) {
                            LatLngInfo latLngInfo3 = (LatLngInfo) obj3;
                            Object arrayList3 = linkedHashMap2.get(latLngInfo3);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap2.put(latLngInfo3, arrayList3);
                            }
                            ((List) arrayList3).add(obj3);
                        }
                    } else {
                        linkedHashMap2 = null;
                    }
                    if (linkedHashMap2 == null) {
                        boolValueOf = null;
                    } else if (linkedHashMap2.isEmpty()) {
                        z11 = false;
                        boolValueOf = Boolean.valueOf(z11);
                    } else {
                        Iterator it3 = linkedHashMap2.entrySet().iterator();
                        while (it3.hasNext()) {
                            if (((List) ((Map.Entry) it3.next()).getValue()).size() == 1) {
                                z11 = true;
                                boolValueOf = Boolean.valueOf(z11);
                            }
                        }
                        z11 = false;
                        boolValueOf = Boolean.valueOf(z11);
                    }
                    if (linkedHashMap2 == null) {
                        boolValueOf2 = null;
                    } else if (linkedHashMap2.isEmpty()) {
                        z12 = false;
                        boolValueOf2 = Boolean.valueOf(z12);
                    } else {
                        Iterator it4 = linkedHashMap2.entrySet().iterator();
                        while (it4.hasNext()) {
                            if (((List) ((Map.Entry) it4.next()).getValue()).size() > 1) {
                                boolValueOf2 = Boolean.valueOf(z12);
                            }
                        }
                        z12 = false;
                        boolValueOf2 = Boolean.valueOf(z12);
                    }
                    if (Intrinsics.areEqual(boolValueOf2, Boolean.TRUE) && Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                        st.a aVar20 = lVar.f32677n;
                        if (aVar20 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                            aVar20 = null;
                        }
                        fE = ((rt.d) aVar20).h();
                    } else {
                        st.a aVar21 = lVar.f32677n;
                        if (aVar21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                            aVar21 = null;
                        }
                        float fH2 = ((rt.d) aVar21).h();
                        st.a aVar22 = lVar.f32677n;
                        if (aVar22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                            aVar22 = null;
                        }
                        fE = mv.d.e(fH2, ((rt.d) aVar22).j());
                    }
                    st.a aVar23 = lVar.f32677n;
                    if (aVar23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    } else {
                        aVar3 = aVar23;
                    }
                    ((rt.d) aVar3).e(bVar2, Float.valueOf(fE), new p(19), new p(20));
                }
                break;
            default:
                BasicItem basicItem2 = (BasicItem) obj;
                basicItem2.getClass();
                mv.d.f(basicItem2, !basicItem2.getFavorite());
                lVar.C().l(basicItem2);
                break;
        }
        return Unit.f26487a;
    }
}
