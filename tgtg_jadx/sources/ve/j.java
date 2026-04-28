package ve;

import a40.d0;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.constraintlayout.widget.z;
import com.braze.h2;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Matrix B = new Matrix();
    public a A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f42268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f42269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f42270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f42271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f42272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f42273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f42274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f42275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f42276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f42277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ie.a f42278k;
    public Bitmap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Canvas f42279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f42280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ie.a f42281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f42282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f42283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f42284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f42285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Canvas f42286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f42287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ie.a f42288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f42289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f42290x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f42291y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RenderNode f42292z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, a aVar) {
        if (this.f42272e == null) {
            this.f42272e = new RectF();
        }
        if (this.f42274g == null) {
            this.f42274g = new RectF();
        }
        this.f42272e.set(rectF);
        this.f42272e.offsetTo(rectF.left + aVar.f42242b, rectF.top + aVar.f42243c);
        RectF rectF2 = this.f42272e;
        float f11 = aVar.f42241a;
        rectF2.inset(-f11, -f11);
        this.f42274g.set(rectF);
        this.f42272e.union(this.f42274g);
        return this.f42272e;
    }

    public final void c() {
        float f11;
        ie.a aVar;
        if (this.f42268a == null || this.f42269b == null || this.f42283q == null || this.f42271d == null) {
            h2.b("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int i11 = h.f42267a[this.f42270c.ordinal()];
        if (i11 == 1 || i11 == 2) {
            this.f42268a.restore();
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    if (this.f42291y == null) {
                        h2.b("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 < 29) {
                        h2.b("RenderNode not supported but we chose it as render strategy");
                        return;
                    }
                    this.f42268a.save();
                    Canvas canvas = this.f42268a;
                    float[] fArr = this.f42283q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f42291y.endRecording();
                    if (this.f42269b.j()) {
                        Canvas canvas2 = this.f42268a;
                        a aVar2 = (a) this.f42269b.f2543c;
                        if (this.f42291y == null || this.f42292z == null) {
                            h2.b("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (i12 < 31) {
                            d0.k("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.f42283q;
                        float f12 = fArr2 != null ? fArr2[0] : 1.0f;
                        f11 = fArr2 != null ? fArr2[4] : 1.0f;
                        a aVar3 = this.A;
                        if (aVar3 == null || aVar2.f42241a != aVar3.f42241a || aVar2.f42242b != aVar3.f42242b || aVar2.f42243c != aVar3.f42243c || aVar2.f42244d != aVar3.f42244d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(aVar2.f42244d, PorterDuff.Mode.SRC_IN));
                            float f13 = aVar2.f42241a;
                            if (f13 > 0.0f) {
                                float f14 = ((f12 + f11) * f13) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f14, f14, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f42292z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = aVar2;
                        }
                        RectF rectFB = b(this.f42271d, aVar2);
                        RectF rectF = new RectF(rectFB.left * f12, rectFB.top * f11, rectFB.right * f12, rectFB.bottom * f11);
                        this.f42292z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f42292z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((aVar2.f42242b * f12) + (-rectF.left), (aVar2.f42243c * f11) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f42291y);
                        this.f42292z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f42292z);
                        canvas2.restore();
                    }
                    this.f42268a.drawRenderNode(this.f42291y);
                    this.f42268a.restore();
                }
            } else {
                if (this.l == null) {
                    h2.b("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.f42269b.j()) {
                    Canvas canvas3 = this.f42268a;
                    a aVar4 = (a) this.f42269b.f2543c;
                    RectF rectF2 = this.f42271d;
                    if (rectF2 == null || this.l == null) {
                        h2.b("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF rectFB2 = b(rectF2, aVar4);
                    if (this.f42273f == null) {
                        this.f42273f = new Rect();
                    }
                    this.f42273f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f42283q;
                    float f15 = fArr3 != null ? fArr3[0] : 1.0f;
                    f11 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f42275h == null) {
                        this.f42275h = new RectF();
                    }
                    this.f42275h.set(rectFB2.left * f15, rectFB2.top * f11, rectFB2.right * f15, rectFB2.bottom * f11);
                    if (this.f42276i == null) {
                        this.f42276i = new Rect();
                    }
                    this.f42276i.set(0, 0, Math.round(this.f42275h.width()), Math.round(this.f42275h.height()));
                    if (d(this.f42284r, this.f42275h)) {
                        Bitmap bitmap = this.f42284r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f42285s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f42284r = a(this.f42275h, Bitmap.Config.ARGB_8888);
                        this.f42285s = a(this.f42275h, Bitmap.Config.ALPHA_8);
                        this.f42286t = new Canvas(this.f42284r);
                        this.f42287u = new Canvas(this.f42285s);
                    } else {
                        Canvas canvas4 = this.f42286t;
                        if (canvas4 == null || this.f42287u == null || (aVar = this.f42281o) == null) {
                            h2.b("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.f42276i, aVar);
                            this.f42287u.drawRect(this.f42276i, this.f42281o);
                        }
                    }
                    if (this.f42285s == null) {
                        h2.b("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.f42288v == null) {
                        this.f42288v = new ie.a(1, 0);
                    }
                    RectF rectF3 = this.f42271d;
                    this.f42287u.drawBitmap(this.l, Math.round((rectF3.left - rectFB2.left) * f15), Math.round((rectF3.top - rectFB2.top) * f11), (Paint) null);
                    if (this.f42289w == null || this.f42290x != aVar4.f42241a) {
                        float f16 = ((f15 + f11) * aVar4.f42241a) / 2.0f;
                        if (f16 > 0.0f) {
                            this.f42289w = new BlurMaskFilter(f16, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f42289w = null;
                        }
                        this.f42290x = aVar4.f42241a;
                    }
                    this.f42288v.setColor(aVar4.f42244d);
                    float f17 = aVar4.f42241a;
                    ie.a aVar5 = this.f42288v;
                    if (f17 > 0.0f) {
                        aVar5.setMaskFilter(this.f42289w);
                    } else {
                        aVar5.setMaskFilter(null);
                    }
                    this.f42288v.setFilterBitmap(true);
                    this.f42286t.drawBitmap(this.f42285s, Math.round(aVar4.f42242b * f15), Math.round(aVar4.f42243c * f11), this.f42288v);
                    canvas3.drawBitmap(this.f42284r, this.f42276i, this.f42273f, this.f42278k);
                }
                if (this.f42280n == null) {
                    this.f42280n = new Rect();
                }
                this.f42280n.set(0, 0, (int) (this.f42271d.width() * this.f42283q[0]), (int) (this.f42271d.height() * this.f42283q[4]));
                this.f42268a.drawBitmap(this.l, this.f42280n, this.f42271d, this.f42278k);
            }
        }
        this.f42268a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, z zVar) {
        i iVar;
        if (this.f42268a != null) {
            h2.b("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.f42283q == null) {
            this.f42283q = new float[9];
        }
        if (this.f42282p == null) {
            this.f42282p = new Matrix();
        }
        canvas.getMatrix(this.f42282p);
        this.f42282p.getValues(this.f42283q);
        float[] fArr = this.f42283q;
        float f11 = fArr[0];
        float f12 = fArr[4];
        if (this.f42277j == null) {
            this.f42277j = new RectF();
        }
        this.f42277j.set(rectF.left * f11, rectF.top * f12, rectF.right * f11, rectF.bottom * f12);
        this.f42268a = canvas;
        this.f42269b = zVar;
        if (zVar.f2542b >= 255 && !zVar.j()) {
            iVar = i.DIRECT;
        } else if (zVar.j()) {
            int i11 = Build.VERSION.SDK_INT;
            iVar = (i11 < 29 || !canvas.isHardwareAccelerated() || i11 <= 31) ? i.BITMAP : i.RENDER_NODE;
        } else {
            iVar = i.SAVE_LAYER;
        }
        this.f42270c = iVar;
        if (this.f42271d == null) {
            this.f42271d = new RectF();
        }
        this.f42271d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f42278k == null) {
            this.f42278k = new ie.a();
        }
        this.f42278k.reset();
        int i12 = h.f42267a[this.f42270c.ordinal()];
        if (i12 == 1) {
            canvas.save();
            return canvas;
        }
        if (i12 == 2) {
            this.f42278k.setAlpha(zVar.f2542b);
            this.f42278k.setColorFilter(null);
            k.e(canvas, rectF, this.f42278k);
            return canvas;
        }
        Matrix matrix = B;
        if (i12 == 3) {
            if (this.f42281o == null) {
                ie.a aVar = new ie.a();
                this.f42281o = aVar;
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.l, this.f42277j)) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.l = a(this.f42277j, Bitmap.Config.ARGB_8888);
                this.f42279m = new Canvas(this.l);
            } else {
                Canvas canvas2 = this.f42279m;
                if (canvas2 == null) {
                    h2.b("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(matrix);
                this.f42279m.drawRect(-1.0f, -1.0f, this.f42277j.width() + 1.0f, this.f42277j.height() + 1.0f, this.f42281o);
            }
            u.M(this.f42278k, null);
            this.f42278k.setColorFilter(null);
            this.f42278k.setAlpha(zVar.f2542b);
            Canvas canvas3 = this.f42279m;
            canvas3.scale(f11, f12);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i12 != 4) {
            d0.k("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            h2.b("RenderNode not supported but we chose it as render strategy");
            return null;
        }
        if (this.f42291y == null) {
            this.f42291y = new RenderNode("OffscreenLayer.main");
        }
        if (zVar.j() && this.f42292z == null) {
            this.f42292z = new RenderNode("OffscreenLayer.shadow");
            this.A = null;
        }
        this.f42291y.setAlpha(zVar.f2542b / 255.0f);
        if (zVar.j()) {
            RenderNode renderNode = this.f42292z;
            if (renderNode == null) {
                h2.b("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode.setAlpha(zVar.f2542b / 255.0f);
        }
        this.f42291y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f42291y;
        RectF rectF2 = this.f42277j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f42291y.beginRecording((int) this.f42277j.width(), (int) this.f42277j.height());
        recordingCanvasBeginRecording.setMatrix(matrix);
        recordingCanvasBeginRecording.scale(f11, f12);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
