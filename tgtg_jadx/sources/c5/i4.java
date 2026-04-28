package c5;

import android.view.View;
import com.app.tgtg.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k4 f7258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f7259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(k4 k4Var, Function2 function2, int i11) {
        super(2);
        this.f7257a = i11;
        this.f7258b = k4Var;
        this.f7259c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f7257a;
        Function2 function2 = this.f7259c;
        k4 k4Var = this.f7258b;
        int i12 = 1;
        int i13 = 0;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v0.a(k4Var.f7276a, function2, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y yVar = k4Var.f7276a;
                    Object tag = yVar.getTag(R.id.inspection_slot_table_set);
                    x70.c cVar = null;
                    Set set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
                    if (set == null) {
                        Object parent = yVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
                    }
                    if (set != null) {
                        set.add(sVar2.x());
                        sVar2.f29432q = true;
                        sVar2.C = true;
                        sVar2.f29419c.d();
                        sVar2.H.d();
                        m3.q2 q2Var = sVar2.I;
                        m3.m2 m2Var = q2Var.f29382a;
                        q2Var.f29386e = m2Var.f29346j;
                        q2Var.f29387f = m2Var.f29347k;
                    }
                    boolean zH = sVar2.h(k4Var);
                    Object objM = sVar2.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zH || objM == fVar) {
                        objM = new h4(k4Var, cVar, i13);
                        sVar2.k0(objM);
                    }
                    m3.i.h(yVar, (Function2) objM, sVar2);
                    boolean zH2 = sVar2.h(k4Var);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new h4(k4Var, cVar, i12);
                        sVar2.k0(objM2);
                    }
                    m3.i.h(yVar, (Function2) objM2, sVar2);
                    m3.i.a(a4.j.f687a.a(set), u3.e.e(-280240369, sVar2, new i4(k4Var, function2, i13)), sVar2, 56);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
