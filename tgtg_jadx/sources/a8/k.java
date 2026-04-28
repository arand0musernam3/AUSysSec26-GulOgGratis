package a8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.o0;
import com.braze.h2;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import pg.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends u00.d implements sa.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f979o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final qb.e f980p = new qb.e();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ReferenceQueue f981q = new ReferenceQueue();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f982r = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l[] f985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Choreographer f988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q2 f991k;
    public bl.d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f993n;

    public k(int i11, View view, Object obj) {
        if (obj != null) {
            i4.a.f("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            throw null;
        }
        this.f983c = new f(this, 0);
        this.f984d = false;
        this.f985e = new l[i11];
        this.f986f = view;
        if (Looper.myLooper() == null) {
            h2.b("DataBinding must be created in view's UI Thread");
            throw null;
        }
        if (f979o) {
            this.f988h = Choreographer.getInstance();
            this.f989i = new g(this);
        } else {
            this.f989i = null;
            this.f990j = new Handler(Looper.myLooper());
        }
    }

    public static k Z(LayoutInflater layoutInflater, int i11, ViewGroup viewGroup, boolean z11, Object obj) {
        if (obj != null) {
            i4.a.f("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            return null;
        }
        DataBinderMapperImpl dataBinderMapperImpl = c.f965a;
        boolean z12 = viewGroup != null && z11;
        int childCount = z12 ? viewGroup.getChildCount() : 0;
        View viewInflate = layoutInflater.inflate(i11, viewGroup, z11);
        if (!z12) {
            return dataBinderMapperImpl.b(i11, viewInflate);
        }
        int childCount2 = viewGroup.getChildCount();
        int i12 = childCount2 - childCount;
        if (i12 == 1) {
            return dataBinderMapperImpl.b(i11, viewGroup.getChildAt(childCount2 - 1));
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + childCount);
        }
        return dataBinderMapperImpl.c(i11, viewArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a0(android.view.View r21, java.lang.Object[] r22, a8.h r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.k.a0(android.view.View, java.lang.Object[], a8.h, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] b0(View view, int i11, h hVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i11];
        a0(view, objArr, hVar, sparseIntArray, true);
        return objArr;
    }

    public abstract void V();

    public final void W() {
        if (this.f987g) {
            e0();
        } else if (Y()) {
            this.f987g = true;
            V();
            this.f987g = false;
        }
    }

    public final void X() {
        q2 q2Var = this.f991k;
        if (q2Var == null) {
            W();
        } else {
            q2Var.X();
        }
    }

    public abstract boolean Y();

    public abstract boolean c0(int i11, Object obj);

    public final void d0(o0 o0Var, qb.e eVar) {
        l[] lVarArr = this.f985e;
        l lVar = lVarArr[0];
        if (lVar == null) {
            eVar.getClass();
            lVar = new i(this, f981q).f976a;
            lVarArr[0] = lVar;
            bl.d dVar = this.l;
            if (dVar != null) {
                lVar.f994a.b(dVar);
            }
        }
        lVar.a();
        lVar.f995b = o0Var;
        i iVar = lVar.f994a;
        WeakReference weakReference = iVar.f977b;
        LifecycleOwner lifecycleOwner = weakReference == null ? null : (LifecycleOwner) weakReference.get();
        if (lifecycleOwner != null) {
            o0Var.e(lifecycleOwner, iVar);
        }
    }

    public final void e0() {
        q2 q2Var = this.f991k;
        if (q2Var != null) {
            q2Var.e0();
            return;
        }
        bl.d dVar = this.l;
        if (dVar == null || dVar.getLifecycle().b().a(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f984d) {
                        return;
                    }
                    this.f984d = true;
                    if (f979o) {
                        this.f988h.postFrameCallback(this.f989i);
                    } else {
                        this.f990j.post(this.f983c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f986f;
    }
}
