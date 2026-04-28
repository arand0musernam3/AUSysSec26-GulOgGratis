package xn;

import androidx.lifecycle.m1;
import c90.e;
import c90.f;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.order.OrderType;
import com.google.firebase.messaging.a0;
import cv.i;
import h0.g;
import hm.r;
import hm.v;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import pg.u1;
import v80.f0;
import v80.p0;
import yn.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f44471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f44472c;

    public /* synthetic */ c(a0 a0Var, j jVar, int i11) {
        this.f44470a = i11;
        this.f44471b = a0Var;
        this.f44472c = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f44470a;
        x70.c cVar = null;
        j jVar = this.f44472c;
        a0 a0Var = this.f44471b;
        switch (i11) {
            case 0:
                v vVar = (v) a0Var.f12780c;
                BriefOrder briefOrder = jVar.f46291a;
                vVar.f22169w = briefOrder;
                String invitationId = briefOrder.getInvitationId();
                if (invitationId != null) {
                    vVar.getClass();
                    f0.B(m1.d(vVar), null, null, new h2.a0(vVar, invitationId, cVar, 5), 3);
                    vVar.d(i.ACTION_SEND_INVITATION_BACK, g.E(new Pair(dv.a.ORDER_ID, new dv.c(briefOrder.m321getOrderIdreIZeYA()))));
                } else {
                    String strM321getOrderIdreIZeYA = briefOrder.m321getOrderIdreIZeYA();
                    vVar.getClass();
                    strM321getOrderIdreIZeYA.getClass();
                    a9.a aVarD = m1.d(vVar);
                    f fVar = p0.f42144a;
                    f0.B(aVarD, e.f7834b, null, new h2.a0(vVar, strM321getOrderIdreIZeYA, cVar, 2), 2);
                }
                ArrayList arrayListD = d0.d(briefOrder);
                vVar.getClass();
                f0.B(m1.d(vVar), null, null, new r(arrayListD, vVar, cVar, 0), 3);
                ((MainActivity) a0Var.f12782e).f9083j.d((u1) a0Var.f12781d);
                break;
            default:
                p30.b.w((MainActivity) a0Var.f12782e, new io.a(jVar.f46291a.m321getOrderIdreIZeYA(), null, OrderType.MAGICBAG, false, f70.i.ORDER_CHANGED_POPUP, 90), null);
                break;
        }
        return Unit.f26487a;
    }
}
