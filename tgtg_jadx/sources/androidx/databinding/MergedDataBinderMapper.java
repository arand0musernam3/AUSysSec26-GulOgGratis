package androidx.databinding;

import a8.a;
import a8.k;
import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f2922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList f2923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList f2924c;

    @Override // a8.a
    public final k b(int i11, View view) {
        Iterator it = this.f2923b.iterator();
        while (it.hasNext()) {
            k kVarB = ((a) it.next()).b(i11, view);
            if (kVarB != null) {
                return kVarB;
            }
        }
        if (e()) {
            return b(i11, view);
        }
        return null;
    }

    @Override // a8.a
    public final k c(int i11, View[] viewArr) {
        Iterator it = this.f2923b.iterator();
        while (it.hasNext()) {
            k kVarC = ((a) it.next()).c(i11, viewArr);
            if (kVarC != null) {
                return kVarC;
            }
        }
        if (e()) {
            return c(i11, viewArr);
        }
        return null;
    }

    public final void d(a aVar) {
        if (this.f2922a.add(aVar.getClass())) {
            this.f2923b.add(aVar);
            Iterator it = aVar.a().iterator();
            while (it.hasNext()) {
                d((a) it.next());
            }
        }
    }

    public final boolean e() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.f2924c;
        boolean z11 = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (a.class.isAssignableFrom(cls)) {
                    d((a) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z11 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e5) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e5);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z11;
    }
}
