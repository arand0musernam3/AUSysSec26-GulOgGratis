package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4.f f14485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f14487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f14488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u3.d f14489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b4.f fVar, long j9, Function0 function0, j0 j0Var, u3.d dVar, int i11, int i12) {
        super(2);
        this.f14485a = fVar;
        this.f14486b = j9;
        this.f14487c = function0;
        this.f14488d = j0Var;
        this.f14489e = dVar;
        this.f14490f = i11;
        this.f14491g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        r.b(this.f14485a, this.f14486b, this.f14487c, this.f14488d, this.f14489e, (m3.n) obj, m3.i.F(this.f14490f | 1), this.f14491g);
        return Unit.f26487a;
    }
}
