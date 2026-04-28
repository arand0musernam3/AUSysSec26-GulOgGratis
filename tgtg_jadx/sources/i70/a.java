package i70;

import android.os.Handler;
import android.view.View;
import com.google.firebase.messaging.v;
import df.g;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ArrayList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f23478a;

    public a(b bVar) {
        this.f23478a = bVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        view.getClass();
        Iterator it = this.f23478a.f23479a.iterator();
        while (it.hasNext()) {
            g gVar = ((df.f) it.next()).f14892a;
            ((Handler) gVar.f14900h).post(new v(true, gVar, view));
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        Object objRemove = super.remove(i11);
        objRemove.getClass();
        View view = (View) objRemove;
        Iterator it = this.f23478a.f23479a.iterator();
        while (it.hasNext()) {
            g gVar = ((df.f) it.next()).f14892a;
            ((Handler) gVar.f14900h).post(new v(false, gVar, view));
        }
        return view;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }
}
