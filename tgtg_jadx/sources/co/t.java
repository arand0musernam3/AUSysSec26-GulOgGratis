package co;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f8787b;

    public /* synthetic */ t(h1 h1Var, int i11) {
        this.f8786a = i11;
        this.f8787b = h1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8786a) {
            case 0:
                this.f8787b.i((int) (((z5.l) obj).f47286a >> 32));
                break;
            case 1:
                z5.l lVar = (z5.l) obj;
                int i11 = (int) (lVar.f47286a >> 32);
                h1 h1Var = this.f8787b;
                if (i11 > h1Var.h()) {
                    h1Var.i((int) (lVar.f47286a >> 32));
                }
                break;
            case 2:
                this.f8787b.i((int) (((z5.l) obj).f47286a >> 32));
                break;
            case 3:
                this.f8787b.i((int) (((z5.l) obj).f47286a >> 32));
                break;
            case 4:
                this.f8787b.i((int) (((z5.l) obj).f47286a >> 32));
                break;
            case 5:
                this.f8787b.i(((Integer) obj).intValue());
                break;
            case 6:
                this.f8787b.i(((Integer) obj).intValue());
                break;
            case 7:
                this.f8787b.i(((Integer) obj).intValue());
                break;
            case 8:
                z4.z zVar = (z4.z) obj;
                zVar.getClass();
                this.f8787b.i((int) (zVar.u() & 4294967295L));
                break;
            case 9:
                this.f8787b.i(((Integer) obj).intValue());
                break;
            default:
                this.f8787b.i((int) (((z5.l) obj).f47286a & 4294967295L));
                break;
        }
        return Unit.f26487a;
    }
}
