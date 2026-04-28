package uk;

import android.content.Context;
import android.widget.ListAdapter;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.mapService.Locations;
import com.app.tgtg.model.remote.mapService.response.SearchLocationResponse;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;
import pg.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f41309b;

    public /* synthetic */ b(c cVar, int i11) {
        this.f41308a = i11;
        this.f41309b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q qVar;
        q qVar2;
        int i11 = this.f41308a;
        c cVar = this.f41309b;
        switch (i11) {
            case 0:
                List<Locations> locations = ((SearchLocationResponse) obj).getLocations();
                if (locations != null) {
                    q qVar3 = cVar.f41322n;
                    if (qVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                        qVar3 = null;
                    }
                    qVar3.getClass();
                    Context context = qVar3.getContext();
                    context.getClass();
                    m mVar = new m(context, locations);
                    qVar3.f41354g = mVar;
                    mVar.setNotifyOnChange(true);
                    ((r1) qVar3.f41370x.f35151e).f35123h.setAdapter((ListAdapter) qVar3.f41354g);
                    if (!locations.isEmpty()) {
                        q qVar4 = cVar.f41322n;
                        if (qVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("view");
                            qVar4 = null;
                        }
                        qVar4.q(false);
                        q qVar5 = cVar.f41322n;
                        if (qVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("view");
                            qVar = null;
                        } else {
                            qVar = qVar5;
                        }
                        qVar.r(true);
                        cVar.l = false;
                    } else if (!cVar.l) {
                        q qVar6 = cVar.f41322n;
                        if (qVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("view");
                            qVar6 = null;
                        }
                        qVar6.q(true);
                        q qVar7 = cVar.f41322n;
                        if (qVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("view");
                            qVar7 = null;
                        }
                        qVar7.r(false);
                        cVar.l = true;
                        int length = cVar.f41321m.length();
                        q qVar8 = cVar.f41322n;
                        if (length > 0) {
                            if (qVar8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("view");
                                qVar8 = null;
                            }
                            qVar8.setHintForList(R.string.location_picker_no_search_result_found_for_list);
                        } else {
                            if (qVar8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("view");
                                qVar8 = null;
                            }
                            qVar8.setHintForList(R.string.location_picker_hint_for_list);
                        }
                    }
                }
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                if (cVar.getContext() != null) {
                    Context contextRequireContext = cVar.requireContext();
                    contextRequireContext.getClass();
                    th2.getClass();
                    r0.o(contextRequireContext, th2);
                }
                break;
            default:
                LatLngInfo latLngInfo = (LatLngInfo) obj;
                latLngInfo.getClass();
                q qVar9 = cVar.f41322n;
                if (qVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar9 = null;
                }
                ((r1) qVar9.f41370x.f35151e).f35126k.getText().clear();
                q qVar10 = cVar.f41322n;
                if (qVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar10 = null;
                }
                qVar10.q(false);
                q qVar11 = cVar.f41322n;
                if (qVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar11 = null;
                }
                qVar11.r(false);
                q qVar12 = cVar.f41322n;
                if (qVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar12 = null;
                }
                m mVar2 = qVar12.f41354g;
                if (mVar2 != null) {
                    mVar2.clear();
                }
                q qVar13 = cVar.f41322n;
                if (qVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar13 = null;
                }
                r0.p(qVar13.f41355h);
                q qVar14 = cVar.f41322n;
                if (qVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar14 = null;
                }
                qVar14.k();
                q qVar15 = cVar.f41322n;
                if (qVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar15 = null;
                }
                qVar15.getClass();
                if (qVar15.f41352e) {
                    String str = qVar15.f41364r;
                    if (str != null) {
                        st.a aVar = qVar15.f41349b;
                        if (aVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                            aVar = null;
                        }
                        ((rt.d) aVar).l(str);
                    }
                    Double d3 = qVar15.f41368v;
                    d3.getClass();
                    double dDoubleValue = d3.doubleValue() * ((double) 1000);
                    st.a aVar2 = qVar15.f41349b;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar2 = null;
                    }
                    qVar15.f41364r = ((rt.d) aVar2).b(new st.b(latLngInfo.getLatitude(), latLngInfo.getLongitude()), dDoubleValue, qVar15.getContext().getColor(android.R.color.transparent));
                    st.a aVar3 = qVar15.f41349b;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar3 = null;
                    }
                    String str2 = qVar15.f41364r;
                    str2.getClass();
                    float fK = ((rt.d) aVar3).k(str2);
                    st.a aVar4 = qVar15.f41349b;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar4 = null;
                    }
                    double latitude = latLngInfo.getLatitude();
                    double longitude = latLngInfo.getLongitude();
                    i iVar = new i(qVar15, 2);
                    i iVar2 = new i(qVar15, 3);
                    rt.d dVar = (rt.d) aVar4;
                    dVar.getClass();
                    dVar.f38233a.m(ba0.g.E(new LatLng(latitude, longitude), fK), new oz.m(17, iVar, iVar2));
                    r0.p(qVar15.f41355h);
                    m mVar3 = qVar15.f41354g;
                    if (mVar3 != null) {
                        mVar3.clear();
                    }
                    st.a aVar5 = qVar15.f41349b;
                    if (aVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar5 = null;
                    }
                    rt.d dVar2 = (rt.d) aVar5;
                    dVar2.f38233a.x(new rt.b(new i(qVar15, 4), dVar2));
                }
                q qVar16 = cVar.f41322n;
                if (qVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar16 = null;
                }
                st.a aVar6 = qVar16.f41349b;
                if (aVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar6 = null;
                }
                ((rt.d) aVar6).s(null);
                q qVar17 = cVar.f41322n;
                if (qVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar17 = null;
                }
                qVar17.s();
                q qVar18 = cVar.f41322n;
                if (qVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar18 = null;
                }
                qVar18.setMarkedLocationBtnClickable(false);
                q qVar19 = cVar.f41322n;
                if (qVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar2 = null;
                } else {
                    qVar2 = qVar19;
                }
                qVar2.setTextOnBtnUseMarkedLocation(R.string.location_picker_user_selected_location);
                cVar.f41320k = true;
                break;
        }
        return Unit.f26487a;
    }
}
