package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f14513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f14514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f14515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.d f14516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i0 i0Var, Function0 function0, j0 j0Var, u3.d dVar, int i11, int i12) {
        super(2);
        this.f14513a = i0Var;
        this.f14514b = function0;
        this.f14515c = j0Var;
        this.f14516d = dVar;
        this.f14517e = i11;
        this.f14518f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        r.a(this.f14513a, this.f14514b, this.f14515c, this.f14516d, (m3.n) obj, m3.i.F(this.f14517e | 1), this.f14518f);
        return Unit.f26487a;
    }
}
