package c9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import androidx.core.os.OperationCanceledException;
import com.google.android.gms.internal.measurement.z9;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import y00.a1;
import y00.h1;
import y00.l4;
import y00.u;
import y00.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7810b;

    public f(View view) {
        this.f7809a = 1;
        this.f7810b = new WeakReference(view);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7809a) {
            case 0:
                a aVar = (a) this.f7810b;
                AtomicBoolean atomicBoolean = aVar.f7805c;
                aVar.f7806d.set(true);
                Object objOnLoadInBackground = null;
                try {
                    Process.setThreadPriority(10);
                    try {
                        objOnLoadInBackground = aVar.f7808f.onLoadInBackground();
                        break;
                    } catch (OperationCanceledException e5) {
                        if (!atomicBoolean.get()) {
                            throw e5;
                        }
                    }
                    Binder.flushPendingCommands();
                    return objOnLoadInBackground;
                } catch (Throwable th2) {
                    try {
                        atomicBoolean.set(true);
                        throw th2;
                    } finally {
                        aVar.a(null);
                    }
                }
            case 1:
                View view = (View) ((WeakReference) this.f7810b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return "";
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                bitmapCreateBitmap.getClass();
                view.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                strEncodeToString.getClass();
                return strEncodeToString;
            case 2:
                ((Runnable) this.f7810b).run();
                return null;
            case 3:
                return new z9(((h1) this.f7810b).f44840m);
            default:
                v1 v1Var = (v1) this.f7810b;
                v1Var.f45249g.W();
                a1 a1Var = v1Var.f45249g.f44927h;
                l4.U(a1Var);
                a1Var.p();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public f(v1 v1Var, u uVar, String str) {
        this.f7809a = 4;
        this.f7810b = v1Var;
    }

    public /* synthetic */ f(Object obj, int i11) {
        this.f7809a = i11;
        this.f7810b = obj;
    }
}
