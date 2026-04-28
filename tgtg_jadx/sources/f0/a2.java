package f0;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f16564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16565k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Ref.ObjectRef objectRef, String str, x70.c cVar) {
        super(2, cVar);
        this.f16565k = objectRef;
        this.l = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        a2 a2Var = new a2(this.f16565k, this.l, cVar);
        a2Var.f16564j = obj;
        return a2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((a3) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        a3 a3Var = (a3) this.f16564j;
        Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) e0.s.b(this.l)) + " returned");
        this.f16565k.element = null;
        return a3Var;
    }
}
