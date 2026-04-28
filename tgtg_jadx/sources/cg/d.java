package cg;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.m1;
import c5.f3;
import c5.z1;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.local.SnackBarType;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.Order;
import g3.w6;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.h1;
import org.json.JSONObject;
import y80.a2;
import zendesk.android.messaging.UrlSource;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7951f;

    public /* synthetic */ d(Function0 function0, Function1 function1, h1 h1Var, h1 h1Var2, h1 h1Var3) {
        this.f7946a = 4;
        this.f7950e = function1;
        this.f7947b = function0;
        this.f7948c = h1Var;
        this.f7949d = h1Var2;
        this.f7951f = h1Var3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String invitationId;
        int i11 = this.f7946a;
        x70.c cVar = null;
        Object obj = this.f7951f;
        Object obj2 = this.f7950e;
        Object obj3 = this.f7949d;
        Object obj4 = this.f7948c;
        Object obj5 = this.f7947b;
        switch (i11) {
            case 0:
                f3 f3Var = (f3) obj5;
                g4.l lVar = (g4.l) obj4;
                v80.b0 b0Var = (v80.b0) obj3;
                Function1 function1 = (Function1) obj2;
                v2.h hVar = (v2.h) obj;
                if (f3Var != null) {
                    ((z1) f3Var).a();
                }
                ((g4.p) lVar).b(true);
                v80.f0.B(b0Var, null, null, new aa.l0(function1, hVar, cVar, 9), 3);
                return Unit.f26487a;
            case 1:
                ep.d0 d0Var = (ep.d0) obj5;
                Activity activity = (Activity) obj3;
                Function0 function0 = (Function0) obj;
                o00.h0.h((g9.f0) obj2, d0Var);
                d0Var.p((Context) obj4);
                if (((String) d0Var.f16247g.a("SHARED_RECIPE_TOKEN")) == null || activity == null) {
                    o00.h0.g(d0Var, function0);
                } else {
                    mv.a0 a0Var = new mv.a0();
                    mv.z zVar = mv.z.DISCOVER;
                    zVar.getClass();
                    a0Var.f30138a = zVar;
                    a0Var.c(activity);
                }
                return Unit.f26487a;
            case 2:
                ep.d0 d0Var2 = (ep.d0) obj5;
                b1 b1Var = (b1) obj3;
                g9.f0 f0Var = (g9.f0) obj2;
                Context context = (Context) obj;
                ((b1) obj4).setValue(Boolean.FALSE);
                d0Var2.getClass();
                SharedPreferences sharedPreferences = ft.e.f17922c;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                    sharedPreferences = null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("recipeGeneratorImageConsentGiven", true);
                editorEdit.apply();
                a2 a2Var = d0Var2.J;
                Boolean bool = Boolean.TRUE;
                a2Var.getClass();
                a2Var.k(null, bool);
                hp.c cVar2 = (hp.c) b1Var.getValue();
                if (cVar2 != null) {
                    g9.p.f(f0Var, hp.s.INSTANCE.f22335a);
                    d0Var2.x(cVar2.f22258a, mv.r0.u(context), cVar2.f22259b);
                    b1Var.setValue(null);
                }
                return Unit.f26487a;
            case 3:
                SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) obj5;
                b1 b1Var2 = (b1) obj4;
                v80.b0 b0Var2 = (v80.b0) obj3;
                w6 w6Var = (w6) obj2;
                b1 b1Var3 = (b1) obj;
                int i12 = SurpriseBagOrderActivity.f9178y;
                if (mv.r0.u(surpriseBagOrderActivity)) {
                    no.m0 m0VarC = surpriseBagOrderActivity.C();
                    Order order = (Order) m0VarC.f22215i.f45488a.getValue();
                    if (order != null && (invitationId = order.getInvitationId()) != null) {
                        v80.f0.B(m1.d(m0VarC), null, null, new no.f0(m0VarC, invitationId, order, (x70.c) null), 3);
                    }
                    no.m0 m0VarC2 = surpriseBagOrderActivity.C();
                    cv.i iVar = cv.i.ACTION_SEND_INVITATION_BACK;
                    dv.a aVar = dv.a.ORDER_ID;
                    Order order2 = (Order) surpriseBagOrderActivity.C().f22215i.f45488a.getValue();
                    m0VarC2.l(iVar, h0.g.E(new Pair(aVar, new dv.c(order2 != null ? order2.m429getOrderIdreIZeYA() : null))));
                    surpriseBagOrderActivity.C().l(cv.i.BRAZE_ACTION_DELEGATION_COLLECTOR_RETURNED, null);
                } else {
                    b1Var2.setValue(oo.f.GENERIC);
                }
                v80.f0.B(b0Var2, null, null, new fi.h(w6Var, b1Var3, cVar, 4), 3);
                return Unit.f26487a;
            case 4:
                ((Function1) obj2).invoke(new kn.c(((h1) obj4).h(), ((h1) obj3).h(), ((h1) obj).h()));
                ((Function0) obj5).invoke();
                return Unit.f26487a;
            case 5:
                v80.f0.B((v80.b0) obj3, null, null, new os.c((w6) obj5, (Function0) obj4, (ns.g) obj2, (b1) obj, (x70.c) null, 0), 3);
                return Unit.f26487a;
            case 6:
                return com.braze.communication.e.a((u70.j) obj5, (com.braze.requests.util.d) obj4, (com.braze.communication.e) obj3, (Map) obj2, (JSONObject) obj);
            case 7:
                xj.k kVar = (xj.k) obj5;
                kVar.f(((BasicItem) obj4).getInformation().mo340getItemIdFvU5WIY(), ((vj.c) obj3).f42411a);
                ((Function1) obj2).invoke(SnackBarType.FAVORITE_REMINDER_OFF);
                ((b1) obj).setValue(Boolean.FALSE);
                kVar.c();
                return Unit.f26487a;
            default:
                return ConversationFragment.webViewUriHandler$lambda$4$lambda$3((UrlSource) obj5, (MessageSourceType) obj4, (ConversationFragment) obj3, (MessageActionSize) obj2, (String) obj);
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f7946a = i11;
        this.f7947b = obj;
        this.f7948c = obj2;
        this.f7949d = obj3;
        this.f7950e = obj4;
        this.f7951f = obj5;
    }

    public /* synthetic */ d(v80.b0 b0Var, w6 w6Var, Function0 function0, ns.g gVar, b1 b1Var) {
        this.f7946a = 5;
        this.f7949d = b0Var;
        this.f7947b = w6Var;
        this.f7948c = function0;
        this.f7950e = gVar;
        this.f7951f = b1Var;
    }
}
