package fg;

import a3.u2;
import b4.t;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.tgtg.componentlibrary.theme.demo.DemoColorKt;
import d2.z1;
import g3.la;
import g3.na;
import i3.q0;
import i3.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.s;
import m5.u0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17715d;

    public /* synthetic */ k(t tVar, BasicItem basicItem, long j9, int i11) {
        this.f17712a = 0;
        this.f17714c = tVar;
        this.f17715d = basicItem;
        this.f17713b = j9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17712a) {
            case 0:
                ((Integer) obj2).getClass();
                bx.o.r((t) this.f17714c, (BasicItem) this.f17715d, this.f17713b, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                z1 z1Var = (z1) this.f17714c;
                i80.n nVar = (i80.n) this.f17715d;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar2;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r.d(this.f17713b, ((la) sVar.j(na.f19192a)).f19054m, u3.e.e(417635459, sVar, new u2(17, z1Var, nVar)), sVar, MLKEMEngine.KyberPolyBytes);
                } else {
                    sVar.U();
                }
                break;
            case 2:
                u0 u0Var = (u0) this.f17714c;
                Function2 function2 = (Function2) this.f17715d;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar3;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q0.b(this.f17713b, u0Var, function2, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            default:
                String str = (String) this.f17715d;
                ((Integer) obj2).getClass();
                DemoColorKt.a(m3.i.F(1), this.f17713b, (t) this.f17714c, str, (m3.n) obj);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ k(long j9, Object obj, u70.f fVar, int i11) {
        this.f17712a = i11;
        this.f17713b = j9;
        this.f17714c = obj;
        this.f17715d = fVar;
    }

    public /* synthetic */ k(String str, long j9, t tVar, int i11) {
        this.f17712a = 3;
        this.f17715d = str;
        this.f17713b = j9;
        this.f17714c = tVar;
    }
}
