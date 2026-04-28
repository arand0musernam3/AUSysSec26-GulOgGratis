package qa;

import android.view.ViewGroup;
import com.app.tgtg.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36656a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f36657b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f36658c = new ArrayList();

    public static void a(ViewGroup viewGroup, y yVar) {
        ArrayList arrayList = f36658c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (yVar == null) {
            yVar = f36656a;
        }
        y yVarClone = yVar.clone();
        c(viewGroup, yVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        b0 b0Var = new b0();
        b0Var.f36641a = yVarClone;
        b0Var.f36642b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(b0Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(b0Var);
    }

    public static q1.e b() {
        q1.e eVar;
        ThreadLocal threadLocal = f36657b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (q1.e) weakReference.get()) != null) {
            return eVar;
        }
        q1.e eVar2 = new q1.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }

    public static void c(ViewGroup viewGroup, y yVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((y) it.next()).D(viewGroup);
            }
        }
        if (yVar != null) {
            yVar.j(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) == null) {
            return;
        }
        org.bouncycastle.jce.provider.a.c();
    }
}
