package jb;

import a3.i3;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.Country;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.sa;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import h7.h1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b1;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m0.n0;
import p.f3;
import p.g3;
import p.w1;
import p.z2;
import retrofit2.HttpException;
import s0.g1;
import s0.k1;
import s0.m0;
import s0.p0;
import s1.a1;
import w.j0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h7.w, z2, ha.b, x0.c, qz.l, w1, oa0.g, OnCompleteListener, p.j, bg.o, k1, t1.z, t1.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f24851a;

    public b(int i11) {
        switch (i11) {
            case 7:
                this.f24851a = new ky.o(1);
                break;
            default:
                this.f24851a = jf.e.p(Looper.getMainLooper());
                break;
        }
    }

    public static c1.b u(r0.b bVar) throws ImageCaptureException {
        c1.b bVar2 = bVar.f37440a;
        n0 n0Var = (n0) bVar2.f6838a;
        Rect rect = bVar2.f6842e;
        try {
            byte[] bArrF = zz.f.F(n0Var, rect, bVar.f37441b, bVar2.f6843f);
            try {
                v0.d dVar = new v0.d(new o8.h(new ByteArrayInputStream(bArrF)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i11 = bVar2.f6843f;
                Matrix matrix = bVar2.f6844g;
                RectF rectF = v0.o.f41634a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new c1.b(bArrF, dVar, 256, size, rect2, i11, matrix2, bVar2.f6845h);
            } catch (IOException e5) {
                throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e5);
            }
        } catch (ImageUtil$CodecFailedException e11) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e11);
        }
    }

    public Object a(Object obj) throws Exception {
        c1.b bVarU;
        r0.b bVar = (r0.b) obj;
        c1.b bVar2 = bVar.f37440a;
        try {
            int i11 = bVar2.f6840c;
            Object obj2 = bVar2.f6838a;
            if (i11 == 35) {
                bVarU = u(bVar);
            } else {
                if (i11 != 256 && i11 != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i11);
                }
                bVarU = t(bVar, i11);
            }
            ((n0) obj2).close();
            return bVarU;
        } catch (Throwable th2) {
            ((n0) bVar2.f6838a).close();
            throw th2;
        }
    }

    public n20.d b(n20.d dVar) {
        return dVar instanceof n20.l ? dVar : new n20.b(-((n20.j) this.f24851a).l(), dVar);
    }

    @Override // p.w1
    public void c(o.l lVar, MenuItem menuItem) {
        ((o.f) this.f24851a).f31509f.removeCallbacksAndMessages(lVar);
    }

    @Override // t1.z
    public float d() {
        return 0.0f;
    }

    @Override // t1.z
    public float e(float f11, long j9) {
        long j11 = j9 / 1000000;
        a1 a1VarA = ((k3.a) this.f24851a).a(f11);
        long j12 = a1VarA.f38526c;
        return (((Math.signum(a1VarA.f38524a) * s1.b.a(j12 > 0 ? j11 / j12 : 1.0f).f38522b) * a1VarA.f38525b) / j12) * 1000.0f;
    }

    @Override // t1.z
    public float f(float f11, float f12, long j9) {
        long j11 = j9 / 1000000;
        a1 a1VarA = ((k3.a) this.f24851a).a(f12);
        long j12 = a1VarA.f38526c;
        return (Math.signum(a1VarA.f38524a) * a1VarA.f38525b * s1.b.a(j12 > 0 ? j11 / j12 : 1.0f).f38521a) + f11;
    }

    @Override // qz.l
    public void g(Object obj) {
        qz.k kVar;
        i3 i3Var = ((m00.g) this.f24851a).f28660h;
        synchronized (i3Var) {
            i3Var.f394a = false;
            kVar = ((qz.m) i3Var.f395b).f37368b;
        }
        if (kVar != null) {
            ((m00.a) i3Var.f396c).doUnregisterEventListener(kVar, 2441);
        }
    }

    @Override // t1.p
    public t1.y get(int i11) {
        return ((t1.a0[]) this.f24851a)[i11];
    }

    @Override // ha.b
    public ha.a h(String str) {
        str.getClass();
        ia.b bVar = (ia.b) this.f24851a;
        String databaseName = bVar.getDatabaseName();
        if (databaseName == null) {
            if (!Intrinsics.areEqual(str, ":memory:")) {
                i4.a.i(w.a0.p("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!Intrinsics.areEqual(databaseName, str) && !Intrinsics.areEqual(StringsKt.W('/', databaseName, databaseName), StringsKt.W('/', str, str))) {
            wy.o.j("This driver is configured to open a database named '", bVar.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new ka.a(bVar.N());
    }

    @Override // p.w1
    public void i(o.l lVar, o.n nVar) {
        o.f fVar = (o.f) this.f24851a;
        Handler handler = fVar.f31509f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f31511h;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (lVar == ((o.e) arrayList.get(i11)).f31503b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        int i12 = i11 + 1;
        handler.postAtTime(new h1(this, i12 < arrayList.size() ? (o.e) arrayList.get(i12) : null, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.measurement.te] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // s0.k1
    public void j(Object obj) {
        m0 m0Var;
        ?? r12;
        p0 p0Var;
        c40.i iVar;
        ?? arrayList;
        List list = (List) obj;
        if (!((m0) this.f24851a).l.get() || (r12 = (m0Var = (m0) this.f24851a).f38391f) == 0 || (p0Var = m0Var.f38392g) == null || (iVar = m0Var.f38394i) == null) {
            return;
        }
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((m0.p) it.next()).a());
            }
        } else {
            arrayList = kotlin.collections.n0.f26529a;
        }
        try {
            ?? r52 = ((m0) this.f24851a).f38396k;
            arrayList.getClass();
            Iterable<String> iterableR0 = ((AtomicBoolean) r12.f11902j).get() ? kotlin.collections.n0.f26529a : CollectionsKt.r0(r12.f(arrayList));
            iterableR0.getClass();
            ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(iterableR0, 10));
            for (String str : iterableR0) {
                str.getClass();
                arrayList2.add(w0.e.n(str, null, null));
            }
            Set setG = i1.g(CollectionsKt.v0(r52), CollectionsKt.v0(arrayList2));
            if (!setG.isEmpty() && iVar.d(p0Var.c(), setG)) {
                wd.a.I("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                return;
            }
        } catch (Exception e5) {
            wd.a.J("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e5);
        }
        try {
            r12.j(arrayList);
            Set setH = r12.h();
            setH.getClass();
            Set<String> set = setH;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.o(set, 10));
            for (String str2 : set) {
                str2.getClass();
                arrayList3.add(w0.e.n(str2, null, null));
            }
            if (Intrinsics.areEqual(arrayList3, ((m0) this.f24851a).f38396k)) {
                return;
            }
            m0 m0Var2 = (m0) this.f24851a;
            List listR0 = CollectionsKt.r0(m0Var2.f38396k);
            if (Intrinsics.areEqual(arrayList3, listR0)) {
                return;
            }
            synchronized (m0Var2.f38389d) {
                if (m0Var2.f38390e != null) {
                    wd.a.p("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                    ScheduledFuture scheduledFuture = m0Var2.f38390e;
                    scheduledFuture.getClass();
                    scheduledFuture.cancel(false);
                    m0Var2.f38390e = null;
                }
            }
            Set setV0 = CollectionsKt.v0(listR0);
            Set setV02 = CollectionsKt.v0(arrayList3);
            Set setG2 = i1.g(setV02, setV0);
            Set setG3 = i1.g(setV0, setV02);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(kotlin.collections.e0.o(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((m0.p) it2.next()).a());
            }
            try {
                Iterator it3 = setG3.iterator();
                while (it3.hasNext()) {
                    m0Var2.c(((m0.p) it3.next()).a());
                }
                p0 p0Var2 = m0Var2.f38392g;
                if (p0Var2 != null) {
                    wd.a.p("CameraPresencePrvdr", "Updating CameraRepository...");
                    p0Var2.a(arrayList5);
                    arrayList4.add(p0Var2);
                    wd.a.p("CameraPresencePrvdr", "CameraRepository updated successfully.");
                }
                if (!m0Var2.f38397m.isEmpty()) {
                    wd.a.p("CameraPresencePrvdr", "Updating " + m0Var2.f38397m.size() + " dependent listeners...");
                    for (g1 g1Var : m0Var2.f38397m) {
                        g1Var.a(arrayList5);
                        arrayList4.add(g1Var);
                    }
                }
                m0Var2.f38396k = arrayList3;
                Iterator it4 = setG2.iterator();
                while (it4.hasNext()) {
                    m0Var2.a(((m0.p) it4.next()).a());
                }
                m0Var2.b(setG2, setG3);
            } catch (Exception e11) {
                wd.a.s("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e11);
                ArrayList arrayList6 = new ArrayList(kotlin.collections.e0.o(listR0, 10));
                Iterator it5 = listR0.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((m0.p) it5.next()).a());
                }
                Iterator it6 = new b1(arrayList4).iterator();
                while (true) {
                    kotlin.collections.a1 a1Var = (kotlin.collections.a1) it6;
                    if (!a1Var.f26490a.hasPrevious()) {
                        break;
                    }
                    g1 g1Var2 = (g1) a1Var.f26490a.previous();
                    try {
                        g1Var2.a(arrayList6);
                    } catch (Exception e12) {
                        wd.a.s("CameraPresencePrvdr", "Failed to rollback listener: " + g1Var2, e12);
                    }
                }
                Iterator it7 = setG3.iterator();
                while (it7.hasNext()) {
                    m0Var2.a(((m0.p) it7.next()).a());
                }
                Iterator it8 = setG2.iterator();
                while (it8.hasNext()) {
                    m0Var2.c(((m0.p) it8.next()).a());
                }
            }
        } catch (Exception e13) {
            wd.a.J("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e13);
        }
    }

    @Override // t1.z
    public long k(float f11) {
        return ((long) (Math.exp(((k3.a) this.f24851a).b(f11) / (((double) s1.b1.f38529a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // t1.z
    public float l(float f11, float f12) {
        k3.a aVar = (k3.a) this.f24851a;
        double dB = aVar.b(f12);
        double d3 = s1.b1.f38529a;
        return (Math.signum(f12) * ((float) (Math.exp((d3 / (d3 - 1.0d)) * dB) * ((double) (aVar.f25779a * aVar.f25780b))))) + f11;
    }

    @Override // oa0.g
    public void m(oa0.d dVar, oa0.n0 n0Var) {
        boolean z11 = n0Var.f32351a.f36597q;
        oa0.h hVar = (oa0.h) this.f24851a;
        if (z11) {
            hVar.complete(n0Var.f32352b);
        } else {
            hVar.completeExceptionally(new HttpException(n0Var));
        }
    }

    @Override // bg.o
    public void n(Country country) {
        ((pl.f) this.f24851a).s(country);
    }

    @Override // ha.b
    public boolean o() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iL = windowInsetsCompat.l();
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) this.f24851a;
        Context context = aVar.f1787k;
        int iL2 = windowInsetsCompat.l();
        ActionBarContextView actionBarContextView = aVar.f1800v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i11 = 0;
            i12 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.f1800v.getLayoutParams();
            if (aVar.f1800v.isShown()) {
                if (aVar.f1784i1 == null) {
                    aVar.f1784i1 = new Rect();
                    aVar.f1786j1 = new Rect();
                }
                Rect rect = aVar.f1784i1;
                Rect rect2 = aVar.f1786j1;
                rect.set(windowInsetsCompat.j(), windowInsetsCompat.l(), windowInsetsCompat.k(), windowInsetsCompat.i());
                ViewGroup viewGroup = aVar.A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z11 = g3.f33904a;
                    f3.a(viewGroup, rect, rect2);
                    i13 = 0;
                } else {
                    if (g3.f33904a) {
                        i13 = 0;
                    } else {
                        g3.f33904a = true;
                        i13 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            g3.f33905b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                g3.f33905b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = g3.f33905b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e5) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e5);
                        }
                    }
                }
                int i15 = rect.top;
                int i16 = rect.left;
                int i17 = rect.right;
                WindowInsetsCompat windowInsetsCompatY = ViewCompat.y(aVar.A);
                int iJ = windowInsetsCompatY == null ? i13 : windowInsetsCompatY.j();
                int iK = windowInsetsCompatY == null ? i13 : windowInsetsCompatY.k();
                if (marginLayoutParams.topMargin == i15 && marginLayoutParams.leftMargin == i16 && marginLayoutParams.rightMargin == i17) {
                    i14 = i13;
                } else {
                    marginLayoutParams.topMargin = i15;
                    marginLayoutParams.leftMargin = i16;
                    marginLayoutParams.rightMargin = i17;
                    i14 = 1;
                }
                if (i15 <= 0 || aVar.C != null) {
                    View view2 = aVar.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i18 = marginLayoutParams2.height;
                        int i19 = marginLayoutParams.topMargin;
                        if (i18 != i19 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i19;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            aVar.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    aVar.C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    aVar.A.addView(aVar.C, -1, layoutParams);
                }
                View view4 = aVar.C;
                i = view4 == null ? i13 : 1;
                if (i != 0 && view4.getVisibility() != 0) {
                    View view5 = aVar.C;
                    view5.setBackgroundColor((ViewCompat.C(view5) & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!aVar.H && i != 0) {
                    iL2 = i13;
                }
                i12 = i;
                i11 = i13;
                i = i14;
            } else {
                i11 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i12 = 0;
                } else {
                    i12 = 0;
                    i = 0;
                }
            }
            if (i != 0) {
                aVar.f1800v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = aVar.C;
        if (view6 != null) {
            view6.setVisibility(i12 != 0 ? i11 : 8);
        }
        return ViewCompat.O(view, iL != iL2 ? windowInsetsCompat.t(windowInsetsCompat.j(), iL2, windowInsetsCompat.k(), windowInsetsCompat.i()) : windowInsetsCompat);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((CountDownLatch) this.f24851a).countDown();
    }

    @Override // s0.k1
    public void onError(Throwable th2) {
        th2.getClass();
        m0 m0Var = (m0) this.f24851a;
        if (m0Var.l.get()) {
            wd.a.s("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th2);
            j0 j0Var = m0Var.f38393h;
            if (j0Var != null) {
                j0Var.b();
            }
        }
    }

    @Override // x0.c
    public void onSuccess(Object obj) {
        ((c1.h) this.f24851a).run();
    }

    @Override // oa0.g
    public void p(oa0.d dVar, Throwable th2) {
        ((oa0.h) this.f24851a).completeExceptionally(th2);
    }

    public void q() {
        ((m3.x) this.f24851a).getClass();
        Intrinsics.areEqual((Object) null, (Object) null);
    }

    public void r(String str, String str2, Throwable th2) {
        ((ky.o) this.f24851a).w(new lc.a(str, 6, str2, th2));
        Log.e(str, str2, th2);
    }

    public void s(String str, String str2) {
        ((ky.o) this.f24851a).w(new lc.a(str, 2, str2, null));
        Log.v(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r2 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r1 = java.util.Arrays.copyOfRange(r3, r2, r0.limit());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c1.b t(r0.b r12, int r13) {
        /*
            r11 = this;
            c1.b r12 = r12.f37440a
            java.lang.Object r0 = r11.f24851a
            se.b r0 = (se.b) r0
            java.lang.Object r1 = r12.f6838a
            m0.n0 r1 = (m0.n0) r1
            java.lang.Object r0 = r0.f39010b
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r0
            r2 = 0
            if (r0 != 0) goto L29
            jd.f[] r0 = r1.o()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.f()
            int r1 = r0.capacity()
            byte[] r1 = new byte[r1]
            r0.rewind()
            r0.get(r1)
        L27:
            r3 = r1
            goto L84
        L29:
            jd.f[] r0 = r1.o()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.f()
            int r1 = r0.capacity()
            byte[] r3 = new byte[r1]
            r0.rewind()
            r0.get(r3)
            r4 = 2
            r5 = r4
        L41:
            int r6 = r5 + 4
            r7 = -1
            if (r6 > r1) goto L68
            r6 = r3[r5]
            if (r6 == r7) goto L4b
            goto L68
        L4b:
            if (r6 != r7) goto L56
            int r6 = r5 + 1
            r6 = r3[r6]
            r7 = -38
            if (r6 != r7) goto L56
            goto L7b
        L56:
            int r6 = r5 + 2
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r7 = r5 + 3
            r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L41
        L68:
            int r2 = r4 + 1
            if (r2 <= r1) goto L6e
            r2 = r7
            goto L79
        L6e:
            r5 = r3[r4]
            if (r5 != r7) goto L9a
            r5 = r3[r2]
            r6 = -40
            if (r5 != r6) goto L9a
            r2 = r4
        L79:
            if (r2 == r7) goto L84
        L7b:
            int r0 = r0.limit()
            byte[] r1 = java.util.Arrays.copyOfRange(r3, r2, r0)
            goto L27
        L84:
            v0.d r4 = r12.f6839b
            java.util.Objects.requireNonNull(r4)
            android.util.Size r6 = r12.f6841d
            android.graphics.Rect r7 = r12.f6842e
            int r8 = r12.f6843f
            android.graphics.Matrix r9 = r12.f6844g
            s0.y r10 = r12.f6845h
            c1.b r2 = new c1.b
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L9a:
            r5 = r13
            r4 = r2
            r13 = r5
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.b.t(r0.b, int):c1.b");
    }

    public void v() {
        m0.j0 j0Var = (m0.j0) this.f24851a;
        synchronized (j0Var.f28537s) {
            try {
                Integer num = (Integer) j0Var.f28537s.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != j0Var.F()) {
                    j0Var.I();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object w() {
        if (k00.a.f25619b == null) {
            k00.a.f25619b = new sa();
        }
        synchronized (k00.a.f25618a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // x0.c
    public void onFailure(Throwable th2) {
    }

    public b(yz.a aVar) {
        i0.h(aVar);
        this.f24851a = aVar;
    }

    public b(z5.c cVar) {
        float f11 = s1.k1.f38640a;
        k3.a aVar = new k3.a();
        aVar.f25779a = f11;
        float fA = cVar.a();
        float f12 = s1.b1.f38529a;
        aVar.f25780b = fA * 386.0878f * 160.0f * 0.84f;
        this.f24851a = aVar;
    }

    public /* synthetic */ b(Object obj) {
        this.f24851a = obj;
    }
}
