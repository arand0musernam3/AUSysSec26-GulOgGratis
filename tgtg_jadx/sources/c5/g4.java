package c5;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.app.tgtg.R;
import com.google.android.gms.internal.measurement.cg;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f7242a = new LinkedHashMap();

    public static final y80.y1 a(Context context) {
        y80.y1 y1Var;
        LinkedHashMap linkedHashMap = f7242a;
        synchronized (linkedHashMap) {
            try {
                Object objX = linkedHashMap.get(context);
                if (objX == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    x80.i iVarA = cg.a(-1, null, null, 6);
                    at.o oVar = new at.o(new b0.c2(contentResolver, uriFor, new f4(iVarA, jf.e.p(Looper.getMainLooper())), iVarA, context, null));
                    v80.d2 d2VarD = v80.f0.d();
                    c90.f fVar = v80.p0.f42144a;
                    objX = y80.r.x(oVar, new a90.d(kotlin.coroutines.e.c(d2VarD, a90.p.f1044a)), new y80.x1(0L, LongCompanionObject.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objX);
                }
                y1Var = (y80.y1) objX;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y1Var;
    }

    public static final m3.x b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof m3.x) {
            return (m3.x) tag;
        }
        return null;
    }
}
