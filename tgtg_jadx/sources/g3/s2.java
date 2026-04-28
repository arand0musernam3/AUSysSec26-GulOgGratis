package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f19466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f19467c;

    public /* synthetic */ s2(la laVar, Function2 function2, int i11) {
        this.f19465a = i11;
        this.f19466b = laVar;
        this.f19467c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f19465a;
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e5.a(u3.e.e(-241536773, sVar, new s2(this.f19466b, this.f19467c, 1)), sVar, 6);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r9.a(this.f19466b.f19052j, this.f19467c, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
