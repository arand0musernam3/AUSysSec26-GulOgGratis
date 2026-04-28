package z2;

import a3.j1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import w4.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od.f f46862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f46863b;

    public j(od.f fVar, k kVar) {
        this.f46862a = fVar;
        this.f46863b = kVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(y yVar, x70.c cVar) {
        Object objC = j1.c(yVar, this.f46862a, this.f46863b, cVar);
        return objC == y70.a.COROUTINE_SUSPENDED ? objC : Unit.f26487a;
    }
}
