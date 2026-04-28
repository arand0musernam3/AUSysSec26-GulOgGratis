package zendesk.ui.android.conversation.textcell;

import androidx.fragment.app.o0;
import androidx.lifecycle.m1;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragmentWeb;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreSignupFragmentWeb;
import com.braze.events.internal.h;
import com.braze.events.internal.t;
import com.braze.managers.d1;
import com.braze.managers.g0;
import com.braze.managers.h1;
import com.braze.managers.l0;
import com.braze.managers.r;
import com.braze.managers.v0;
import com.braze.models.dust.f;
import com.braze.models.dust.g;
import com.google.android.gms.tasks.Task;
import cv.i;
import g9.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o30.e0;
import v80.f0;
import zs.j;
import zs.n;
import zs.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47891b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f47890a = i11;
        this.f47891b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47890a) {
            case 0:
                return TextCellView.render$lambda$1((TextCellView) this.f47891b);
            case 1:
                RecommendStoreFragmentWeb recommendStoreFragmentWeb = (RecommendStoreFragmentWeb) this.f47891b;
                p pVarT = e0.t(recommendStoreFragmentWeb);
                o0 o0VarRequireActivity = recommendStoreFragmentWeb.requireActivity();
                o0VarRequireActivity.getClass();
                j.s(pVarT, o0VarRequireActivity);
                return Unit.f26487a;
            case 2:
                return ((j) this.f47891b).getDefaultViewModelProviderFactory();
            case 3:
                StoreSignupFragmentWeb storeSignupFragmentWeb = (StoreSignupFragmentWeb) this.f47891b;
                o oVarP = storeSignupFragmentWeb.p();
                i iVar = i.ACTION_STORE_SUBMIT;
                dv.a aVar = dv.a.TYPE;
                dv.d dVar = dv.d.SIGNUP;
                x70.c cVar = null;
                String strA = dVar != null ? dVar.a() : null;
                iVar.getClass();
                aVar.getClass();
                oVarP.f48099b.d(iVar, aVar, strA);
                o oVarP2 = storeSignupFragmentWeb.p();
                i iVar2 = i.APPSFLYER_ACTION_STORE_SUBMIT;
                String strA2 = dVar != null ? dVar.a() : null;
                iVar2.getClass();
                oVarP2.f48099b.d(iVar2, aVar, strA2);
                o oVarP3 = storeSignupFragmentWeb.p();
                f0.B(m1.d(oVarP3), null, null, new n(oVarP3, cVar, 1), 3);
                return Unit.f26487a;
            case 4:
                return com.braze.managers.c.a((com.braze.managers.c) this.f47891b);
            case 5:
                return g0.a((h) this.f47891b);
            case 6:
                return g0.b((g) this.f47891b);
            case 7:
                return g0.a((f) this.f47891b);
            case 8:
                return h1.a((d1) this.f47891b);
            case 9:
                return h1.a((t) this.f47891b);
            case 10:
                return com.braze.managers.j.a((com.braze.managers.j) this.f47891b);
            case 11:
                return l0.a((Task) this.f47891b);
            case 12:
                return r.b((Throwable) this.f47891b);
            default:
                return v0.a((com.braze.models.push.a) this.f47891b);
        }
    }
}
