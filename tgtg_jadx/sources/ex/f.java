package ex;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import ax.a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import o00.h0;
import o30.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.c0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f16522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f16523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16524d;

    public f(View view, Handler handler, HashSet hashSet, String str) {
        handler.getClass();
        hashSet.getClass();
        this.f16521a = new WeakReference(view);
        this.f16523c = hashSet;
        this.f16524d = str;
        handler.postDelayed(this, 200L);
    }

    public final void a(e eVar, View view, fx.c cVar) {
        View viewA = eVar.a();
        if (viewA == null) {
            return;
        }
        String str = eVar.f16520b;
        View.OnClickListener onClickListenerF = fx.h.f(viewA);
        boolean z11 = (onClickListenerF instanceof a) && ((a) onClickListenerF).f16504e;
        HashSet hashSet = this.f16523c;
        if (hashSet.contains(str) || z11) {
            return;
        }
        a aVar = null;
        if (!yx.a.f46339a.contains(c.class)) {
            try {
                a aVar2 = new a();
                aVar2.f16500a = cVar;
                aVar2.f16501b = new WeakReference(viewA);
                aVar2.f16502c = new WeakReference(view);
                aVar2.f16503d = fx.h.f(viewA);
                aVar2.f16504e = true;
                aVar = aVar2;
            } catch (Throwable th2) {
                yx.a.a(c.class, th2);
            }
        }
        viewA.setOnClickListener(aVar);
        hashSet.add(str);
    }

    public final void b(e eVar, View view, fx.c cVar) {
        AdapterView adapterView = (AdapterView) eVar.a();
        if (adapterView == null) {
            return;
        }
        String str = eVar.f16520b;
        AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
        boolean z11 = (onItemClickListener instanceof b) && ((b) onItemClickListener).f16509e;
        HashSet hashSet = this.f16523c;
        if (hashSet.contains(str) || z11) {
            return;
        }
        b bVar = null;
        if (!yx.a.f46339a.contains(c.class)) {
            try {
                b bVar2 = new b();
                bVar2.f16505a = cVar;
                bVar2.f16506b = new WeakReference(adapterView);
                bVar2.f16507c = new WeakReference(view);
                bVar2.f16508d = adapterView.getOnItemClickListener();
                bVar2.f16509e = true;
                bVar = bVar2;
            } catch (Throwable th2) {
                yx.a.a(c.class, th2);
            }
        }
        adapterView.setOnItemClickListener(bVar);
        hashSet.add(str);
    }

    public final void c(e eVar, View view, fx.c cVar) {
        View viewA = eVar.a();
        if (viewA == null) {
            return;
        }
        String str = eVar.f16520b;
        View.OnTouchListener onTouchListenerG = fx.h.g(viewA);
        boolean z11 = (onTouchListenerG instanceof h) && ((h) onTouchListenerG).f16536e;
        HashSet hashSet = this.f16523c;
        if (hashSet.contains(str) || z11) {
            return;
        }
        h hVar = null;
        if (!yx.a.f46339a.contains(i.class)) {
            try {
                hVar = new h(cVar, view, viewA);
            } catch (Throwable th2) {
                yx.a.a(i.class, th2);
            }
        }
        viewA.setOnTouchListener(hVar);
        hashSet.add(str);
    }

    public final void d() {
        ArrayList arrayList = this.f16522b;
        if (arrayList != null) {
            WeakReference weakReference = this.f16521a;
            if (weakReference.get() != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    fx.c cVar = (fx.c) arrayList.get(i11);
                    View view = (View) weakReference.get();
                    if (cVar != null) {
                        String str = cVar.f17977d;
                        if (view != null) {
                            String str2 = this.f16524d;
                            if (str == null || str.length() == 0 || Intrinsics.areEqual(str, str2)) {
                                List listUnmodifiableList = Collections.unmodifiableList(cVar.f17975b);
                                listUnmodifiableList.getClass();
                                if (listUnmodifiableList.size() <= 25) {
                                    for (e eVar : e0.u(view, listUnmodifiableList, 0, -1, str2)) {
                                        try {
                                            View viewA = eVar.a();
                                            if (viewA != null) {
                                                View viewA2 = fx.h.a(viewA);
                                                if (viewA2 != null && fx.h.f17991a.m(viewA, viewA2)) {
                                                    c(eVar, view, cVar);
                                                } else if (!y.p(viewA.getClass().getName(), "com.facebook.react", false)) {
                                                    if (!(viewA instanceof AdapterView)) {
                                                        a(eVar, view, cVar);
                                                    } else if (viewA instanceof ListView) {
                                                        b(eVar, view, cVar);
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                            yx.a.f46339a.contains(g.class);
                                            a0 a0Var = a0.f4849a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            z zVarB = c0.b(a0.b());
            if (zVarB != null && zVarB.f40591i) {
                JSONArray jSONArray = zVarB.f40592j;
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null) {
                    try {
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            jSONObject.getClass();
                            arrayList.add(h0.w(jSONObject));
                        }
                    } catch (IllegalArgumentException | JSONException unused) {
                    }
                }
                this.f16522b = arrayList;
                View view = (View) this.f16521a.get();
                if (view == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                }
                d();
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
