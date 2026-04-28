package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u3.d f527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f528d;

    public /* synthetic */ q0(b4.t tVar, u3.d dVar, int i11, int i12) {
        this.f525a = 0;
        this.f526b = tVar;
        this.f527c = dVar;
        this.f528d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f525a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                ex.i.g(this.f526b, this.f527c, nVar, m3.i.F(49), this.f528d);
                break;
            case 1:
                r2.g.c(this.f526b, this.f527c, nVar, m3.i.F(this.f528d | 1));
                break;
            case 2:
                r2.g.d(this.f526b, this.f527c, nVar, m3.i.F(this.f528d | 1));
                break;
            case 3:
                r2.h.d(this.f526b, this.f527c, nVar, m3.i.F(this.f528d | 1));
                break;
            case 4:
                r2.g.b(this.f526b, this.f527c, nVar, m3.i.F(this.f528d | 1));
                break;
            default:
                r2.g.a(this.f526b, this.f527c, nVar, m3.i.F(this.f528d | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ q0(b4.t tVar, u3.d dVar, int i11, int i12, byte b8) {
        this.f525a = i12;
        this.f526b = tVar;
        this.f527c = dVar;
        this.f528d = i11;
    }
}
