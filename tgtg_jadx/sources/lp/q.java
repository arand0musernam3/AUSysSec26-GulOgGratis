package lp;

import com.app.tgtg.R;
import d2.m2;
import g3.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o00.x0;
import s1.r0;
import t1.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28087b;

    public /* synthetic */ q(boolean z11, int i11) {
        this.f28086a = 2;
        this.f28087b = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f28086a;
        boolean z11 = this.f28087b;
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (i11) {
            case 0:
                int iIntValue = num.intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i2.a(x0.z(z11 ? R.drawable.recipe_generator_bookmark_saved : R.drawable.recipe_generator_bookmark, sVar, 0), null, m2.f13850c, lv.s.f28217b, sVar, 3512, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s1.y.d(this.f28087b, null, r0.d(new u1(1000, 800, null, 4), 2), r0.e(new u1(1500, 0, null, 4), 2), null, oo.a.f32732h, sVar2, 200064, 18);
                } else {
                    sVar2.U();
                }
                break;
            default:
                num.getClass();
                oo.a.w(z11, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ q(boolean z11, int i11, byte b8) {
        this.f28086a = i11;
        this.f28087b = z11;
    }
}
