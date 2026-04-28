package m2;

import a3.l3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f28815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u3.d f28816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28817d;

    public /* synthetic */ e0(l3 l3Var, u3.d dVar, int i11, int i12) {
        this.f28814a = i12;
        this.f28815b = l3Var;
        this.f28816c = dVar;
        this.f28817d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f28814a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                g0.e(this.f28815b, this.f28816c, nVar, m3.i.F(this.f28817d | 1));
                break;
            default:
                g0.h(this.f28815b, this.f28816c, nVar, m3.i.F(this.f28817d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
