package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.e;
import androidx.lifecycle.n1;
import com.app.tgtg.R;
import he.a0;
import he.b;
import he.c;
import he.c0;
import he.d0;
import he.e0;
import he.f;
import he.f0;
import he.g;
import he.g0;
import he.h;
import he.h0;
import he.i;
import he.j;
import he.j0;
import he.k;
import he.k0;
import he.l;
import he.l0;
import he.o;
import he.u;
import he.y;
import he.z;
import i4.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import re.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f8850n = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f8852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f8853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f8855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f8861k;
    public final HashSet l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f0 f8862m;

    public LottieAnimationView(Context context) {
        super(context);
        this.f8851a = new j(this, 1);
        this.f8852b = new j(this, 0);
        this.f8854d = 0;
        this.f8855e = new z();
        this.f8858h = false;
        this.f8859i = false;
        this.f8860j = true;
        this.f8861k = new HashSet();
        this.l = new HashSet();
        d(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(f0 f0Var) {
        e0 e0Var = f0Var.f21908d;
        z zVar = this.f8855e;
        if (e0Var != null && zVar == getDrawable() && zVar.f21981a == e0Var.f21902a) {
            return;
        }
        this.f8861k.add(i.SET_ANIMATION);
        this.f8855e.d();
        a();
        f0Var.b(this.f8851a);
        f0Var.a(this.f8852b);
        this.f8862m = f0Var;
    }

    public final void a() {
        f0 f0Var = this.f8862m;
        if (f0Var != null) {
            j jVar = this.f8851a;
            synchronized (f0Var) {
                f0Var.f21905a.remove(jVar);
            }
            f0 f0Var2 = this.f8862m;
            j jVar2 = this.f8852b;
            synchronized (f0Var2) {
                f0Var2.f21906b.remove(jVar2);
            }
        }
    }

    public final void d(AttributeSet attributeSet, int i11) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h0.f21922a, i11, 0);
        this.f8860j = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            a.f("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            return;
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.f8859i = true;
        }
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        z zVar = this.f8855e;
        if (z11) {
            zVar.f21982b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f11 = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            this.f8861k.add(i.SET_PROGRESS);
        }
        zVar.z(f11);
        zVar.h(a0.MergePathsApi19, typedArrayObtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            zVar.a(new oe.f("**"), d0.I, new ub.a(new k0(e.b(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            j0 j0Var = j0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(17, j0Var.ordinal());
            if (iOrdinal >= j0.values().length) {
                iOrdinal = j0Var.ordinal();
            }
            setRenderMode(j0.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            he.a aVar = he.a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(2, aVar.ordinal());
            if (iOrdinal2 >= j0.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(he.a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void e() {
        this.f8861k.add(i.PLAY_OPTION);
        this.f8855e.m();
    }

    public he.a getAsyncUpdates() {
        he.a aVar = this.f8855e.M;
        return aVar != null ? aVar : he.e.f21898a;
    }

    public boolean getAsyncUpdatesEnabled() {
        he.a aVar = this.f8855e.M;
        if (aVar == null) {
            aVar = he.e.f21898a;
        }
        return aVar == he.a.ENABLED;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f8855e.f22001v;
    }

    public boolean getClipToCompositionBounds() {
        return this.f8855e.f21994o;
    }

    public k getComposition() {
        Drawable drawable = getDrawable();
        z zVar = this.f8855e;
        if (drawable == zVar) {
            return zVar.f21981a;
        }
        return null;
    }

    public long getDuration() {
        k composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f8855e.f21982b.f42259h;
    }

    public String getImageAssetsFolder() {
        return this.f8855e.f21989i;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f8855e.f21993n;
    }

    public float getMaxFrame() {
        return this.f8855e.f21982b.b();
    }

    public float getMinFrame() {
        return this.f8855e.f21982b.c();
    }

    public g0 getPerformanceTracker() {
        k kVar = this.f8855e.f21981a;
        if (kVar != null) {
            return kVar.f21926a;
        }
        return null;
    }

    public float getProgress() {
        return this.f8855e.f21982b.a();
    }

    public j0 getRenderMode() {
        return this.f8855e.f22003x ? j0.SOFTWARE : j0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f8855e.f21982b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f8855e.f21982b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f8855e.f21982b.f42255d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof z) {
            if ((((z) drawable).f22003x ? j0.SOFTWARE : j0.HARDWARE) == j0.SOFTWARE) {
                this.f8855e.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        z zVar = this.f8855e;
        if (drawable2 == zVar) {
            super.invalidateDrawable(zVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f8859i) {
            return;
        }
        this.f8855e.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i11;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.f8856f = hVar.f21915a;
        i iVar = i.SET_ANIMATION;
        HashSet hashSet = this.f8861k;
        if (!hashSet.contains(iVar) && !TextUtils.isEmpty(this.f8856f)) {
            setAnimation(this.f8856f);
        }
        this.f8857g = hVar.f21916b;
        if (!hashSet.contains(iVar) && (i11 = this.f8857g) != 0) {
            setAnimation(i11);
        }
        if (!hashSet.contains(i.SET_PROGRESS)) {
            this.f8855e.z(hVar.f21917c);
        }
        if (!hashSet.contains(i.PLAY_OPTION) && hVar.f21918d) {
            e();
        }
        if (!hashSet.contains(i.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(hVar.f21919e);
        }
        if (!hashSet.contains(i.SET_REPEAT_MODE)) {
            setRepeatMode(hVar.f21920f);
        }
        if (hashSet.contains(i.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(hVar.f21921g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z11;
        h hVar = new h(super.onSaveInstanceState());
        hVar.f21915a = this.f8856f;
        hVar.f21916b = this.f8857g;
        z zVar = this.f8855e;
        ve.e eVar = zVar.f21982b;
        ve.e eVar2 = zVar.f21982b;
        hVar.f21917c = eVar.a();
        if (zVar.isVisible()) {
            z11 = eVar2.f42263m;
        } else {
            y yVar = zVar.f21986f;
            z11 = yVar == y.PLAY || yVar == y.RESUME;
        }
        hVar.f21918d = z11;
        hVar.f21919e = zVar.f21989i;
        hVar.f21920f = eVar2.getRepeatMode();
        hVar.f21921g = eVar2.getRepeatCount();
        return hVar;
    }

    public void setAnimation(final int i11) {
        f0 f0VarA;
        this.f8857g = i11;
        final String str = null;
        this.f8856f = null;
        if (isInEditMode()) {
            f0VarA = new f0(new g(this, i11, 0), true);
        } else if (this.f8860j) {
            Context context = getContext();
            final String strL = o.l(context, i11);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            f0VarA = o.a(strL, new Callable() { // from class: he.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return o.g(context2, strL, i11);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = o.f21952a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            f0VarA = o.a(null, new Callable() { // from class: he.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return o.g(context22, str, i11);
                }
            }, null);
        }
        setCompositionTask(f0VarA);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        f0 f0VarA;
        int i11 = 0;
        String str2 = null;
        if (this.f8860j) {
            Context context = getContext();
            HashMap map = o.f21952a;
            String strK = e0.f.k("url_", str);
            f0VarA = o.a(strK, new l(context, str, strK, i11), null);
        } else {
            f0VarA = o.a(null, new l(getContext(), str, str2, i11), null);
        }
        setCompositionTask(f0VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z11) {
        this.f8855e.f21999t = z11;
    }

    public void setApplyingShadowToLayersEnabled(boolean z11) {
        this.f8855e.f22000u = z11;
    }

    public void setAsyncUpdates(he.a aVar) {
        this.f8855e.M = aVar;
    }

    public void setCacheComposition(boolean z11) {
        this.f8860j = z11;
    }

    public void setClipTextToBoundingBox(boolean z11) {
        z zVar = this.f8855e;
        if (z11 != zVar.f22001v) {
            zVar.f22001v = z11;
            zVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z11) {
        z zVar = this.f8855e;
        if (z11 != zVar.f21994o) {
            zVar.f21994o = z11;
            d dVar = zVar.f21995p;
            if (dVar != null) {
                dVar.L = z11;
            }
            zVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull k kVar) {
        he.a aVar = he.e.f21898a;
        z zVar = this.f8855e;
        zVar.setCallback(this);
        this.f8858h = true;
        boolean zP = zVar.p(kVar);
        if (this.f8859i) {
            zVar.m();
        }
        this.f8858h = false;
        if (getDrawable() != zVar || zP) {
            if (!zP) {
                ve.e eVar = zVar.f21982b;
                boolean z11 = eVar != null ? eVar.f42263m : false;
                setImageDrawable(null);
                setImageDrawable(zVar);
                if (z11) {
                    zVar.o();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.l.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        z zVar = this.f8855e;
        zVar.l = str;
        n1 n1VarJ = zVar.j();
        if (n1VarJ != null) {
            n1VarJ.f3503e = str;
        }
    }

    public void setFailureListener(c0 c0Var) {
        this.f8853c = c0Var;
    }

    public void setFallbackResource(int i11) {
        this.f8854d = i11;
    }

    public void setFontAssetDelegate(b bVar) {
        n1 n1Var = this.f8855e.f21990j;
    }

    public void setFontMap(Map<String, Typeface> map) {
        z zVar = this.f8855e;
        if (map == zVar.f21991k) {
            return;
        }
        zVar.f21991k = map;
        zVar.invalidateSelf();
    }

    public void setFrame(int i11) {
        this.f8855e.q(i11);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z11) {
        this.f8855e.f21984d = z11;
    }

    public void setImageAssetDelegate(c cVar) {
        ne.a aVar = this.f8855e.f21988h;
    }

    public void setImageAssetsFolder(String str) {
        this.f8855e.f21989i = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f8857g = 0;
        this.f8856f = null;
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f8857g = 0;
        this.f8856f = null;
        a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        this.f8857g = 0;
        this.f8856f = null;
        a();
        super.setImageResource(i11);
    }

    public void setMaintainOriginalImageBounds(boolean z11) {
        this.f8855e.f21993n = z11;
    }

    public void setMaxFrame(int i11) {
        this.f8855e.r(i11);
    }

    public void setMaxProgress(float f11) {
        z zVar = this.f8855e;
        k kVar = zVar.f21981a;
        if (kVar == null) {
            zVar.f21987g.add(new u(zVar, f11, 0));
            return;
        }
        ve.e eVar = zVar.f21982b;
        eVar.k(eVar.f42261j, ve.g.f(kVar.l, kVar.f21937m, f11));
    }

    public void setMinAndMaxFrame(String str) {
        this.f8855e.u(str);
    }

    public void setMinAndMaxProgress(float f11, float f12) {
        this.f8855e.w(f11, f12);
    }

    public void setMinFrame(int i11) {
        this.f8855e.x(i11);
    }

    public void setMinProgress(float f11) {
        z zVar = this.f8855e;
        k kVar = zVar.f21981a;
        if (kVar == null) {
            zVar.f21987g.add(new u(zVar, f11, 1));
        } else {
            zVar.x((int) ve.g.f(kVar.l, kVar.f21937m, f11));
        }
    }

    public void setOutlineMasksAndMattes(boolean z11) {
        z zVar = this.f8855e;
        if (zVar.f21998s == z11) {
            return;
        }
        zVar.f21998s = z11;
        d dVar = zVar.f21995p;
        if (dVar != null) {
            dVar.q(z11);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z11) {
        z zVar = this.f8855e;
        zVar.f21997r = z11;
        k kVar = zVar.f21981a;
        if (kVar != null) {
            kVar.f21926a.f21912a = z11;
        }
    }

    public void setProgress(float f11) {
        this.f8861k.add(i.SET_PROGRESS);
        this.f8855e.z(f11);
    }

    public void setRenderMode(j0 j0Var) {
        z zVar = this.f8855e;
        zVar.f22002w = j0Var;
        zVar.e();
    }

    public void setRepeatCount(int i11) {
        this.f8861k.add(i.SET_REPEAT_COUNT);
        this.f8855e.f21982b.setRepeatCount(i11);
    }

    public void setRepeatMode(int i11) {
        this.f8861k.add(i.SET_REPEAT_MODE);
        this.f8855e.f21982b.setRepeatMode(i11);
    }

    public void setSafeMode(boolean z11) {
        this.f8855e.f21985e = z11;
    }

    public void setSpeed(float f11) {
        this.f8855e.f21982b.f42255d = f11;
    }

    public void setTextDelegate(l0 l0Var) {
        this.f8855e.getClass();
    }

    public void setUseCompositionFrameRate(boolean z11) {
        this.f8855e.f21982b.f42264n = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            boolean r0 = r4.f8858h
            r1 = 0
            if (r0 != 0) goto L19
            he.z r2 = r4.f8855e
            if (r5 != r2) goto L19
            ve.e r3 = r2.f21982b
            if (r3 != 0) goto Lf
            r3 = r1
            goto L11
        Lf:
            boolean r3 = r3.f42263m
        L11:
            if (r3 == 0) goto L19
            r4.f8859i = r1
            r2.l()
            goto L2e
        L19:
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof he.z
            if (r0 == 0) goto L2e
            r0 = r5
            he.z r0 = (he.z) r0
            ve.e r2 = r0.f21982b
            if (r2 != 0) goto L27
            goto L29
        L27:
            boolean r1 = r2.f42263m
        L29:
            if (r1 == 0) goto L2e
            r0.l()
        L2e:
            super.unscheduleDrawable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setMaxFrame(String str) {
        this.f8855e.s(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z11) {
        this.f8855e.v(str, str2, z11);
    }

    public void setMinFrame(String str) {
        this.f8855e.y(str);
    }

    public void setMinAndMaxFrame(int i11, int i12) {
        this.f8855e.t(i11, i12);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(o.a(str2, new l(getContext(), str, str2, 0), null));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8851a = new j(this, 1);
        this.f8852b = new j(this, 0);
        this.f8854d = 0;
        this.f8855e = new z();
        this.f8858h = false;
        this.f8859i = false;
        this.f8860j = true;
        this.f8861k = new HashSet();
        this.l = new HashSet();
        d(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f8851a = new j(this, 1);
        this.f8852b = new j(this, 0);
        this.f8854d = 0;
        this.f8855e = new z();
        this.f8858h = false;
        this.f8859i = false;
        this.f8860j = true;
        this.f8861k = new HashSet();
        this.l = new HashSet();
        d(attributeSet, i11);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(o.a(str, new com.google.firebase.messaging.g(2, inputStream, str), new d1.e(inputStream, 18)));
    }

    public void setAnimation(String str) {
        f0 f0VarA;
        this.f8856f = str;
        this.f8857g = 0;
        int i11 = 1;
        if (isInEditMode()) {
            f0VarA = new f0(new com.google.firebase.messaging.g(i11, this, str), true);
        } else if (this.f8860j) {
            f0VarA = o.b(getContext(), str);
        } else {
            Context context = getContext();
            HashMap map = o.f21952a;
            f0VarA = o.a(null, new l(context.getApplicationContext(), str, null, i11), null);
        }
        setCompositionTask(f0VarA);
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(o.a(str, new com.google.firebase.messaging.g(3, zipInputStream, str), new d1.e(zipInputStream, 19)));
    }
}
