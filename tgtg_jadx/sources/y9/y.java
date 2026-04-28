package y9;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.lifecycle.k0 {
    public final v l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f45770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f45771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f45772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f45773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f45774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f45775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CoroutineContext f45776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qb.u f45777t;

    public y(v vVar, h hVar, String[] strArr, qb.u uVar) {
        CoroutineContext coroutineContext;
        hVar.getClass();
        this.l = vVar;
        this.f45770m = hVar;
        this.f45771n = true;
        this.f45772o = new a0(strArr, this);
        this.f45773p = new AtomicBoolean(true);
        this.f45774q = new AtomicBoolean(false);
        this.f45775r = new AtomicBoolean(false);
        if (vVar.l()) {
            coroutineContext = vVar.f45757b;
            if (coroutineContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("transactionContext");
                coroutineContext = null;
            }
        } else {
            coroutineContext = kotlin.coroutines.g.f26549a;
        }
        this.f45776s = coroutineContext;
        this.f45777t = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: all -> 0x003b, Exception -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0031, B:44:0x00c3), top: B:61:0x0031, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0031, B:42:0x00bd, B:44:0x00c3, B:51:0x00df, B:48:0x00d5, B:49:0x00dc), top: B:61:0x0031, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bb -> B:42:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ea -> B:56:0x00eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(y9.y r18, z70.c r19) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.y.l(y9.y, z70.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.k0
    public final void g() {
        h hVar = this.f45770m;
        hVar.getClass();
        ((Set) hVar.f45667b).add(this);
        a90.d dVar = this.l.f45756a;
        x70.c cVar = null;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            dVar = null;
        }
        v80.f0.B(dVar, this.f45776s, null, new z(this, cVar, 1), 2);
    }

    @Override // androidx.lifecycle.k0
    public final void h() {
        h hVar = this.f45770m;
        hVar.getClass();
        ((Set) hVar.f45667b).remove(this);
    }
}
