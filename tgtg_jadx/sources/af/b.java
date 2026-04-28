package af;

import a3.l3;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.m1;
import ba0.g;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.order.request.OrderRatingRequest;
import com.braze.h2;
import et.z;
import fd.l;
import fd.t;
import i80.n;
import ii.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m2.a2;
import m2.e1;
import m2.n0;
import m3.b1;
import m3.b2;
import m3.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import r5.s;
import ss.w;
import ss.w0;
import t1.q1;
import t1.y0;
import ud.h;
import v1.u;
import v80.b0;
import v80.f0;
import v80.p0;
import w4.y;
import xl.m;
import y80.g1;
import y80.j;
import z1.k2;
import z70.i;
import zc.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1270k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f1271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f1272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1274p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(y yVar, n nVar, Function1 function1, k2 k2Var, x70.c cVar) {
        super(2, cVar);
        this.f1269j = 23;
        this.f1271m = yVar;
        this.f1272n = (i) nVar;
        this.f1273o = function1;
        this.f1274p = k2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: af.b.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f1270k;
        if (i11 == 0) {
            g.M(obj);
            g1 g1Var = ((m) this.l).f44466f;
            n0 n0Var = new n0(1, (Function0) this.f1271m, (Function0) this.f1272n, (b1) this.f1273o, (b1) this.f1274p);
            this.f1270k = 1;
            if (g1Var.f45482a.collect(n0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
        }
        qc.y.m();
        return null;
    }

    private final Object c(Object obj) {
        String str = (String) this.f1272n;
        ItemType itemType = (ItemType) this.f1274p;
        yo.d dVar = (yo.d) this.f1271m;
        qb.e eVar = dVar.f46331d;
        b0 b0Var = (b0) this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f1270k;
        if (i11 == 0) {
            g.M(obj);
            this.l = b0Var;
            this.f1270k = 1;
            obj = yo.d.a(dVar, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
        }
        x70.c cVar = null;
        if (((List) obj).isEmpty()) {
            aj.c cVar2 = (aj.c) this.f1273o;
            if (cVar2 != null) {
                List list = cVar2.f1494a;
                ArrayList arrayList = new ArrayList(e0.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BasketBriefItem) it.next()).getItemId());
                }
                a9.a aVarD = m1.d(dVar);
                eVar.getClass();
                c90.f fVar = p0.f42144a;
                f0.B(aVarD, c90.e.f7834b, null, new tg.g(dVar, arrayList, itemType, cVar, 20), 2);
            } else if (str != null) {
                List listC = c0.c(str);
                a9.a aVarD2 = m1.d(dVar);
                eVar.getClass();
                c90.f fVar2 = p0.f42144a;
                f0.B(aVarD2, c90.e.f7834b, null, new tg.g(dVar, listC, itemType, cVar, 20), 2);
            }
        } else {
            dVar.b(itemType, null);
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f1271m
            y80.j r0 = (y80.j) r0
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r8.f1270k
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L24
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L15
            ba0.g.M(r9)
            goto L58
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L1c:
            java.lang.Object r0 = r8.l
            y80.j r0 = (y80.j) r0
            ba0.g.M(r9)
            goto L4b
        L24:
            ba0.g.M(r9)
            java.lang.Object r9 = r8.f1272n
            yp.a r9 = (yp.a) r9
            wp.a r9 = r9.f46333a
            java.lang.Object r2 = r8.f1273o
            java.lang.String r2 = (java.lang.String) r2
            xp.c r6 = new xp.c
            java.lang.Object r7 = r8.f1274p
            com.app.tgtg.model.remote.item.LatLngInfo r7 = (com.app.tgtg.model.remote.item.LatLngInfo) r7
            r6.<init>()
            r6.f44485a = r7
            r8.f1271m = r5
            r8.l = r0
            r8.f1270k = r4
            wp.b r9 = r9.f43515a
            java.lang.Object r9 = r9.a(r2, r6, r8)
            if (r9 != r1) goto L4b
            goto L57
        L4b:
            r8.f1271m = r5
            r8.l = r5
            r8.f1270k = r3
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: af.b.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v45, types: [i80.n, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1269j) {
            case 0:
                return new b((View) this.l, (kf.b) this.f1271m, (Pair) this.f1272n, (d) this.f1273o, (List) this.f1274p, cVar, 0);
            case 1:
                return new b((b1) this.l, (b1) this.f1271m, (b1) this.f1272n, (b1) this.f1273o, (b1) this.f1274p, cVar, 1);
            case 2:
                return new b((String) this.l, (z) this.f1271m, (String) this.f1272n, (OrderRatingRequest) this.f1273o, (Boolean) this.f1274p, cVar, 2);
            case 3:
                return new b((td.i) this.l, (t) this.f1271m, (h) this.f1272n, (fd.g) this.f1273o, (l) this.f1274p, cVar, 3);
            case 4:
                b bVar = new b((i9.i) this.f1271m, (b1) this.f1272n, (m3.g1) this.f1273o, (b1) this.f1274p, cVar, 4);
                bVar.l = obj;
                return bVar;
            case 5:
                return new b((m0) this.l, (Function1) this.f1271m, (String) this.f1272n, (u) this.f1273o, (b0) this.f1274p, cVar, 5);
            case 6:
                return new b((e1) this.l, (b1) this.f1271m, (r5.z) this.f1272n, (l3) this.f1273o, (r5.m) this.f1274p, cVar, 6);
            case 7:
                return new b((j2.c) this.l, (r5.y) this.f1271m, (e1) this.f1272n, (a2) this.f1273o, (s) this.f1274p, cVar, 7);
            case 8:
                b bVar2 = new b((b2) this.f1272n, (m3.a2) this.f1273o, (x0) this.f1274p, cVar, 8);
                bVar2.f1271m = obj;
                return bVar2;
            case 9:
                return new b((mv.e0) this.f1271m, (String) this.f1272n, (View) this.l, this.f1273o, (mv.b0) this.f1274p, cVar, 9);
            case 10:
                return new b((mv.e0) this.f1271m, (String) this.f1272n, (View) this.l, this.f1273o, (mv.b0) this.f1274p, cVar, 10);
            case 11:
                return new b((View) this.l, (mv.e0) this.f1272n, (mv.f0) this.f1273o, (Function1) this.f1274p, cVar);
            case 12:
                return new b((k) this.l, (pc.h) this.f1271m, (ad.h) this.f1272n, (pc.b) this.f1273o, (Bitmap) this.f1274p, cVar, 12);
            case 13:
                b bVar3 = new b((w) this.f1272n, (j) this.f1273o, (ts.t) this.f1274p, cVar, 13);
                bVar3.f1271m = obj;
                return bVar3;
            case 14:
                b bVar4 = new b((w) this.f1274p, cVar);
                bVar4.f1273o = obj;
                return bVar4;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                b bVar5 = new b((w0) this.f1272n, (j) this.f1273o, (ts.h) this.f1274p, cVar, 15);
                bVar5.f1271m = obj;
                return bVar5;
            case 16:
                return new b((y0) this.f1272n, this.f1273o, (q1) this.f1274p, cVar, 16);
            case 17:
                return new b((to.f) this.l, (String) this.f1271m, (String) this.f1272n, (to.c) this.f1273o, (sg.c) this.f1274p, cVar, 17);
            case 18:
                return new b((vo.e) this.f1271m, (UserData) this.f1272n, (String) this.f1273o, (String) this.f1274p, cVar, 18);
            case 19:
                b bVar6 = new b((c5.x0) this.f1271m, (Function1) this.f1272n, (w2.b) this.f1273o, (w2.b0) this.f1274p, cVar, 19);
                bVar6.l = obj;
                return bVar6;
            case 20:
                return new b((m) this.l, (Function0) this.f1271m, (Function0) this.f1272n, (b1) this.f1273o, (b1) this.f1274p, cVar, 20);
            case 21:
                b bVar7 = new b((yo.d) this.f1271m, (String) this.f1272n, (aj.c) this.f1273o, (ItemType) this.f1274p, cVar, 21);
                bVar7.l = obj;
                return bVar7;
            case 22:
                b bVar8 = new b((yp.a) this.f1272n, (String) this.f1273o, (LatLngInfo) this.f1274p, cVar, 22);
                bVar8.f1271m = obj;
                return bVar8;
            default:
                b bVar9 = new b((y) this.f1271m, (n) this.f1272n, (Function1) this.f1273o, (k2) this.f1274p, cVar);
                bVar9.l = obj;
                return bVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1269j) {
            case 0:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((b) create((y80.i) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((b) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((b) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0251, code lost:
    
        if (r2.emit(r10, r20) != r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0312, code lost:
    
        if (r2.emit(r7, r20) == r3) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03df, code lost:
    
        if (r2.emit(r10, r20) != r3) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x080f, code lost:
    
        if (r3.b(v1.j1.Default, r20) != r4) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x096c, code lost:
    
        if (r0.e(r3, r2, r20) == r7) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0994, code lost:
    
        if (r3.k(r0, r4, r20) == r7) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0a0c, code lost:
    
        if (v80.f0.o(200, r20) != r0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
    
        if (r0.emit(r8, r20) == r2) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x05eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [g9.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference failed for: r2v162 */
    /* JADX WARN: Type inference failed for: r2v163 */
    /* JADX WARN: Type inference failed for: r2v66, types: [int] */
    /* JADX WARN: Type inference failed for: r2v67, types: [gn.q] */
    /* JADX WARN: Type inference failed for: r2v85, types: [gn.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v86, types: [gn.q] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, v80.i1] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r4v5, types: [g9.t0, i9.i] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: af.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1269j = i11;
        this.l = obj;
        this.f1271m = obj2;
        this.f1272n = obj3;
        this.f1273o = obj4;
        this.f1274p = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1269j = i11;
        this.f1271m = obj;
        this.f1272n = obj2;
        this.f1273o = obj3;
        this.f1274p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1269j = i11;
        this.f1272n = obj;
        this.f1273o = obj2;
        this.f1274p = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(mv.e0 e0Var, String str, View view, Object obj, mv.b0 b0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1269j = i11;
        this.f1271m = e0Var;
        this.f1272n = str;
        this.l = view;
        this.f1273o = obj;
        this.f1274p = b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, x70.c cVar) {
        super(2, cVar);
        this.f1269j = 14;
        this.f1274p = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, mv.e0 e0Var, mv.f0 f0Var, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f1269j = 11;
        this.l = view;
        this.f1272n = e0Var;
        this.f1273o = f0Var;
        this.f1274p = function1;
    }
}
