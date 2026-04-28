package qk;

import g3.g7;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import ti.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g7 f37183b;

    public /* synthetic */ i(g7 g7Var, int i11) {
        this.f37182a = i11;
        this.f37183b = g7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f37182a;
        n nVar = (n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s0.l(this.f37183b, null, a.f37162a, sVar, MLKEMEngine.KyberPolyBytes);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s0.l(this.f37183b, null, t.f40273b, sVar2, 390);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                s sVar3 = (s) nVar;
                if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s0.l(this.f37183b, null, yi.t.f46024a, sVar3, 390);
                } else {
                    sVar3.U();
                }
                break;
            default:
                s sVar4 = (s) nVar;
                if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s0.l(this.f37183b, null, yj.a.f46046f, sVar4, 390);
                } else {
                    sVar4.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
