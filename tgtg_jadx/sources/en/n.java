package en;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y9.e0;
import y9.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f16159k;
    public Serializable l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f16160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f16165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f16166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16167t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(y9.n[] nVarArr, p0 p0Var, e0 e0Var, x70.c cVar) {
        super(2, cVar);
        this.f16158j = 3;
        this.l = nVarArr;
        this.f16167t = p0Var;
        this.f16160m = e0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f16158j) {
            case 0:
                return new n((o) this.f16166s, cVar);
            case 1:
                return new n((ki.i) this.f16167t, cVar, 1);
            case 2:
                return new n((uh.g) this.f16167t, cVar, 2);
            default:
                return new n((y9.n[]) this.l, (p0) this.f16167t, (e0) this.f16160m, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16158j) {
            case 0:
                return ((n) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((n) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((n) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((n) create((aa.o) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (y9.p0.c(r6, r5, r4, r24) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0075, code lost:
    
        r4 = r7;
        r7 = r3;
        r3 = r4;
        r4 = r13;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0332 A[Catch: all -> 0x023f, TryCatch #8 {all -> 0x023f, blocks: (B:102:0x0238, B:137:0x032a, B:139:0x0332, B:140:0x0352, B:142:0x0358, B:144:0x035c, B:148:0x0371, B:149:0x037c, B:150:0x0386, B:133:0x0302, B:151:0x0387, B:152:0x038a, B:113:0x0281, B:116:0x028d), top: B:257:0x022b }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0358 A[Catch: all -> 0x023f, TryCatch #8 {all -> 0x023f, blocks: (B:102:0x0238, B:137:0x032a, B:139:0x0332, B:140:0x0352, B:142:0x0358, B:144:0x035c, B:148:0x0371, B:149:0x037c, B:150:0x0386, B:133:0x0302, B:151:0x0387, B:152:0x038a, B:113:0x0281, B:116:0x028d), top: B:257:0x022b }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c0 A[Catch: all -> 0x03d5, TRY_LEAVE, TryCatch #2 {all -> 0x03d5, blocks: (B:172:0x03ce, B:213:0x04b8, B:215:0x04c0, B:206:0x0490, B:209:0x049d, B:183:0x0419, B:186:0x0425, B:188:0x042b, B:191:0x0443), top: B:250:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e4 A[Catch: all -> 0x04db, TryCatch #6 {all -> 0x04db, blocks: (B:217:0x04d5, B:221:0x04de, B:223:0x04e4, B:225:0x04e8, B:229:0x04fa, B:230:0x0502, B:231:0x0509, B:234:0x050d, B:235:0x0510, B:190:0x0441, B:178:0x03f6, B:205:0x048a, B:195:0x0452, B:199:0x0462), top: B:250:0x03bf, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:35:0x00b0, B:69:0x019a, B:71:0x01a2, B:72:0x01cd, B:74:0x01d3, B:76:0x01d7, B:80:0x01e9, B:81:0x01f1, B:82:0x01f8, B:65:0x0172, B:83:0x01f9, B:84:0x01fc, B:46:0x00fd, B:49:0x0113, B:51:0x0119, B:41:0x00d7, B:64:0x016c, B:55:0x013d, B:59:0x014d), top: B:252:0x00a4, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:35:0x00b0, B:69:0x019a, B:71:0x01a2, B:72:0x01cd, B:74:0x01d3, B:76:0x01d7, B:80:0x01e9, B:81:0x01f1, B:82:0x01f8, B:65:0x0172, B:83:0x01f9, B:84:0x01fc, B:46:0x00fd, B:49:0x0113, B:51:0x0119, B:41:0x00d7, B:64:0x016c, B:55:0x013d, B:59:0x014d), top: B:252:0x00a4, inners: #7 }] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0095 -> B:26:0x0096). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(mk.a aVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f16158j = i11;
        this.f16167t = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, x70.c cVar) {
        super(2, cVar);
        this.f16158j = 0;
        this.f16166s = oVar;
    }
}
