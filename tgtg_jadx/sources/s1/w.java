package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2.z f38707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.t f38709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f38710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f38711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f38712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u3.d f38713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f38714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f38715i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d2.z zVar, boolean z11, b4.t tVar, x0 x0Var, y0 y0Var, String str, u3.d dVar, int i11, int i12) {
        super(2);
        this.f38707a = zVar;
        this.f38708b = z11;
        this.f38709c = tVar;
        this.f38710d = x0Var;
        this.f38711e = y0Var;
        this.f38712f = str;
        this.f38713g = dVar;
        this.f38714h = i11;
        this.f38715i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y.b(this.f38707a, this.f38708b, this.f38709c, this.f38710d, this.f38711e, this.f38712f, this.f38713g, (m3.n) obj, m3.i.F(this.f38714h | 1), this.f38715i);
        return Unit.f26487a;
    }
}
