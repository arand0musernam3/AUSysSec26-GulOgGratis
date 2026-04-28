package i3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f23118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f23119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23120e;

    public /* synthetic */ h0(long j9, u0 u0Var, Function2 function2, int i11, int i12) {
        this.f23116a = i12;
        this.f23117b = j9;
        this.f23118c = u0Var;
        this.f23119d = function2;
        this.f23120e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23116a) {
            case 0:
                ((Integer) obj2).intValue();
                r.d(this.f23117b, this.f23118c, this.f23119d, (m3.n) obj, m3.i.F(this.f23120e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                q0.b(this.f23117b, this.f23118c, this.f23119d, (m3.n) obj, m3.i.F(this.f23120e | 1));
                break;
        }
        return Unit.f26487a;
    }
}
