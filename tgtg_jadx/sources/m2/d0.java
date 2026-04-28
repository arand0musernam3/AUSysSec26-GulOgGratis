package m2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2.w f28800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.d f28802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28803e;

    public /* synthetic */ d0(x2.w wVar, boolean z11, u3.d dVar, int i11, int i12) {
        this.f28799a = i12;
        this.f28800b = wVar;
        this.f28801c = z11;
        this.f28802d = dVar;
        this.f28803e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f28799a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                g0.f(this.f28800b, this.f28801c, this.f28802d, nVar, m3.i.F(this.f28803e | 1));
                break;
            default:
                g0.i(this.f28800b, this.f28801c, this.f28802d, nVar, m3.i.F(this.f28803e | 1));
                break;
        }
        return Unit.f26487a;
    }
}
