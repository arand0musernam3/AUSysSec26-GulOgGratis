package c5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements xd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7256e;

    public i2(Context context, o oVar) {
        this.f7252a = 0;
        this.f7255d = oVar;
        this.f7253b = 0;
        this.f7256e = new GestureDetector(context, new h2(this));
    }

    @Override // xd.b
    public void a(fd.l lVar) {
        ((Function1) this.f7255d).invoke(null);
    }

    public void b(int i11) {
        switch (this.f7252a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f7256e;
                WeakReference weakReference = bottomSheetBehavior.Z;
                if (weakReference != null && weakReference.get() != null) {
                    this.f7253b = i11;
                    if (!this.f7254c) {
                        ((View) bottomSheetBehavior.Z.get()).postOnAnimation((com.google.android.material.bottomsheet.e) this.f7255d);
                        this.f7254c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7256e;
                WeakReference weakReference2 = sideSheetBehavior.f12594p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f7253b = i11;
                    if (!this.f7254c) {
                        ((View) sideSheetBehavior.f12594p.get()).postOnAnimation((m0.l) this.f7255d);
                        this.f7254c = true;
                    }
                    break;
                }
                break;
        }
    }

    @Override // xd.b
    public void i(fd.l lVar) {
        Bitmap bitmapJ;
        if (this.f7254c) {
            Bitmap bitmapJ2 = fd.o.j(lVar);
            int i11 = this.f7253b;
            Bitmap.Config config = bitmapJ2.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmapJ = bitmapJ2.copy(config, true);
            bitmapJ.getClass();
            Canvas canvas = new Canvas(bitmapJ);
            Paint paint = new Paint();
            paint.setColor(Color.argb(160, 255, 255, 255));
            paint.setStyle(Paint.Style.FILL);
            float width = bitmapJ.getWidth() / 2.0f;
            float height = bitmapJ.getHeight() / 2.0f;
            canvas.drawCircle(width, height, Math.min(width, height), paint);
            float fA = d70.b.a(1);
            Canvas canvas2 = new Canvas(bitmapJ);
            Paint paint2 = new Paint();
            paint2.setColor(i11);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(fA);
            float width2 = bitmapJ.getWidth() / 2.0f;
            float height2 = bitmapJ.getHeight() / 2.0f;
            canvas2.drawCircle(width2, height2, Math.min(width2, height2) - (fA / 2), paint2);
        } else {
            bitmapJ = fd.o.j(lVar);
        }
        ((Function1) this.f7256e).invoke(bitmapJ);
    }

    public i2(Function1 function1, boolean z11, int i11, Function1 function12) {
        this.f7252a = 4;
        this.f7255d = function1;
        this.f7254c = z11;
        this.f7253b = i11;
        this.f7256e = function12;
    }

    public i2(SideSheetBehavior sideSheetBehavior) {
        this.f7252a = 3;
        this.f7256e = sideSheetBehavior;
        this.f7255d = new m0.l(this, 3);
    }

    @Override // xd.b
    public void j(fd.l lVar) {
    }

    public i2(BottomSheetBehavior bottomSheetBehavior) {
        this.f7252a = 1;
        this.f7256e = bottomSheetBehavior;
        this.f7255d = new com.google.android.material.bottomsheet.e(this);
    }

    public i2(e.b bVar, boolean z11) {
        this.f7252a = 2;
        this.f7256e = bVar;
        this.f7254c = z11;
        this.f7255d = j30.d.f24499f;
        this.f7253b = Integer.MAX_VALUE;
    }
}
