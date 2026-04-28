package cp;

import b4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f13385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f13386e;

    public /* synthetic */ h(t tVar, boolean z11, String str, Function0 function0, int i11) {
        this.f13382a = 0;
        this.f13386e = tVar;
        this.f13384c = z11;
        this.f13383b = str;
        this.f13385d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13382a) {
            case 0:
                ((Integer) obj2).getClass();
                a.f(m3.i.F(1), this.f13386e, this.f13383b, this.f13385d, (m3.n) obj, this.f13384c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                z20.b.i(m3.i.F(1), this.f13386e, this.f13383b, this.f13385d, (m3.n) obj, this.f13384c);
                break;
            default:
                ((Integer) obj2).getClass();
                zz.f.i(m3.i.F(1), this.f13386e, this.f13383b, this.f13385d, (m3.n) obj, this.f13384c);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(String str, boolean z11, Function0 function0, t tVar, int i11, int i12) {
        this.f13382a = i12;
        this.f13383b = str;
        this.f13384c = z11;
        this.f13385d = function0;
        this.f13386e = tVar;
    }
}
