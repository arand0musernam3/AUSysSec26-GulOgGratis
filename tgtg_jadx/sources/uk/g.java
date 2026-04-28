package uk;

import android.animation.Animator;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.core.util.Consumer;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import mv.a0;
import mv.r0;
import mv.z;
import pg.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f41330b;

    public /* synthetic */ g(q qVar, int i11) {
        this.f41329a = i11;
        this.f41330b = qVar;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i11 = this.f41329a;
        q qVar = null;
        c cVar = null;
        q qVar2 = this.f41330b;
        switch (i11) {
            case 0:
                int i12 = q.f41347y;
                ((Animator) obj).getClass();
                ((r1) qVar2.f41370x.f35151e).f35122g.setVisibility(8);
                break;
            case 1:
                int i13 = q.f41347y;
                ((View) obj).getClass();
                if (qVar2.f41367u) {
                    ft.j jVar = ft.j.f17932h;
                    if (jVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("instance");
                        jVar = null;
                    }
                    st.a aVar = qVar2.f41349b;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar = null;
                    }
                    LatLng latLng = ((rt.d) aVar).f38233a.q().f12141a;
                    latLng.getClass();
                    jVar.d(new st.b(latLng.f12145a, latLng.f12146b));
                    Double d3 = qVar2.f41368v;
                    if (d3 != null) {
                        double dDoubleValue = d3.doubleValue();
                        ft.e.f17923d.f17906b = d3;
                        SharedPreferences.Editor editorEdit = ft.c.x().edit();
                        String strY = ft.c.y();
                        if (strY == null) {
                            strY = null;
                        }
                        editorEdit.putLong(r8.k.l(strY, "_customSelectedRadiusLong"), Double.doubleToRawLongBits(dDoubleValue));
                        editorEdit.apply();
                    }
                    c cVar2 = qVar2.f41353f;
                    if (cVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                        cVar2 = null;
                    }
                    st.a aVar2 = qVar2.f41349b;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar2 = null;
                    }
                    LatLng latLng2 = ((rt.d) aVar2).f38233a.q().f12141a;
                    latLng2.getClass();
                    LatLngInfo latLngInfo = new LatLngInfo(latLng2.f12145a, latLng2.f12146b);
                    if (!cVar2.f41319j && !cVar2.f41320k) {
                        cVar2.q().getClass();
                        if (Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_YOUR_LOCATION)) {
                            cVar2.v();
                        }
                    }
                    ft.j jVarO = cVar2.o();
                    jl.b bVar = jl.b.OTHER;
                    jVarO.getClass();
                    bVar.getClass();
                    ft.c.i0(bVar);
                    r rVarQ = cVar2.q();
                    q qVar3 = cVar2.f41322n;
                    if (qVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                        qVar3 = null;
                    }
                    float zoomLevel = qVar3.getZoomLevel();
                    rVarQ.getClass();
                    ft.e.f17923d.f17916m = Float.valueOf(zoomLevel);
                    SharedPreferences.Editor editorEdit2 = ft.c.x().edit();
                    String strY2 = ft.c.y();
                    if (strY2 == null) {
                        strY2 = null;
                    }
                    editorEdit2.putFloat(strY2 + "_zoomlvl", zoomLevel);
                    editorEdit2.apply();
                    cVar2.q().getClass();
                    ft.c.g0(AppConstants.LOCATION_PICKER_SELECTED_LOCATION);
                    cVar2.q().getClass();
                    ft.c.k0(latLngInfo);
                    cVar2.q().b(false, cVar2.f41320k);
                    if (cVar2.f41318i) {
                        ky.p pVarP = cVar2.p();
                        o0 o0VarRequireActivity = cVar2.requireActivity();
                        o0VarRequireActivity.getClass();
                        pVarP.getClass();
                        a0 a0Var = new a0();
                        z zVar = z.DISCOVER;
                        zVar.getClass();
                        a0Var.f30138a = zVar;
                        a0Var.f30144g = true;
                        a0Var.c(o0VarRequireActivity);
                    } else {
                        ky.p pVarP2 = cVar2.p();
                        o0 o0VarRequireActivity2 = cVar2.requireActivity();
                        o0VarRequireActivity2.getClass();
                        pVarP2.getClass();
                        ky.p.o(o0VarRequireActivity2);
                    }
                    q qVar4 = cVar2.f41322n;
                    if (qVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    } else {
                        qVar = qVar4;
                    }
                    qVar.s();
                }
                break;
            case 2:
                Editable editable = (Editable) obj;
                int i14 = q.f41347y;
                editable.getClass();
                r1 r1Var = (r1) qVar2.f41370x.f35151e;
                EditText editText = r1Var.f35126k;
                r1Var.f35125j.setVisibility(0);
                BottomSheetBehavior bottomSheetBehavior = qVar2.f41366t;
                if (bottomSheetBehavior != null && bottomSheetBehavior.N == 3 && editable.toString().length() == 0) {
                    r1Var.l.setVisibility(4);
                }
                BottomSheetBehavior bottomSheetBehavior2 = qVar2.f41366t;
                if (bottomSheetBehavior2 != null && bottomSheetBehavior2.N == 3) {
                    editText.setCompoundDrawablesWithIntrinsicBounds(b0.a0.x(qVar2.getContext(), R.drawable.system_icon_search_primary_30), (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    editText.setCompoundDrawablesWithIntrinsicBounds(b0.a0.x(qVar2.getContext(), R.drawable.system_icon_search_neutral_60), (Drawable) null, (Drawable) null, (Drawable) null);
                }
                break;
            case 3:
                int i15 = q.f41347y;
                ((View) obj).getClass();
                r0.p(qVar2.f41355h);
                qVar2.k();
                qVar2.s();
                break;
            case 4:
                int i16 = q.f41347y;
                ((View) obj).getClass();
                c cVar3 = qVar2.f41353f;
                if (cVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                } else {
                    cVar = cVar3;
                }
                if (!cVar.o().h()) {
                    cVar.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1);
                } else if (!cVar.o().i()) {
                    ft.j jVarO2 = cVar.o();
                    o0 o0VarRequireActivity3 = cVar.requireActivity();
                    o0VarRequireActivity3.getClass();
                    jVarO2.c(o0VarRequireActivity3);
                } else {
                    cVar.v();
                }
                break;
            default:
                int i17 = q.f41347y;
                ((Animator) obj).getClass();
                ((r1) qVar2.f41370x.f35151e).f35122g.setVisibility(0);
                break;
        }
    }
}
