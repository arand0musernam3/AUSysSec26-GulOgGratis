package f8;

import aa.l0;
import android.content.Context;
import c5.z0;
import ep.l;
import i80.n;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f17506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f17508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f17510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f17511f;

    public b(Context context, String str, Set set, Function2 function2, n nVar) {
        context.getClass();
        set.getClass();
        function2.getClass();
        l lVar = new l(5, context, str);
        this.f17506a = function2;
        this.f17507b = nVar;
        this.f17508c = context;
        this.f17509d = str;
        this.f17510e = u70.l.b(lVar);
        this.f17511f = set == c.f17512a ? null : CollectionsKt.u0(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f8.a
            if (r0 == 0) goto L13
            r0 = r6
            f8.a r0 = (f8.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            f8.a r0 = new f8.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17504j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            r0.l = r3
            kotlin.jvm.functions.Function2 r6 = r4.f17506a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L47
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L47:
            r5 = 0
            java.util.LinkedHashSet r6 = r4.f17511f
            u70.t r0 = r4.f17510e
            if (r6 != 0) goto L64
            java.lang.Object r6 = r0.getValue()
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.util.Map r6 = r6.getAll()
            r6.getClass()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L62
            goto L87
        L62:
            r3 = r5
            goto L87
        L64:
            java.lang.Object r0 = r0.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L71
            goto L62
        L71:
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L75
        L87:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.b.a(java.lang.Object, z70.c):java.lang.Object");
    }

    public b(Context context, String str, l0 l0Var, n nVar, int i11) {
        LinkedHashSet linkedHashSet = c.f17512a;
        Function2 z0Var = l0Var;
        if ((i11 & 8) != 0) {
            z0Var = new z0(2, null, 3);
        }
        this(context, str, linkedHashSet, z0Var, nVar);
    }
}
