package pi;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f35390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35391k;
    public final /* synthetic */ m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f35390j = i11;
        this.l = mVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f35390j) {
            case 0:
                return new j(this.l, cVar, 0);
            case 1:
                return new j(this.l, cVar, 1);
            case 2:
                return new j(this.l, cVar, 2);
            case 3:
                return new j(this.l, cVar, 3);
            default:
                return new j(this.l, cVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f35390j) {
        }
        return ((j) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L62;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
