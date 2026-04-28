package g2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h2.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f18164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f18165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f18166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.d f18167d;

    public f(g gVar, Function2 function2, Function1 function1, u3.d dVar) {
        this.f18164a = gVar;
        this.f18165b = function2;
        this.f18166c = function1;
        this.f18167d = dVar;
    }

    @Override // h2.x
    public final Function1 getKey() {
        return this.f18164a;
    }

    @Override // h2.x
    public final Function1 getType() {
        return this.f18166c;
    }
}
