package co;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f8790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f8791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f8793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8794g;

    public /* synthetic */ u(int i11, q qVar, c cVar, boolean z11, Function0 function0, int i12, int i13) {
        this.f8788a = i13;
        this.f8789b = i11;
        this.f8790c = qVar;
        this.f8791d = cVar;
        this.f8792e = z11;
        this.f8793f = function0;
        this.f8794g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8788a) {
            case 0:
                ((Integer) obj2).intValue();
                v0.n.j(this.f8789b, this.f8790c, this.f8791d, this.f8792e, this.f8793f, (m3.n) obj, m3.i.F(this.f8794g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                w0.e.j(this.f8789b, this.f8790c, this.f8791d, this.f8792e, this.f8793f, (m3.n) obj, m3.i.F(this.f8794g | 1));
                break;
        }
        return Unit.f26487a;
    }
}
