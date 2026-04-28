package f2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h2.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f17124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f17125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3.d f17126c;

    public i(Function1 function1, Function1 function12, u3.d dVar) {
        this.f17124a = function1;
        this.f17125b = function12;
        this.f17126c = dVar;
    }

    @Override // h2.x
    public final Function1 getKey() {
        return this.f17124a;
    }

    @Override // h2.x
    public final Function1 getType() {
        return this.f17125b;
    }
}
