package n20;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class h extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f30318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f30319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a20.a f30320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f30321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f30322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f30323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f30324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f30325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f30326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f30328k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f30329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f30330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint.Style f30334r;

    public h(h hVar) {
        this.f30321d = null;
        this.f30322e = null;
        this.f30323f = null;
        this.f30324g = PorterDuff.Mode.SRC_IN;
        this.f30325h = null;
        this.f30326i = 1.0f;
        this.f30327j = 1.0f;
        this.l = 255;
        this.f30329m = 0.0f;
        this.f30330n = 0.0f;
        this.f30331o = 0;
        this.f30332p = 0;
        this.f30333q = 0;
        this.f30334r = Paint.Style.FILL_AND_STROKE;
        this.f30318a = hVar.f30318a;
        this.f30319b = hVar.f30319b;
        this.f30320c = hVar.f30320c;
        this.f30328k = hVar.f30328k;
        this.f30321d = hVar.f30321d;
        this.f30322e = hVar.f30322e;
        this.f30324g = hVar.f30324g;
        this.f30323f = hVar.f30323f;
        this.l = hVar.l;
        this.f30326i = hVar.f30326i;
        this.f30333q = hVar.f30333q;
        this.f30331o = hVar.f30331o;
        this.f30327j = hVar.f30327j;
        this.f30329m = hVar.f30329m;
        this.f30330n = hVar.f30330n;
        this.f30332p = hVar.f30332p;
        this.f30334r = hVar.f30334r;
        if (hVar.f30325h != null) {
            this.f30325h = new Rect(hVar.f30325h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f30349f = true;
        jVar.f30350g = true;
        return jVar;
    }

    public h(o oVar) {
        this.f30321d = null;
        this.f30322e = null;
        this.f30323f = null;
        this.f30324g = PorterDuff.Mode.SRC_IN;
        this.f30325h = null;
        this.f30326i = 1.0f;
        this.f30327j = 1.0f;
        this.l = 255;
        this.f30329m = 0.0f;
        this.f30330n = 0.0f;
        this.f30331o = 0;
        this.f30332p = 0;
        this.f30333q = 0;
        this.f30334r = Paint.Style.FILL_AND_STROKE;
        this.f30318a = oVar;
        this.f30320c = null;
    }
}
