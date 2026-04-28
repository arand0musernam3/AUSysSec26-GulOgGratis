package n20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import com.app.tgtg.R;
import com.braze.h2;
import java.util.BitSet;
import java.util.Objects;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class j extends Drawable implements z {
    public static final Paint F;
    public static final i[] G;
    public k8.j A;
    public final k8.i[] B;
    public float[] C;
    public float[] D;
    public w.z E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb.b f30344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f30345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x[] f30346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x[] f30347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f30348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f30351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f30352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f30353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f30354k;
    public final RectF l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Region f30355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Region f30356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f30357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f30358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m20.a f30359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m1.a f30360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f30361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f30362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f30363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f30365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f30366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f30367y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f30368z;

    static {
        n nVar = new n();
        nVar.c(0.0f);
        nVar.a();
        Paint paint = new Paint(1);
        F = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        G = new i[4];
        int i11 = 0;
        while (true) {
            i[] iVarArr = G;
            if (i11 >= iVarArr.length) {
                return;
            }
            iVarArr[i11] = new i(i11);
            i11++;
        }
    }

    public j(h hVar) {
        this.f30344a = new jb.b(this);
        this.f30346c = new x[4];
        this.f30347d = new x[4];
        this.f30348e = new BitSet(8);
        this.f30351h = new Matrix();
        this.f30352i = new Path();
        this.f30353j = new Path();
        this.f30354k = new RectF();
        this.l = new RectF();
        this.f30355m = new Region();
        this.f30356n = new Region();
        Paint paint = new Paint(1);
        this.f30357o = paint;
        Paint paint2 = new Paint(1);
        this.f30358p = paint2;
        this.f30359q = new m20.a();
        this.f30361s = Looper.getMainLooper().getThread() == Thread.currentThread() ? p.f30399a : new q();
        this.f30365w = new RectF();
        this.f30366x = true;
        this.f30367y = true;
        this.B = new k8.i[4];
        this.f30345b = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        D();
        B(getState());
        this.f30360r = new m1.a(this);
    }

    public static float c(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.g(rectF)) {
                return oVar.f30392e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f11 = fArr[0];
            for (int i11 = 1; i11 < fArr.length; i11++) {
                if (fArr[i11] != f11) {
                    return -1.0f;
                }
            }
        }
        if (oVar.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public static j e(Context context, float f11, ColorStateList colorStateList) {
        if (colorStateList == null) {
            TypedValue typedValueI = ex.i.I(context, j.class.getSimpleName(), R.attr.colorSurface);
            int i11 = typedValueI.resourceId;
            colorStateList = ColorStateList.valueOf(i11 != 0 ? context.getColor(i11) : typedValueI.data);
        }
        j jVar = new j();
        jVar.p(context);
        jVar.t(colorStateList);
        jVar.s(f11);
        return jVar;
    }

    public final void A(float f11) {
        this.f30345b.f30328k = f11;
        invalidateSelf();
    }

    public final boolean B(int[] iArr) {
        boolean z11;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f30345b.f30321d == null || color2 == (colorForState2 = this.f30345b.f30321d.getColorForState(iArr, (color2 = (paint2 = this.f30357o).getColor())))) {
            z11 = false;
        } else {
            paint2.setColor(colorForState2);
            z11 = true;
        }
        if (this.f30345b.f30322e == null || color == (colorForState = this.f30345b.f30322e.getColorForState(iArr, (color = (paint = this.f30358p).getColor())))) {
            return z11;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void C(int[] iArr, boolean z11) {
        o oVarA;
        int i11;
        RectF rectFI = i();
        if (this.f30345b.f30319b == null || rectFI.isEmpty()) {
            return;
        }
        boolean z12 = z11 | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        h0 h0Var = this.f30345b.f30319b;
        o[] oVarArr = h0Var.f30338d;
        int i12 = h0Var.f30335a;
        int[][] iArr2 = h0Var.f30337c;
        f0 f0Var = h0Var.f30342h;
        f0 f0Var2 = h0Var.f30341g;
        f0 f0Var3 = h0Var.f30340f;
        f0 f0Var4 = h0Var.f30339e;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                i13 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i13], iArr)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    i11 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i14], iArr3)) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                }
            }
            i13 = i11;
        }
        if (f0Var4 == null && f0Var3 == null && f0Var2 == null && f0Var == null) {
            oVarA = oVarArr[i13];
        } else {
            n nVarH = oVarArr[i13].h();
            if (f0Var4 != null) {
                nVarH.f30380e = f0Var4.c(iArr);
            }
            if (f0Var3 != null) {
                nVarH.f30381f = f0Var3.c(iArr);
            }
            if (f0Var2 != null) {
                nVarH.f30383h = f0Var2.c(iArr);
            }
            if (f0Var != null) {
                nVarH.f30382g = f0Var.c(iArr);
            }
            oVarA = nVarH.a();
        }
        int i15 = 0;
        while (i15 < 4) {
            this.f30361s.getClass();
            float fA = (i15 != 1 ? i15 != 2 ? i15 != 3 ? oVarA.f30393f : oVarA.f30392e : oVarA.f30395h : oVarA.f30394g).a(rectFI);
            if (z12) {
                this.C[i15] = fA;
            }
            k8.i[] iVarArr = this.B;
            k8.i iVar = iVarArr[i15];
            if (iVar != null) {
                iVar.a(fA);
                if (z12) {
                    iVarArr[i15].d();
                }
            }
            i15++;
        }
        if (z12) {
            invalidateSelf();
        }
    }

    public final boolean D() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f30362t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f30363u;
        h hVar = this.f30345b;
        ColorStateList colorStateList = hVar.f30323f;
        PorterDuff.Mode mode = hVar.f30324g;
        if (colorStateList == null || mode == null) {
            int color = this.f30357o.getColor();
            int iD = d(color);
            this.f30364v = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.f30364v = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.f30362t = porterDuffColorFilter;
        this.f30345b.getClass();
        this.f30363u = null;
        this.f30345b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f30362t) && Objects.equals(porterDuffColorFilter3, this.f30363u)) ? false : true;
    }

    public final void E() {
        h hVar = this.f30345b;
        float f11 = hVar.f30330n + 0.0f;
        hVar.f30332p = (int) Math.ceil(0.75f * f11);
        this.f30345b.f30333q = (int) Math.ceil(f11 * 0.25f);
        D();
        super.invalidateSelf();
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        h hVar = this.f30345b;
        this.f30361s.a(hVar.f30318a, this.C, hVar.f30327j, rectF, this.f30360r, path);
        if (this.f30345b.f30326i != 1.0f) {
            Matrix matrix = this.f30351h;
            matrix.reset();
            float f11 = this.f30345b.f30326i;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f30365w, true);
    }

    public final int d(int i11) {
        h hVar = this.f30345b;
        float f11 = hVar.f30330n + 0.0f + hVar.f30329m;
        a20.a aVar = hVar.f30320c;
        return aVar != null ? aVar.a(f11, i11) : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f30362t;
        Paint paint2 = this.f30357o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i11 = this.f30345b.l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f30363u;
        Paint paint3 = this.f30358p;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f30345b.f30328k);
        int alpha2 = paint3.getAlpha();
        int i12 = this.f30345b.l;
        paint3.setAlpha(((i12 + (i12 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f30345b.f30334r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z11 = this.f30349f;
            paint = paint2;
            Path path = this.f30352i;
            if (z11) {
                b(i(), path);
                this.f30349f = false;
            }
            h hVar = this.f30345b;
            int i13 = hVar.f30331o;
            if (i13 != 1 && hVar.f30332p > 0 && (i13 == 2 || (!q() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate((int) (Math.sin(Math.toRadians(0)) * ((double) this.f30345b.f30333q)), k());
                if (this.f30366x) {
                    RectF rectF = this.f30365w;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        h2.b("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(l1.a(this.f30345b.f30332p, 2, (int) rectF.width(), iWidth), l1.a(this.f30345b.f30332p, 2, (int) rectF.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f11 = (getBounds().left - this.f30345b.f30332p) - iWidth;
                    float f12 = (getBounds().top - this.f30345b.f30332p) - iHeight;
                    canvas2.translate(-f11, -f12);
                    f(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    f(canvas);
                    canvas.restore();
                }
            }
            g(canvas, paint, path, this.f30345b.f30318a, this.C, i());
        } else {
            paint = paint2;
        }
        if (o()) {
            if (this.f30350g) {
                o oVar = this.f30345b.f30318a;
                n nVarH = oVar.h();
                d dVar = oVar.f30392e;
                jb.b bVar = this.f30344a;
                nVarH.f30380e = bVar.b(dVar);
                nVarH.f30381f = bVar.b(oVar.f30393f);
                nVarH.f30383h = bVar.b(oVar.f30395h);
                nVarH.f30382g = bVar.b(oVar.f30394g);
                this.f30368z = nVarH.a();
                float[] fArr = this.C;
                if (fArr != null) {
                    if (this.D == null) {
                        this.D = new float[fArr.length];
                    }
                    float fL = l();
                    int i14 = 0;
                    while (true) {
                        float[] fArr2 = this.C;
                        if (i14 >= fArr2.length) {
                            break;
                        }
                        this.D[i14] = Math.max(0.0f, fArr2[i14] - fL);
                        i14++;
                    }
                } else {
                    this.D = null;
                }
                o oVar2 = this.f30368z;
                float[] fArr3 = this.D;
                float f13 = this.f30345b.f30327j;
                RectF rectFI = i();
                RectF rectF2 = this.l;
                rectF2.set(rectFI);
                float fL2 = l();
                rectF2.inset(fL2, fL2);
                this.f30361s.a(oVar2, fArr3, f13, rectF2, null, this.f30353j);
                this.f30350g = false;
            }
            h(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void f(Canvas canvas) {
        if (this.f30348e.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i11 = this.f30345b.f30333q;
        Path path = this.f30352i;
        m20.a aVar = this.f30359q;
        if (i11 != 0) {
            canvas.drawPath(path, aVar.f29166a);
        }
        for (int i12 = 0; i12 < 4; i12++) {
            x xVar = this.f30346c[i12];
            int i13 = this.f30345b.f30332p;
            Matrix matrix = x.f30427b;
            xVar.a(matrix, aVar, i13, canvas);
            this.f30347d[i12].a(matrix, aVar, this.f30345b.f30332p, canvas);
        }
        if (this.f30366x) {
            int iSin = (int) (Math.sin(Math.toRadians(0)) * ((double) this.f30345b.f30333q));
            int iK = k();
            canvas.translate(-iSin, -iK);
            canvas.drawPath(path, F);
            canvas.translate(iSin, iK);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, o oVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, oVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f11 = fC * this.f30345b.f30327j;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30345b.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f30345b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f30345b.f30331o == 2) {
            return;
        }
        RectF rectFI = i();
        if (rectFI.isEmpty()) {
            return;
        }
        float fC = c(rectFI, this.f30345b.f30318a, this.C);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f30345b.f30327j);
            return;
        }
        boolean z11 = this.f30349f;
        Path path = this.f30352i;
        if (z11) {
            b(rectFI, path);
            this.f30349f = false;
        }
        b6.a.w(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f30345b.f30325h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f30355m;
        region.set(bounds);
        RectF rectFI = i();
        Path path = this.f30352i;
        b(rectFI, path);
        Region region2 = this.f30356n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public void h(Canvas canvas) {
        o oVar = this.f30368z;
        float[] fArr = this.D;
        RectF rectFI = i();
        RectF rectF = this.l;
        rectF.set(rectFI);
        float fL = l();
        rectF.inset(fL, fL);
        g(canvas, this.f30358p, this.f30353j, oVar, fArr, rectF);
    }

    public final RectF i() {
        Rect bounds = getBounds();
        RectF rectF = this.f30354k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f30349f = true;
        this.f30350g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f30345b.f30323f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f30345b.getClass();
        ColorStateList colorStateList2 = this.f30345b.f30322e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f30345b.f30321d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        h0 h0Var = this.f30345b.f30319b;
        return h0Var != null && h0Var.d();
    }

    public final float j() {
        float[] fArr = this.C;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFI = i();
        o oVar = this.f30345b.f30318a;
        q qVar = this.f30361s;
        qVar.getClass();
        float fA = oVar.f30392e.a(rectFI);
        o oVar2 = this.f30345b.f30318a;
        qVar.getClass();
        float fA2 = oVar2.f30395h.a(rectFI) + fA;
        o oVar3 = this.f30345b.f30318a;
        qVar.getClass();
        float fA3 = fA2 - oVar3.f30394g.a(rectFI);
        o oVar4 = this.f30345b.f30318a;
        qVar.getClass();
        return (fA3 - oVar4.f30393f.a(rectFI)) / 2.0f;
    }

    public final int k() {
        return (int) (Math.cos(Math.toRadians(0)) * ((double) this.f30345b.f30333q));
    }

    public final float l() {
        if (o()) {
            return this.f30358p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float m() {
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.f30345b.f30318a.f30392e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f30345b = new h(this.f30345b);
        return this;
    }

    public final float n() {
        float[] fArr = this.C;
        return fArr != null ? fArr[0] : this.f30345b.f30318a.f30393f.a(i());
    }

    public final boolean o() {
        Paint.Style style = this.f30345b.f30334r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f30358p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f30349f = true;
        this.f30350g = true;
        super.onBoundsChange(rect);
        if (this.f30345b.f30319b != null && !rect.isEmpty()) {
            C(getState(), this.f30367y);
        }
        this.f30367y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f30345b.f30319b != null) {
            C(iArr, false);
        }
        boolean z11 = B(iArr) || D();
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    public final void p(Context context) {
        this.f30345b.f30320c = new a20.a(context);
        E();
    }

    public final boolean q() {
        if (!this.f30345b.f30318a.g(i())) {
            float[] fArr = this.C;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f11 = fArr[0];
                    for (int i11 = 1; i11 < fArr.length; i11++) {
                        if (fArr[i11] != f11) {
                            break;
                        }
                    }
                }
                if (this.f30345b.f30318a.f()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void r(k8.j jVar) {
        if (this.A == jVar) {
            return;
        }
        this.A = jVar;
        int i11 = 0;
        while (true) {
            k8.i[] iVarArr = this.B;
            if (i11 >= iVarArr.length) {
                C(getState(), true);
                invalidateSelf();
                return;
            }
            if (iVarArr[i11] == null) {
                iVarArr[i11] = new k8.i(this, G[i11]);
            }
            k8.i iVar = iVarArr[i11];
            k8.j jVar2 = new k8.j();
            jVar2.a((float) jVar.f26168b);
            double d3 = jVar.f26167a;
            jVar2.b((float) (d3 * d3));
            iVar.f26164m = jVar2;
            i11++;
        }
    }

    public final void s(float f11) {
        h hVar = this.f30345b;
        if (hVar.f30330n != f11) {
            hVar.f30330n = f11;
            E();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        h hVar = this.f30345b;
        if (hVar.l != i11) {
            hVar.l = i11;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30345b.getClass();
        super.invalidateSelf();
    }

    @Override // n20.z
    public final void setShapeAppearanceModel(o oVar) {
        h hVar = this.f30345b;
        hVar.f30318a = oVar;
        hVar.f30319b = null;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f30345b.f30323f = colorStateList;
        D();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f30345b;
        if (hVar.f30324g != mode) {
            hVar.f30324g = mode;
            D();
            super.invalidateSelf();
        }
    }

    public final void t(ColorStateList colorStateList) {
        h hVar = this.f30345b;
        if (hVar.f30321d != colorStateList) {
            hVar.f30321d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void u(float f11) {
        h hVar = this.f30345b;
        if (hVar.f30327j != f11) {
            hVar.f30327j = f11;
            this.f30349f = true;
            this.f30350g = true;
            invalidateSelf();
        }
    }

    public final void v() {
        this.f30345b.f30334r = Paint.Style.FILL;
        super.invalidateSelf();
    }

    public final void w() {
        this.f30359q.a(-12303292);
        this.f30345b.getClass();
        super.invalidateSelf();
    }

    public final void x(int i11) {
        h hVar = this.f30345b;
        if (hVar.f30331o != i11) {
            hVar.f30331o = i11;
            super.invalidateSelf();
        }
    }

    public final void y(h0 h0Var) {
        h hVar = this.f30345b;
        if (hVar.f30319b != h0Var) {
            hVar.f30319b = h0Var;
            C(getState(), true);
            invalidateSelf();
        }
    }

    public final void z(ColorStateList colorStateList) {
        h hVar = this.f30345b;
        if (hVar.f30322e != colorStateList) {
            hVar.f30322e = colorStateList;
            onStateChange(getState());
        }
    }

    public j(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(o.c(context, attributeSet, i11, i12).a());
    }

    public j(o oVar) {
        this(new h(oVar));
    }

    public j() {
        this(new o());
    }
}
