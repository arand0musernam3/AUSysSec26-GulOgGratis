package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 extends l1 {
    final h mDiffer;
    private final f mListener;

    public b1(w wVar) {
        a1 a1Var = new a1(this);
        this.mListener = a1Var;
        c cVar = new c(this);
        synchronized (d.f3680a) {
            try {
                if (d.f3681b == null) {
                    d.f3681b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h hVar = new h(cVar, new w2.z(7, d.f3681b, wVar));
        this.mDiffer = hVar;
        hVar.f3751d.add(a1Var);
    }

    @NonNull
    public List<Object> getCurrentList() {
        return this.mDiffer.f3753f;
    }

    public Object getItem(int i11) {
        return this.mDiffer.f3753f.get(i11);
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemCount() {
        return this.mDiffer.f3753f.size();
    }

    public void submitList(List<Object> list) {
        this.mDiffer.b(list, null);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.b(list, runnable);
    }

    public void onCurrentListChanged(@NonNull List<Object> list, @NonNull List<Object> list2) {
    }
}
