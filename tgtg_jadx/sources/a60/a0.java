package a60;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f832a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f833b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f835d;

    public a0(b0 b0Var) {
        this.f835d = b0Var;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.f834c) {
            this.f834c = true;
            ArrayDeque arrayDeque = this.f833b;
            if (arrayDeque.size() != 1 || ((z) arrayDeque.getFirst()).f943b != null) {
                StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    z zVar = (z) itDescendingIterator.next();
                    sb2.append("\nfor ");
                    Type type = zVar.f942a;
                    String str = zVar.f943b;
                    sb2.append(type);
                    if (str != null) {
                        sb2.append(' ');
                        sb2.append(str);
                    }
                }
                return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z11) {
        this.f833b.removeLast();
        if (this.f833b.isEmpty()) {
            this.f835d.f843b.remove();
            if (z11) {
                synchronized (this.f835d.f844c) {
                    try {
                        int size = this.f832a.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            z zVar = (z) this.f832a.get(i11);
                            k kVar = (k) this.f835d.f844c.put(zVar.f944c, zVar.f945d);
                            if (kVar != null) {
                                zVar.f945d = kVar;
                                this.f835d.f844c.put(zVar.f944c, kVar);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
