package rk;

import com.app.tgtg.R;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import g3.i2;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x60.h f38052b;

    public /* synthetic */ c(int i11, x60.h hVar) {
        this.f38051a = i11;
        this.f38052b = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f38051a;
        b4.q qVar = b4.q.f5711a;
        x60.h hVar = this.f38052b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i2.a(x0.z(R.drawable.chevron_down, sVar, 0), null, null, hVar.J, sVar, 56, 4);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s0.g(m2.d(qVar, 1.0f), ((x60.a) sVar2.j(PantryThemeKt.getLocalPantryBorder())).f43895b, hVar.f43922i0, sVar2, 6, 0);
                } else {
                    sVar2.U();
                }
                break;
            default:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    s0.g(m2.d(qVar, 1.0f), ((x60.a) sVar3.j(PantryThemeKt.getLocalPantryBorder())).f43895b, hVar.f43922i0, sVar3, 6, 0);
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
