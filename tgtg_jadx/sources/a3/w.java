package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f604k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f607o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(long j9, Function2 function2, Function1 function1, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f603j = 5;
        this.f605m = j9;
        this.l = (z70.i) function2;
        this.f606n = function1;
        this.f607o = function0;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f603j) {
            case 0:
                w wVar = new w((b0) this.f606n, (CharSequence) this.f607o, this.f605m, cVar, 0);
                wVar.l = obj;
                return wVar;
            case 1:
                w wVar2 = new w(this.f605m, (m3.b1) this.f606n, (m3.b1) this.f607o, cVar);
                wVar2.l = obj;
                return wVar2;
            case 2:
                return new w(this.f605m, (ft.o) this.l, (String) this.f606n, (String) this.f607o, cVar);
            case 3:
                return new w((h2.b0) this.f606n, (t1.x) this.f607o, this.f605m, cVar, 3);
            case 4:
                return new w((m3.b1) this.f606n, this.f605m, (b2.l) this.f607o, cVar, 4);
            case 5:
                return new w(this.f605m, (Function2) this.l, (Function1) this.f606n, (Function0) this.f607o, cVar);
            case 6:
                return new w((s2.g) this.l, this.f605m, (t2.e) this.f606n, (s2.f) this.f607o, cVar);
            case 7:
                return new w((v1.g) this.f606n, this.f605m, (b2.l) this.f607o, cVar, 7);
            case 8:
                return new w((v80.i1) this.f606n, this.f605m, (b2.l) this.f607o, cVar, 8);
            case 9:
                return new w((u) this.l, (CharSequence) this.f607o, this.f605m, (x2.w) this.f606n, cVar);
            default:
                return new w((x2.w) this.f606n, this.f605m, (b2.l) this.f607o, cVar, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f603j) {
        }
        return ((w) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x024c, code lost:
    
        if (r9.b(r6, r21) == r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e2, code lost:
    
        if (t1.b.c(r0, r7, r5, r9, r21, 4) != r11) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
    
        if (r9.b(r1, r21) != r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0199, code lost:
    
        if (((t2.e) r8).a((s2.f) r9, r21) == r0) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j9, ft.o oVar, String str, String str2, x70.c cVar) {
        super(2, cVar);
        this.f603j = 2;
        this.f605m = j9;
        this.l = oVar;
        this.f606n = str;
        this.f607o = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j9, m3.b1 b1Var, m3.b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f603j = 1;
        this.f605m = j9;
        this.f606n = b1Var;
        this.f607o = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar, CharSequence charSequence, long j9, x2.w wVar, x70.c cVar) {
        super(2, cVar);
        this.f603j = 9;
        this.l = uVar;
        this.f607o = charSequence;
        this.f605m = j9;
        this.f606n = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, long j9, b2.l lVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f603j = i11;
        this.f606n = obj;
        this.f605m = j9;
        this.f607o = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, long j9, x70.c cVar, int i11) {
        super(2, cVar);
        this.f603j = i11;
        this.f606n = obj;
        this.f607o = obj2;
        this.f605m = j9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s2.g gVar, long j9, t2.e eVar, s2.f fVar, x70.c cVar) {
        super(2, cVar);
        this.f603j = 6;
        this.l = gVar;
        this.f605m = j9;
        this.f606n = eVar;
        this.f607o = fVar;
    }
}
