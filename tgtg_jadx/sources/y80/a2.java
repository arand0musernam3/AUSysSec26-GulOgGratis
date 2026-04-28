package y80;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends z80.a implements f1, i, z80.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45437f = AtomicReferenceFieldUpdater.newUpdater(a2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45438e;

    public a2(Object obj) {
        this._state$volatile = obj;
    }

    @Override // z80.q
    public final i a(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || aVar != x80.a.DROP_OLDEST) ? r.t(this, coroutineContext, i11, aVar) : this;
    }

    @Override // z80.a
    public final z80.c c() {
        return new b2();
    }

    /* JADX WARN: Path cross not found for [B:36:0x0089, B:38:0x008f], limit reached: 66 */
    /* JADX WARN: Path cross not found for [B:38:0x008f, B:36:0x0089], limit reached: 66 */
    /* JADX WARN: Path cross not found for [B:38:0x008f, B:46:0x00aa], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0073, B:30:0x007b, B:33:0x0082, B:34:0x0086, B:36:0x0089, B:46:0x00aa, B:49:0x00ba, B:50:0x00d4, B:56:0x00e8, B:59:0x00f1, B:53:0x00db, B:55:0x00e1, B:38:0x008f, B:42:0x0096, B:21:0x004b, B:24:0x0055, B:27:0x0064), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0073, B:30:0x007b, B:33:0x0082, B:34:0x0086, B:36:0x0089, B:46:0x00aa, B:49:0x00ba, B:50:0x00d4, B:56:0x00e8, B:59:0x00f1, B:53:0x00db, B:55:0x00e1, B:38:0x008f, B:42:0x0096, B:21:0x004b, B:24:0x0055, B:27:0x0064), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0073, B:30:0x007b, B:33:0x0082, B:34:0x0086, B:36:0x0089, B:46:0x00aa, B:49:0x00ba, B:50:0x00d4, B:56:0x00e8, B:59:0x00f1, B:53:0x00db, B:55:0x00e1, B:38:0x008f, B:42:0x0096, B:21:0x004b, B:24:0x0055, B:27:0x0064), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b9 -> B:28:0x0073). Please report as a decompilation issue!!! */
    @Override // y80.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(y80.j r14, x70.c r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.a2.collect(y80.j, x70.c):java.lang.Object");
    }

    @Override // z80.a
    public final z80.c[] d() {
        return new b2[2];
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        j(obj);
        return Unit.f26487a;
    }

    public final boolean g(Object obj, Object obj2) {
        a90.v vVar = z80.b.f47357b;
        if (obj == null) {
            obj = vVar;
        }
        if (obj2 == null) {
            obj2 = vVar;
        }
        return k(obj, obj2);
    }

    @Override // y80.y1
    public final Object getValue() {
        a90.v vVar = z80.b.f47357b;
        Object obj = f45437f.get(this);
        if (obj == vVar) {
            return null;
        }
        return obj;
    }

    @Override // y80.e1
    public final void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // y80.e1
    public final boolean i(Object obj) {
        j(obj);
        return true;
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = z80.b.f47357b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i11;
        z80.c[] cVarArr;
        a90.v vVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45437f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i12 = this.f45438e;
            if ((i12 & 1) != 0) {
                this.f45438e = i12 + 2;
                return true;
            }
            int i13 = i12 + 1;
            this.f45438e = i13;
            z80.c[] cVarArr2 = this.f47352a;
            while (true) {
                b2[] b2VarArr = (b2[]) cVarArr2;
                if (b2VarArr != null) {
                    for (b2 b2Var : b2VarArr) {
                        if (b2Var != null) {
                            AtomicReference atomicReference = b2Var.f45448a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (vVar = r.f45564e)) {
                                    a90.v vVar2 = r.f45563d;
                                    if (obj4 != vVar2) {
                                        while (!atomicReference.compareAndSet(obj4, vVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        u70.o oVar = u70.q.f40850b;
                                        ((v80.l) obj4).resumeWith(Unit.f26487a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, vVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i11 = this.f45438e;
                    if (i11 == i13) {
                        this.f45438e = i13 + 1;
                        return true;
                    }
                    cVarArr = this.f47352a;
                }
                cVarArr2 = cVarArr;
                i13 = i11;
            }
        }
    }
}
