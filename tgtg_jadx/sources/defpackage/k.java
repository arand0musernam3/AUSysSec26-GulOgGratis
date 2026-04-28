package defpackage;

import androidx.lifecycle.l1;
import ap.n;
import b0.r0;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.h1;
import mn.l;
import no.m0;
import t1.b;
import v80.b0;
import x70.c;
import z70.i;
import zp.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25499k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f25500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f25501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f25502o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i11, Function1 function1, b bVar, h1 h1Var, c cVar) {
        super(2, cVar);
        this.f25498j = 0;
        this.l = i11;
        this.f25500m = function1;
        this.f25501n = bVar;
        this.f25502o = h1Var;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        switch (this.f25498j) {
            case 0:
                return new k(this.l, (Function1) this.f25500m, (b) this.f25501n, (h1) this.f25502o, cVar);
            case 1:
                return new k((n) this.f25502o, cVar, 1);
            case 2:
                return new k((List) this.f25500m, cVar, (r0) this.f25501n, this.l);
            case 3:
                return new k((l) this.f25502o, cVar, 3);
            case 4:
                return new k((m0) this.f25502o, cVar, 4);
            case 5:
                return new k((tg.i) this.f25502o, cVar, 5);
            case 6:
                return new k((y80.i[]) this.f25500m, this.l, (AtomicInteger) this.f25501n, (x80.i) this.f25502o, cVar);
            default:
                return new k((g) this.f25502o, cVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        c cVar = (c) obj2;
        switch (this.f25498j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x03ed, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0495, code lost:
    
        if (y80.r.i(r4, r10, r75) == r9) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04c8, code lost:
    
        if (kotlin.Unit.f26487a != r9) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05ef, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        if (y80.r.h(r0, r75) != r8) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0549 A[Catch: all -> 0x054f, TryCatch #3 {all -> 0x054f, blocks: (B:230:0x0540, B:232:0x0549, B:235:0x0553, B:238:0x0558), top: B:292:0x0540 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x056b A[Catch: all -> 0x04e7, TRY_LEAVE, TryCatch #2 {all -> 0x04e7, blocks: (B:207:0x04e2, B:242:0x0565, B:244:0x056b), top: B:290:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022e  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l1 l1Var, c cVar, int i11) {
        super(2, cVar);
        this.f25498j = i11;
        this.f25502o = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, c cVar, r0 r0Var, int i11) {
        super(2, cVar);
        this.f25498j = 2;
        this.f25500m = list;
        this.f25501n = r0Var;
        this.l = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y80.i[] iVarArr, int i11, AtomicInteger atomicInteger, x80.i iVar, c cVar) {
        super(2, cVar);
        this.f25498j = 6;
        this.f25500m = iVarArr;
        this.l = i11;
        this.f25501n = atomicInteger;
        this.f25502o = iVar;
    }
}
