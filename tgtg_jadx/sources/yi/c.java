package yi;

import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f45963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f45964c;

    public /* synthetic */ c(r rVar, String str, int i11) {
        this.f45962a = 0;
        this.f45963b = rVar;
        this.f45964c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f45962a) {
            case 0:
                num.getClass();
                this.f45963b.s(this.f45964c, nVar, m3.i.F(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantryThemeKt.PantryTheme(false, null, u3.e.e(-364093344, sVar, new c(this.f45963b, this.f45964c, 2, (byte) 0)), sVar, 390, 2);
                } else {
                    sVar.U();
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f45963b.s(this.f45964c, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(r rVar, String str, int i11, byte b8) {
        this.f45962a = i11;
        this.f45963b = rVar;
        this.f45964c = str;
    }
}
