package ia0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f23639a = new e0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f23640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f23641c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f23640b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i11 = 0; i11 < iHighestOneBit; i11++) {
            atomicReferenceArr[i11] = new AtomicReference();
        }
        f23641c = atomicReferenceArr;
    }

    public static final void a(e0 e0Var) {
        e0Var.getClass();
        if (e0Var.f23630f != null || e0Var.f23631g != null) {
            i4.a.f("Failed requirement.");
            return;
        }
        if (e0Var.f23628d) {
            return;
        }
        AtomicReference atomicReference = f23641c[(int) (Thread.currentThread().getId() & (((long) f23640b) - 1))];
        e0 e0Var2 = f23639a;
        e0 e0Var3 = (e0) atomicReference.getAndSet(e0Var2);
        if (e0Var3 == e0Var2) {
            return;
        }
        int i11 = e0Var3 != null ? e0Var3.f23627c : 0;
        if (i11 >= 65536) {
            atomicReference.set(e0Var3);
            return;
        }
        e0Var.f23630f = e0Var3;
        e0Var.f23626b = 0;
        e0Var.f23627c = i11 + 8192;
        atomicReference.set(e0Var);
    }

    public static final e0 b() {
        AtomicReference atomicReference = f23641c[(int) (Thread.currentThread().getId() & (((long) f23640b) - 1))];
        e0 e0Var = f23639a;
        e0 e0Var2 = (e0) atomicReference.getAndSet(e0Var);
        if (e0Var2 == e0Var) {
            return new e0();
        }
        if (e0Var2 == null) {
            atomicReference.set(null);
            return new e0();
        }
        atomicReference.set(e0Var2.f23630f);
        e0Var2.f23630f = null;
        e0Var2.f23627c = 0;
        return e0Var2;
    }
}
