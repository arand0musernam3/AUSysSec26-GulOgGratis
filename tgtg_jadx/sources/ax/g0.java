package ax;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.net.ConnectivityManager;
import android.os.Build;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4909a;

    public g0(ob.j jVar) {
        jVar.getClass();
        String str = mb.i.f29920a;
        ob.e eVar = jVar.f32426b;
        ob.h hVar = jVar.f32428d;
        ArrayList arrayListJ = kotlin.collections.d0.j(new nb.c(eVar, 0), new nb.c(jVar.f32427c), new nb.c(jVar.f32429e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = jVar.f32425a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            arrayListJ.add(new mb.e((ConnectivityManager) systemService));
        } else {
            hVar.getClass();
            arrayListJ.addAll(kotlin.collections.d0.h(new nb.c(hVar, 2), new nb.c(hVar, 3), new nb.f(hVar), new nb.e(hVar)));
        }
        this.f4909a = arrayListJ;
    }

    @Override // ax.d0
    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.f4909a.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, ArticleContentView.UTF_8_ENCODING_TYPE)}, 2)));
    }

    public void b(Object obj) {
        if (obj != null) {
            this.f4909a.add(obj);
        } else {
            c50.w.l("Set contributions cannot be null");
        }
    }

    public void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        zz.f.u(str);
        zz.f.v(str2, str);
        zz.f.k(this, str, str2);
    }

    public void d(String str) {
        int iF = StringsKt.F(str, ':', 1, false, 4);
        if (iF != -1) {
            zz.f.k(this, str.substring(0, iF), str.substring(iF + 1));
        } else if (str.charAt(0) == ':') {
            zz.f.k(this, "", str.substring(1));
        } else {
            zz.f.k(this, "", str);
        }
    }

    public void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        zz.f.u(str);
        zz.f.k(this, str, str2);
    }

    public void f(Path path) {
        ArrayList arrayList = this.f4909a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            je.v vVar = (je.v) arrayList.get(size);
            Matrix matrix = ve.k.f42293a;
            if (vVar != null && !vVar.f25124a) {
                ve.k.a(path, vVar.f25127d.m() / 100.0f, vVar.f25128e.m() / 100.0f, vVar.f25129f.m() / 360.0f);
            }
        }
    }

    public q90.t g() {
        return new q90.t((String[]) this.f4909a.toArray(new String[0]));
    }

    public String h(String str) {
        str.getClass();
        ArrayList arrayList = this.f4909a;
        int size = arrayList.size() - 2;
        int iA = b80.c.a(size, 0, -2);
        if (iA > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iA) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void i(String str) {
        str.getClass();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f4909a;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i11))) {
                arrayList.remove(i11);
                arrayList.remove(i11);
                i11 -= 2;
            }
            i11 += 2;
        }
    }

    public g0(int i11) {
        switch (i11) {
            case 3:
                this.f4909a = new ArrayList(20);
                break;
            case 4:
                this.f4909a = new ArrayList(9);
                break;
            default:
                this.f4909a = new ArrayList();
                break;
        }
    }

    public g0(ArrayList arrayList) {
        this.f4909a = arrayList;
    }
}
