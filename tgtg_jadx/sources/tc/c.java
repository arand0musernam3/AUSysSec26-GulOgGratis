package tc;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.r;
import java.nio.ByteBuffer;
import qc.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.n f39925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39926c;

    public /* synthetic */ c(Object obj, zc.n nVar, int i11) {
        this.f39924a = i11;
        this.f39926c = obj;
        this.f39925b = nVar;
    }

    @Override // tc.h
    public final Object a(x70.c cVar) {
        int i11 = this.f39924a;
        Object obj = this.f39926c;
        zc.n nVar = this.f39925b;
        switch (i11) {
            case 0:
                return new e(new BitmapDrawable(nVar.f47490a.getResources(), (Bitmap) obj), false, qc.f.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ia0.g gVar = new ia0.g();
                    gVar.write(byteBuffer);
                    byteBuffer.position(0);
                    return new n(new d0(gVar, new bo.a(nVar.f47490a, 16), null), null, qc.f.MEMORY);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = ed.k.f15927a;
                boolean z11 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof r);
                if (z11) {
                    bitmapDrawable = new BitmapDrawable(nVar.f47490a.getResources(), ba0.g.i(bitmapDrawable, nVar.f47491b, nVar.f47493d, nVar.f47494e, nVar.f47495f));
                }
                return new e(bitmapDrawable, z11, qc.f.MEMORY);
        }
    }
}
