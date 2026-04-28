package ho;

import com.tgtg.componentlibrary.theme.demo.DemoTypographyKt;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lv.v;
import m3.s;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22230a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f22232c;

    public /* synthetic */ k(String str, u0 u0Var) {
        this.f22231b = str;
        this.f22232c = u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22230a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5.k kVar = new x5.k(6);
                    u0 u0VarA = this.f22232c;
                    if (u0VarA == null) {
                        u0VarA = u0.a(v.f28274n, lv.s.C, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    }
                    r9.d(this.f22231b, null, 0L, 0L, null, 0L, null, kVar, 0L, 0, false, 0, 0, null, u0VarA, sVar, 0, 0, 130046);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                DemoTypographyKt.a(this.f22231b, this.f22232c, (m3.n) obj, m3.i.F(7));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ k(String str, u0 u0Var, int i11) {
        this.f22231b = str;
        this.f22232c = u0Var;
    }
}
