package hj;

import b4.t;
import ki.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f22080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f22081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22082d;

    public /* synthetic */ a(t tVar, Function0 function0, int i11, int i12) {
        this.f22079a = 4;
        this.f22080b = tVar;
        this.f22081c = function0;
        this.f22082d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f22079a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                e.b(i.F(this.f22082d | 1), this.f22080b, this.f22081c, nVar);
                break;
            case 1:
                j.l(i.F(this.f22082d | 1), this.f22080b, this.f22081c, nVar);
                break;
            case 2:
                wd.a.b(i.F(this.f22082d | 1), this.f22080b, this.f22081c, nVar);
                break;
            case 3:
                xz.b.a(i.F(this.f22082d | 1), this.f22080b, this.f22081c, nVar);
                break;
            default:
                us.a.s(this.f22080b, this.f22081c, nVar, i.F(1), this.f22082d);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(t tVar, Function0 function0, int i11, int i12, byte b8) {
        this.f22079a = i12;
        this.f22080b = tVar;
        this.f22081c = function0;
        this.f22082d = i11;
    }

    public /* synthetic */ a(Function0 function0, t tVar, int i11) {
        this.f22079a = 0;
        this.f22081c = function0;
        this.f22080b = tVar;
        this.f22082d = i11;
    }
}
