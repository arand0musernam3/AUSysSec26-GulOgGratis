package hs;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f22471k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, x70.c cVar) {
        super(2, cVar);
        this.f22471k = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.f22471k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r8.collect(r1, r7) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (kotlin.Unit.f26487a == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (kotlin.Unit.f26487a == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:8:0x0021, B:26:0x006f), top: B:41:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
