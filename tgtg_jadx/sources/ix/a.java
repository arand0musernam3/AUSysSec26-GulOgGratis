package ix;

import bx.g;
import java.util.List;
import java.util.Set;
import kotlin.collections.c0;
import px.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f24231c;

    public /* synthetic */ a(String str, g gVar, int i11) {
        this.f24229a = i11;
        this.f24230b = str;
        this.f24231c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = f.f35636a;
        int i11 = this.f24229a;
        g gVar = this.f24231c;
        String str = this.f24230b;
        switch (i11) {
            case 0:
                if (!yx.a.f46339a.contains(c.class)) {
                    try {
                        c.f24233a.c(str, gVar);
                    } catch (Throwable th2) {
                        yx.a.a(c.class, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                Set set = yx.a.f46339a;
                if (!set.contains(px.a.class)) {
                    try {
                        List listC = c0.c(gVar);
                        if (!set.contains(f.class)) {
                            try {
                                listC.getClass();
                                fVar.b(px.c.CUSTOM_APP_EVENTS, str, listC);
                            } catch (Throwable th3) {
                                yx.a.a(f.class, th3);
                            }
                        }
                    } catch (Throwable th4) {
                        yx.a.a(px.a.class, th4);
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
