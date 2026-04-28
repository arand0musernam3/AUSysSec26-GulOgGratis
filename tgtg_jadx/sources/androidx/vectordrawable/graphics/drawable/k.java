package androidx.vectordrawable.graphics.drawable;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a3.j f4053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a3.j f4055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4060k;
    public Paint.Cap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f4061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f4062n;

    @Override // androidx.vectordrawable.graphics.drawable.m
    public final boolean a() {
        return this.f4055f.p() || this.f4053d.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // androidx.vectordrawable.graphics.drawable.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            a3.j r0 = r6.f4055f
            boolean r1 = r0.p()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f400d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f398b
            if (r1 == r4) goto L1e
            r0.f398b = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            a3.j r1 = r6.f4053d
            boolean r4 = r1.p()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f400d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f398b
            if (r7 == r4) goto L3a
            r1.f398b = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.k.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f4057h;
    }

    public int getFillColor() {
        return this.f4055f.f398b;
    }

    public float getStrokeAlpha() {
        return this.f4056g;
    }

    public int getStrokeColor() {
        return this.f4053d.f398b;
    }

    public float getStrokeWidth() {
        return this.f4054e;
    }

    public float getTrimPathEnd() {
        return this.f4059j;
    }

    public float getTrimPathOffset() {
        return this.f4060k;
    }

    public float getTrimPathStart() {
        return this.f4058i;
    }

    public void setFillAlpha(float f11) {
        this.f4057h = f11;
    }

    public void setFillColor(int i11) {
        this.f4055f.f398b = i11;
    }

    public void setStrokeAlpha(float f11) {
        this.f4056g = f11;
    }

    public void setStrokeColor(int i11) {
        this.f4053d.f398b = i11;
    }

    public void setStrokeWidth(float f11) {
        this.f4054e = f11;
    }

    public void setTrimPathEnd(float f11) {
        this.f4059j = f11;
    }

    public void setTrimPathOffset(float f11) {
        this.f4060k = f11;
    }

    public void setTrimPathStart(float f11) {
        this.f4058i = f11;
    }
}
