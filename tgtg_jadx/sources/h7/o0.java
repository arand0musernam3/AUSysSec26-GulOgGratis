package h7;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21601d;

    public o0() {
        if (ky.p.f26719b == null) {
            ky.p.f26719b = new ky.p(4);
        }
    }

    public int a(int i11) {
        if (i11 < this.f21600c) {
            return ((ByteBuffer) this.f21601d).getShort(this.f21599b + i11);
        }
        return 0;
    }

    public void b() {
        if (((v70.i) this.f21601d).f42050h == this.f21600c) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i11 = this.f21598a;
            v70.i iVar = (v70.i) this.f21601d;
            if (i11 >= iVar.f42048f || iVar.f42045c[i11] >= 0) {
                return;
            } else {
                this.f21598a = i11 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f21599b) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f21599b) {
            tag = d(view);
        } else {
            tag = view.getTag(this.f21598a);
            if (!((Class) this.f21601d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            b bVarH = ViewCompat.h(view);
            if (bVarH == null) {
                bVarH = new b();
            }
            ViewCompat.b0(view, bVarH);
            view.setTag(this.f21598a, obj);
            ViewCompat.L(this.f21600c, view);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f21598a < ((v70.i) this.f21601d).f42048f;
    }

    public void remove() {
        v70.i iVar = (v70.i) this.f21601d;
        b();
        if (this.f21599b == -1) {
            com.braze.h2.b("Call next() before removing element from the iterator.");
            return;
        }
        iVar.d();
        iVar.l(this.f21599b);
        this.f21599b = -1;
        this.f21600c = iVar.f42050h;
    }
}
