package tc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39920a;

    public /* synthetic */ a(int i11) {
        this.f39920a = i11;
    }

    @Override // tc.g
    public final h a(Object obj, zc.n nVar) {
        switch (this.f39920a) {
            case 0:
                Uri uri = (Uri) obj;
                if (ed.k.d(uri)) {
                    return new b(uri, nVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, nVar, 0);
            case 2:
                return new c((ByteBuffer) obj, nVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (Intrinsics.areEqual(uri2.getScheme(), "content")) {
                    return new d(uri2, nVar);
                }
                return null;
            case 4:
                return new c((Drawable) obj, nVar, 2);
            case 5:
                return new i((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (Intrinsics.areEqual(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, nVar, 1);
                }
                return null;
        }
    }
}
