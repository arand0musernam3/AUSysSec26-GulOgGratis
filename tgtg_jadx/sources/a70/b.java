package a70;

import c50.f1;
import cj.l;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import y80.j;
import z1.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends z70.i implements n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f947k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f949n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2 function2, Function1 function1, Function0 function0, x70.c cVar) {
        super(3, cVar);
        this.f946j = 3;
        this.l = (z70.i) function2;
        this.f948m = function1;
        this.f949n = function0;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f946j) {
            case 0:
                b bVar = new b((is.h) this.f949n, (x70.c) obj3, 0);
                bVar.l = (j) obj;
                bVar.f948m = (Throwable) obj2;
                return bVar.invokeSuspend(Unit.f26487a);
            case 1:
                b bVar2 = new b((f1) this.f949n, (x70.c) obj3, 1);
                bVar2.l = (j) obj;
                bVar2.f948m = (Throwable) obj2;
                return bVar2.invokeSuspend(Unit.f26487a);
            case 2:
                b bVar3 = new b((j1.c) this.f948m, (b1) this.f949n, (x70.c) obj3, 2);
                bVar3.l = (k1.c) obj2;
                return bVar3.invokeSuspend(Unit.f26487a);
            case 3:
                return new b((Function2) this.l, (Function1) this.f948m, (Function0) this.f949n, (x70.c) obj3).invokeSuspend(Unit.f26487a);
            case 4:
                b bVar4 = new b((Function2) this.f949n, (x70.c) obj3);
                bVar4.l = (j) obj;
                bVar4.f948m = obj2;
                return bVar4.invokeSuspend(Unit.f26487a);
            case 5:
                b bVar5 = new b((x70.c) obj3, (l) this.f949n);
                bVar5.l = (j) obj;
                bVar5.f948m = (Object[]) obj2;
                return bVar5.invokeSuspend(Unit.f26487a);
            case 6:
                b bVar6 = new b((n) this.f949n, (x70.c) obj3);
                bVar6.l = (j) obj;
                bVar6.f948m = (Object[]) obj2;
                return bVar6.invokeSuspend(Unit.f26487a);
            default:
                b bVar7 = new b((d1) this.f948m, (z1.n) this.f949n, (x70.c) obj3, 7);
                bVar7.l = (q) obj;
                return bVar7.invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r3.emit(r1, r13) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (r10.emit(r0, r13) == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
    
        if (r1.emit(r2, r13) == r0) goto L56;
     */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r2v17, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, x70.c cVar, int i11) {
        super(3, cVar);
        this.f946j = i11;
        this.f948m = obj;
        this.f949n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, x70.c cVar, int i11) {
        super(3, cVar);
        this.f946j = i11;
        this.f949n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(n nVar, x70.c cVar) {
        super(3, cVar);
        this.f946j = 6;
        this.f949n = (z70.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2 function2, x70.c cVar) {
        super(3, cVar);
        this.f946j = 4;
        this.f949n = (z70.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x70.c cVar, l lVar) {
        super(3, cVar);
        this.f946j = 5;
        this.f949n = lVar;
    }
}
