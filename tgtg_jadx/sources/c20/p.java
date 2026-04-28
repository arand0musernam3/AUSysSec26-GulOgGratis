package c20;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.app.tgtg.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import n20.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final u8.a B = k10.a.f25732c;
    public static final int C = R.attr.motionDurationLong2;
    public static final int D = R.attr.motionEasingEmphasizedInterpolator;
    public static final int E = R.attr.motionDurationMedium1;
    public static final int F = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] G = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] J = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] K = {android.R.attr.state_enabled};
    public static final int[] L = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n20.o f6994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f6995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RippleDrawable f6996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f6997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RippleDrawable f6998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6999f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f7002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7004k;
    public StateListAnimator l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Animator f7005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k10.e f7006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k10.e f7007o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7009q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f7011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f7012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f7013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f7014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lz.i f7015w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7000g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7008p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7010r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f7016x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f7017y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f7018z = new RectF();
    public final Matrix A = new Matrix();

    public p(FloatingActionButton floatingActionButton, lz.i iVar) {
        this.f7014v = floatingActionButton;
        this.f7015w = iVar;
    }

    public final void a(float f11, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7014v.getDrawable();
        if (drawable == null || this.f7009q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f7017y;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f12 = this.f7009q;
        RectF rectF2 = this.f7018z;
        rectF2.set(0.0f, 0.0f, f12, f12);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f13 = this.f7009q / 2.0f;
        matrix.postScale(f11, f11, f13, f13);
    }

    public final AnimatorSet b(k10.e eVar, float f11, float f12, float f13) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f11};
        FloatingActionButton floatingActionButton = this.f7014v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.f("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f12);
        eVar.f("scale").a(objectAnimatorOfFloat2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 26) {
            objectAnimatorOfFloat2.setEvaluator(new n());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f12);
        eVar.f("scale").a(objectAnimatorOfFloat3);
        if (i11 == 26) {
            objectAnimatorOfFloat3.setEvaluator(new n());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.A;
        a(f13, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new a(), new m(this), new Matrix(matrix));
        eVar.f("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        dx.f.x(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f11, final float f12, final float f13, int i11, int i12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f7014v;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f14 = this.f7008p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c20.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p pVar = this.f6971a;
                FloatingActionButton floatingActionButton2 = pVar.f7014v;
                floatingActionButton2.setAlpha(k10.a.b(alpha, f11, 0.0f, 0.2f, fFloatValue));
                float f15 = scaleX;
                float f16 = f12;
                floatingActionButton2.setScaleX(k10.a.a(f15, f16, fFloatValue));
                floatingActionButton2.setScaleY(k10.a.a(scaleY, f16, fFloatValue));
                float f17 = f14;
                float f18 = f13;
                pVar.f7008p = k10.a.a(f17, f18, fFloatValue);
                float fA = k10.a.a(f17, f18, fFloatValue);
                Matrix matrix2 = matrix;
                pVar.a(fA, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        dx.f.x(animatorSet, arrayList);
        animatorSet.setDuration(ox.h.P(floatingActionButton.getContext(), i11, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(ox.h.Q(floatingActionButton.getContext(), i12, k10.a.f25731b));
        return animatorSet;
    }

    public final AnimatorSet d(float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f11};
        FloatingActionButton floatingActionButton = this.f7014v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f12).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

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
    public final void e(float f11, float f12, float f13) {
        FloatingActionButton floatingActionButton = this.f7014v;
        if (floatingActionButton.getStateListAnimator() == this.l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(G, d(f11, f13));
            stateListAnimator.addState(H, d(f11, f12));
            stateListAnimator.addState(I, d(f11, f12));
            stateListAnimator.addState(J, d(f11, f12));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f11).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(B);
            stateListAnimator.addState(K, animatorSet);
            stateListAnimator.addState(L, d(0.0f, 0.0f));
            this.l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.f7015w.f28446b).f12471k || (this.f6999f && floatingActionButton.getSizeDimension() < this.f7004k)) {
            i();
        }
    }

    public final void f() {
        ArrayList<i> arrayList = this.f7013u;
        if (arrayList != null) {
            for (i iVar : arrayList) {
                jb.b bVar = iVar.f6969a;
                FloatingActionButton floatingActionButton = iVar.f6970b;
                bVar.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) bVar.f24851a;
                bottomAppBar.t0.u((floatingActionButton.getVisibility() == 0 && bottomAppBar.f12288j1 == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }
        }
    }

    public final void g() {
        ArrayList<i> arrayList = this.f7013u;
        if (arrayList != null) {
            for (i iVar : arrayList) {
                jb.b bVar = iVar.f6969a;
                FloatingActionButton floatingActionButton = iVar.f6970b;
                bVar.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) bVar.f24851a;
                int i11 = bottomAppBar.f12288j1;
                n20.j jVar = bottomAppBar.t0;
                if (i11 == 1) {
                    float translationX = floatingActionButton.getTranslationX();
                    if (bottomAppBar.getTopEdgeTreatment().f31807f != translationX) {
                        bottomAppBar.getTopEdgeTreatment().f31807f = translationX;
                        jVar.invalidateSelf();
                    }
                    float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    if (bottomAppBar.getTopEdgeTreatment().f31806e != fMax) {
                        bottomAppBar.getTopEdgeTreatment().y(fMax);
                        jVar.invalidateSelf();
                    }
                    jVar.u(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public final void h(n20.o oVar) {
        this.f6994a = oVar;
        o oVar2 = this.f6995b;
        if (oVar2 != null) {
            oVar2.setShapeAppearanceModel(oVar);
        }
        Drawable.Callback callback = this.f6996c;
        if (callback instanceof z) {
            ((z) callback).setShapeAppearanceModel(oVar);
        }
        c cVar = this.f6997d;
        if (cVar != null) {
            cVar.f6960o = oVar;
            cVar.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r11 = this;
            lz.i r0 = r11.f7015w
            java.lang.Object r1 = r0.f28446b
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            java.lang.Object r2 = r0.f28446b
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r1.f12471k
            boolean r3 = r11.f6999f
            android.graphics.Rect r4 = r11.f7016x
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = r11.f7014v
            r6 = 0
            if (r1 == 0) goto L4c
            if (r3 == 0) goto L24
            int r1 = r11.f7004k
            int r3 = r5.getSizeDimension()
            int r1 = r1 - r3
            int r1 = r1 / 2
            int r6 = java.lang.Math.max(r1, r6)
        L24:
            boolean r1 = r11.f7000g
            if (r1 == 0) goto L30
            float r1 = r5.getElevation()
            float r3 = r11.f7003j
            float r1 = r1 + r3
            goto L31
        L30:
            r1 = 0
        L31:
            double r7 = (double) r1
            double r7 = java.lang.Math.ceil(r7)
            int r3 = (int) r7
            int r3 = java.lang.Math.max(r6, r3)
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r7
            double r7 = (double) r1
            double r7 = java.lang.Math.ceil(r7)
            int r1 = (int) r7
            int r1 = java.lang.Math.max(r6, r1)
            r4.set(r3, r1, r3, r1)
            goto L64
        L4c:
            if (r3 == 0) goto L61
            int r1 = r5.getSizeDimension()
            int r3 = r11.f7004k
            if (r1 >= r3) goto L61
            int r1 = r5.getSizeDimension()
            int r3 = r3 - r1
            int r3 = r3 / 2
            r4.set(r3, r3, r3, r3)
            goto L64
        L61:
            r4.set(r6, r6, r6, r6)
        L64:
            android.graphics.drawable.RippleDrawable r1 = r11.f6998e
            java.lang.String r3 = "Didn't initialize content background"
            pd.g.m(r1, r3)
            java.lang.Object r0 = r0.f28446b
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.f12471k
            if (r0 != 0) goto L88
            boolean r0 = r11.f6999f
            if (r0 == 0) goto L80
            int r0 = r5.getSizeDimension()
            int r1 = r11.f7004k
            if (r0 >= r1) goto L80
            goto L88
        L80:
            android.graphics.drawable.RippleDrawable r0 = r11.f6998e
            if (r0 == 0) goto L9a
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r0)
            goto L9a
        L88:
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r6 = r11.f6998e
            int r7 = r4.left
            int r8 = r4.top
            int r9 = r4.right
            int r10 = r4.bottom
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r5)
        L9a:
            int r0 = r4.left
            int r1 = r4.top
            int r3 = r4.right
            int r4 = r4.bottom
            android.graphics.Rect r5 = r2.l
            r5.set(r0, r1, r3, r4)
            int r5 = r2.f12469i
            int r0 = r0 + r5
            int r1 = r1 + r5
            int r3 = r3 + r5
            int r4 = r4 + r5
            r2.setPadding(r0, r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c20.p.i():void");
    }
}
