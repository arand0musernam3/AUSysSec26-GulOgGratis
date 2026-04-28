package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.app.tgtg.R;
import k8.j;
import n20.h0;
import n20.o;
import w.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f12386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f12387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f12388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f12389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f12390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12396k;
    public PorterDuff.Mode l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f12397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f12398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f12399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n20.j f12400p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12404t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RippleDrawable f12406v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12407w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12401q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12402r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12403s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12405u = true;

    public f(MaterialButton materialButton, o oVar) {
        this.f12386a = materialButton;
        this.f12387b = oVar;
    }

    public final n20.j a(boolean z11) {
        RippleDrawable rippleDrawable = this.f12406v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (n20.j) ((LayerDrawable) ((InsetDrawable) this.f12406v.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0);
    }

    public final void b(int i11, int i12) {
        MaterialButton materialButton = this.f12386a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i13 = this.f12393h;
        int i14 = this.f12394i;
        this.f12394i = i12;
        this.f12393h = i11;
        if (!this.f12402r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i11) - i13, paddingEnd, (paddingBottom + i12) - i14);
    }

    public final void c() {
        n20.j jVar = new n20.j(this.f12387b);
        h0 h0Var = this.f12388c;
        if (h0Var != null) {
            jVar.y(h0Var);
        }
        j jVar2 = this.f12389d;
        if (jVar2 != null) {
            jVar.r(jVar2);
        }
        z zVar = this.f12390e;
        if (zVar != null) {
            jVar.E = zVar;
        }
        MaterialButton materialButton = this.f12386a;
        jVar.p(materialButton.getContext());
        jVar.setTintList(this.f12397m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f11 = this.f12396k;
        ColorStateList colorStateList = this.f12398n;
        jVar.A(f11);
        jVar.z(colorStateList);
        n20.j jVar3 = new n20.j(this.f12387b);
        h0 h0Var2 = this.f12388c;
        if (h0Var2 != null) {
            jVar3.y(h0Var2);
        }
        j jVar4 = this.f12389d;
        if (jVar4 != null) {
            jVar3.r(jVar4);
        }
        jVar3.setTint(0);
        float f12 = this.f12396k;
        int iY = this.f12401q ? w0.e.y(R.attr.colorSurface, materialButton) : 0;
        jVar3.A(f12);
        jVar3.z(ColorStateList.valueOf(iY));
        n20.j jVar5 = new n20.j(this.f12387b);
        this.f12400p = jVar5;
        h0 h0Var3 = this.f12388c;
        if (h0Var3 != null) {
            jVar5.y(h0Var3);
        }
        j jVar6 = this.f12389d;
        if (jVar6 != null) {
            this.f12400p.r(jVar6);
        }
        this.f12400p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(k20.a.c(this.f12399o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar3, jVar}), this.f12391f, this.f12393h, this.f12392g, this.f12394i), this.f12400p);
        this.f12406v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        n20.j jVarA = a(false);
        if (jVarA != null) {
            jVarA.s(this.f12407w);
            jVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        n20.z zVar;
        n20.j jVarA = a(false);
        if (jVarA != null) {
            h0 h0Var = this.f12388c;
            if (h0Var != null) {
                jVarA.y(h0Var);
            } else {
                jVarA.setShapeAppearanceModel(this.f12387b);
            }
            j jVar = this.f12389d;
            if (jVar != null) {
                jVarA.r(jVar);
            }
        }
        n20.j jVarA2 = a(true);
        if (jVarA2 != null) {
            h0 h0Var2 = this.f12388c;
            if (h0Var2 != null) {
                jVarA2.y(h0Var2);
            } else {
                jVarA2.setShapeAppearanceModel(this.f12387b);
            }
            j jVar2 = this.f12389d;
            if (jVar2 != null) {
                jVarA2.r(jVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f12406v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            zVar = null;
        } else {
            int numberOfLayers = this.f12406v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.f12406v;
            zVar = numberOfLayers > 2 ? (n20.z) rippleDrawable2.getDrawable(2) : (n20.z) rippleDrawable2.getDrawable(1);
        }
        if (zVar != null) {
            zVar.setShapeAppearanceModel(this.f12387b);
            if (zVar instanceof n20.j) {
                n20.j jVar3 = (n20.j) zVar;
                h0 h0Var3 = this.f12388c;
                if (h0Var3 != null) {
                    jVar3.y(h0Var3);
                }
                j jVar4 = this.f12389d;
                if (jVar4 != null) {
                    jVar3.r(jVar4);
                }
            }
        }
    }

    public final void e() {
        n20.j jVarA = a(false);
        n20.j jVarA2 = a(true);
        if (jVarA != null) {
            float f11 = this.f12396k;
            ColorStateList colorStateList = this.f12398n;
            jVarA.A(f11);
            jVarA.z(colorStateList);
            if (jVarA2 != null) {
                float f12 = this.f12396k;
                int iY = this.f12401q ? w0.e.y(R.attr.colorSurface, this.f12386a) : 0;
                jVarA2.A(f12);
                jVarA2.z(ColorStateList.valueOf(iY));
            }
        }
    }
}
