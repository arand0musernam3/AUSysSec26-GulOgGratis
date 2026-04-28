package n2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m5.d0;
import m5.t0;
import p2.d;
import p2.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f30283a = new d0(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30284b = new a(0);

    public static final void a(o2.a aVar, final Context context, final boolean z11, final CharSequence charSequence, final long j9) {
        if (t0.d(j9) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) f30283a.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        aVar.a();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i11);
            aVar.f31809a.g(new d(new p2.a(i11), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: n2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    b.f30284b.invoke(context, resolveInfo, Boolean.valueOf(z11), charSequence, new t0(j9));
                    ((g) obj).close();
                    return Unit.f26487a;
                }
            }));
        }
        aVar.a();
    }
}
