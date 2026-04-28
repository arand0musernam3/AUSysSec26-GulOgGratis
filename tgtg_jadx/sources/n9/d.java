package n9;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f30740b;

    public /* synthetic */ d(e eVar, int i11) {
        this.f30739a = 0;
        this.f30740b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f30739a) {
            case 0:
                num.getClass();
                this.f30740b.a(nVar, i.F(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f30740b.a(sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 2:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f30740b.a(sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            default:
                int iIntValue3 = num.intValue();
                s sVar3 = (s) nVar;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.f30740b.a(sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(e eVar, int i11, byte b8) {
        this.f30739a = i11;
        this.f30740b = eVar;
    }
}
