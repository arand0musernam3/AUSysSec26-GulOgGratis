package eb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import cb.i;
import h7.h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static cb.c a(i iVar, FoldingFeature foldingFeature) {
        cb.b bVar;
        cb.b bVar2;
        iVar.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = cb.b.f7862j;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = cb.b.f7863k;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = cb.b.f7860h;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = cb.b.f7861i;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        ab.b bVar3 = new ab.b(bounds);
        Rect rectC = iVar.f7879a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != rectC.width() && bVar3.a() != rectC.height()) {
            return null;
        }
        if (bVar3.b() < rectC.width() && bVar3.a() < rectC.height()) {
            return null;
        }
        if (bVar3.b() == rectC.width() && bVar3.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new cb.c(new ab.b(bounds2), bVar, bVar2);
    }

    public static cb.h b(Context context, WindowLayoutInfo windowLayoutInfo) {
        gb.g gVar = gb.c.f20345g;
        gb.d dVar = gb.d.f20348c;
        gb.f fVar = gb.f.f20350c;
        windowLayoutInfo.getClass();
        int i11 = Build.VERSION.SDK_INT;
        gb.e eVar = i11 >= 34 ? gb.f.f20349b : gb.c.f20344f;
        d0.d(Integer.valueOf(h2.g()), Integer.valueOf(h2.f()), Integer.valueOf(h2.a()), Integer.valueOf(h2.c()), Integer.valueOf(h2.i()), Integer.valueOf(h2.e()), Integer.valueOf(h2.j()), Integer.valueOf(h2.b()));
        if (i11 >= 30) {
            if (i11 >= 34) {
                gVar = fVar;
            } else if (i11 >= 30) {
                gVar = dVar;
            }
            return c(gVar.b(context, eVar), windowLayoutInfo);
        }
        if (i11 < 29 || !(context instanceof Activity)) {
            com.braze.h2.a("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i11 >= 34) {
            gVar = fVar;
        } else if (i11 >= 30) {
            gVar = dVar;
        }
        return c(gVar.c(activity, eVar), windowLayoutInfo);
    }

    public static cb.h c(i iVar, WindowLayoutInfo windowLayoutInfo) {
        iVar.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            cb.c cVarA = foldingFeature instanceof FoldingFeature ? a(iVar, foldingFeature) : null;
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new cb.h(arrayList);
    }
}
