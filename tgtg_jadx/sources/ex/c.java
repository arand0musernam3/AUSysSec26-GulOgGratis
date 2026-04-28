package ex;

import android.os.Bundle;
import android.view.View;
import ax.a0;
import com.google.firebase.messaging.r;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import o30.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f16510a = new c();

    public static Bundle b(fx.c cVar, View view, View view2) {
        Bundle bundle = new Bundle();
        if (cVar != null) {
            List<fx.d> listUnmodifiableList = Collections.unmodifiableList(cVar.f17976c);
            listUnmodifiableList.getClass();
            for (fx.d dVar : listUnmodifiableList) {
                String str = dVar.f17979b;
                ArrayList arrayList = dVar.f17980c;
                String str2 = dVar.f17978a;
                if (str != null && str.length() > 0) {
                    bundle.putString(str2, dVar.f17979b);
                } else if (arrayList.size() > 0) {
                    Iterator it = (Intrinsics.areEqual(dVar.f17981d, "relative") ? e0.u(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : e0.u(view, arrayList, 0, -1, view.getClass().getSimpleName())).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            e eVar = (e) it.next();
                            if (eVar.a() != null) {
                                String strJ = fx.h.j(eVar.a());
                                if (strJ.length() > 0) {
                                    bundle.putString(str2, strJ);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static final void c(fx.c cVar, View view, View view2) {
        if (yx.a.f46339a.contains(c.class)) {
            return;
        }
        try {
            cVar.getClass();
            String str = cVar.f17974a;
            Bundle bundleB = b(cVar, view, view2);
            f16510a.d(bundleB);
            a0.c().execute(new r(13, str, bundleB));
        } catch (Throwable th2) {
            yx.a.a(c.class, th2);
        }
    }

    public synchronized g a() {
        g gVar;
        g gVar2;
        try {
            gVar = null;
            if (yx.a.f46339a.contains(g.class)) {
                gVar2 = null;
            } else {
                try {
                    gVar2 = g.f16526g;
                } catch (Throwable th2) {
                    yx.a.a(g.class, th2);
                    gVar2 = null;
                }
            }
            if (gVar2 == null) {
                g gVar3 = new g();
                if (!yx.a.f46339a.contains(g.class)) {
                    try {
                        g.f16526g = gVar3;
                    } catch (Throwable th3) {
                        yx.a.a(g.class, th3);
                    }
                }
            }
            if (!yx.a.f46339a.contains(g.class)) {
                try {
                    gVar = g.f16526g;
                } catch (Throwable th4) {
                    yx.a.a(g.class, th4);
                }
            }
            gVar.getClass();
        } catch (Throwable th5) {
            throw th5;
        }
        return gVar;
    }

    public void d(Bundle bundle) {
        Locale locale;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double dDoubleValue = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        try {
                            locale = a0.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
