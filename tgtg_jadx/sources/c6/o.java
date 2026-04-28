package c6;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f7742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f7743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f7744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f7745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f7746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7748g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Function1 function1, b4.t tVar, Function1 function12, Function1 function13, Function1 function14, int i11, int i12) {
        super(2);
        this.f7742a = function1;
        this.f7743b = tVar;
        this.f7744c = function12;
        this.f7745d = function13;
        this.f7746e = function14;
        this.f7747f = i11;
        this.f7748g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        r.a(this.f7742a, this.f7743b, this.f7744c, this.f7745d, this.f7746e, (m3.n) obj, m3.i.F(this.f7747f | 1), this.f7748g);
        return Unit.f26487a;
    }
}
