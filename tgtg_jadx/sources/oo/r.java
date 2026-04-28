package oo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f32857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f32858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f32859d;

    public /* synthetic */ r(Function0 function0, Function0 function02, Function0 function03, int i11, int i12) {
        this.f32856a = i12;
        this.f32857b = function0;
        this.f32858c = function02;
        this.f32859d = function03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f32856a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.f(this.f32857b, this.f32858c, this.f32859d, nVar, m3.i.F(433));
                break;
            case 1:
                a.g(this.f32857b, this.f32858c, this.f32859d, nVar, m3.i.F(433));
                break;
            case 2:
                po.c.c(this.f32857b, this.f32858c, this.f32859d, nVar, m3.i.F(1));
                break;
            default:
                android.support.v4.media.session.a.e(this.f32857b, this.f32858c, this.f32859d, nVar, m3.i.F(385));
                break;
        }
        return Unit.f26487a;
    }
}
