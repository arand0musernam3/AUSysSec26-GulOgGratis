package x0;

import androidx.recyclerview.widget.k0;
import com.google.common.util.concurrent.ListenableFuture;
import e6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f43632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f43633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f43635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f43636e = ox.h.A(new t10.c(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e6.i f43637f;

    public j(ArrayList arrayList, boolean z11, w0.a aVar) {
        this.f43632a = arrayList;
        this.f43633b = new ArrayList(arrayList.size());
        this.f43634c = z11;
        this.f43635d = new AtomicInteger(arrayList.size());
        a(new a8.f(this, 21), w.b.F());
        if (this.f43632a.isEmpty()) {
            this.f43637f.b(new ArrayList(this.f43633b));
            return;
        }
        for (int i11 = 0; i11 < this.f43632a.size(); i11++) {
            this.f43633b.add(null);
        }
        ArrayList arrayList2 = this.f43632a;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i12);
            listenableFuture.a(new k0(this, i12, listenableFuture), aVar);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f43636e.f15782b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        ArrayList arrayList = this.f43632a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z11);
            }
        }
        return this.f43636e.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<ListenableFuture> arrayList = this.f43632a;
        if (arrayList != null && !isDone()) {
            loop0: for (ListenableFuture listenableFuture : arrayList) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e5) {
                        throw e5;
                    } catch (InterruptedException e11) {
                        throw e11;
                    } catch (Throwable unused) {
                        if (this.f43634c) {
                            return (List) this.f43636e.f15782b.get();
                        }
                    }
                }
            }
        }
        return (List) this.f43636e.f15782b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f43636e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f43636e.f15782b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return (List) this.f43636e.f15782b.get(j9, timeUnit);
    }
}
