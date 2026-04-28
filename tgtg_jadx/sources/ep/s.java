package ep;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16324k;
    public final /* synthetic */ d0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f16325m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(d0 d0Var, List list, x70.c cVar, int i11) {
        super(2, cVar);
        this.f16323j = i11;
        this.l = d0Var;
        this.f16325m = list;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f16323j) {
            case 0:
                return new s(this.l, this.f16325m, cVar, 0);
            default:
                return new s(this.l, this.f16325m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f16323j) {
        }
        return ((s) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r14 == r0) goto L20;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
