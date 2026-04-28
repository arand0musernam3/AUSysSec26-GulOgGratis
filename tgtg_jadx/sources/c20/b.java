package c20;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtendedFloatingActionButton f6942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6943c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final se.b f6944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k10.e f6945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k10.e f6946f;

    public b(ExtendedFloatingActionButton extendedFloatingActionButton, se.b bVar) {
        this.f6942b = extendedFloatingActionButton;
        this.f6941a = extendedFloatingActionButton.getContext();
        this.f6944d = bVar;
    }

    public AnimatorSet a() {
        k10.e eVar = this.f6946f;
        if (eVar == null) {
            if (this.f6945e == null) {
                this.f6945e = k10.e.b(this.f6941a, c());
            }
            eVar = this.f6945e;
            eVar.getClass();
        }
        return b(eVar);
    }

    public final AnimatorSet b(k10.e eVar) {
        ArrayList arrayList = new ArrayList();
        boolean zG = eVar.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6942b;
        if (zG) {
            arrayList.add(eVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (eVar.g("scale")) {
            arrayList.add(eVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(eVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (eVar.g("width")) {
            arrayList.add(eVar.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f12440q));
        }
        if (eVar.g("height")) {
            arrayList.add(eVar.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f12441r));
        }
        if (eVar.g("paddingStart")) {
            arrayList.add(eVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f12442s));
        }
        if (eVar.g("paddingEnd")) {
            arrayList.add(eVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f12443t));
        }
        if (eVar.g("labelOpacity")) {
            arrayList.add(eVar.d("labelOpacity", extendedFloatingActionButton, new a(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        dx.f.x(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.f6944d.f39010b = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
