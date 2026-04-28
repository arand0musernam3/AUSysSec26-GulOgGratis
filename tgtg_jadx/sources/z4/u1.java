package z4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f47238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f47239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f47240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(y1 y1Var, b4.t tVar, Function2 function2, int i11) {
        super(2);
        this.f47238a = y1Var;
        this.f47239b = tVar;
        this.f47240c = function2;
        this.f47241d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iF = m3.i.F(this.f47241d | 1);
        c0.c(this.f47238a, this.f47239b, this.f47240c, (m3.n) obj, iF);
        return Unit.f26487a;
    }
}
