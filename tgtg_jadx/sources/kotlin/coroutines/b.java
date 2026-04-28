package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f26544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f26545b;

    public b(f fVar, Function1 function1) {
        fVar.getClass();
        this.f26544a = function1;
        this.f26545b = fVar instanceof b ? ((b) fVar).f26545b : fVar;
    }
}
