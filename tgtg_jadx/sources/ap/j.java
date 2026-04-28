package ap;

import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import g9.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o00.x0;
import w2.g0;
import xh.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f4542b;

    public /* synthetic */ j(f0 f0Var) {
        this.f4541a = 2;
        this.f4542b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4541a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                x0.h(this.f4542b, (m3.n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(1);
                ir.i.a(this.f4542b, (m3.n) obj, iF2);
                break;
            default:
                String str = (String) obj;
                CharityIdError charityIdError = (CharityIdError) obj2;
                str.getClass();
                charityIdError.getClass();
                this.f4542b.d(new i0(str, charityIdError), new g0(8));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j(f0 f0Var, int i11, int i12) {
        this.f4541a = i12;
        this.f4542b = f0Var;
    }
}
