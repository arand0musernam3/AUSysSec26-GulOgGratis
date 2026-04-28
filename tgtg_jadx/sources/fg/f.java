package fg;

import b4.t;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import dp.x;
import g3.w6;
import kotlin.jvm.functions.Function0;
import m3.b1;
import m3.h1;
import m3.s;
import um.u;
import v80.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17691d;

    public f(w6 w6Var, Function0 function0, b0 b0Var) {
        this.f17688a = 2;
        this.f17690c = b0Var;
        this.f17691d = w6Var;
        this.f17689b = function0;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f17688a) {
            case 0:
                t tVar = (t) obj;
                ((Number) obj3).intValue();
                tVar.getClass();
                s sVar = (s) ((m3.n) obj2);
                sVar.a0(1702118549);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = a0.g(sVar);
                }
                t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new x(this.f17689b, this.f17690c, this.f17691d, 1), 28);
                sVar.q(false);
                return tVarB;
            case 1:
                t tVar2 = (t) obj;
                ((Number) obj3).intValue();
                tVar2.getClass();
                s sVar2 = (s) ((m3.n) obj2);
                sVar2.a0(1702118549);
                Object objM2 = sVar2.M();
                if (objM2 == m3.m.f29332a) {
                    objM2 = a0.g(sVar2);
                }
                t tVarB2 = androidx.compose.foundation.b.b(tVar2, (b2.l) objM2, null, false, null, null, new x(this.f17689b, this.f17691d, (b1) this.f17690c, 2), 28);
                sVar2.q(false);
                return tVarB2;
            case 2:
                t tVar3 = (t) obj;
                ((Number) obj3).intValue();
                tVar3.getClass();
                s sVar3 = (s) ((m3.n) obj2);
                sVar3.a0(1702118549);
                Object objM3 = sVar3.M();
                if (objM3 == m3.m.f29332a) {
                    objM3 = a0.g(sVar3);
                }
                t tVarB3 = androidx.compose.foundation.b.b(tVar3, (b2.l) objM3, null, false, null, null, new x((b0) this.f17690c, (w6) this.f17691d, (Function0) this.f17689b, 3), 28);
                sVar3.q(false);
                return tVarB3;
            case 3:
                t tVar4 = (t) obj;
                ((Number) obj3).intValue();
                tVar4.getClass();
                s sVar4 = (s) ((m3.n) obj2);
                sVar4.a0(-310878134);
                j5.j jVar = new j5.j(0);
                Object objM4 = sVar4.M();
                if (objM4 == m3.m.f29332a) {
                    objM4 = a0.g(sVar4);
                }
                t tVarB4 = androidx.compose.foundation.b.b(tVar4, (b2.l) objM4, null, false, (String) this.f17689b, jVar, new bn.b0(20, (LatLngInfo) this.f17690c, (m1.a) this.f17691d), 4);
                sVar4.q(false);
                return tVarB4;
            default:
                t tVar5 = (t) obj;
                ((Number) obj3).intValue();
                tVar5.getClass();
                s sVar5 = (s) ((m3.n) obj2);
                sVar5.a0(1702118549);
                Object objM5 = sVar5.M();
                if (objM5 == m3.m.f29332a) {
                    objM5 = a0.g(sVar5);
                }
                t tVarB5 = androidx.compose.foundation.b.b(tVar5, (b2.l) objM5, null, false, null, null, new x((BasketManager) this.f17689b, (BaseItemMnuV2) this.f17690c, (u) this.f17691d, 5), 28);
                sVar5.q(false);
                return tVarB5;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i11) {
        this.f17688a = i11;
        this.f17689b = obj;
        this.f17690c = obj2;
        this.f17691d = obj3;
    }

    public f(Function0 function0, h1 h1Var, b1 b1Var) {
        this.f17688a = 1;
        this.f17689b = function0;
        this.f17691d = h1Var;
        this.f17690c = b1Var;
    }
}
