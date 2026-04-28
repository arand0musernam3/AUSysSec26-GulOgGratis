package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19307a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f19308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19313g;

    public /* synthetic */ p5(b4.t tVar, String str, boolean z11, boolean z12, is.c cVar, int i11) {
        this.f19308b = tVar;
        this.f19312f = str;
        this.f19309c = z11;
        this.f19310d = z12;
        this.f19313g = cVar;
        this.f19311e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19307a) {
            case 0:
                ((Integer) obj2).getClass();
                q5.a(this.f19309c, (Function0) this.f19312f, this.f19308b, this.f19310d, (n5) this.f19313g, (m3.n) obj, m3.i.F(this.f19311e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zz.f.d(this.f19308b, (String) this.f19312f, this.f19309c, this.f19310d, (is.c) this.f19313g, (m3.n) obj, m3.i.F(this.f19311e | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p5(boolean z11, Function0 function0, b4.t tVar, boolean z12, n5 n5Var, int i11) {
        this.f19309c = z11;
        this.f19312f = function0;
        this.f19308b = tVar;
        this.f19310d = z12;
        this.f19313g = n5Var;
        this.f19311e = i11;
    }
}
