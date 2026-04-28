package androidx.recyclerview.widget;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3801d;

    public k0(x0.j jVar, int i11, ListenableFuture listenableFuture) {
        this.f3798a = 3;
        this.f3801d = jVar;
        this.f3799b = i11;
        this.f3800c = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e6.i iVar;
        ArrayList arrayList;
        int iDecrementAndGet;
        switch (this.f3798a) {
            case 0:
                j0 j0Var = (j0) this.f3800c;
                r2 r2Var = j0Var.f3780e;
                p0 p0Var = (p0) this.f3801d;
                RecyclerView recyclerView = p0Var.f3866r;
                if (recyclerView == null || !recyclerView.f3608s || j0Var.f3786k || r2Var.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                s1 itemAnimator = p0Var.f3866r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList2 = p0Var.f3864p;
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (((j0) arrayList2.get(i11)).l) {
                        }
                    }
                    p0Var.f3861m.onSwiped(r2Var, this.f3799b);
                    return;
                }
                p0Var.f3866r.post(this);
                return;
            case 1:
                ((BottomSheetBehavior) this.f3801d).M((View) this.f3800c, this.f3799b, false);
                return;
            case 2:
                ((TextView) this.f3800c).setTypeface((Typeface) this.f3801d, this.f3799b);
                return;
            default:
                x0.j jVar = (x0.j) this.f3801d;
                int i12 = this.f3799b;
                ListenableFuture listenableFuture = (ListenableFuture) this.f3800c;
                boolean z11 = jVar.f43634c;
                AtomicInteger atomicInteger = jVar.f43635d;
                ArrayList arrayList3 = jVar.f43633b;
                if (jVar.isDone() || arrayList3 == null) {
                    pd.g.n("Future was done before all dependencies completed", z11);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                pd.g.n("Tried to set value from future which is not done", listenableFuture.isDone());
                                arrayList3.set(i12, x0.g.b(listenableFuture));
                                iDecrementAndGet = atomicInteger.decrementAndGet();
                                pd.g.n("Less than 0 remaining futures", iDecrementAndGet >= 0);
                            } catch (ExecutionException e5) {
                                if (z11) {
                                    jVar.f43637f.d(e5.getCause());
                                }
                                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                pd.g.n("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                                if (iDecrementAndGet2 == 0) {
                                    ArrayList arrayList4 = jVar.f43633b;
                                    if (arrayList4 != null) {
                                        iVar = jVar.f43637f;
                                        arrayList = new ArrayList(arrayList4);
                                    }
                                    pd.g.n(null, jVar.isDone());
                                    return;
                                }
                                return;
                            }
                        } catch (CancellationException unused) {
                            if (z11) {
                                jVar.cancel(false);
                            }
                            int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                            pd.g.n("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                            if (iDecrementAndGet3 == 0) {
                                ArrayList arrayList5 = jVar.f43633b;
                                if (arrayList5 != null) {
                                    iVar = jVar.f43637f;
                                    arrayList = new ArrayList(arrayList5);
                                }
                                pd.g.n(null, jVar.isDone());
                                return;
                            }
                            return;
                        }
                    } catch (Error e11) {
                        jVar.f43637f.d(e11);
                        int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                        pd.g.n("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                        if (iDecrementAndGet4 == 0) {
                            ArrayList arrayList6 = jVar.f43633b;
                            if (arrayList6 != null) {
                                iVar = jVar.f43637f;
                                arrayList = new ArrayList(arrayList6);
                            }
                            pd.g.n(null, jVar.isDone());
                            return;
                        }
                        return;
                    } catch (RuntimeException e12) {
                        if (z11) {
                            jVar.f43637f.d(e12);
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        pd.g.n("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                        if (iDecrementAndGet5 == 0) {
                            ArrayList arrayList7 = jVar.f43633b;
                            if (arrayList7 != null) {
                                iVar = jVar.f43637f;
                                arrayList = new ArrayList(arrayList7);
                            }
                            pd.g.n(null, jVar.isDone());
                            return;
                        }
                        return;
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList8 = jVar.f43633b;
                        if (arrayList8 != null) {
                            iVar = jVar.f43637f;
                            arrayList = new ArrayList(arrayList8);
                            iVar.b(arrayList);
                            return;
                        }
                        pd.g.n(null, jVar.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    pd.g.n("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList9 = jVar.f43633b;
                        if (arrayList9 != null) {
                            jVar.f43637f.b(new ArrayList(arrayList9));
                        } else {
                            pd.g.n(null, jVar.isDone());
                        }
                    }
                    throw th2;
                }
        }
    }

    public /* synthetic */ k0(Object obj, Object obj2, int i11, int i12) {
        this.f3798a = i12;
        this.f3801d = obj;
        this.f3800c = obj2;
        this.f3799b = i11;
    }

    public k0(TextView textView, Typeface typeface, int i11) {
        this.f3798a = 2;
        this.f3800c = textView;
        this.f3801d = typeface;
        this.f3799b = i11;
    }
}
