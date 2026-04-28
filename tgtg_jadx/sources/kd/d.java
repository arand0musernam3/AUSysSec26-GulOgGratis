package kd;

import ae.q;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.r;
import b0.a0;
import ia0.d0;
import id.t;
import java.nio.ByteBuffer;
import td.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f26283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26284c;

    public /* synthetic */ d(Object obj, o oVar, int i11) {
        this.f26282a = i11;
        this.f26284c = obj;
        this.f26283b = oVar;
    }

    @Override // kd.i
    public final Object a(ld.e eVar) {
        int i11 = this.f26282a;
        Object obj = this.f26284c;
        o oVar = this.f26283b;
        switch (i11) {
            case 0:
                ia0.g gVar = new ia0.g();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                gVar.write(bArr, 0, bArr.length);
                return new k(new t(gVar, oVar.f40035f, null), null, id.h.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new k(new t(new d0(new e(byteBuffer)), oVar.f40035f, new id.f(byteBuffer)), null, id.h.MEMORY);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = q.f1262a;
                boolean z11 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof r);
                if (z11) {
                    bitmapDrawable = new BitmapDrawable(oVar.f40030a.getResources(), a0.l(bitmapDrawable, td.k.a(oVar), oVar.f40031b, oVar.f40032c, (ud.h) fd.o.f(oVar, td.j.f40017b), oVar.f40033d == ud.d.INEXACT));
                }
                return new j(fd.o.c(bitmapDrawable), z11, id.h.MEMORY);
        }
    }
}
