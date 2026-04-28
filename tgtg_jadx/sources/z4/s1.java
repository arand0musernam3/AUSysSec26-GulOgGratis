package z4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4.t f47232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f47233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(b4.t tVar, Function2 function2, int i11, int i12) {
        super(2);
        this.f47232a = tVar;
        this.f47233b = function2;
        this.f47234c = i11;
        this.f47235d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iF = m3.i.F(this.f47234c | 1);
        int i11 = this.f47235d;
        c0.b(this.f47232a, this.f47233b, (m3.n) obj, iF, i11);
        return Unit.f26487a;
    }
}
