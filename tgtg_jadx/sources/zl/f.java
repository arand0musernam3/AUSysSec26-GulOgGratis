package zl;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f47971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f47972k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f47974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f47975o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, x70.c cVar) {
        super(2, cVar);
        this.f47974n = gVar;
        this.f47975o = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        f fVar = new f(this.f47974n, this.f47975o, cVar);
        fVar.f47973m = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r0.emit(r2, r14) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        if (r4.emit(r8, r14) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        if (r4.emit(r7, r14) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
