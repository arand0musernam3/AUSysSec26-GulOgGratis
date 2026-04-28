package tm;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f40287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40288k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f40289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f40290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ double f40291o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, e eVar, double d3, x70.c cVar) {
        super(2, cVar);
        this.f40289m = i11;
        this.f40290n = eVar;
        this.f40291o = d3;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b bVar = new b(this.f40289m, this.f40290n, this.f40291o, cVar);
        bVar.l = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        if (r0 != r4) goto L33;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
