package i2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h2.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f22868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i80.o f22869b;

    public m(Function1 function1, i80.o oVar) {
        this.f22868a = function1;
        this.f22869b = oVar;
    }

    @Override // h2.x
    public final Function1 getKey() {
        return this.f22868a;
    }
}
