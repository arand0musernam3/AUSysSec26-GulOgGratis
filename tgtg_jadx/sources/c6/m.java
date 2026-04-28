package c6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7725a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u70.f f7728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function0 function0, d6.a0 a0Var, u3.d dVar, int i11, int i12) {
        super(2);
        this.f7728d = function0;
        this.f7729e = a0Var;
        this.f7730f = dVar;
        this.f7726b = i11;
        this.f7727c = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7725a) {
            case 0:
                ((Number) obj2).intValue();
                r.b((Function1) this.f7728d, (b4.t) this.f7730f, (Function1) this.f7729e, (m3.n) obj, m3.i.F(this.f7726b | 1), this.f7727c);
                break;
            default:
                ((Number) obj2).intValue();
                ex.i.b((Function0) this.f7728d, (d6.a0) this.f7729e, (u3.d) this.f7730f, (m3.n) obj, m3.i.F(this.f7726b | 1), this.f7727c);
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function1 function1, b4.t tVar, Function1 function12, int i11, int i12) {
        super(2);
        this.f7728d = function1;
        this.f7730f = tVar;
        this.f7729e = function12;
        this.f7726b = i11;
        this.f7727c = i12;
    }
}
