package al;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.m1;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.login.SplashActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.ItemId;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f1590b;

    public /* synthetic */ r(SplashActivity splashActivity, int i11) {
        this.f1589a = i11;
        this.f1590b = splashActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f1589a;
        SplashActivity splashActivity = this.f1590b;
        ActivityResultLauncher activityResultLauncher = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z11 = false;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i12 = 1;
        switch (i11) {
            case 0:
                z20.a aVar = (z20.a) obj;
                int i13 = SplashActivity.l;
                if (aVar.f46928a == 3) {
                    z20.e eVar = splashActivity.f9038g;
                    if (eVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("updateManager");
                        eVar = null;
                    }
                    ActivityResultLauncher activityResultLauncher2 = splashActivity.f9039h;
                    if (activityResultLauncher2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("updateFlowLauncher");
                    } else {
                        activityResultLauncher = activityResultLauncher2;
                    }
                    z20.m mVarA = z20.m.a(1).a();
                    eVar.getClass();
                    z20.e.b(aVar, activityResultLauncher, mVarA);
                }
                return Unit.f26487a;
            case 1:
                f70.h hVar = (f70.h) obj;
                int i14 = SplashActivity.l;
                hVar.getClass();
                if (hVar instanceof el.a) {
                    Intent intent = new Intent(splashActivity, (Class<?>) TrackingConsentActivity.class);
                    el.a aVar2 = (el.a) hVar;
                    intent.putExtra("IS_FROM_APP_START", true);
                    intent.putExtra("IS_FROM_DEEPLINK", aVar2.f16076a);
                    intent.putExtra("IS_LOGGED_IN", aVar2.f16077b);
                    splashActivity.startActivityForResult(intent, AppConstants.REQUEST_CODE_TRACKING_CONSENT);
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            default:
                ((Boolean) obj).getClass();
                int i15 = SplashActivity.l;
                SplashActivity splashActivity2 = this.f1590b;
                if (splashActivity2.a0().f1523c.f4469b.a()) {
                    c0 c0VarA0 = splashActivity2.a0();
                    c0VarA0.getClass();
                    v vVar = new v(c0VarA0, objArr2 == true ? 1 : 0, objArr4 == true ? 1 : 0);
                    kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
                    if (((ResumePaymentData) f0.E(gVar, vVar)) != null) {
                        c0 c0VarA02 = splashActivity2.a0();
                        c0VarA02.getClass();
                        ResumePaymentData resumePaymentData = (ResumePaymentData) f0.E(gVar, new v(c0VarA02, objArr == true ? 1 : 0, objArr3 == true ? 1 : 0));
                        if (resumePaymentData != null) {
                            if (resumePaymentData.isMultiItem()) {
                                f70.g gVar2 = splashActivity2.a0().f1529i.f16080a;
                                mk.c cVar = new mk.c(ItemId.m198constructorimpl("-1"), ItemViewActivity.class);
                                cVar.f29982e = true;
                                cVar.f29983f = true;
                                gVar2.a(cVar.a());
                            } else if (resumePaymentData.m194getItemIdRWxzYZM() != null) {
                                c0 c0VarA03 = splashActivity2.a0();
                                String strM194getItemIdRWxzYZM = resumePaymentData.m194getItemIdRWxzYZM();
                                c0VarA03.getClass();
                                strM194getItemIdRWxzYZM.getClass();
                                el.d dVar = c0VarA03.f1529i;
                                dVar.getClass();
                                f70.g gVar3 = dVar.f16080a;
                                mk.c cVar2 = new mk.c(strM194getItemIdRWxzYZM, ItemViewActivity.class);
                                cVar2.f29982e = true;
                                cVar2.f29983f = true;
                                gVar3.a(cVar2.a());
                            }
                        }
                    } else if (splashActivity2.a0().f1532m != null) {
                        qj.m mVar = splashActivity2.a0().f1532m;
                        if (mVar != null) {
                            c0 c0VarA04 = splashActivity2.a0();
                            cv.i iVarC = mVar.c();
                            dv.b bVarD = mVar.d();
                            c0VarA04.getClass();
                            iVarC.getClass();
                            c0VarA04.f1525e.c(iVarC, bVarD);
                            if (!((hv.j) splashActivity2.a0().f1528h).b()) {
                                c0 c0VarA05 = splashActivity2.a0();
                                c0VarA05.getClass();
                                c0VarA05.f1530j.f39042a.a(mVar.a());
                            } else if (mVar instanceof qj.v) {
                                c0 c0VarA06 = splashActivity2.a0();
                                q qVar = new q(splashActivity2, i12);
                                c0VarA06.getClass();
                                f0.B(m1.d(c0VarA06), null, null, new n((Object) c0VarA06, (Object) splashActivity2, (String) null, (Object) qVar, (x70.c) null, 1), 3);
                            } else if (mVar instanceof qj.x) {
                                c0 c0VarA07 = splashActivity2.a0();
                                String str = ((qj.x) mVar).f37155a;
                                q qVar2 = new q(splashActivity2, 2);
                                c0VarA07.getClass();
                                f0.B(m1.d(c0VarA07), null, null, new n((Object) c0VarA07, (Object) splashActivity2, str, (Object) qVar2, (x70.c) null, 1), 3);
                            } else {
                                c0 c0VarA08 = splashActivity2.a0();
                                c0VarA08.getClass();
                                c0VarA08.f1530j.f39042a.a(mVar.a());
                            }
                        }
                        splashActivity2.finish();
                    } else {
                        splashActivity2.b0();
                    }
                } else {
                    splashActivity2.d0();
                }
                return Unit.f26487a;
        }
    }
}
