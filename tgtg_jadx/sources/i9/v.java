package i9;

import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.c3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import t1.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f23571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9.l f23572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y3.b f23573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f23574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c3 f23575e;

    public v(y0 y0Var, g9.l lVar, y3.c cVar, b1 b1Var, c3 c3Var) {
        this.f23571a = y0Var;
        this.f23572b = lVar;
        this.f23573c = cVar;
        this.f23574d = b1Var;
        this.f23575e = c3Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        s1.l lVar = (s1.l) obj;
        g9.l lVar2 = (g9.l) obj2;
        m3.n nVar = (m3.n) obj3;
        ((Number) obj4).intValue();
        boolean zAreEqual = Intrinsics.areEqual(this.f23571a.f39607d.getValue(), this.f23572b);
        if (!((Boolean) this.f23574d.getValue()).booleanValue() && !zAreEqual) {
            List list = (List) this.f23575e.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (Intrinsics.areEqual(lVar2, (g9.l) objPrevious)) {
                    break;
                }
            }
            lVar2 = (g9.l) objPrevious;
        }
        m3.s sVar = (m3.s) nVar;
        if (lVar2 == null) {
            sVar.a0(105930796);
        } else {
            sVar.a0(-1520603531);
            z20.b.f(lVar2, this.f23573c, u3.e.e(-1263531443, sVar, new l(lVar2, lVar)), sVar, MLKEMEngine.KyberPolyBytes);
        }
        sVar.q(false);
        return Unit.f26487a;
    }
}
