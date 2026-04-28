package on;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32718e;

    public /* synthetic */ i(int i11, int i12, int i13, Object obj, int i14, int i15) {
        this.f32714a = i15;
        this.f32715b = i11;
        this.f32716c = i12;
        this.f32717d = i13;
        this.f32718e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32714a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(3073);
                d.d(this.f32715b, this.f32716c, this.f32717d, (Function1) this.f32718e, (n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(1);
                xi.d.g(this.f32715b, this.f32716c, this.f32717d, (Object[]) this.f32718e, (n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }
}
