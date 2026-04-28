package y9;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.g1;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f45721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f45722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f45723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final al.d f45725e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f45727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f45728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d8.z f45729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f45730j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function0 f45731k = new xw.a(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f45726f = new LinkedHashMap();

    public p0(v vVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z11, al.d dVar) {
        String lowerCase;
        this.f45721a = vVar;
        this.f45722b = linkedHashMap;
        this.f45723c = linkedHashMap2;
        this.f45724d = z11;
        this.f45725e = dVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr[i11];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f45726f.put(lowerCase2, Integer.valueOf(i11));
            String str2 = (String) this.f45722b.get(strArr[i11]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i11] = lowerCase2;
        }
        this.f45727g = strArr2;
        for (Map.Entry entry : this.f45722b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f45726f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f45726f;
                linkedHashMap3.put(lowerCase4, x0.c(lowerCase3, linkedHashMap3));
            }
        }
        this.f45728h = new o(this.f45727g.length);
        this.f45729i = new d8.z(this.f45727g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(y9.p0 r4, y9.r r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof y9.f0
            if (r0 == 0) goto L13
            r0 = r6
            y9.f0 r0 = (y9.f0) r0
            int r1 = r0.f45661m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45661m = r1
            goto L18
        L13:
            y9.f0 r0 = new y9.f0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f45660k
            y70.a r6 = y70.a.COROUTINE_SUSPENDED
            int r1 = r0.f45661m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.f45659j
            java.util.Set r5 = (java.util.Set) r5
            ba0.g.M(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.f45659j
            y9.r r5 = (y9.r) r5
            ba0.g.M(r4)
            goto L54
        L3d:
            ba0.g.M(r4)
            w2.g0 r4 = new w2.g0
            r1 = 14
            r4.<init>(r1)
            r0.f45659j = r5
            r0.f45661m = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r1, r4, r0)
            if (r4 != r6) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6c
            r0.f45659j = r4
            r0.f45661m = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = dx.f.r(r5, r1, r0)
            if (r5 != r6) goto L6c
        L6b:
            return r6
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.p0.a(y9.p0, y9.r, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(y9.p0 r11, z70.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.p0.b(y9.p0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (dx.f.r(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (dx.f.r(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(y9.p0 r17, y9.e0 r18, int r19, z70.c r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.p0.c(y9.p0, y9.e0, int, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(y9.p0 r8, y9.e0 r9, int r10, z70.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof y9.m0
            if (r0 == 0) goto L16
            r0 = r11
            y9.m0 r0 = (y9.m0) r0
            int r1 = r0.f45709q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f45709q = r1
            goto L1b
        L16:
            y9.m0 r0 = new y9.m0
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f45707o
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45709q
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r8 = r0.f45706n
            int r9 = r0.f45705m
            java.lang.String[] r10 = r0.l
            java.lang.String r2 = r0.f45704k
            y9.r r4 = r0.f45703j
            ba0.g.M(r11)
            r11 = r10
            r10 = r4
            goto L84
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L3d:
            ba0.g.M(r11)
            java.lang.String[] r8 = r8.f45727g
            r8 = r8[r10]
            java.lang.String[] r10 = y9.p0.l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4f:
            if (r9 >= r8) goto L86
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = e0.f.g(r6, r5, r4)
            r0.f45703j = r10
            r0.f45704k = r2
            r0.l = r11
            r0.f45705m = r9
            r0.f45706n = r8
            r0.f45709q = r3
            java.lang.Object r4 = dx.f.r(r10, r4, r0)
            if (r4 != r1) goto L84
            return r1
        L84:
            int r9 = r9 + r3
            goto L4f
        L86:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.p0.d(y9.p0, y9.e0, int, z70.c):java.lang.Object");
    }

    public final void e(Function0 function0, Function0 function02) {
        function0.getClass();
        function02.getClass();
        if (this.f45730j.compareAndSet(false, true)) {
            function0.invoke();
            a90.d dVar = this.f45721a.f45756a;
            x70.c cVar = null;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                dVar = null;
            }
            v80.f0.B(dVar, new v80.a0("Room Invalidation Tracker Refresh"), null, new tm.d(this, function02, cVar, 21), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(z70.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof y9.n0
            if (r0 == 0) goto L13
            r0 = r8
            y9.n0 r0 = (y9.n0) r0
            int r1 = r0.f45712m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45712m = r1
            goto L18
        L13:
            y9.n0 r0 = new y9.n0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f45711k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45712m
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            y9.h r0 = r0.f45710j
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r8 = move-exception
            goto L5a
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L32:
            ba0.g.M(r8)
            y9.v r8 = r7.f45721a
            y9.h r2 = r8.f45762g
            boolean r4 = r2.b()
            if (r4 == 0) goto L5e
            tg.g r4 = new tg.g     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r6 = 13
            r4.<init>(r7, r5, r6)     // Catch: java.lang.Throwable -> L58
            r0.f45710j = r2     // Catch: java.lang.Throwable -> L58
            r0.f45712m = r3     // Catch: java.lang.Throwable -> L58
            r3 = 0
            java.lang.Object r8 = r8.r(r3, r4, r0)     // Catch: java.lang.Throwable -> L58
            if (r8 != r1) goto L53
            return r1
        L53:
            r0 = r2
        L54:
            r0.d()
            goto L5e
        L58:
            r8 = move-exception
            r0 = r2
        L5a:
            r0.d()
            throw r8
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.p0.f(z70.c):java.lang.Object");
    }

    public final Pair g(String[] strArr) {
        v70.p pVar = new v70.p();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.f45723c.get(lowerCase);
            if (set != null) {
                pVar.addAll(set);
            } else {
                pVar.add(str);
            }
        }
        String[] strArr2 = (String[]) g1.a(pVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = strArr2[i11];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f45726f.get(lowerCase2);
            if (num == null) {
                i4.a.f("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i11] = num.intValue();
        }
        return new Pair(strArr2, iArr);
    }
}
