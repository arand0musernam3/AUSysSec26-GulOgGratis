package y80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f45483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f45484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f45485c;

    public h(i iVar, Function1 function1, Function2 function2) {
        this.f45483a = iVar;
        this.f45484b = function1;
        this.f45485c = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, a90.v] */
    @Override // y80.i
    public final Object collect(j jVar, x70.c cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = z80.b.f47357b;
        Object objCollect = this.f45483a.collect(new g(this, objectRef, jVar), cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }
}
