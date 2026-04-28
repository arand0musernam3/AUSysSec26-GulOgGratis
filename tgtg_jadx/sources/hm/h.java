package hm;

import androidx.lifecycle.m1;
import com.app.tgtg.feature.main.MainActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f22119b;

    public /* synthetic */ h(MainActivity mainActivity, int i11) {
        this.f22118a = i11;
        this.f22119b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        u70.u uVar;
        int i11 = this.f22118a;
        MainActivity mainActivity = this.f22119b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z11 = MainActivity.f9078v;
                int i12 = 0;
                int i13 = 2;
                int i14 = 1;
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVar = (e) w8.c.a(mainActivity.g0().f22166t, sVar).getValue();
                    if (!(eVar instanceof b)) {
                        boolean z12 = eVar instanceof c;
                        yn.d dVar = yn.d.f46279a;
                        if (z12) {
                            uVar = new u70.u(n0.f26529a, Integer.valueOf(((c) eVar).f22110a), dVar);
                        } else if (!(eVar instanceof d)) {
                            x70.c cVar = null;
                            if (!(eVar instanceof a)) {
                                e40.a.f();
                            } else {
                                f0.B(m1.c(mainActivity), null, null, new k(mainActivity, cVar, i12), 3);
                                uVar = new u70.u(n0.f26529a, 0, dVar);
                            }
                        } else {
                            d dVar2 = (d) eVar;
                            uVar = new u70.u(dVar2.f22112b, Integer.valueOf(dVar2.f22111a), dVar2.f22113c);
                        }
                    } else {
                        b bVar = (b) eVar;
                        uVar = new u70.u(bVar.f22108a, 0, bVar.f22109b);
                    }
                    List list = (List) uVar.f40859a;
                    int iIntValue2 = ((Number) uVar.f40860b).intValue();
                    yn.g gVar = (yn.g) uVar.f40861c;
                    v vVarG0 = mainActivity.g0();
                    boolean zH = sVar.h(vVarG0);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zH || objM == fVar) {
                        objM = new b40.d(0, vVarG0, v.class, "goToOrderList", "goToOrderList()V", 0, 11);
                        sVar.k0(objM);
                    }
                    KFunction kFunction = (KFunction) objM;
                    boolean zH2 = sVar.h(mainActivity);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new f(mainActivity, i14);
                        sVar.k0(objM2);
                    }
                    Function0 function0 = (Function0) objM2;
                    boolean zH3 = sVar.h(mainActivity);
                    Object objM3 = sVar.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new f(mainActivity, i13);
                        sVar.k0(objM3);
                    }
                    p30.b.a(iIntValue2, list, gVar, function0, (Function0) objM3, (Function0) kFunction, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                cv.i iVar = (cv.i) obj;
                boolean z13 = MainActivity.f9078v;
                iVar.getClass();
                mainActivity.g0().f22155h.c(iVar, (dv.b) obj2);
                break;
        }
        return Unit.f26487a;
    }
}
