package df;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.r;
import bx.k;
import gf.h;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import ye.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f14874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kf.b f14875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gf.e f14877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f14878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakReference f14879g;

    public a(View view, String str, h hVar, kf.b bVar, List list, gf.e eVar) {
        view.getClass();
        bVar.getClass();
        list.getClass();
        this.f14873a = str;
        this.f14874b = hVar;
        this.f14875c = bVar;
        this.f14876d = list;
        this.f14877e = eVar;
        this.f14878f = null;
        this.f14879g = new WeakReference(view);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        motionEvent2.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        motionEvent2.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        gf.e eVar = this.f14877e;
        if (!eVar.f20413b.c().f45885e.isEmpty()) {
            View view = (View) this.f14879g.get();
            kf.b bVar = this.f14875c;
            if (view == null) {
                bVar.a("DecorView is null in onSingleTapUp()");
                return false;
            }
            Pair pair = new Pair(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
            af.e eVarB = af.c.b(af.d.Clickable, view, this.f14876d, bVar, pair);
            if (eVarB == null) {
                bVar.d("Unable to find click target. No event captured.");
                return false;
            }
            r rVar = this.f14878f;
            if (rVar != null) {
                rVar.invoke(eVarB);
            }
            if (eVar.f20413b.c().f45885e.contains(s.f45938a)) {
                this.f14874b.invoke("[Amplitude] Element Interacted", k.p(eVarB, this.f14873a));
            }
        }
        return false;
    }
}
