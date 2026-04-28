package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f38559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f38560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f38561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4.f f38562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f38564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u3.d f38565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f38566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f38567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, b4.t tVar, Function1 function1, b4.f fVar, String str, Function1 function12, u3.d dVar, int i11, int i12) {
        super(2);
        this.f38559a = obj;
        this.f38560b = tVar;
        this.f38561c = function1;
        this.f38562d = fVar;
        this.f38563e = str;
        this.f38564f = function12;
        this.f38565g = dVar;
        this.f38566h = i11;
        this.f38567i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        i.a(this.f38559a, this.f38560b, this.f38561c, this.f38562d, this.f38563e, this.f38564f, this.f38565g, (m3.n) obj, m3.i.F(this.f38566h | 1), this.f38567i);
        return Unit.f26487a;
    }
}
