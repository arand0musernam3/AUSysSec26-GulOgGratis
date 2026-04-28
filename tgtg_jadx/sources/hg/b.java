package hg;

import ki.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22034a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.d f22037d;

    public /* synthetic */ b(int i11, boolean z11, u3.d dVar, int i12) {
        this.f22035b = i11;
        this.f22036c = z11;
        this.f22037d = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f22034a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.a.b(this.f22036c, this.f22037d, nVar, m3.i.F(this.f22035b | 1));
                break;
            default:
                j.m(this.f22035b, this.f22036c, this.f22037d, nVar, m3.i.F(391));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(boolean z11, u3.d dVar, int i11) {
        this.f22036c = z11;
        this.f22037d = dVar;
        this.f22035b = i11;
    }
}
