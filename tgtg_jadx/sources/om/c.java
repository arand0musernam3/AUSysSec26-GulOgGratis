package om;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import bg.k0;
import c1.q;
import com.app.tgtg.R;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ky.p;
import org.bouncycastle.iana.AEADAlgorithm;
import pm.y;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f32650b;

    public /* synthetic */ c(l lVar, int i11) {
        this.f32649a = i11;
        this.f32650b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f32649a;
        p pVar = null;
        ft.j jVar = null;
        st.a aVar = null;
        st.a aVar2 = null;
        l lVar = this.f32650b;
        switch (i11) {
            case 0:
                p pVar2 = lVar.f32671g;
                if (pVar2 != null) {
                    pVar = pVar2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("locationPickerNavigation");
                }
                o0 o0VarRequireActivity = lVar.requireActivity();
                o0VarRequireActivity.getClass();
                pVar.getClass();
                p.r(o0VarRequireActivity);
                break;
            case 1:
                lVar.C().n(cv.i.ACTION_BROWSE_MAP_BUTTON_CLICKED, null);
                pg.c cVar = lVar.B;
                cVar.getClass();
                ((ComposeView) cVar.f34806g).setVisibility(8);
                pg.c cVar2 = lVar.B;
                cVar2.getClass();
                ((MapBottomSheet) cVar2.f34805f).getHideBottomSheet().invoke();
                Fragment parentFragment = lVar.getParentFragment();
                lm.i iVar = parentFragment instanceof lm.i ? (lm.i) parentFragment : null;
                if (iVar != null && iVar.s().f40311f.b()) {
                    iVar.f27927q.setValue(Boolean.FALSE);
                }
                break;
            case 2:
                lVar.G.invoke();
                break;
            case 3:
                lVar.A();
                break;
            case 4:
                pg.c cVar3 = lVar.B;
                cVar3.getClass();
                ((MapBottomSheet) cVar3.f34805f).setSheetData(null);
                lVar.B();
                pg.c cVar4 = lVar.B;
                cVar4.getClass();
                ((NewLocationPicker) cVar4.f34807h).setVisibility(8);
                f0.B(lVar, null, null, new j(lVar, false, null), 3);
                break;
            case 5:
                if (lVar.C().f40311f.d()) {
                    pg.c cVar5 = lVar.B;
                    cVar5.getClass();
                    ((NewLocationPicker) cVar5.f34807h).setVisibility(0);
                    pg.c cVar6 = lVar.B;
                    cVar6.getClass();
                    NewLocationPicker newLocationPicker = (NewLocationPicker) cVar6.f34807h;
                    newLocationPicker.setOpenedFrom(dv.d.BROWSE.a());
                    newLocationPicker.setShowSheet(true);
                    newLocationPicker.setOnApplyChangesClicked(new c(lVar, 4));
                } else {
                    lVar.C().f40316k.c(f70.i.BROWSE);
                }
                break;
            case 6:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context = lVar.getContext();
                intent.setData(Uri.fromParts("package", context != null ? context.getPackageName() : null, null));
                Context contextD = p70.g.d(lVar.requireContext());
                Activity activity = contextD instanceof Activity ? (Activity) contextD : null;
                if (activity != null) {
                    activity.startActivityForResult(intent, AppConstants.GO_TO_GPS_SETTINGS);
                }
                break;
            case 7:
                lVar.J();
                lVar.N();
                break;
            case 8:
                lVar.J();
                lVar.N();
                break;
            case 9:
                Fragment parentFragment2 = lVar.getParentFragment();
                lm.i iVar2 = parentFragment2 instanceof lm.i ? (lm.i) parentFragment2 : null;
                if (iVar2 != null) {
                    iVar2.q();
                }
                lVar.A();
                break;
            case 10:
                lVar.A();
                break;
            case 11:
                st.a aVar3 = lVar.f32677n;
                if (aVar3 != null) {
                    Location locationG = ((rt.d) aVar3).g();
                    st.a aVar4 = lVar.f32677n;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar4 = null;
                    }
                    float fJ = ((rt.d) aVar4).j();
                    st.a aVar5 = lVar.f32677n;
                    if (aVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    } else {
                        aVar2 = aVar5;
                    }
                    float fH = ((rt.d) aVar2).h();
                    float f11 = fJ + 2.5f;
                    if (f11 <= fH) {
                        fH = f11;
                    }
                    lVar.y(new st.b(locationG.getLatitude(), locationG.getLongitude()), fH);
                }
                break;
            case 12:
                lVar.A();
                break;
            case 13:
                lVar.A();
                break;
            case 14:
                if (lVar.C().B) {
                    lVar.P(sm.b.CLICKED);
                    tm.e eVarC = lVar.C();
                    eVarC.f40308c.e(false, new q(eVarC, 8));
                } else if (lVar.C().i()) {
                    lVar.I(lVar.f32681r, lVar.C().j());
                } else {
                    lVar.C().getClass();
                    lVar.I(tm.e.f(), lVar.C().j());
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                st.a aVar6 = lVar.f32677n;
                if (aVar6 != null) {
                    Location locationG2 = ((rt.d) aVar6).g();
                    st.a aVar7 = lVar.f32677n;
                    if (aVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    } else {
                        aVar = aVar7;
                    }
                    float fJ2 = ((rt.d) aVar).j() - 3.0f;
                    lVar.y(new st.b(locationG2.getLatitude(), locationG2.getLongitude()), fJ2 >= 3.0f ? fJ2 : 3.0f);
                    lVar.A();
                }
                break;
            case 16:
                lVar.A();
                break;
            case 17:
                lVar.G.invoke();
                break;
            case 18:
                lVar.A();
                break;
            case 19:
                lVar.A();
                break;
            case 20:
                lVar.A();
                break;
            case 21:
                lVar.D();
                break;
            case 22:
                lVar.A();
                break;
            case 23:
                boolean zH = lVar.H();
                if (!lVar.C().f40311f.b()) {
                    pg.c cVar7 = lVar.B;
                    cVar7.getClass();
                    ((ComposeView) cVar7.f34803d).setVisibility(0);
                    pg.c cVar8 = lVar.B;
                    cVar8.getClass();
                    ((MapBottomSheet) cVar8.f34805f).setSheetData(null);
                    lVar.L(true);
                }
                lVar.K();
                lVar.B();
                if (zH) {
                    lVar.f32683t = null;
                    lVar.f32684u = null;
                    pg.c cVar9 = lVar.B;
                    cVar9.getClass();
                    y sheetData = ((MapBottomSheet) cVar9.f34805f).getSheetData();
                    if (sheetData != null) {
                        sheetData.f35566b = null;
                    }
                    lVar.D();
                }
                break;
            case 24:
                lVar.C().n(cv.i.ACTION_BROWSE_MAP_LIST_CLICKED, null);
                lVar.C().g(lVar.F());
                lVar.K();
                break;
            case 25:
                ft.j jVar2 = ft.j.f17932h;
                if (jVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                    jVar2 = null;
                }
                if (jVar2.h()) {
                    ft.j jVar3 = ft.j.f17932h;
                    if (jVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("instance");
                        jVar3 = null;
                    }
                    if (!jVar3.i()) {
                        Context contextD2 = p70.g.d(lVar.getContext());
                        contextD2.getClass();
                        Activity activity2 = (Activity) contextD2;
                        ft.j jVar4 = ft.j.f17932h;
                        if (jVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("instance");
                        } else {
                            jVar = jVar4;
                        }
                        jVar.c(activity2);
                    }
                } else {
                    Context contextD3 = p70.g.d(lVar.getContext());
                    contextD3.getClass();
                    if (androidx.core.app.e.l((Activity) contextD3, "android.permission.ACCESS_FINE_LOCATION") || !ft.c.m()) {
                        Context contextD4 = p70.g.d(lVar.getContext());
                        contextD4.getClass();
                        androidx.core.app.e.k((Activity) contextD4, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, AppConstants.PERMISSIONS_REQUEST_USE_LOCATION);
                        ft.c.Q();
                    } else {
                        Context contextD5 = p70.g.d(lVar.getContext());
                        contextD5.getClass();
                        k0 k0Var = new k0((Activity) contextD5);
                        k0Var.e(R.string.generic_error_view_alert_go_to_settings_title);
                        k0Var.a(R.string.generic_error_view_alert_go_to_settings_description);
                        k0Var.c(R.string.generic_error_view_alert_go_to_settings_positive_btn);
                        k0Var.l = new c(lVar, 6);
                        k0Var.b(R.string.generic_error_view_alert_go_to_settings_negative_btn);
                        k0Var.f();
                    }
                }
                break;
            default:
                lVar.J();
                lVar.N();
                break;
        }
        return Unit.f26487a;
    }
}
