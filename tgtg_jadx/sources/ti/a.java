package ti;

import c5.m2;
import cn.x;
import com.app.tgtg.R;
import g3.g7;
import g3.r9;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m3.b1;
import m5.u0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g7 f40187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f40188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f40189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f40190e;

    public /* synthetic */ a(g7 g7Var, Ref.ObjectRef objectRef, b1 b1Var, b1 b1Var2, int i11) {
        this.f40186a = i11;
        this.f40187b = g7Var;
        this.f40188c = objectRef;
        this.f40189d = b1Var;
        this.f40190e = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40186a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g7 g7Var = this.f40187b;
                    s0.l(g7Var, null, u3.e.e(-594247583, sVar, new x(22, g7Var, this.f40188c, this.f40189d, this.f40190e)), sVar, 390);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r9.d(f0.U(sVar2, R.string.charity_calendar_screen_undo), b4.a.a(d2.c.D(b4.q.f5711a, 0.0f, 0.0f, lv.t.f28253g, 0.0f, 11), m2.f7291a, new f(this.f40187b, this.f40188c, this.f40189d, this.f40190e, 0)), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28276p, 0L, 0L, q5.r.f36046k, null, 0L, null, 0, 0L, null, null, 16777211), sVar2, 0, 0, 131068);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
