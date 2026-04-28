package ob;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f32426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f32427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f32428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f32429e;

    public j(Context context, sb.a aVar) {
        h hVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        a aVar2 = new a(applicationContext, aVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        a aVar3 = new a(applicationContext2, aVar, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = g.f32419a;
            hVar = new h(applicationContext3, aVar);
        } else {
            hVar = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        a aVar4 = new a(applicationContext4, aVar, 2);
        context.getClass();
        this.f32425a = context;
        this.f32426b = aVar2;
        this.f32427c = aVar3;
        this.f32428d = hVar;
        this.f32429e = aVar4;
    }
}
