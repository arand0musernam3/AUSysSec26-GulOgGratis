package hm;

import androidx.lifecycle.n1;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22132k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f22133m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, x70.c cVar, int i11) {
        super(3, cVar);
        this.f22131j = i11;
        this.f22133m = obj;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f22131j) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                p pVar = new p((v) this.f22133m, (x70.c) obj3, 0);
                pVar.l = (List) obj;
                pVar.f22132k = iIntValue;
                return pVar.invokeSuspend(Unit.f26487a);
            case 1:
                p pVar2 = new p(3, (x70.c) obj3);
                pVar2.l = (y80.j) obj;
                pVar2.f22133m = (Object[]) obj2;
                return pVar2.invokeSuspend(Unit.f26487a);
            default:
                p pVar3 = new p((n1) this.f22133m, (x70.c) obj3, 2);
                pVar3.l = (Throwable) obj2;
                return pVar3.invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (kotlin.Unit.f26487a == r5) goto L19;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i11, x70.c cVar) {
        super(i11, cVar);
        this.f22131j = 1;
    }
}
