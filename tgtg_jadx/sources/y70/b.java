package y70;

import com.braze.h2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends z70.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f45420k;
    public final /* synthetic */ x70.c l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function2 function2, x70.c cVar, x70.c cVar2) {
        super(cVar);
        this.f45420k = function2;
        this.l = cVar2;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f45419j;
        if (i11 == 0) {
            this.f45419j = 1;
            ba0.g.M(obj);
            Function2 function2 = this.f45420k;
            function2.getClass();
            return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(this.l, this);
        }
        if (i11 != 1) {
            h2.b("This coroutine had already completed");
            return null;
        }
        this.f45419j = 2;
        ba0.g.M(obj);
        return obj;
    }
}
