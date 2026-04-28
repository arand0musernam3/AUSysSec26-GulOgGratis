package sc;

import ad.g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import j4.s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Movie f38978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f38979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f38980c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Canvas f38985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f38986i;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f38989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f38991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f38992p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Picture f38994r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f38996t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f38981d = new Paint(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f38982e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f38983f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f38984g = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f38987j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f38988k = 1.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f38993q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public cd.b f38995s = cd.b.UNCHANGED;

    public b(Movie movie, Bitmap.Config config, g gVar) {
        this.f38978a = movie;
        this.f38979b = config;
        this.f38980c = gVar;
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        i4.a.f("Bitmap config must not be hardware.");
        throw null;
    }

    public final void a(Canvas canvas) {
        Paint paint = this.f38981d;
        Canvas canvas2 = this.f38985h;
        Bitmap bitmap = this.f38986i;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f11 = this.f38987j;
            canvas2.scale(f11, f11);
            this.f38978a.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f38994r;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.l, this.f38989m);
                float f12 = this.f38988k;
                canvas.scale(f12, f12);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th2) {
            canvas2.restoreToCount(iSave);
            throw th2;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f38983f;
        if (Intrinsics.areEqual(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.f38978a;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        g gVar = this.f38980c;
        double dL = w.l(iWidth2, iHeight2, iWidth, iHeight, gVar);
        if (!this.f38996t && dL > 1.0d) {
            dL = 1.0d;
        }
        float f11 = (float) dL;
        this.f38987j = f11;
        int i11 = (int) (iWidth2 * f11);
        int i12 = (int) (f11 * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, this.f38979b);
        Bitmap bitmap = this.f38986i;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f38986i = bitmapCreateBitmap;
        this.f38985h = new Canvas(bitmapCreateBitmap);
        if (this.f38996t) {
            this.f38988k = 1.0f;
            this.l = 0.0f;
            this.f38989m = 0.0f;
            return;
        }
        float fL = (float) w.l(i11, i12, iWidth, iHeight, gVar);
        this.f38988k = fL;
        float f12 = iWidth - (i11 * fL);
        float f13 = 2;
        this.l = (f12 / f13) + rect.left;
        this.f38989m = ((iHeight - (fL * i12)) / f13) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z11;
        Movie movie = this.f38978a;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z11 = false;
        } else {
            if (this.f38990n) {
                this.f38992p = SystemClock.uptimeMillis();
            }
            int i11 = (int) (this.f38992p - this.f38991o);
            int i12 = i11 / iDuration;
            int i13 = this.f38993q;
            z11 = i13 == -1 || i12 <= i13;
            if (z11) {
                iDuration = i11 - (i12 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.f38996t) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f38984g;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f11 = 1 / this.f38987j;
                canvas.scale(f11, f11);
                a(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.f38990n && z11) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38978a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38978a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f38981d.getAlpha() != 255) {
            return -3;
        }
        cd.b bVar = this.f38995s;
        if (bVar != cd.b.OPAQUE) {
            return (bVar == cd.b.UNCHANGED && this.f38978a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f38990n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (i11 < 0 || i11 >= 256) {
            i4.a.i(s.f(i11, "Invalid alpha: "));
        } else {
            this.f38981d.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38981d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f38990n) {
            return;
        }
        this.f38990n = true;
        this.f38991o = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f38982e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i11)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f38990n) {
            this.f38990n = false;
            ArrayList arrayList = this.f38982e;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i11)).onAnimationEnd(this);
            }
        }
    }
}
