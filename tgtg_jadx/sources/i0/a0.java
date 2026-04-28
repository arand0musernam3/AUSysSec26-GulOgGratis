package i0;

import e0.l0;
import e0.l1;
import e0.n1;
import g3.q9;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f22571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f22572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f22573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v80.q f22574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile l0 f22575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Long f22576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l1 f22577g;

    public a0(Function1 function1, Integer num, Long l) {
        function1.getClass();
        this.f22571a = function1;
        this.f22572b = num;
        this.f22573c = l;
        this.f22574d = new v80.q();
    }

    @Override // i0.q
    public final void a() {
        this.f22574d.R(new n1(3, null));
    }

    @Override // i0.q
    public final void b() {
        this.f22574d.R(new n1(3, null));
    }

    @Override // i0.q
    public final void c() {
        this.f22574d.R(new n1(3, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Map map) {
        this(new q9(map, 21), null, null);
        map.getClass();
    }
}
