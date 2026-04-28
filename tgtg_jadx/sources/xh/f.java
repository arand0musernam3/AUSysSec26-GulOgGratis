package xh;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9.f0 f44319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f44320c;

    public /* synthetic */ f(g9.f0 f0Var, b1 b1Var, int i11) {
        this.f44318a = i11;
        this.f44319b = f0Var;
        this.f44320c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f44318a;
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ii.l.b(null, this.f44319b, ii.f.INSTANCE, (Integer) this.f44320c.getValue(), null, null, null, null, sVar, MLKEMEngine.KyberPolyBytes, 241);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ii.l.b(null, this.f44319b, ii.g.INSTANCE, (Integer) this.f44320c.getValue(), null, null, null, null, sVar2, MLKEMEngine.KyberPolyBytes, 241);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
