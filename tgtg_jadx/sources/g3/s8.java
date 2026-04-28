package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19479a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f19480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u3.d f19483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u3.d f19484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u3.d f19485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19486h;

    public /* synthetic */ s8(int i11, b4.t tVar, long j9, long j11, u3.d dVar, u3.d dVar2, u3.d dVar3, int i12) {
        this.f19486h = i11;
        this.f19480b = tVar;
        this.f19481c = j9;
        this.f19482d = j11;
        this.f19483e = dVar;
        this.f19484f = dVar2;
        this.f19485g = dVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f19479a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                b9.e(this.f19486h, this.f19480b, this.f19481c, this.f19482d, this.f19483e, this.f19484f, this.f19485g, nVar, m3.i.F(1794433));
                break;
            default:
                b9.g(this.f19480b, this.f19481c, this.f19482d, this.f19483e, this.f19484f, this.f19485g, nVar, m3.i.F(this.f19486h | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ s8(b4.t tVar, long j9, long j11, u3.d dVar, u3.d dVar2, u3.d dVar3, int i11) {
        this.f19480b = tVar;
        this.f19481c = j9;
        this.f19482d = j11;
        this.f19483e = dVar;
        this.f19484f = dVar2;
        this.f19485g = dVar3;
        this.f19486h = i11;
    }
}
