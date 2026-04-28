package rk;

import f0.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ok.i0;
import ok.j0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1.a f38033b;

    public /* synthetic */ a(m1.a aVar, int i11) {
        this.f38032a = i11;
        this.f38033b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38032a) {
            case 0:
                ((m1) ((f2) this.f38033b.f28697a).f16653f).i(ok.s.f32623a);
                break;
            case 1:
                ((m1) ((f2) this.f38033b.f28697a).f16653f).i(ok.g.f32591a);
                break;
            case 2:
                f2 f2Var = (f2) this.f38033b.f28697a;
                ((m1) f2Var.f16653f).i(new ok.n(j0.f32603a));
                break;
            case 3:
                f2 f2Var2 = (f2) this.f38033b.f28697a;
                ((m1) f2Var2.f16653f).i(new ok.n(ok.b0.f32580a));
                break;
            case 4:
                ((m1) ((f2) this.f38033b.f28697a).f16653f).i(ok.r.f32621a);
                break;
            default:
                f2 f2Var3 = (f2) this.f38033b.f28697a;
                ((m1) f2Var3.f16653f).i(new ok.n(i0.f32600a));
                break;
        }
        return Unit.f26487a;
    }
}
