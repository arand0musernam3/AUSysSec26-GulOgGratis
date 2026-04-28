package d8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14704k;
    public /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f14705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f14706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f14707o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y yVar, int i11, x70.c cVar, int i12) {
        super(2, cVar);
        this.f14703j = i12;
        this.f14705m = yVar;
        this.f14706n = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14703j) {
            case 0:
                t tVar = new t(this.f14705m, this.f14706n, cVar, 0);
                tVar.l = ((Boolean) obj).booleanValue();
                return tVar;
            default:
                t tVar2 = new t(this.f14705m, this.f14706n, cVar, 1);
                tVar2.l = ((Boolean) obj).booleanValue();
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f14703j;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        x70.c cVar = (x70.c) obj2;
        switch (i11) {
        }
        return ((t) create(bool, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
